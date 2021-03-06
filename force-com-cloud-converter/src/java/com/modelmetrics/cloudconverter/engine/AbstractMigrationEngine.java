/*
The MIT License

Copyright (c) 2008, 2009 Model Metrics, Inc.

http://ModelMetrics.com
http://ModelMetrics.com/authors/rcarlberg

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
 */

package com.modelmetrics.cloudconverter.engine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.modelmetrics.cloudconverter.forceutil.CreateExecutor;
import com.modelmetrics.cloudconverter.forceutil.CustomFieldBuilder;
import com.modelmetrics.cloudconverter.forceutil.CustomTabBuilder;
import com.modelmetrics.cloudconverter.forceutil.LayoutBuilder;
import com.modelmetrics.cloudconverter.forceutil.MetadataReadinessChecker;
import com.modelmetrics.cloudconverter.forceutil.ProfileTabVisibilityBuilder;
import com.modelmetrics.cloudconverter.forceutil.UpdateExecutor;
import com.modelmetrics.cloudconverter.util.OperationStatusPublisher;
import com.modelmetrics.cloudconverter.util.OperationStatusPublisherSupport;
import com.sforce.soap._2006._04.metadata.CustomField;
import com.sforce.soap._2006._04.metadata.CustomObject;
import com.sforce.soap._2006._04.metadata.CustomTab;
import com.sforce.soap._2006._04.metadata.Layout;
import com.sforce.soap._2006._04.metadata.Profile;
import com.sforce.soap.partner.GetUserInfoResult;

public abstract class AbstractMigrationEngine extends
		OperationStatusPublisherSupport implements MigrationEngineIF,
		OperationStatusPublisher {

	protected static final Log log = LogFactory
			.getLog(AbstractMigrationEngine.class);

	private MigrationContext migrationContext;

	public void executeCommon(CustomObject co) throws Exception {

		// 2009-08-27 RSC
		GetUserInfoResult userInfo = this.getMigrationContext().getSalesforceSession().getSalesforceService().getUserInfo();

		log.info("***USER**** " + userInfo.getOrganizationName() + ", " + userInfo.getUserFullName() + ", " + userInfo.getUserEmail());
		
		this.getMigrationContext().setCustomObject(co);

		// 2009-06-15 Do we need this?
		if (this.getMigrationContext().getCloudConverterObject()
				.getExistingObject() == null) {
			this.publishStatus("creating new object");
			new CreateExecutor(this.getMigrationContext()
					.getSalesforceSession().getMetadataService(),
					new CustomObject[] { co }).execute();
		}

		/*
		 * create custom fields 2009-03-21 RSC This has the migration context so
		 * it is now aware of the metadata proxy collection
		 */
		/*
		 * 2009-06-15 Filters out existing fields
		 */
		CustomField[] fields = new CustomFieldBuilder().build(this
				.getMigrationContext());

		this.publishStatus("creating new fields");

		if (fields.length > 0) {
			new CreateExecutor(this.getMigrationContext()
					.getSalesforceSession().getMetadataService(), fields)
					.execute();
			// reseting the session
			this.pauseSession();
		}

		// moving to the lookups
		if (this.getMigrationContext().getCustomLookupFields() != null
				&& this.getMigrationContext().getCustomLookupFields().length > 0) {

			this.publishStatus("creating new lookup fields");

			new CreateExecutor(this.getMigrationContext()
					.getSalesforceSession().getMetadataService(), this
					.getMigrationContext().getCustomLookupFields()).execute();
		}

		/*
		 * Custom Tab // does not execute if using existing
		 */

		if (this.getMigrationContext().getCloudConverterObject()
				.getExistingObject() == null) {
			this.pauseSession();
			this.publishStatus("creating custom tab");

			CustomTab customTab = new CustomTabBuilder().build(co);
			log.debug("CustomTab - local definition complete - "
					+ customTab.getFullName());

			new CreateExecutor(this.getMigrationContext()
					.getSalesforceSession().getMetadataService(),
					new CustomTab[] { customTab }).execute();
			
			//TODO DB Figure out why this isn't working.
			/*
			 * update profile permissions - Testing.
			 */
//			 Profile profile = new ProfileTabVisibilityBuilder().build("Platform System Admin",
//			 customTab.getFullName());
//			 new UpdateExecutor(this.getMigrationContext().getSalesforceSession()
//			 .getMetadataService()).executeSimpleUpdate(profile);
//					
//			 this.pauseSession();
		}

		/*
		 * check to see if we're ready to proceed.
		 * 2009-11-01 RSC this was 10, changed to 5 since if it's not working for 5 it has never self corrected before 10.
		 */

		MetadataReadinessChecker checker = new MetadataReadinessChecker();

		boolean ready = false;

		for (int i = 0; i < 5; i++) {
			ready = checker.isMetadataReady(this.getMigrationContext());
			String status = "Ready!";
			if (!ready) {
				status = "Not quite yet.";
			}
			this.publishStatus("Checking to see if metadata is ready yet. (" + status + ")");
			log.debug("is metadata ready? " + ready);
			if (ready)
				break;
			for (int j = 0; j < i+1; j++) {
				this.pauseSession();	
			}
			
		}
		
		if (!ready) {
			this.publishStatus("Failed to confirm metadata readiness.");
			throw new RuntimeException("Failed to confirm metadata readiness.  This usually resolves itself quickly.  Please try again in a few moments.");
		}

		/*
		 * update the layout // does not execute if existing object
		 */

		if (this.getMigrationContext().getCloudConverterObject()
				.getExistingObject() == null) {
			this.pauseSession();
			this.publishStatus("updating default layout");

			LayoutBuilder layoutBuilder = new LayoutBuilder();
			layoutBuilder.setMigrationContext(this.getMigrationContext());
			Layout layout = layoutBuilder.build();

			this.pauseSession();
			this.pauseSession();
			new UpdateExecutor(this.getMigrationContext()
					.getSalesforceSession().getMetadataService())
					.executeSimpleUpdate(layout);

			this.pauseSession();
		}


	}

	/**
	 * sleeps for 10 seconds -- useful when executing a lot of tasks dependent
	 * upon other preceding tasks. (2009-03-28 RSC)
	 * 
	 * @throws Exception
	 */
	public void pauseSession() throws Exception {

		// log.info("in reset session...");
		//		
		// SalesforceSession newSession =
		// SalesforceSessionFactory.factory.build(this.getSalesforceCredentials());
		//		
		// this.setSalesforceSession(newSession);
		//		
		// log.info("reset session complete...");

		this.publishStatus("resting");
		log.debug("waiting for 10 seconds (instead of resetting session)...");
		Thread.sleep(10000);

	}

	public MigrationContext getMigrationContext() {
		return migrationContext;
	}

	public void setMigrationContext(MigrationContext migrationContext) {
		this.migrationContext = migrationContext;
	}

}

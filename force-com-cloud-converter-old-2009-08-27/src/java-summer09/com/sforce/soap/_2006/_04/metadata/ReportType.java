/**
 * ReportType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class ReportType  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private java.lang.String baseObject;

    private com.sforce.soap._2006._04.metadata.ReportTypeCategory category;

    private boolean deployed;

    private java.lang.String description;

    private com.sforce.soap._2006._04.metadata.ObjectRelationship join;

    private java.lang.String label;

    private com.sforce.soap._2006._04.metadata.ReportLayoutSection[] sections;

    public ReportType() {
    }

    public ReportType(
           java.lang.String fullName,
           java.lang.String baseObject,
           com.sforce.soap._2006._04.metadata.ReportTypeCategory category,
           boolean deployed,
           java.lang.String description,
           com.sforce.soap._2006._04.metadata.ObjectRelationship join,
           java.lang.String label,
           com.sforce.soap._2006._04.metadata.ReportLayoutSection[] sections) {
        super(
            fullName);
        this.baseObject = baseObject;
        this.category = category;
        this.deployed = deployed;
        this.description = description;
        this.join = join;
        this.label = label;
        this.sections = sections;
    }


    /**
     * Gets the baseObject value for this ReportType.
     * 
     * @return baseObject
     */
    public java.lang.String getBaseObject() {
        return baseObject;
    }


    /**
     * Sets the baseObject value for this ReportType.
     * 
     * @param baseObject
     */
    public void setBaseObject(java.lang.String baseObject) {
        this.baseObject = baseObject;
    }


    /**
     * Gets the category value for this ReportType.
     * 
     * @return category
     */
    public com.sforce.soap._2006._04.metadata.ReportTypeCategory getCategory() {
        return category;
    }


    /**
     * Sets the category value for this ReportType.
     * 
     * @param category
     */
    public void setCategory(com.sforce.soap._2006._04.metadata.ReportTypeCategory category) {
        this.category = category;
    }


    /**
     * Gets the deployed value for this ReportType.
     * 
     * @return deployed
     */
    public boolean isDeployed() {
        return deployed;
    }


    /**
     * Sets the deployed value for this ReportType.
     * 
     * @param deployed
     */
    public void setDeployed(boolean deployed) {
        this.deployed = deployed;
    }


    /**
     * Gets the description value for this ReportType.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ReportType.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the join value for this ReportType.
     * 
     * @return join
     */
    public com.sforce.soap._2006._04.metadata.ObjectRelationship getJoin() {
        return join;
    }


    /**
     * Sets the join value for this ReportType.
     * 
     * @param join
     */
    public void setJoin(com.sforce.soap._2006._04.metadata.ObjectRelationship join) {
        this.join = join;
    }


    /**
     * Gets the label value for this ReportType.
     * 
     * @return label
     */
    public java.lang.String getLabel() {
        return label;
    }


    /**
     * Sets the label value for this ReportType.
     * 
     * @param label
     */
    public void setLabel(java.lang.String label) {
        this.label = label;
    }


    /**
     * Gets the sections value for this ReportType.
     * 
     * @return sections
     */
    public com.sforce.soap._2006._04.metadata.ReportLayoutSection[] getSections() {
        return sections;
    }


    /**
     * Sets the sections value for this ReportType.
     * 
     * @param sections
     */
    public void setSections(com.sforce.soap._2006._04.metadata.ReportLayoutSection[] sections) {
        this.sections = sections;
    }

    public com.sforce.soap._2006._04.metadata.ReportLayoutSection getSections(int i) {
        return this.sections[i];
    }

    public void setSections(int i, com.sforce.soap._2006._04.metadata.ReportLayoutSection _value) {
        this.sections[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReportType)) return false;
        ReportType other = (ReportType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.baseObject==null && other.getBaseObject()==null) || 
             (this.baseObject!=null &&
              this.baseObject.equals(other.getBaseObject()))) &&
            ((this.category==null && other.getCategory()==null) || 
             (this.category!=null &&
              this.category.equals(other.getCategory()))) &&
            this.deployed == other.isDeployed() &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.join==null && other.getJoin()==null) || 
             (this.join!=null &&
              this.join.equals(other.getJoin()))) &&
            ((this.label==null && other.getLabel()==null) || 
             (this.label!=null &&
              this.label.equals(other.getLabel()))) &&
            ((this.sections==null && other.getSections()==null) || 
             (this.sections!=null &&
              java.util.Arrays.equals(this.sections, other.getSections())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getBaseObject() != null) {
            _hashCode += getBaseObject().hashCode();
        }
        if (getCategory() != null) {
            _hashCode += getCategory().hashCode();
        }
        _hashCode += (isDeployed() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getJoin() != null) {
            _hashCode += getJoin().hashCode();
        }
        if (getLabel() != null) {
            _hashCode += getLabel().hashCode();
        }
        if (getSections() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSections());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSections(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReportType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ReportType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseObject");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "baseObject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "category"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ReportTypeCategory"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deployed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "deployed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("join");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "join"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ObjectRelationship"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("label");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "label"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sections");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "sections"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ReportLayoutSection"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}

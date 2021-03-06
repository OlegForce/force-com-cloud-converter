/**
 * CustomFieldTranslation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class CustomFieldTranslation  implements java.io.Serializable {
    private java.lang.String help;

    private java.lang.String label;

    private java.lang.String name;

    private com.sforce.soap._2006._04.metadata.PicklistValueTranslation[] picklistValues;

    private java.lang.String relationshipLabel;

    public CustomFieldTranslation() {
    }

    public CustomFieldTranslation(
           java.lang.String help,
           java.lang.String label,
           java.lang.String name,
           com.sforce.soap._2006._04.metadata.PicklistValueTranslation[] picklistValues,
           java.lang.String relationshipLabel) {
           this.help = help;
           this.label = label;
           this.name = name;
           this.picklistValues = picklistValues;
           this.relationshipLabel = relationshipLabel;
    }


    /**
     * Gets the help value for this CustomFieldTranslation.
     * 
     * @return help
     */
    public java.lang.String getHelp() {
        return help;
    }


    /**
     * Sets the help value for this CustomFieldTranslation.
     * 
     * @param help
     */
    public void setHelp(java.lang.String help) {
        this.help = help;
    }


    /**
     * Gets the label value for this CustomFieldTranslation.
     * 
     * @return label
     */
    public java.lang.String getLabel() {
        return label;
    }


    /**
     * Sets the label value for this CustomFieldTranslation.
     * 
     * @param label
     */
    public void setLabel(java.lang.String label) {
        this.label = label;
    }


    /**
     * Gets the name value for this CustomFieldTranslation.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this CustomFieldTranslation.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the picklistValues value for this CustomFieldTranslation.
     * 
     * @return picklistValues
     */
    public com.sforce.soap._2006._04.metadata.PicklistValueTranslation[] getPicklistValues() {
        return picklistValues;
    }


    /**
     * Sets the picklistValues value for this CustomFieldTranslation.
     * 
     * @param picklistValues
     */
    public void setPicklistValues(com.sforce.soap._2006._04.metadata.PicklistValueTranslation[] picklistValues) {
        this.picklistValues = picklistValues;
    }

    public com.sforce.soap._2006._04.metadata.PicklistValueTranslation getPicklistValues(int i) {
        return this.picklistValues[i];
    }

    public void setPicklistValues(int i, com.sforce.soap._2006._04.metadata.PicklistValueTranslation _value) {
        this.picklistValues[i] = _value;
    }


    /**
     * Gets the relationshipLabel value for this CustomFieldTranslation.
     * 
     * @return relationshipLabel
     */
    public java.lang.String getRelationshipLabel() {
        return relationshipLabel;
    }


    /**
     * Sets the relationshipLabel value for this CustomFieldTranslation.
     * 
     * @param relationshipLabel
     */
    public void setRelationshipLabel(java.lang.String relationshipLabel) {
        this.relationshipLabel = relationshipLabel;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomFieldTranslation)) return false;
        CustomFieldTranslation other = (CustomFieldTranslation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.help==null && other.getHelp()==null) || 
             (this.help!=null &&
              this.help.equals(other.getHelp()))) &&
            ((this.label==null && other.getLabel()==null) || 
             (this.label!=null &&
              this.label.equals(other.getLabel()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.picklistValues==null && other.getPicklistValues()==null) || 
             (this.picklistValues!=null &&
              java.util.Arrays.equals(this.picklistValues, other.getPicklistValues()))) &&
            ((this.relationshipLabel==null && other.getRelationshipLabel()==null) || 
             (this.relationshipLabel!=null &&
              this.relationshipLabel.equals(other.getRelationshipLabel())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getHelp() != null) {
            _hashCode += getHelp().hashCode();
        }
        if (getLabel() != null) {
            _hashCode += getLabel().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getPicklistValues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPicklistValues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPicklistValues(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRelationshipLabel() != null) {
            _hashCode += getRelationshipLabel().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomFieldTranslation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CustomFieldTranslation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("help");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "help"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("label");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "label"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("picklistValues");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "picklistValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "PicklistValueTranslation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relationshipLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "relationshipLabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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

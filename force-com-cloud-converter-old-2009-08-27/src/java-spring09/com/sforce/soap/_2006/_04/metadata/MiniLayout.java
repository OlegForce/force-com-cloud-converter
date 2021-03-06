/**
 * MiniLayout.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class MiniLayout  implements java.io.Serializable {
    private java.lang.String[] fields;

    private com.sforce.soap._2006._04.metadata.RelatedListItem[] relatedLists;

    public MiniLayout() {
    }

    public MiniLayout(
           java.lang.String[] fields,
           com.sforce.soap._2006._04.metadata.RelatedListItem[] relatedLists) {
           this.fields = fields;
           this.relatedLists = relatedLists;
    }


    /**
     * Gets the fields value for this MiniLayout.
     * 
     * @return fields
     */
    public java.lang.String[] getFields() {
        return fields;
    }


    /**
     * Sets the fields value for this MiniLayout.
     * 
     * @param fields
     */
    public void setFields(java.lang.String[] fields) {
        this.fields = fields;
    }

    public java.lang.String getFields(int i) {
        return this.fields[i];
    }

    public void setFields(int i, java.lang.String _value) {
        this.fields[i] = _value;
    }


    /**
     * Gets the relatedLists value for this MiniLayout.
     * 
     * @return relatedLists
     */
    public com.sforce.soap._2006._04.metadata.RelatedListItem[] getRelatedLists() {
        return relatedLists;
    }


    /**
     * Sets the relatedLists value for this MiniLayout.
     * 
     * @param relatedLists
     */
    public void setRelatedLists(com.sforce.soap._2006._04.metadata.RelatedListItem[] relatedLists) {
        this.relatedLists = relatedLists;
    }

    public com.sforce.soap._2006._04.metadata.RelatedListItem getRelatedLists(int i) {
        return this.relatedLists[i];
    }

    public void setRelatedLists(int i, com.sforce.soap._2006._04.metadata.RelatedListItem _value) {
        this.relatedLists[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MiniLayout)) return false;
        MiniLayout other = (MiniLayout) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fields==null && other.getFields()==null) || 
             (this.fields!=null &&
              java.util.Arrays.equals(this.fields, other.getFields()))) &&
            ((this.relatedLists==null && other.getRelatedLists()==null) || 
             (this.relatedLists!=null &&
              java.util.Arrays.equals(this.relatedLists, other.getRelatedLists())));
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
        if (getFields() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFields());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFields(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRelatedLists() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRelatedLists());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRelatedLists(), i);
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
        new org.apache.axis.description.TypeDesc(MiniLayout.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "MiniLayout"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fields");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "fields"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relatedLists");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "relatedLists"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "RelatedListItem"));
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

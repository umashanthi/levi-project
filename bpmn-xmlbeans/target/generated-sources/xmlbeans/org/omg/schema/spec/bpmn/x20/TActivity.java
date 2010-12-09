/*
 * XML Type:  tActivity
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.TActivity
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20;


/**
 * An XML tActivity(@http://schema.omg.org/spec/BPMN/2.0).
 *
 * This is a complex type.
 */
public interface TActivity extends org.omg.schema.spec.bpmn.x20.TFlowNode
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TActivity.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBC864EDE3F984128F62D75C6516B63E9").resolveHandle("tactivity41f7type");
    
    /**
     * Gets the "ioSpecification" element
     */
    org.omg.schema.spec.bpmn.x20.TInputOutputSpecification getIoSpecification();
    
    /**
     * True if has "ioSpecification" element
     */
    boolean isSetIoSpecification();
    
    /**
     * Sets the "ioSpecification" element
     */
    void setIoSpecification(org.omg.schema.spec.bpmn.x20.TInputOutputSpecification ioSpecification);
    
    /**
     * Appends and returns a new empty "ioSpecification" element
     */
    org.omg.schema.spec.bpmn.x20.TInputOutputSpecification addNewIoSpecification();
    
    /**
     * Unsets the "ioSpecification" element
     */
    void unsetIoSpecification();
    
    /**
     * Gets array of all "property" elements
     */
    org.omg.schema.spec.bpmn.x20.TProperty[] getPropertyArray();
    
    /**
     * Gets ith "property" element
     */
    org.omg.schema.spec.bpmn.x20.TProperty getPropertyArray(int i);
    
    /**
     * Returns number of "property" element
     */
    int sizeOfPropertyArray();
    
    /**
     * Sets array of all "property" element
     */
    void setPropertyArray(org.omg.schema.spec.bpmn.x20.TProperty[] propertyArray);
    
    /**
     * Sets ith "property" element
     */
    void setPropertyArray(int i, org.omg.schema.spec.bpmn.x20.TProperty property);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "property" element
     */
    org.omg.schema.spec.bpmn.x20.TProperty insertNewProperty(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "property" element
     */
    org.omg.schema.spec.bpmn.x20.TProperty addNewProperty();
    
    /**
     * Removes the ith "property" element
     */
    void removeProperty(int i);
    
    /**
     * Gets array of all "dataInputAssociation" elements
     */
    org.omg.schema.spec.bpmn.x20.TDataInputAssociation[] getDataInputAssociationArray();
    
    /**
     * Gets ith "dataInputAssociation" element
     */
    org.omg.schema.spec.bpmn.x20.TDataInputAssociation getDataInputAssociationArray(int i);
    
    /**
     * Returns number of "dataInputAssociation" element
     */
    int sizeOfDataInputAssociationArray();
    
    /**
     * Sets array of all "dataInputAssociation" element
     */
    void setDataInputAssociationArray(org.omg.schema.spec.bpmn.x20.TDataInputAssociation[] dataInputAssociationArray);
    
    /**
     * Sets ith "dataInputAssociation" element
     */
    void setDataInputAssociationArray(int i, org.omg.schema.spec.bpmn.x20.TDataInputAssociation dataInputAssociation);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "dataInputAssociation" element
     */
    org.omg.schema.spec.bpmn.x20.TDataInputAssociation insertNewDataInputAssociation(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "dataInputAssociation" element
     */
    org.omg.schema.spec.bpmn.x20.TDataInputAssociation addNewDataInputAssociation();
    
    /**
     * Removes the ith "dataInputAssociation" element
     */
    void removeDataInputAssociation(int i);
    
    /**
     * Gets array of all "dataOutputAssociation" elements
     */
    org.omg.schema.spec.bpmn.x20.TDataOutputAssociation[] getDataOutputAssociationArray();
    
    /**
     * Gets ith "dataOutputAssociation" element
     */
    org.omg.schema.spec.bpmn.x20.TDataOutputAssociation getDataOutputAssociationArray(int i);
    
    /**
     * Returns number of "dataOutputAssociation" element
     */
    int sizeOfDataOutputAssociationArray();
    
    /**
     * Sets array of all "dataOutputAssociation" element
     */
    void setDataOutputAssociationArray(org.omg.schema.spec.bpmn.x20.TDataOutputAssociation[] dataOutputAssociationArray);
    
    /**
     * Sets ith "dataOutputAssociation" element
     */
    void setDataOutputAssociationArray(int i, org.omg.schema.spec.bpmn.x20.TDataOutputAssociation dataOutputAssociation);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "dataOutputAssociation" element
     */
    org.omg.schema.spec.bpmn.x20.TDataOutputAssociation insertNewDataOutputAssociation(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "dataOutputAssociation" element
     */
    org.omg.schema.spec.bpmn.x20.TDataOutputAssociation addNewDataOutputAssociation();
    
    /**
     * Removes the ith "dataOutputAssociation" element
     */
    void removeDataOutputAssociation(int i);
    
    /**
     * Gets array of all "activityResource" elements
     */
    org.omg.schema.spec.bpmn.x20.TActivityResource[] getActivityResourceArray();
    
    /**
     * Gets ith "activityResource" element
     */
    org.omg.schema.spec.bpmn.x20.TActivityResource getActivityResourceArray(int i);
    
    /**
     * Returns number of "activityResource" element
     */
    int sizeOfActivityResourceArray();
    
    /**
     * Sets array of all "activityResource" element
     */
    void setActivityResourceArray(org.omg.schema.spec.bpmn.x20.TActivityResource[] activityResourceArray);
    
    /**
     * Sets ith "activityResource" element
     */
    void setActivityResourceArray(int i, org.omg.schema.spec.bpmn.x20.TActivityResource activityResource);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "activityResource" element
     */
    org.omg.schema.spec.bpmn.x20.TActivityResource insertNewActivityResource(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "activityResource" element
     */
    org.omg.schema.spec.bpmn.x20.TActivityResource addNewActivityResource();
    
    /**
     * Removes the ith "activityResource" element
     */
    void removeActivityResource(int i);
    
    /**
     * Gets the "loopCharacteristics" element
     */
    org.omg.schema.spec.bpmn.x20.TLoopCharacteristics getLoopCharacteristics();
    
    /**
     * True if has "loopCharacteristics" element
     */
    boolean isSetLoopCharacteristics();
    
    /**
     * Sets the "loopCharacteristics" element
     */
    void setLoopCharacteristics(org.omg.schema.spec.bpmn.x20.TLoopCharacteristics loopCharacteristics);
    
    /**
     * Appends and returns a new empty "loopCharacteristics" element
     */
    org.omg.schema.spec.bpmn.x20.TLoopCharacteristics addNewLoopCharacteristics();
    
    /**
     * Unsets the "loopCharacteristics" element
     */
    void unsetLoopCharacteristics();
    
    /**
     * Gets the "isForCompensation" attribute
     */
    boolean getIsForCompensation();
    
    /**
     * Gets (as xml) the "isForCompensation" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetIsForCompensation();
    
    /**
     * True if has "isForCompensation" attribute
     */
    boolean isSetIsForCompensation();
    
    /**
     * Sets the "isForCompensation" attribute
     */
    void setIsForCompensation(boolean isForCompensation);
    
    /**
     * Sets (as xml) the "isForCompensation" attribute
     */
    void xsetIsForCompensation(org.apache.xmlbeans.XmlBoolean isForCompensation);
    
    /**
     * Unsets the "isForCompensation" attribute
     */
    void unsetIsForCompensation();
    
    /**
     * Gets the "startQuantity" attribute
     */
    java.math.BigInteger getStartQuantity();
    
    /**
     * Gets (as xml) the "startQuantity" attribute
     */
    org.apache.xmlbeans.XmlInteger xgetStartQuantity();
    
    /**
     * True if has "startQuantity" attribute
     */
    boolean isSetStartQuantity();
    
    /**
     * Sets the "startQuantity" attribute
     */
    void setStartQuantity(java.math.BigInteger startQuantity);
    
    /**
     * Sets (as xml) the "startQuantity" attribute
     */
    void xsetStartQuantity(org.apache.xmlbeans.XmlInteger startQuantity);
    
    /**
     * Unsets the "startQuantity" attribute
     */
    void unsetStartQuantity();
    
    /**
     * Gets the "completionQuantity" attribute
     */
    java.math.BigInteger getCompletionQuantity();
    
    /**
     * Gets (as xml) the "completionQuantity" attribute
     */
    org.apache.xmlbeans.XmlInteger xgetCompletionQuantity();
    
    /**
     * True if has "completionQuantity" attribute
     */
    boolean isSetCompletionQuantity();
    
    /**
     * Sets the "completionQuantity" attribute
     */
    void setCompletionQuantity(java.math.BigInteger completionQuantity);
    
    /**
     * Sets (as xml) the "completionQuantity" attribute
     */
    void xsetCompletionQuantity(org.apache.xmlbeans.XmlInteger completionQuantity);
    
    /**
     * Unsets the "completionQuantity" attribute
     */
    void unsetCompletionQuantity();
    
    /**
     * Gets the "default" attribute
     */
    java.lang.String getDefault();
    
    /**
     * Gets (as xml) the "default" attribute
     */
    org.apache.xmlbeans.XmlIDREF xgetDefault();
    
    /**
     * True if has "default" attribute
     */
    boolean isSetDefault();
    
    /**
     * Sets the "default" attribute
     */
    void setDefault(java.lang.String xdefault);
    
    /**
     * Sets (as xml) the "default" attribute
     */
    void xsetDefault(org.apache.xmlbeans.XmlIDREF xdefault);
    
    /**
     * Unsets the "default" attribute
     */
    void unsetDefault();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        /** @deprecated No need to be able to create instances of abstract types */
        public static org.omg.schema.spec.bpmn.x20.TActivity newInstance() {
          return (org.omg.schema.spec.bpmn.x20.TActivity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        /** @deprecated No need to be able to create instances of abstract types */
        public static org.omg.schema.spec.bpmn.x20.TActivity newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.omg.schema.spec.bpmn.x20.TActivity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.omg.schema.spec.bpmn.x20.TActivity parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.omg.schema.spec.bpmn.x20.TActivity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TActivity parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.omg.schema.spec.bpmn.x20.TActivity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.omg.schema.spec.bpmn.x20.TActivity parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TActivity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TActivity parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TActivity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.omg.schema.spec.bpmn.x20.TActivity parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TActivity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TActivity parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TActivity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.omg.schema.spec.bpmn.x20.TActivity parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TActivity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TActivity parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TActivity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.omg.schema.spec.bpmn.x20.TActivity parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TActivity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TActivity parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TActivity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.omg.schema.spec.bpmn.x20.TActivity parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.omg.schema.spec.bpmn.x20.TActivity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TActivity parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.omg.schema.spec.bpmn.x20.TActivity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.omg.schema.spec.bpmn.x20.TActivity parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.omg.schema.spec.bpmn.x20.TActivity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TActivity parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.omg.schema.spec.bpmn.x20.TActivity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.omg.schema.spec.bpmn.x20.TActivity parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.omg.schema.spec.bpmn.x20.TActivity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.omg.schema.spec.bpmn.x20.TActivity parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.omg.schema.spec.bpmn.x20.TActivity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

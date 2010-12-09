/*
 * XML Type:  tCatchEvent
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.TCatchEvent
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20;


/**
 * An XML tCatchEvent(@http://schema.omg.org/spec/BPMN/2.0).
 *
 * This is a complex type.
 */
public interface TCatchEvent extends org.omg.schema.spec.bpmn.x20.TEvent
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TCatchEvent.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBC864EDE3F984128F62D75C6516B63E9").resolveHandle("tcatcheventd0c7type");
    
    /**
     * Gets array of all "dataOutput" elements
     */
    org.omg.schema.spec.bpmn.x20.TDataOutput[] getDataOutputArray();
    
    /**
     * Gets ith "dataOutput" element
     */
    org.omg.schema.spec.bpmn.x20.TDataOutput getDataOutputArray(int i);
    
    /**
     * Returns number of "dataOutput" element
     */
    int sizeOfDataOutputArray();
    
    /**
     * Sets array of all "dataOutput" element
     */
    void setDataOutputArray(org.omg.schema.spec.bpmn.x20.TDataOutput[] dataOutputArray);
    
    /**
     * Sets ith "dataOutput" element
     */
    void setDataOutputArray(int i, org.omg.schema.spec.bpmn.x20.TDataOutput dataOutput);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "dataOutput" element
     */
    org.omg.schema.spec.bpmn.x20.TDataOutput insertNewDataOutput(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "dataOutput" element
     */
    org.omg.schema.spec.bpmn.x20.TDataOutput addNewDataOutput();
    
    /**
     * Removes the ith "dataOutput" element
     */
    void removeDataOutput(int i);
    
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
     * Gets the "outputSet" element
     */
    org.omg.schema.spec.bpmn.x20.TOutputSet getOutputSet();
    
    /**
     * True if has "outputSet" element
     */
    boolean isSetOutputSet();
    
    /**
     * Sets the "outputSet" element
     */
    void setOutputSet(org.omg.schema.spec.bpmn.x20.TOutputSet outputSet);
    
    /**
     * Appends and returns a new empty "outputSet" element
     */
    org.omg.schema.spec.bpmn.x20.TOutputSet addNewOutputSet();
    
    /**
     * Unsets the "outputSet" element
     */
    void unsetOutputSet();
    
    /**
     * Gets array of all "eventDefinition" elements
     */
    org.omg.schema.spec.bpmn.x20.TEventDefinition[] getEventDefinitionArray();
    
    /**
     * Gets ith "eventDefinition" element
     */
    org.omg.schema.spec.bpmn.x20.TEventDefinition getEventDefinitionArray(int i);
    
    /**
     * Returns number of "eventDefinition" element
     */
    int sizeOfEventDefinitionArray();
    
    /**
     * Sets array of all "eventDefinition" element
     */
    void setEventDefinitionArray(org.omg.schema.spec.bpmn.x20.TEventDefinition[] eventDefinitionArray);
    
    /**
     * Sets ith "eventDefinition" element
     */
    void setEventDefinitionArray(int i, org.omg.schema.spec.bpmn.x20.TEventDefinition eventDefinition);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "eventDefinition" element
     */
    org.omg.schema.spec.bpmn.x20.TEventDefinition insertNewEventDefinition(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "eventDefinition" element
     */
    org.omg.schema.spec.bpmn.x20.TEventDefinition addNewEventDefinition();
    
    /**
     * Removes the ith "eventDefinition" element
     */
    void removeEventDefinition(int i);
    
    /**
     * Gets array of all "eventDefinitionRef" elements
     */
    javax.xml.namespace.QName[] getEventDefinitionRefArray();
    
    /**
     * Gets ith "eventDefinitionRef" element
     */
    javax.xml.namespace.QName getEventDefinitionRefArray(int i);
    
    /**
     * Gets (as xml) array of all "eventDefinitionRef" elements
     */
    org.apache.xmlbeans.XmlQName[] xgetEventDefinitionRefArray();
    
    /**
     * Gets (as xml) ith "eventDefinitionRef" element
     */
    org.apache.xmlbeans.XmlQName xgetEventDefinitionRefArray(int i);
    
    /**
     * Returns number of "eventDefinitionRef" element
     */
    int sizeOfEventDefinitionRefArray();
    
    /**
     * Sets array of all "eventDefinitionRef" element
     */
    void setEventDefinitionRefArray(javax.xml.namespace.QName[] eventDefinitionRefArray);
    
    /**
     * Sets ith "eventDefinitionRef" element
     */
    void setEventDefinitionRefArray(int i, javax.xml.namespace.QName eventDefinitionRef);
    
    /**
     * Sets (as xml) array of all "eventDefinitionRef" element
     */
    void xsetEventDefinitionRefArray(org.apache.xmlbeans.XmlQName[] eventDefinitionRefArray);
    
    /**
     * Sets (as xml) ith "eventDefinitionRef" element
     */
    void xsetEventDefinitionRefArray(int i, org.apache.xmlbeans.XmlQName eventDefinitionRef);
    
    /**
     * Inserts the value as the ith "eventDefinitionRef" element
     */
    void insertEventDefinitionRef(int i, javax.xml.namespace.QName eventDefinitionRef);
    
    /**
     * Appends the value as the last "eventDefinitionRef" element
     */
    void addEventDefinitionRef(javax.xml.namespace.QName eventDefinitionRef);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "eventDefinitionRef" element
     */
    org.apache.xmlbeans.XmlQName insertNewEventDefinitionRef(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "eventDefinitionRef" element
     */
    org.apache.xmlbeans.XmlQName addNewEventDefinitionRef();
    
    /**
     * Removes the ith "eventDefinitionRef" element
     */
    void removeEventDefinitionRef(int i);
    
    /**
     * Gets the "parallelMultiple" attribute
     */
    boolean getParallelMultiple();
    
    /**
     * Gets (as xml) the "parallelMultiple" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetParallelMultiple();
    
    /**
     * True if has "parallelMultiple" attribute
     */
    boolean isSetParallelMultiple();
    
    /**
     * Sets the "parallelMultiple" attribute
     */
    void setParallelMultiple(boolean parallelMultiple);
    
    /**
     * Sets (as xml) the "parallelMultiple" attribute
     */
    void xsetParallelMultiple(org.apache.xmlbeans.XmlBoolean parallelMultiple);
    
    /**
     * Unsets the "parallelMultiple" attribute
     */
    void unsetParallelMultiple();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        /** @deprecated No need to be able to create instances of abstract types */
        public static org.omg.schema.spec.bpmn.x20.TCatchEvent newInstance() {
          return (org.omg.schema.spec.bpmn.x20.TCatchEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        /** @deprecated No need to be able to create instances of abstract types */
        public static org.omg.schema.spec.bpmn.x20.TCatchEvent newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.omg.schema.spec.bpmn.x20.TCatchEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.omg.schema.spec.bpmn.x20.TCatchEvent parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.omg.schema.spec.bpmn.x20.TCatchEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TCatchEvent parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.omg.schema.spec.bpmn.x20.TCatchEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.omg.schema.spec.bpmn.x20.TCatchEvent parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TCatchEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TCatchEvent parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TCatchEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.omg.schema.spec.bpmn.x20.TCatchEvent parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TCatchEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TCatchEvent parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TCatchEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.omg.schema.spec.bpmn.x20.TCatchEvent parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TCatchEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TCatchEvent parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TCatchEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.omg.schema.spec.bpmn.x20.TCatchEvent parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TCatchEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TCatchEvent parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TCatchEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.omg.schema.spec.bpmn.x20.TCatchEvent parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.omg.schema.spec.bpmn.x20.TCatchEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TCatchEvent parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.omg.schema.spec.bpmn.x20.TCatchEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.omg.schema.spec.bpmn.x20.TCatchEvent parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.omg.schema.spec.bpmn.x20.TCatchEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TCatchEvent parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.omg.schema.spec.bpmn.x20.TCatchEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.omg.schema.spec.bpmn.x20.TCatchEvent parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.omg.schema.spec.bpmn.x20.TCatchEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.omg.schema.spec.bpmn.x20.TCatchEvent parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.omg.schema.spec.bpmn.x20.TCatchEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

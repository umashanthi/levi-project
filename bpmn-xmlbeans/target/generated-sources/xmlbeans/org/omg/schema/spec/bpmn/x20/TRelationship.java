/*
 * XML Type:  tRelationship
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.TRelationship
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20;


/**
 * An XML tRelationship(@http://schema.omg.org/spec/BPMN/2.0).
 *
 * This is a complex type.
 */
public interface TRelationship extends org.omg.schema.spec.bpmn.x20.TBaseElement
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TRelationship.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBC864EDE3F984128F62D75C6516B63E9").resolveHandle("trelationshipc720type");
    
    /**
     * Gets array of all "source" elements
     */
    javax.xml.namespace.QName[] getSourceArray();
    
    /**
     * Gets ith "source" element
     */
    javax.xml.namespace.QName getSourceArray(int i);
    
    /**
     * Gets (as xml) array of all "source" elements
     */
    org.apache.xmlbeans.XmlQName[] xgetSourceArray();
    
    /**
     * Gets (as xml) ith "source" element
     */
    org.apache.xmlbeans.XmlQName xgetSourceArray(int i);
    
    /**
     * Returns number of "source" element
     */
    int sizeOfSourceArray();
    
    /**
     * Sets array of all "source" element
     */
    void setSourceArray(javax.xml.namespace.QName[] sourceArray);
    
    /**
     * Sets ith "source" element
     */
    void setSourceArray(int i, javax.xml.namespace.QName source);
    
    /**
     * Sets (as xml) array of all "source" element
     */
    void xsetSourceArray(org.apache.xmlbeans.XmlQName[] sourceArray);
    
    /**
     * Sets (as xml) ith "source" element
     */
    void xsetSourceArray(int i, org.apache.xmlbeans.XmlQName source);
    
    /**
     * Inserts the value as the ith "source" element
     */
    void insertSource(int i, javax.xml.namespace.QName source);
    
    /**
     * Appends the value as the last "source" element
     */
    void addSource(javax.xml.namespace.QName source);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "source" element
     */
    org.apache.xmlbeans.XmlQName insertNewSource(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "source" element
     */
    org.apache.xmlbeans.XmlQName addNewSource();
    
    /**
     * Removes the ith "source" element
     */
    void removeSource(int i);
    
    /**
     * Gets array of all "target" elements
     */
    javax.xml.namespace.QName[] getTargetArray();
    
    /**
     * Gets ith "target" element
     */
    javax.xml.namespace.QName getTargetArray(int i);
    
    /**
     * Gets (as xml) array of all "target" elements
     */
    org.apache.xmlbeans.XmlQName[] xgetTargetArray();
    
    /**
     * Gets (as xml) ith "target" element
     */
    org.apache.xmlbeans.XmlQName xgetTargetArray(int i);
    
    /**
     * Returns number of "target" element
     */
    int sizeOfTargetArray();
    
    /**
     * Sets array of all "target" element
     */
    void setTargetArray(javax.xml.namespace.QName[] targetArray);
    
    /**
     * Sets ith "target" element
     */
    void setTargetArray(int i, javax.xml.namespace.QName target);
    
    /**
     * Sets (as xml) array of all "target" element
     */
    void xsetTargetArray(org.apache.xmlbeans.XmlQName[] targetArray);
    
    /**
     * Sets (as xml) ith "target" element
     */
    void xsetTargetArray(int i, org.apache.xmlbeans.XmlQName target);
    
    /**
     * Inserts the value as the ith "target" element
     */
    void insertTarget(int i, javax.xml.namespace.QName target);
    
    /**
     * Appends the value as the last "target" element
     */
    void addTarget(javax.xml.namespace.QName target);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "target" element
     */
    org.apache.xmlbeans.XmlQName insertNewTarget(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "target" element
     */
    org.apache.xmlbeans.XmlQName addNewTarget();
    
    /**
     * Removes the ith "target" element
     */
    void removeTarget(int i);
    
    /**
     * Gets the "type" attribute
     */
    java.lang.String getType();
    
    /**
     * Gets (as xml) the "type" attribute
     */
    org.apache.xmlbeans.XmlString xgetType();
    
    /**
     * Sets the "type" attribute
     */
    void setType(java.lang.String type);
    
    /**
     * Sets (as xml) the "type" attribute
     */
    void xsetType(org.apache.xmlbeans.XmlString type);
    
    /**
     * Gets the "direction" attribute
     */
    org.omg.schema.spec.bpmn.x20.TRelationshipDirection.Enum getDirection();
    
    /**
     * Gets (as xml) the "direction" attribute
     */
    org.omg.schema.spec.bpmn.x20.TRelationshipDirection xgetDirection();
    
    /**
     * True if has "direction" attribute
     */
    boolean isSetDirection();
    
    /**
     * Sets the "direction" attribute
     */
    void setDirection(org.omg.schema.spec.bpmn.x20.TRelationshipDirection.Enum direction);
    
    /**
     * Sets (as xml) the "direction" attribute
     */
    void xsetDirection(org.omg.schema.spec.bpmn.x20.TRelationshipDirection direction);
    
    /**
     * Unsets the "direction" attribute
     */
    void unsetDirection();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.omg.schema.spec.bpmn.x20.TRelationship newInstance() {
          return (org.omg.schema.spec.bpmn.x20.TRelationship) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TRelationship newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.omg.schema.spec.bpmn.x20.TRelationship) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.omg.schema.spec.bpmn.x20.TRelationship parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.omg.schema.spec.bpmn.x20.TRelationship) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TRelationship parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.omg.schema.spec.bpmn.x20.TRelationship) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.omg.schema.spec.bpmn.x20.TRelationship parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TRelationship) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TRelationship parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TRelationship) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.omg.schema.spec.bpmn.x20.TRelationship parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TRelationship) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TRelationship parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TRelationship) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.omg.schema.spec.bpmn.x20.TRelationship parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TRelationship) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TRelationship parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TRelationship) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.omg.schema.spec.bpmn.x20.TRelationship parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TRelationship) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TRelationship parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TRelationship) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.omg.schema.spec.bpmn.x20.TRelationship parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.omg.schema.spec.bpmn.x20.TRelationship) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TRelationship parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.omg.schema.spec.bpmn.x20.TRelationship) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.omg.schema.spec.bpmn.x20.TRelationship parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.omg.schema.spec.bpmn.x20.TRelationship) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TRelationship parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.omg.schema.spec.bpmn.x20.TRelationship) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.omg.schema.spec.bpmn.x20.TRelationship parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.omg.schema.spec.bpmn.x20.TRelationship) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.omg.schema.spec.bpmn.x20.TRelationship parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.omg.schema.spec.bpmn.x20.TRelationship) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

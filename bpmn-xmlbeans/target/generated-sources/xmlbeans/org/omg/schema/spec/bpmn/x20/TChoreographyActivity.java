/*
 * XML Type:  tChoreographyActivity
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.TChoreographyActivity
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20;


/**
 * An XML tChoreographyActivity(@http://schema.omg.org/spec/BPMN/2.0).
 *
 * This is a complex type.
 */
public interface TChoreographyActivity extends org.omg.schema.spec.bpmn.x20.TFlowNode
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TChoreographyActivity.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBC864EDE3F984128F62D75C6516B63E9").resolveHandle("tchoreographyactivitya134type");
    
    /**
     * Gets array of all "participantRef" elements
     */
    javax.xml.namespace.QName[] getParticipantRefArray();
    
    /**
     * Gets ith "participantRef" element
     */
    javax.xml.namespace.QName getParticipantRefArray(int i);
    
    /**
     * Gets (as xml) array of all "participantRef" elements
     */
    org.apache.xmlbeans.XmlQName[] xgetParticipantRefArray();
    
    /**
     * Gets (as xml) ith "participantRef" element
     */
    org.apache.xmlbeans.XmlQName xgetParticipantRefArray(int i);
    
    /**
     * Returns number of "participantRef" element
     */
    int sizeOfParticipantRefArray();
    
    /**
     * Sets array of all "participantRef" element
     */
    void setParticipantRefArray(javax.xml.namespace.QName[] participantRefArray);
    
    /**
     * Sets ith "participantRef" element
     */
    void setParticipantRefArray(int i, javax.xml.namespace.QName participantRef);
    
    /**
     * Sets (as xml) array of all "participantRef" element
     */
    void xsetParticipantRefArray(org.apache.xmlbeans.XmlQName[] participantRefArray);
    
    /**
     * Sets (as xml) ith "participantRef" element
     */
    void xsetParticipantRefArray(int i, org.apache.xmlbeans.XmlQName participantRef);
    
    /**
     * Inserts the value as the ith "participantRef" element
     */
    void insertParticipantRef(int i, javax.xml.namespace.QName participantRef);
    
    /**
     * Appends the value as the last "participantRef" element
     */
    void addParticipantRef(javax.xml.namespace.QName participantRef);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "participantRef" element
     */
    org.apache.xmlbeans.XmlQName insertNewParticipantRef(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "participantRef" element
     */
    org.apache.xmlbeans.XmlQName addNewParticipantRef();
    
    /**
     * Removes the ith "participantRef" element
     */
    void removeParticipantRef(int i);
    
    /**
     * Gets the "initiatingParticipantRef" attribute
     */
    javax.xml.namespace.QName getInitiatingParticipantRef();
    
    /**
     * Gets (as xml) the "initiatingParticipantRef" attribute
     */
    org.apache.xmlbeans.XmlQName xgetInitiatingParticipantRef();
    
    /**
     * Sets the "initiatingParticipantRef" attribute
     */
    void setInitiatingParticipantRef(javax.xml.namespace.QName initiatingParticipantRef);
    
    /**
     * Sets (as xml) the "initiatingParticipantRef" attribute
     */
    void xsetInitiatingParticipantRef(org.apache.xmlbeans.XmlQName initiatingParticipantRef);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        /** @deprecated No need to be able to create instances of abstract types */
        public static org.omg.schema.spec.bpmn.x20.TChoreographyActivity newInstance() {
          return (org.omg.schema.spec.bpmn.x20.TChoreographyActivity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        /** @deprecated No need to be able to create instances of abstract types */
        public static org.omg.schema.spec.bpmn.x20.TChoreographyActivity newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.omg.schema.spec.bpmn.x20.TChoreographyActivity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.omg.schema.spec.bpmn.x20.TChoreographyActivity parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.omg.schema.spec.bpmn.x20.TChoreographyActivity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TChoreographyActivity parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.omg.schema.spec.bpmn.x20.TChoreographyActivity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.omg.schema.spec.bpmn.x20.TChoreographyActivity parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TChoreographyActivity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TChoreographyActivity parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TChoreographyActivity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.omg.schema.spec.bpmn.x20.TChoreographyActivity parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TChoreographyActivity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TChoreographyActivity parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TChoreographyActivity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.omg.schema.spec.bpmn.x20.TChoreographyActivity parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TChoreographyActivity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TChoreographyActivity parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TChoreographyActivity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.omg.schema.spec.bpmn.x20.TChoreographyActivity parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TChoreographyActivity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TChoreographyActivity parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TChoreographyActivity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.omg.schema.spec.bpmn.x20.TChoreographyActivity parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.omg.schema.spec.bpmn.x20.TChoreographyActivity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TChoreographyActivity parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.omg.schema.spec.bpmn.x20.TChoreographyActivity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.omg.schema.spec.bpmn.x20.TChoreographyActivity parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.omg.schema.spec.bpmn.x20.TChoreographyActivity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TChoreographyActivity parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.omg.schema.spec.bpmn.x20.TChoreographyActivity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.omg.schema.spec.bpmn.x20.TChoreographyActivity parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.omg.schema.spec.bpmn.x20.TChoreographyActivity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.omg.schema.spec.bpmn.x20.TChoreographyActivity parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.omg.schema.spec.bpmn.x20.TChoreographyActivity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

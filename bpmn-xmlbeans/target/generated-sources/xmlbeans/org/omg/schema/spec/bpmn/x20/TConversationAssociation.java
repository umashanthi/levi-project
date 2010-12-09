/*
 * XML Type:  tConversationAssociation
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.TConversationAssociation
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20;


/**
 * An XML tConversationAssociation(@http://schema.omg.org/spec/BPMN/2.0).
 *
 * This is a complex type.
 */
public interface TConversationAssociation extends org.omg.schema.spec.bpmn.x20.TBaseElement
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TConversationAssociation.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBC864EDE3F984128F62D75C6516B63E9").resolveHandle("tconversationassociationb670type");
    
    /**
     * Gets array of all "messageFlowRef" elements
     */
    javax.xml.namespace.QName[] getMessageFlowRefArray();
    
    /**
     * Gets ith "messageFlowRef" element
     */
    javax.xml.namespace.QName getMessageFlowRefArray(int i);
    
    /**
     * Gets (as xml) array of all "messageFlowRef" elements
     */
    org.apache.xmlbeans.XmlQName[] xgetMessageFlowRefArray();
    
    /**
     * Gets (as xml) ith "messageFlowRef" element
     */
    org.apache.xmlbeans.XmlQName xgetMessageFlowRefArray(int i);
    
    /**
     * Returns number of "messageFlowRef" element
     */
    int sizeOfMessageFlowRefArray();
    
    /**
     * Sets array of all "messageFlowRef" element
     */
    void setMessageFlowRefArray(javax.xml.namespace.QName[] messageFlowRefArray);
    
    /**
     * Sets ith "messageFlowRef" element
     */
    void setMessageFlowRefArray(int i, javax.xml.namespace.QName messageFlowRef);
    
    /**
     * Sets (as xml) array of all "messageFlowRef" element
     */
    void xsetMessageFlowRefArray(org.apache.xmlbeans.XmlQName[] messageFlowRefArray);
    
    /**
     * Sets (as xml) ith "messageFlowRef" element
     */
    void xsetMessageFlowRefArray(int i, org.apache.xmlbeans.XmlQName messageFlowRef);
    
    /**
     * Inserts the value as the ith "messageFlowRef" element
     */
    void insertMessageFlowRef(int i, javax.xml.namespace.QName messageFlowRef);
    
    /**
     * Appends the value as the last "messageFlowRef" element
     */
    void addMessageFlowRef(javax.xml.namespace.QName messageFlowRef);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "messageFlowRef" element
     */
    org.apache.xmlbeans.XmlQName insertNewMessageFlowRef(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "messageFlowRef" element
     */
    org.apache.xmlbeans.XmlQName addNewMessageFlowRef();
    
    /**
     * Removes the ith "messageFlowRef" element
     */
    void removeMessageFlowRef(int i);
    
    /**
     * Gets the "conversationRef" attribute
     */
    javax.xml.namespace.QName getConversationRef();
    
    /**
     * Gets (as xml) the "conversationRef" attribute
     */
    org.apache.xmlbeans.XmlQName xgetConversationRef();
    
    /**
     * True if has "conversationRef" attribute
     */
    boolean isSetConversationRef();
    
    /**
     * Sets the "conversationRef" attribute
     */
    void setConversationRef(javax.xml.namespace.QName conversationRef);
    
    /**
     * Sets (as xml) the "conversationRef" attribute
     */
    void xsetConversationRef(org.apache.xmlbeans.XmlQName conversationRef);
    
    /**
     * Unsets the "conversationRef" attribute
     */
    void unsetConversationRef();
    
    /**
     * Gets the "correlationKeyRef" attribute
     */
    javax.xml.namespace.QName getCorrelationKeyRef();
    
    /**
     * Gets (as xml) the "correlationKeyRef" attribute
     */
    org.apache.xmlbeans.XmlQName xgetCorrelationKeyRef();
    
    /**
     * True if has "correlationKeyRef" attribute
     */
    boolean isSetCorrelationKeyRef();
    
    /**
     * Sets the "correlationKeyRef" attribute
     */
    void setCorrelationKeyRef(javax.xml.namespace.QName correlationKeyRef);
    
    /**
     * Sets (as xml) the "correlationKeyRef" attribute
     */
    void xsetCorrelationKeyRef(org.apache.xmlbeans.XmlQName correlationKeyRef);
    
    /**
     * Unsets the "correlationKeyRef" attribute
     */
    void unsetCorrelationKeyRef();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.omg.schema.spec.bpmn.x20.TConversationAssociation newInstance() {
          return (org.omg.schema.spec.bpmn.x20.TConversationAssociation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TConversationAssociation newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.omg.schema.spec.bpmn.x20.TConversationAssociation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.omg.schema.spec.bpmn.x20.TConversationAssociation parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.omg.schema.spec.bpmn.x20.TConversationAssociation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TConversationAssociation parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.omg.schema.spec.bpmn.x20.TConversationAssociation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.omg.schema.spec.bpmn.x20.TConversationAssociation parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TConversationAssociation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TConversationAssociation parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TConversationAssociation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.omg.schema.spec.bpmn.x20.TConversationAssociation parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TConversationAssociation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TConversationAssociation parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TConversationAssociation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.omg.schema.spec.bpmn.x20.TConversationAssociation parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TConversationAssociation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TConversationAssociation parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TConversationAssociation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.omg.schema.spec.bpmn.x20.TConversationAssociation parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TConversationAssociation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TConversationAssociation parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TConversationAssociation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.omg.schema.spec.bpmn.x20.TConversationAssociation parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.omg.schema.spec.bpmn.x20.TConversationAssociation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TConversationAssociation parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.omg.schema.spec.bpmn.x20.TConversationAssociation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.omg.schema.spec.bpmn.x20.TConversationAssociation parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.omg.schema.spec.bpmn.x20.TConversationAssociation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TConversationAssociation parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.omg.schema.spec.bpmn.x20.TConversationAssociation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.omg.schema.spec.bpmn.x20.TConversationAssociation parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.omg.schema.spec.bpmn.x20.TConversationAssociation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.omg.schema.spec.bpmn.x20.TConversationAssociation parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.omg.schema.spec.bpmn.x20.TConversationAssociation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

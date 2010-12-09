/*
 * XML Type:  tConversation
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.TConversation
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20;


/**
 * An XML tConversation(@http://schema.omg.org/spec/BPMN/2.0).
 *
 * This is a complex type.
 */
public interface TConversation extends org.omg.schema.spec.bpmn.x20.TCallableElement
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TConversation.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBC864EDE3F984128F62D75C6516B63E9").resolveHandle("tconversation23ebtype");
    
    /**
     * Gets array of all "conversationNode" elements
     */
    org.omg.schema.spec.bpmn.x20.TConversationNode[] getConversationNodeArray();
    
    /**
     * Gets ith "conversationNode" element
     */
    org.omg.schema.spec.bpmn.x20.TConversationNode getConversationNodeArray(int i);
    
    /**
     * Returns number of "conversationNode" element
     */
    int sizeOfConversationNodeArray();
    
    /**
     * Sets array of all "conversationNode" element
     */
    void setConversationNodeArray(org.omg.schema.spec.bpmn.x20.TConversationNode[] conversationNodeArray);
    
    /**
     * Sets ith "conversationNode" element
     */
    void setConversationNodeArray(int i, org.omg.schema.spec.bpmn.x20.TConversationNode conversationNode);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "conversationNode" element
     */
    org.omg.schema.spec.bpmn.x20.TConversationNode insertNewConversationNode(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "conversationNode" element
     */
    org.omg.schema.spec.bpmn.x20.TConversationNode addNewConversationNode();
    
    /**
     * Removes the ith "conversationNode" element
     */
    void removeConversationNode(int i);
    
    /**
     * Gets array of all "participant" elements
     */
    org.omg.schema.spec.bpmn.x20.TParticipant[] getParticipantArray();
    
    /**
     * Gets ith "participant" element
     */
    org.omg.schema.spec.bpmn.x20.TParticipant getParticipantArray(int i);
    
    /**
     * Returns number of "participant" element
     */
    int sizeOfParticipantArray();
    
    /**
     * Sets array of all "participant" element
     */
    void setParticipantArray(org.omg.schema.spec.bpmn.x20.TParticipant[] participantArray);
    
    /**
     * Sets ith "participant" element
     */
    void setParticipantArray(int i, org.omg.schema.spec.bpmn.x20.TParticipant participant);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "participant" element
     */
    org.omg.schema.spec.bpmn.x20.TParticipant insertNewParticipant(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "participant" element
     */
    org.omg.schema.spec.bpmn.x20.TParticipant addNewParticipant();
    
    /**
     * Removes the ith "participant" element
     */
    void removeParticipant(int i);
    
    /**
     * Gets array of all "artifact" elements
     */
    org.omg.schema.spec.bpmn.x20.TArtifact[] getArtifactArray();
    
    /**
     * Gets ith "artifact" element
     */
    org.omg.schema.spec.bpmn.x20.TArtifact getArtifactArray(int i);
    
    /**
     * Returns number of "artifact" element
     */
    int sizeOfArtifactArray();
    
    /**
     * Sets array of all "artifact" element
     */
    void setArtifactArray(org.omg.schema.spec.bpmn.x20.TArtifact[] artifactArray);
    
    /**
     * Sets ith "artifact" element
     */
    void setArtifactArray(int i, org.omg.schema.spec.bpmn.x20.TArtifact artifact);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "artifact" element
     */
    org.omg.schema.spec.bpmn.x20.TArtifact insertNewArtifact(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "artifact" element
     */
    org.omg.schema.spec.bpmn.x20.TArtifact addNewArtifact();
    
    /**
     * Removes the ith "artifact" element
     */
    void removeArtifact(int i);
    
    /**
     * Gets array of all "messageFlow" elements
     */
    org.omg.schema.spec.bpmn.x20.TMessageFlow[] getMessageFlowArray();
    
    /**
     * Gets ith "messageFlow" element
     */
    org.omg.schema.spec.bpmn.x20.TMessageFlow getMessageFlowArray(int i);
    
    /**
     * Returns number of "messageFlow" element
     */
    int sizeOfMessageFlowArray();
    
    /**
     * Sets array of all "messageFlow" element
     */
    void setMessageFlowArray(org.omg.schema.spec.bpmn.x20.TMessageFlow[] messageFlowArray);
    
    /**
     * Sets ith "messageFlow" element
     */
    void setMessageFlowArray(int i, org.omg.schema.spec.bpmn.x20.TMessageFlow messageFlow);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "messageFlow" element
     */
    org.omg.schema.spec.bpmn.x20.TMessageFlow insertNewMessageFlow(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "messageFlow" element
     */
    org.omg.schema.spec.bpmn.x20.TMessageFlow addNewMessageFlow();
    
    /**
     * Removes the ith "messageFlow" element
     */
    void removeMessageFlow(int i);
    
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
     * Gets array of all "correlationKey" elements
     */
    org.omg.schema.spec.bpmn.x20.TCorrelationKey[] getCorrelationKeyArray();
    
    /**
     * Gets ith "correlationKey" element
     */
    org.omg.schema.spec.bpmn.x20.TCorrelationKey getCorrelationKeyArray(int i);
    
    /**
     * Returns number of "correlationKey" element
     */
    int sizeOfCorrelationKeyArray();
    
    /**
     * Sets array of all "correlationKey" element
     */
    void setCorrelationKeyArray(org.omg.schema.spec.bpmn.x20.TCorrelationKey[] correlationKeyArray);
    
    /**
     * Sets ith "correlationKey" element
     */
    void setCorrelationKeyArray(int i, org.omg.schema.spec.bpmn.x20.TCorrelationKey correlationKey);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "correlationKey" element
     */
    org.omg.schema.spec.bpmn.x20.TCorrelationKey insertNewCorrelationKey(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "correlationKey" element
     */
    org.omg.schema.spec.bpmn.x20.TCorrelationKey addNewCorrelationKey();
    
    /**
     * Removes the ith "correlationKey" element
     */
    void removeCorrelationKey(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.omg.schema.spec.bpmn.x20.TConversation newInstance() {
          return (org.omg.schema.spec.bpmn.x20.TConversation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TConversation newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.omg.schema.spec.bpmn.x20.TConversation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.omg.schema.spec.bpmn.x20.TConversation parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.omg.schema.spec.bpmn.x20.TConversation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TConversation parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.omg.schema.spec.bpmn.x20.TConversation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.omg.schema.spec.bpmn.x20.TConversation parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TConversation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TConversation parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TConversation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.omg.schema.spec.bpmn.x20.TConversation parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TConversation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TConversation parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TConversation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.omg.schema.spec.bpmn.x20.TConversation parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TConversation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TConversation parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TConversation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.omg.schema.spec.bpmn.x20.TConversation parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TConversation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TConversation parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TConversation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.omg.schema.spec.bpmn.x20.TConversation parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.omg.schema.spec.bpmn.x20.TConversation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TConversation parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.omg.schema.spec.bpmn.x20.TConversation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.omg.schema.spec.bpmn.x20.TConversation parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.omg.schema.spec.bpmn.x20.TConversation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TConversation parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.omg.schema.spec.bpmn.x20.TConversation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.omg.schema.spec.bpmn.x20.TConversation parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.omg.schema.spec.bpmn.x20.TConversation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.omg.schema.spec.bpmn.x20.TConversation parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.omg.schema.spec.bpmn.x20.TConversation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

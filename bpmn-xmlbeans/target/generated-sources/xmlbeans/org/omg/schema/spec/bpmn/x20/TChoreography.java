/*
 * XML Type:  tChoreography
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.TChoreography
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20;


/**
 * An XML tChoreography(@http://schema.omg.org/spec/BPMN/2.0).
 *
 * This is a complex type.
 */
public interface TChoreography extends org.omg.schema.spec.bpmn.x20.TCallableElement
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TChoreography.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBC864EDE3F984128F62D75C6516B63E9").resolveHandle("tchoreography5d85type");
    
    /**
     * Gets array of all "flowElement" elements
     */
    org.omg.schema.spec.bpmn.x20.TFlowElement[] getFlowElementArray();
    
    /**
     * Gets ith "flowElement" element
     */
    org.omg.schema.spec.bpmn.x20.TFlowElement getFlowElementArray(int i);
    
    /**
     * Returns number of "flowElement" element
     */
    int sizeOfFlowElementArray();
    
    /**
     * Sets array of all "flowElement" element
     */
    void setFlowElementArray(org.omg.schema.spec.bpmn.x20.TFlowElement[] flowElementArray);
    
    /**
     * Sets ith "flowElement" element
     */
    void setFlowElementArray(int i, org.omg.schema.spec.bpmn.x20.TFlowElement flowElement);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "flowElement" element
     */
    org.omg.schema.spec.bpmn.x20.TFlowElement insertNewFlowElement(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "flowElement" element
     */
    org.omg.schema.spec.bpmn.x20.TFlowElement addNewFlowElement();
    
    /**
     * Removes the ith "flowElement" element
     */
    void removeFlowElement(int i);
    
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
     * Gets array of all "conversation" elements
     */
    org.omg.schema.spec.bpmn.x20.TConversation[] getConversationArray();
    
    /**
     * Gets ith "conversation" element
     */
    org.omg.schema.spec.bpmn.x20.TConversation getConversationArray(int i);
    
    /**
     * Returns number of "conversation" element
     */
    int sizeOfConversationArray();
    
    /**
     * Sets array of all "conversation" element
     */
    void setConversationArray(org.omg.schema.spec.bpmn.x20.TConversation[] conversationArray);
    
    /**
     * Sets ith "conversation" element
     */
    void setConversationArray(int i, org.omg.schema.spec.bpmn.x20.TConversation conversation);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "conversation" element
     */
    org.omg.schema.spec.bpmn.x20.TConversation insertNewConversation(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "conversation" element
     */
    org.omg.schema.spec.bpmn.x20.TConversation addNewConversation();
    
    /**
     * Removes the ith "conversation" element
     */
    void removeConversation(int i);
    
    /**
     * Gets array of all "conversationAssociation" elements
     */
    org.omg.schema.spec.bpmn.x20.TConversationAssociation[] getConversationAssociationArray();
    
    /**
     * Gets ith "conversationAssociation" element
     */
    org.omg.schema.spec.bpmn.x20.TConversationAssociation getConversationAssociationArray(int i);
    
    /**
     * Returns number of "conversationAssociation" element
     */
    int sizeOfConversationAssociationArray();
    
    /**
     * Sets array of all "conversationAssociation" element
     */
    void setConversationAssociationArray(org.omg.schema.spec.bpmn.x20.TConversationAssociation[] conversationAssociationArray);
    
    /**
     * Sets ith "conversationAssociation" element
     */
    void setConversationAssociationArray(int i, org.omg.schema.spec.bpmn.x20.TConversationAssociation conversationAssociation);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "conversationAssociation" element
     */
    org.omg.schema.spec.bpmn.x20.TConversationAssociation insertNewConversationAssociation(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "conversationAssociation" element
     */
    org.omg.schema.spec.bpmn.x20.TConversationAssociation addNewConversationAssociation();
    
    /**
     * Removes the ith "conversationAssociation" element
     */
    void removeConversationAssociation(int i);
    
    /**
     * Gets array of all "messageFlowAssociation" elements
     */
    org.omg.schema.spec.bpmn.x20.TMessageFlowAssociation[] getMessageFlowAssociationArray();
    
    /**
     * Gets ith "messageFlowAssociation" element
     */
    org.omg.schema.spec.bpmn.x20.TMessageFlowAssociation getMessageFlowAssociationArray(int i);
    
    /**
     * Returns number of "messageFlowAssociation" element
     */
    int sizeOfMessageFlowAssociationArray();
    
    /**
     * Sets array of all "messageFlowAssociation" element
     */
    void setMessageFlowAssociationArray(org.omg.schema.spec.bpmn.x20.TMessageFlowAssociation[] messageFlowAssociationArray);
    
    /**
     * Sets ith "messageFlowAssociation" element
     */
    void setMessageFlowAssociationArray(int i, org.omg.schema.spec.bpmn.x20.TMessageFlowAssociation messageFlowAssociation);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "messageFlowAssociation" element
     */
    org.omg.schema.spec.bpmn.x20.TMessageFlowAssociation insertNewMessageFlowAssociation(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "messageFlowAssociation" element
     */
    org.omg.schema.spec.bpmn.x20.TMessageFlowAssociation addNewMessageFlowAssociation();
    
    /**
     * Removes the ith "messageFlowAssociation" element
     */
    void removeMessageFlowAssociation(int i);
    
    /**
     * Gets array of all "participantAssociation" elements
     */
    org.omg.schema.spec.bpmn.x20.TParticipantAssociation[] getParticipantAssociationArray();
    
    /**
     * Gets ith "participantAssociation" element
     */
    org.omg.schema.spec.bpmn.x20.TParticipantAssociation getParticipantAssociationArray(int i);
    
    /**
     * Returns number of "participantAssociation" element
     */
    int sizeOfParticipantAssociationArray();
    
    /**
     * Sets array of all "participantAssociation" element
     */
    void setParticipantAssociationArray(org.omg.schema.spec.bpmn.x20.TParticipantAssociation[] participantAssociationArray);
    
    /**
     * Sets ith "participantAssociation" element
     */
    void setParticipantAssociationArray(int i, org.omg.schema.spec.bpmn.x20.TParticipantAssociation participantAssociation);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "participantAssociation" element
     */
    org.omg.schema.spec.bpmn.x20.TParticipantAssociation insertNewParticipantAssociation(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "participantAssociation" element
     */
    org.omg.schema.spec.bpmn.x20.TParticipantAssociation addNewParticipantAssociation();
    
    /**
     * Removes the ith "participantAssociation" element
     */
    void removeParticipantAssociation(int i);
    
    /**
     * Gets the "isClosed" attribute
     */
    boolean getIsClosed();
    
    /**
     * Gets (as xml) the "isClosed" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetIsClosed();
    
    /**
     * True if has "isClosed" attribute
     */
    boolean isSetIsClosed();
    
    /**
     * Sets the "isClosed" attribute
     */
    void setIsClosed(boolean isClosed);
    
    /**
     * Sets (as xml) the "isClosed" attribute
     */
    void xsetIsClosed(org.apache.xmlbeans.XmlBoolean isClosed);
    
    /**
     * Unsets the "isClosed" attribute
     */
    void unsetIsClosed();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.omg.schema.spec.bpmn.x20.TChoreography newInstance() {
          return (org.omg.schema.spec.bpmn.x20.TChoreography) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TChoreography newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.omg.schema.spec.bpmn.x20.TChoreography) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.omg.schema.spec.bpmn.x20.TChoreography parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.omg.schema.spec.bpmn.x20.TChoreography) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TChoreography parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.omg.schema.spec.bpmn.x20.TChoreography) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.omg.schema.spec.bpmn.x20.TChoreography parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TChoreography) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TChoreography parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TChoreography) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.omg.schema.spec.bpmn.x20.TChoreography parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TChoreography) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TChoreography parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TChoreography) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.omg.schema.spec.bpmn.x20.TChoreography parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TChoreography) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TChoreography parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TChoreography) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.omg.schema.spec.bpmn.x20.TChoreography parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TChoreography) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TChoreography parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TChoreography) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.omg.schema.spec.bpmn.x20.TChoreography parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.omg.schema.spec.bpmn.x20.TChoreography) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TChoreography parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.omg.schema.spec.bpmn.x20.TChoreography) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.omg.schema.spec.bpmn.x20.TChoreography parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.omg.schema.spec.bpmn.x20.TChoreography) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TChoreography parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.omg.schema.spec.bpmn.x20.TChoreography) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.omg.schema.spec.bpmn.x20.TChoreography parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.omg.schema.spec.bpmn.x20.TChoreography) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.omg.schema.spec.bpmn.x20.TChoreography parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.omg.schema.spec.bpmn.x20.TChoreography) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

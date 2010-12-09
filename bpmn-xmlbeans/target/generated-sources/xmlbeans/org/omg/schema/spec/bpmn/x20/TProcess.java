/*
 * XML Type:  tProcess
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.TProcess
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20;


/**
 * An XML tProcess(@http://schema.omg.org/spec/BPMN/2.0).
 *
 * This is a complex type.
 */
public interface TProcess extends org.omg.schema.spec.bpmn.x20.TCallableElement
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TProcess.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBC864EDE3F984128F62D75C6516B63E9").resolveHandle("tprocessb261type");
    
    /**
     * Gets the "auditing" element
     */
    org.omg.schema.spec.bpmn.x20.TAuditing getAuditing();
    
    /**
     * True if has "auditing" element
     */
    boolean isSetAuditing();
    
    /**
     * Sets the "auditing" element
     */
    void setAuditing(org.omg.schema.spec.bpmn.x20.TAuditing auditing);
    
    /**
     * Appends and returns a new empty "auditing" element
     */
    org.omg.schema.spec.bpmn.x20.TAuditing addNewAuditing();
    
    /**
     * Unsets the "auditing" element
     */
    void unsetAuditing();
    
    /**
     * Gets the "monitoring" element
     */
    org.omg.schema.spec.bpmn.x20.TMonitoring getMonitoring();
    
    /**
     * True if has "monitoring" element
     */
    boolean isSetMonitoring();
    
    /**
     * Sets the "monitoring" element
     */
    void setMonitoring(org.omg.schema.spec.bpmn.x20.TMonitoring monitoring);
    
    /**
     * Appends and returns a new empty "monitoring" element
     */
    org.omg.schema.spec.bpmn.x20.TMonitoring addNewMonitoring();
    
    /**
     * Unsets the "monitoring" element
     */
    void unsetMonitoring();
    
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
     * Gets array of all "laneSet" elements
     */
    org.omg.schema.spec.bpmn.x20.TLaneSet[] getLaneSetArray();
    
    /**
     * Gets ith "laneSet" element
     */
    org.omg.schema.spec.bpmn.x20.TLaneSet getLaneSetArray(int i);
    
    /**
     * Returns number of "laneSet" element
     */
    int sizeOfLaneSetArray();
    
    /**
     * Sets array of all "laneSet" element
     */
    void setLaneSetArray(org.omg.schema.spec.bpmn.x20.TLaneSet[] laneSetArray);
    
    /**
     * Sets ith "laneSet" element
     */
    void setLaneSetArray(int i, org.omg.schema.spec.bpmn.x20.TLaneSet laneSet);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "laneSet" element
     */
    org.omg.schema.spec.bpmn.x20.TLaneSet insertNewLaneSet(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "laneSet" element
     */
    org.omg.schema.spec.bpmn.x20.TLaneSet addNewLaneSet();
    
    /**
     * Removes the ith "laneSet" element
     */
    void removeLaneSet(int i);
    
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
     * Gets array of all "supports" elements
     */
    javax.xml.namespace.QName[] getSupportsArray();
    
    /**
     * Gets ith "supports" element
     */
    javax.xml.namespace.QName getSupportsArray(int i);
    
    /**
     * Gets (as xml) array of all "supports" elements
     */
    org.apache.xmlbeans.XmlQName[] xgetSupportsArray();
    
    /**
     * Gets (as xml) ith "supports" element
     */
    org.apache.xmlbeans.XmlQName xgetSupportsArray(int i);
    
    /**
     * Returns number of "supports" element
     */
    int sizeOfSupportsArray();
    
    /**
     * Sets array of all "supports" element
     */
    void setSupportsArray(javax.xml.namespace.QName[] supportsArray);
    
    /**
     * Sets ith "supports" element
     */
    void setSupportsArray(int i, javax.xml.namespace.QName supports);
    
    /**
     * Sets (as xml) array of all "supports" element
     */
    void xsetSupportsArray(org.apache.xmlbeans.XmlQName[] supportsArray);
    
    /**
     * Sets (as xml) ith "supports" element
     */
    void xsetSupportsArray(int i, org.apache.xmlbeans.XmlQName supports);
    
    /**
     * Inserts the value as the ith "supports" element
     */
    void insertSupports(int i, javax.xml.namespace.QName supports);
    
    /**
     * Appends the value as the last "supports" element
     */
    void addSupports(javax.xml.namespace.QName supports);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "supports" element
     */
    org.apache.xmlbeans.XmlQName insertNewSupports(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "supports" element
     */
    org.apache.xmlbeans.XmlQName addNewSupports();
    
    /**
     * Removes the ith "supports" element
     */
    void removeSupports(int i);
    
    /**
     * Gets the "processType" attribute
     */
    org.omg.schema.spec.bpmn.x20.TProcessType.Enum getProcessType();
    
    /**
     * Gets (as xml) the "processType" attribute
     */
    org.omg.schema.spec.bpmn.x20.TProcessType xgetProcessType();
    
    /**
     * True if has "processType" attribute
     */
    boolean isSetProcessType();
    
    /**
     * Sets the "processType" attribute
     */
    void setProcessType(org.omg.schema.spec.bpmn.x20.TProcessType.Enum processType);
    
    /**
     * Sets (as xml) the "processType" attribute
     */
    void xsetProcessType(org.omg.schema.spec.bpmn.x20.TProcessType processType);
    
    /**
     * Unsets the "processType" attribute
     */
    void unsetProcessType();
    
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
     * Gets the "definitionalCollaborationRef" attribute
     */
    javax.xml.namespace.QName getDefinitionalCollaborationRef();
    
    /**
     * Gets (as xml) the "definitionalCollaborationRef" attribute
     */
    org.apache.xmlbeans.XmlQName xgetDefinitionalCollaborationRef();
    
    /**
     * True if has "definitionalCollaborationRef" attribute
     */
    boolean isSetDefinitionalCollaborationRef();
    
    /**
     * Sets the "definitionalCollaborationRef" attribute
     */
    void setDefinitionalCollaborationRef(javax.xml.namespace.QName definitionalCollaborationRef);
    
    /**
     * Sets (as xml) the "definitionalCollaborationRef" attribute
     */
    void xsetDefinitionalCollaborationRef(org.apache.xmlbeans.XmlQName definitionalCollaborationRef);
    
    /**
     * Unsets the "definitionalCollaborationRef" attribute
     */
    void unsetDefinitionalCollaborationRef();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.omg.schema.spec.bpmn.x20.TProcess newInstance() {
          return (org.omg.schema.spec.bpmn.x20.TProcess) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TProcess newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.omg.schema.spec.bpmn.x20.TProcess) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.omg.schema.spec.bpmn.x20.TProcess parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.omg.schema.spec.bpmn.x20.TProcess) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TProcess parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.omg.schema.spec.bpmn.x20.TProcess) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.omg.schema.spec.bpmn.x20.TProcess parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TProcess) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TProcess parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TProcess) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.omg.schema.spec.bpmn.x20.TProcess parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TProcess) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TProcess parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TProcess) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.omg.schema.spec.bpmn.x20.TProcess parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TProcess) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TProcess parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TProcess) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.omg.schema.spec.bpmn.x20.TProcess parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TProcess) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TProcess parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TProcess) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.omg.schema.spec.bpmn.x20.TProcess parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.omg.schema.spec.bpmn.x20.TProcess) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TProcess parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.omg.schema.spec.bpmn.x20.TProcess) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.omg.schema.spec.bpmn.x20.TProcess parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.omg.schema.spec.bpmn.x20.TProcess) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TProcess parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.omg.schema.spec.bpmn.x20.TProcess) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.omg.schema.spec.bpmn.x20.TProcess parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.omg.schema.spec.bpmn.x20.TProcess) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.omg.schema.spec.bpmn.x20.TProcess parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.omg.schema.spec.bpmn.x20.TProcess) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

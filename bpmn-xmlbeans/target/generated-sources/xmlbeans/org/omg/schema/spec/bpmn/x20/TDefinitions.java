/*
 * XML Type:  tDefinitions
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.TDefinitions
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20;


/**
 * An XML tDefinitions(@http://schema.omg.org/spec/BPMN/2.0).
 *
 * This is a complex type.
 */
public interface TDefinitions extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TDefinitions.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBC864EDE3F984128F62D75C6516B63E9").resolveHandle("tdefinitionsa272type");
    
    /**
     * Gets array of all "import" elements
     */
    org.omg.schema.spec.bpmn.x20.TImport[] getImportArray();
    
    /**
     * Gets ith "import" element
     */
    org.omg.schema.spec.bpmn.x20.TImport getImportArray(int i);
    
    /**
     * Returns number of "import" element
     */
    int sizeOfImportArray();
    
    /**
     * Sets array of all "import" element
     */
    void setImportArray(org.omg.schema.spec.bpmn.x20.TImport[] ximportArray);
    
    /**
     * Sets ith "import" element
     */
    void setImportArray(int i, org.omg.schema.spec.bpmn.x20.TImport ximport);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "import" element
     */
    org.omg.schema.spec.bpmn.x20.TImport insertNewImport(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "import" element
     */
    org.omg.schema.spec.bpmn.x20.TImport addNewImport();
    
    /**
     * Removes the ith "import" element
     */
    void removeImport(int i);
    
    /**
     * Gets array of all "extension" elements
     */
    org.omg.schema.spec.bpmn.x20.TExtension[] getExtensionArray();
    
    /**
     * Gets ith "extension" element
     */
    org.omg.schema.spec.bpmn.x20.TExtension getExtensionArray(int i);
    
    /**
     * Returns number of "extension" element
     */
    int sizeOfExtensionArray();
    
    /**
     * Sets array of all "extension" element
     */
    void setExtensionArray(org.omg.schema.spec.bpmn.x20.TExtension[] extensionArray);
    
    /**
     * Sets ith "extension" element
     */
    void setExtensionArray(int i, org.omg.schema.spec.bpmn.x20.TExtension extension);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "extension" element
     */
    org.omg.schema.spec.bpmn.x20.TExtension insertNewExtension(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "extension" element
     */
    org.omg.schema.spec.bpmn.x20.TExtension addNewExtension();
    
    /**
     * Removes the ith "extension" element
     */
    void removeExtension(int i);
    
    /**
     * Gets array of all "rootElement" elements
     */
    org.omg.schema.spec.bpmn.x20.TRootElement[] getRootElementArray();
    
    /**
     * Gets ith "rootElement" element
     */
    org.omg.schema.spec.bpmn.x20.TRootElement getRootElementArray(int i);
    
    /**
     * Returns number of "rootElement" element
     */
    int sizeOfRootElementArray();
    
    /**
     * Sets array of all "rootElement" element
     */
    void setRootElementArray(org.omg.schema.spec.bpmn.x20.TRootElement[] rootElementArray);
    
    /**
     * Sets ith "rootElement" element
     */
    void setRootElementArray(int i, org.omg.schema.spec.bpmn.x20.TRootElement rootElement);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "rootElement" element
     */
    org.omg.schema.spec.bpmn.x20.TRootElement insertNewRootElement(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "rootElement" element
     */
    org.omg.schema.spec.bpmn.x20.TRootElement addNewRootElement();
    
    /**
     * Removes the ith "rootElement" element
     */
    void removeRootElement(int i);
    
    /**
     * Gets array of all "diagram" elements
     */
    com.omg.di.x100.Diagram[] getDiagramArray();
    
    /**
     * Gets ith "diagram" element
     */
    com.omg.di.x100.Diagram getDiagramArray(int i);
    
    /**
     * Returns number of "diagram" element
     */
    int sizeOfDiagramArray();
    
    /**
     * Sets array of all "diagram" element
     */
    void setDiagramArray(com.omg.di.x100.Diagram[] diagramArray);
    
    /**
     * Sets ith "diagram" element
     */
    void setDiagramArray(int i, com.omg.di.x100.Diagram diagram);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "diagram" element
     */
    com.omg.di.x100.Diagram insertNewDiagram(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "diagram" element
     */
    com.omg.di.x100.Diagram addNewDiagram();
    
    /**
     * Removes the ith "diagram" element
     */
    void removeDiagram(int i);
    
    /**
     * Gets array of all "relationship" elements
     */
    org.omg.schema.spec.bpmn.x20.TRelationship[] getRelationshipArray();
    
    /**
     * Gets ith "relationship" element
     */
    org.omg.schema.spec.bpmn.x20.TRelationship getRelationshipArray(int i);
    
    /**
     * Returns number of "relationship" element
     */
    int sizeOfRelationshipArray();
    
    /**
     * Sets array of all "relationship" element
     */
    void setRelationshipArray(org.omg.schema.spec.bpmn.x20.TRelationship[] relationshipArray);
    
    /**
     * Sets ith "relationship" element
     */
    void setRelationshipArray(int i, org.omg.schema.spec.bpmn.x20.TRelationship relationship);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "relationship" element
     */
    org.omg.schema.spec.bpmn.x20.TRelationship insertNewRelationship(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "relationship" element
     */
    org.omg.schema.spec.bpmn.x20.TRelationship addNewRelationship();
    
    /**
     * Removes the ith "relationship" element
     */
    void removeRelationship(int i);
    
    /**
     * Gets the "id" attribute
     */
    java.lang.String getId();
    
    /**
     * Gets (as xml) the "id" attribute
     */
    org.apache.xmlbeans.XmlID xgetId();
    
    /**
     * True if has "id" attribute
     */
    boolean isSetId();
    
    /**
     * Sets the "id" attribute
     */
    void setId(java.lang.String id);
    
    /**
     * Sets (as xml) the "id" attribute
     */
    void xsetId(org.apache.xmlbeans.XmlID id);
    
    /**
     * Unsets the "id" attribute
     */
    void unsetId();
    
    /**
     * Gets the "targetNamespace" attribute
     */
    java.lang.String getTargetNamespace();
    
    /**
     * Gets (as xml) the "targetNamespace" attribute
     */
    org.apache.xmlbeans.XmlAnyURI xgetTargetNamespace();
    
    /**
     * Sets the "targetNamespace" attribute
     */
    void setTargetNamespace(java.lang.String targetNamespace);
    
    /**
     * Sets (as xml) the "targetNamespace" attribute
     */
    void xsetTargetNamespace(org.apache.xmlbeans.XmlAnyURI targetNamespace);
    
    /**
     * Gets the "expressionLanguage" attribute
     */
    java.lang.String getExpressionLanguage();
    
    /**
     * Gets (as xml) the "expressionLanguage" attribute
     */
    org.apache.xmlbeans.XmlAnyURI xgetExpressionLanguage();
    
    /**
     * True if has "expressionLanguage" attribute
     */
    boolean isSetExpressionLanguage();
    
    /**
     * Sets the "expressionLanguage" attribute
     */
    void setExpressionLanguage(java.lang.String expressionLanguage);
    
    /**
     * Sets (as xml) the "expressionLanguage" attribute
     */
    void xsetExpressionLanguage(org.apache.xmlbeans.XmlAnyURI expressionLanguage);
    
    /**
     * Unsets the "expressionLanguage" attribute
     */
    void unsetExpressionLanguage();
    
    /**
     * Gets the "typeLanguage" attribute
     */
    java.lang.String getTypeLanguage();
    
    /**
     * Gets (as xml) the "typeLanguage" attribute
     */
    org.apache.xmlbeans.XmlAnyURI xgetTypeLanguage();
    
    /**
     * True if has "typeLanguage" attribute
     */
    boolean isSetTypeLanguage();
    
    /**
     * Sets the "typeLanguage" attribute
     */
    void setTypeLanguage(java.lang.String typeLanguage);
    
    /**
     * Sets (as xml) the "typeLanguage" attribute
     */
    void xsetTypeLanguage(org.apache.xmlbeans.XmlAnyURI typeLanguage);
    
    /**
     * Unsets the "typeLanguage" attribute
     */
    void unsetTypeLanguage();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.omg.schema.spec.bpmn.x20.TDefinitions newInstance() {
          return (org.omg.schema.spec.bpmn.x20.TDefinitions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TDefinitions newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.omg.schema.spec.bpmn.x20.TDefinitions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.omg.schema.spec.bpmn.x20.TDefinitions parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.omg.schema.spec.bpmn.x20.TDefinitions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TDefinitions parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.omg.schema.spec.bpmn.x20.TDefinitions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.omg.schema.spec.bpmn.x20.TDefinitions parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TDefinitions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TDefinitions parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TDefinitions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.omg.schema.spec.bpmn.x20.TDefinitions parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TDefinitions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TDefinitions parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TDefinitions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.omg.schema.spec.bpmn.x20.TDefinitions parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TDefinitions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TDefinitions parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TDefinitions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.omg.schema.spec.bpmn.x20.TDefinitions parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TDefinitions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TDefinitions parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TDefinitions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.omg.schema.spec.bpmn.x20.TDefinitions parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.omg.schema.spec.bpmn.x20.TDefinitions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TDefinitions parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.omg.schema.spec.bpmn.x20.TDefinitions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.omg.schema.spec.bpmn.x20.TDefinitions parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.omg.schema.spec.bpmn.x20.TDefinitions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TDefinitions parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.omg.schema.spec.bpmn.x20.TDefinitions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.omg.schema.spec.bpmn.x20.TDefinitions parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.omg.schema.spec.bpmn.x20.TDefinitions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.omg.schema.spec.bpmn.x20.TDefinitions parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.omg.schema.spec.bpmn.x20.TDefinitions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

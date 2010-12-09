/*
 * XML Type:  ViewDefinition
 * Namespace: http://www.omg.com/dd/1.0.0
 * Java type: com.omg.dd.x100.ViewDefinition
 *
 * Automatically generated - do not modify.
 */
package com.omg.dd.x100;


/**
 * An XML ViewDefinition(@http://www.omg.com/dd/1.0.0).
 *
 * This is a complex type.
 */
public interface ViewDefinition extends com.omg.dd.x100.NamedElement
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ViewDefinition.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBC864EDE3F984128F62D75C6516B63E9").resolveHandle("viewdefinitionce23type");
    
    /**
     * Gets array of all "constraint" elements
     */
    com.omg.dd.x100.Constraint[] getConstraintArray();
    
    /**
     * Gets ith "constraint" element
     */
    com.omg.dd.x100.Constraint getConstraintArray(int i);
    
    /**
     * Returns number of "constraint" element
     */
    int sizeOfConstraintArray();
    
    /**
     * Sets array of all "constraint" element
     */
    void setConstraintArray(com.omg.dd.x100.Constraint[] constraintArray);
    
    /**
     * Sets ith "constraint" element
     */
    void setConstraintArray(int i, com.omg.dd.x100.Constraint constraint);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "constraint" element
     */
    com.omg.dd.x100.Constraint insertNewConstraint(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "constraint" element
     */
    com.omg.dd.x100.Constraint addNewConstraint();
    
    /**
     * Removes the ith "constraint" element
     */
    void removeConstraint(int i);
    
    /**
     * Gets array of all "styleDefinition" elements
     */
    com.omg.dd.x100.StyleDefinition[] getStyleDefinitionArray();
    
    /**
     * Gets ith "styleDefinition" element
     */
    com.omg.dd.x100.StyleDefinition getStyleDefinitionArray(int i);
    
    /**
     * Returns number of "styleDefinition" element
     */
    int sizeOfStyleDefinitionArray();
    
    /**
     * Sets array of all "styleDefinition" element
     */
    void setStyleDefinitionArray(com.omg.dd.x100.StyleDefinition[] styleDefinitionArray);
    
    /**
     * Sets ith "styleDefinition" element
     */
    void setStyleDefinitionArray(int i, com.omg.dd.x100.StyleDefinition styleDefinition);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "styleDefinition" element
     */
    com.omg.dd.x100.StyleDefinition insertNewStyleDefinition(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "styleDefinition" element
     */
    com.omg.dd.x100.StyleDefinition addNewStyleDefinition();
    
    /**
     * Removes the ith "styleDefinition" element
     */
    void removeStyleDefinition(int i);
    
    /**
     * Gets array of all "childDefinition" elements
     */
    com.omg.dd.x100.ChildDefinition[] getChildDefinitionArray();
    
    /**
     * Gets ith "childDefinition" element
     */
    com.omg.dd.x100.ChildDefinition getChildDefinitionArray(int i);
    
    /**
     * Returns number of "childDefinition" element
     */
    int sizeOfChildDefinitionArray();
    
    /**
     * Sets array of all "childDefinition" element
     */
    void setChildDefinitionArray(com.omg.dd.x100.ChildDefinition[] childDefinitionArray);
    
    /**
     * Sets ith "childDefinition" element
     */
    void setChildDefinitionArray(int i, com.omg.dd.x100.ChildDefinition childDefinition);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "childDefinition" element
     */
    com.omg.dd.x100.ChildDefinition insertNewChildDefinition(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "childDefinition" element
     */
    com.omg.dd.x100.ChildDefinition addNewChildDefinition();
    
    /**
     * Removes the ith "childDefinition" element
     */
    void removeChildDefinition(int i);
    
    /**
     * Gets the "id" attribute
     */
    java.lang.String getId();
    
    /**
     * Gets (as xml) the "id" attribute
     */
    org.apache.xmlbeans.XmlNCName xgetId();
    
    /**
     * Sets the "id" attribute
     */
    void setId(java.lang.String id);
    
    /**
     * Sets (as xml) the "id" attribute
     */
    void xsetId(org.apache.xmlbeans.XmlNCName id);
    
    /**
     * Gets the "abstract" attribute
     */
    boolean getAbstract();
    
    /**
     * Gets (as xml) the "abstract" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetAbstract();
    
    /**
     * True if has "abstract" attribute
     */
    boolean isSetAbstract();
    
    /**
     * Sets the "abstract" attribute
     */
    void setAbstract(boolean xabstract);
    
    /**
     * Sets (as xml) the "abstract" attribute
     */
    void xsetAbstract(org.apache.xmlbeans.XmlBoolean xabstract);
    
    /**
     * Unsets the "abstract" attribute
     */
    void unsetAbstract();
    
    /**
     * Gets the "superDefinition" attribute
     */
    javax.xml.namespace.QName getSuperDefinition();
    
    /**
     * Gets (as xml) the "superDefinition" attribute
     */
    org.apache.xmlbeans.XmlQName xgetSuperDefinition();
    
    /**
     * True if has "superDefinition" attribute
     */
    boolean isSetSuperDefinition();
    
    /**
     * Sets the "superDefinition" attribute
     */
    void setSuperDefinition(javax.xml.namespace.QName superDefinition);
    
    /**
     * Sets (as xml) the "superDefinition" attribute
     */
    void xsetSuperDefinition(org.apache.xmlbeans.XmlQName superDefinition);
    
    /**
     * Unsets the "superDefinition" attribute
     */
    void unsetSuperDefinition();
    
    /**
     * Gets the "contextType" attribute
     */
    javax.xml.namespace.QName getContextType();
    
    /**
     * Gets (as xml) the "contextType" attribute
     */
    org.apache.xmlbeans.XmlQName xgetContextType();
    
    /**
     * True if has "contextType" attribute
     */
    boolean isSetContextType();
    
    /**
     * Sets the "contextType" attribute
     */
    void setContextType(javax.xml.namespace.QName contextType);
    
    /**
     * Sets (as xml) the "contextType" attribute
     */
    void xsetContextType(org.apache.xmlbeans.XmlQName contextType);
    
    /**
     * Unsets the "contextType" attribute
     */
    void unsetContextType();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        /** @deprecated No need to be able to create instances of abstract types */
        public static com.omg.dd.x100.ViewDefinition newInstance() {
          return (com.omg.dd.x100.ViewDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        /** @deprecated No need to be able to create instances of abstract types */
        public static com.omg.dd.x100.ViewDefinition newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.omg.dd.x100.ViewDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.omg.dd.x100.ViewDefinition parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.omg.dd.x100.ViewDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.omg.dd.x100.ViewDefinition parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.omg.dd.x100.ViewDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.omg.dd.x100.ViewDefinition parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.omg.dd.x100.ViewDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.omg.dd.x100.ViewDefinition parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.omg.dd.x100.ViewDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.omg.dd.x100.ViewDefinition parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.omg.dd.x100.ViewDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.omg.dd.x100.ViewDefinition parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.omg.dd.x100.ViewDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.omg.dd.x100.ViewDefinition parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.omg.dd.x100.ViewDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.omg.dd.x100.ViewDefinition parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.omg.dd.x100.ViewDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.omg.dd.x100.ViewDefinition parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.omg.dd.x100.ViewDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.omg.dd.x100.ViewDefinition parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.omg.dd.x100.ViewDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.omg.dd.x100.ViewDefinition parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.omg.dd.x100.ViewDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.omg.dd.x100.ViewDefinition parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.omg.dd.x100.ViewDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.omg.dd.x100.ViewDefinition parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.omg.dd.x100.ViewDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.omg.dd.x100.ViewDefinition parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.omg.dd.x100.ViewDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.omg.dd.x100.ViewDefinition parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.omg.dd.x100.ViewDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.omg.dd.x100.ViewDefinition parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.omg.dd.x100.ViewDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

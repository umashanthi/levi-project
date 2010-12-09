/*
 * XML Type:  Package
 * Namespace: http://www.omg.com/dd/1.0.0
 * Java type: com.omg.dd.x100.Package
 *
 * Automatically generated - do not modify.
 */
package com.omg.dd.x100;


/**
 * An XML Package(@http://www.omg.com/dd/1.0.0).
 *
 * This is a complex type.
 */
public interface Package extends com.omg.dd.x100.NamedElement
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Package.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBC864EDE3F984128F62D75C6516B63E9").resolveHandle("packageb91ftype");
    
    /**
     * Gets array of all "viewDefinition" elements
     */
    com.omg.dd.x100.ViewDefinition[] getViewDefinitionArray();
    
    /**
     * Gets ith "viewDefinition" element
     */
    com.omg.dd.x100.ViewDefinition getViewDefinitionArray(int i);
    
    /**
     * Returns number of "viewDefinition" element
     */
    int sizeOfViewDefinitionArray();
    
    /**
     * Sets array of all "viewDefinition" element
     */
    void setViewDefinitionArray(com.omg.dd.x100.ViewDefinition[] viewDefinitionArray);
    
    /**
     * Sets ith "viewDefinition" element
     */
    void setViewDefinitionArray(int i, com.omg.dd.x100.ViewDefinition viewDefinition);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "viewDefinition" element
     */
    com.omg.dd.x100.ViewDefinition insertNewViewDefinition(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "viewDefinition" element
     */
    com.omg.dd.x100.ViewDefinition addNewViewDefinition();
    
    /**
     * Removes the ith "viewDefinition" element
     */
    void removeViewDefinition(int i);
    
    /**
     * Gets the "nsURI" attribute
     */
    java.lang.String getNsURI();
    
    /**
     * Gets (as xml) the "nsURI" attribute
     */
    org.apache.xmlbeans.XmlAnyURI xgetNsURI();
    
    /**
     * Sets the "nsURI" attribute
     */
    void setNsURI(java.lang.String nsURI);
    
    /**
     * Sets (as xml) the "nsURI" attribute
     */
    void xsetNsURI(org.apache.xmlbeans.XmlAnyURI nsURI);
    
    /**
     * Gets the "nsPrefix" attribute
     */
    java.lang.String getNsPrefix();
    
    /**
     * Gets (as xml) the "nsPrefix" attribute
     */
    org.apache.xmlbeans.XmlNCName xgetNsPrefix();
    
    /**
     * Sets the "nsPrefix" attribute
     */
    void setNsPrefix(java.lang.String nsPrefix);
    
    /**
     * Sets (as xml) the "nsPrefix" attribute
     */
    void xsetNsPrefix(org.apache.xmlbeans.XmlNCName nsPrefix);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.omg.dd.x100.Package newInstance() {
          return (com.omg.dd.x100.Package) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.omg.dd.x100.Package newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.omg.dd.x100.Package) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.omg.dd.x100.Package parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.omg.dd.x100.Package) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.omg.dd.x100.Package parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.omg.dd.x100.Package) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.omg.dd.x100.Package parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.omg.dd.x100.Package) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.omg.dd.x100.Package parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.omg.dd.x100.Package) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.omg.dd.x100.Package parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.omg.dd.x100.Package) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.omg.dd.x100.Package parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.omg.dd.x100.Package) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.omg.dd.x100.Package parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.omg.dd.x100.Package) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.omg.dd.x100.Package parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.omg.dd.x100.Package) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.omg.dd.x100.Package parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.omg.dd.x100.Package) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.omg.dd.x100.Package parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.omg.dd.x100.Package) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.omg.dd.x100.Package parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.omg.dd.x100.Package) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.omg.dd.x100.Package parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.omg.dd.x100.Package) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.omg.dd.x100.Package parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.omg.dd.x100.Package) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.omg.dd.x100.Package parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.omg.dd.x100.Package) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.omg.dd.x100.Package parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.omg.dd.x100.Package) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.omg.dd.x100.Package parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.omg.dd.x100.Package) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

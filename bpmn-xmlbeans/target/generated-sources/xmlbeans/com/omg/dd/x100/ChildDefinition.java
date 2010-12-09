/*
 * XML Type:  ChildDefinition
 * Namespace: http://www.omg.com/dd/1.0.0
 * Java type: com.omg.dd.x100.ChildDefinition
 *
 * Automatically generated - do not modify.
 */
package com.omg.dd.x100;


/**
 * An XML ChildDefinition(@http://www.omg.com/dd/1.0.0).
 *
 * This is a complex type.
 */
public interface ChildDefinition extends com.omg.dd.x100.NamedElement
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ChildDefinition.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBC864EDE3F984128F62D75C6516B63E9").resolveHandle("childdefinitionb9e8type");
    
    /**
     * Gets the "lowerBound" attribute
     */
    int getLowerBound();
    
    /**
     * Gets (as xml) the "lowerBound" attribute
     */
    org.apache.xmlbeans.XmlInt xgetLowerBound();
    
    /**
     * True if has "lowerBound" attribute
     */
    boolean isSetLowerBound();
    
    /**
     * Sets the "lowerBound" attribute
     */
    void setLowerBound(int lowerBound);
    
    /**
     * Sets (as xml) the "lowerBound" attribute
     */
    void xsetLowerBound(org.apache.xmlbeans.XmlInt lowerBound);
    
    /**
     * Unsets the "lowerBound" attribute
     */
    void unsetLowerBound();
    
    /**
     * Gets the "upperBound" attribute
     */
    int getUpperBound();
    
    /**
     * Gets (as xml) the "upperBound" attribute
     */
    org.apache.xmlbeans.XmlInt xgetUpperBound();
    
    /**
     * True if has "upperBound" attribute
     */
    boolean isSetUpperBound();
    
    /**
     * Sets the "upperBound" attribute
     */
    void setUpperBound(int upperBound);
    
    /**
     * Sets (as xml) the "upperBound" attribute
     */
    void xsetUpperBound(org.apache.xmlbeans.XmlInt upperBound);
    
    /**
     * Unsets the "upperBound" attribute
     */
    void unsetUpperBound();
    
    /**
     * Gets the "typeDefinition" attribute
     */
    javax.xml.namespace.QName getTypeDefinition();
    
    /**
     * Gets (as xml) the "typeDefinition" attribute
     */
    org.apache.xmlbeans.XmlQName xgetTypeDefinition();
    
    /**
     * Sets the "typeDefinition" attribute
     */
    void setTypeDefinition(javax.xml.namespace.QName typeDefinition);
    
    /**
     * Sets (as xml) the "typeDefinition" attribute
     */
    void xsetTypeDefinition(org.apache.xmlbeans.XmlQName typeDefinition);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.omg.dd.x100.ChildDefinition newInstance() {
          return (com.omg.dd.x100.ChildDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.omg.dd.x100.ChildDefinition newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.omg.dd.x100.ChildDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.omg.dd.x100.ChildDefinition parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.omg.dd.x100.ChildDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.omg.dd.x100.ChildDefinition parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.omg.dd.x100.ChildDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.omg.dd.x100.ChildDefinition parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.omg.dd.x100.ChildDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.omg.dd.x100.ChildDefinition parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.omg.dd.x100.ChildDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.omg.dd.x100.ChildDefinition parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.omg.dd.x100.ChildDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.omg.dd.x100.ChildDefinition parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.omg.dd.x100.ChildDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.omg.dd.x100.ChildDefinition parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.omg.dd.x100.ChildDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.omg.dd.x100.ChildDefinition parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.omg.dd.x100.ChildDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.omg.dd.x100.ChildDefinition parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.omg.dd.x100.ChildDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.omg.dd.x100.ChildDefinition parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.omg.dd.x100.ChildDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.omg.dd.x100.ChildDefinition parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.omg.dd.x100.ChildDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.omg.dd.x100.ChildDefinition parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.omg.dd.x100.ChildDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.omg.dd.x100.ChildDefinition parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.omg.dd.x100.ChildDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.omg.dd.x100.ChildDefinition parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.omg.dd.x100.ChildDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.omg.dd.x100.ChildDefinition parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.omg.dd.x100.ChildDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.omg.dd.x100.ChildDefinition parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.omg.dd.x100.ChildDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

/*
 * XML Type:  Connector
 * Namespace: http://www.omg.com/di/1.0.0
 * Java type: com.omg.di.x100.Connector
 *
 * Automatically generated - do not modify.
 */
package com.omg.di.x100;


/**
 * An XML Connector(@http://www.omg.com/di/1.0.0).
 *
 * This is a complex type.
 */
public interface Connector extends com.omg.di.x100.View
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Connector.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBC864EDE3F984128F62D75C6516B63E9").resolveHandle("connector072btype");
    
    /**
     * Gets array of all "bendpoint" elements
     */
    com.omg.di.x100.Bendpoint[] getBendpointArray();
    
    /**
     * Gets ith "bendpoint" element
     */
    com.omg.di.x100.Bendpoint getBendpointArray(int i);
    
    /**
     * Returns number of "bendpoint" element
     */
    int sizeOfBendpointArray();
    
    /**
     * Sets array of all "bendpoint" element
     */
    void setBendpointArray(com.omg.di.x100.Bendpoint[] bendpointArray);
    
    /**
     * Sets ith "bendpoint" element
     */
    void setBendpointArray(int i, com.omg.di.x100.Bendpoint bendpoint);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "bendpoint" element
     */
    com.omg.di.x100.Bendpoint insertNewBendpoint(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "bendpoint" element
     */
    com.omg.di.x100.Bendpoint addNewBendpoint();
    
    /**
     * Removes the ith "bendpoint" element
     */
    void removeBendpoint(int i);
    
    /**
     * Gets the "source" attribute
     */
    java.lang.String getSource();
    
    /**
     * Gets (as xml) the "source" attribute
     */
    org.apache.xmlbeans.XmlAnyURI xgetSource();
    
    /**
     * Sets the "source" attribute
     */
    void setSource(java.lang.String source);
    
    /**
     * Sets (as xml) the "source" attribute
     */
    void xsetSource(org.apache.xmlbeans.XmlAnyURI source);
    
    /**
     * Gets the "target" attribute
     */
    java.lang.String getTarget();
    
    /**
     * Gets (as xml) the "target" attribute
     */
    org.apache.xmlbeans.XmlAnyURI xgetTarget();
    
    /**
     * Sets the "target" attribute
     */
    void setTarget(java.lang.String target);
    
    /**
     * Sets (as xml) the "target" attribute
     */
    void xsetTarget(org.apache.xmlbeans.XmlAnyURI target);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.omg.di.x100.Connector newInstance() {
          return (com.omg.di.x100.Connector) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.omg.di.x100.Connector newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.omg.di.x100.Connector) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.omg.di.x100.Connector parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.omg.di.x100.Connector) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.omg.di.x100.Connector parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.omg.di.x100.Connector) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.omg.di.x100.Connector parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.omg.di.x100.Connector) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.omg.di.x100.Connector parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.omg.di.x100.Connector) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.omg.di.x100.Connector parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.omg.di.x100.Connector) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.omg.di.x100.Connector parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.omg.di.x100.Connector) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.omg.di.x100.Connector parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.omg.di.x100.Connector) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.omg.di.x100.Connector parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.omg.di.x100.Connector) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.omg.di.x100.Connector parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.omg.di.x100.Connector) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.omg.di.x100.Connector parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.omg.di.x100.Connector) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.omg.di.x100.Connector parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.omg.di.x100.Connector) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.omg.di.x100.Connector parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.omg.di.x100.Connector) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.omg.di.x100.Connector parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.omg.di.x100.Connector) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.omg.di.x100.Connector parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.omg.di.x100.Connector) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.omg.di.x100.Connector parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.omg.di.x100.Connector) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.omg.di.x100.Connector parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.omg.di.x100.Connector) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

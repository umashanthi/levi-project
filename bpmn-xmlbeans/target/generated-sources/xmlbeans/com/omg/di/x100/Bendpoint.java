/*
 * XML Type:  Bendpoint
 * Namespace: http://www.omg.com/di/1.0.0
 * Java type: com.omg.di.x100.Bendpoint
 *
 * Automatically generated - do not modify.
 */
package com.omg.di.x100;


/**
 * An XML Bendpoint(@http://www.omg.com/di/1.0.0).
 *
 * This is a complex type.
 */
public interface Bendpoint extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Bendpoint.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBC864EDE3F984128F62D75C6516B63E9").resolveHandle("bendpointebd5type");
    
    /**
     * Gets the "sourceX" attribute
     */
    int getSourceX();
    
    /**
     * Gets (as xml) the "sourceX" attribute
     */
    org.apache.xmlbeans.XmlInt xgetSourceX();
    
    /**
     * Sets the "sourceX" attribute
     */
    void setSourceX(int sourceX);
    
    /**
     * Sets (as xml) the "sourceX" attribute
     */
    void xsetSourceX(org.apache.xmlbeans.XmlInt sourceX);
    
    /**
     * Gets the "sourceY" attribute
     */
    int getSourceY();
    
    /**
     * Gets (as xml) the "sourceY" attribute
     */
    org.apache.xmlbeans.XmlInt xgetSourceY();
    
    /**
     * Sets the "sourceY" attribute
     */
    void setSourceY(int sourceY);
    
    /**
     * Sets (as xml) the "sourceY" attribute
     */
    void xsetSourceY(org.apache.xmlbeans.XmlInt sourceY);
    
    /**
     * Gets the "targetX" attribute
     */
    int getTargetX();
    
    /**
     * Gets (as xml) the "targetX" attribute
     */
    org.apache.xmlbeans.XmlInt xgetTargetX();
    
    /**
     * Sets the "targetX" attribute
     */
    void setTargetX(int targetX);
    
    /**
     * Sets (as xml) the "targetX" attribute
     */
    void xsetTargetX(org.apache.xmlbeans.XmlInt targetX);
    
    /**
     * Gets the "targetY" attribute
     */
    int getTargetY();
    
    /**
     * Gets (as xml) the "targetY" attribute
     */
    org.apache.xmlbeans.XmlInt xgetTargetY();
    
    /**
     * Sets the "targetY" attribute
     */
    void setTargetY(int targetY);
    
    /**
     * Sets (as xml) the "targetY" attribute
     */
    void xsetTargetY(org.apache.xmlbeans.XmlInt targetY);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.omg.di.x100.Bendpoint newInstance() {
          return (com.omg.di.x100.Bendpoint) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.omg.di.x100.Bendpoint newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.omg.di.x100.Bendpoint) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.omg.di.x100.Bendpoint parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.omg.di.x100.Bendpoint) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.omg.di.x100.Bendpoint parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.omg.di.x100.Bendpoint) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.omg.di.x100.Bendpoint parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.omg.di.x100.Bendpoint) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.omg.di.x100.Bendpoint parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.omg.di.x100.Bendpoint) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.omg.di.x100.Bendpoint parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.omg.di.x100.Bendpoint) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.omg.di.x100.Bendpoint parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.omg.di.x100.Bendpoint) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.omg.di.x100.Bendpoint parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.omg.di.x100.Bendpoint) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.omg.di.x100.Bendpoint parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.omg.di.x100.Bendpoint) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.omg.di.x100.Bendpoint parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.omg.di.x100.Bendpoint) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.omg.di.x100.Bendpoint parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.omg.di.x100.Bendpoint) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.omg.di.x100.Bendpoint parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.omg.di.x100.Bendpoint) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.omg.di.x100.Bendpoint parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.omg.di.x100.Bendpoint) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.omg.di.x100.Bendpoint parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.omg.di.x100.Bendpoint) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.omg.di.x100.Bendpoint parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.omg.di.x100.Bendpoint) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.omg.di.x100.Bendpoint parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.omg.di.x100.Bendpoint) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.omg.di.x100.Bendpoint parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.omg.di.x100.Bendpoint) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

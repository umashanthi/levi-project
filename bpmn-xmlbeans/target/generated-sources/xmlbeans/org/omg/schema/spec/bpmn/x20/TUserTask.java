/*
 * XML Type:  tUserTask
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.TUserTask
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20;


/**
 * An XML tUserTask(@http://schema.omg.org/spec/BPMN/2.0).
 *
 * This is a complex type.
 */
public interface TUserTask extends org.omg.schema.spec.bpmn.x20.TTask
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TUserTask.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBC864EDE3F984128F62D75C6516B63E9").resolveHandle("tusertaskea58type");
    
    /**
     * Gets array of all "rendering" elements
     */
    org.omg.schema.spec.bpmn.x20.TRendering[] getRenderingArray();
    
    /**
     * Gets ith "rendering" element
     */
    org.omg.schema.spec.bpmn.x20.TRendering getRenderingArray(int i);
    
    /**
     * Returns number of "rendering" element
     */
    int sizeOfRenderingArray();
    
    /**
     * Sets array of all "rendering" element
     */
    void setRenderingArray(org.omg.schema.spec.bpmn.x20.TRendering[] renderingArray);
    
    /**
     * Sets ith "rendering" element
     */
    void setRenderingArray(int i, org.omg.schema.spec.bpmn.x20.TRendering rendering);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "rendering" element
     */
    org.omg.schema.spec.bpmn.x20.TRendering insertNewRendering(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "rendering" element
     */
    org.omg.schema.spec.bpmn.x20.TRendering addNewRendering();
    
    /**
     * Removes the ith "rendering" element
     */
    void removeRendering(int i);
    
    /**
     * Gets the "implementation" attribute
     */
    org.omg.schema.spec.bpmn.x20.TUserTaskImplementation.Enum getImplementation();
    
    /**
     * Gets (as xml) the "implementation" attribute
     */
    org.omg.schema.spec.bpmn.x20.TUserTaskImplementation xgetImplementation();
    
    /**
     * True if has "implementation" attribute
     */
    boolean isSetImplementation();
    
    /**
     * Sets the "implementation" attribute
     */
    void setImplementation(org.omg.schema.spec.bpmn.x20.TUserTaskImplementation.Enum implementation);
    
    /**
     * Sets (as xml) the "implementation" attribute
     */
    void xsetImplementation(org.omg.schema.spec.bpmn.x20.TUserTaskImplementation implementation);
    
    /**
     * Unsets the "implementation" attribute
     */
    void unsetImplementation();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.omg.schema.spec.bpmn.x20.TUserTask newInstance() {
          return (org.omg.schema.spec.bpmn.x20.TUserTask) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TUserTask newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.omg.schema.spec.bpmn.x20.TUserTask) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.omg.schema.spec.bpmn.x20.TUserTask parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.omg.schema.spec.bpmn.x20.TUserTask) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TUserTask parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.omg.schema.spec.bpmn.x20.TUserTask) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.omg.schema.spec.bpmn.x20.TUserTask parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TUserTask) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TUserTask parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TUserTask) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.omg.schema.spec.bpmn.x20.TUserTask parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TUserTask) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TUserTask parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TUserTask) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.omg.schema.spec.bpmn.x20.TUserTask parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TUserTask) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TUserTask parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TUserTask) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.omg.schema.spec.bpmn.x20.TUserTask parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TUserTask) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TUserTask parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TUserTask) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.omg.schema.spec.bpmn.x20.TUserTask parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.omg.schema.spec.bpmn.x20.TUserTask) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TUserTask parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.omg.schema.spec.bpmn.x20.TUserTask) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.omg.schema.spec.bpmn.x20.TUserTask parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.omg.schema.spec.bpmn.x20.TUserTask) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TUserTask parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.omg.schema.spec.bpmn.x20.TUserTask) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.omg.schema.spec.bpmn.x20.TUserTask parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.omg.schema.spec.bpmn.x20.TUserTask) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.omg.schema.spec.bpmn.x20.TUserTask parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.omg.schema.spec.bpmn.x20.TUserTask) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

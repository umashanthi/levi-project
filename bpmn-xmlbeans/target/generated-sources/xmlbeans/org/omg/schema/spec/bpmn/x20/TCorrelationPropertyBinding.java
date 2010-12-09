/*
 * XML Type:  tCorrelationPropertyBinding
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.TCorrelationPropertyBinding
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20;


/**
 * An XML tCorrelationPropertyBinding(@http://schema.omg.org/spec/BPMN/2.0).
 *
 * This is a complex type.
 */
public interface TCorrelationPropertyBinding extends org.omg.schema.spec.bpmn.x20.TBaseElement
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TCorrelationPropertyBinding.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBC864EDE3F984128F62D75C6516B63E9").resolveHandle("tcorrelationpropertybindingcbb6type");
    
    /**
     * Gets the "dataPath" element
     */
    org.omg.schema.spec.bpmn.x20.TFormalExpression getDataPath();
    
    /**
     * Sets the "dataPath" element
     */
    void setDataPath(org.omg.schema.spec.bpmn.x20.TFormalExpression dataPath);
    
    /**
     * Appends and returns a new empty "dataPath" element
     */
    org.omg.schema.spec.bpmn.x20.TFormalExpression addNewDataPath();
    
    /**
     * Gets the "correlationPropertyRef" attribute
     */
    javax.xml.namespace.QName getCorrelationPropertyRef();
    
    /**
     * Gets (as xml) the "correlationPropertyRef" attribute
     */
    org.apache.xmlbeans.XmlQName xgetCorrelationPropertyRef();
    
    /**
     * Sets the "correlationPropertyRef" attribute
     */
    void setCorrelationPropertyRef(javax.xml.namespace.QName correlationPropertyRef);
    
    /**
     * Sets (as xml) the "correlationPropertyRef" attribute
     */
    void xsetCorrelationPropertyRef(org.apache.xmlbeans.XmlQName correlationPropertyRef);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.omg.schema.spec.bpmn.x20.TCorrelationPropertyBinding newInstance() {
          return (org.omg.schema.spec.bpmn.x20.TCorrelationPropertyBinding) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TCorrelationPropertyBinding newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.omg.schema.spec.bpmn.x20.TCorrelationPropertyBinding) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.omg.schema.spec.bpmn.x20.TCorrelationPropertyBinding parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.omg.schema.spec.bpmn.x20.TCorrelationPropertyBinding) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TCorrelationPropertyBinding parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.omg.schema.spec.bpmn.x20.TCorrelationPropertyBinding) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.omg.schema.spec.bpmn.x20.TCorrelationPropertyBinding parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TCorrelationPropertyBinding) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TCorrelationPropertyBinding parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TCorrelationPropertyBinding) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.omg.schema.spec.bpmn.x20.TCorrelationPropertyBinding parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TCorrelationPropertyBinding) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TCorrelationPropertyBinding parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TCorrelationPropertyBinding) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.omg.schema.spec.bpmn.x20.TCorrelationPropertyBinding parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TCorrelationPropertyBinding) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TCorrelationPropertyBinding parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TCorrelationPropertyBinding) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.omg.schema.spec.bpmn.x20.TCorrelationPropertyBinding parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TCorrelationPropertyBinding) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TCorrelationPropertyBinding parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TCorrelationPropertyBinding) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.omg.schema.spec.bpmn.x20.TCorrelationPropertyBinding parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.omg.schema.spec.bpmn.x20.TCorrelationPropertyBinding) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TCorrelationPropertyBinding parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.omg.schema.spec.bpmn.x20.TCorrelationPropertyBinding) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.omg.schema.spec.bpmn.x20.TCorrelationPropertyBinding parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.omg.schema.spec.bpmn.x20.TCorrelationPropertyBinding) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TCorrelationPropertyBinding parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.omg.schema.spec.bpmn.x20.TCorrelationPropertyBinding) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.omg.schema.spec.bpmn.x20.TCorrelationPropertyBinding parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.omg.schema.spec.bpmn.x20.TCorrelationPropertyBinding) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.omg.schema.spec.bpmn.x20.TCorrelationPropertyBinding parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.omg.schema.spec.bpmn.x20.TCorrelationPropertyBinding) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

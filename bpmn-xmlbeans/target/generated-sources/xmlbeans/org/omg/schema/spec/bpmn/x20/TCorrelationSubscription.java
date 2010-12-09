/*
 * XML Type:  tCorrelationSubscription
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.TCorrelationSubscription
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20;


/**
 * An XML tCorrelationSubscription(@http://schema.omg.org/spec/BPMN/2.0).
 *
 * This is a complex type.
 */
public interface TCorrelationSubscription extends org.omg.schema.spec.bpmn.x20.TBaseElement
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TCorrelationSubscription.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBC864EDE3F984128F62D75C6516B63E9").resolveHandle("tcorrelationsubscriptionf1b1type");
    
    /**
     * Gets array of all "correlationPropertyBinding" elements
     */
    org.omg.schema.spec.bpmn.x20.TCorrelationPropertyBinding[] getCorrelationPropertyBindingArray();
    
    /**
     * Gets ith "correlationPropertyBinding" element
     */
    org.omg.schema.spec.bpmn.x20.TCorrelationPropertyBinding getCorrelationPropertyBindingArray(int i);
    
    /**
     * Returns number of "correlationPropertyBinding" element
     */
    int sizeOfCorrelationPropertyBindingArray();
    
    /**
     * Sets array of all "correlationPropertyBinding" element
     */
    void setCorrelationPropertyBindingArray(org.omg.schema.spec.bpmn.x20.TCorrelationPropertyBinding[] correlationPropertyBindingArray);
    
    /**
     * Sets ith "correlationPropertyBinding" element
     */
    void setCorrelationPropertyBindingArray(int i, org.omg.schema.spec.bpmn.x20.TCorrelationPropertyBinding correlationPropertyBinding);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "correlationPropertyBinding" element
     */
    org.omg.schema.spec.bpmn.x20.TCorrelationPropertyBinding insertNewCorrelationPropertyBinding(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "correlationPropertyBinding" element
     */
    org.omg.schema.spec.bpmn.x20.TCorrelationPropertyBinding addNewCorrelationPropertyBinding();
    
    /**
     * Removes the ith "correlationPropertyBinding" element
     */
    void removeCorrelationPropertyBinding(int i);
    
    /**
     * Gets the "process" attribute
     */
    javax.xml.namespace.QName getProcess();
    
    /**
     * Gets (as xml) the "process" attribute
     */
    org.apache.xmlbeans.XmlQName xgetProcess();
    
    /**
     * Sets the "process" attribute
     */
    void setProcess(javax.xml.namespace.QName process);
    
    /**
     * Sets (as xml) the "process" attribute
     */
    void xsetProcess(org.apache.xmlbeans.XmlQName process);
    
    /**
     * Gets the "correlationKeyRef" attribute
     */
    javax.xml.namespace.QName getCorrelationKeyRef();
    
    /**
     * Gets (as xml) the "correlationKeyRef" attribute
     */
    org.apache.xmlbeans.XmlQName xgetCorrelationKeyRef();
    
    /**
     * Sets the "correlationKeyRef" attribute
     */
    void setCorrelationKeyRef(javax.xml.namespace.QName correlationKeyRef);
    
    /**
     * Sets (as xml) the "correlationKeyRef" attribute
     */
    void xsetCorrelationKeyRef(org.apache.xmlbeans.XmlQName correlationKeyRef);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.omg.schema.spec.bpmn.x20.TCorrelationSubscription newInstance() {
          return (org.omg.schema.spec.bpmn.x20.TCorrelationSubscription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TCorrelationSubscription newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.omg.schema.spec.bpmn.x20.TCorrelationSubscription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.omg.schema.spec.bpmn.x20.TCorrelationSubscription parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.omg.schema.spec.bpmn.x20.TCorrelationSubscription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TCorrelationSubscription parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.omg.schema.spec.bpmn.x20.TCorrelationSubscription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.omg.schema.spec.bpmn.x20.TCorrelationSubscription parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TCorrelationSubscription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TCorrelationSubscription parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TCorrelationSubscription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.omg.schema.spec.bpmn.x20.TCorrelationSubscription parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TCorrelationSubscription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TCorrelationSubscription parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TCorrelationSubscription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.omg.schema.spec.bpmn.x20.TCorrelationSubscription parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TCorrelationSubscription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TCorrelationSubscription parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TCorrelationSubscription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.omg.schema.spec.bpmn.x20.TCorrelationSubscription parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TCorrelationSubscription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TCorrelationSubscription parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TCorrelationSubscription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.omg.schema.spec.bpmn.x20.TCorrelationSubscription parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.omg.schema.spec.bpmn.x20.TCorrelationSubscription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TCorrelationSubscription parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.omg.schema.spec.bpmn.x20.TCorrelationSubscription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.omg.schema.spec.bpmn.x20.TCorrelationSubscription parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.omg.schema.spec.bpmn.x20.TCorrelationSubscription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TCorrelationSubscription parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.omg.schema.spec.bpmn.x20.TCorrelationSubscription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.omg.schema.spec.bpmn.x20.TCorrelationSubscription parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.omg.schema.spec.bpmn.x20.TCorrelationSubscription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.omg.schema.spec.bpmn.x20.TCorrelationSubscription parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.omg.schema.spec.bpmn.x20.TCorrelationSubscription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

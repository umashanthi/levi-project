/*
 * XML Type:  tCallableElement
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.TCallableElement
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20;


/**
 * An XML tCallableElement(@http://schema.omg.org/spec/BPMN/2.0).
 *
 * This is a complex type.
 */
public interface TCallableElement extends org.omg.schema.spec.bpmn.x20.TRootElement
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TCallableElement.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBC864EDE3F984128F62D75C6516B63E9").resolveHandle("tcallableelementbf96type");
    
    /**
     * Gets array of all "supportedInterfaceRef" elements
     */
    javax.xml.namespace.QName[] getSupportedInterfaceRefArray();
    
    /**
     * Gets ith "supportedInterfaceRef" element
     */
    javax.xml.namespace.QName getSupportedInterfaceRefArray(int i);
    
    /**
     * Gets (as xml) array of all "supportedInterfaceRef" elements
     */
    org.apache.xmlbeans.XmlQName[] xgetSupportedInterfaceRefArray();
    
    /**
     * Gets (as xml) ith "supportedInterfaceRef" element
     */
    org.apache.xmlbeans.XmlQName xgetSupportedInterfaceRefArray(int i);
    
    /**
     * Returns number of "supportedInterfaceRef" element
     */
    int sizeOfSupportedInterfaceRefArray();
    
    /**
     * Sets array of all "supportedInterfaceRef" element
     */
    void setSupportedInterfaceRefArray(javax.xml.namespace.QName[] supportedInterfaceRefArray);
    
    /**
     * Sets ith "supportedInterfaceRef" element
     */
    void setSupportedInterfaceRefArray(int i, javax.xml.namespace.QName supportedInterfaceRef);
    
    /**
     * Sets (as xml) array of all "supportedInterfaceRef" element
     */
    void xsetSupportedInterfaceRefArray(org.apache.xmlbeans.XmlQName[] supportedInterfaceRefArray);
    
    /**
     * Sets (as xml) ith "supportedInterfaceRef" element
     */
    void xsetSupportedInterfaceRefArray(int i, org.apache.xmlbeans.XmlQName supportedInterfaceRef);
    
    /**
     * Inserts the value as the ith "supportedInterfaceRef" element
     */
    void insertSupportedInterfaceRef(int i, javax.xml.namespace.QName supportedInterfaceRef);
    
    /**
     * Appends the value as the last "supportedInterfaceRef" element
     */
    void addSupportedInterfaceRef(javax.xml.namespace.QName supportedInterfaceRef);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "supportedInterfaceRef" element
     */
    org.apache.xmlbeans.XmlQName insertNewSupportedInterfaceRef(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "supportedInterfaceRef" element
     */
    org.apache.xmlbeans.XmlQName addNewSupportedInterfaceRef();
    
    /**
     * Removes the ith "supportedInterfaceRef" element
     */
    void removeSupportedInterfaceRef(int i);
    
    /**
     * Gets the "ioSpecification" element
     */
    org.omg.schema.spec.bpmn.x20.TInputOutputSpecification getIoSpecification();
    
    /**
     * True if has "ioSpecification" element
     */
    boolean isSetIoSpecification();
    
    /**
     * Sets the "ioSpecification" element
     */
    void setIoSpecification(org.omg.schema.spec.bpmn.x20.TInputOutputSpecification ioSpecification);
    
    /**
     * Appends and returns a new empty "ioSpecification" element
     */
    org.omg.schema.spec.bpmn.x20.TInputOutputSpecification addNewIoSpecification();
    
    /**
     * Unsets the "ioSpecification" element
     */
    void unsetIoSpecification();
    
    /**
     * Gets array of all "ioBinding" elements
     */
    org.omg.schema.spec.bpmn.x20.TInputOutputBinding[] getIoBindingArray();
    
    /**
     * Gets ith "ioBinding" element
     */
    org.omg.schema.spec.bpmn.x20.TInputOutputBinding getIoBindingArray(int i);
    
    /**
     * Returns number of "ioBinding" element
     */
    int sizeOfIoBindingArray();
    
    /**
     * Sets array of all "ioBinding" element
     */
    void setIoBindingArray(org.omg.schema.spec.bpmn.x20.TInputOutputBinding[] ioBindingArray);
    
    /**
     * Sets ith "ioBinding" element
     */
    void setIoBindingArray(int i, org.omg.schema.spec.bpmn.x20.TInputOutputBinding ioBinding);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ioBinding" element
     */
    org.omg.schema.spec.bpmn.x20.TInputOutputBinding insertNewIoBinding(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ioBinding" element
     */
    org.omg.schema.spec.bpmn.x20.TInputOutputBinding addNewIoBinding();
    
    /**
     * Removes the ith "ioBinding" element
     */
    void removeIoBinding(int i);
    
    /**
     * Gets the "name" attribute
     */
    java.lang.String getName();
    
    /**
     * Gets (as xml) the "name" attribute
     */
    org.apache.xmlbeans.XmlString xgetName();
    
    /**
     * True if has "name" attribute
     */
    boolean isSetName();
    
    /**
     * Sets the "name" attribute
     */
    void setName(java.lang.String name);
    
    /**
     * Sets (as xml) the "name" attribute
     */
    void xsetName(org.apache.xmlbeans.XmlString name);
    
    /**
     * Unsets the "name" attribute
     */
    void unsetName();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.omg.schema.spec.bpmn.x20.TCallableElement newInstance() {
          return (org.omg.schema.spec.bpmn.x20.TCallableElement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TCallableElement newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.omg.schema.spec.bpmn.x20.TCallableElement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.omg.schema.spec.bpmn.x20.TCallableElement parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.omg.schema.spec.bpmn.x20.TCallableElement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TCallableElement parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.omg.schema.spec.bpmn.x20.TCallableElement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.omg.schema.spec.bpmn.x20.TCallableElement parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TCallableElement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TCallableElement parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TCallableElement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.omg.schema.spec.bpmn.x20.TCallableElement parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TCallableElement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TCallableElement parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TCallableElement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.omg.schema.spec.bpmn.x20.TCallableElement parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TCallableElement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TCallableElement parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TCallableElement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.omg.schema.spec.bpmn.x20.TCallableElement parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TCallableElement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TCallableElement parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TCallableElement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.omg.schema.spec.bpmn.x20.TCallableElement parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.omg.schema.spec.bpmn.x20.TCallableElement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TCallableElement parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.omg.schema.spec.bpmn.x20.TCallableElement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.omg.schema.spec.bpmn.x20.TCallableElement parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.omg.schema.spec.bpmn.x20.TCallableElement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TCallableElement parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.omg.schema.spec.bpmn.x20.TCallableElement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.omg.schema.spec.bpmn.x20.TCallableElement parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.omg.schema.spec.bpmn.x20.TCallableElement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.omg.schema.spec.bpmn.x20.TCallableElement parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.omg.schema.spec.bpmn.x20.TCallableElement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

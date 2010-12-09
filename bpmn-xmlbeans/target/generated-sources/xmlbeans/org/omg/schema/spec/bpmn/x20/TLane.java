/*
 * XML Type:  tLane
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.TLane
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20;


/**
 * An XML tLane(@http://schema.omg.org/spec/BPMN/2.0).
 *
 * This is a complex type.
 */
public interface TLane extends org.omg.schema.spec.bpmn.x20.TBaseElement
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TLane.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBC864EDE3F984128F62D75C6516B63E9").resolveHandle("tlane93d4type");
    
    /**
     * Gets the "partitionElement" element
     */
    org.omg.schema.spec.bpmn.x20.TBaseElement getPartitionElement();
    
    /**
     * True if has "partitionElement" element
     */
    boolean isSetPartitionElement();
    
    /**
     * Sets the "partitionElement" element
     */
    void setPartitionElement(org.omg.schema.spec.bpmn.x20.TBaseElement partitionElement);
    
    /**
     * Appends and returns a new empty "partitionElement" element
     */
    org.omg.schema.spec.bpmn.x20.TBaseElement addNewPartitionElement();
    
    /**
     * Unsets the "partitionElement" element
     */
    void unsetPartitionElement();
    
    /**
     * Gets array of all "flowElementRef" elements
     */
    java.lang.String[] getFlowElementRefArray();
    
    /**
     * Gets ith "flowElementRef" element
     */
    java.lang.String getFlowElementRefArray(int i);
    
    /**
     * Gets (as xml) array of all "flowElementRef" elements
     */
    org.apache.xmlbeans.XmlIDREF[] xgetFlowElementRefArray();
    
    /**
     * Gets (as xml) ith "flowElementRef" element
     */
    org.apache.xmlbeans.XmlIDREF xgetFlowElementRefArray(int i);
    
    /**
     * Returns number of "flowElementRef" element
     */
    int sizeOfFlowElementRefArray();
    
    /**
     * Sets array of all "flowElementRef" element
     */
    void setFlowElementRefArray(java.lang.String[] flowElementRefArray);
    
    /**
     * Sets ith "flowElementRef" element
     */
    void setFlowElementRefArray(int i, java.lang.String flowElementRef);
    
    /**
     * Sets (as xml) array of all "flowElementRef" element
     */
    void xsetFlowElementRefArray(org.apache.xmlbeans.XmlIDREF[] flowElementRefArray);
    
    /**
     * Sets (as xml) ith "flowElementRef" element
     */
    void xsetFlowElementRefArray(int i, org.apache.xmlbeans.XmlIDREF flowElementRef);
    
    /**
     * Inserts the value as the ith "flowElementRef" element
     */
    void insertFlowElementRef(int i, java.lang.String flowElementRef);
    
    /**
     * Appends the value as the last "flowElementRef" element
     */
    void addFlowElementRef(java.lang.String flowElementRef);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "flowElementRef" element
     */
    org.apache.xmlbeans.XmlIDREF insertNewFlowElementRef(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "flowElementRef" element
     */
    org.apache.xmlbeans.XmlIDREF addNewFlowElementRef();
    
    /**
     * Removes the ith "flowElementRef" element
     */
    void removeFlowElementRef(int i);
    
    /**
     * Gets the "childLaneSet" element
     */
    org.omg.schema.spec.bpmn.x20.TLaneSet getChildLaneSet();
    
    /**
     * True if has "childLaneSet" element
     */
    boolean isSetChildLaneSet();
    
    /**
     * Sets the "childLaneSet" element
     */
    void setChildLaneSet(org.omg.schema.spec.bpmn.x20.TLaneSet childLaneSet);
    
    /**
     * Appends and returns a new empty "childLaneSet" element
     */
    org.omg.schema.spec.bpmn.x20.TLaneSet addNewChildLaneSet();
    
    /**
     * Unsets the "childLaneSet" element
     */
    void unsetChildLaneSet();
    
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
     * Gets the "partitionElementRef" attribute
     */
    java.lang.String getPartitionElementRef();
    
    /**
     * Gets (as xml) the "partitionElementRef" attribute
     */
    org.apache.xmlbeans.XmlIDREF xgetPartitionElementRef();
    
    /**
     * True if has "partitionElementRef" attribute
     */
    boolean isSetPartitionElementRef();
    
    /**
     * Sets the "partitionElementRef" attribute
     */
    void setPartitionElementRef(java.lang.String partitionElementRef);
    
    /**
     * Sets (as xml) the "partitionElementRef" attribute
     */
    void xsetPartitionElementRef(org.apache.xmlbeans.XmlIDREF partitionElementRef);
    
    /**
     * Unsets the "partitionElementRef" attribute
     */
    void unsetPartitionElementRef();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.omg.schema.spec.bpmn.x20.TLane newInstance() {
          return (org.omg.schema.spec.bpmn.x20.TLane) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TLane newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.omg.schema.spec.bpmn.x20.TLane) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.omg.schema.spec.bpmn.x20.TLane parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.omg.schema.spec.bpmn.x20.TLane) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TLane parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.omg.schema.spec.bpmn.x20.TLane) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.omg.schema.spec.bpmn.x20.TLane parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TLane) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TLane parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TLane) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.omg.schema.spec.bpmn.x20.TLane parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TLane) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TLane parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TLane) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.omg.schema.spec.bpmn.x20.TLane parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TLane) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TLane parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TLane) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.omg.schema.spec.bpmn.x20.TLane parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TLane) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TLane parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TLane) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.omg.schema.spec.bpmn.x20.TLane parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.omg.schema.spec.bpmn.x20.TLane) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TLane parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.omg.schema.spec.bpmn.x20.TLane) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.omg.schema.spec.bpmn.x20.TLane parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.omg.schema.spec.bpmn.x20.TLane) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TLane parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.omg.schema.spec.bpmn.x20.TLane) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.omg.schema.spec.bpmn.x20.TLane parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.omg.schema.spec.bpmn.x20.TLane) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.omg.schema.spec.bpmn.x20.TLane parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.omg.schema.spec.bpmn.x20.TLane) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

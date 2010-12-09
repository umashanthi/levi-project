/*
 * XML Type:  View
 * Namespace: http://www.omg.com/di/1.0.0
 * Java type: com.omg.di.x100.View
 *
 * Automatically generated - do not modify.
 */
package com.omg.di.x100;


/**
 * An XML View(@http://www.omg.com/di/1.0.0).
 *
 * This is a complex type.
 */
public interface View extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(View.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBC864EDE3F984128F62D75C6516B63E9").resolveHandle("view00f5type");
    
    /**
     * Gets array of all "style" elements
     */
    com.omg.di.x100.Style[] getStyleArray();
    
    /**
     * Gets ith "style" element
     */
    com.omg.di.x100.Style getStyleArray(int i);
    
    /**
     * Returns number of "style" element
     */
    int sizeOfStyleArray();
    
    /**
     * Sets array of all "style" element
     */
    void setStyleArray(com.omg.di.x100.Style[] styleArray);
    
    /**
     * Sets ith "style" element
     */
    void setStyleArray(int i, com.omg.di.x100.Style style);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "style" element
     */
    com.omg.di.x100.Style insertNewStyle(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "style" element
     */
    com.omg.di.x100.Style addNewStyle();
    
    /**
     * Removes the ith "style" element
     */
    void removeStyle(int i);
    
    /**
     * Gets array of all "child" elements
     */
    com.omg.di.x100.Node[] getChildArray();
    
    /**
     * Gets ith "child" element
     */
    com.omg.di.x100.Node getChildArray(int i);
    
    /**
     * Returns number of "child" element
     */
    int sizeOfChildArray();
    
    /**
     * Sets array of all "child" element
     */
    void setChildArray(com.omg.di.x100.Node[] childArray);
    
    /**
     * Sets ith "child" element
     */
    void setChildArray(int i, com.omg.di.x100.Node child);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "child" element
     */
    com.omg.di.x100.Node insertNewChild(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "child" element
     */
    com.omg.di.x100.Node addNewChild();
    
    /**
     * Removes the ith "child" element
     */
    void removeChild(int i);
    
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
     * Gets the "context" attribute
     */
    java.lang.String getContext();
    
    /**
     * Gets (as xml) the "context" attribute
     */
    org.apache.xmlbeans.XmlAnyURI xgetContext();
    
    /**
     * True if has "context" attribute
     */
    boolean isSetContext();
    
    /**
     * Sets the "context" attribute
     */
    void setContext(java.lang.String context);
    
    /**
     * Sets (as xml) the "context" attribute
     */
    void xsetContext(org.apache.xmlbeans.XmlAnyURI context);
    
    /**
     * Unsets the "context" attribute
     */
    void unsetContext();
    
    /**
     * Gets the "definition" attribute
     */
    java.util.List getDefinition();
    
    /**
     * Gets (as xml) the "definition" attribute
     */
    com.omg.di.x100.View.Definition xgetDefinition();
    
    /**
     * Sets the "definition" attribute
     */
    void setDefinition(java.util.List definition);
    
    /**
     * Sets (as xml) the "definition" attribute
     */
    void xsetDefinition(com.omg.di.x100.View.Definition definition);
    
    /**
     * Gets the "targetConnector" attribute
     */
    java.util.List getTargetConnector();
    
    /**
     * Gets (as xml) the "targetConnector" attribute
     */
    com.omg.di.x100.View.TargetConnector xgetTargetConnector();
    
    /**
     * True if has "targetConnector" attribute
     */
    boolean isSetTargetConnector();
    
    /**
     * Sets the "targetConnector" attribute
     */
    void setTargetConnector(java.util.List targetConnector);
    
    /**
     * Sets (as xml) the "targetConnector" attribute
     */
    void xsetTargetConnector(com.omg.di.x100.View.TargetConnector targetConnector);
    
    /**
     * Unsets the "targetConnector" attribute
     */
    void unsetTargetConnector();
    
    /**
     * Gets the "sourceConnector" attribute
     */
    java.util.List getSourceConnector();
    
    /**
     * Gets (as xml) the "sourceConnector" attribute
     */
    com.omg.di.x100.View.SourceConnector xgetSourceConnector();
    
    /**
     * True if has "sourceConnector" attribute
     */
    boolean isSetSourceConnector();
    
    /**
     * Sets the "sourceConnector" attribute
     */
    void setSourceConnector(java.util.List sourceConnector);
    
    /**
     * Sets (as xml) the "sourceConnector" attribute
     */
    void xsetSourceConnector(com.omg.di.x100.View.SourceConnector sourceConnector);
    
    /**
     * Unsets the "sourceConnector" attribute
     */
    void unsetSourceConnector();
    
    /**
     * An XML definition(@).
     *
     * This is a list type whose items are org.apache.xmlbeans.XmlQName.
     */
    public interface Definition extends org.apache.xmlbeans.XmlAnySimpleType
    {
        java.util.List getListValue();
        java.util.List xgetListValue();
        void setListValue(java.util.List list);
        /** @deprecated */
        java.util.List listValue();
        /** @deprecated */
        java.util.List xlistValue();
        /** @deprecated */
        void set(java.util.List list);
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Definition.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBC864EDE3F984128F62D75C6516B63E9").resolveHandle("definition49a2attrtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.omg.di.x100.View.Definition newValue(java.lang.Object obj) {
              return (com.omg.di.x100.View.Definition) type.newValue( obj ); }
            
            public static com.omg.di.x100.View.Definition newInstance() {
              return (com.omg.di.x100.View.Definition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.omg.di.x100.View.Definition newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.omg.di.x100.View.Definition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML targetConnector(@).
     *
     * This is a list type whose items are org.apache.xmlbeans.XmlAnyURI.
     */
    public interface TargetConnector extends org.apache.xmlbeans.XmlAnySimpleType
    {
        java.util.List getListValue();
        java.util.List xgetListValue();
        void setListValue(java.util.List list);
        /** @deprecated */
        java.util.List listValue();
        /** @deprecated */
        java.util.List xlistValue();
        /** @deprecated */
        void set(java.util.List list);
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TargetConnector.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBC864EDE3F984128F62D75C6516B63E9").resolveHandle("targetconnector9c51attrtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.omg.di.x100.View.TargetConnector newValue(java.lang.Object obj) {
              return (com.omg.di.x100.View.TargetConnector) type.newValue( obj ); }
            
            public static com.omg.di.x100.View.TargetConnector newInstance() {
              return (com.omg.di.x100.View.TargetConnector) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.omg.di.x100.View.TargetConnector newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.omg.di.x100.View.TargetConnector) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML sourceConnector(@).
     *
     * This is a list type whose items are org.apache.xmlbeans.XmlAnyURI.
     */
    public interface SourceConnector extends org.apache.xmlbeans.XmlAnySimpleType
    {
        java.util.List getListValue();
        java.util.List xgetListValue();
        void setListValue(java.util.List list);
        /** @deprecated */
        java.util.List listValue();
        /** @deprecated */
        java.util.List xlistValue();
        /** @deprecated */
        void set(java.util.List list);
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SourceConnector.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBC864EDE3F984128F62D75C6516B63E9").resolveHandle("sourceconnector6bdbattrtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.omg.di.x100.View.SourceConnector newValue(java.lang.Object obj) {
              return (com.omg.di.x100.View.SourceConnector) type.newValue( obj ); }
            
            public static com.omg.di.x100.View.SourceConnector newInstance() {
              return (com.omg.di.x100.View.SourceConnector) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.omg.di.x100.View.SourceConnector newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.omg.di.x100.View.SourceConnector) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        /** @deprecated No need to be able to create instances of abstract types */
        public static com.omg.di.x100.View newInstance() {
          return (com.omg.di.x100.View) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        /** @deprecated No need to be able to create instances of abstract types */
        public static com.omg.di.x100.View newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.omg.di.x100.View) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.omg.di.x100.View parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.omg.di.x100.View) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.omg.di.x100.View parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.omg.di.x100.View) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.omg.di.x100.View parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.omg.di.x100.View) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.omg.di.x100.View parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.omg.di.x100.View) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.omg.di.x100.View parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.omg.di.x100.View) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.omg.di.x100.View parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.omg.di.x100.View) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.omg.di.x100.View parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.omg.di.x100.View) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.omg.di.x100.View parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.omg.di.x100.View) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.omg.di.x100.View parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.omg.di.x100.View) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.omg.di.x100.View parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.omg.di.x100.View) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.omg.di.x100.View parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.omg.di.x100.View) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.omg.di.x100.View parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.omg.di.x100.View) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.omg.di.x100.View parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.omg.di.x100.View) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.omg.di.x100.View parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.omg.di.x100.View) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.omg.di.x100.View parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.omg.di.x100.View) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.omg.di.x100.View parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.omg.di.x100.View) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

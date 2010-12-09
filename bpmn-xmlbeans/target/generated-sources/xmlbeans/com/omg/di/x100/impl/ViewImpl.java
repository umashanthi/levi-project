/*
 * XML Type:  View
 * Namespace: http://www.omg.com/di/1.0.0
 * Java type: com.omg.di.x100.View
 *
 * Automatically generated - do not modify.
 */
package com.omg.di.x100.impl;
/**
 * An XML View(@http://www.omg.com/di/1.0.0).
 *
 * This is a complex type.
 */
public class ViewImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.omg.di.x100.View
{
    private static final long serialVersionUID = 1L;
    
    public ViewImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STYLE$0 = 
        new javax.xml.namespace.QName("http://www.omg.com/di/1.0.0", "style");
    private static final javax.xml.namespace.QName CHILD$2 = 
        new javax.xml.namespace.QName("http://www.omg.com/di/1.0.0", "child");
    private static final javax.xml.namespace.QName ID$4 = 
        new javax.xml.namespace.QName("", "id");
    private static final javax.xml.namespace.QName CONTEXT$6 = 
        new javax.xml.namespace.QName("", "context");
    private static final javax.xml.namespace.QName DEFINITION$8 = 
        new javax.xml.namespace.QName("", "definition");
    private static final javax.xml.namespace.QName TARGETCONNECTOR$10 = 
        new javax.xml.namespace.QName("", "targetConnector");
    private static final javax.xml.namespace.QName SOURCECONNECTOR$12 = 
        new javax.xml.namespace.QName("", "sourceConnector");
    
    
    /**
     * Gets array of all "style" elements
     */
    public com.omg.di.x100.Style[] getStyleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(STYLE$0, targetList);
            com.omg.di.x100.Style[] result = new com.omg.di.x100.Style[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "style" element
     */
    public com.omg.di.x100.Style getStyleArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.omg.di.x100.Style target = null;
            target = (com.omg.di.x100.Style)get_store().find_element_user(STYLE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "style" element
     */
    public int sizeOfStyleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STYLE$0);
        }
    }
    
    /**
     * Sets array of all "style" element
     */
    public void setStyleArray(com.omg.di.x100.Style[] styleArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(styleArray, STYLE$0);
        }
    }
    
    /**
     * Sets ith "style" element
     */
    public void setStyleArray(int i, com.omg.di.x100.Style style)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.omg.di.x100.Style target = null;
            target = (com.omg.di.x100.Style)get_store().find_element_user(STYLE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(style);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "style" element
     */
    public com.omg.di.x100.Style insertNewStyle(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.omg.di.x100.Style target = null;
            target = (com.omg.di.x100.Style)get_store().insert_element_user(STYLE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "style" element
     */
    public com.omg.di.x100.Style addNewStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.omg.di.x100.Style target = null;
            target = (com.omg.di.x100.Style)get_store().add_element_user(STYLE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "style" element
     */
    public void removeStyle(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STYLE$0, i);
        }
    }
    
    /**
     * Gets array of all "child" elements
     */
    public com.omg.di.x100.Node[] getChildArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CHILD$2, targetList);
            com.omg.di.x100.Node[] result = new com.omg.di.x100.Node[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "child" element
     */
    public com.omg.di.x100.Node getChildArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.omg.di.x100.Node target = null;
            target = (com.omg.di.x100.Node)get_store().find_element_user(CHILD$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "child" element
     */
    public int sizeOfChildArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CHILD$2);
        }
    }
    
    /**
     * Sets array of all "child" element
     */
    public void setChildArray(com.omg.di.x100.Node[] childArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(childArray, CHILD$2);
        }
    }
    
    /**
     * Sets ith "child" element
     */
    public void setChildArray(int i, com.omg.di.x100.Node child)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.omg.di.x100.Node target = null;
            target = (com.omg.di.x100.Node)get_store().find_element_user(CHILD$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(child);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "child" element
     */
    public com.omg.di.x100.Node insertNewChild(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.omg.di.x100.Node target = null;
            target = (com.omg.di.x100.Node)get_store().insert_element_user(CHILD$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "child" element
     */
    public com.omg.di.x100.Node addNewChild()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.omg.di.x100.Node target = null;
            target = (com.omg.di.x100.Node)get_store().add_element_user(CHILD$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "child" element
     */
    public void removeChild(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CHILD$2, i);
        }
    }
    
    /**
     * Gets the "id" attribute
     */
    public java.lang.String getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "id" attribute
     */
    public org.apache.xmlbeans.XmlNCName xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNCName target = null;
            target = (org.apache.xmlbeans.XmlNCName)get_store().find_attribute_user(ID$4);
            return target;
        }
    }
    
    /**
     * Sets the "id" attribute
     */
    public void setId(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$4);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "id" attribute
     */
    public void xsetId(org.apache.xmlbeans.XmlNCName id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNCName target = null;
            target = (org.apache.xmlbeans.XmlNCName)get_store().find_attribute_user(ID$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNCName)get_store().add_attribute_user(ID$4);
            }
            target.set(id);
        }
    }
    
    /**
     * Gets the "context" attribute
     */
    public java.lang.String getContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONTEXT$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "context" attribute
     */
    public org.apache.xmlbeans.XmlAnyURI xgetContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(CONTEXT$6);
            return target;
        }
    }
    
    /**
     * True if has "context" attribute
     */
    public boolean isSetContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CONTEXT$6) != null;
        }
    }
    
    /**
     * Sets the "context" attribute
     */
    public void setContext(java.lang.String context)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONTEXT$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONTEXT$6);
            }
            target.setStringValue(context);
        }
    }
    
    /**
     * Sets (as xml) the "context" attribute
     */
    public void xsetContext(org.apache.xmlbeans.XmlAnyURI context)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(CONTEXT$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(CONTEXT$6);
            }
            target.set(context);
        }
    }
    
    /**
     * Unsets the "context" attribute
     */
    public void unsetContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CONTEXT$6);
        }
    }
    
    /**
     * Gets the "definition" attribute
     */
    public java.util.List getDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFINITION$8);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "definition" attribute
     */
    public com.omg.di.x100.View.Definition xgetDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.omg.di.x100.View.Definition target = null;
            target = (com.omg.di.x100.View.Definition)get_store().find_attribute_user(DEFINITION$8);
            return target;
        }
    }
    
    /**
     * Sets the "definition" attribute
     */
    public void setDefinition(java.util.List definition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFINITION$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEFINITION$8);
            }
            target.setListValue(definition);
        }
    }
    
    /**
     * Sets (as xml) the "definition" attribute
     */
    public void xsetDefinition(com.omg.di.x100.View.Definition definition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.omg.di.x100.View.Definition target = null;
            target = (com.omg.di.x100.View.Definition)get_store().find_attribute_user(DEFINITION$8);
            if (target == null)
            {
                target = (com.omg.di.x100.View.Definition)get_store().add_attribute_user(DEFINITION$8);
            }
            target.set(definition);
        }
    }
    
    /**
     * Gets the "targetConnector" attribute
     */
    public java.util.List getTargetConnector()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TARGETCONNECTOR$10);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "targetConnector" attribute
     */
    public com.omg.di.x100.View.TargetConnector xgetTargetConnector()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.omg.di.x100.View.TargetConnector target = null;
            target = (com.omg.di.x100.View.TargetConnector)get_store().find_attribute_user(TARGETCONNECTOR$10);
            return target;
        }
    }
    
    /**
     * True if has "targetConnector" attribute
     */
    public boolean isSetTargetConnector()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TARGETCONNECTOR$10) != null;
        }
    }
    
    /**
     * Sets the "targetConnector" attribute
     */
    public void setTargetConnector(java.util.List targetConnector)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TARGETCONNECTOR$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TARGETCONNECTOR$10);
            }
            target.setListValue(targetConnector);
        }
    }
    
    /**
     * Sets (as xml) the "targetConnector" attribute
     */
    public void xsetTargetConnector(com.omg.di.x100.View.TargetConnector targetConnector)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.omg.di.x100.View.TargetConnector target = null;
            target = (com.omg.di.x100.View.TargetConnector)get_store().find_attribute_user(TARGETCONNECTOR$10);
            if (target == null)
            {
                target = (com.omg.di.x100.View.TargetConnector)get_store().add_attribute_user(TARGETCONNECTOR$10);
            }
            target.set(targetConnector);
        }
    }
    
    /**
     * Unsets the "targetConnector" attribute
     */
    public void unsetTargetConnector()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TARGETCONNECTOR$10);
        }
    }
    
    /**
     * Gets the "sourceConnector" attribute
     */
    public java.util.List getSourceConnector()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOURCECONNECTOR$12);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "sourceConnector" attribute
     */
    public com.omg.di.x100.View.SourceConnector xgetSourceConnector()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.omg.di.x100.View.SourceConnector target = null;
            target = (com.omg.di.x100.View.SourceConnector)get_store().find_attribute_user(SOURCECONNECTOR$12);
            return target;
        }
    }
    
    /**
     * True if has "sourceConnector" attribute
     */
    public boolean isSetSourceConnector()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SOURCECONNECTOR$12) != null;
        }
    }
    
    /**
     * Sets the "sourceConnector" attribute
     */
    public void setSourceConnector(java.util.List sourceConnector)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOURCECONNECTOR$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SOURCECONNECTOR$12);
            }
            target.setListValue(sourceConnector);
        }
    }
    
    /**
     * Sets (as xml) the "sourceConnector" attribute
     */
    public void xsetSourceConnector(com.omg.di.x100.View.SourceConnector sourceConnector)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.omg.di.x100.View.SourceConnector target = null;
            target = (com.omg.di.x100.View.SourceConnector)get_store().find_attribute_user(SOURCECONNECTOR$12);
            if (target == null)
            {
                target = (com.omg.di.x100.View.SourceConnector)get_store().add_attribute_user(SOURCECONNECTOR$12);
            }
            target.set(sourceConnector);
        }
    }
    
    /**
     * Unsets the "sourceConnector" attribute
     */
    public void unsetSourceConnector()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SOURCECONNECTOR$12);
        }
    }
    /**
     * An XML definition(@).
     *
     * This is a list type whose items are org.apache.xmlbeans.XmlQName.
     */
    public static class DefinitionImpl extends org.apache.xmlbeans.impl.values.XmlListImpl implements com.omg.di.x100.View.Definition
    {
        private static final long serialVersionUID = 1L;
        
        public DefinitionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected DefinitionImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML targetConnector(@).
     *
     * This is a list type whose items are org.apache.xmlbeans.XmlAnyURI.
     */
    public static class TargetConnectorImpl extends org.apache.xmlbeans.impl.values.XmlListImpl implements com.omg.di.x100.View.TargetConnector
    {
        private static final long serialVersionUID = 1L;
        
        public TargetConnectorImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected TargetConnectorImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML sourceConnector(@).
     *
     * This is a list type whose items are org.apache.xmlbeans.XmlAnyURI.
     */
    public static class SourceConnectorImpl extends org.apache.xmlbeans.impl.values.XmlListImpl implements com.omg.di.x100.View.SourceConnector
    {
        private static final long serialVersionUID = 1L;
        
        public SourceConnectorImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected SourceConnectorImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}

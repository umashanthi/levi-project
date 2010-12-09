/*
 * XML Type:  Package
 * Namespace: http://www.omg.com/dd/1.0.0
 * Java type: com.omg.dd.x100.Package
 *
 * Automatically generated - do not modify.
 */
package com.omg.dd.x100.impl;
/**
 * An XML Package(@http://www.omg.com/dd/1.0.0).
 *
 * This is a complex type.
 */
public class PackageImpl extends com.omg.dd.x100.impl.NamedElementImpl implements com.omg.dd.x100.Package
{
    private static final long serialVersionUID = 1L;
    
    public PackageImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VIEWDEFINITION$0 = 
        new javax.xml.namespace.QName("http://www.omg.com/dd/1.0.0", "viewDefinition");
    private static final org.apache.xmlbeans.QNameSet VIEWDEFINITION$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.omg.com/dd/1.0.0", "nodeDefinition"),
        new javax.xml.namespace.QName("http://www.omg.com/dd/1.0.0", "connectorDefinition"),
        new javax.xml.namespace.QName("http://www.omg.com/dd/1.0.0", "viewDefinition"),
        new javax.xml.namespace.QName("http://www.omg.com/dd/1.0.0", "diagramDefinition"),
    });
    private static final javax.xml.namespace.QName NSURI$2 = 
        new javax.xml.namespace.QName("", "nsURI");
    private static final javax.xml.namespace.QName NSPREFIX$4 = 
        new javax.xml.namespace.QName("", "nsPrefix");
    
    
    /**
     * Gets array of all "viewDefinition" elements
     */
    public com.omg.dd.x100.ViewDefinition[] getViewDefinitionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(VIEWDEFINITION$1, targetList);
            com.omg.dd.x100.ViewDefinition[] result = new com.omg.dd.x100.ViewDefinition[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "viewDefinition" element
     */
    public com.omg.dd.x100.ViewDefinition getViewDefinitionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.omg.dd.x100.ViewDefinition target = null;
            target = (com.omg.dd.x100.ViewDefinition)get_store().find_element_user(VIEWDEFINITION$1, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "viewDefinition" element
     */
    public int sizeOfViewDefinitionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VIEWDEFINITION$1);
        }
    }
    
    /**
     * Sets array of all "viewDefinition" element
     */
    public void setViewDefinitionArray(com.omg.dd.x100.ViewDefinition[] viewDefinitionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(viewDefinitionArray, VIEWDEFINITION$0, VIEWDEFINITION$1);
        }
    }
    
    /**
     * Sets ith "viewDefinition" element
     */
    public void setViewDefinitionArray(int i, com.omg.dd.x100.ViewDefinition viewDefinition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.omg.dd.x100.ViewDefinition target = null;
            target = (com.omg.dd.x100.ViewDefinition)get_store().find_element_user(VIEWDEFINITION$1, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(viewDefinition);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "viewDefinition" element
     */
    public com.omg.dd.x100.ViewDefinition insertNewViewDefinition(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.omg.dd.x100.ViewDefinition target = null;
            target = (com.omg.dd.x100.ViewDefinition)get_store().insert_element_user(VIEWDEFINITION$1, VIEWDEFINITION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "viewDefinition" element
     */
    public com.omg.dd.x100.ViewDefinition addNewViewDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.omg.dd.x100.ViewDefinition target = null;
            target = (com.omg.dd.x100.ViewDefinition)get_store().add_element_user(VIEWDEFINITION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "viewDefinition" element
     */
    public void removeViewDefinition(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VIEWDEFINITION$1, i);
        }
    }
    
    /**
     * Gets the "nsURI" attribute
     */
    public java.lang.String getNsURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NSURI$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "nsURI" attribute
     */
    public org.apache.xmlbeans.XmlAnyURI xgetNsURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(NSURI$2);
            return target;
        }
    }
    
    /**
     * Sets the "nsURI" attribute
     */
    public void setNsURI(java.lang.String nsURI)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NSURI$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NSURI$2);
            }
            target.setStringValue(nsURI);
        }
    }
    
    /**
     * Sets (as xml) the "nsURI" attribute
     */
    public void xsetNsURI(org.apache.xmlbeans.XmlAnyURI nsURI)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(NSURI$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(NSURI$2);
            }
            target.set(nsURI);
        }
    }
    
    /**
     * Gets the "nsPrefix" attribute
     */
    public java.lang.String getNsPrefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NSPREFIX$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "nsPrefix" attribute
     */
    public org.apache.xmlbeans.XmlNCName xgetNsPrefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNCName target = null;
            target = (org.apache.xmlbeans.XmlNCName)get_store().find_attribute_user(NSPREFIX$4);
            return target;
        }
    }
    
    /**
     * Sets the "nsPrefix" attribute
     */
    public void setNsPrefix(java.lang.String nsPrefix)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NSPREFIX$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NSPREFIX$4);
            }
            target.setStringValue(nsPrefix);
        }
    }
    
    /**
     * Sets (as xml) the "nsPrefix" attribute
     */
    public void xsetNsPrefix(org.apache.xmlbeans.XmlNCName nsPrefix)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNCName target = null;
            target = (org.apache.xmlbeans.XmlNCName)get_store().find_attribute_user(NSPREFIX$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNCName)get_store().add_attribute_user(NSPREFIX$4);
            }
            target.set(nsPrefix);
        }
    }
}

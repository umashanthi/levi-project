/*
 * XML Type:  Connector
 * Namespace: http://www.omg.com/di/1.0.0
 * Java type: com.omg.di.x100.Connector
 *
 * Automatically generated - do not modify.
 */
package com.omg.di.x100.impl;
/**
 * An XML Connector(@http://www.omg.com/di/1.0.0).
 *
 * This is a complex type.
 */
public class ConnectorImpl extends com.omg.di.x100.impl.ViewImpl implements com.omg.di.x100.Connector
{
    private static final long serialVersionUID = 1L;
    
    public ConnectorImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BENDPOINT$0 = 
        new javax.xml.namespace.QName("http://www.omg.com/di/1.0.0", "bendpoint");
    private static final javax.xml.namespace.QName SOURCE$2 = 
        new javax.xml.namespace.QName("", "source");
    private static final javax.xml.namespace.QName TARGET$4 = 
        new javax.xml.namespace.QName("", "target");
    
    
    /**
     * Gets array of all "bendpoint" elements
     */
    public com.omg.di.x100.Bendpoint[] getBendpointArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BENDPOINT$0, targetList);
            com.omg.di.x100.Bendpoint[] result = new com.omg.di.x100.Bendpoint[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "bendpoint" element
     */
    public com.omg.di.x100.Bendpoint getBendpointArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.omg.di.x100.Bendpoint target = null;
            target = (com.omg.di.x100.Bendpoint)get_store().find_element_user(BENDPOINT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "bendpoint" element
     */
    public int sizeOfBendpointArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BENDPOINT$0);
        }
    }
    
    /**
     * Sets array of all "bendpoint" element
     */
    public void setBendpointArray(com.omg.di.x100.Bendpoint[] bendpointArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(bendpointArray, BENDPOINT$0);
        }
    }
    
    /**
     * Sets ith "bendpoint" element
     */
    public void setBendpointArray(int i, com.omg.di.x100.Bendpoint bendpoint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.omg.di.x100.Bendpoint target = null;
            target = (com.omg.di.x100.Bendpoint)get_store().find_element_user(BENDPOINT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(bendpoint);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "bendpoint" element
     */
    public com.omg.di.x100.Bendpoint insertNewBendpoint(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.omg.di.x100.Bendpoint target = null;
            target = (com.omg.di.x100.Bendpoint)get_store().insert_element_user(BENDPOINT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "bendpoint" element
     */
    public com.omg.di.x100.Bendpoint addNewBendpoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.omg.di.x100.Bendpoint target = null;
            target = (com.omg.di.x100.Bendpoint)get_store().add_element_user(BENDPOINT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "bendpoint" element
     */
    public void removeBendpoint(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BENDPOINT$0, i);
        }
    }
    
    /**
     * Gets the "source" attribute
     */
    public java.lang.String getSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOURCE$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "source" attribute
     */
    public org.apache.xmlbeans.XmlAnyURI xgetSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(SOURCE$2);
            return target;
        }
    }
    
    /**
     * Sets the "source" attribute
     */
    public void setSource(java.lang.String source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOURCE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SOURCE$2);
            }
            target.setStringValue(source);
        }
    }
    
    /**
     * Sets (as xml) the "source" attribute
     */
    public void xsetSource(org.apache.xmlbeans.XmlAnyURI source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(SOURCE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(SOURCE$2);
            }
            target.set(source);
        }
    }
    
    /**
     * Gets the "target" attribute
     */
    public java.lang.String getTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TARGET$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "target" attribute
     */
    public org.apache.xmlbeans.XmlAnyURI xgetTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(TARGET$4);
            return target;
        }
    }
    
    /**
     * Sets the "target" attribute
     */
    public void setTarget(java.lang.String targetValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TARGET$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TARGET$4);
            }
            target.setStringValue(targetValue);
        }
    }
    
    /**
     * Sets (as xml) the "target" attribute
     */
    public void xsetTarget(org.apache.xmlbeans.XmlAnyURI targetValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(TARGET$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(TARGET$4);
            }
            target.set(targetValue);
        }
    }
}

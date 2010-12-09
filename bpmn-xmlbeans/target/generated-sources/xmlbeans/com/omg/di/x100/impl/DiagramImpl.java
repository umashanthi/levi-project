/*
 * XML Type:  Diagram
 * Namespace: http://www.omg.com/di/1.0.0
 * Java type: com.omg.di.x100.Diagram
 *
 * Automatically generated - do not modify.
 */
package com.omg.di.x100.impl;
/**
 * An XML Diagram(@http://www.omg.com/di/1.0.0).
 *
 * This is a complex type.
 */
public class DiagramImpl extends com.omg.di.x100.impl.ViewImpl implements com.omg.di.x100.Diagram
{
    private static final long serialVersionUID = 1L;
    
    public DiagramImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONNECTOR$0 = 
        new javax.xml.namespace.QName("http://www.omg.com/di/1.0.0", "connector");
    
    
    /**
     * Gets array of all "connector" elements
     */
    public com.omg.di.x100.Connector[] getConnectorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONNECTOR$0, targetList);
            com.omg.di.x100.Connector[] result = new com.omg.di.x100.Connector[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "connector" element
     */
    public com.omg.di.x100.Connector getConnectorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.omg.di.x100.Connector target = null;
            target = (com.omg.di.x100.Connector)get_store().find_element_user(CONNECTOR$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "connector" element
     */
    public int sizeOfConnectorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONNECTOR$0);
        }
    }
    
    /**
     * Sets array of all "connector" element
     */
    public void setConnectorArray(com.omg.di.x100.Connector[] connectorArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(connectorArray, CONNECTOR$0);
        }
    }
    
    /**
     * Sets ith "connector" element
     */
    public void setConnectorArray(int i, com.omg.di.x100.Connector connector)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.omg.di.x100.Connector target = null;
            target = (com.omg.di.x100.Connector)get_store().find_element_user(CONNECTOR$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(connector);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "connector" element
     */
    public com.omg.di.x100.Connector insertNewConnector(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.omg.di.x100.Connector target = null;
            target = (com.omg.di.x100.Connector)get_store().insert_element_user(CONNECTOR$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "connector" element
     */
    public com.omg.di.x100.Connector addNewConnector()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.omg.di.x100.Connector target = null;
            target = (com.omg.di.x100.Connector)get_store().add_element_user(CONNECTOR$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "connector" element
     */
    public void removeConnector(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONNECTOR$0, i);
        }
    }
}

/*
 * An XML document type.
 * Localname: connector
 * Namespace: http://www.omg.com/di/1.0.0
 * Java type: com.omg.di.x100.ConnectorDocument
 *
 * Automatically generated - do not modify.
 */
package com.omg.di.x100.impl;
/**
 * A document containing one connector(@http://www.omg.com/di/1.0.0) element.
 *
 * This is a complex type.
 */
public class ConnectorDocumentImpl extends com.omg.di.x100.impl.ViewDocumentImpl implements com.omg.di.x100.ConnectorDocument
{
    private static final long serialVersionUID = 1L;
    
    public ConnectorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONNECTOR$0 = 
        new javax.xml.namespace.QName("http://www.omg.com/di/1.0.0", "connector");
    
    
    /**
     * Gets the "connector" element
     */
    public com.omg.di.x100.Connector getConnector()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.omg.di.x100.Connector target = null;
            target = (com.omg.di.x100.Connector)get_store().find_element_user(CONNECTOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "connector" element
     */
    public void setConnector(com.omg.di.x100.Connector connector)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.omg.di.x100.Connector target = null;
            target = (com.omg.di.x100.Connector)get_store().find_element_user(CONNECTOR$0, 0);
            if (target == null)
            {
                target = (com.omg.di.x100.Connector)get_store().add_element_user(CONNECTOR$0);
            }
            target.set(connector);
        }
    }
    
    /**
     * Appends and returns a new empty "connector" element
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
}

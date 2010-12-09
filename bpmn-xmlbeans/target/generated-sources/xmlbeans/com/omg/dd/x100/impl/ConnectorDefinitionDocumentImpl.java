/*
 * An XML document type.
 * Localname: connectorDefinition
 * Namespace: http://www.omg.com/dd/1.0.0
 * Java type: com.omg.dd.x100.ConnectorDefinitionDocument
 *
 * Automatically generated - do not modify.
 */
package com.omg.dd.x100.impl;
/**
 * A document containing one connectorDefinition(@http://www.omg.com/dd/1.0.0) element.
 *
 * This is a complex type.
 */
public class ConnectorDefinitionDocumentImpl extends com.omg.dd.x100.impl.ViewDefinitionDocumentImpl implements com.omg.dd.x100.ConnectorDefinitionDocument
{
    private static final long serialVersionUID = 1L;
    
    public ConnectorDefinitionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONNECTORDEFINITION$0 = 
        new javax.xml.namespace.QName("http://www.omg.com/dd/1.0.0", "connectorDefinition");
    
    
    /**
     * Gets the "connectorDefinition" element
     */
    public com.omg.dd.x100.ConnectorDefinition getConnectorDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.omg.dd.x100.ConnectorDefinition target = null;
            target = (com.omg.dd.x100.ConnectorDefinition)get_store().find_element_user(CONNECTORDEFINITION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "connectorDefinition" element
     */
    public void setConnectorDefinition(com.omg.dd.x100.ConnectorDefinition connectorDefinition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.omg.dd.x100.ConnectorDefinition target = null;
            target = (com.omg.dd.x100.ConnectorDefinition)get_store().find_element_user(CONNECTORDEFINITION$0, 0);
            if (target == null)
            {
                target = (com.omg.dd.x100.ConnectorDefinition)get_store().add_element_user(CONNECTORDEFINITION$0);
            }
            target.set(connectorDefinition);
        }
    }
    
    /**
     * Appends and returns a new empty "connectorDefinition" element
     */
    public com.omg.dd.x100.ConnectorDefinition addNewConnectorDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.omg.dd.x100.ConnectorDefinition target = null;
            target = (com.omg.dd.x100.ConnectorDefinition)get_store().add_element_user(CONNECTORDEFINITION$0);
            return target;
        }
    }
}

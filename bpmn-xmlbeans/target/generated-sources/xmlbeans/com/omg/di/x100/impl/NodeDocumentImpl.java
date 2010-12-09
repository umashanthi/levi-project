/*
 * An XML document type.
 * Localname: node
 * Namespace: http://www.omg.com/di/1.0.0
 * Java type: com.omg.di.x100.NodeDocument
 *
 * Automatically generated - do not modify.
 */
package com.omg.di.x100.impl;
/**
 * A document containing one node(@http://www.omg.com/di/1.0.0) element.
 *
 * This is a complex type.
 */
public class NodeDocumentImpl extends com.omg.di.x100.impl.ViewDocumentImpl implements com.omg.di.x100.NodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public NodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NODE$0 = 
        new javax.xml.namespace.QName("http://www.omg.com/di/1.0.0", "node");
    
    
    /**
     * Gets the "node" element
     */
    public com.omg.di.x100.Node getNode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.omg.di.x100.Node target = null;
            target = (com.omg.di.x100.Node)get_store().find_element_user(NODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "node" element
     */
    public void setNode(com.omg.di.x100.Node node)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.omg.di.x100.Node target = null;
            target = (com.omg.di.x100.Node)get_store().find_element_user(NODE$0, 0);
            if (target == null)
            {
                target = (com.omg.di.x100.Node)get_store().add_element_user(NODE$0);
            }
            target.set(node);
        }
    }
    
    /**
     * Appends and returns a new empty "node" element
     */
    public com.omg.di.x100.Node addNewNode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.omg.di.x100.Node target = null;
            target = (com.omg.di.x100.Node)get_store().add_element_user(NODE$0);
            return target;
        }
    }
}

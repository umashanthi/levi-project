/*
 * An XML document type.
 * Localname: nodeDefinition
 * Namespace: http://www.omg.com/dd/1.0.0
 * Java type: com.omg.dd.x100.NodeDefinitionDocument
 *
 * Automatically generated - do not modify.
 */
package com.omg.dd.x100.impl;
/**
 * A document containing one nodeDefinition(@http://www.omg.com/dd/1.0.0) element.
 *
 * This is a complex type.
 */
public class NodeDefinitionDocumentImpl extends com.omg.dd.x100.impl.ViewDefinitionDocumentImpl implements com.omg.dd.x100.NodeDefinitionDocument
{
    private static final long serialVersionUID = 1L;
    
    public NodeDefinitionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NODEDEFINITION$0 = 
        new javax.xml.namespace.QName("http://www.omg.com/dd/1.0.0", "nodeDefinition");
    
    
    /**
     * Gets the "nodeDefinition" element
     */
    public com.omg.dd.x100.NodeDefinition getNodeDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.omg.dd.x100.NodeDefinition target = null;
            target = (com.omg.dd.x100.NodeDefinition)get_store().find_element_user(NODEDEFINITION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "nodeDefinition" element
     */
    public void setNodeDefinition(com.omg.dd.x100.NodeDefinition nodeDefinition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.omg.dd.x100.NodeDefinition target = null;
            target = (com.omg.dd.x100.NodeDefinition)get_store().find_element_user(NODEDEFINITION$0, 0);
            if (target == null)
            {
                target = (com.omg.dd.x100.NodeDefinition)get_store().add_element_user(NODEDEFINITION$0);
            }
            target.set(nodeDefinition);
        }
    }
    
    /**
     * Appends and returns a new empty "nodeDefinition" element
     */
    public com.omg.dd.x100.NodeDefinition addNewNodeDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.omg.dd.x100.NodeDefinition target = null;
            target = (com.omg.dd.x100.NodeDefinition)get_store().add_element_user(NODEDEFINITION$0);
            return target;
        }
    }
}

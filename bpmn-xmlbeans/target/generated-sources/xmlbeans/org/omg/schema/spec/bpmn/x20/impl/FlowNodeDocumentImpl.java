/*
 * An XML document type.
 * Localname: flowNode
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.FlowNodeDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one flowNode(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class FlowNodeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.schema.spec.bpmn.x20.FlowNodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public FlowNodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FLOWNODE$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "flowNode");
    
    
    /**
     * Gets the "flowNode" element
     */
    public org.omg.schema.spec.bpmn.x20.TFlowNode getFlowNode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TFlowNode target = null;
            target = (org.omg.schema.spec.bpmn.x20.TFlowNode)get_store().find_element_user(FLOWNODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "flowNode" element
     */
    public void setFlowNode(org.omg.schema.spec.bpmn.x20.TFlowNode flowNode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TFlowNode target = null;
            target = (org.omg.schema.spec.bpmn.x20.TFlowNode)get_store().find_element_user(FLOWNODE$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TFlowNode)get_store().add_element_user(FLOWNODE$0);
            }
            target.set(flowNode);
        }
    }
    
    /**
     * Appends and returns a new empty "flowNode" element
     */
    public org.omg.schema.spec.bpmn.x20.TFlowNode addNewFlowNode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TFlowNode target = null;
            target = (org.omg.schema.spec.bpmn.x20.TFlowNode)get_store().add_element_user(FLOWNODE$0);
            return target;
        }
    }
}

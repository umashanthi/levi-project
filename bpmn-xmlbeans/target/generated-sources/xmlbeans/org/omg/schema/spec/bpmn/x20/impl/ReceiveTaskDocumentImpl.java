/*
 * An XML document type.
 * Localname: receiveTask
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.ReceiveTaskDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one receiveTask(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class ReceiveTaskDocumentImpl extends org.omg.schema.spec.bpmn.x20.impl.FlowElementDocumentImpl implements org.omg.schema.spec.bpmn.x20.ReceiveTaskDocument
{
    private static final long serialVersionUID = 1L;
    
    public ReceiveTaskDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RECEIVETASK$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "receiveTask");
    
    
    /**
     * Gets the "receiveTask" element
     */
    public org.omg.schema.spec.bpmn.x20.TReceiveTask getReceiveTask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TReceiveTask target = null;
            target = (org.omg.schema.spec.bpmn.x20.TReceiveTask)get_store().find_element_user(RECEIVETASK$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "receiveTask" element
     */
    public void setReceiveTask(org.omg.schema.spec.bpmn.x20.TReceiveTask receiveTask)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TReceiveTask target = null;
            target = (org.omg.schema.spec.bpmn.x20.TReceiveTask)get_store().find_element_user(RECEIVETASK$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TReceiveTask)get_store().add_element_user(RECEIVETASK$0);
            }
            target.set(receiveTask);
        }
    }
    
    /**
     * Appends and returns a new empty "receiveTask" element
     */
    public org.omg.schema.spec.bpmn.x20.TReceiveTask addNewReceiveTask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TReceiveTask target = null;
            target = (org.omg.schema.spec.bpmn.x20.TReceiveTask)get_store().add_element_user(RECEIVETASK$0);
            return target;
        }
    }
}

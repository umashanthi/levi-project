/*
 * An XML document type.
 * Localname: sendTask
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.SendTaskDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one sendTask(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class SendTaskDocumentImpl extends org.omg.schema.spec.bpmn.x20.impl.FlowElementDocumentImpl implements org.omg.schema.spec.bpmn.x20.SendTaskDocument
{
    private static final long serialVersionUID = 1L;
    
    public SendTaskDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SENDTASK$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "sendTask");
    
    
    /**
     * Gets the "sendTask" element
     */
    public org.omg.schema.spec.bpmn.x20.TSendTask getSendTask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TSendTask target = null;
            target = (org.omg.schema.spec.bpmn.x20.TSendTask)get_store().find_element_user(SENDTASK$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "sendTask" element
     */
    public void setSendTask(org.omg.schema.spec.bpmn.x20.TSendTask sendTask)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TSendTask target = null;
            target = (org.omg.schema.spec.bpmn.x20.TSendTask)get_store().find_element_user(SENDTASK$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TSendTask)get_store().add_element_user(SENDTASK$0);
            }
            target.set(sendTask);
        }
    }
    
    /**
     * Appends and returns a new empty "sendTask" element
     */
    public org.omg.schema.spec.bpmn.x20.TSendTask addNewSendTask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TSendTask target = null;
            target = (org.omg.schema.spec.bpmn.x20.TSendTask)get_store().add_element_user(SENDTASK$0);
            return target;
        }
    }
}

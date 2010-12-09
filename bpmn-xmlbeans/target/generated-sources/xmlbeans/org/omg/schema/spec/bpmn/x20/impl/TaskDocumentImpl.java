/*
 * An XML document type.
 * Localname: task
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.TaskDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one task(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class TaskDocumentImpl extends org.omg.schema.spec.bpmn.x20.impl.FlowElementDocumentImpl implements org.omg.schema.spec.bpmn.x20.TaskDocument
{
    private static final long serialVersionUID = 1L;
    
    public TaskDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TASK$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "task");
    
    
    /**
     * Gets the "task" element
     */
    public org.omg.schema.spec.bpmn.x20.TTask getTask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TTask target = null;
            target = (org.omg.schema.spec.bpmn.x20.TTask)get_store().find_element_user(TASK$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "task" element
     */
    public void setTask(org.omg.schema.spec.bpmn.x20.TTask task)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TTask target = null;
            target = (org.omg.schema.spec.bpmn.x20.TTask)get_store().find_element_user(TASK$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TTask)get_store().add_element_user(TASK$0);
            }
            target.set(task);
        }
    }
    
    /**
     * Appends and returns a new empty "task" element
     */
    public org.omg.schema.spec.bpmn.x20.TTask addNewTask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TTask target = null;
            target = (org.omg.schema.spec.bpmn.x20.TTask)get_store().add_element_user(TASK$0);
            return target;
        }
    }
}

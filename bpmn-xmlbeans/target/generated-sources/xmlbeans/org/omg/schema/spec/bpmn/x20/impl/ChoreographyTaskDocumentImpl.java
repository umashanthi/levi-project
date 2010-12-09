/*
 * An XML document type.
 * Localname: choreographyTask
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.ChoreographyTaskDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one choreographyTask(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class ChoreographyTaskDocumentImpl extends org.omg.schema.spec.bpmn.x20.impl.FlowElementDocumentImpl implements org.omg.schema.spec.bpmn.x20.ChoreographyTaskDocument
{
    private static final long serialVersionUID = 1L;
    
    public ChoreographyTaskDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CHOREOGRAPHYTASK$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "choreographyTask");
    
    
    /**
     * Gets the "choreographyTask" element
     */
    public org.omg.schema.spec.bpmn.x20.TChoreographyTask getChoreographyTask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TChoreographyTask target = null;
            target = (org.omg.schema.spec.bpmn.x20.TChoreographyTask)get_store().find_element_user(CHOREOGRAPHYTASK$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "choreographyTask" element
     */
    public void setChoreographyTask(org.omg.schema.spec.bpmn.x20.TChoreographyTask choreographyTask)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TChoreographyTask target = null;
            target = (org.omg.schema.spec.bpmn.x20.TChoreographyTask)get_store().find_element_user(CHOREOGRAPHYTASK$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TChoreographyTask)get_store().add_element_user(CHOREOGRAPHYTASK$0);
            }
            target.set(choreographyTask);
        }
    }
    
    /**
     * Appends and returns a new empty "choreographyTask" element
     */
    public org.omg.schema.spec.bpmn.x20.TChoreographyTask addNewChoreographyTask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TChoreographyTask target = null;
            target = (org.omg.schema.spec.bpmn.x20.TChoreographyTask)get_store().add_element_user(CHOREOGRAPHYTASK$0);
            return target;
        }
    }
}

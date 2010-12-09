/*
 * An XML document type.
 * Localname: manualTask
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.ManualTaskDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one manualTask(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class ManualTaskDocumentImpl extends org.omg.schema.spec.bpmn.x20.impl.FlowElementDocumentImpl implements org.omg.schema.spec.bpmn.x20.ManualTaskDocument
{
    private static final long serialVersionUID = 1L;
    
    public ManualTaskDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MANUALTASK$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "manualTask");
    
    
    /**
     * Gets the "manualTask" element
     */
    public org.omg.schema.spec.bpmn.x20.TManualTask getManualTask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TManualTask target = null;
            target = (org.omg.schema.spec.bpmn.x20.TManualTask)get_store().find_element_user(MANUALTASK$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "manualTask" element
     */
    public void setManualTask(org.omg.schema.spec.bpmn.x20.TManualTask manualTask)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TManualTask target = null;
            target = (org.omg.schema.spec.bpmn.x20.TManualTask)get_store().find_element_user(MANUALTASK$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TManualTask)get_store().add_element_user(MANUALTASK$0);
            }
            target.set(manualTask);
        }
    }
    
    /**
     * Appends and returns a new empty "manualTask" element
     */
    public org.omg.schema.spec.bpmn.x20.TManualTask addNewManualTask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TManualTask target = null;
            target = (org.omg.schema.spec.bpmn.x20.TManualTask)get_store().add_element_user(MANUALTASK$0);
            return target;
        }
    }
}

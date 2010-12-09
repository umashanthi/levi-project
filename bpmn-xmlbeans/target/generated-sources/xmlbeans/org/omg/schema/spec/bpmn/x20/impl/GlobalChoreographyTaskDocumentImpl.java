/*
 * An XML document type.
 * Localname: globalChoreographyTask
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.GlobalChoreographyTaskDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one globalChoreographyTask(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class GlobalChoreographyTaskDocumentImpl extends org.omg.schema.spec.bpmn.x20.impl.RootElementDocumentImpl implements org.omg.schema.spec.bpmn.x20.GlobalChoreographyTaskDocument
{
    private static final long serialVersionUID = 1L;
    
    public GlobalChoreographyTaskDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GLOBALCHOREOGRAPHYTASK$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "globalChoreographyTask");
    
    
    /**
     * Gets the "globalChoreographyTask" element
     */
    public org.omg.schema.spec.bpmn.x20.TGlobalChoreographyTask getGlobalChoreographyTask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TGlobalChoreographyTask target = null;
            target = (org.omg.schema.spec.bpmn.x20.TGlobalChoreographyTask)get_store().find_element_user(GLOBALCHOREOGRAPHYTASK$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "globalChoreographyTask" element
     */
    public void setGlobalChoreographyTask(org.omg.schema.spec.bpmn.x20.TGlobalChoreographyTask globalChoreographyTask)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TGlobalChoreographyTask target = null;
            target = (org.omg.schema.spec.bpmn.x20.TGlobalChoreographyTask)get_store().find_element_user(GLOBALCHOREOGRAPHYTASK$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TGlobalChoreographyTask)get_store().add_element_user(GLOBALCHOREOGRAPHYTASK$0);
            }
            target.set(globalChoreographyTask);
        }
    }
    
    /**
     * Appends and returns a new empty "globalChoreographyTask" element
     */
    public org.omg.schema.spec.bpmn.x20.TGlobalChoreographyTask addNewGlobalChoreographyTask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TGlobalChoreographyTask target = null;
            target = (org.omg.schema.spec.bpmn.x20.TGlobalChoreographyTask)get_store().add_element_user(GLOBALCHOREOGRAPHYTASK$0);
            return target;
        }
    }
}

/*
 * An XML document type.
 * Localname: globalTask
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.GlobalTaskDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one globalTask(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class GlobalTaskDocumentImpl extends org.omg.schema.spec.bpmn.x20.impl.RootElementDocumentImpl implements org.omg.schema.spec.bpmn.x20.GlobalTaskDocument
{
    private static final long serialVersionUID = 1L;
    
    public GlobalTaskDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GLOBALTASK$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "globalTask");
    
    
    /**
     * Gets the "globalTask" element
     */
    public org.omg.schema.spec.bpmn.x20.TGlobalTask getGlobalTask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TGlobalTask target = null;
            target = (org.omg.schema.spec.bpmn.x20.TGlobalTask)get_store().find_element_user(GLOBALTASK$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "globalTask" element
     */
    public void setGlobalTask(org.omg.schema.spec.bpmn.x20.TGlobalTask globalTask)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TGlobalTask target = null;
            target = (org.omg.schema.spec.bpmn.x20.TGlobalTask)get_store().find_element_user(GLOBALTASK$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TGlobalTask)get_store().add_element_user(GLOBALTASK$0);
            }
            target.set(globalTask);
        }
    }
    
    /**
     * Appends and returns a new empty "globalTask" element
     */
    public org.omg.schema.spec.bpmn.x20.TGlobalTask addNewGlobalTask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TGlobalTask target = null;
            target = (org.omg.schema.spec.bpmn.x20.TGlobalTask)get_store().add_element_user(GLOBALTASK$0);
            return target;
        }
    }
}

/*
 * An XML document type.
 * Localname: globalManualTask
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.GlobalManualTaskDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one globalManualTask(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class GlobalManualTaskDocumentImpl extends org.omg.schema.spec.bpmn.x20.impl.RootElementDocumentImpl implements org.omg.schema.spec.bpmn.x20.GlobalManualTaskDocument
{
    private static final long serialVersionUID = 1L;
    
    public GlobalManualTaskDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GLOBALMANUALTASK$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "globalManualTask");
    
    
    /**
     * Gets the "globalManualTask" element
     */
    public org.omg.schema.spec.bpmn.x20.TGlobalManualTask getGlobalManualTask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TGlobalManualTask target = null;
            target = (org.omg.schema.spec.bpmn.x20.TGlobalManualTask)get_store().find_element_user(GLOBALMANUALTASK$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "globalManualTask" element
     */
    public void setGlobalManualTask(org.omg.schema.spec.bpmn.x20.TGlobalManualTask globalManualTask)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TGlobalManualTask target = null;
            target = (org.omg.schema.spec.bpmn.x20.TGlobalManualTask)get_store().find_element_user(GLOBALMANUALTASK$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TGlobalManualTask)get_store().add_element_user(GLOBALMANUALTASK$0);
            }
            target.set(globalManualTask);
        }
    }
    
    /**
     * Appends and returns a new empty "globalManualTask" element
     */
    public org.omg.schema.spec.bpmn.x20.TGlobalManualTask addNewGlobalManualTask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TGlobalManualTask target = null;
            target = (org.omg.schema.spec.bpmn.x20.TGlobalManualTask)get_store().add_element_user(GLOBALMANUALTASK$0);
            return target;
        }
    }
}

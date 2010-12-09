/*
 * An XML document type.
 * Localname: globalScriptTask
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.GlobalScriptTaskDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one globalScriptTask(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class GlobalScriptTaskDocumentImpl extends org.omg.schema.spec.bpmn.x20.impl.RootElementDocumentImpl implements org.omg.schema.spec.bpmn.x20.GlobalScriptTaskDocument
{
    private static final long serialVersionUID = 1L;
    
    public GlobalScriptTaskDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GLOBALSCRIPTTASK$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "globalScriptTask");
    
    
    /**
     * Gets the "globalScriptTask" element
     */
    public org.omg.schema.spec.bpmn.x20.TGlobalScriptTask getGlobalScriptTask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TGlobalScriptTask target = null;
            target = (org.omg.schema.spec.bpmn.x20.TGlobalScriptTask)get_store().find_element_user(GLOBALSCRIPTTASK$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "globalScriptTask" element
     */
    public void setGlobalScriptTask(org.omg.schema.spec.bpmn.x20.TGlobalScriptTask globalScriptTask)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TGlobalScriptTask target = null;
            target = (org.omg.schema.spec.bpmn.x20.TGlobalScriptTask)get_store().find_element_user(GLOBALSCRIPTTASK$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TGlobalScriptTask)get_store().add_element_user(GLOBALSCRIPTTASK$0);
            }
            target.set(globalScriptTask);
        }
    }
    
    /**
     * Appends and returns a new empty "globalScriptTask" element
     */
    public org.omg.schema.spec.bpmn.x20.TGlobalScriptTask addNewGlobalScriptTask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TGlobalScriptTask target = null;
            target = (org.omg.schema.spec.bpmn.x20.TGlobalScriptTask)get_store().add_element_user(GLOBALSCRIPTTASK$0);
            return target;
        }
    }
}

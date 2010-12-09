/*
 * An XML document type.
 * Localname: scriptTask
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.ScriptTaskDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one scriptTask(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class ScriptTaskDocumentImpl extends org.omg.schema.spec.bpmn.x20.impl.FlowElementDocumentImpl implements org.omg.schema.spec.bpmn.x20.ScriptTaskDocument
{
    private static final long serialVersionUID = 1L;
    
    public ScriptTaskDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SCRIPTTASK$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "scriptTask");
    
    
    /**
     * Gets the "scriptTask" element
     */
    public org.omg.schema.spec.bpmn.x20.TScriptTask getScriptTask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TScriptTask target = null;
            target = (org.omg.schema.spec.bpmn.x20.TScriptTask)get_store().find_element_user(SCRIPTTASK$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "scriptTask" element
     */
    public void setScriptTask(org.omg.schema.spec.bpmn.x20.TScriptTask scriptTask)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TScriptTask target = null;
            target = (org.omg.schema.spec.bpmn.x20.TScriptTask)get_store().find_element_user(SCRIPTTASK$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TScriptTask)get_store().add_element_user(SCRIPTTASK$0);
            }
            target.set(scriptTask);
        }
    }
    
    /**
     * Appends and returns a new empty "scriptTask" element
     */
    public org.omg.schema.spec.bpmn.x20.TScriptTask addNewScriptTask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TScriptTask target = null;
            target = (org.omg.schema.spec.bpmn.x20.TScriptTask)get_store().add_element_user(SCRIPTTASK$0);
            return target;
        }
    }
}

/*
 * An XML document type.
 * Localname: globalUserTask
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.GlobalUserTaskDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one globalUserTask(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class GlobalUserTaskDocumentImpl extends org.omg.schema.spec.bpmn.x20.impl.RootElementDocumentImpl implements org.omg.schema.spec.bpmn.x20.GlobalUserTaskDocument
{
    private static final long serialVersionUID = 1L;
    
    public GlobalUserTaskDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GLOBALUSERTASK$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "globalUserTask");
    
    
    /**
     * Gets the "globalUserTask" element
     */
    public org.omg.schema.spec.bpmn.x20.TGlobalUserTask getGlobalUserTask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TGlobalUserTask target = null;
            target = (org.omg.schema.spec.bpmn.x20.TGlobalUserTask)get_store().find_element_user(GLOBALUSERTASK$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "globalUserTask" element
     */
    public void setGlobalUserTask(org.omg.schema.spec.bpmn.x20.TGlobalUserTask globalUserTask)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TGlobalUserTask target = null;
            target = (org.omg.schema.spec.bpmn.x20.TGlobalUserTask)get_store().find_element_user(GLOBALUSERTASK$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TGlobalUserTask)get_store().add_element_user(GLOBALUSERTASK$0);
            }
            target.set(globalUserTask);
        }
    }
    
    /**
     * Appends and returns a new empty "globalUserTask" element
     */
    public org.omg.schema.spec.bpmn.x20.TGlobalUserTask addNewGlobalUserTask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TGlobalUserTask target = null;
            target = (org.omg.schema.spec.bpmn.x20.TGlobalUserTask)get_store().add_element_user(GLOBALUSERTASK$0);
            return target;
        }
    }
}

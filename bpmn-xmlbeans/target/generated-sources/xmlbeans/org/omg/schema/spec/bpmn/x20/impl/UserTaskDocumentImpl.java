/*
 * An XML document type.
 * Localname: userTask
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.UserTaskDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one userTask(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class UserTaskDocumentImpl extends org.omg.schema.spec.bpmn.x20.impl.FlowElementDocumentImpl implements org.omg.schema.spec.bpmn.x20.UserTaskDocument
{
    private static final long serialVersionUID = 1L;
    
    public UserTaskDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USERTASK$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "userTask");
    
    
    /**
     * Gets the "userTask" element
     */
    public org.omg.schema.spec.bpmn.x20.TUserTask getUserTask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TUserTask target = null;
            target = (org.omg.schema.spec.bpmn.x20.TUserTask)get_store().find_element_user(USERTASK$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "userTask" element
     */
    public void setUserTask(org.omg.schema.spec.bpmn.x20.TUserTask userTask)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TUserTask target = null;
            target = (org.omg.schema.spec.bpmn.x20.TUserTask)get_store().find_element_user(USERTASK$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TUserTask)get_store().add_element_user(USERTASK$0);
            }
            target.set(userTask);
        }
    }
    
    /**
     * Appends and returns a new empty "userTask" element
     */
    public org.omg.schema.spec.bpmn.x20.TUserTask addNewUserTask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TUserTask target = null;
            target = (org.omg.schema.spec.bpmn.x20.TUserTask)get_store().add_element_user(USERTASK$0);
            return target;
        }
    }
}

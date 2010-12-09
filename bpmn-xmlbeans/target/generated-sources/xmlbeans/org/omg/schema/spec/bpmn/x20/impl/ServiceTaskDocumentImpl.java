/*
 * An XML document type.
 * Localname: serviceTask
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.ServiceTaskDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one serviceTask(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class ServiceTaskDocumentImpl extends org.omg.schema.spec.bpmn.x20.impl.FlowElementDocumentImpl implements org.omg.schema.spec.bpmn.x20.ServiceTaskDocument
{
    private static final long serialVersionUID = 1L;
    
    public ServiceTaskDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SERVICETASK$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "serviceTask");
    
    
    /**
     * Gets the "serviceTask" element
     */
    public org.omg.schema.spec.bpmn.x20.TServiceTask getServiceTask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TServiceTask target = null;
            target = (org.omg.schema.spec.bpmn.x20.TServiceTask)get_store().find_element_user(SERVICETASK$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "serviceTask" element
     */
    public void setServiceTask(org.omg.schema.spec.bpmn.x20.TServiceTask serviceTask)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TServiceTask target = null;
            target = (org.omg.schema.spec.bpmn.x20.TServiceTask)get_store().find_element_user(SERVICETASK$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TServiceTask)get_store().add_element_user(SERVICETASK$0);
            }
            target.set(serviceTask);
        }
    }
    
    /**
     * Appends and returns a new empty "serviceTask" element
     */
    public org.omg.schema.spec.bpmn.x20.TServiceTask addNewServiceTask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TServiceTask target = null;
            target = (org.omg.schema.spec.bpmn.x20.TServiceTask)get_store().add_element_user(SERVICETASK$0);
            return target;
        }
    }
}

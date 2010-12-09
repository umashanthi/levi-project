/*
 * An XML document type.
 * Localname: process
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.ProcessDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one process(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class ProcessDocumentImpl extends org.omg.schema.spec.bpmn.x20.impl.RootElementDocumentImpl implements org.omg.schema.spec.bpmn.x20.ProcessDocument
{
    private static final long serialVersionUID = 1L;
    
    public ProcessDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROCESS$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "process");
    
    
    /**
     * Gets the "process" element
     */
    public org.omg.schema.spec.bpmn.x20.TProcess getProcess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TProcess target = null;
            target = (org.omg.schema.spec.bpmn.x20.TProcess)get_store().find_element_user(PROCESS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "process" element
     */
    public void setProcess(org.omg.schema.spec.bpmn.x20.TProcess process)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TProcess target = null;
            target = (org.omg.schema.spec.bpmn.x20.TProcess)get_store().find_element_user(PROCESS$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TProcess)get_store().add_element_user(PROCESS$0);
            }
            target.set(process);
        }
    }
    
    /**
     * Appends and returns a new empty "process" element
     */
    public org.omg.schema.spec.bpmn.x20.TProcess addNewProcess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TProcess target = null;
            target = (org.omg.schema.spec.bpmn.x20.TProcess)get_store().add_element_user(PROCESS$0);
            return target;
        }
    }
}

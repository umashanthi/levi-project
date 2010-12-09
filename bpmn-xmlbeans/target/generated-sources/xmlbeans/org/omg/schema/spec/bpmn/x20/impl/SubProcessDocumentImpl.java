/*
 * An XML document type.
 * Localname: subProcess
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.SubProcessDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one subProcess(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class SubProcessDocumentImpl extends org.omg.schema.spec.bpmn.x20.impl.FlowElementDocumentImpl implements org.omg.schema.spec.bpmn.x20.SubProcessDocument
{
    private static final long serialVersionUID = 1L;
    
    public SubProcessDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBPROCESS$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "subProcess");
    
    
    /**
     * Gets the "subProcess" element
     */
    public org.omg.schema.spec.bpmn.x20.TSubProcess getSubProcess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TSubProcess target = null;
            target = (org.omg.schema.spec.bpmn.x20.TSubProcess)get_store().find_element_user(SUBPROCESS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "subProcess" element
     */
    public void setSubProcess(org.omg.schema.spec.bpmn.x20.TSubProcess subProcess)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TSubProcess target = null;
            target = (org.omg.schema.spec.bpmn.x20.TSubProcess)get_store().find_element_user(SUBPROCESS$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TSubProcess)get_store().add_element_user(SUBPROCESS$0);
            }
            target.set(subProcess);
        }
    }
    
    /**
     * Appends and returns a new empty "subProcess" element
     */
    public org.omg.schema.spec.bpmn.x20.TSubProcess addNewSubProcess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TSubProcess target = null;
            target = (org.omg.schema.spec.bpmn.x20.TSubProcess)get_store().add_element_user(SUBPROCESS$0);
            return target;
        }
    }
}

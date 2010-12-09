/*
 * An XML document type.
 * Localname: adHocSubProcess
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.AdHocSubProcessDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one adHocSubProcess(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class AdHocSubProcessDocumentImpl extends org.omg.schema.spec.bpmn.x20.impl.FlowElementDocumentImpl implements org.omg.schema.spec.bpmn.x20.AdHocSubProcessDocument
{
    private static final long serialVersionUID = 1L;
    
    public AdHocSubProcessDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADHOCSUBPROCESS$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "adHocSubProcess");
    
    
    /**
     * Gets the "adHocSubProcess" element
     */
    public org.omg.schema.spec.bpmn.x20.TAdHocSubProcess getAdHocSubProcess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TAdHocSubProcess target = null;
            target = (org.omg.schema.spec.bpmn.x20.TAdHocSubProcess)get_store().find_element_user(ADHOCSUBPROCESS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "adHocSubProcess" element
     */
    public void setAdHocSubProcess(org.omg.schema.spec.bpmn.x20.TAdHocSubProcess adHocSubProcess)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TAdHocSubProcess target = null;
            target = (org.omg.schema.spec.bpmn.x20.TAdHocSubProcess)get_store().find_element_user(ADHOCSUBPROCESS$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TAdHocSubProcess)get_store().add_element_user(ADHOCSUBPROCESS$0);
            }
            target.set(adHocSubProcess);
        }
    }
    
    /**
     * Appends and returns a new empty "adHocSubProcess" element
     */
    public org.omg.schema.spec.bpmn.x20.TAdHocSubProcess addNewAdHocSubProcess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TAdHocSubProcess target = null;
            target = (org.omg.schema.spec.bpmn.x20.TAdHocSubProcess)get_store().add_element_user(ADHOCSUBPROCESS$0);
            return target;
        }
    }
}

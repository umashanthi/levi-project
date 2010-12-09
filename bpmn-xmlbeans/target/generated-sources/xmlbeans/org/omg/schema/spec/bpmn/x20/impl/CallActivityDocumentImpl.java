/*
 * An XML document type.
 * Localname: callActivity
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.CallActivityDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one callActivity(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class CallActivityDocumentImpl extends org.omg.schema.spec.bpmn.x20.impl.FlowElementDocumentImpl implements org.omg.schema.spec.bpmn.x20.CallActivityDocument
{
    private static final long serialVersionUID = 1L;
    
    public CallActivityDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CALLACTIVITY$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "callActivity");
    
    
    /**
     * Gets the "callActivity" element
     */
    public org.omg.schema.spec.bpmn.x20.TCallActivity getCallActivity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TCallActivity target = null;
            target = (org.omg.schema.spec.bpmn.x20.TCallActivity)get_store().find_element_user(CALLACTIVITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "callActivity" element
     */
    public void setCallActivity(org.omg.schema.spec.bpmn.x20.TCallActivity callActivity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TCallActivity target = null;
            target = (org.omg.schema.spec.bpmn.x20.TCallActivity)get_store().find_element_user(CALLACTIVITY$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TCallActivity)get_store().add_element_user(CALLACTIVITY$0);
            }
            target.set(callActivity);
        }
    }
    
    /**
     * Appends and returns a new empty "callActivity" element
     */
    public org.omg.schema.spec.bpmn.x20.TCallActivity addNewCallActivity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TCallActivity target = null;
            target = (org.omg.schema.spec.bpmn.x20.TCallActivity)get_store().add_element_user(CALLACTIVITY$0);
            return target;
        }
    }
}

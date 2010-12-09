/*
 * An XML document type.
 * Localname: callChoreographyActivity
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.CallChoreographyActivityDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one callChoreographyActivity(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class CallChoreographyActivityDocumentImpl extends org.omg.schema.spec.bpmn.x20.impl.FlowElementDocumentImpl implements org.omg.schema.spec.bpmn.x20.CallChoreographyActivityDocument
{
    private static final long serialVersionUID = 1L;
    
    public CallChoreographyActivityDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CALLCHOREOGRAPHYACTIVITY$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "callChoreographyActivity");
    
    
    /**
     * Gets the "callChoreographyActivity" element
     */
    public org.omg.schema.spec.bpmn.x20.TCallChoreographyActivity getCallChoreographyActivity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TCallChoreographyActivity target = null;
            target = (org.omg.schema.spec.bpmn.x20.TCallChoreographyActivity)get_store().find_element_user(CALLCHOREOGRAPHYACTIVITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "callChoreographyActivity" element
     */
    public void setCallChoreographyActivity(org.omg.schema.spec.bpmn.x20.TCallChoreographyActivity callChoreographyActivity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TCallChoreographyActivity target = null;
            target = (org.omg.schema.spec.bpmn.x20.TCallChoreographyActivity)get_store().find_element_user(CALLCHOREOGRAPHYACTIVITY$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TCallChoreographyActivity)get_store().add_element_user(CALLCHOREOGRAPHYACTIVITY$0);
            }
            target.set(callChoreographyActivity);
        }
    }
    
    /**
     * Appends and returns a new empty "callChoreographyActivity" element
     */
    public org.omg.schema.spec.bpmn.x20.TCallChoreographyActivity addNewCallChoreographyActivity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TCallChoreographyActivity target = null;
            target = (org.omg.schema.spec.bpmn.x20.TCallChoreographyActivity)get_store().add_element_user(CALLCHOREOGRAPHYACTIVITY$0);
            return target;
        }
    }
}

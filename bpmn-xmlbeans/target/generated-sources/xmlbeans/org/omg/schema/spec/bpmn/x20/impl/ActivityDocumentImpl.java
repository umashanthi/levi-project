/*
 * An XML document type.
 * Localname: activity
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.ActivityDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one activity(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class ActivityDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.schema.spec.bpmn.x20.ActivityDocument
{
    private static final long serialVersionUID = 1L;
    
    public ActivityDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACTIVITY$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "activity");
    
    
    /**
     * Gets the "activity" element
     */
    public org.omg.schema.spec.bpmn.x20.TActivity getActivity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TActivity target = null;
            target = (org.omg.schema.spec.bpmn.x20.TActivity)get_store().find_element_user(ACTIVITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "activity" element
     */
    public void setActivity(org.omg.schema.spec.bpmn.x20.TActivity activity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TActivity target = null;
            target = (org.omg.schema.spec.bpmn.x20.TActivity)get_store().find_element_user(ACTIVITY$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TActivity)get_store().add_element_user(ACTIVITY$0);
            }
            target.set(activity);
        }
    }
    
    /**
     * Appends and returns a new empty "activity" element
     */
    public org.omg.schema.spec.bpmn.x20.TActivity addNewActivity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TActivity target = null;
            target = (org.omg.schema.spec.bpmn.x20.TActivity)get_store().add_element_user(ACTIVITY$0);
            return target;
        }
    }
}

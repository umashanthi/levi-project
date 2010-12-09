/*
 * An XML document type.
 * Localname: activityResource
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.ActivityResourceDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one activityResource(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class ActivityResourceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.schema.spec.bpmn.x20.ActivityResourceDocument
{
    private static final long serialVersionUID = 1L;
    
    public ActivityResourceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACTIVITYRESOURCE$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "activityResource");
    private static final org.apache.xmlbeans.QNameSet ACTIVITYRESOURCE$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "humanPerformer"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "performer"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "activityResource"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "potentialOwner"),
    });
    
    
    /**
     * Gets the "activityResource" element
     */
    public org.omg.schema.spec.bpmn.x20.TActivityResource getActivityResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TActivityResource target = null;
            target = (org.omg.schema.spec.bpmn.x20.TActivityResource)get_store().find_element_user(ACTIVITYRESOURCE$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "activityResource" element
     */
    public void setActivityResource(org.omg.schema.spec.bpmn.x20.TActivityResource activityResource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TActivityResource target = null;
            target = (org.omg.schema.spec.bpmn.x20.TActivityResource)get_store().find_element_user(ACTIVITYRESOURCE$1, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TActivityResource)get_store().add_element_user(ACTIVITYRESOURCE$0);
            }
            target.set(activityResource);
        }
    }
    
    /**
     * Appends and returns a new empty "activityResource" element
     */
    public org.omg.schema.spec.bpmn.x20.TActivityResource addNewActivityResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TActivityResource target = null;
            target = (org.omg.schema.spec.bpmn.x20.TActivityResource)get_store().add_element_user(ACTIVITYRESOURCE$0);
            return target;
        }
    }
}

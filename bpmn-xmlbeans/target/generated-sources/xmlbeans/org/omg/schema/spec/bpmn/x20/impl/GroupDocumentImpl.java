/*
 * An XML document type.
 * Localname: group
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.GroupDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one group(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class GroupDocumentImpl extends org.omg.schema.spec.bpmn.x20.impl.ArtifactDocumentImpl implements org.omg.schema.spec.bpmn.x20.GroupDocument
{
    private static final long serialVersionUID = 1L;
    
    public GroupDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GROUP$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "group");
    
    
    /**
     * Gets the "group" element
     */
    public org.omg.schema.spec.bpmn.x20.TGroup getGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TGroup target = null;
            target = (org.omg.schema.spec.bpmn.x20.TGroup)get_store().find_element_user(GROUP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "group" element
     */
    public void setGroup(org.omg.schema.spec.bpmn.x20.TGroup group)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TGroup target = null;
            target = (org.omg.schema.spec.bpmn.x20.TGroup)get_store().find_element_user(GROUP$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TGroup)get_store().add_element_user(GROUP$0);
            }
            target.set(group);
        }
    }
    
    /**
     * Appends and returns a new empty "group" element
     */
    public org.omg.schema.spec.bpmn.x20.TGroup addNewGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TGroup target = null;
            target = (org.omg.schema.spec.bpmn.x20.TGroup)get_store().add_element_user(GROUP$0);
            return target;
        }
    }
}

/*
 * An XML document type.
 * Localname: laneSet
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.LaneSetDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one laneSet(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class LaneSetDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.schema.spec.bpmn.x20.LaneSetDocument
{
    private static final long serialVersionUID = 1L;
    
    public LaneSetDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LANESET$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "laneSet");
    
    
    /**
     * Gets the "laneSet" element
     */
    public org.omg.schema.spec.bpmn.x20.TLaneSet getLaneSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TLaneSet target = null;
            target = (org.omg.schema.spec.bpmn.x20.TLaneSet)get_store().find_element_user(LANESET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "laneSet" element
     */
    public void setLaneSet(org.omg.schema.spec.bpmn.x20.TLaneSet laneSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TLaneSet target = null;
            target = (org.omg.schema.spec.bpmn.x20.TLaneSet)get_store().find_element_user(LANESET$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TLaneSet)get_store().add_element_user(LANESET$0);
            }
            target.set(laneSet);
        }
    }
    
    /**
     * Appends and returns a new empty "laneSet" element
     */
    public org.omg.schema.spec.bpmn.x20.TLaneSet addNewLaneSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TLaneSet target = null;
            target = (org.omg.schema.spec.bpmn.x20.TLaneSet)get_store().add_element_user(LANESET$0);
            return target;
        }
    }
}

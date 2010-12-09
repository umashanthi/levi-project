/*
 * An XML document type.
 * Localname: lane
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.LaneDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one lane(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class LaneDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.schema.spec.bpmn.x20.LaneDocument
{
    private static final long serialVersionUID = 1L;
    
    public LaneDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LANE$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "lane");
    
    
    /**
     * Gets the "lane" element
     */
    public org.omg.schema.spec.bpmn.x20.TLane getLane()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TLane target = null;
            target = (org.omg.schema.spec.bpmn.x20.TLane)get_store().find_element_user(LANE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "lane" element
     */
    public void setLane(org.omg.schema.spec.bpmn.x20.TLane lane)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TLane target = null;
            target = (org.omg.schema.spec.bpmn.x20.TLane)get_store().find_element_user(LANE$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TLane)get_store().add_element_user(LANE$0);
            }
            target.set(lane);
        }
    }
    
    /**
     * Appends and returns a new empty "lane" element
     */
    public org.omg.schema.spec.bpmn.x20.TLane addNewLane()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TLane target = null;
            target = (org.omg.schema.spec.bpmn.x20.TLane)get_store().add_element_user(LANE$0);
            return target;
        }
    }
}

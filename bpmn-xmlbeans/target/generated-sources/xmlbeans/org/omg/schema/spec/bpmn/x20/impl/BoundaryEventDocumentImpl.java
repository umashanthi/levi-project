/*
 * An XML document type.
 * Localname: boundaryEvent
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.BoundaryEventDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one boundaryEvent(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class BoundaryEventDocumentImpl extends org.omg.schema.spec.bpmn.x20.impl.FlowElementDocumentImpl implements org.omg.schema.spec.bpmn.x20.BoundaryEventDocument
{
    private static final long serialVersionUID = 1L;
    
    public BoundaryEventDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BOUNDARYEVENT$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "boundaryEvent");
    
    
    /**
     * Gets the "boundaryEvent" element
     */
    public org.omg.schema.spec.bpmn.x20.TBoundaryEvent getBoundaryEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TBoundaryEvent target = null;
            target = (org.omg.schema.spec.bpmn.x20.TBoundaryEvent)get_store().find_element_user(BOUNDARYEVENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "boundaryEvent" element
     */
    public void setBoundaryEvent(org.omg.schema.spec.bpmn.x20.TBoundaryEvent boundaryEvent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TBoundaryEvent target = null;
            target = (org.omg.schema.spec.bpmn.x20.TBoundaryEvent)get_store().find_element_user(BOUNDARYEVENT$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TBoundaryEvent)get_store().add_element_user(BOUNDARYEVENT$0);
            }
            target.set(boundaryEvent);
        }
    }
    
    /**
     * Appends and returns a new empty "boundaryEvent" element
     */
    public org.omg.schema.spec.bpmn.x20.TBoundaryEvent addNewBoundaryEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TBoundaryEvent target = null;
            target = (org.omg.schema.spec.bpmn.x20.TBoundaryEvent)get_store().add_element_user(BOUNDARYEVENT$0);
            return target;
        }
    }
}

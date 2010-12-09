/*
 * An XML document type.
 * Localname: intermediateThrowEvent
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.IntermediateThrowEventDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one intermediateThrowEvent(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class IntermediateThrowEventDocumentImpl extends org.omg.schema.spec.bpmn.x20.impl.FlowElementDocumentImpl implements org.omg.schema.spec.bpmn.x20.IntermediateThrowEventDocument
{
    private static final long serialVersionUID = 1L;
    
    public IntermediateThrowEventDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INTERMEDIATETHROWEVENT$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "intermediateThrowEvent");
    
    
    /**
     * Gets the "intermediateThrowEvent" element
     */
    public org.omg.schema.spec.bpmn.x20.TIntermediateThrowEvent getIntermediateThrowEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TIntermediateThrowEvent target = null;
            target = (org.omg.schema.spec.bpmn.x20.TIntermediateThrowEvent)get_store().find_element_user(INTERMEDIATETHROWEVENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "intermediateThrowEvent" element
     */
    public void setIntermediateThrowEvent(org.omg.schema.spec.bpmn.x20.TIntermediateThrowEvent intermediateThrowEvent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TIntermediateThrowEvent target = null;
            target = (org.omg.schema.spec.bpmn.x20.TIntermediateThrowEvent)get_store().find_element_user(INTERMEDIATETHROWEVENT$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TIntermediateThrowEvent)get_store().add_element_user(INTERMEDIATETHROWEVENT$0);
            }
            target.set(intermediateThrowEvent);
        }
    }
    
    /**
     * Appends and returns a new empty "intermediateThrowEvent" element
     */
    public org.omg.schema.spec.bpmn.x20.TIntermediateThrowEvent addNewIntermediateThrowEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TIntermediateThrowEvent target = null;
            target = (org.omg.schema.spec.bpmn.x20.TIntermediateThrowEvent)get_store().add_element_user(INTERMEDIATETHROWEVENT$0);
            return target;
        }
    }
}

/*
 * An XML document type.
 * Localname: intermediateCatchEvent
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.IntermediateCatchEventDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one intermediateCatchEvent(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class IntermediateCatchEventDocumentImpl extends org.omg.schema.spec.bpmn.x20.impl.FlowElementDocumentImpl implements org.omg.schema.spec.bpmn.x20.IntermediateCatchEventDocument
{
    private static final long serialVersionUID = 1L;
    
    public IntermediateCatchEventDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INTERMEDIATECATCHEVENT$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "intermediateCatchEvent");
    
    
    /**
     * Gets the "intermediateCatchEvent" element
     */
    public org.omg.schema.spec.bpmn.x20.TIntermediateCatchEvent getIntermediateCatchEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TIntermediateCatchEvent target = null;
            target = (org.omg.schema.spec.bpmn.x20.TIntermediateCatchEvent)get_store().find_element_user(INTERMEDIATECATCHEVENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "intermediateCatchEvent" element
     */
    public void setIntermediateCatchEvent(org.omg.schema.spec.bpmn.x20.TIntermediateCatchEvent intermediateCatchEvent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TIntermediateCatchEvent target = null;
            target = (org.omg.schema.spec.bpmn.x20.TIntermediateCatchEvent)get_store().find_element_user(INTERMEDIATECATCHEVENT$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TIntermediateCatchEvent)get_store().add_element_user(INTERMEDIATECATCHEVENT$0);
            }
            target.set(intermediateCatchEvent);
        }
    }
    
    /**
     * Appends and returns a new empty "intermediateCatchEvent" element
     */
    public org.omg.schema.spec.bpmn.x20.TIntermediateCatchEvent addNewIntermediateCatchEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TIntermediateCatchEvent target = null;
            target = (org.omg.schema.spec.bpmn.x20.TIntermediateCatchEvent)get_store().add_element_user(INTERMEDIATECATCHEVENT$0);
            return target;
        }
    }
}

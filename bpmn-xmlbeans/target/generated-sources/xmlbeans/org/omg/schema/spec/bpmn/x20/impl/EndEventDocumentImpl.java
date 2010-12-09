/*
 * An XML document type.
 * Localname: endEvent
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.EndEventDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one endEvent(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class EndEventDocumentImpl extends org.omg.schema.spec.bpmn.x20.impl.FlowElementDocumentImpl implements org.omg.schema.spec.bpmn.x20.EndEventDocument
{
    private static final long serialVersionUID = 1L;
    
    public EndEventDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENDEVENT$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "endEvent");
    
    
    /**
     * Gets the "endEvent" element
     */
    public org.omg.schema.spec.bpmn.x20.TEndEvent getEndEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TEndEvent target = null;
            target = (org.omg.schema.spec.bpmn.x20.TEndEvent)get_store().find_element_user(ENDEVENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "endEvent" element
     */
    public void setEndEvent(org.omg.schema.spec.bpmn.x20.TEndEvent endEvent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TEndEvent target = null;
            target = (org.omg.schema.spec.bpmn.x20.TEndEvent)get_store().find_element_user(ENDEVENT$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TEndEvent)get_store().add_element_user(ENDEVENT$0);
            }
            target.set(endEvent);
        }
    }
    
    /**
     * Appends and returns a new empty "endEvent" element
     */
    public org.omg.schema.spec.bpmn.x20.TEndEvent addNewEndEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TEndEvent target = null;
            target = (org.omg.schema.spec.bpmn.x20.TEndEvent)get_store().add_element_user(ENDEVENT$0);
            return target;
        }
    }
}

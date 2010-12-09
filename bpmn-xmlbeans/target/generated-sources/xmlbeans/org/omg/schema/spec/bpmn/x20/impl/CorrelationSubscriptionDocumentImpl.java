/*
 * An XML document type.
 * Localname: correlationSubscription
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.CorrelationSubscriptionDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one correlationSubscription(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class CorrelationSubscriptionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.schema.spec.bpmn.x20.CorrelationSubscriptionDocument
{
    private static final long serialVersionUID = 1L;
    
    public CorrelationSubscriptionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CORRELATIONSUBSCRIPTION$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "correlationSubscription");
    
    
    /**
     * Gets the "correlationSubscription" element
     */
    public org.omg.schema.spec.bpmn.x20.TCorrelationSubscription getCorrelationSubscription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TCorrelationSubscription target = null;
            target = (org.omg.schema.spec.bpmn.x20.TCorrelationSubscription)get_store().find_element_user(CORRELATIONSUBSCRIPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "correlationSubscription" element
     */
    public void setCorrelationSubscription(org.omg.schema.spec.bpmn.x20.TCorrelationSubscription correlationSubscription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TCorrelationSubscription target = null;
            target = (org.omg.schema.spec.bpmn.x20.TCorrelationSubscription)get_store().find_element_user(CORRELATIONSUBSCRIPTION$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TCorrelationSubscription)get_store().add_element_user(CORRELATIONSUBSCRIPTION$0);
            }
            target.set(correlationSubscription);
        }
    }
    
    /**
     * Appends and returns a new empty "correlationSubscription" element
     */
    public org.omg.schema.spec.bpmn.x20.TCorrelationSubscription addNewCorrelationSubscription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TCorrelationSubscription target = null;
            target = (org.omg.schema.spec.bpmn.x20.TCorrelationSubscription)get_store().add_element_user(CORRELATIONSUBSCRIPTION$0);
            return target;
        }
    }
}

/*
 * An XML document type.
 * Localname: implicitThrowEvent
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.ImplicitThrowEventDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one implicitThrowEvent(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class ImplicitThrowEventDocumentImpl extends org.omg.schema.spec.bpmn.x20.impl.FlowElementDocumentImpl implements org.omg.schema.spec.bpmn.x20.ImplicitThrowEventDocument
{
    private static final long serialVersionUID = 1L;
    
    public ImplicitThrowEventDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IMPLICITTHROWEVENT$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "implicitThrowEvent");
    
    
    /**
     * Gets the "implicitThrowEvent" element
     */
    public org.omg.schema.spec.bpmn.x20.TImplicitThrowEvent getImplicitThrowEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TImplicitThrowEvent target = null;
            target = (org.omg.schema.spec.bpmn.x20.TImplicitThrowEvent)get_store().find_element_user(IMPLICITTHROWEVENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "implicitThrowEvent" element
     */
    public void setImplicitThrowEvent(org.omg.schema.spec.bpmn.x20.TImplicitThrowEvent implicitThrowEvent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TImplicitThrowEvent target = null;
            target = (org.omg.schema.spec.bpmn.x20.TImplicitThrowEvent)get_store().find_element_user(IMPLICITTHROWEVENT$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TImplicitThrowEvent)get_store().add_element_user(IMPLICITTHROWEVENT$0);
            }
            target.set(implicitThrowEvent);
        }
    }
    
    /**
     * Appends and returns a new empty "implicitThrowEvent" element
     */
    public org.omg.schema.spec.bpmn.x20.TImplicitThrowEvent addNewImplicitThrowEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TImplicitThrowEvent target = null;
            target = (org.omg.schema.spec.bpmn.x20.TImplicitThrowEvent)get_store().add_element_user(IMPLICITTHROWEVENT$0);
            return target;
        }
    }
}

/*
 * An XML document type.
 * Localname: throwEvent
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.ThrowEventDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one throwEvent(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class ThrowEventDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.schema.spec.bpmn.x20.ThrowEventDocument
{
    private static final long serialVersionUID = 1L;
    
    public ThrowEventDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName THROWEVENT$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "throwEvent");
    
    
    /**
     * Gets the "throwEvent" element
     */
    public org.omg.schema.spec.bpmn.x20.TThrowEvent getThrowEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TThrowEvent target = null;
            target = (org.omg.schema.spec.bpmn.x20.TThrowEvent)get_store().find_element_user(THROWEVENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "throwEvent" element
     */
    public void setThrowEvent(org.omg.schema.spec.bpmn.x20.TThrowEvent throwEvent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TThrowEvent target = null;
            target = (org.omg.schema.spec.bpmn.x20.TThrowEvent)get_store().find_element_user(THROWEVENT$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TThrowEvent)get_store().add_element_user(THROWEVENT$0);
            }
            target.set(throwEvent);
        }
    }
    
    /**
     * Appends and returns a new empty "throwEvent" element
     */
    public org.omg.schema.spec.bpmn.x20.TThrowEvent addNewThrowEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TThrowEvent target = null;
            target = (org.omg.schema.spec.bpmn.x20.TThrowEvent)get_store().add_element_user(THROWEVENT$0);
            return target;
        }
    }
}

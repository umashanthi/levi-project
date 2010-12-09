/*
 * An XML document type.
 * Localname: catchEvent
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.CatchEventDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one catchEvent(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class CatchEventDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.schema.spec.bpmn.x20.CatchEventDocument
{
    private static final long serialVersionUID = 1L;
    
    public CatchEventDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CATCHEVENT$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "catchEvent");
    
    
    /**
     * Gets the "catchEvent" element
     */
    public org.omg.schema.spec.bpmn.x20.TCatchEvent getCatchEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TCatchEvent target = null;
            target = (org.omg.schema.spec.bpmn.x20.TCatchEvent)get_store().find_element_user(CATCHEVENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "catchEvent" element
     */
    public void setCatchEvent(org.omg.schema.spec.bpmn.x20.TCatchEvent catchEvent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TCatchEvent target = null;
            target = (org.omg.schema.spec.bpmn.x20.TCatchEvent)get_store().find_element_user(CATCHEVENT$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TCatchEvent)get_store().add_element_user(CATCHEVENT$0);
            }
            target.set(catchEvent);
        }
    }
    
    /**
     * Appends and returns a new empty "catchEvent" element
     */
    public org.omg.schema.spec.bpmn.x20.TCatchEvent addNewCatchEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TCatchEvent target = null;
            target = (org.omg.schema.spec.bpmn.x20.TCatchEvent)get_store().add_element_user(CATCHEVENT$0);
            return target;
        }
    }
}

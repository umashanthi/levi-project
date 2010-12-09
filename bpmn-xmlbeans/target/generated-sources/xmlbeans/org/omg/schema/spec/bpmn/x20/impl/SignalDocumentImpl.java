/*
 * An XML document type.
 * Localname: signal
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.SignalDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one signal(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class SignalDocumentImpl extends org.omg.schema.spec.bpmn.x20.impl.RootElementDocumentImpl implements org.omg.schema.spec.bpmn.x20.SignalDocument
{
    private static final long serialVersionUID = 1L;
    
    public SignalDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SIGNAL$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "signal");
    
    
    /**
     * Gets the "signal" element
     */
    public org.omg.schema.spec.bpmn.x20.TSignal getSignal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TSignal target = null;
            target = (org.omg.schema.spec.bpmn.x20.TSignal)get_store().find_element_user(SIGNAL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "signal" element
     */
    public void setSignal(org.omg.schema.spec.bpmn.x20.TSignal signal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TSignal target = null;
            target = (org.omg.schema.spec.bpmn.x20.TSignal)get_store().find_element_user(SIGNAL$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TSignal)get_store().add_element_user(SIGNAL$0);
            }
            target.set(signal);
        }
    }
    
    /**
     * Appends and returns a new empty "signal" element
     */
    public org.omg.schema.spec.bpmn.x20.TSignal addNewSignal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TSignal target = null;
            target = (org.omg.schema.spec.bpmn.x20.TSignal)get_store().add_element_user(SIGNAL$0);
            return target;
        }
    }
}

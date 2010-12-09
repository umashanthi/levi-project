/*
 * An XML document type.
 * Localname: ioBinding
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.IoBindingDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one ioBinding(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class IoBindingDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.schema.spec.bpmn.x20.IoBindingDocument
{
    private static final long serialVersionUID = 1L;
    
    public IoBindingDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IOBINDING$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "ioBinding");
    
    
    /**
     * Gets the "ioBinding" element
     */
    public org.omg.schema.spec.bpmn.x20.TInputOutputBinding getIoBinding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TInputOutputBinding target = null;
            target = (org.omg.schema.spec.bpmn.x20.TInputOutputBinding)get_store().find_element_user(IOBINDING$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ioBinding" element
     */
    public void setIoBinding(org.omg.schema.spec.bpmn.x20.TInputOutputBinding ioBinding)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TInputOutputBinding target = null;
            target = (org.omg.schema.spec.bpmn.x20.TInputOutputBinding)get_store().find_element_user(IOBINDING$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TInputOutputBinding)get_store().add_element_user(IOBINDING$0);
            }
            target.set(ioBinding);
        }
    }
    
    /**
     * Appends and returns a new empty "ioBinding" element
     */
    public org.omg.schema.spec.bpmn.x20.TInputOutputBinding addNewIoBinding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TInputOutputBinding target = null;
            target = (org.omg.schema.spec.bpmn.x20.TInputOutputBinding)get_store().add_element_user(IOBINDING$0);
            return target;
        }
    }
}

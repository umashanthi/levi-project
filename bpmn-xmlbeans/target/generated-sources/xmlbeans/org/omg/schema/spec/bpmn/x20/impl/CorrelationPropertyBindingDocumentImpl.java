/*
 * An XML document type.
 * Localname: correlationPropertyBinding
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.CorrelationPropertyBindingDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one correlationPropertyBinding(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class CorrelationPropertyBindingDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.schema.spec.bpmn.x20.CorrelationPropertyBindingDocument
{
    private static final long serialVersionUID = 1L;
    
    public CorrelationPropertyBindingDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CORRELATIONPROPERTYBINDING$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "correlationPropertyBinding");
    
    
    /**
     * Gets the "correlationPropertyBinding" element
     */
    public org.omg.schema.spec.bpmn.x20.TCorrelationPropertyBinding getCorrelationPropertyBinding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TCorrelationPropertyBinding target = null;
            target = (org.omg.schema.spec.bpmn.x20.TCorrelationPropertyBinding)get_store().find_element_user(CORRELATIONPROPERTYBINDING$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "correlationPropertyBinding" element
     */
    public void setCorrelationPropertyBinding(org.omg.schema.spec.bpmn.x20.TCorrelationPropertyBinding correlationPropertyBinding)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TCorrelationPropertyBinding target = null;
            target = (org.omg.schema.spec.bpmn.x20.TCorrelationPropertyBinding)get_store().find_element_user(CORRELATIONPROPERTYBINDING$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TCorrelationPropertyBinding)get_store().add_element_user(CORRELATIONPROPERTYBINDING$0);
            }
            target.set(correlationPropertyBinding);
        }
    }
    
    /**
     * Appends and returns a new empty "correlationPropertyBinding" element
     */
    public org.omg.schema.spec.bpmn.x20.TCorrelationPropertyBinding addNewCorrelationPropertyBinding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TCorrelationPropertyBinding target = null;
            target = (org.omg.schema.spec.bpmn.x20.TCorrelationPropertyBinding)get_store().add_element_user(CORRELATIONPROPERTYBINDING$0);
            return target;
        }
    }
}

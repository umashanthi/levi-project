/*
 * An XML document type.
 * Localname: correlationProperty
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.CorrelationPropertyDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one correlationProperty(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class CorrelationPropertyDocumentImpl extends org.omg.schema.spec.bpmn.x20.impl.RootElementDocumentImpl implements org.omg.schema.spec.bpmn.x20.CorrelationPropertyDocument
{
    private static final long serialVersionUID = 1L;
    
    public CorrelationPropertyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CORRELATIONPROPERTY$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "correlationProperty");
    
    
    /**
     * Gets the "correlationProperty" element
     */
    public org.omg.schema.spec.bpmn.x20.TCorrelationProperty getCorrelationProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TCorrelationProperty target = null;
            target = (org.omg.schema.spec.bpmn.x20.TCorrelationProperty)get_store().find_element_user(CORRELATIONPROPERTY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "correlationProperty" element
     */
    public void setCorrelationProperty(org.omg.schema.spec.bpmn.x20.TCorrelationProperty correlationProperty)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TCorrelationProperty target = null;
            target = (org.omg.schema.spec.bpmn.x20.TCorrelationProperty)get_store().find_element_user(CORRELATIONPROPERTY$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TCorrelationProperty)get_store().add_element_user(CORRELATIONPROPERTY$0);
            }
            target.set(correlationProperty);
        }
    }
    
    /**
     * Appends and returns a new empty "correlationProperty" element
     */
    public org.omg.schema.spec.bpmn.x20.TCorrelationProperty addNewCorrelationProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TCorrelationProperty target = null;
            target = (org.omg.schema.spec.bpmn.x20.TCorrelationProperty)get_store().add_element_user(CORRELATIONPROPERTY$0);
            return target;
        }
    }
}

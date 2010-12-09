/*
 * An XML document type.
 * Localname: correlationKey
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.CorrelationKeyDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one correlationKey(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class CorrelationKeyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.schema.spec.bpmn.x20.CorrelationKeyDocument
{
    private static final long serialVersionUID = 1L;
    
    public CorrelationKeyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CORRELATIONKEY$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "correlationKey");
    
    
    /**
     * Gets the "correlationKey" element
     */
    public org.omg.schema.spec.bpmn.x20.TCorrelationKey getCorrelationKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TCorrelationKey target = null;
            target = (org.omg.schema.spec.bpmn.x20.TCorrelationKey)get_store().find_element_user(CORRELATIONKEY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "correlationKey" element
     */
    public void setCorrelationKey(org.omg.schema.spec.bpmn.x20.TCorrelationKey correlationKey)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TCorrelationKey target = null;
            target = (org.omg.schema.spec.bpmn.x20.TCorrelationKey)get_store().find_element_user(CORRELATIONKEY$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TCorrelationKey)get_store().add_element_user(CORRELATIONKEY$0);
            }
            target.set(correlationKey);
        }
    }
    
    /**
     * Appends and returns a new empty "correlationKey" element
     */
    public org.omg.schema.spec.bpmn.x20.TCorrelationKey addNewCorrelationKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TCorrelationKey target = null;
            target = (org.omg.schema.spec.bpmn.x20.TCorrelationKey)get_store().add_element_user(CORRELATIONKEY$0);
            return target;
        }
    }
}

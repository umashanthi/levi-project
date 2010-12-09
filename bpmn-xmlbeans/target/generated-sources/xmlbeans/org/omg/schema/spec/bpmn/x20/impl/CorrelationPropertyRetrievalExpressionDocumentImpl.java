/*
 * An XML document type.
 * Localname: correlationPropertyRetrievalExpression
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.CorrelationPropertyRetrievalExpressionDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one correlationPropertyRetrievalExpression(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class CorrelationPropertyRetrievalExpressionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.schema.spec.bpmn.x20.CorrelationPropertyRetrievalExpressionDocument
{
    private static final long serialVersionUID = 1L;
    
    public CorrelationPropertyRetrievalExpressionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CORRELATIONPROPERTYRETRIEVALEXPRESSION$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "correlationPropertyRetrievalExpression");
    
    
    /**
     * Gets the "correlationPropertyRetrievalExpression" element
     */
    public org.omg.schema.spec.bpmn.x20.TCorrelationPropertyRetrievalExpression getCorrelationPropertyRetrievalExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TCorrelationPropertyRetrievalExpression target = null;
            target = (org.omg.schema.spec.bpmn.x20.TCorrelationPropertyRetrievalExpression)get_store().find_element_user(CORRELATIONPROPERTYRETRIEVALEXPRESSION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "correlationPropertyRetrievalExpression" element
     */
    public void setCorrelationPropertyRetrievalExpression(org.omg.schema.spec.bpmn.x20.TCorrelationPropertyRetrievalExpression correlationPropertyRetrievalExpression)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TCorrelationPropertyRetrievalExpression target = null;
            target = (org.omg.schema.spec.bpmn.x20.TCorrelationPropertyRetrievalExpression)get_store().find_element_user(CORRELATIONPROPERTYRETRIEVALEXPRESSION$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TCorrelationPropertyRetrievalExpression)get_store().add_element_user(CORRELATIONPROPERTYRETRIEVALEXPRESSION$0);
            }
            target.set(correlationPropertyRetrievalExpression);
        }
    }
    
    /**
     * Appends and returns a new empty "correlationPropertyRetrievalExpression" element
     */
    public org.omg.schema.spec.bpmn.x20.TCorrelationPropertyRetrievalExpression addNewCorrelationPropertyRetrievalExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TCorrelationPropertyRetrievalExpression target = null;
            target = (org.omg.schema.spec.bpmn.x20.TCorrelationPropertyRetrievalExpression)get_store().add_element_user(CORRELATIONPROPERTYRETRIEVALEXPRESSION$0);
            return target;
        }
    }
}

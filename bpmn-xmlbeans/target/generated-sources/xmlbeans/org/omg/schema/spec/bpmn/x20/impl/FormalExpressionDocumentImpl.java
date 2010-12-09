/*
 * An XML document type.
 * Localname: formalExpression
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.FormalExpressionDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one formalExpression(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class FormalExpressionDocumentImpl extends org.omg.schema.spec.bpmn.x20.impl.ExpressionDocumentImpl implements org.omg.schema.spec.bpmn.x20.FormalExpressionDocument
{
    private static final long serialVersionUID = 1L;
    
    public FormalExpressionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FORMALEXPRESSION$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "formalExpression");
    
    
    /**
     * Gets the "formalExpression" element
     */
    public org.omg.schema.spec.bpmn.x20.TFormalExpression getFormalExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TFormalExpression target = null;
            target = (org.omg.schema.spec.bpmn.x20.TFormalExpression)get_store().find_element_user(FORMALEXPRESSION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "formalExpression" element
     */
    public void setFormalExpression(org.omg.schema.spec.bpmn.x20.TFormalExpression formalExpression)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TFormalExpression target = null;
            target = (org.omg.schema.spec.bpmn.x20.TFormalExpression)get_store().find_element_user(FORMALEXPRESSION$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TFormalExpression)get_store().add_element_user(FORMALEXPRESSION$0);
            }
            target.set(formalExpression);
        }
    }
    
    /**
     * Appends and returns a new empty "formalExpression" element
     */
    public org.omg.schema.spec.bpmn.x20.TFormalExpression addNewFormalExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TFormalExpression target = null;
            target = (org.omg.schema.spec.bpmn.x20.TFormalExpression)get_store().add_element_user(FORMALEXPRESSION$0);
            return target;
        }
    }
}

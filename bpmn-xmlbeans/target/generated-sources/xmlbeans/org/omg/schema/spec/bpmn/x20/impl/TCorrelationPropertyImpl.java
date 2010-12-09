/*
 * XML Type:  tCorrelationProperty
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.TCorrelationProperty
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * An XML tCorrelationProperty(@http://schema.omg.org/spec/BPMN/2.0).
 *
 * This is a complex type.
 */
public class TCorrelationPropertyImpl extends org.omg.schema.spec.bpmn.x20.impl.TRootElementImpl implements org.omg.schema.spec.bpmn.x20.TCorrelationProperty
{
    private static final long serialVersionUID = 1L;
    
    public TCorrelationPropertyImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CORRELATIONPROPERTYRETRIEVALEXPRESSION$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "correlationPropertyRetrievalExpression");
    
    
    /**
     * Gets array of all "correlationPropertyRetrievalExpression" elements
     */
    public org.omg.schema.spec.bpmn.x20.TCorrelationPropertyRetrievalExpression[] getCorrelationPropertyRetrievalExpressionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CORRELATIONPROPERTYRETRIEVALEXPRESSION$0, targetList);
            org.omg.schema.spec.bpmn.x20.TCorrelationPropertyRetrievalExpression[] result = new org.omg.schema.spec.bpmn.x20.TCorrelationPropertyRetrievalExpression[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "correlationPropertyRetrievalExpression" element
     */
    public org.omg.schema.spec.bpmn.x20.TCorrelationPropertyRetrievalExpression getCorrelationPropertyRetrievalExpressionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TCorrelationPropertyRetrievalExpression target = null;
            target = (org.omg.schema.spec.bpmn.x20.TCorrelationPropertyRetrievalExpression)get_store().find_element_user(CORRELATIONPROPERTYRETRIEVALEXPRESSION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "correlationPropertyRetrievalExpression" element
     */
    public int sizeOfCorrelationPropertyRetrievalExpressionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CORRELATIONPROPERTYRETRIEVALEXPRESSION$0);
        }
    }
    
    /**
     * Sets array of all "correlationPropertyRetrievalExpression" element
     */
    public void setCorrelationPropertyRetrievalExpressionArray(org.omg.schema.spec.bpmn.x20.TCorrelationPropertyRetrievalExpression[] correlationPropertyRetrievalExpressionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(correlationPropertyRetrievalExpressionArray, CORRELATIONPROPERTYRETRIEVALEXPRESSION$0);
        }
    }
    
    /**
     * Sets ith "correlationPropertyRetrievalExpression" element
     */
    public void setCorrelationPropertyRetrievalExpressionArray(int i, org.omg.schema.spec.bpmn.x20.TCorrelationPropertyRetrievalExpression correlationPropertyRetrievalExpression)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TCorrelationPropertyRetrievalExpression target = null;
            target = (org.omg.schema.spec.bpmn.x20.TCorrelationPropertyRetrievalExpression)get_store().find_element_user(CORRELATIONPROPERTYRETRIEVALEXPRESSION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(correlationPropertyRetrievalExpression);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "correlationPropertyRetrievalExpression" element
     */
    public org.omg.schema.spec.bpmn.x20.TCorrelationPropertyRetrievalExpression insertNewCorrelationPropertyRetrievalExpression(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TCorrelationPropertyRetrievalExpression target = null;
            target = (org.omg.schema.spec.bpmn.x20.TCorrelationPropertyRetrievalExpression)get_store().insert_element_user(CORRELATIONPROPERTYRETRIEVALEXPRESSION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "correlationPropertyRetrievalExpression" element
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
    
    /**
     * Removes the ith "correlationPropertyRetrievalExpression" element
     */
    public void removeCorrelationPropertyRetrievalExpression(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CORRELATIONPROPERTYRETRIEVALEXPRESSION$0, i);
        }
    }
}

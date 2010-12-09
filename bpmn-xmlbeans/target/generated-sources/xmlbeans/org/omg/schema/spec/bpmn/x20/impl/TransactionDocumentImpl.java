/*
 * An XML document type.
 * Localname: transaction
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.TransactionDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one transaction(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class TransactionDocumentImpl extends org.omg.schema.spec.bpmn.x20.impl.FlowElementDocumentImpl implements org.omg.schema.spec.bpmn.x20.TransactionDocument
{
    private static final long serialVersionUID = 1L;
    
    public TransactionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TRANSACTION$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "transaction");
    
    
    /**
     * Gets the "transaction" element
     */
    public org.omg.schema.spec.bpmn.x20.TTransaction getTransaction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TTransaction target = null;
            target = (org.omg.schema.spec.bpmn.x20.TTransaction)get_store().find_element_user(TRANSACTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "transaction" element
     */
    public void setTransaction(org.omg.schema.spec.bpmn.x20.TTransaction transaction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TTransaction target = null;
            target = (org.omg.schema.spec.bpmn.x20.TTransaction)get_store().find_element_user(TRANSACTION$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TTransaction)get_store().add_element_user(TRANSACTION$0);
            }
            target.set(transaction);
        }
    }
    
    /**
     * Appends and returns a new empty "transaction" element
     */
    public org.omg.schema.spec.bpmn.x20.TTransaction addNewTransaction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TTransaction target = null;
            target = (org.omg.schema.spec.bpmn.x20.TTransaction)get_store().add_element_user(TRANSACTION$0);
            return target;
        }
    }
}

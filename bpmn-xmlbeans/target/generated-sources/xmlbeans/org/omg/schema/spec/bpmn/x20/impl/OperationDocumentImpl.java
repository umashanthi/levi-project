/*
 * An XML document type.
 * Localname: operation
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.OperationDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one operation(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class OperationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.schema.spec.bpmn.x20.OperationDocument
{
    private static final long serialVersionUID = 1L;
    
    public OperationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OPERATION$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "operation");
    
    
    /**
     * Gets the "operation" element
     */
    public org.omg.schema.spec.bpmn.x20.TOperation getOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TOperation target = null;
            target = (org.omg.schema.spec.bpmn.x20.TOperation)get_store().find_element_user(OPERATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "operation" element
     */
    public void setOperation(org.omg.schema.spec.bpmn.x20.TOperation operation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TOperation target = null;
            target = (org.omg.schema.spec.bpmn.x20.TOperation)get_store().find_element_user(OPERATION$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TOperation)get_store().add_element_user(OPERATION$0);
            }
            target.set(operation);
        }
    }
    
    /**
     * Appends and returns a new empty "operation" element
     */
    public org.omg.schema.spec.bpmn.x20.TOperation addNewOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TOperation target = null;
            target = (org.omg.schema.spec.bpmn.x20.TOperation)get_store().add_element_user(OPERATION$0);
            return target;
        }
    }
}

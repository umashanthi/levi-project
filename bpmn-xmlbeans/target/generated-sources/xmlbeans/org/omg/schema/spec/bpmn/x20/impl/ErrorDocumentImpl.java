/*
 * An XML document type.
 * Localname: error
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.ErrorDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one error(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class ErrorDocumentImpl extends org.omg.schema.spec.bpmn.x20.impl.RootElementDocumentImpl implements org.omg.schema.spec.bpmn.x20.ErrorDocument
{
    private static final long serialVersionUID = 1L;
    
    public ErrorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ERROR$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "error");
    
    
    /**
     * Gets the "error" element
     */
    public org.omg.schema.spec.bpmn.x20.TError getError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TError target = null;
            target = (org.omg.schema.spec.bpmn.x20.TError)get_store().find_element_user(ERROR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "error" element
     */
    public void setError(org.omg.schema.spec.bpmn.x20.TError error)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TError target = null;
            target = (org.omg.schema.spec.bpmn.x20.TError)get_store().find_element_user(ERROR$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TError)get_store().add_element_user(ERROR$0);
            }
            target.set(error);
        }
    }
    
    /**
     * Appends and returns a new empty "error" element
     */
    public org.omg.schema.spec.bpmn.x20.TError addNewError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TError target = null;
            target = (org.omg.schema.spec.bpmn.x20.TError)get_store().add_element_user(ERROR$0);
            return target;
        }
    }
}

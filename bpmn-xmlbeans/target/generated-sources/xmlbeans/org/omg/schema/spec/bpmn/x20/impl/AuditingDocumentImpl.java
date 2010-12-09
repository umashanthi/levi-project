/*
 * An XML document type.
 * Localname: auditing
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.AuditingDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one auditing(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class AuditingDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.schema.spec.bpmn.x20.AuditingDocument
{
    private static final long serialVersionUID = 1L;
    
    public AuditingDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AUDITING$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "auditing");
    
    
    /**
     * Gets the "auditing" element
     */
    public org.omg.schema.spec.bpmn.x20.TAuditing getAuditing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TAuditing target = null;
            target = (org.omg.schema.spec.bpmn.x20.TAuditing)get_store().find_element_user(AUDITING$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "auditing" element
     */
    public void setAuditing(org.omg.schema.spec.bpmn.x20.TAuditing auditing)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TAuditing target = null;
            target = (org.omg.schema.spec.bpmn.x20.TAuditing)get_store().find_element_user(AUDITING$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TAuditing)get_store().add_element_user(AUDITING$0);
            }
            target.set(auditing);
        }
    }
    
    /**
     * Appends and returns a new empty "auditing" element
     */
    public org.omg.schema.spec.bpmn.x20.TAuditing addNewAuditing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TAuditing target = null;
            target = (org.omg.schema.spec.bpmn.x20.TAuditing)get_store().add_element_user(AUDITING$0);
            return target;
        }
    }
}

/*
 * An XML document type.
 * Localname: assignment
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.AssignmentDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one assignment(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class AssignmentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.schema.spec.bpmn.x20.AssignmentDocument
{
    private static final long serialVersionUID = 1L;
    
    public AssignmentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ASSIGNMENT$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "assignment");
    
    
    /**
     * Gets the "assignment" element
     */
    public org.omg.schema.spec.bpmn.x20.TAssignment getAssignment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TAssignment target = null;
            target = (org.omg.schema.spec.bpmn.x20.TAssignment)get_store().find_element_user(ASSIGNMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "assignment" element
     */
    public void setAssignment(org.omg.schema.spec.bpmn.x20.TAssignment assignment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TAssignment target = null;
            target = (org.omg.schema.spec.bpmn.x20.TAssignment)get_store().find_element_user(ASSIGNMENT$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TAssignment)get_store().add_element_user(ASSIGNMENT$0);
            }
            target.set(assignment);
        }
    }
    
    /**
     * Appends and returns a new empty "assignment" element
     */
    public org.omg.schema.spec.bpmn.x20.TAssignment addNewAssignment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TAssignment target = null;
            target = (org.omg.schema.spec.bpmn.x20.TAssignment)get_store().add_element_user(ASSIGNMENT$0);
            return target;
        }
    }
}

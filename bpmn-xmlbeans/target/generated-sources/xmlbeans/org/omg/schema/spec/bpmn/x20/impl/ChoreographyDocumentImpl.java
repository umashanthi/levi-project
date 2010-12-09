/*
 * An XML document type.
 * Localname: choreography
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.ChoreographyDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one choreography(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class ChoreographyDocumentImpl extends org.omg.schema.spec.bpmn.x20.impl.RootElementDocumentImpl implements org.omg.schema.spec.bpmn.x20.ChoreographyDocument
{
    private static final long serialVersionUID = 1L;
    
    public ChoreographyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CHOREOGRAPHY$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "choreography");
    
    
    /**
     * Gets the "choreography" element
     */
    public org.omg.schema.spec.bpmn.x20.TChoreography getChoreography()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TChoreography target = null;
            target = (org.omg.schema.spec.bpmn.x20.TChoreography)get_store().find_element_user(CHOREOGRAPHY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "choreography" element
     */
    public void setChoreography(org.omg.schema.spec.bpmn.x20.TChoreography choreography)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TChoreography target = null;
            target = (org.omg.schema.spec.bpmn.x20.TChoreography)get_store().find_element_user(CHOREOGRAPHY$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TChoreography)get_store().add_element_user(CHOREOGRAPHY$0);
            }
            target.set(choreography);
        }
    }
    
    /**
     * Appends and returns a new empty "choreography" element
     */
    public org.omg.schema.spec.bpmn.x20.TChoreography addNewChoreography()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TChoreography target = null;
            target = (org.omg.schema.spec.bpmn.x20.TChoreography)get_store().add_element_user(CHOREOGRAPHY$0);
            return target;
        }
    }
}

/*
 * An XML document type.
 * Localname: potentialOwner
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.PotentialOwnerDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one potentialOwner(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class PotentialOwnerDocumentImpl extends org.omg.schema.spec.bpmn.x20.impl.PerformerDocumentImpl implements org.omg.schema.spec.bpmn.x20.PotentialOwnerDocument
{
    private static final long serialVersionUID = 1L;
    
    public PotentialOwnerDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POTENTIALOWNER$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "potentialOwner");
    
    
    /**
     * Gets the "potentialOwner" element
     */
    public org.omg.schema.spec.bpmn.x20.TPotentialOwner getPotentialOwner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TPotentialOwner target = null;
            target = (org.omg.schema.spec.bpmn.x20.TPotentialOwner)get_store().find_element_user(POTENTIALOWNER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "potentialOwner" element
     */
    public void setPotentialOwner(org.omg.schema.spec.bpmn.x20.TPotentialOwner potentialOwner)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TPotentialOwner target = null;
            target = (org.omg.schema.spec.bpmn.x20.TPotentialOwner)get_store().find_element_user(POTENTIALOWNER$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TPotentialOwner)get_store().add_element_user(POTENTIALOWNER$0);
            }
            target.set(potentialOwner);
        }
    }
    
    /**
     * Appends and returns a new empty "potentialOwner" element
     */
    public org.omg.schema.spec.bpmn.x20.TPotentialOwner addNewPotentialOwner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TPotentialOwner target = null;
            target = (org.omg.schema.spec.bpmn.x20.TPotentialOwner)get_store().add_element_user(POTENTIALOWNER$0);
            return target;
        }
    }
}

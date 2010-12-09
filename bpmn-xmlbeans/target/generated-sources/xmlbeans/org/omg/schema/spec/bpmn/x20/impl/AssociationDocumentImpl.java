/*
 * An XML document type.
 * Localname: association
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.AssociationDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one association(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class AssociationDocumentImpl extends org.omg.schema.spec.bpmn.x20.impl.ArtifactDocumentImpl implements org.omg.schema.spec.bpmn.x20.AssociationDocument
{
    private static final long serialVersionUID = 1L;
    
    public AssociationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ASSOCIATION$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "association");
    
    
    /**
     * Gets the "association" element
     */
    public org.omg.schema.spec.bpmn.x20.TAssociation getAssociation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TAssociation target = null;
            target = (org.omg.schema.spec.bpmn.x20.TAssociation)get_store().find_element_user(ASSOCIATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "association" element
     */
    public void setAssociation(org.omg.schema.spec.bpmn.x20.TAssociation association)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TAssociation target = null;
            target = (org.omg.schema.spec.bpmn.x20.TAssociation)get_store().find_element_user(ASSOCIATION$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TAssociation)get_store().add_element_user(ASSOCIATION$0);
            }
            target.set(association);
        }
    }
    
    /**
     * Appends and returns a new empty "association" element
     */
    public org.omg.schema.spec.bpmn.x20.TAssociation addNewAssociation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TAssociation target = null;
            target = (org.omg.schema.spec.bpmn.x20.TAssociation)get_store().add_element_user(ASSOCIATION$0);
            return target;
        }
    }
}

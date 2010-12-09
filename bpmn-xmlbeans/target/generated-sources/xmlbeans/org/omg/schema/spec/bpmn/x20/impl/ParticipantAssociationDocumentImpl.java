/*
 * An XML document type.
 * Localname: participantAssociation
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.ParticipantAssociationDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one participantAssociation(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class ParticipantAssociationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.schema.spec.bpmn.x20.ParticipantAssociationDocument
{
    private static final long serialVersionUID = 1L;
    
    public ParticipantAssociationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARTICIPANTASSOCIATION$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "participantAssociation");
    
    
    /**
     * Gets the "participantAssociation" element
     */
    public org.omg.schema.spec.bpmn.x20.TParticipantAssociation getParticipantAssociation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TParticipantAssociation target = null;
            target = (org.omg.schema.spec.bpmn.x20.TParticipantAssociation)get_store().find_element_user(PARTICIPANTASSOCIATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "participantAssociation" element
     */
    public void setParticipantAssociation(org.omg.schema.spec.bpmn.x20.TParticipantAssociation participantAssociation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TParticipantAssociation target = null;
            target = (org.omg.schema.spec.bpmn.x20.TParticipantAssociation)get_store().find_element_user(PARTICIPANTASSOCIATION$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TParticipantAssociation)get_store().add_element_user(PARTICIPANTASSOCIATION$0);
            }
            target.set(participantAssociation);
        }
    }
    
    /**
     * Appends and returns a new empty "participantAssociation" element
     */
    public org.omg.schema.spec.bpmn.x20.TParticipantAssociation addNewParticipantAssociation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TParticipantAssociation target = null;
            target = (org.omg.schema.spec.bpmn.x20.TParticipantAssociation)get_store().add_element_user(PARTICIPANTASSOCIATION$0);
            return target;
        }
    }
}

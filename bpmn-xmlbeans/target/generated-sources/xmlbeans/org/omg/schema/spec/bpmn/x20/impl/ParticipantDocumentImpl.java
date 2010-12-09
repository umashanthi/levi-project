/*
 * An XML document type.
 * Localname: participant
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.ParticipantDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one participant(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class ParticipantDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.schema.spec.bpmn.x20.ParticipantDocument
{
    private static final long serialVersionUID = 1L;
    
    public ParticipantDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARTICIPANT$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "participant");
    
    
    /**
     * Gets the "participant" element
     */
    public org.omg.schema.spec.bpmn.x20.TParticipant getParticipant()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TParticipant target = null;
            target = (org.omg.schema.spec.bpmn.x20.TParticipant)get_store().find_element_user(PARTICIPANT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "participant" element
     */
    public void setParticipant(org.omg.schema.spec.bpmn.x20.TParticipant participant)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TParticipant target = null;
            target = (org.omg.schema.spec.bpmn.x20.TParticipant)get_store().find_element_user(PARTICIPANT$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TParticipant)get_store().add_element_user(PARTICIPANT$0);
            }
            target.set(participant);
        }
    }
    
    /**
     * Appends and returns a new empty "participant" element
     */
    public org.omg.schema.spec.bpmn.x20.TParticipant addNewParticipant()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TParticipant target = null;
            target = (org.omg.schema.spec.bpmn.x20.TParticipant)get_store().add_element_user(PARTICIPANT$0);
            return target;
        }
    }
}

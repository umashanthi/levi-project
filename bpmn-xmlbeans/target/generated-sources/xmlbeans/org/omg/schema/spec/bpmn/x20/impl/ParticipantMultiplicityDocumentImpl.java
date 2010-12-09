/*
 * An XML document type.
 * Localname: participantMultiplicity
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.ParticipantMultiplicityDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one participantMultiplicity(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class ParticipantMultiplicityDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.schema.spec.bpmn.x20.ParticipantMultiplicityDocument
{
    private static final long serialVersionUID = 1L;
    
    public ParticipantMultiplicityDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARTICIPANTMULTIPLICITY$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "participantMultiplicity");
    
    
    /**
     * Gets the "participantMultiplicity" element
     */
    public org.omg.schema.spec.bpmn.x20.TParticipantMultiplicity getParticipantMultiplicity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TParticipantMultiplicity target = null;
            target = (org.omg.schema.spec.bpmn.x20.TParticipantMultiplicity)get_store().find_element_user(PARTICIPANTMULTIPLICITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "participantMultiplicity" element
     */
    public void setParticipantMultiplicity(org.omg.schema.spec.bpmn.x20.TParticipantMultiplicity participantMultiplicity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TParticipantMultiplicity target = null;
            target = (org.omg.schema.spec.bpmn.x20.TParticipantMultiplicity)get_store().find_element_user(PARTICIPANTMULTIPLICITY$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TParticipantMultiplicity)get_store().add_element_user(PARTICIPANTMULTIPLICITY$0);
            }
            target.set(participantMultiplicity);
        }
    }
    
    /**
     * Appends and returns a new empty "participantMultiplicity" element
     */
    public org.omg.schema.spec.bpmn.x20.TParticipantMultiplicity addNewParticipantMultiplicity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TParticipantMultiplicity target = null;
            target = (org.omg.schema.spec.bpmn.x20.TParticipantMultiplicity)get_store().add_element_user(PARTICIPANTMULTIPLICITY$0);
            return target;
        }
    }
}

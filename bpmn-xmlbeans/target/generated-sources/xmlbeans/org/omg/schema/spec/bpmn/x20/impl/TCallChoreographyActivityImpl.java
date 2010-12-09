/*
 * XML Type:  tCallChoreographyActivity
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.TCallChoreographyActivity
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * An XML tCallChoreographyActivity(@http://schema.omg.org/spec/BPMN/2.0).
 *
 * This is a complex type.
 */
public class TCallChoreographyActivityImpl extends org.omg.schema.spec.bpmn.x20.impl.TChoreographyActivityImpl implements org.omg.schema.spec.bpmn.x20.TCallChoreographyActivity
{
    private static final long serialVersionUID = 1L;
    
    public TCallChoreographyActivityImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARTICIPANTASSOCIATION$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "participantAssociation");
    private static final javax.xml.namespace.QName CALLEDELEMENT$2 = 
        new javax.xml.namespace.QName("", "calledElement");
    
    
    /**
     * Gets array of all "participantAssociation" elements
     */
    public org.omg.schema.spec.bpmn.x20.TParticipantAssociation[] getParticipantAssociationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PARTICIPANTASSOCIATION$0, targetList);
            org.omg.schema.spec.bpmn.x20.TParticipantAssociation[] result = new org.omg.schema.spec.bpmn.x20.TParticipantAssociation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "participantAssociation" element
     */
    public org.omg.schema.spec.bpmn.x20.TParticipantAssociation getParticipantAssociationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TParticipantAssociation target = null;
            target = (org.omg.schema.spec.bpmn.x20.TParticipantAssociation)get_store().find_element_user(PARTICIPANTASSOCIATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "participantAssociation" element
     */
    public int sizeOfParticipantAssociationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARTICIPANTASSOCIATION$0);
        }
    }
    
    /**
     * Sets array of all "participantAssociation" element
     */
    public void setParticipantAssociationArray(org.omg.schema.spec.bpmn.x20.TParticipantAssociation[] participantAssociationArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(participantAssociationArray, PARTICIPANTASSOCIATION$0);
        }
    }
    
    /**
     * Sets ith "participantAssociation" element
     */
    public void setParticipantAssociationArray(int i, org.omg.schema.spec.bpmn.x20.TParticipantAssociation participantAssociation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TParticipantAssociation target = null;
            target = (org.omg.schema.spec.bpmn.x20.TParticipantAssociation)get_store().find_element_user(PARTICIPANTASSOCIATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(participantAssociation);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "participantAssociation" element
     */
    public org.omg.schema.spec.bpmn.x20.TParticipantAssociation insertNewParticipantAssociation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TParticipantAssociation target = null;
            target = (org.omg.schema.spec.bpmn.x20.TParticipantAssociation)get_store().insert_element_user(PARTICIPANTASSOCIATION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "participantAssociation" element
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
    
    /**
     * Removes the ith "participantAssociation" element
     */
    public void removeParticipantAssociation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARTICIPANTASSOCIATION$0, i);
        }
    }
    
    /**
     * Gets the "calledElement" attribute
     */
    public javax.xml.namespace.QName getCalledElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CALLEDELEMENT$2);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "calledElement" attribute
     */
    public org.apache.xmlbeans.XmlQName xgetCalledElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(CALLEDELEMENT$2);
            return target;
        }
    }
    
    /**
     * True if has "calledElement" attribute
     */
    public boolean isSetCalledElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CALLEDELEMENT$2) != null;
        }
    }
    
    /**
     * Sets the "calledElement" attribute
     */
    public void setCalledElement(javax.xml.namespace.QName calledElement)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CALLEDELEMENT$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CALLEDELEMENT$2);
            }
            target.setQNameValue(calledElement);
        }
    }
    
    /**
     * Sets (as xml) the "calledElement" attribute
     */
    public void xsetCalledElement(org.apache.xmlbeans.XmlQName calledElement)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(CALLEDELEMENT$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(CALLEDELEMENT$2);
            }
            target.set(calledElement);
        }
    }
    
    /**
     * Unsets the "calledElement" attribute
     */
    public void unsetCalledElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CALLEDELEMENT$2);
        }
    }
}

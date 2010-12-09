/*
 * XML Type:  tCallConversation
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.TCallConversation
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * An XML tCallConversation(@http://schema.omg.org/spec/BPMN/2.0).
 *
 * This is a complex type.
 */
public class TCallConversationImpl extends org.omg.schema.spec.bpmn.x20.impl.TConversationNodeImpl implements org.omg.schema.spec.bpmn.x20.TCallConversation
{
    private static final long serialVersionUID = 1L;
    
    public TCallConversationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARTICIPANTASSOCIATION$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "participantAssociation");
    private static final javax.xml.namespace.QName CALLEDELEMENTREF$2 = 
        new javax.xml.namespace.QName("", "calledElementRef");
    
    
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
     * Gets the "calledElementRef" attribute
     */
    public javax.xml.namespace.QName getCalledElementRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CALLEDELEMENTREF$2);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "calledElementRef" attribute
     */
    public org.apache.xmlbeans.XmlQName xgetCalledElementRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(CALLEDELEMENTREF$2);
            return target;
        }
    }
    
    /**
     * True if has "calledElementRef" attribute
     */
    public boolean isSetCalledElementRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CALLEDELEMENTREF$2) != null;
        }
    }
    
    /**
     * Sets the "calledElementRef" attribute
     */
    public void setCalledElementRef(javax.xml.namespace.QName calledElementRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CALLEDELEMENTREF$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CALLEDELEMENTREF$2);
            }
            target.setQNameValue(calledElementRef);
        }
    }
    
    /**
     * Sets (as xml) the "calledElementRef" attribute
     */
    public void xsetCalledElementRef(org.apache.xmlbeans.XmlQName calledElementRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(CALLEDELEMENTREF$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(CALLEDELEMENTREF$2);
            }
            target.set(calledElementRef);
        }
    }
    
    /**
     * Unsets the "calledElementRef" attribute
     */
    public void unsetCalledElementRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CALLEDELEMENTREF$2);
        }
    }
}

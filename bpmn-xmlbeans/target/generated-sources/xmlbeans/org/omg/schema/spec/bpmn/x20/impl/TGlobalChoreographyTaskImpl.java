/*
 * XML Type:  tGlobalChoreographyTask
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.TGlobalChoreographyTask
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * An XML tGlobalChoreographyTask(@http://schema.omg.org/spec/BPMN/2.0).
 *
 * This is a complex type.
 */
public class TGlobalChoreographyTaskImpl extends org.omg.schema.spec.bpmn.x20.impl.TCallableElementImpl implements org.omg.schema.spec.bpmn.x20.TGlobalChoreographyTask
{
    private static final long serialVersionUID = 1L;
    
    public TGlobalChoreographyTaskImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARTICIPANT$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "participant");
    private static final javax.xml.namespace.QName MESSAGEFLOW$2 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "messageFlow");
    private static final javax.xml.namespace.QName INITIATINGPARTICIPANTREF$4 = 
        new javax.xml.namespace.QName("", "initiatingParticipantRef");
    
    
    /**
     * Gets array of all "participant" elements
     */
    public org.omg.schema.spec.bpmn.x20.TParticipant[] getParticipantArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PARTICIPANT$0, targetList);
            org.omg.schema.spec.bpmn.x20.TParticipant[] result = new org.omg.schema.spec.bpmn.x20.TParticipant[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "participant" element
     */
    public org.omg.schema.spec.bpmn.x20.TParticipant getParticipantArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TParticipant target = null;
            target = (org.omg.schema.spec.bpmn.x20.TParticipant)get_store().find_element_user(PARTICIPANT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "participant" element
     */
    public int sizeOfParticipantArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARTICIPANT$0);
        }
    }
    
    /**
     * Sets array of all "participant" element
     */
    public void setParticipantArray(org.omg.schema.spec.bpmn.x20.TParticipant[] participantArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(participantArray, PARTICIPANT$0);
        }
    }
    
    /**
     * Sets ith "participant" element
     */
    public void setParticipantArray(int i, org.omg.schema.spec.bpmn.x20.TParticipant participant)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TParticipant target = null;
            target = (org.omg.schema.spec.bpmn.x20.TParticipant)get_store().find_element_user(PARTICIPANT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(participant);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "participant" element
     */
    public org.omg.schema.spec.bpmn.x20.TParticipant insertNewParticipant(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TParticipant target = null;
            target = (org.omg.schema.spec.bpmn.x20.TParticipant)get_store().insert_element_user(PARTICIPANT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "participant" element
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
    
    /**
     * Removes the ith "participant" element
     */
    public void removeParticipant(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARTICIPANT$0, i);
        }
    }
    
    /**
     * Gets array of all "messageFlow" elements
     */
    public org.omg.schema.spec.bpmn.x20.TMessageFlow[] getMessageFlowArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MESSAGEFLOW$2, targetList);
            org.omg.schema.spec.bpmn.x20.TMessageFlow[] result = new org.omg.schema.spec.bpmn.x20.TMessageFlow[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "messageFlow" element
     */
    public org.omg.schema.spec.bpmn.x20.TMessageFlow getMessageFlowArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TMessageFlow target = null;
            target = (org.omg.schema.spec.bpmn.x20.TMessageFlow)get_store().find_element_user(MESSAGEFLOW$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "messageFlow" element
     */
    public int sizeOfMessageFlowArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MESSAGEFLOW$2);
        }
    }
    
    /**
     * Sets array of all "messageFlow" element
     */
    public void setMessageFlowArray(org.omg.schema.spec.bpmn.x20.TMessageFlow[] messageFlowArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(messageFlowArray, MESSAGEFLOW$2);
        }
    }
    
    /**
     * Sets ith "messageFlow" element
     */
    public void setMessageFlowArray(int i, org.omg.schema.spec.bpmn.x20.TMessageFlow messageFlow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TMessageFlow target = null;
            target = (org.omg.schema.spec.bpmn.x20.TMessageFlow)get_store().find_element_user(MESSAGEFLOW$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(messageFlow);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "messageFlow" element
     */
    public org.omg.schema.spec.bpmn.x20.TMessageFlow insertNewMessageFlow(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TMessageFlow target = null;
            target = (org.omg.schema.spec.bpmn.x20.TMessageFlow)get_store().insert_element_user(MESSAGEFLOW$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "messageFlow" element
     */
    public org.omg.schema.spec.bpmn.x20.TMessageFlow addNewMessageFlow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TMessageFlow target = null;
            target = (org.omg.schema.spec.bpmn.x20.TMessageFlow)get_store().add_element_user(MESSAGEFLOW$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "messageFlow" element
     */
    public void removeMessageFlow(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MESSAGEFLOW$2, i);
        }
    }
    
    /**
     * Gets the "initiatingParticipantRef" attribute
     */
    public javax.xml.namespace.QName getInitiatingParticipantRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INITIATINGPARTICIPANTREF$4);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "initiatingParticipantRef" attribute
     */
    public org.apache.xmlbeans.XmlQName xgetInitiatingParticipantRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(INITIATINGPARTICIPANTREF$4);
            return target;
        }
    }
    
    /**
     * True if has "initiatingParticipantRef" attribute
     */
    public boolean isSetInitiatingParticipantRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(INITIATINGPARTICIPANTREF$4) != null;
        }
    }
    
    /**
     * Sets the "initiatingParticipantRef" attribute
     */
    public void setInitiatingParticipantRef(javax.xml.namespace.QName initiatingParticipantRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INITIATINGPARTICIPANTREF$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INITIATINGPARTICIPANTREF$4);
            }
            target.setQNameValue(initiatingParticipantRef);
        }
    }
    
    /**
     * Sets (as xml) the "initiatingParticipantRef" attribute
     */
    public void xsetInitiatingParticipantRef(org.apache.xmlbeans.XmlQName initiatingParticipantRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(INITIATINGPARTICIPANTREF$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(INITIATINGPARTICIPANTREF$4);
            }
            target.set(initiatingParticipantRef);
        }
    }
    
    /**
     * Unsets the "initiatingParticipantRef" attribute
     */
    public void unsetInitiatingParticipantRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(INITIATINGPARTICIPANTREF$4);
        }
    }
}

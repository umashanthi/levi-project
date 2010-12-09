/*
 * XML Type:  tChoreographyActivity
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.TChoreographyActivity
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * An XML tChoreographyActivity(@http://schema.omg.org/spec/BPMN/2.0).
 *
 * This is a complex type.
 */
public class TChoreographyActivityImpl extends org.omg.schema.spec.bpmn.x20.impl.TFlowNodeImpl implements org.omg.schema.spec.bpmn.x20.TChoreographyActivity
{
    private static final long serialVersionUID = 1L;
    
    public TChoreographyActivityImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARTICIPANTREF$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "participantRef");
    private static final javax.xml.namespace.QName INITIATINGPARTICIPANTREF$2 = 
        new javax.xml.namespace.QName("", "initiatingParticipantRef");
    
    
    /**
     * Gets array of all "participantRef" elements
     */
    public javax.xml.namespace.QName[] getParticipantRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PARTICIPANTREF$0, targetList);
            javax.xml.namespace.QName[] result = new javax.xml.namespace.QName[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getQNameValue();
            return result;
        }
    }
    
    /**
     * Gets ith "participantRef" element
     */
    public javax.xml.namespace.QName getParticipantRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARTICIPANTREF$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "participantRef" elements
     */
    public org.apache.xmlbeans.XmlQName[] xgetParticipantRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PARTICIPANTREF$0, targetList);
            org.apache.xmlbeans.XmlQName[] result = new org.apache.xmlbeans.XmlQName[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "participantRef" element
     */
    public org.apache.xmlbeans.XmlQName xgetParticipantRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(PARTICIPANTREF$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlQName)target;
        }
    }
    
    /**
     * Returns number of "participantRef" element
     */
    public int sizeOfParticipantRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARTICIPANTREF$0);
        }
    }
    
    /**
     * Sets array of all "participantRef" element
     */
    public void setParticipantRefArray(javax.xml.namespace.QName[] participantRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(participantRefArray, PARTICIPANTREF$0);
        }
    }
    
    /**
     * Sets ith "participantRef" element
     */
    public void setParticipantRefArray(int i, javax.xml.namespace.QName participantRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARTICIPANTREF$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setQNameValue(participantRef);
        }
    }
    
    /**
     * Sets (as xml) array of all "participantRef" element
     */
    public void xsetParticipantRefArray(org.apache.xmlbeans.XmlQName[]participantRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(participantRefArray, PARTICIPANTREF$0);
        }
    }
    
    /**
     * Sets (as xml) ith "participantRef" element
     */
    public void xsetParticipantRefArray(int i, org.apache.xmlbeans.XmlQName participantRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(PARTICIPANTREF$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(participantRef);
        }
    }
    
    /**
     * Inserts the value as the ith "participantRef" element
     */
    public void insertParticipantRef(int i, javax.xml.namespace.QName participantRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PARTICIPANTREF$0, i);
            target.setQNameValue(participantRef);
        }
    }
    
    /**
     * Appends the value as the last "participantRef" element
     */
    public void addParticipantRef(javax.xml.namespace.QName participantRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARTICIPANTREF$0);
            target.setQNameValue(participantRef);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "participantRef" element
     */
    public org.apache.xmlbeans.XmlQName insertNewParticipantRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().insert_element_user(PARTICIPANTREF$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "participantRef" element
     */
    public org.apache.xmlbeans.XmlQName addNewParticipantRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().add_element_user(PARTICIPANTREF$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "participantRef" element
     */
    public void removeParticipantRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARTICIPANTREF$0, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INITIATINGPARTICIPANTREF$2);
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
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(INITIATINGPARTICIPANTREF$2);
            return target;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INITIATINGPARTICIPANTREF$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INITIATINGPARTICIPANTREF$2);
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
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(INITIATINGPARTICIPANTREF$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(INITIATINGPARTICIPANTREF$2);
            }
            target.set(initiatingParticipantRef);
        }
    }
}

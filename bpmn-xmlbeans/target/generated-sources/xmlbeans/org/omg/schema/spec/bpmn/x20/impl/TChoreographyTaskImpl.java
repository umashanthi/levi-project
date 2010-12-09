/*
 * XML Type:  tChoreographyTask
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.TChoreographyTask
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * An XML tChoreographyTask(@http://schema.omg.org/spec/BPMN/2.0).
 *
 * This is a complex type.
 */
public class TChoreographyTaskImpl extends org.omg.schema.spec.bpmn.x20.impl.TChoreographyActivityImpl implements org.omg.schema.spec.bpmn.x20.TChoreographyTask
{
    private static final long serialVersionUID = 1L;
    
    public TChoreographyTaskImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MESSAGEFLOWREF$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "messageFlowRef");
    
    
    /**
     * Gets array of all "messageFlowRef" elements
     */
    public javax.xml.namespace.QName[] getMessageFlowRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MESSAGEFLOWREF$0, targetList);
            javax.xml.namespace.QName[] result = new javax.xml.namespace.QName[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getQNameValue();
            return result;
        }
    }
    
    /**
     * Gets ith "messageFlowRef" element
     */
    public javax.xml.namespace.QName getMessageFlowRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGEFLOWREF$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "messageFlowRef" elements
     */
    public org.apache.xmlbeans.XmlQName[] xgetMessageFlowRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MESSAGEFLOWREF$0, targetList);
            org.apache.xmlbeans.XmlQName[] result = new org.apache.xmlbeans.XmlQName[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "messageFlowRef" element
     */
    public org.apache.xmlbeans.XmlQName xgetMessageFlowRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(MESSAGEFLOWREF$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlQName)target;
        }
    }
    
    /**
     * Returns number of "messageFlowRef" element
     */
    public int sizeOfMessageFlowRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MESSAGEFLOWREF$0);
        }
    }
    
    /**
     * Sets array of all "messageFlowRef" element
     */
    public void setMessageFlowRefArray(javax.xml.namespace.QName[] messageFlowRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(messageFlowRefArray, MESSAGEFLOWREF$0);
        }
    }
    
    /**
     * Sets ith "messageFlowRef" element
     */
    public void setMessageFlowRefArray(int i, javax.xml.namespace.QName messageFlowRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGEFLOWREF$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setQNameValue(messageFlowRef);
        }
    }
    
    /**
     * Sets (as xml) array of all "messageFlowRef" element
     */
    public void xsetMessageFlowRefArray(org.apache.xmlbeans.XmlQName[]messageFlowRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(messageFlowRefArray, MESSAGEFLOWREF$0);
        }
    }
    
    /**
     * Sets (as xml) ith "messageFlowRef" element
     */
    public void xsetMessageFlowRefArray(int i, org.apache.xmlbeans.XmlQName messageFlowRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(MESSAGEFLOWREF$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(messageFlowRef);
        }
    }
    
    /**
     * Inserts the value as the ith "messageFlowRef" element
     */
    public void insertMessageFlowRef(int i, javax.xml.namespace.QName messageFlowRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(MESSAGEFLOWREF$0, i);
            target.setQNameValue(messageFlowRef);
        }
    }
    
    /**
     * Appends the value as the last "messageFlowRef" element
     */
    public void addMessageFlowRef(javax.xml.namespace.QName messageFlowRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MESSAGEFLOWREF$0);
            target.setQNameValue(messageFlowRef);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "messageFlowRef" element
     */
    public org.apache.xmlbeans.XmlQName insertNewMessageFlowRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().insert_element_user(MESSAGEFLOWREF$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "messageFlowRef" element
     */
    public org.apache.xmlbeans.XmlQName addNewMessageFlowRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().add_element_user(MESSAGEFLOWREF$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "messageFlowRef" element
     */
    public void removeMessageFlowRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MESSAGEFLOWREF$0, i);
        }
    }
}

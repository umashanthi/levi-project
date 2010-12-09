/*
 * XML Type:  tFlowNode
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.TFlowNode
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * An XML tFlowNode(@http://schema.omg.org/spec/BPMN/2.0).
 *
 * This is a complex type.
 */
public class TFlowNodeImpl extends org.omg.schema.spec.bpmn.x20.impl.TFlowElementImpl implements org.omg.schema.spec.bpmn.x20.TFlowNode
{
    private static final long serialVersionUID = 1L;
    
    public TFlowNodeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INCOMING$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "incoming");
    private static final javax.xml.namespace.QName OUTGOING$2 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "outgoing");
    
    
    /**
     * Gets array of all "incoming" elements
     */
    public javax.xml.namespace.QName[] getIncomingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(INCOMING$0, targetList);
            javax.xml.namespace.QName[] result = new javax.xml.namespace.QName[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getQNameValue();
            return result;
        }
    }
    
    /**
     * Gets ith "incoming" element
     */
    public javax.xml.namespace.QName getIncomingArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCOMING$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "incoming" elements
     */
    public org.apache.xmlbeans.XmlQName[] xgetIncomingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(INCOMING$0, targetList);
            org.apache.xmlbeans.XmlQName[] result = new org.apache.xmlbeans.XmlQName[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "incoming" element
     */
    public org.apache.xmlbeans.XmlQName xgetIncomingArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(INCOMING$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlQName)target;
        }
    }
    
    /**
     * Returns number of "incoming" element
     */
    public int sizeOfIncomingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INCOMING$0);
        }
    }
    
    /**
     * Sets array of all "incoming" element
     */
    public void setIncomingArray(javax.xml.namespace.QName[] incomingArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(incomingArray, INCOMING$0);
        }
    }
    
    /**
     * Sets ith "incoming" element
     */
    public void setIncomingArray(int i, javax.xml.namespace.QName incoming)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCOMING$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setQNameValue(incoming);
        }
    }
    
    /**
     * Sets (as xml) array of all "incoming" element
     */
    public void xsetIncomingArray(org.apache.xmlbeans.XmlQName[]incomingArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(incomingArray, INCOMING$0);
        }
    }
    
    /**
     * Sets (as xml) ith "incoming" element
     */
    public void xsetIncomingArray(int i, org.apache.xmlbeans.XmlQName incoming)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(INCOMING$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(incoming);
        }
    }
    
    /**
     * Inserts the value as the ith "incoming" element
     */
    public void insertIncoming(int i, javax.xml.namespace.QName incoming)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(INCOMING$0, i);
            target.setQNameValue(incoming);
        }
    }
    
    /**
     * Appends the value as the last "incoming" element
     */
    public void addIncoming(javax.xml.namespace.QName incoming)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INCOMING$0);
            target.setQNameValue(incoming);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "incoming" element
     */
    public org.apache.xmlbeans.XmlQName insertNewIncoming(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().insert_element_user(INCOMING$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "incoming" element
     */
    public org.apache.xmlbeans.XmlQName addNewIncoming()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().add_element_user(INCOMING$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "incoming" element
     */
    public void removeIncoming(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INCOMING$0, i);
        }
    }
    
    /**
     * Gets array of all "outgoing" elements
     */
    public javax.xml.namespace.QName[] getOutgoingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OUTGOING$2, targetList);
            javax.xml.namespace.QName[] result = new javax.xml.namespace.QName[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getQNameValue();
            return result;
        }
    }
    
    /**
     * Gets ith "outgoing" element
     */
    public javax.xml.namespace.QName getOutgoingArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OUTGOING$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "outgoing" elements
     */
    public org.apache.xmlbeans.XmlQName[] xgetOutgoingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OUTGOING$2, targetList);
            org.apache.xmlbeans.XmlQName[] result = new org.apache.xmlbeans.XmlQName[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "outgoing" element
     */
    public org.apache.xmlbeans.XmlQName xgetOutgoingArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(OUTGOING$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlQName)target;
        }
    }
    
    /**
     * Returns number of "outgoing" element
     */
    public int sizeOfOutgoingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OUTGOING$2);
        }
    }
    
    /**
     * Sets array of all "outgoing" element
     */
    public void setOutgoingArray(javax.xml.namespace.QName[] outgoingArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(outgoingArray, OUTGOING$2);
        }
    }
    
    /**
     * Sets ith "outgoing" element
     */
    public void setOutgoingArray(int i, javax.xml.namespace.QName outgoing)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OUTGOING$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setQNameValue(outgoing);
        }
    }
    
    /**
     * Sets (as xml) array of all "outgoing" element
     */
    public void xsetOutgoingArray(org.apache.xmlbeans.XmlQName[]outgoingArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(outgoingArray, OUTGOING$2);
        }
    }
    
    /**
     * Sets (as xml) ith "outgoing" element
     */
    public void xsetOutgoingArray(int i, org.apache.xmlbeans.XmlQName outgoing)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(OUTGOING$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(outgoing);
        }
    }
    
    /**
     * Inserts the value as the ith "outgoing" element
     */
    public void insertOutgoing(int i, javax.xml.namespace.QName outgoing)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(OUTGOING$2, i);
            target.setQNameValue(outgoing);
        }
    }
    
    /**
     * Appends the value as the last "outgoing" element
     */
    public void addOutgoing(javax.xml.namespace.QName outgoing)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OUTGOING$2);
            target.setQNameValue(outgoing);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "outgoing" element
     */
    public org.apache.xmlbeans.XmlQName insertNewOutgoing(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().insert_element_user(OUTGOING$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "outgoing" element
     */
    public org.apache.xmlbeans.XmlQName addNewOutgoing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().add_element_user(OUTGOING$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "outgoing" element
     */
    public void removeOutgoing(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OUTGOING$2, i);
        }
    }
}

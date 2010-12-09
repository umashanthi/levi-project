/*
 * XML Type:  tConversationAssociation
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.TConversationAssociation
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * An XML tConversationAssociation(@http://schema.omg.org/spec/BPMN/2.0).
 *
 * This is a complex type.
 */
public class TConversationAssociationImpl extends org.omg.schema.spec.bpmn.x20.impl.TBaseElementImpl implements org.omg.schema.spec.bpmn.x20.TConversationAssociation
{
    private static final long serialVersionUID = 1L;
    
    public TConversationAssociationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MESSAGEFLOWREF$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "messageFlowRef");
    private static final javax.xml.namespace.QName CONVERSATIONREF$2 = 
        new javax.xml.namespace.QName("", "conversationRef");
    private static final javax.xml.namespace.QName CORRELATIONKEYREF$4 = 
        new javax.xml.namespace.QName("", "correlationKeyRef");
    
    
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
    
    /**
     * Gets the "conversationRef" attribute
     */
    public javax.xml.namespace.QName getConversationRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONVERSATIONREF$2);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "conversationRef" attribute
     */
    public org.apache.xmlbeans.XmlQName xgetConversationRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(CONVERSATIONREF$2);
            return target;
        }
    }
    
    /**
     * True if has "conversationRef" attribute
     */
    public boolean isSetConversationRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CONVERSATIONREF$2) != null;
        }
    }
    
    /**
     * Sets the "conversationRef" attribute
     */
    public void setConversationRef(javax.xml.namespace.QName conversationRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONVERSATIONREF$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONVERSATIONREF$2);
            }
            target.setQNameValue(conversationRef);
        }
    }
    
    /**
     * Sets (as xml) the "conversationRef" attribute
     */
    public void xsetConversationRef(org.apache.xmlbeans.XmlQName conversationRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(CONVERSATIONREF$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(CONVERSATIONREF$2);
            }
            target.set(conversationRef);
        }
    }
    
    /**
     * Unsets the "conversationRef" attribute
     */
    public void unsetConversationRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CONVERSATIONREF$2);
        }
    }
    
    /**
     * Gets the "correlationKeyRef" attribute
     */
    public javax.xml.namespace.QName getCorrelationKeyRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CORRELATIONKEYREF$4);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "correlationKeyRef" attribute
     */
    public org.apache.xmlbeans.XmlQName xgetCorrelationKeyRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(CORRELATIONKEYREF$4);
            return target;
        }
    }
    
    /**
     * True if has "correlationKeyRef" attribute
     */
    public boolean isSetCorrelationKeyRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CORRELATIONKEYREF$4) != null;
        }
    }
    
    /**
     * Sets the "correlationKeyRef" attribute
     */
    public void setCorrelationKeyRef(javax.xml.namespace.QName correlationKeyRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CORRELATIONKEYREF$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CORRELATIONKEYREF$4);
            }
            target.setQNameValue(correlationKeyRef);
        }
    }
    
    /**
     * Sets (as xml) the "correlationKeyRef" attribute
     */
    public void xsetCorrelationKeyRef(org.apache.xmlbeans.XmlQName correlationKeyRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(CORRELATIONKEYREF$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(CORRELATIONKEYREF$4);
            }
            target.set(correlationKeyRef);
        }
    }
    
    /**
     * Unsets the "correlationKeyRef" attribute
     */
    public void unsetCorrelationKeyRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CORRELATIONKEYREF$4);
        }
    }
}

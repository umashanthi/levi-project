/*
 * XML Type:  tConversation
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.TConversation
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * An XML tConversation(@http://schema.omg.org/spec/BPMN/2.0).
 *
 * This is a complex type.
 */
public class TConversationImpl extends org.omg.schema.spec.bpmn.x20.impl.TCallableElementImpl implements org.omg.schema.spec.bpmn.x20.TConversation
{
    private static final long serialVersionUID = 1L;
    
    public TConversationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONVERSATIONNODE$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "conversationNode");
    private static final org.apache.xmlbeans.QNameSet CONVERSATIONNODE$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "communication"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "conversationNode"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "callConversation"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "subConversation"),
    });
    private static final javax.xml.namespace.QName PARTICIPANT$2 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "participant");
    private static final javax.xml.namespace.QName ARTIFACT$4 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "artifact");
    private static final org.apache.xmlbeans.QNameSet ARTIFACT$5 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "association"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "artifact"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "group"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "textAnnotation"),
    });
    private static final javax.xml.namespace.QName MESSAGEFLOW$6 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "messageFlow");
    private static final javax.xml.namespace.QName MESSAGEFLOWREF$8 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "messageFlowRef");
    private static final javax.xml.namespace.QName CORRELATIONKEY$10 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "correlationKey");
    
    
    /**
     * Gets array of all "conversationNode" elements
     */
    public org.omg.schema.spec.bpmn.x20.TConversationNode[] getConversationNodeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONVERSATIONNODE$1, targetList);
            org.omg.schema.spec.bpmn.x20.TConversationNode[] result = new org.omg.schema.spec.bpmn.x20.TConversationNode[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "conversationNode" element
     */
    public org.omg.schema.spec.bpmn.x20.TConversationNode getConversationNodeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TConversationNode target = null;
            target = (org.omg.schema.spec.bpmn.x20.TConversationNode)get_store().find_element_user(CONVERSATIONNODE$1, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "conversationNode" element
     */
    public int sizeOfConversationNodeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONVERSATIONNODE$1);
        }
    }
    
    /**
     * Sets array of all "conversationNode" element
     */
    public void setConversationNodeArray(org.omg.schema.spec.bpmn.x20.TConversationNode[] conversationNodeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(conversationNodeArray, CONVERSATIONNODE$0, CONVERSATIONNODE$1);
        }
    }
    
    /**
     * Sets ith "conversationNode" element
     */
    public void setConversationNodeArray(int i, org.omg.schema.spec.bpmn.x20.TConversationNode conversationNode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TConversationNode target = null;
            target = (org.omg.schema.spec.bpmn.x20.TConversationNode)get_store().find_element_user(CONVERSATIONNODE$1, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(conversationNode);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "conversationNode" element
     */
    public org.omg.schema.spec.bpmn.x20.TConversationNode insertNewConversationNode(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TConversationNode target = null;
            target = (org.omg.schema.spec.bpmn.x20.TConversationNode)get_store().insert_element_user(CONVERSATIONNODE$1, CONVERSATIONNODE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "conversationNode" element
     */
    public org.omg.schema.spec.bpmn.x20.TConversationNode addNewConversationNode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TConversationNode target = null;
            target = (org.omg.schema.spec.bpmn.x20.TConversationNode)get_store().add_element_user(CONVERSATIONNODE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "conversationNode" element
     */
    public void removeConversationNode(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONVERSATIONNODE$1, i);
        }
    }
    
    /**
     * Gets array of all "participant" elements
     */
    public org.omg.schema.spec.bpmn.x20.TParticipant[] getParticipantArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PARTICIPANT$2, targetList);
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
            target = (org.omg.schema.spec.bpmn.x20.TParticipant)get_store().find_element_user(PARTICIPANT$2, i);
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
            return get_store().count_elements(PARTICIPANT$2);
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
            arraySetterHelper(participantArray, PARTICIPANT$2);
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
            target = (org.omg.schema.spec.bpmn.x20.TParticipant)get_store().find_element_user(PARTICIPANT$2, i);
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
            target = (org.omg.schema.spec.bpmn.x20.TParticipant)get_store().insert_element_user(PARTICIPANT$2, i);
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
            target = (org.omg.schema.spec.bpmn.x20.TParticipant)get_store().add_element_user(PARTICIPANT$2);
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
            get_store().remove_element(PARTICIPANT$2, i);
        }
    }
    
    /**
     * Gets array of all "artifact" elements
     */
    public org.omg.schema.spec.bpmn.x20.TArtifact[] getArtifactArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ARTIFACT$5, targetList);
            org.omg.schema.spec.bpmn.x20.TArtifact[] result = new org.omg.schema.spec.bpmn.x20.TArtifact[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "artifact" element
     */
    public org.omg.schema.spec.bpmn.x20.TArtifact getArtifactArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TArtifact target = null;
            target = (org.omg.schema.spec.bpmn.x20.TArtifact)get_store().find_element_user(ARTIFACT$5, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "artifact" element
     */
    public int sizeOfArtifactArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ARTIFACT$5);
        }
    }
    
    /**
     * Sets array of all "artifact" element
     */
    public void setArtifactArray(org.omg.schema.spec.bpmn.x20.TArtifact[] artifactArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(artifactArray, ARTIFACT$4, ARTIFACT$5);
        }
    }
    
    /**
     * Sets ith "artifact" element
     */
    public void setArtifactArray(int i, org.omg.schema.spec.bpmn.x20.TArtifact artifact)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TArtifact target = null;
            target = (org.omg.schema.spec.bpmn.x20.TArtifact)get_store().find_element_user(ARTIFACT$5, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(artifact);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "artifact" element
     */
    public org.omg.schema.spec.bpmn.x20.TArtifact insertNewArtifact(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TArtifact target = null;
            target = (org.omg.schema.spec.bpmn.x20.TArtifact)get_store().insert_element_user(ARTIFACT$5, ARTIFACT$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "artifact" element
     */
    public org.omg.schema.spec.bpmn.x20.TArtifact addNewArtifact()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TArtifact target = null;
            target = (org.omg.schema.spec.bpmn.x20.TArtifact)get_store().add_element_user(ARTIFACT$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "artifact" element
     */
    public void removeArtifact(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ARTIFACT$5, i);
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
            get_store().find_all_element_users(MESSAGEFLOW$6, targetList);
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
            target = (org.omg.schema.spec.bpmn.x20.TMessageFlow)get_store().find_element_user(MESSAGEFLOW$6, i);
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
            return get_store().count_elements(MESSAGEFLOW$6);
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
            arraySetterHelper(messageFlowArray, MESSAGEFLOW$6);
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
            target = (org.omg.schema.spec.bpmn.x20.TMessageFlow)get_store().find_element_user(MESSAGEFLOW$6, i);
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
            target = (org.omg.schema.spec.bpmn.x20.TMessageFlow)get_store().insert_element_user(MESSAGEFLOW$6, i);
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
            target = (org.omg.schema.spec.bpmn.x20.TMessageFlow)get_store().add_element_user(MESSAGEFLOW$6);
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
            get_store().remove_element(MESSAGEFLOW$6, i);
        }
    }
    
    /**
     * Gets array of all "messageFlowRef" elements
     */
    public javax.xml.namespace.QName[] getMessageFlowRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MESSAGEFLOWREF$8, targetList);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGEFLOWREF$8, i);
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
            get_store().find_all_element_users(MESSAGEFLOWREF$8, targetList);
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
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(MESSAGEFLOWREF$8, i);
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
            return get_store().count_elements(MESSAGEFLOWREF$8);
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
            arraySetterHelper(messageFlowRefArray, MESSAGEFLOWREF$8);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGEFLOWREF$8, i);
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
            arraySetterHelper(messageFlowRefArray, MESSAGEFLOWREF$8);
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
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(MESSAGEFLOWREF$8, i);
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
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(MESSAGEFLOWREF$8, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MESSAGEFLOWREF$8);
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
            target = (org.apache.xmlbeans.XmlQName)get_store().insert_element_user(MESSAGEFLOWREF$8, i);
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
            target = (org.apache.xmlbeans.XmlQName)get_store().add_element_user(MESSAGEFLOWREF$8);
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
            get_store().remove_element(MESSAGEFLOWREF$8, i);
        }
    }
    
    /**
     * Gets array of all "correlationKey" elements
     */
    public org.omg.schema.spec.bpmn.x20.TCorrelationKey[] getCorrelationKeyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CORRELATIONKEY$10, targetList);
            org.omg.schema.spec.bpmn.x20.TCorrelationKey[] result = new org.omg.schema.spec.bpmn.x20.TCorrelationKey[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "correlationKey" element
     */
    public org.omg.schema.spec.bpmn.x20.TCorrelationKey getCorrelationKeyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TCorrelationKey target = null;
            target = (org.omg.schema.spec.bpmn.x20.TCorrelationKey)get_store().find_element_user(CORRELATIONKEY$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "correlationKey" element
     */
    public int sizeOfCorrelationKeyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CORRELATIONKEY$10);
        }
    }
    
    /**
     * Sets array of all "correlationKey" element
     */
    public void setCorrelationKeyArray(org.omg.schema.spec.bpmn.x20.TCorrelationKey[] correlationKeyArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(correlationKeyArray, CORRELATIONKEY$10);
        }
    }
    
    /**
     * Sets ith "correlationKey" element
     */
    public void setCorrelationKeyArray(int i, org.omg.schema.spec.bpmn.x20.TCorrelationKey correlationKey)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TCorrelationKey target = null;
            target = (org.omg.schema.spec.bpmn.x20.TCorrelationKey)get_store().find_element_user(CORRELATIONKEY$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(correlationKey);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "correlationKey" element
     */
    public org.omg.schema.spec.bpmn.x20.TCorrelationKey insertNewCorrelationKey(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TCorrelationKey target = null;
            target = (org.omg.schema.spec.bpmn.x20.TCorrelationKey)get_store().insert_element_user(CORRELATIONKEY$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "correlationKey" element
     */
    public org.omg.schema.spec.bpmn.x20.TCorrelationKey addNewCorrelationKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TCorrelationKey target = null;
            target = (org.omg.schema.spec.bpmn.x20.TCorrelationKey)get_store().add_element_user(CORRELATIONKEY$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "correlationKey" element
     */
    public void removeCorrelationKey(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CORRELATIONKEY$10, i);
        }
    }
}

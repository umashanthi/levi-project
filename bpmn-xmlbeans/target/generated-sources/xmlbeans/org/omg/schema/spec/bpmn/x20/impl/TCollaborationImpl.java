/*
 * XML Type:  tCollaboration
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.TCollaboration
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * An XML tCollaboration(@http://schema.omg.org/spec/BPMN/2.0).
 *
 * This is a complex type.
 */
public class TCollaborationImpl extends org.omg.schema.spec.bpmn.x20.impl.TRootElementImpl implements org.omg.schema.spec.bpmn.x20.TCollaboration
{
    private static final long serialVersionUID = 1L;
    
    public TCollaborationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARTICIPANT$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "participant");
    private static final javax.xml.namespace.QName MESSAGEFLOW$2 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "messageFlow");
    private static final javax.xml.namespace.QName ARTIFACT$4 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "artifact");
    private static final org.apache.xmlbeans.QNameSet ARTIFACT$5 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "association"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "artifact"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "group"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "textAnnotation"),
    });
    private static final javax.xml.namespace.QName CONVERSATION$6 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "conversation");
    private static final javax.xml.namespace.QName CONVERSATIONASSOCIATION$8 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "conversationAssociation");
    private static final javax.xml.namespace.QName PARTICIPANTASSOCIATION$10 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "participantAssociation");
    private static final javax.xml.namespace.QName MESSAGEFLOWASSOCIATION$12 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "messageFlowAssociation");
    private static final javax.xml.namespace.QName NAME$14 = 
        new javax.xml.namespace.QName("", "name");
    private static final javax.xml.namespace.QName ISCLOSED$16 = 
        new javax.xml.namespace.QName("", "isClosed");
    private static final javax.xml.namespace.QName CHOREOGRAPHYREF$18 = 
        new javax.xml.namespace.QName("", "choreographyRef");
    
    
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
     * Gets array of all "conversation" elements
     */
    public org.omg.schema.spec.bpmn.x20.TConversation[] getConversationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONVERSATION$6, targetList);
            org.omg.schema.spec.bpmn.x20.TConversation[] result = new org.omg.schema.spec.bpmn.x20.TConversation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "conversation" element
     */
    public org.omg.schema.spec.bpmn.x20.TConversation getConversationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TConversation target = null;
            target = (org.omg.schema.spec.bpmn.x20.TConversation)get_store().find_element_user(CONVERSATION$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "conversation" element
     */
    public int sizeOfConversationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONVERSATION$6);
        }
    }
    
    /**
     * Sets array of all "conversation" element
     */
    public void setConversationArray(org.omg.schema.spec.bpmn.x20.TConversation[] conversationArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(conversationArray, CONVERSATION$6);
        }
    }
    
    /**
     * Sets ith "conversation" element
     */
    public void setConversationArray(int i, org.omg.schema.spec.bpmn.x20.TConversation conversation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TConversation target = null;
            target = (org.omg.schema.spec.bpmn.x20.TConversation)get_store().find_element_user(CONVERSATION$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(conversation);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "conversation" element
     */
    public org.omg.schema.spec.bpmn.x20.TConversation insertNewConversation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TConversation target = null;
            target = (org.omg.schema.spec.bpmn.x20.TConversation)get_store().insert_element_user(CONVERSATION$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "conversation" element
     */
    public org.omg.schema.spec.bpmn.x20.TConversation addNewConversation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TConversation target = null;
            target = (org.omg.schema.spec.bpmn.x20.TConversation)get_store().add_element_user(CONVERSATION$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "conversation" element
     */
    public void removeConversation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONVERSATION$6, i);
        }
    }
    
    /**
     * Gets array of all "conversationAssociation" elements
     */
    public org.omg.schema.spec.bpmn.x20.TConversationAssociation[] getConversationAssociationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONVERSATIONASSOCIATION$8, targetList);
            org.omg.schema.spec.bpmn.x20.TConversationAssociation[] result = new org.omg.schema.spec.bpmn.x20.TConversationAssociation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "conversationAssociation" element
     */
    public org.omg.schema.spec.bpmn.x20.TConversationAssociation getConversationAssociationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TConversationAssociation target = null;
            target = (org.omg.schema.spec.bpmn.x20.TConversationAssociation)get_store().find_element_user(CONVERSATIONASSOCIATION$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "conversationAssociation" element
     */
    public int sizeOfConversationAssociationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONVERSATIONASSOCIATION$8);
        }
    }
    
    /**
     * Sets array of all "conversationAssociation" element
     */
    public void setConversationAssociationArray(org.omg.schema.spec.bpmn.x20.TConversationAssociation[] conversationAssociationArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(conversationAssociationArray, CONVERSATIONASSOCIATION$8);
        }
    }
    
    /**
     * Sets ith "conversationAssociation" element
     */
    public void setConversationAssociationArray(int i, org.omg.schema.spec.bpmn.x20.TConversationAssociation conversationAssociation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TConversationAssociation target = null;
            target = (org.omg.schema.spec.bpmn.x20.TConversationAssociation)get_store().find_element_user(CONVERSATIONASSOCIATION$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(conversationAssociation);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "conversationAssociation" element
     */
    public org.omg.schema.spec.bpmn.x20.TConversationAssociation insertNewConversationAssociation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TConversationAssociation target = null;
            target = (org.omg.schema.spec.bpmn.x20.TConversationAssociation)get_store().insert_element_user(CONVERSATIONASSOCIATION$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "conversationAssociation" element
     */
    public org.omg.schema.spec.bpmn.x20.TConversationAssociation addNewConversationAssociation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TConversationAssociation target = null;
            target = (org.omg.schema.spec.bpmn.x20.TConversationAssociation)get_store().add_element_user(CONVERSATIONASSOCIATION$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "conversationAssociation" element
     */
    public void removeConversationAssociation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONVERSATIONASSOCIATION$8, i);
        }
    }
    
    /**
     * Gets array of all "participantAssociation" elements
     */
    public org.omg.schema.spec.bpmn.x20.TParticipantAssociation[] getParticipantAssociationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PARTICIPANTASSOCIATION$10, targetList);
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
            target = (org.omg.schema.spec.bpmn.x20.TParticipantAssociation)get_store().find_element_user(PARTICIPANTASSOCIATION$10, i);
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
            return get_store().count_elements(PARTICIPANTASSOCIATION$10);
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
            arraySetterHelper(participantAssociationArray, PARTICIPANTASSOCIATION$10);
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
            target = (org.omg.schema.spec.bpmn.x20.TParticipantAssociation)get_store().find_element_user(PARTICIPANTASSOCIATION$10, i);
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
            target = (org.omg.schema.spec.bpmn.x20.TParticipantAssociation)get_store().insert_element_user(PARTICIPANTASSOCIATION$10, i);
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
            target = (org.omg.schema.spec.bpmn.x20.TParticipantAssociation)get_store().add_element_user(PARTICIPANTASSOCIATION$10);
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
            get_store().remove_element(PARTICIPANTASSOCIATION$10, i);
        }
    }
    
    /**
     * Gets array of all "messageFlowAssociation" elements
     */
    public org.omg.schema.spec.bpmn.x20.TMessageFlowAssociation[] getMessageFlowAssociationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MESSAGEFLOWASSOCIATION$12, targetList);
            org.omg.schema.spec.bpmn.x20.TMessageFlowAssociation[] result = new org.omg.schema.spec.bpmn.x20.TMessageFlowAssociation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "messageFlowAssociation" element
     */
    public org.omg.schema.spec.bpmn.x20.TMessageFlowAssociation getMessageFlowAssociationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TMessageFlowAssociation target = null;
            target = (org.omg.schema.spec.bpmn.x20.TMessageFlowAssociation)get_store().find_element_user(MESSAGEFLOWASSOCIATION$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "messageFlowAssociation" element
     */
    public int sizeOfMessageFlowAssociationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MESSAGEFLOWASSOCIATION$12);
        }
    }
    
    /**
     * Sets array of all "messageFlowAssociation" element
     */
    public void setMessageFlowAssociationArray(org.omg.schema.spec.bpmn.x20.TMessageFlowAssociation[] messageFlowAssociationArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(messageFlowAssociationArray, MESSAGEFLOWASSOCIATION$12);
        }
    }
    
    /**
     * Sets ith "messageFlowAssociation" element
     */
    public void setMessageFlowAssociationArray(int i, org.omg.schema.spec.bpmn.x20.TMessageFlowAssociation messageFlowAssociation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TMessageFlowAssociation target = null;
            target = (org.omg.schema.spec.bpmn.x20.TMessageFlowAssociation)get_store().find_element_user(MESSAGEFLOWASSOCIATION$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(messageFlowAssociation);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "messageFlowAssociation" element
     */
    public org.omg.schema.spec.bpmn.x20.TMessageFlowAssociation insertNewMessageFlowAssociation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TMessageFlowAssociation target = null;
            target = (org.omg.schema.spec.bpmn.x20.TMessageFlowAssociation)get_store().insert_element_user(MESSAGEFLOWASSOCIATION$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "messageFlowAssociation" element
     */
    public org.omg.schema.spec.bpmn.x20.TMessageFlowAssociation addNewMessageFlowAssociation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TMessageFlowAssociation target = null;
            target = (org.omg.schema.spec.bpmn.x20.TMessageFlowAssociation)get_store().add_element_user(MESSAGEFLOWASSOCIATION$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "messageFlowAssociation" element
     */
    public void removeMessageFlowAssociation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MESSAGEFLOWASSOCIATION$12, i);
        }
    }
    
    /**
     * Gets the "name" attribute
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$14);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "name" attribute
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$14);
            return target;
        }
    }
    
    /**
     * True if has "name" attribute
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NAME$14) != null;
        }
    }
    
    /**
     * Sets the "name" attribute
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$14);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" attribute
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$14);
            }
            target.set(name);
        }
    }
    
    /**
     * Unsets the "name" attribute
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NAME$14);
        }
    }
    
    /**
     * Gets the "isClosed" attribute
     */
    public boolean getIsClosed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISCLOSED$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ISCLOSED$16);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "isClosed" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsClosed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISCLOSED$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(ISCLOSED$16);
            }
            return target;
        }
    }
    
    /**
     * True if has "isClosed" attribute
     */
    public boolean isSetIsClosed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ISCLOSED$16) != null;
        }
    }
    
    /**
     * Sets the "isClosed" attribute
     */
    public void setIsClosed(boolean isClosed)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISCLOSED$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ISCLOSED$16);
            }
            target.setBooleanValue(isClosed);
        }
    }
    
    /**
     * Sets (as xml) the "isClosed" attribute
     */
    public void xsetIsClosed(org.apache.xmlbeans.XmlBoolean isClosed)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISCLOSED$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ISCLOSED$16);
            }
            target.set(isClosed);
        }
    }
    
    /**
     * Unsets the "isClosed" attribute
     */
    public void unsetIsClosed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ISCLOSED$16);
        }
    }
    
    /**
     * Gets the "choreographyRef" attribute
     */
    public javax.xml.namespace.QName getChoreographyRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CHOREOGRAPHYREF$18);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "choreographyRef" attribute
     */
    public org.apache.xmlbeans.XmlQName xgetChoreographyRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(CHOREOGRAPHYREF$18);
            return target;
        }
    }
    
    /**
     * True if has "choreographyRef" attribute
     */
    public boolean isSetChoreographyRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CHOREOGRAPHYREF$18) != null;
        }
    }
    
    /**
     * Sets the "choreographyRef" attribute
     */
    public void setChoreographyRef(javax.xml.namespace.QName choreographyRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CHOREOGRAPHYREF$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CHOREOGRAPHYREF$18);
            }
            target.setQNameValue(choreographyRef);
        }
    }
    
    /**
     * Sets (as xml) the "choreographyRef" attribute
     */
    public void xsetChoreographyRef(org.apache.xmlbeans.XmlQName choreographyRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(CHOREOGRAPHYREF$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(CHOREOGRAPHYREF$18);
            }
            target.set(choreographyRef);
        }
    }
    
    /**
     * Unsets the "choreographyRef" attribute
     */
    public void unsetChoreographyRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CHOREOGRAPHYREF$18);
        }
    }
}

/*
 * XML Type:  tSubConversation
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.TSubConversation
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * An XML tSubConversation(@http://schema.omg.org/spec/BPMN/2.0).
 *
 * This is a complex type.
 */
public class TSubConversationImpl extends org.omg.schema.spec.bpmn.x20.impl.TConversationNodeImpl implements org.omg.schema.spec.bpmn.x20.TSubConversation
{
    private static final long serialVersionUID = 1L;
    
    public TSubConversationImpl(org.apache.xmlbeans.SchemaType sType)
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
    private static final javax.xml.namespace.QName ARTIFACT$2 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "artifact");
    private static final org.apache.xmlbeans.QNameSet ARTIFACT$3 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "association"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "artifact"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "group"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "textAnnotation"),
    });
    private static final javax.xml.namespace.QName CORRELATIONKEYREF$4 = 
        new javax.xml.namespace.QName("", "correlationKeyRef");
    
    
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
     * Gets array of all "artifact" elements
     */
    public org.omg.schema.spec.bpmn.x20.TArtifact[] getArtifactArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ARTIFACT$3, targetList);
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
            target = (org.omg.schema.spec.bpmn.x20.TArtifact)get_store().find_element_user(ARTIFACT$3, i);
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
            return get_store().count_elements(ARTIFACT$3);
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
            arraySetterHelper(artifactArray, ARTIFACT$2, ARTIFACT$3);
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
            target = (org.omg.schema.spec.bpmn.x20.TArtifact)get_store().find_element_user(ARTIFACT$3, i);
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
            target = (org.omg.schema.spec.bpmn.x20.TArtifact)get_store().insert_element_user(ARTIFACT$3, ARTIFACT$2, i);
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
            target = (org.omg.schema.spec.bpmn.x20.TArtifact)get_store().add_element_user(ARTIFACT$2);
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
            get_store().remove_element(ARTIFACT$3, i);
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

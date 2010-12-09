/*
 * XML Type:  tEscalationEventDefinition
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.TEscalationEventDefinition
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * An XML tEscalationEventDefinition(@http://schema.omg.org/spec/BPMN/2.0).
 *
 * This is a complex type.
 */
public class TEscalationEventDefinitionImpl extends org.omg.schema.spec.bpmn.x20.impl.TEventDefinitionImpl implements org.omg.schema.spec.bpmn.x20.TEscalationEventDefinition
{
    private static final long serialVersionUID = 1L;
    
    public TEscalationEventDefinitionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ESCALATIONCODE$0 = 
        new javax.xml.namespace.QName("", "escalationCode");
    private static final javax.xml.namespace.QName ESCALATIONREF$2 = 
        new javax.xml.namespace.QName("", "escalationRef");
    
    
    /**
     * Gets the "escalationCode" attribute
     */
    public java.lang.String getEscalationCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ESCALATIONCODE$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "escalationCode" attribute
     */
    public org.apache.xmlbeans.XmlString xgetEscalationCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ESCALATIONCODE$0);
            return target;
        }
    }
    
    /**
     * True if has "escalationCode" attribute
     */
    public boolean isSetEscalationCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ESCALATIONCODE$0) != null;
        }
    }
    
    /**
     * Sets the "escalationCode" attribute
     */
    public void setEscalationCode(java.lang.String escalationCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ESCALATIONCODE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ESCALATIONCODE$0);
            }
            target.setStringValue(escalationCode);
        }
    }
    
    /**
     * Sets (as xml) the "escalationCode" attribute
     */
    public void xsetEscalationCode(org.apache.xmlbeans.XmlString escalationCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ESCALATIONCODE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ESCALATIONCODE$0);
            }
            target.set(escalationCode);
        }
    }
    
    /**
     * Unsets the "escalationCode" attribute
     */
    public void unsetEscalationCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ESCALATIONCODE$0);
        }
    }
    
    /**
     * Gets the "escalationRef" attribute
     */
    public javax.xml.namespace.QName getEscalationRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ESCALATIONREF$2);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "escalationRef" attribute
     */
    public org.apache.xmlbeans.XmlQName xgetEscalationRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(ESCALATIONREF$2);
            return target;
        }
    }
    
    /**
     * True if has "escalationRef" attribute
     */
    public boolean isSetEscalationRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ESCALATIONREF$2) != null;
        }
    }
    
    /**
     * Sets the "escalationRef" attribute
     */
    public void setEscalationRef(javax.xml.namespace.QName escalationRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ESCALATIONREF$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ESCALATIONREF$2);
            }
            target.setQNameValue(escalationRef);
        }
    }
    
    /**
     * Sets (as xml) the "escalationRef" attribute
     */
    public void xsetEscalationRef(org.apache.xmlbeans.XmlQName escalationRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(ESCALATIONREF$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(ESCALATIONREF$2);
            }
            target.set(escalationRef);
        }
    }
    
    /**
     * Unsets the "escalationRef" attribute
     */
    public void unsetEscalationRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ESCALATIONREF$2);
        }
    }
}

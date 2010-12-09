/*
 * XML Type:  tParticipantAssociation
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.TParticipantAssociation
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * An XML tParticipantAssociation(@http://schema.omg.org/spec/BPMN/2.0).
 *
 * This is a complex type.
 */
public class TParticipantAssociationImpl extends org.omg.schema.spec.bpmn.x20.impl.TBaseElementImpl implements org.omg.schema.spec.bpmn.x20.TParticipantAssociation
{
    private static final long serialVersionUID = 1L;
    
    public TParticipantAssociationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INNERPARTICIPANTREF$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "innerParticipantRef");
    private static final javax.xml.namespace.QName OUTERPARTICIPANTREF$2 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "outerParticipantRef");
    
    
    /**
     * Gets the "innerParticipantRef" element
     */
    public javax.xml.namespace.QName getInnerParticipantRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INNERPARTICIPANTREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "innerParticipantRef" element
     */
    public org.apache.xmlbeans.XmlQName xgetInnerParticipantRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(INNERPARTICIPANTREF$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "innerParticipantRef" element
     */
    public void setInnerParticipantRef(javax.xml.namespace.QName innerParticipantRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INNERPARTICIPANTREF$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INNERPARTICIPANTREF$0);
            }
            target.setQNameValue(innerParticipantRef);
        }
    }
    
    /**
     * Sets (as xml) the "innerParticipantRef" element
     */
    public void xsetInnerParticipantRef(org.apache.xmlbeans.XmlQName innerParticipantRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(INNERPARTICIPANTREF$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_element_user(INNERPARTICIPANTREF$0);
            }
            target.set(innerParticipantRef);
        }
    }
    
    /**
     * Gets the "outerParticipantRef" element
     */
    public javax.xml.namespace.QName getOuterParticipantRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OUTERPARTICIPANTREF$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "outerParticipantRef" element
     */
    public org.apache.xmlbeans.XmlQName xgetOuterParticipantRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(OUTERPARTICIPANTREF$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "outerParticipantRef" element
     */
    public void setOuterParticipantRef(javax.xml.namespace.QName outerParticipantRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OUTERPARTICIPANTREF$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OUTERPARTICIPANTREF$2);
            }
            target.setQNameValue(outerParticipantRef);
        }
    }
    
    /**
     * Sets (as xml) the "outerParticipantRef" element
     */
    public void xsetOuterParticipantRef(org.apache.xmlbeans.XmlQName outerParticipantRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(OUTERPARTICIPANTREF$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_element_user(OUTERPARTICIPANTREF$2);
            }
            target.set(outerParticipantRef);
        }
    }
}

/*
 * XML Type:  tMessageFlowAssociation
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.TMessageFlowAssociation
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * An XML tMessageFlowAssociation(@http://schema.omg.org/spec/BPMN/2.0).
 *
 * This is a complex type.
 */
public class TMessageFlowAssociationImpl extends org.omg.schema.spec.bpmn.x20.impl.TBaseElementImpl implements org.omg.schema.spec.bpmn.x20.TMessageFlowAssociation
{
    private static final long serialVersionUID = 1L;
    
    public TMessageFlowAssociationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INNERMESSAGEFLOWREF$0 = 
        new javax.xml.namespace.QName("", "innerMessageFlowRef");
    private static final javax.xml.namespace.QName OUTERMESSAGEFLOWREF$2 = 
        new javax.xml.namespace.QName("", "outerMessageFlowRef");
    
    
    /**
     * Gets the "innerMessageFlowRef" attribute
     */
    public javax.xml.namespace.QName getInnerMessageFlowRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INNERMESSAGEFLOWREF$0);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "innerMessageFlowRef" attribute
     */
    public org.apache.xmlbeans.XmlQName xgetInnerMessageFlowRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(INNERMESSAGEFLOWREF$0);
            return target;
        }
    }
    
    /**
     * Sets the "innerMessageFlowRef" attribute
     */
    public void setInnerMessageFlowRef(javax.xml.namespace.QName innerMessageFlowRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INNERMESSAGEFLOWREF$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INNERMESSAGEFLOWREF$0);
            }
            target.setQNameValue(innerMessageFlowRef);
        }
    }
    
    /**
     * Sets (as xml) the "innerMessageFlowRef" attribute
     */
    public void xsetInnerMessageFlowRef(org.apache.xmlbeans.XmlQName innerMessageFlowRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(INNERMESSAGEFLOWREF$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(INNERMESSAGEFLOWREF$0);
            }
            target.set(innerMessageFlowRef);
        }
    }
    
    /**
     * Gets the "outerMessageFlowRef" attribute
     */
    public javax.xml.namespace.QName getOuterMessageFlowRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OUTERMESSAGEFLOWREF$2);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "outerMessageFlowRef" attribute
     */
    public org.apache.xmlbeans.XmlQName xgetOuterMessageFlowRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(OUTERMESSAGEFLOWREF$2);
            return target;
        }
    }
    
    /**
     * Sets the "outerMessageFlowRef" attribute
     */
    public void setOuterMessageFlowRef(javax.xml.namespace.QName outerMessageFlowRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OUTERMESSAGEFLOWREF$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OUTERMESSAGEFLOWREF$2);
            }
            target.setQNameValue(outerMessageFlowRef);
        }
    }
    
    /**
     * Sets (as xml) the "outerMessageFlowRef" attribute
     */
    public void xsetOuterMessageFlowRef(org.apache.xmlbeans.XmlQName outerMessageFlowRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(OUTERMESSAGEFLOWREF$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(OUTERMESSAGEFLOWREF$2);
            }
            target.set(outerMessageFlowRef);
        }
    }
}

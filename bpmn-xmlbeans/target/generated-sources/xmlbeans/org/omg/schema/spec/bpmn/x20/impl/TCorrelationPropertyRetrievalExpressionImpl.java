/*
 * XML Type:  tCorrelationPropertyRetrievalExpression
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.TCorrelationPropertyRetrievalExpression
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * An XML tCorrelationPropertyRetrievalExpression(@http://schema.omg.org/spec/BPMN/2.0).
 *
 * This is a complex type.
 */
public class TCorrelationPropertyRetrievalExpressionImpl extends org.omg.schema.spec.bpmn.x20.impl.TBaseElementImpl implements org.omg.schema.spec.bpmn.x20.TCorrelationPropertyRetrievalExpression
{
    private static final long serialVersionUID = 1L;
    
    public TCorrelationPropertyRetrievalExpressionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MESSAGEPATH$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "messagePath");
    private static final javax.xml.namespace.QName MESSAGEREF$2 = 
        new javax.xml.namespace.QName("", "messageRef");
    
    
    /**
     * Gets the "messagePath" element
     */
    public org.omg.schema.spec.bpmn.x20.TFormalExpression getMessagePath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TFormalExpression target = null;
            target = (org.omg.schema.spec.bpmn.x20.TFormalExpression)get_store().find_element_user(MESSAGEPATH$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "messagePath" element
     */
    public void setMessagePath(org.omg.schema.spec.bpmn.x20.TFormalExpression messagePath)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TFormalExpression target = null;
            target = (org.omg.schema.spec.bpmn.x20.TFormalExpression)get_store().find_element_user(MESSAGEPATH$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TFormalExpression)get_store().add_element_user(MESSAGEPATH$0);
            }
            target.set(messagePath);
        }
    }
    
    /**
     * Appends and returns a new empty "messagePath" element
     */
    public org.omg.schema.spec.bpmn.x20.TFormalExpression addNewMessagePath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TFormalExpression target = null;
            target = (org.omg.schema.spec.bpmn.x20.TFormalExpression)get_store().add_element_user(MESSAGEPATH$0);
            return target;
        }
    }
    
    /**
     * Gets the "messageRef" attribute
     */
    public javax.xml.namespace.QName getMessageRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MESSAGEREF$2);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "messageRef" attribute
     */
    public org.apache.xmlbeans.XmlQName xgetMessageRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(MESSAGEREF$2);
            return target;
        }
    }
    
    /**
     * Sets the "messageRef" attribute
     */
    public void setMessageRef(javax.xml.namespace.QName messageRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MESSAGEREF$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MESSAGEREF$2);
            }
            target.setQNameValue(messageRef);
        }
    }
    
    /**
     * Sets (as xml) the "messageRef" attribute
     */
    public void xsetMessageRef(org.apache.xmlbeans.XmlQName messageRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(MESSAGEREF$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(MESSAGEREF$2);
            }
            target.set(messageRef);
        }
    }
}

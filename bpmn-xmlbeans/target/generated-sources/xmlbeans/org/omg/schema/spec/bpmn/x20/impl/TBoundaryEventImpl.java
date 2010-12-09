/*
 * XML Type:  tBoundaryEvent
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.TBoundaryEvent
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * An XML tBoundaryEvent(@http://schema.omg.org/spec/BPMN/2.0).
 *
 * This is a complex type.
 */
public class TBoundaryEventImpl extends org.omg.schema.spec.bpmn.x20.impl.TCatchEventImpl implements org.omg.schema.spec.bpmn.x20.TBoundaryEvent
{
    private static final long serialVersionUID = 1L;
    
    public TBoundaryEventImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CANCELACTIVITY$0 = 
        new javax.xml.namespace.QName("", "cancelActivity");
    private static final javax.xml.namespace.QName ATTACHEDTOREF$2 = 
        new javax.xml.namespace.QName("", "attachedToRef");
    
    
    /**
     * Gets the "cancelActivity" attribute
     */
    public boolean getCancelActivity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CANCELACTIVITY$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CANCELACTIVITY$0);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "cancelActivity" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetCancelActivity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CANCELACTIVITY$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(CANCELACTIVITY$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "cancelActivity" attribute
     */
    public boolean isSetCancelActivity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CANCELACTIVITY$0) != null;
        }
    }
    
    /**
     * Sets the "cancelActivity" attribute
     */
    public void setCancelActivity(boolean cancelActivity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CANCELACTIVITY$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CANCELACTIVITY$0);
            }
            target.setBooleanValue(cancelActivity);
        }
    }
    
    /**
     * Sets (as xml) the "cancelActivity" attribute
     */
    public void xsetCancelActivity(org.apache.xmlbeans.XmlBoolean cancelActivity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CANCELACTIVITY$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(CANCELACTIVITY$0);
            }
            target.set(cancelActivity);
        }
    }
    
    /**
     * Unsets the "cancelActivity" attribute
     */
    public void unsetCancelActivity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CANCELACTIVITY$0);
        }
    }
    
    /**
     * Gets the "attachedToRef" attribute
     */
    public javax.xml.namespace.QName getAttachedToRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ATTACHEDTOREF$2);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "attachedToRef" attribute
     */
    public org.apache.xmlbeans.XmlQName xgetAttachedToRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(ATTACHEDTOREF$2);
            return target;
        }
    }
    
    /**
     * Sets the "attachedToRef" attribute
     */
    public void setAttachedToRef(javax.xml.namespace.QName attachedToRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ATTACHEDTOREF$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ATTACHEDTOREF$2);
            }
            target.setQNameValue(attachedToRef);
        }
    }
    
    /**
     * Sets (as xml) the "attachedToRef" attribute
     */
    public void xsetAttachedToRef(org.apache.xmlbeans.XmlQName attachedToRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(ATTACHEDTOREF$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(ATTACHEDTOREF$2);
            }
            target.set(attachedToRef);
        }
    }
}

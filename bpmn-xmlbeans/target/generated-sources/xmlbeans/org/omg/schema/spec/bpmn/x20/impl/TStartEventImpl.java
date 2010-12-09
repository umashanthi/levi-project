/*
 * XML Type:  tStartEvent
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.TStartEvent
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * An XML tStartEvent(@http://schema.omg.org/spec/BPMN/2.0).
 *
 * This is a complex type.
 */
public class TStartEventImpl extends org.omg.schema.spec.bpmn.x20.impl.TCatchEventImpl implements org.omg.schema.spec.bpmn.x20.TStartEvent
{
    private static final long serialVersionUID = 1L;
    
    public TStartEventImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ISINTERRUPTING$0 = 
        new javax.xml.namespace.QName("", "isInterrupting");
    
    
    /**
     * Gets the "isInterrupting" attribute
     */
    public boolean getIsInterrupting()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISINTERRUPTING$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ISINTERRUPTING$0);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "isInterrupting" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsInterrupting()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISINTERRUPTING$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(ISINTERRUPTING$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "isInterrupting" attribute
     */
    public boolean isSetIsInterrupting()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ISINTERRUPTING$0) != null;
        }
    }
    
    /**
     * Sets the "isInterrupting" attribute
     */
    public void setIsInterrupting(boolean isInterrupting)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISINTERRUPTING$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ISINTERRUPTING$0);
            }
            target.setBooleanValue(isInterrupting);
        }
    }
    
    /**
     * Sets (as xml) the "isInterrupting" attribute
     */
    public void xsetIsInterrupting(org.apache.xmlbeans.XmlBoolean isInterrupting)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISINTERRUPTING$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ISINTERRUPTING$0);
            }
            target.set(isInterrupting);
        }
    }
    
    /**
     * Unsets the "isInterrupting" attribute
     */
    public void unsetIsInterrupting()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ISINTERRUPTING$0);
        }
    }
}

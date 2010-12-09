/*
 * XML Type:  tEventBasedGateway
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.TEventBasedGateway
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * An XML tEventBasedGateway(@http://schema.omg.org/spec/BPMN/2.0).
 *
 * This is a complex type.
 */
public class TEventBasedGatewayImpl extends org.omg.schema.spec.bpmn.x20.impl.TGatewayImpl implements org.omg.schema.spec.bpmn.x20.TEventBasedGateway
{
    private static final long serialVersionUID = 1L;
    
    public TEventBasedGatewayImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INSTANTIATE$0 = 
        new javax.xml.namespace.QName("", "instantiate");
    private static final javax.xml.namespace.QName EVENTGATEWAYTYPE$2 = 
        new javax.xml.namespace.QName("", "eventGatewayType");
    
    
    /**
     * Gets the "instantiate" attribute
     */
    public boolean getInstantiate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INSTANTIATE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(INSTANTIATE$0);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "instantiate" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetInstantiate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(INSTANTIATE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(INSTANTIATE$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "instantiate" attribute
     */
    public boolean isSetInstantiate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(INSTANTIATE$0) != null;
        }
    }
    
    /**
     * Sets the "instantiate" attribute
     */
    public void setInstantiate(boolean instantiate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INSTANTIATE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INSTANTIATE$0);
            }
            target.setBooleanValue(instantiate);
        }
    }
    
    /**
     * Sets (as xml) the "instantiate" attribute
     */
    public void xsetInstantiate(org.apache.xmlbeans.XmlBoolean instantiate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(INSTANTIATE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(INSTANTIATE$0);
            }
            target.set(instantiate);
        }
    }
    
    /**
     * Unsets the "instantiate" attribute
     */
    public void unsetInstantiate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(INSTANTIATE$0);
        }
    }
    
    /**
     * Gets the "eventGatewayType" attribute
     */
    public org.omg.schema.spec.bpmn.x20.TEventBasedGatewayType.Enum getEventGatewayType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EVENTGATEWAYTYPE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(EVENTGATEWAYTYPE$2);
            }
            if (target == null)
            {
                return null;
            }
            return (org.omg.schema.spec.bpmn.x20.TEventBasedGatewayType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "eventGatewayType" attribute
     */
    public org.omg.schema.spec.bpmn.x20.TEventBasedGatewayType xgetEventGatewayType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TEventBasedGatewayType target = null;
            target = (org.omg.schema.spec.bpmn.x20.TEventBasedGatewayType)get_store().find_attribute_user(EVENTGATEWAYTYPE$2);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TEventBasedGatewayType)get_default_attribute_value(EVENTGATEWAYTYPE$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "eventGatewayType" attribute
     */
    public boolean isSetEventGatewayType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(EVENTGATEWAYTYPE$2) != null;
        }
    }
    
    /**
     * Sets the "eventGatewayType" attribute
     */
    public void setEventGatewayType(org.omg.schema.spec.bpmn.x20.TEventBasedGatewayType.Enum eventGatewayType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EVENTGATEWAYTYPE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EVENTGATEWAYTYPE$2);
            }
            target.setEnumValue(eventGatewayType);
        }
    }
    
    /**
     * Sets (as xml) the "eventGatewayType" attribute
     */
    public void xsetEventGatewayType(org.omg.schema.spec.bpmn.x20.TEventBasedGatewayType eventGatewayType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TEventBasedGatewayType target = null;
            target = (org.omg.schema.spec.bpmn.x20.TEventBasedGatewayType)get_store().find_attribute_user(EVENTGATEWAYTYPE$2);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TEventBasedGatewayType)get_store().add_attribute_user(EVENTGATEWAYTYPE$2);
            }
            target.set(eventGatewayType);
        }
    }
    
    /**
     * Unsets the "eventGatewayType" attribute
     */
    public void unsetEventGatewayType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(EVENTGATEWAYTYPE$2);
        }
    }
}

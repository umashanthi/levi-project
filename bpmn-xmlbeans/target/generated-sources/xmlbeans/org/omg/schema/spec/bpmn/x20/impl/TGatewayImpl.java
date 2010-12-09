/*
 * XML Type:  tGateway
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.TGateway
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * An XML tGateway(@http://schema.omg.org/spec/BPMN/2.0).
 *
 * This is a complex type.
 */
public class TGatewayImpl extends org.omg.schema.spec.bpmn.x20.impl.TFlowNodeImpl implements org.omg.schema.spec.bpmn.x20.TGateway
{
    private static final long serialVersionUID = 1L;
    
    public TGatewayImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GATEWAYDIRECTION$0 = 
        new javax.xml.namespace.QName("", "gatewayDirection");
    
    
    /**
     * Gets the "gatewayDirection" attribute
     */
    public org.omg.schema.spec.bpmn.x20.TGatewayDirection.Enum getGatewayDirection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GATEWAYDIRECTION$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(GATEWAYDIRECTION$0);
            }
            if (target == null)
            {
                return null;
            }
            return (org.omg.schema.spec.bpmn.x20.TGatewayDirection.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "gatewayDirection" attribute
     */
    public org.omg.schema.spec.bpmn.x20.TGatewayDirection xgetGatewayDirection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TGatewayDirection target = null;
            target = (org.omg.schema.spec.bpmn.x20.TGatewayDirection)get_store().find_attribute_user(GATEWAYDIRECTION$0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TGatewayDirection)get_default_attribute_value(GATEWAYDIRECTION$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "gatewayDirection" attribute
     */
    public boolean isSetGatewayDirection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(GATEWAYDIRECTION$0) != null;
        }
    }
    
    /**
     * Sets the "gatewayDirection" attribute
     */
    public void setGatewayDirection(org.omg.schema.spec.bpmn.x20.TGatewayDirection.Enum gatewayDirection)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GATEWAYDIRECTION$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GATEWAYDIRECTION$0);
            }
            target.setEnumValue(gatewayDirection);
        }
    }
    
    /**
     * Sets (as xml) the "gatewayDirection" attribute
     */
    public void xsetGatewayDirection(org.omg.schema.spec.bpmn.x20.TGatewayDirection gatewayDirection)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TGatewayDirection target = null;
            target = (org.omg.schema.spec.bpmn.x20.TGatewayDirection)get_store().find_attribute_user(GATEWAYDIRECTION$0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TGatewayDirection)get_store().add_attribute_user(GATEWAYDIRECTION$0);
            }
            target.set(gatewayDirection);
        }
    }
    
    /**
     * Unsets the "gatewayDirection" attribute
     */
    public void unsetGatewayDirection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(GATEWAYDIRECTION$0);
        }
    }
}

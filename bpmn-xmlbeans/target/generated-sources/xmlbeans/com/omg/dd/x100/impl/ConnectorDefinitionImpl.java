/*
 * XML Type:  ConnectorDefinition
 * Namespace: http://www.omg.com/dd/1.0.0
 * Java type: com.omg.dd.x100.ConnectorDefinition
 *
 * Automatically generated - do not modify.
 */
package com.omg.dd.x100.impl;
/**
 * An XML ConnectorDefinition(@http://www.omg.com/dd/1.0.0).
 *
 * This is a complex type.
 */
public class ConnectorDefinitionImpl extends com.omg.dd.x100.impl.ViewDefinitionImpl implements com.omg.dd.x100.ConnectorDefinition
{
    private static final long serialVersionUID = 1L;
    
    public ConnectorDefinitionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOURCEDEFINITION$0 = 
        new javax.xml.namespace.QName("", "sourceDefinition");
    private static final javax.xml.namespace.QName TARGETDEFINITION$2 = 
        new javax.xml.namespace.QName("", "targetDefinition");
    
    
    /**
     * Gets the "sourceDefinition" attribute
     */
    public javax.xml.namespace.QName getSourceDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOURCEDEFINITION$0);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "sourceDefinition" attribute
     */
    public org.apache.xmlbeans.XmlQName xgetSourceDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(SOURCEDEFINITION$0);
            return target;
        }
    }
    
    /**
     * Sets the "sourceDefinition" attribute
     */
    public void setSourceDefinition(javax.xml.namespace.QName sourceDefinition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOURCEDEFINITION$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SOURCEDEFINITION$0);
            }
            target.setQNameValue(sourceDefinition);
        }
    }
    
    /**
     * Sets (as xml) the "sourceDefinition" attribute
     */
    public void xsetSourceDefinition(org.apache.xmlbeans.XmlQName sourceDefinition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(SOURCEDEFINITION$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(SOURCEDEFINITION$0);
            }
            target.set(sourceDefinition);
        }
    }
    
    /**
     * Gets the "targetDefinition" attribute
     */
    public javax.xml.namespace.QName getTargetDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TARGETDEFINITION$2);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "targetDefinition" attribute
     */
    public org.apache.xmlbeans.XmlQName xgetTargetDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(TARGETDEFINITION$2);
            return target;
        }
    }
    
    /**
     * Sets the "targetDefinition" attribute
     */
    public void setTargetDefinition(javax.xml.namespace.QName targetDefinition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TARGETDEFINITION$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TARGETDEFINITION$2);
            }
            target.setQNameValue(targetDefinition);
        }
    }
    
    /**
     * Sets (as xml) the "targetDefinition" attribute
     */
    public void xsetTargetDefinition(org.apache.xmlbeans.XmlQName targetDefinition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(TARGETDEFINITION$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(TARGETDEFINITION$2);
            }
            target.set(targetDefinition);
        }
    }
}

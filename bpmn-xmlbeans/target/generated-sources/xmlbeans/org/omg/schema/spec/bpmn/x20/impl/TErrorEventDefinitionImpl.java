/*
 * XML Type:  tErrorEventDefinition
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.TErrorEventDefinition
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * An XML tErrorEventDefinition(@http://schema.omg.org/spec/BPMN/2.0).
 *
 * This is a complex type.
 */
public class TErrorEventDefinitionImpl extends org.omg.schema.spec.bpmn.x20.impl.TEventDefinitionImpl implements org.omg.schema.spec.bpmn.x20.TErrorEventDefinition
{
    private static final long serialVersionUID = 1L;
    
    public TErrorEventDefinitionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ERRORCODE$0 = 
        new javax.xml.namespace.QName("", "errorCode");
    private static final javax.xml.namespace.QName ERRORREF$2 = 
        new javax.xml.namespace.QName("", "errorRef");
    
    
    /**
     * Gets the "errorCode" attribute
     */
    public java.lang.String getErrorCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ERRORCODE$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "errorCode" attribute
     */
    public org.apache.xmlbeans.XmlString xgetErrorCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ERRORCODE$0);
            return target;
        }
    }
    
    /**
     * True if has "errorCode" attribute
     */
    public boolean isSetErrorCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ERRORCODE$0) != null;
        }
    }
    
    /**
     * Sets the "errorCode" attribute
     */
    public void setErrorCode(java.lang.String errorCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ERRORCODE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ERRORCODE$0);
            }
            target.setStringValue(errorCode);
        }
    }
    
    /**
     * Sets (as xml) the "errorCode" attribute
     */
    public void xsetErrorCode(org.apache.xmlbeans.XmlString errorCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ERRORCODE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ERRORCODE$0);
            }
            target.set(errorCode);
        }
    }
    
    /**
     * Unsets the "errorCode" attribute
     */
    public void unsetErrorCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ERRORCODE$0);
        }
    }
    
    /**
     * Gets the "errorRef" attribute
     */
    public javax.xml.namespace.QName getErrorRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ERRORREF$2);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "errorRef" attribute
     */
    public org.apache.xmlbeans.XmlQName xgetErrorRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(ERRORREF$2);
            return target;
        }
    }
    
    /**
     * True if has "errorRef" attribute
     */
    public boolean isSetErrorRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ERRORREF$2) != null;
        }
    }
    
    /**
     * Sets the "errorRef" attribute
     */
    public void setErrorRef(javax.xml.namespace.QName errorRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ERRORREF$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ERRORREF$2);
            }
            target.setQNameValue(errorRef);
        }
    }
    
    /**
     * Sets (as xml) the "errorRef" attribute
     */
    public void xsetErrorRef(org.apache.xmlbeans.XmlQName errorRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(ERRORREF$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(ERRORREF$2);
            }
            target.set(errorRef);
        }
    }
    
    /**
     * Unsets the "errorRef" attribute
     */
    public void unsetErrorRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ERRORREF$2);
        }
    }
}

/*
 * XML Type:  tTransaction
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.TTransaction
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * An XML tTransaction(@http://schema.omg.org/spec/BPMN/2.0).
 *
 * This is a complex type.
 */
public class TTransactionImpl extends org.omg.schema.spec.bpmn.x20.impl.TActivityImpl implements org.omg.schema.spec.bpmn.x20.TTransaction
{
    private static final long serialVersionUID = 1L;
    
    public TTransactionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName METHOD$0 = 
        new javax.xml.namespace.QName("", "method");
    
    
    /**
     * Gets the "method" attribute
     */
    public org.omg.schema.spec.bpmn.x20.TTransactionMethod.Enum getMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(METHOD$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(METHOD$0);
            }
            if (target == null)
            {
                return null;
            }
            return (org.omg.schema.spec.bpmn.x20.TTransactionMethod.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "method" attribute
     */
    public org.omg.schema.spec.bpmn.x20.TTransactionMethod xgetMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TTransactionMethod target = null;
            target = (org.omg.schema.spec.bpmn.x20.TTransactionMethod)get_store().find_attribute_user(METHOD$0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TTransactionMethod)get_default_attribute_value(METHOD$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "method" attribute
     */
    public boolean isSetMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(METHOD$0) != null;
        }
    }
    
    /**
     * Sets the "method" attribute
     */
    public void setMethod(org.omg.schema.spec.bpmn.x20.TTransactionMethod.Enum method)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(METHOD$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(METHOD$0);
            }
            target.setEnumValue(method);
        }
    }
    
    /**
     * Sets (as xml) the "method" attribute
     */
    public void xsetMethod(org.omg.schema.spec.bpmn.x20.TTransactionMethod method)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TTransactionMethod target = null;
            target = (org.omg.schema.spec.bpmn.x20.TTransactionMethod)get_store().find_attribute_user(METHOD$0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TTransactionMethod)get_store().add_attribute_user(METHOD$0);
            }
            target.set(method);
        }
    }
    
    /**
     * Unsets the "method" attribute
     */
    public void unsetMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(METHOD$0);
        }
    }
}

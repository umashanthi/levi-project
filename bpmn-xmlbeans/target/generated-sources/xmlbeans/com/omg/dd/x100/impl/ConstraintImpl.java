/*
 * XML Type:  Constraint
 * Namespace: http://www.omg.com/dd/1.0.0
 * Java type: com.omg.dd.x100.Constraint
 *
 * Automatically generated - do not modify.
 */
package com.omg.dd.x100.impl;
/**
 * An XML Constraint(@http://www.omg.com/dd/1.0.0).
 *
 * This is a complex type.
 */
public class ConstraintImpl extends com.omg.dd.x100.impl.NamedElementImpl implements com.omg.dd.x100.Constraint
{
    private static final long serialVersionUID = 1L;
    
    public ConstraintImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONDITION$0 = 
        new javax.xml.namespace.QName("", "condition");
    
    
    /**
     * Gets the "condition" attribute
     */
    public java.lang.String getCondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONDITION$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "condition" attribute
     */
    public org.apache.xmlbeans.XmlString xgetCondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CONDITION$0);
            return target;
        }
    }
    
    /**
     * Sets the "condition" attribute
     */
    public void setCondition(java.lang.String condition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONDITION$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONDITION$0);
            }
            target.setStringValue(condition);
        }
    }
    
    /**
     * Sets (as xml) the "condition" attribute
     */
    public void xsetCondition(org.apache.xmlbeans.XmlString condition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CONDITION$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CONDITION$0);
            }
            target.set(condition);
        }
    }
}

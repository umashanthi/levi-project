/*
 * XML Type:  ChildDefinition
 * Namespace: http://www.omg.com/dd/1.0.0
 * Java type: com.omg.dd.x100.ChildDefinition
 *
 * Automatically generated - do not modify.
 */
package com.omg.dd.x100.impl;
/**
 * An XML ChildDefinition(@http://www.omg.com/dd/1.0.0).
 *
 * This is a complex type.
 */
public class ChildDefinitionImpl extends com.omg.dd.x100.impl.NamedElementImpl implements com.omg.dd.x100.ChildDefinition
{
    private static final long serialVersionUID = 1L;
    
    public ChildDefinitionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOWERBOUND$0 = 
        new javax.xml.namespace.QName("", "lowerBound");
    private static final javax.xml.namespace.QName UPPERBOUND$2 = 
        new javax.xml.namespace.QName("", "upperBound");
    private static final javax.xml.namespace.QName TYPEDEFINITION$4 = 
        new javax.xml.namespace.QName("", "typeDefinition");
    
    
    /**
     * Gets the "lowerBound" attribute
     */
    public int getLowerBound()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOWERBOUND$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(LOWERBOUND$0);
            }
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "lowerBound" attribute
     */
    public org.apache.xmlbeans.XmlInt xgetLowerBound()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(LOWERBOUND$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_default_attribute_value(LOWERBOUND$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "lowerBound" attribute
     */
    public boolean isSetLowerBound()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LOWERBOUND$0) != null;
        }
    }
    
    /**
     * Sets the "lowerBound" attribute
     */
    public void setLowerBound(int lowerBound)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOWERBOUND$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LOWERBOUND$0);
            }
            target.setIntValue(lowerBound);
        }
    }
    
    /**
     * Sets (as xml) the "lowerBound" attribute
     */
    public void xsetLowerBound(org.apache.xmlbeans.XmlInt lowerBound)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(LOWERBOUND$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(LOWERBOUND$0);
            }
            target.set(lowerBound);
        }
    }
    
    /**
     * Unsets the "lowerBound" attribute
     */
    public void unsetLowerBound()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LOWERBOUND$0);
        }
    }
    
    /**
     * Gets the "upperBound" attribute
     */
    public int getUpperBound()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UPPERBOUND$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(UPPERBOUND$2);
            }
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "upperBound" attribute
     */
    public org.apache.xmlbeans.XmlInt xgetUpperBound()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(UPPERBOUND$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_default_attribute_value(UPPERBOUND$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "upperBound" attribute
     */
    public boolean isSetUpperBound()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(UPPERBOUND$2) != null;
        }
    }
    
    /**
     * Sets the "upperBound" attribute
     */
    public void setUpperBound(int upperBound)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UPPERBOUND$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(UPPERBOUND$2);
            }
            target.setIntValue(upperBound);
        }
    }
    
    /**
     * Sets (as xml) the "upperBound" attribute
     */
    public void xsetUpperBound(org.apache.xmlbeans.XmlInt upperBound)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(UPPERBOUND$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(UPPERBOUND$2);
            }
            target.set(upperBound);
        }
    }
    
    /**
     * Unsets the "upperBound" attribute
     */
    public void unsetUpperBound()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(UPPERBOUND$2);
        }
    }
    
    /**
     * Gets the "typeDefinition" attribute
     */
    public javax.xml.namespace.QName getTypeDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPEDEFINITION$4);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "typeDefinition" attribute
     */
    public org.apache.xmlbeans.XmlQName xgetTypeDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(TYPEDEFINITION$4);
            return target;
        }
    }
    
    /**
     * Sets the "typeDefinition" attribute
     */
    public void setTypeDefinition(javax.xml.namespace.QName typeDefinition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPEDEFINITION$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPEDEFINITION$4);
            }
            target.setQNameValue(typeDefinition);
        }
    }
    
    /**
     * Sets (as xml) the "typeDefinition" attribute
     */
    public void xsetTypeDefinition(org.apache.xmlbeans.XmlQName typeDefinition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(TYPEDEFINITION$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(TYPEDEFINITION$4);
            }
            target.set(typeDefinition);
        }
    }
}

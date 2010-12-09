/*
 * XML Type:  tParticipantMultiplicity
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.TParticipantMultiplicity
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * An XML tParticipantMultiplicity(@http://schema.omg.org/spec/BPMN/2.0).
 *
 * This is a complex type.
 */
public class TParticipantMultiplicityImpl extends org.omg.schema.spec.bpmn.x20.impl.TBaseElementImpl implements org.omg.schema.spec.bpmn.x20.TParticipantMultiplicity
{
    private static final long serialVersionUID = 1L;
    
    public TParticipantMultiplicityImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MINIMUM$0 = 
        new javax.xml.namespace.QName("", "minimum");
    private static final javax.xml.namespace.QName MAXIMUM$2 = 
        new javax.xml.namespace.QName("", "maximum");
    
    
    /**
     * Gets the "minimum" attribute
     */
    public int getMinimum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MINIMUM$0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "minimum" attribute
     */
    public org.apache.xmlbeans.XmlInt xgetMinimum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(MINIMUM$0);
            return target;
        }
    }
    
    /**
     * True if has "minimum" attribute
     */
    public boolean isSetMinimum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MINIMUM$0) != null;
        }
    }
    
    /**
     * Sets the "minimum" attribute
     */
    public void setMinimum(int minimum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MINIMUM$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MINIMUM$0);
            }
            target.setIntValue(minimum);
        }
    }
    
    /**
     * Sets (as xml) the "minimum" attribute
     */
    public void xsetMinimum(org.apache.xmlbeans.XmlInt minimum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(MINIMUM$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(MINIMUM$0);
            }
            target.set(minimum);
        }
    }
    
    /**
     * Unsets the "minimum" attribute
     */
    public void unsetMinimum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MINIMUM$0);
        }
    }
    
    /**
     * Gets the "maximum" attribute
     */
    public int getMaximum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAXIMUM$2);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "maximum" attribute
     */
    public org.apache.xmlbeans.XmlInt xgetMaximum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(MAXIMUM$2);
            return target;
        }
    }
    
    /**
     * True if has "maximum" attribute
     */
    public boolean isSetMaximum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MAXIMUM$2) != null;
        }
    }
    
    /**
     * Sets the "maximum" attribute
     */
    public void setMaximum(int maximum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAXIMUM$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MAXIMUM$2);
            }
            target.setIntValue(maximum);
        }
    }
    
    /**
     * Sets (as xml) the "maximum" attribute
     */
    public void xsetMaximum(org.apache.xmlbeans.XmlInt maximum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(MAXIMUM$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(MAXIMUM$2);
            }
            target.set(maximum);
        }
    }
    
    /**
     * Unsets the "maximum" attribute
     */
    public void unsetMaximum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MAXIMUM$2);
        }
    }
}

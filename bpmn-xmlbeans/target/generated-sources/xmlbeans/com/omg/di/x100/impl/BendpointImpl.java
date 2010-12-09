/*
 * XML Type:  Bendpoint
 * Namespace: http://www.omg.com/di/1.0.0
 * Java type: com.omg.di.x100.Bendpoint
 *
 * Automatically generated - do not modify.
 */
package com.omg.di.x100.impl;
/**
 * An XML Bendpoint(@http://www.omg.com/di/1.0.0).
 *
 * This is a complex type.
 */
public class BendpointImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.omg.di.x100.Bendpoint
{
    private static final long serialVersionUID = 1L;
    
    public BendpointImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOURCEX$0 = 
        new javax.xml.namespace.QName("", "sourceX");
    private static final javax.xml.namespace.QName SOURCEY$2 = 
        new javax.xml.namespace.QName("", "sourceY");
    private static final javax.xml.namespace.QName TARGETX$4 = 
        new javax.xml.namespace.QName("", "targetX");
    private static final javax.xml.namespace.QName TARGETY$6 = 
        new javax.xml.namespace.QName("", "targetY");
    
    
    /**
     * Gets the "sourceX" attribute
     */
    public int getSourceX()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOURCEX$0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "sourceX" attribute
     */
    public org.apache.xmlbeans.XmlInt xgetSourceX()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(SOURCEX$0);
            return target;
        }
    }
    
    /**
     * Sets the "sourceX" attribute
     */
    public void setSourceX(int sourceX)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOURCEX$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SOURCEX$0);
            }
            target.setIntValue(sourceX);
        }
    }
    
    /**
     * Sets (as xml) the "sourceX" attribute
     */
    public void xsetSourceX(org.apache.xmlbeans.XmlInt sourceX)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(SOURCEX$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(SOURCEX$0);
            }
            target.set(sourceX);
        }
    }
    
    /**
     * Gets the "sourceY" attribute
     */
    public int getSourceY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOURCEY$2);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "sourceY" attribute
     */
    public org.apache.xmlbeans.XmlInt xgetSourceY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(SOURCEY$2);
            return target;
        }
    }
    
    /**
     * Sets the "sourceY" attribute
     */
    public void setSourceY(int sourceY)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOURCEY$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SOURCEY$2);
            }
            target.setIntValue(sourceY);
        }
    }
    
    /**
     * Sets (as xml) the "sourceY" attribute
     */
    public void xsetSourceY(org.apache.xmlbeans.XmlInt sourceY)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(SOURCEY$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(SOURCEY$2);
            }
            target.set(sourceY);
        }
    }
    
    /**
     * Gets the "targetX" attribute
     */
    public int getTargetX()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TARGETX$4);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "targetX" attribute
     */
    public org.apache.xmlbeans.XmlInt xgetTargetX()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(TARGETX$4);
            return target;
        }
    }
    
    /**
     * Sets the "targetX" attribute
     */
    public void setTargetX(int targetX)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TARGETX$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TARGETX$4);
            }
            target.setIntValue(targetX);
        }
    }
    
    /**
     * Sets (as xml) the "targetX" attribute
     */
    public void xsetTargetX(org.apache.xmlbeans.XmlInt targetX)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(TARGETX$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(TARGETX$4);
            }
            target.set(targetX);
        }
    }
    
    /**
     * Gets the "targetY" attribute
     */
    public int getTargetY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TARGETY$6);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "targetY" attribute
     */
    public org.apache.xmlbeans.XmlInt xgetTargetY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(TARGETY$6);
            return target;
        }
    }
    
    /**
     * Sets the "targetY" attribute
     */
    public void setTargetY(int targetY)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TARGETY$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TARGETY$6);
            }
            target.setIntValue(targetY);
        }
    }
    
    /**
     * Sets (as xml) the "targetY" attribute
     */
    public void xsetTargetY(org.apache.xmlbeans.XmlInt targetY)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(TARGETY$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(TARGETY$6);
            }
            target.set(targetY);
        }
    }
}

/*
 * XML Type:  tAssignment
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.TAssignment
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * An XML tAssignment(@http://schema.omg.org/spec/BPMN/2.0).
 *
 * This is a complex type.
 */
public class TAssignmentImpl extends org.omg.schema.spec.bpmn.x20.impl.TBaseElementImpl implements org.omg.schema.spec.bpmn.x20.TAssignment
{
    private static final long serialVersionUID = 1L;
    
    public TAssignmentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FROM$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "from");
    private static final javax.xml.namespace.QName TO$2 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "to");
    private static final javax.xml.namespace.QName LANGUAGE$4 = 
        new javax.xml.namespace.QName("", "language");
    
    
    /**
     * Gets the "from" element
     */
    public org.omg.schema.spec.bpmn.x20.TBaseElementWithMixedContent getFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TBaseElementWithMixedContent target = null;
            target = (org.omg.schema.spec.bpmn.x20.TBaseElementWithMixedContent)get_store().find_element_user(FROM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "from" element
     */
    public void setFrom(org.omg.schema.spec.bpmn.x20.TBaseElementWithMixedContent from)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TBaseElementWithMixedContent target = null;
            target = (org.omg.schema.spec.bpmn.x20.TBaseElementWithMixedContent)get_store().find_element_user(FROM$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TBaseElementWithMixedContent)get_store().add_element_user(FROM$0);
            }
            target.set(from);
        }
    }
    
    /**
     * Appends and returns a new empty "from" element
     */
    public org.omg.schema.spec.bpmn.x20.TBaseElementWithMixedContent addNewFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TBaseElementWithMixedContent target = null;
            target = (org.omg.schema.spec.bpmn.x20.TBaseElementWithMixedContent)get_store().add_element_user(FROM$0);
            return target;
        }
    }
    
    /**
     * Gets the "to" element
     */
    public org.omg.schema.spec.bpmn.x20.TBaseElementWithMixedContent getTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TBaseElementWithMixedContent target = null;
            target = (org.omg.schema.spec.bpmn.x20.TBaseElementWithMixedContent)get_store().find_element_user(TO$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "to" element
     */
    public void setTo(org.omg.schema.spec.bpmn.x20.TBaseElementWithMixedContent to)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TBaseElementWithMixedContent target = null;
            target = (org.omg.schema.spec.bpmn.x20.TBaseElementWithMixedContent)get_store().find_element_user(TO$2, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TBaseElementWithMixedContent)get_store().add_element_user(TO$2);
            }
            target.set(to);
        }
    }
    
    /**
     * Appends and returns a new empty "to" element
     */
    public org.omg.schema.spec.bpmn.x20.TBaseElementWithMixedContent addNewTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TBaseElementWithMixedContent target = null;
            target = (org.omg.schema.spec.bpmn.x20.TBaseElementWithMixedContent)get_store().add_element_user(TO$2);
            return target;
        }
    }
    
    /**
     * Gets the "language" attribute
     */
    public java.lang.String getLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANGUAGE$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "language" attribute
     */
    public org.apache.xmlbeans.XmlAnyURI xgetLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(LANGUAGE$4);
            return target;
        }
    }
    
    /**
     * True if has "language" attribute
     */
    public boolean isSetLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LANGUAGE$4) != null;
        }
    }
    
    /**
     * Sets the "language" attribute
     */
    public void setLanguage(java.lang.String language)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANGUAGE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANGUAGE$4);
            }
            target.setStringValue(language);
        }
    }
    
    /**
     * Sets (as xml) the "language" attribute
     */
    public void xsetLanguage(org.apache.xmlbeans.XmlAnyURI language)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(LANGUAGE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(LANGUAGE$4);
            }
            target.set(language);
        }
    }
    
    /**
     * Unsets the "language" attribute
     */
    public void unsetLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LANGUAGE$4);
        }
    }
}

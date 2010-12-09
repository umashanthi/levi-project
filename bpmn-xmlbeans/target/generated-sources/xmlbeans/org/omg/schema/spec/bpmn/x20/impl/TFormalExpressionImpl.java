/*
 * XML Type:  tFormalExpression
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.TFormalExpression
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * An XML tFormalExpression(@http://schema.omg.org/spec/BPMN/2.0).
 *
 * This is a complex type.
 */
public class TFormalExpressionImpl extends org.omg.schema.spec.bpmn.x20.impl.TExpressionImpl implements org.omg.schema.spec.bpmn.x20.TFormalExpression
{
    private static final long serialVersionUID = 1L;
    
    public TFormalExpressionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LANGUAGE$0 = 
        new javax.xml.namespace.QName("", "language");
    private static final javax.xml.namespace.QName EVALUATESTOTYPEREF$2 = 
        new javax.xml.namespace.QName("", "evaluatesToTypeRef");
    
    
    /**
     * Gets the "language" attribute
     */
    public java.lang.String getLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANGUAGE$0);
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
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(LANGUAGE$0);
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
            return get_store().find_attribute_user(LANGUAGE$0) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANGUAGE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANGUAGE$0);
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
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(LANGUAGE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(LANGUAGE$0);
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
            get_store().remove_attribute(LANGUAGE$0);
        }
    }
    
    /**
     * Gets the "evaluatesToTypeRef" attribute
     */
    public javax.xml.namespace.QName getEvaluatesToTypeRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EVALUATESTOTYPEREF$2);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "evaluatesToTypeRef" attribute
     */
    public org.apache.xmlbeans.XmlQName xgetEvaluatesToTypeRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(EVALUATESTOTYPEREF$2);
            return target;
        }
    }
    
    /**
     * True if has "evaluatesToTypeRef" attribute
     */
    public boolean isSetEvaluatesToTypeRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(EVALUATESTOTYPEREF$2) != null;
        }
    }
    
    /**
     * Sets the "evaluatesToTypeRef" attribute
     */
    public void setEvaluatesToTypeRef(javax.xml.namespace.QName evaluatesToTypeRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EVALUATESTOTYPEREF$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EVALUATESTOTYPEREF$2);
            }
            target.setQNameValue(evaluatesToTypeRef);
        }
    }
    
    /**
     * Sets (as xml) the "evaluatesToTypeRef" attribute
     */
    public void xsetEvaluatesToTypeRef(org.apache.xmlbeans.XmlQName evaluatesToTypeRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(EVALUATESTOTYPEREF$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(EVALUATESTOTYPEREF$2);
            }
            target.set(evaluatesToTypeRef);
        }
    }
    
    /**
     * Unsets the "evaluatesToTypeRef" attribute
     */
    public void unsetEvaluatesToTypeRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(EVALUATESTOTYPEREF$2);
        }
    }
}

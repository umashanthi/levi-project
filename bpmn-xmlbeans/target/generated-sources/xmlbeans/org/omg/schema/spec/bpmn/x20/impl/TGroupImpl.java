/*
 * XML Type:  tGroup
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.TGroup
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * An XML tGroup(@http://schema.omg.org/spec/BPMN/2.0).
 *
 * This is a complex type.
 */
public class TGroupImpl extends org.omg.schema.spec.bpmn.x20.impl.TArtifactImpl implements org.omg.schema.spec.bpmn.x20.TGroup
{
    private static final long serialVersionUID = 1L;
    
    public TGroupImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CATEGORYREF$0 = 
        new javax.xml.namespace.QName("", "categoryRef");
    
    
    /**
     * Gets the "categoryRef" attribute
     */
    public javax.xml.namespace.QName getCategoryRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CATEGORYREF$0);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "categoryRef" attribute
     */
    public org.apache.xmlbeans.XmlQName xgetCategoryRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(CATEGORYREF$0);
            return target;
        }
    }
    
    /**
     * True if has "categoryRef" attribute
     */
    public boolean isSetCategoryRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CATEGORYREF$0) != null;
        }
    }
    
    /**
     * Sets the "categoryRef" attribute
     */
    public void setCategoryRef(javax.xml.namespace.QName categoryRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CATEGORYREF$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CATEGORYREF$0);
            }
            target.setQNameValue(categoryRef);
        }
    }
    
    /**
     * Sets (as xml) the "categoryRef" attribute
     */
    public void xsetCategoryRef(org.apache.xmlbeans.XmlQName categoryRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(CATEGORYREF$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(CATEGORYREF$0);
            }
            target.set(categoryRef);
        }
    }
    
    /**
     * Unsets the "categoryRef" attribute
     */
    public void unsetCategoryRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CATEGORYREF$0);
        }
    }
}

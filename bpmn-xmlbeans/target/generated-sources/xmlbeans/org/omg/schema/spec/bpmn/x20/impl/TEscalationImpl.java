/*
 * XML Type:  tEscalation
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.TEscalation
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * An XML tEscalation(@http://schema.omg.org/spec/BPMN/2.0).
 *
 * This is a complex type.
 */
public class TEscalationImpl extends org.omg.schema.spec.bpmn.x20.impl.TRootElementImpl implements org.omg.schema.spec.bpmn.x20.TEscalation
{
    private static final long serialVersionUID = 1L;
    
    public TEscalationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STRUCTUREREF$0 = 
        new javax.xml.namespace.QName("", "structureRef");
    
    
    /**
     * Gets the "structureRef" attribute
     */
    public javax.xml.namespace.QName getStructureRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STRUCTUREREF$0);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "structureRef" attribute
     */
    public org.apache.xmlbeans.XmlQName xgetStructureRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(STRUCTUREREF$0);
            return target;
        }
    }
    
    /**
     * True if has "structureRef" attribute
     */
    public boolean isSetStructureRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(STRUCTUREREF$0) != null;
        }
    }
    
    /**
     * Sets the "structureRef" attribute
     */
    public void setStructureRef(javax.xml.namespace.QName structureRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STRUCTUREREF$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STRUCTUREREF$0);
            }
            target.setQNameValue(structureRef);
        }
    }
    
    /**
     * Sets (as xml) the "structureRef" attribute
     */
    public void xsetStructureRef(org.apache.xmlbeans.XmlQName structureRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(STRUCTUREREF$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(STRUCTUREREF$0);
            }
            target.set(structureRef);
        }
    }
    
    /**
     * Unsets the "structureRef" attribute
     */
    public void unsetStructureRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(STRUCTUREREF$0);
        }
    }
}

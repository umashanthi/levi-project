/*
 * XML Type:  tCorrelationPropertyBinding
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.TCorrelationPropertyBinding
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * An XML tCorrelationPropertyBinding(@http://schema.omg.org/spec/BPMN/2.0).
 *
 * This is a complex type.
 */
public class TCorrelationPropertyBindingImpl extends org.omg.schema.spec.bpmn.x20.impl.TBaseElementImpl implements org.omg.schema.spec.bpmn.x20.TCorrelationPropertyBinding
{
    private static final long serialVersionUID = 1L;
    
    public TCorrelationPropertyBindingImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATAPATH$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "dataPath");
    private static final javax.xml.namespace.QName CORRELATIONPROPERTYREF$2 = 
        new javax.xml.namespace.QName("", "correlationPropertyRef");
    
    
    /**
     * Gets the "dataPath" element
     */
    public org.omg.schema.spec.bpmn.x20.TFormalExpression getDataPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TFormalExpression target = null;
            target = (org.omg.schema.spec.bpmn.x20.TFormalExpression)get_store().find_element_user(DATAPATH$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "dataPath" element
     */
    public void setDataPath(org.omg.schema.spec.bpmn.x20.TFormalExpression dataPath)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TFormalExpression target = null;
            target = (org.omg.schema.spec.bpmn.x20.TFormalExpression)get_store().find_element_user(DATAPATH$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TFormalExpression)get_store().add_element_user(DATAPATH$0);
            }
            target.set(dataPath);
        }
    }
    
    /**
     * Appends and returns a new empty "dataPath" element
     */
    public org.omg.schema.spec.bpmn.x20.TFormalExpression addNewDataPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TFormalExpression target = null;
            target = (org.omg.schema.spec.bpmn.x20.TFormalExpression)get_store().add_element_user(DATAPATH$0);
            return target;
        }
    }
    
    /**
     * Gets the "correlationPropertyRef" attribute
     */
    public javax.xml.namespace.QName getCorrelationPropertyRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CORRELATIONPROPERTYREF$2);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "correlationPropertyRef" attribute
     */
    public org.apache.xmlbeans.XmlQName xgetCorrelationPropertyRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(CORRELATIONPROPERTYREF$2);
            return target;
        }
    }
    
    /**
     * Sets the "correlationPropertyRef" attribute
     */
    public void setCorrelationPropertyRef(javax.xml.namespace.QName correlationPropertyRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CORRELATIONPROPERTYREF$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CORRELATIONPROPERTYREF$2);
            }
            target.setQNameValue(correlationPropertyRef);
        }
    }
    
    /**
     * Sets (as xml) the "correlationPropertyRef" attribute
     */
    public void xsetCorrelationPropertyRef(org.apache.xmlbeans.XmlQName correlationPropertyRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(CORRELATIONPROPERTYREF$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(CORRELATIONPROPERTYREF$2);
            }
            target.set(correlationPropertyRef);
        }
    }
}

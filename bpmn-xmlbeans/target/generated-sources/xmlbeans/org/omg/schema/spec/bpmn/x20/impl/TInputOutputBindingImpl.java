/*
 * XML Type:  tInputOutputBinding
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.TInputOutputBinding
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * An XML tInputOutputBinding(@http://schema.omg.org/spec/BPMN/2.0).
 *
 * This is a complex type.
 */
public class TInputOutputBindingImpl extends org.omg.schema.spec.bpmn.x20.impl.TBaseElementImpl implements org.omg.schema.spec.bpmn.x20.TInputOutputBinding
{
    private static final long serialVersionUID = 1L;
    
    public TInputOutputBindingImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OPERATIONREF$0 = 
        new javax.xml.namespace.QName("", "operationRef");
    private static final javax.xml.namespace.QName INPUTDATAREF$2 = 
        new javax.xml.namespace.QName("", "inputDataRef");
    private static final javax.xml.namespace.QName OUTPUTDATAREF$4 = 
        new javax.xml.namespace.QName("", "outputDataRef");
    
    
    /**
     * Gets the "operationRef" attribute
     */
    public javax.xml.namespace.QName getOperationRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OPERATIONREF$0);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "operationRef" attribute
     */
    public org.apache.xmlbeans.XmlQName xgetOperationRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(OPERATIONREF$0);
            return target;
        }
    }
    
    /**
     * Sets the "operationRef" attribute
     */
    public void setOperationRef(javax.xml.namespace.QName operationRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OPERATIONREF$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OPERATIONREF$0);
            }
            target.setQNameValue(operationRef);
        }
    }
    
    /**
     * Sets (as xml) the "operationRef" attribute
     */
    public void xsetOperationRef(org.apache.xmlbeans.XmlQName operationRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(OPERATIONREF$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(OPERATIONREF$0);
            }
            target.set(operationRef);
        }
    }
    
    /**
     * Gets the "inputDataRef" attribute
     */
    public java.lang.String getInputDataRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INPUTDATAREF$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "inputDataRef" attribute
     */
    public org.apache.xmlbeans.XmlIDREF xgetInputDataRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREF target = null;
            target = (org.apache.xmlbeans.XmlIDREF)get_store().find_attribute_user(INPUTDATAREF$2);
            return target;
        }
    }
    
    /**
     * Sets the "inputDataRef" attribute
     */
    public void setInputDataRef(java.lang.String inputDataRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INPUTDATAREF$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INPUTDATAREF$2);
            }
            target.setStringValue(inputDataRef);
        }
    }
    
    /**
     * Sets (as xml) the "inputDataRef" attribute
     */
    public void xsetInputDataRef(org.apache.xmlbeans.XmlIDREF inputDataRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREF target = null;
            target = (org.apache.xmlbeans.XmlIDREF)get_store().find_attribute_user(INPUTDATAREF$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlIDREF)get_store().add_attribute_user(INPUTDATAREF$2);
            }
            target.set(inputDataRef);
        }
    }
    
    /**
     * Gets the "outputDataRef" attribute
     */
    public java.lang.String getOutputDataRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OUTPUTDATAREF$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "outputDataRef" attribute
     */
    public org.apache.xmlbeans.XmlIDREF xgetOutputDataRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREF target = null;
            target = (org.apache.xmlbeans.XmlIDREF)get_store().find_attribute_user(OUTPUTDATAREF$4);
            return target;
        }
    }
    
    /**
     * Sets the "outputDataRef" attribute
     */
    public void setOutputDataRef(java.lang.String outputDataRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OUTPUTDATAREF$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OUTPUTDATAREF$4);
            }
            target.setStringValue(outputDataRef);
        }
    }
    
    /**
     * Sets (as xml) the "outputDataRef" attribute
     */
    public void xsetOutputDataRef(org.apache.xmlbeans.XmlIDREF outputDataRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREF target = null;
            target = (org.apache.xmlbeans.XmlIDREF)get_store().find_attribute_user(OUTPUTDATAREF$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlIDREF)get_store().add_attribute_user(OUTPUTDATAREF$4);
            }
            target.set(outputDataRef);
        }
    }
}

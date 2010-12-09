/*
 * An XML document type.
 * Localname: dataState
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.DataStateDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one dataState(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class DataStateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.schema.spec.bpmn.x20.DataStateDocument
{
    private static final long serialVersionUID = 1L;
    
    public DataStateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATASTATE$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "dataState");
    
    
    /**
     * Gets the "dataState" element
     */
    public org.omg.schema.spec.bpmn.x20.TDataState getDataState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TDataState target = null;
            target = (org.omg.schema.spec.bpmn.x20.TDataState)get_store().find_element_user(DATASTATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "dataState" element
     */
    public void setDataState(org.omg.schema.spec.bpmn.x20.TDataState dataState)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TDataState target = null;
            target = (org.omg.schema.spec.bpmn.x20.TDataState)get_store().find_element_user(DATASTATE$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TDataState)get_store().add_element_user(DATASTATE$0);
            }
            target.set(dataState);
        }
    }
    
    /**
     * Appends and returns a new empty "dataState" element
     */
    public org.omg.schema.spec.bpmn.x20.TDataState addNewDataState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TDataState target = null;
            target = (org.omg.schema.spec.bpmn.x20.TDataState)get_store().add_element_user(DATASTATE$0);
            return target;
        }
    }
}

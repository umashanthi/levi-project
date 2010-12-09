/*
 * An XML document type.
 * Localname: dataObject
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.DataObjectDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one dataObject(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class DataObjectDocumentImpl extends org.omg.schema.spec.bpmn.x20.impl.FlowElementDocumentImpl implements org.omg.schema.spec.bpmn.x20.DataObjectDocument
{
    private static final long serialVersionUID = 1L;
    
    public DataObjectDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATAOBJECT$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "dataObject");
    
    
    /**
     * Gets the "dataObject" element
     */
    public org.omg.schema.spec.bpmn.x20.TDataObject getDataObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TDataObject target = null;
            target = (org.omg.schema.spec.bpmn.x20.TDataObject)get_store().find_element_user(DATAOBJECT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "dataObject" element
     */
    public void setDataObject(org.omg.schema.spec.bpmn.x20.TDataObject dataObject)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TDataObject target = null;
            target = (org.omg.schema.spec.bpmn.x20.TDataObject)get_store().find_element_user(DATAOBJECT$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TDataObject)get_store().add_element_user(DATAOBJECT$0);
            }
            target.set(dataObject);
        }
    }
    
    /**
     * Appends and returns a new empty "dataObject" element
     */
    public org.omg.schema.spec.bpmn.x20.TDataObject addNewDataObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TDataObject target = null;
            target = (org.omg.schema.spec.bpmn.x20.TDataObject)get_store().add_element_user(DATAOBJECT$0);
            return target;
        }
    }
}

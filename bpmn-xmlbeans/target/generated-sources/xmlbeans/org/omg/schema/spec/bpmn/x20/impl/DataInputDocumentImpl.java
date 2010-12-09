/*
 * An XML document type.
 * Localname: dataInput
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.DataInputDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one dataInput(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class DataInputDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.schema.spec.bpmn.x20.DataInputDocument
{
    private static final long serialVersionUID = 1L;
    
    public DataInputDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATAINPUT$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "dataInput");
    
    
    /**
     * Gets the "dataInput" element
     */
    public org.omg.schema.spec.bpmn.x20.TDataInput getDataInput()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TDataInput target = null;
            target = (org.omg.schema.spec.bpmn.x20.TDataInput)get_store().find_element_user(DATAINPUT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "dataInput" element
     */
    public void setDataInput(org.omg.schema.spec.bpmn.x20.TDataInput dataInput)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TDataInput target = null;
            target = (org.omg.schema.spec.bpmn.x20.TDataInput)get_store().find_element_user(DATAINPUT$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TDataInput)get_store().add_element_user(DATAINPUT$0);
            }
            target.set(dataInput);
        }
    }
    
    /**
     * Appends and returns a new empty "dataInput" element
     */
    public org.omg.schema.spec.bpmn.x20.TDataInput addNewDataInput()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TDataInput target = null;
            target = (org.omg.schema.spec.bpmn.x20.TDataInput)get_store().add_element_user(DATAINPUT$0);
            return target;
        }
    }
}

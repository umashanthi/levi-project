/*
 * An XML document type.
 * Localname: dataOutput
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.DataOutputDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one dataOutput(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class DataOutputDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.schema.spec.bpmn.x20.DataOutputDocument
{
    private static final long serialVersionUID = 1L;
    
    public DataOutputDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATAOUTPUT$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "dataOutput");
    
    
    /**
     * Gets the "dataOutput" element
     */
    public org.omg.schema.spec.bpmn.x20.TDataOutput getDataOutput()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TDataOutput target = null;
            target = (org.omg.schema.spec.bpmn.x20.TDataOutput)get_store().find_element_user(DATAOUTPUT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "dataOutput" element
     */
    public void setDataOutput(org.omg.schema.spec.bpmn.x20.TDataOutput dataOutput)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TDataOutput target = null;
            target = (org.omg.schema.spec.bpmn.x20.TDataOutput)get_store().find_element_user(DATAOUTPUT$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TDataOutput)get_store().add_element_user(DATAOUTPUT$0);
            }
            target.set(dataOutput);
        }
    }
    
    /**
     * Appends and returns a new empty "dataOutput" element
     */
    public org.omg.schema.spec.bpmn.x20.TDataOutput addNewDataOutput()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TDataOutput target = null;
            target = (org.omg.schema.spec.bpmn.x20.TDataOutput)get_store().add_element_user(DATAOUTPUT$0);
            return target;
        }
    }
}

/*
 * An XML document type.
 * Localname: dataStoreReference
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.DataStoreReferenceDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one dataStoreReference(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class DataStoreReferenceDocumentImpl extends org.omg.schema.spec.bpmn.x20.impl.FlowElementDocumentImpl implements org.omg.schema.spec.bpmn.x20.DataStoreReferenceDocument
{
    private static final long serialVersionUID = 1L;
    
    public DataStoreReferenceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATASTOREREFERENCE$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "dataStoreReference");
    
    
    /**
     * Gets the "dataStoreReference" element
     */
    public org.omg.schema.spec.bpmn.x20.TDataStoreReference getDataStoreReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TDataStoreReference target = null;
            target = (org.omg.schema.spec.bpmn.x20.TDataStoreReference)get_store().find_element_user(DATASTOREREFERENCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "dataStoreReference" element
     */
    public void setDataStoreReference(org.omg.schema.spec.bpmn.x20.TDataStoreReference dataStoreReference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TDataStoreReference target = null;
            target = (org.omg.schema.spec.bpmn.x20.TDataStoreReference)get_store().find_element_user(DATASTOREREFERENCE$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TDataStoreReference)get_store().add_element_user(DATASTOREREFERENCE$0);
            }
            target.set(dataStoreReference);
        }
    }
    
    /**
     * Appends and returns a new empty "dataStoreReference" element
     */
    public org.omg.schema.spec.bpmn.x20.TDataStoreReference addNewDataStoreReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TDataStoreReference target = null;
            target = (org.omg.schema.spec.bpmn.x20.TDataStoreReference)get_store().add_element_user(DATASTOREREFERENCE$0);
            return target;
        }
    }
}

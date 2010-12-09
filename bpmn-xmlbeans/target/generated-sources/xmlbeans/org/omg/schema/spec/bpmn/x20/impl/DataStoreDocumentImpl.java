/*
 * An XML document type.
 * Localname: dataStore
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.DataStoreDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one dataStore(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class DataStoreDocumentImpl extends org.omg.schema.spec.bpmn.x20.impl.RootElementDocumentImpl implements org.omg.schema.spec.bpmn.x20.DataStoreDocument
{
    private static final long serialVersionUID = 1L;
    
    public DataStoreDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATASTORE$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "dataStore");
    
    
    /**
     * Gets the "dataStore" element
     */
    public org.omg.schema.spec.bpmn.x20.TDataStore getDataStore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TDataStore target = null;
            target = (org.omg.schema.spec.bpmn.x20.TDataStore)get_store().find_element_user(DATASTORE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "dataStore" element
     */
    public void setDataStore(org.omg.schema.spec.bpmn.x20.TDataStore dataStore)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TDataStore target = null;
            target = (org.omg.schema.spec.bpmn.x20.TDataStore)get_store().find_element_user(DATASTORE$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TDataStore)get_store().add_element_user(DATASTORE$0);
            }
            target.set(dataStore);
        }
    }
    
    /**
     * Appends and returns a new empty "dataStore" element
     */
    public org.omg.schema.spec.bpmn.x20.TDataStore addNewDataStore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TDataStore target = null;
            target = (org.omg.schema.spec.bpmn.x20.TDataStore)get_store().add_element_user(DATASTORE$0);
            return target;
        }
    }
}

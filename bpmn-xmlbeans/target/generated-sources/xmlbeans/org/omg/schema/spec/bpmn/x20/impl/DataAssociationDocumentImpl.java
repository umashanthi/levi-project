/*
 * An XML document type.
 * Localname: dataAssociation
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.DataAssociationDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one dataAssociation(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class DataAssociationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.schema.spec.bpmn.x20.DataAssociationDocument
{
    private static final long serialVersionUID = 1L;
    
    public DataAssociationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATAASSOCIATION$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "dataAssociation");
    
    
    /**
     * Gets the "dataAssociation" element
     */
    public org.omg.schema.spec.bpmn.x20.TDataAssociation getDataAssociation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TDataAssociation target = null;
            target = (org.omg.schema.spec.bpmn.x20.TDataAssociation)get_store().find_element_user(DATAASSOCIATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "dataAssociation" element
     */
    public void setDataAssociation(org.omg.schema.spec.bpmn.x20.TDataAssociation dataAssociation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TDataAssociation target = null;
            target = (org.omg.schema.spec.bpmn.x20.TDataAssociation)get_store().find_element_user(DATAASSOCIATION$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TDataAssociation)get_store().add_element_user(DATAASSOCIATION$0);
            }
            target.set(dataAssociation);
        }
    }
    
    /**
     * Appends and returns a new empty "dataAssociation" element
     */
    public org.omg.schema.spec.bpmn.x20.TDataAssociation addNewDataAssociation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TDataAssociation target = null;
            target = (org.omg.schema.spec.bpmn.x20.TDataAssociation)get_store().add_element_user(DATAASSOCIATION$0);
            return target;
        }
    }
}

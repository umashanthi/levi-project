/*
 * An XML document type.
 * Localname: dataOutputAssociation
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.DataOutputAssociationDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one dataOutputAssociation(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class DataOutputAssociationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.schema.spec.bpmn.x20.DataOutputAssociationDocument
{
    private static final long serialVersionUID = 1L;
    
    public DataOutputAssociationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATAOUTPUTASSOCIATION$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "dataOutputAssociation");
    
    
    /**
     * Gets the "dataOutputAssociation" element
     */
    public org.omg.schema.spec.bpmn.x20.TDataOutputAssociation getDataOutputAssociation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TDataOutputAssociation target = null;
            target = (org.omg.schema.spec.bpmn.x20.TDataOutputAssociation)get_store().find_element_user(DATAOUTPUTASSOCIATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "dataOutputAssociation" element
     */
    public void setDataOutputAssociation(org.omg.schema.spec.bpmn.x20.TDataOutputAssociation dataOutputAssociation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TDataOutputAssociation target = null;
            target = (org.omg.schema.spec.bpmn.x20.TDataOutputAssociation)get_store().find_element_user(DATAOUTPUTASSOCIATION$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TDataOutputAssociation)get_store().add_element_user(DATAOUTPUTASSOCIATION$0);
            }
            target.set(dataOutputAssociation);
        }
    }
    
    /**
     * Appends and returns a new empty "dataOutputAssociation" element
     */
    public org.omg.schema.spec.bpmn.x20.TDataOutputAssociation addNewDataOutputAssociation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TDataOutputAssociation target = null;
            target = (org.omg.schema.spec.bpmn.x20.TDataOutputAssociation)get_store().add_element_user(DATAOUTPUTASSOCIATION$0);
            return target;
        }
    }
}

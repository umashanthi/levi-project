/*
 * An XML document type.
 * Localname: dataInputAssociation
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.DataInputAssociationDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one dataInputAssociation(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class DataInputAssociationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.schema.spec.bpmn.x20.DataInputAssociationDocument
{
    private static final long serialVersionUID = 1L;
    
    public DataInputAssociationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATAINPUTASSOCIATION$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "dataInputAssociation");
    
    
    /**
     * Gets the "dataInputAssociation" element
     */
    public org.omg.schema.spec.bpmn.x20.TDataInputAssociation getDataInputAssociation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TDataInputAssociation target = null;
            target = (org.omg.schema.spec.bpmn.x20.TDataInputAssociation)get_store().find_element_user(DATAINPUTASSOCIATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "dataInputAssociation" element
     */
    public void setDataInputAssociation(org.omg.schema.spec.bpmn.x20.TDataInputAssociation dataInputAssociation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TDataInputAssociation target = null;
            target = (org.omg.schema.spec.bpmn.x20.TDataInputAssociation)get_store().find_element_user(DATAINPUTASSOCIATION$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TDataInputAssociation)get_store().add_element_user(DATAINPUTASSOCIATION$0);
            }
            target.set(dataInputAssociation);
        }
    }
    
    /**
     * Appends and returns a new empty "dataInputAssociation" element
     */
    public org.omg.schema.spec.bpmn.x20.TDataInputAssociation addNewDataInputAssociation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TDataInputAssociation target = null;
            target = (org.omg.schema.spec.bpmn.x20.TDataInputAssociation)get_store().add_element_user(DATAINPUTASSOCIATION$0);
            return target;
        }
    }
}

/*
 * An XML document type.
 * Localname: partnerEntity
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.PartnerEntityDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one partnerEntity(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class PartnerEntityDocumentImpl extends org.omg.schema.spec.bpmn.x20.impl.RootElementDocumentImpl implements org.omg.schema.spec.bpmn.x20.PartnerEntityDocument
{
    private static final long serialVersionUID = 1L;
    
    public PartnerEntityDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARTNERENTITY$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "partnerEntity");
    
    
    /**
     * Gets the "partnerEntity" element
     */
    public org.omg.schema.spec.bpmn.x20.TPartnerEntity getPartnerEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TPartnerEntity target = null;
            target = (org.omg.schema.spec.bpmn.x20.TPartnerEntity)get_store().find_element_user(PARTNERENTITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "partnerEntity" element
     */
    public void setPartnerEntity(org.omg.schema.spec.bpmn.x20.TPartnerEntity partnerEntity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TPartnerEntity target = null;
            target = (org.omg.schema.spec.bpmn.x20.TPartnerEntity)get_store().find_element_user(PARTNERENTITY$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TPartnerEntity)get_store().add_element_user(PARTNERENTITY$0);
            }
            target.set(partnerEntity);
        }
    }
    
    /**
     * Appends and returns a new empty "partnerEntity" element
     */
    public org.omg.schema.spec.bpmn.x20.TPartnerEntity addNewPartnerEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TPartnerEntity target = null;
            target = (org.omg.schema.spec.bpmn.x20.TPartnerEntity)get_store().add_element_user(PARTNERENTITY$0);
            return target;
        }
    }
}

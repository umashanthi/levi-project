/*
 * An XML document type.
 * Localname: partnerRole
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.PartnerRoleDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one partnerRole(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class PartnerRoleDocumentImpl extends org.omg.schema.spec.bpmn.x20.impl.RootElementDocumentImpl implements org.omg.schema.spec.bpmn.x20.PartnerRoleDocument
{
    private static final long serialVersionUID = 1L;
    
    public PartnerRoleDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARTNERROLE$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "partnerRole");
    
    
    /**
     * Gets the "partnerRole" element
     */
    public org.omg.schema.spec.bpmn.x20.TPartnerRole getPartnerRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TPartnerRole target = null;
            target = (org.omg.schema.spec.bpmn.x20.TPartnerRole)get_store().find_element_user(PARTNERROLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "partnerRole" element
     */
    public void setPartnerRole(org.omg.schema.spec.bpmn.x20.TPartnerRole partnerRole)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TPartnerRole target = null;
            target = (org.omg.schema.spec.bpmn.x20.TPartnerRole)get_store().find_element_user(PARTNERROLE$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TPartnerRole)get_store().add_element_user(PARTNERROLE$0);
            }
            target.set(partnerRole);
        }
    }
    
    /**
     * Appends and returns a new empty "partnerRole" element
     */
    public org.omg.schema.spec.bpmn.x20.TPartnerRole addNewPartnerRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TPartnerRole target = null;
            target = (org.omg.schema.spec.bpmn.x20.TPartnerRole)get_store().add_element_user(PARTNERROLE$0);
            return target;
        }
    }
}

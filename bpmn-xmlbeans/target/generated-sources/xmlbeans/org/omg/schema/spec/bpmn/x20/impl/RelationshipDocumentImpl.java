/*
 * An XML document type.
 * Localname: relationship
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.RelationshipDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one relationship(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class RelationshipDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.schema.spec.bpmn.x20.RelationshipDocument
{
    private static final long serialVersionUID = 1L;
    
    public RelationshipDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RELATIONSHIP$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "relationship");
    
    
    /**
     * Gets the "relationship" element
     */
    public org.omg.schema.spec.bpmn.x20.TRelationship getRelationship()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TRelationship target = null;
            target = (org.omg.schema.spec.bpmn.x20.TRelationship)get_store().find_element_user(RELATIONSHIP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "relationship" element
     */
    public void setRelationship(org.omg.schema.spec.bpmn.x20.TRelationship relationship)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TRelationship target = null;
            target = (org.omg.schema.spec.bpmn.x20.TRelationship)get_store().find_element_user(RELATIONSHIP$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TRelationship)get_store().add_element_user(RELATIONSHIP$0);
            }
            target.set(relationship);
        }
    }
    
    /**
     * Appends and returns a new empty "relationship" element
     */
    public org.omg.schema.spec.bpmn.x20.TRelationship addNewRelationship()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TRelationship target = null;
            target = (org.omg.schema.spec.bpmn.x20.TRelationship)get_store().add_element_user(RELATIONSHIP$0);
            return target;
        }
    }
}

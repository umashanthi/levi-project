/*
 * An XML document type.
 * Localname: collaboration
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.CollaborationDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one collaboration(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class CollaborationDocumentImpl extends org.omg.schema.spec.bpmn.x20.impl.RootElementDocumentImpl implements org.omg.schema.spec.bpmn.x20.CollaborationDocument
{
    private static final long serialVersionUID = 1L;
    
    public CollaborationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COLLABORATION$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "collaboration");
    
    
    /**
     * Gets the "collaboration" element
     */
    public org.omg.schema.spec.bpmn.x20.TCollaboration getCollaboration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TCollaboration target = null;
            target = (org.omg.schema.spec.bpmn.x20.TCollaboration)get_store().find_element_user(COLLABORATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "collaboration" element
     */
    public void setCollaboration(org.omg.schema.spec.bpmn.x20.TCollaboration collaboration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TCollaboration target = null;
            target = (org.omg.schema.spec.bpmn.x20.TCollaboration)get_store().find_element_user(COLLABORATION$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TCollaboration)get_store().add_element_user(COLLABORATION$0);
            }
            target.set(collaboration);
        }
    }
    
    /**
     * Appends and returns a new empty "collaboration" element
     */
    public org.omg.schema.spec.bpmn.x20.TCollaboration addNewCollaboration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TCollaboration target = null;
            target = (org.omg.schema.spec.bpmn.x20.TCollaboration)get_store().add_element_user(COLLABORATION$0);
            return target;
        }
    }
}

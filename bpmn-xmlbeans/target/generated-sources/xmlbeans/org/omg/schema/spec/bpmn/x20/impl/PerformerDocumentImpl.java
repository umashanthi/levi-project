/*
 * An XML document type.
 * Localname: performer
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.PerformerDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one performer(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class PerformerDocumentImpl extends org.omg.schema.spec.bpmn.x20.impl.ActivityResourceDocumentImpl implements org.omg.schema.spec.bpmn.x20.PerformerDocument
{
    private static final long serialVersionUID = 1L;
    
    public PerformerDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PERFORMER$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "performer");
    private static final org.apache.xmlbeans.QNameSet PERFORMER$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "humanPerformer"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "performer"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "potentialOwner"),
    });
    
    
    /**
     * Gets the "performer" element
     */
    public org.omg.schema.spec.bpmn.x20.TPerformer getPerformer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TPerformer target = null;
            target = (org.omg.schema.spec.bpmn.x20.TPerformer)get_store().find_element_user(PERFORMER$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "performer" element
     */
    public void setPerformer(org.omg.schema.spec.bpmn.x20.TPerformer performer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TPerformer target = null;
            target = (org.omg.schema.spec.bpmn.x20.TPerformer)get_store().find_element_user(PERFORMER$1, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TPerformer)get_store().add_element_user(PERFORMER$0);
            }
            target.set(performer);
        }
    }
    
    /**
     * Appends and returns a new empty "performer" element
     */
    public org.omg.schema.spec.bpmn.x20.TPerformer addNewPerformer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TPerformer target = null;
            target = (org.omg.schema.spec.bpmn.x20.TPerformer)get_store().add_element_user(PERFORMER$0);
            return target;
        }
    }
}

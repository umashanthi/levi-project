/*
 * An XML document type.
 * Localname: humanPerformer
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.HumanPerformerDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one humanPerformer(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class HumanPerformerDocumentImpl extends org.omg.schema.spec.bpmn.x20.impl.PerformerDocumentImpl implements org.omg.schema.spec.bpmn.x20.HumanPerformerDocument
{
    private static final long serialVersionUID = 1L;
    
    public HumanPerformerDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HUMANPERFORMER$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "humanPerformer");
    
    
    /**
     * Gets the "humanPerformer" element
     */
    public org.omg.schema.spec.bpmn.x20.THumanPerformer getHumanPerformer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.THumanPerformer target = null;
            target = (org.omg.schema.spec.bpmn.x20.THumanPerformer)get_store().find_element_user(HUMANPERFORMER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "humanPerformer" element
     */
    public void setHumanPerformer(org.omg.schema.spec.bpmn.x20.THumanPerformer humanPerformer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.THumanPerformer target = null;
            target = (org.omg.schema.spec.bpmn.x20.THumanPerformer)get_store().find_element_user(HUMANPERFORMER$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.THumanPerformer)get_store().add_element_user(HUMANPERFORMER$0);
            }
            target.set(humanPerformer);
        }
    }
    
    /**
     * Appends and returns a new empty "humanPerformer" element
     */
    public org.omg.schema.spec.bpmn.x20.THumanPerformer addNewHumanPerformer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.THumanPerformer target = null;
            target = (org.omg.schema.spec.bpmn.x20.THumanPerformer)get_store().add_element_user(HUMANPERFORMER$0);
            return target;
        }
    }
}

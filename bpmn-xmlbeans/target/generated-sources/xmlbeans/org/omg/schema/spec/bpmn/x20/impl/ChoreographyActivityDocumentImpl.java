/*
 * An XML document type.
 * Localname: choreographyActivity
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.ChoreographyActivityDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one choreographyActivity(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class ChoreographyActivityDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.schema.spec.bpmn.x20.ChoreographyActivityDocument
{
    private static final long serialVersionUID = 1L;
    
    public ChoreographyActivityDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CHOREOGRAPHYACTIVITY$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "choreographyActivity");
    
    
    /**
     * Gets the "choreographyActivity" element
     */
    public org.omg.schema.spec.bpmn.x20.TChoreographyActivity getChoreographyActivity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TChoreographyActivity target = null;
            target = (org.omg.schema.spec.bpmn.x20.TChoreographyActivity)get_store().find_element_user(CHOREOGRAPHYACTIVITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "choreographyActivity" element
     */
    public void setChoreographyActivity(org.omg.schema.spec.bpmn.x20.TChoreographyActivity choreographyActivity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TChoreographyActivity target = null;
            target = (org.omg.schema.spec.bpmn.x20.TChoreographyActivity)get_store().find_element_user(CHOREOGRAPHYACTIVITY$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TChoreographyActivity)get_store().add_element_user(CHOREOGRAPHYACTIVITY$0);
            }
            target.set(choreographyActivity);
        }
    }
    
    /**
     * Appends and returns a new empty "choreographyActivity" element
     */
    public org.omg.schema.spec.bpmn.x20.TChoreographyActivity addNewChoreographyActivity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TChoreographyActivity target = null;
            target = (org.omg.schema.spec.bpmn.x20.TChoreographyActivity)get_store().add_element_user(CHOREOGRAPHYACTIVITY$0);
            return target;
        }
    }
}

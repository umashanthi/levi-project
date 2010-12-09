/*
 * An XML document type.
 * Localname: choreographySubProcess
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.ChoreographySubProcessDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one choreographySubProcess(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class ChoreographySubProcessDocumentImpl extends org.omg.schema.spec.bpmn.x20.impl.FlowElementDocumentImpl implements org.omg.schema.spec.bpmn.x20.ChoreographySubProcessDocument
{
    private static final long serialVersionUID = 1L;
    
    public ChoreographySubProcessDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CHOREOGRAPHYSUBPROCESS$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "choreographySubProcess");
    
    
    /**
     * Gets the "choreographySubProcess" element
     */
    public org.omg.schema.spec.bpmn.x20.TChoreographySubProcess getChoreographySubProcess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TChoreographySubProcess target = null;
            target = (org.omg.schema.spec.bpmn.x20.TChoreographySubProcess)get_store().find_element_user(CHOREOGRAPHYSUBPROCESS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "choreographySubProcess" element
     */
    public void setChoreographySubProcess(org.omg.schema.spec.bpmn.x20.TChoreographySubProcess choreographySubProcess)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TChoreographySubProcess target = null;
            target = (org.omg.schema.spec.bpmn.x20.TChoreographySubProcess)get_store().find_element_user(CHOREOGRAPHYSUBPROCESS$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TChoreographySubProcess)get_store().add_element_user(CHOREOGRAPHYSUBPROCESS$0);
            }
            target.set(choreographySubProcess);
        }
    }
    
    /**
     * Appends and returns a new empty "choreographySubProcess" element
     */
    public org.omg.schema.spec.bpmn.x20.TChoreographySubProcess addNewChoreographySubProcess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TChoreographySubProcess target = null;
            target = (org.omg.schema.spec.bpmn.x20.TChoreographySubProcess)get_store().add_element_user(CHOREOGRAPHYSUBPROCESS$0);
            return target;
        }
    }
}

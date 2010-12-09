/*
 * An XML document type.
 * Localname: sequenceFlow
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.SequenceFlowDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one sequenceFlow(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class SequenceFlowDocumentImpl extends org.omg.schema.spec.bpmn.x20.impl.FlowElementDocumentImpl implements org.omg.schema.spec.bpmn.x20.SequenceFlowDocument
{
    private static final long serialVersionUID = 1L;
    
    public SequenceFlowDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SEQUENCEFLOW$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "sequenceFlow");
    
    
    /**
     * Gets the "sequenceFlow" element
     */
    public org.omg.schema.spec.bpmn.x20.TSequenceFlow getSequenceFlow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TSequenceFlow target = null;
            target = (org.omg.schema.spec.bpmn.x20.TSequenceFlow)get_store().find_element_user(SEQUENCEFLOW$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "sequenceFlow" element
     */
    public void setSequenceFlow(org.omg.schema.spec.bpmn.x20.TSequenceFlow sequenceFlow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TSequenceFlow target = null;
            target = (org.omg.schema.spec.bpmn.x20.TSequenceFlow)get_store().find_element_user(SEQUENCEFLOW$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TSequenceFlow)get_store().add_element_user(SEQUENCEFLOW$0);
            }
            target.set(sequenceFlow);
        }
    }
    
    /**
     * Appends and returns a new empty "sequenceFlow" element
     */
    public org.omg.schema.spec.bpmn.x20.TSequenceFlow addNewSequenceFlow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TSequenceFlow target = null;
            target = (org.omg.schema.spec.bpmn.x20.TSequenceFlow)get_store().add_element_user(SEQUENCEFLOW$0);
            return target;
        }
    }
}

/*
 * An XML document type.
 * Localname: multiInstanceLoopCharacteristics
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.MultiInstanceLoopCharacteristicsDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one multiInstanceLoopCharacteristics(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class MultiInstanceLoopCharacteristicsDocumentImpl extends org.omg.schema.spec.bpmn.x20.impl.LoopCharacteristicsDocumentImpl implements org.omg.schema.spec.bpmn.x20.MultiInstanceLoopCharacteristicsDocument
{
    private static final long serialVersionUID = 1L;
    
    public MultiInstanceLoopCharacteristicsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MULTIINSTANCELOOPCHARACTERISTICS$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "multiInstanceLoopCharacteristics");
    
    
    /**
     * Gets the "multiInstanceLoopCharacteristics" element
     */
    public org.omg.schema.spec.bpmn.x20.TMultiInstanceLoopCharacteristics getMultiInstanceLoopCharacteristics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TMultiInstanceLoopCharacteristics target = null;
            target = (org.omg.schema.spec.bpmn.x20.TMultiInstanceLoopCharacteristics)get_store().find_element_user(MULTIINSTANCELOOPCHARACTERISTICS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "multiInstanceLoopCharacteristics" element
     */
    public void setMultiInstanceLoopCharacteristics(org.omg.schema.spec.bpmn.x20.TMultiInstanceLoopCharacteristics multiInstanceLoopCharacteristics)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TMultiInstanceLoopCharacteristics target = null;
            target = (org.omg.schema.spec.bpmn.x20.TMultiInstanceLoopCharacteristics)get_store().find_element_user(MULTIINSTANCELOOPCHARACTERISTICS$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TMultiInstanceLoopCharacteristics)get_store().add_element_user(MULTIINSTANCELOOPCHARACTERISTICS$0);
            }
            target.set(multiInstanceLoopCharacteristics);
        }
    }
    
    /**
     * Appends and returns a new empty "multiInstanceLoopCharacteristics" element
     */
    public org.omg.schema.spec.bpmn.x20.TMultiInstanceLoopCharacteristics addNewMultiInstanceLoopCharacteristics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TMultiInstanceLoopCharacteristics target = null;
            target = (org.omg.schema.spec.bpmn.x20.TMultiInstanceLoopCharacteristics)get_store().add_element_user(MULTIINSTANCELOOPCHARACTERISTICS$0);
            return target;
        }
    }
}

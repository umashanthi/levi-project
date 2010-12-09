/*
 * An XML document type.
 * Localname: standardLoopCharacteristics
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.StandardLoopCharacteristicsDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one standardLoopCharacteristics(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class StandardLoopCharacteristicsDocumentImpl extends org.omg.schema.spec.bpmn.x20.impl.LoopCharacteristicsDocumentImpl implements org.omg.schema.spec.bpmn.x20.StandardLoopCharacteristicsDocument
{
    private static final long serialVersionUID = 1L;
    
    public StandardLoopCharacteristicsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STANDARDLOOPCHARACTERISTICS$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "standardLoopCharacteristics");
    
    
    /**
     * Gets the "standardLoopCharacteristics" element
     */
    public org.omg.schema.spec.bpmn.x20.TStandardLoopCharacteristics getStandardLoopCharacteristics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TStandardLoopCharacteristics target = null;
            target = (org.omg.schema.spec.bpmn.x20.TStandardLoopCharacteristics)get_store().find_element_user(STANDARDLOOPCHARACTERISTICS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "standardLoopCharacteristics" element
     */
    public void setStandardLoopCharacteristics(org.omg.schema.spec.bpmn.x20.TStandardLoopCharacteristics standardLoopCharacteristics)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TStandardLoopCharacteristics target = null;
            target = (org.omg.schema.spec.bpmn.x20.TStandardLoopCharacteristics)get_store().find_element_user(STANDARDLOOPCHARACTERISTICS$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TStandardLoopCharacteristics)get_store().add_element_user(STANDARDLOOPCHARACTERISTICS$0);
            }
            target.set(standardLoopCharacteristics);
        }
    }
    
    /**
     * Appends and returns a new empty "standardLoopCharacteristics" element
     */
    public org.omg.schema.spec.bpmn.x20.TStandardLoopCharacteristics addNewStandardLoopCharacteristics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TStandardLoopCharacteristics target = null;
            target = (org.omg.schema.spec.bpmn.x20.TStandardLoopCharacteristics)get_store().add_element_user(STANDARDLOOPCHARACTERISTICS$0);
            return target;
        }
    }
}

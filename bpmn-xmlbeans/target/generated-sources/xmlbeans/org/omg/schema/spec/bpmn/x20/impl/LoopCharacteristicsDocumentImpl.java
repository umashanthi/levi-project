/*
 * An XML document type.
 * Localname: loopCharacteristics
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.LoopCharacteristicsDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one loopCharacteristics(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class LoopCharacteristicsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.schema.spec.bpmn.x20.LoopCharacteristicsDocument
{
    private static final long serialVersionUID = 1L;
    
    public LoopCharacteristicsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOOPCHARACTERISTICS$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "loopCharacteristics");
    private static final org.apache.xmlbeans.QNameSet LOOPCHARACTERISTICS$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "standardLoopCharacteristics"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "loopCharacteristics"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "multiInstanceLoopCharacteristics"),
    });
    
    
    /**
     * Gets the "loopCharacteristics" element
     */
    public org.omg.schema.spec.bpmn.x20.TLoopCharacteristics getLoopCharacteristics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TLoopCharacteristics target = null;
            target = (org.omg.schema.spec.bpmn.x20.TLoopCharacteristics)get_store().find_element_user(LOOPCHARACTERISTICS$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "loopCharacteristics" element
     */
    public void setLoopCharacteristics(org.omg.schema.spec.bpmn.x20.TLoopCharacteristics loopCharacteristics)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TLoopCharacteristics target = null;
            target = (org.omg.schema.spec.bpmn.x20.TLoopCharacteristics)get_store().find_element_user(LOOPCHARACTERISTICS$1, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TLoopCharacteristics)get_store().add_element_user(LOOPCHARACTERISTICS$0);
            }
            target.set(loopCharacteristics);
        }
    }
    
    /**
     * Appends and returns a new empty "loopCharacteristics" element
     */
    public org.omg.schema.spec.bpmn.x20.TLoopCharacteristics addNewLoopCharacteristics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TLoopCharacteristics target = null;
            target = (org.omg.schema.spec.bpmn.x20.TLoopCharacteristics)get_store().add_element_user(LOOPCHARACTERISTICS$0);
            return target;
        }
    }
}

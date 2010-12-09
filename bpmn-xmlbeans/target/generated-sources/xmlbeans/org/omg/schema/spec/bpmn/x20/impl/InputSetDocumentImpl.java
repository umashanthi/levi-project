/*
 * An XML document type.
 * Localname: inputSet
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.InputSetDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one inputSet(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class InputSetDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.schema.spec.bpmn.x20.InputSetDocument
{
    private static final long serialVersionUID = 1L;
    
    public InputSetDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INPUTSET$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "inputSet");
    
    
    /**
     * Gets the "inputSet" element
     */
    public org.omg.schema.spec.bpmn.x20.TInputSet getInputSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TInputSet target = null;
            target = (org.omg.schema.spec.bpmn.x20.TInputSet)get_store().find_element_user(INPUTSET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "inputSet" element
     */
    public void setInputSet(org.omg.schema.spec.bpmn.x20.TInputSet inputSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TInputSet target = null;
            target = (org.omg.schema.spec.bpmn.x20.TInputSet)get_store().find_element_user(INPUTSET$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TInputSet)get_store().add_element_user(INPUTSET$0);
            }
            target.set(inputSet);
        }
    }
    
    /**
     * Appends and returns a new empty "inputSet" element
     */
    public org.omg.schema.spec.bpmn.x20.TInputSet addNewInputSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TInputSet target = null;
            target = (org.omg.schema.spec.bpmn.x20.TInputSet)get_store().add_element_user(INPUTSET$0);
            return target;
        }
    }
}

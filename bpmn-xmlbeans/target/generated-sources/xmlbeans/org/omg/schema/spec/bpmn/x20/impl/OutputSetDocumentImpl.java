/*
 * An XML document type.
 * Localname: outputSet
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.OutputSetDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one outputSet(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class OutputSetDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.schema.spec.bpmn.x20.OutputSetDocument
{
    private static final long serialVersionUID = 1L;
    
    public OutputSetDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OUTPUTSET$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "outputSet");
    
    
    /**
     * Gets the "outputSet" element
     */
    public org.omg.schema.spec.bpmn.x20.TOutputSet getOutputSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TOutputSet target = null;
            target = (org.omg.schema.spec.bpmn.x20.TOutputSet)get_store().find_element_user(OUTPUTSET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "outputSet" element
     */
    public void setOutputSet(org.omg.schema.spec.bpmn.x20.TOutputSet outputSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TOutputSet target = null;
            target = (org.omg.schema.spec.bpmn.x20.TOutputSet)get_store().find_element_user(OUTPUTSET$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TOutputSet)get_store().add_element_user(OUTPUTSET$0);
            }
            target.set(outputSet);
        }
    }
    
    /**
     * Appends and returns a new empty "outputSet" element
     */
    public org.omg.schema.spec.bpmn.x20.TOutputSet addNewOutputSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TOutputSet target = null;
            target = (org.omg.schema.spec.bpmn.x20.TOutputSet)get_store().add_element_user(OUTPUTSET$0);
            return target;
        }
    }
}

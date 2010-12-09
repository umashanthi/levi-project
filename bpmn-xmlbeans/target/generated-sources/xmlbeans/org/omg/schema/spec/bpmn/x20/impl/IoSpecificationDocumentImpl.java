/*
 * An XML document type.
 * Localname: ioSpecification
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.IoSpecificationDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one ioSpecification(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class IoSpecificationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.schema.spec.bpmn.x20.IoSpecificationDocument
{
    private static final long serialVersionUID = 1L;
    
    public IoSpecificationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IOSPECIFICATION$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "ioSpecification");
    
    
    /**
     * Gets the "ioSpecification" element
     */
    public org.omg.schema.spec.bpmn.x20.TInputOutputSpecification getIoSpecification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TInputOutputSpecification target = null;
            target = (org.omg.schema.spec.bpmn.x20.TInputOutputSpecification)get_store().find_element_user(IOSPECIFICATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ioSpecification" element
     */
    public void setIoSpecification(org.omg.schema.spec.bpmn.x20.TInputOutputSpecification ioSpecification)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TInputOutputSpecification target = null;
            target = (org.omg.schema.spec.bpmn.x20.TInputOutputSpecification)get_store().find_element_user(IOSPECIFICATION$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TInputOutputSpecification)get_store().add_element_user(IOSPECIFICATION$0);
            }
            target.set(ioSpecification);
        }
    }
    
    /**
     * Appends and returns a new empty "ioSpecification" element
     */
    public org.omg.schema.spec.bpmn.x20.TInputOutputSpecification addNewIoSpecification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TInputOutputSpecification target = null;
            target = (org.omg.schema.spec.bpmn.x20.TInputOutputSpecification)get_store().add_element_user(IOSPECIFICATION$0);
            return target;
        }
    }
}

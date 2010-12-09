/*
 * An XML document type.
 * Localname: baseElementWithMixedContent
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.BaseElementWithMixedContentDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one baseElementWithMixedContent(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class BaseElementWithMixedContentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.schema.spec.bpmn.x20.BaseElementWithMixedContentDocument
{
    private static final long serialVersionUID = 1L;
    
    public BaseElementWithMixedContentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BASEELEMENTWITHMIXEDCONTENT$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "baseElementWithMixedContent");
    
    
    /**
     * Gets the "baseElementWithMixedContent" element
     */
    public org.omg.schema.spec.bpmn.x20.TBaseElementWithMixedContent getBaseElementWithMixedContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TBaseElementWithMixedContent target = null;
            target = (org.omg.schema.spec.bpmn.x20.TBaseElementWithMixedContent)get_store().find_element_user(BASEELEMENTWITHMIXEDCONTENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "baseElementWithMixedContent" element
     */
    public void setBaseElementWithMixedContent(org.omg.schema.spec.bpmn.x20.TBaseElementWithMixedContent baseElementWithMixedContent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TBaseElementWithMixedContent target = null;
            target = (org.omg.schema.spec.bpmn.x20.TBaseElementWithMixedContent)get_store().find_element_user(BASEELEMENTWITHMIXEDCONTENT$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TBaseElementWithMixedContent)get_store().add_element_user(BASEELEMENTWITHMIXEDCONTENT$0);
            }
            target.set(baseElementWithMixedContent);
        }
    }
    
    /**
     * Appends and returns a new empty "baseElementWithMixedContent" element
     */
    public org.omg.schema.spec.bpmn.x20.TBaseElementWithMixedContent addNewBaseElementWithMixedContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TBaseElementWithMixedContent target = null;
            target = (org.omg.schema.spec.bpmn.x20.TBaseElementWithMixedContent)get_store().add_element_user(BASEELEMENTWITHMIXEDCONTENT$0);
            return target;
        }
    }
}

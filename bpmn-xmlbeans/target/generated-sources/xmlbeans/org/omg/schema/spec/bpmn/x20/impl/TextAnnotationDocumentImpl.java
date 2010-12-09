/*
 * An XML document type.
 * Localname: textAnnotation
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.TextAnnotationDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one textAnnotation(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class TextAnnotationDocumentImpl extends org.omg.schema.spec.bpmn.x20.impl.ArtifactDocumentImpl implements org.omg.schema.spec.bpmn.x20.TextAnnotationDocument
{
    private static final long serialVersionUID = 1L;
    
    public TextAnnotationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TEXTANNOTATION$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "textAnnotation");
    
    
    /**
     * Gets the "textAnnotation" element
     */
    public org.omg.schema.spec.bpmn.x20.TTextAnnotation getTextAnnotation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TTextAnnotation target = null;
            target = (org.omg.schema.spec.bpmn.x20.TTextAnnotation)get_store().find_element_user(TEXTANNOTATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "textAnnotation" element
     */
    public void setTextAnnotation(org.omg.schema.spec.bpmn.x20.TTextAnnotation textAnnotation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TTextAnnotation target = null;
            target = (org.omg.schema.spec.bpmn.x20.TTextAnnotation)get_store().find_element_user(TEXTANNOTATION$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TTextAnnotation)get_store().add_element_user(TEXTANNOTATION$0);
            }
            target.set(textAnnotation);
        }
    }
    
    /**
     * Appends and returns a new empty "textAnnotation" element
     */
    public org.omg.schema.spec.bpmn.x20.TTextAnnotation addNewTextAnnotation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TTextAnnotation target = null;
            target = (org.omg.schema.spec.bpmn.x20.TTextAnnotation)get_store().add_element_user(TEXTANNOTATION$0);
            return target;
        }
    }
}

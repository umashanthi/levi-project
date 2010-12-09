/*
 * XML Type:  tTextAnnotation
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.TTextAnnotation
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * An XML tTextAnnotation(@http://schema.omg.org/spec/BPMN/2.0).
 *
 * This is a complex type.
 */
public class TTextAnnotationImpl extends org.omg.schema.spec.bpmn.x20.impl.TArtifactImpl implements org.omg.schema.spec.bpmn.x20.TTextAnnotation
{
    private static final long serialVersionUID = 1L;
    
    public TTextAnnotationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TEXT$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "text");
    
    
    /**
     * Gets the "text" element
     */
    public org.omg.schema.spec.bpmn.x20.TText getText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TText target = null;
            target = (org.omg.schema.spec.bpmn.x20.TText)get_store().find_element_user(TEXT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "text" element
     */
    public boolean isSetText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TEXT$0) != 0;
        }
    }
    
    /**
     * Sets the "text" element
     */
    public void setText(org.omg.schema.spec.bpmn.x20.TText text)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TText target = null;
            target = (org.omg.schema.spec.bpmn.x20.TText)get_store().find_element_user(TEXT$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TText)get_store().add_element_user(TEXT$0);
            }
            target.set(text);
        }
    }
    
    /**
     * Appends and returns a new empty "text" element
     */
    public org.omg.schema.spec.bpmn.x20.TText addNewText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TText target = null;
            target = (org.omg.schema.spec.bpmn.x20.TText)get_store().add_element_user(TEXT$0);
            return target;
        }
    }
    
    /**
     * Unsets the "text" element
     */
    public void unsetText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TEXT$0, 0);
        }
    }
}

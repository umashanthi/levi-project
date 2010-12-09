/*
 * An XML document type.
 * Localname: text
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.TextDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one text(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class TextDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.schema.spec.bpmn.x20.TextDocument
{
    private static final long serialVersionUID = 1L;
    
    public TextDocumentImpl(org.apache.xmlbeans.SchemaType sType)
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
}

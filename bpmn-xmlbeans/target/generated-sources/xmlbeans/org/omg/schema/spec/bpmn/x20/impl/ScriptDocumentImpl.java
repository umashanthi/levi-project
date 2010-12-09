/*
 * An XML document type.
 * Localname: script
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.ScriptDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one script(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class ScriptDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.schema.spec.bpmn.x20.ScriptDocument
{
    private static final long serialVersionUID = 1L;
    
    public ScriptDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SCRIPT$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "script");
    
    
    /**
     * Gets the "script" element
     */
    public org.omg.schema.spec.bpmn.x20.TScript getScript()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TScript target = null;
            target = (org.omg.schema.spec.bpmn.x20.TScript)get_store().find_element_user(SCRIPT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "script" element
     */
    public void setScript(org.omg.schema.spec.bpmn.x20.TScript script)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TScript target = null;
            target = (org.omg.schema.spec.bpmn.x20.TScript)get_store().find_element_user(SCRIPT$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TScript)get_store().add_element_user(SCRIPT$0);
            }
            target.set(script);
        }
    }
    
    /**
     * Appends and returns a new empty "script" element
     */
    public org.omg.schema.spec.bpmn.x20.TScript addNewScript()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TScript target = null;
            target = (org.omg.schema.spec.bpmn.x20.TScript)get_store().add_element_user(SCRIPT$0);
            return target;
        }
    }
}

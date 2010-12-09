/*
 * An XML document type.
 * Localname: linkEventDefinition
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.LinkEventDefinitionDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one linkEventDefinition(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class LinkEventDefinitionDocumentImpl extends org.omg.schema.spec.bpmn.x20.impl.EventDefinitionDocumentImpl implements org.omg.schema.spec.bpmn.x20.LinkEventDefinitionDocument
{
    private static final long serialVersionUID = 1L;
    
    public LinkEventDefinitionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LINKEVENTDEFINITION$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "linkEventDefinition");
    
    
    /**
     * Gets the "linkEventDefinition" element
     */
    public org.omg.schema.spec.bpmn.x20.TLinkEventDefinition getLinkEventDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TLinkEventDefinition target = null;
            target = (org.omg.schema.spec.bpmn.x20.TLinkEventDefinition)get_store().find_element_user(LINKEVENTDEFINITION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "linkEventDefinition" element
     */
    public void setLinkEventDefinition(org.omg.schema.spec.bpmn.x20.TLinkEventDefinition linkEventDefinition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TLinkEventDefinition target = null;
            target = (org.omg.schema.spec.bpmn.x20.TLinkEventDefinition)get_store().find_element_user(LINKEVENTDEFINITION$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TLinkEventDefinition)get_store().add_element_user(LINKEVENTDEFINITION$0);
            }
            target.set(linkEventDefinition);
        }
    }
    
    /**
     * Appends and returns a new empty "linkEventDefinition" element
     */
    public org.omg.schema.spec.bpmn.x20.TLinkEventDefinition addNewLinkEventDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TLinkEventDefinition target = null;
            target = (org.omg.schema.spec.bpmn.x20.TLinkEventDefinition)get_store().add_element_user(LINKEVENTDEFINITION$0);
            return target;
        }
    }
}

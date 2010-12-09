/*
 * An XML document type.
 * Localname: diagramDefinition
 * Namespace: http://www.omg.com/dd/1.0.0
 * Java type: com.omg.dd.x100.DiagramDefinitionDocument
 *
 * Automatically generated - do not modify.
 */
package com.omg.dd.x100.impl;
/**
 * A document containing one diagramDefinition(@http://www.omg.com/dd/1.0.0) element.
 *
 * This is a complex type.
 */
public class DiagramDefinitionDocumentImpl extends com.omg.dd.x100.impl.ViewDefinitionDocumentImpl implements com.omg.dd.x100.DiagramDefinitionDocument
{
    private static final long serialVersionUID = 1L;
    
    public DiagramDefinitionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DIAGRAMDEFINITION$0 = 
        new javax.xml.namespace.QName("http://www.omg.com/dd/1.0.0", "diagramDefinition");
    
    
    /**
     * Gets the "diagramDefinition" element
     */
    public com.omg.dd.x100.DiagramDefinition getDiagramDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.omg.dd.x100.DiagramDefinition target = null;
            target = (com.omg.dd.x100.DiagramDefinition)get_store().find_element_user(DIAGRAMDEFINITION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "diagramDefinition" element
     */
    public void setDiagramDefinition(com.omg.dd.x100.DiagramDefinition diagramDefinition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.omg.dd.x100.DiagramDefinition target = null;
            target = (com.omg.dd.x100.DiagramDefinition)get_store().find_element_user(DIAGRAMDEFINITION$0, 0);
            if (target == null)
            {
                target = (com.omg.dd.x100.DiagramDefinition)get_store().add_element_user(DIAGRAMDEFINITION$0);
            }
            target.set(diagramDefinition);
        }
    }
    
    /**
     * Appends and returns a new empty "diagramDefinition" element
     */
    public com.omg.dd.x100.DiagramDefinition addNewDiagramDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.omg.dd.x100.DiagramDefinition target = null;
            target = (com.omg.dd.x100.DiagramDefinition)get_store().add_element_user(DIAGRAMDEFINITION$0);
            return target;
        }
    }
}

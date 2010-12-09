/*
 * An XML document type.
 * Localname: itemDefinition
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.ItemDefinitionDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one itemDefinition(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class ItemDefinitionDocumentImpl extends org.omg.schema.spec.bpmn.x20.impl.RootElementDocumentImpl implements org.omg.schema.spec.bpmn.x20.ItemDefinitionDocument
{
    private static final long serialVersionUID = 1L;
    
    public ItemDefinitionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ITEMDEFINITION$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "itemDefinition");
    
    
    /**
     * Gets the "itemDefinition" element
     */
    public org.omg.schema.spec.bpmn.x20.TItemDefinition getItemDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TItemDefinition target = null;
            target = (org.omg.schema.spec.bpmn.x20.TItemDefinition)get_store().find_element_user(ITEMDEFINITION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "itemDefinition" element
     */
    public void setItemDefinition(org.omg.schema.spec.bpmn.x20.TItemDefinition itemDefinition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TItemDefinition target = null;
            target = (org.omg.schema.spec.bpmn.x20.TItemDefinition)get_store().find_element_user(ITEMDEFINITION$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TItemDefinition)get_store().add_element_user(ITEMDEFINITION$0);
            }
            target.set(itemDefinition);
        }
    }
    
    /**
     * Appends and returns a new empty "itemDefinition" element
     */
    public org.omg.schema.spec.bpmn.x20.TItemDefinition addNewItemDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TItemDefinition target = null;
            target = (org.omg.schema.spec.bpmn.x20.TItemDefinition)get_store().add_element_user(ITEMDEFINITION$0);
            return target;
        }
    }
}

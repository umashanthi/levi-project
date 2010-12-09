/*
 * An XML document type.
 * Localname: resourceAssignmentExpression
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.ResourceAssignmentExpressionDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one resourceAssignmentExpression(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class ResourceAssignmentExpressionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.schema.spec.bpmn.x20.ResourceAssignmentExpressionDocument
{
    private static final long serialVersionUID = 1L;
    
    public ResourceAssignmentExpressionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESOURCEASSIGNMENTEXPRESSION$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "resourceAssignmentExpression");
    
    
    /**
     * Gets the "resourceAssignmentExpression" element
     */
    public org.omg.schema.spec.bpmn.x20.TResourceAssignmentExpression getResourceAssignmentExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TResourceAssignmentExpression target = null;
            target = (org.omg.schema.spec.bpmn.x20.TResourceAssignmentExpression)get_store().find_element_user(RESOURCEASSIGNMENTEXPRESSION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "resourceAssignmentExpression" element
     */
    public void setResourceAssignmentExpression(org.omg.schema.spec.bpmn.x20.TResourceAssignmentExpression resourceAssignmentExpression)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TResourceAssignmentExpression target = null;
            target = (org.omg.schema.spec.bpmn.x20.TResourceAssignmentExpression)get_store().find_element_user(RESOURCEASSIGNMENTEXPRESSION$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TResourceAssignmentExpression)get_store().add_element_user(RESOURCEASSIGNMENTEXPRESSION$0);
            }
            target.set(resourceAssignmentExpression);
        }
    }
    
    /**
     * Appends and returns a new empty "resourceAssignmentExpression" element
     */
    public org.omg.schema.spec.bpmn.x20.TResourceAssignmentExpression addNewResourceAssignmentExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TResourceAssignmentExpression target = null;
            target = (org.omg.schema.spec.bpmn.x20.TResourceAssignmentExpression)get_store().add_element_user(RESOURCEASSIGNMENTEXPRESSION$0);
            return target;
        }
    }
}

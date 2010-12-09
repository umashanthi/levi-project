/*
 * An XML document type.
 * Localname: constraint
 * Namespace: http://www.omg.com/dd/1.0.0
 * Java type: com.omg.dd.x100.ConstraintDocument
 *
 * Automatically generated - do not modify.
 */
package com.omg.dd.x100.impl;
/**
 * A document containing one constraint(@http://www.omg.com/dd/1.0.0) element.
 *
 * This is a complex type.
 */
public class ConstraintDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.omg.dd.x100.ConstraintDocument
{
    private static final long serialVersionUID = 1L;
    
    public ConstraintDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONSTRAINT$0 = 
        new javax.xml.namespace.QName("http://www.omg.com/dd/1.0.0", "constraint");
    
    
    /**
     * Gets the "constraint" element
     */
    public com.omg.dd.x100.Constraint getConstraint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.omg.dd.x100.Constraint target = null;
            target = (com.omg.dd.x100.Constraint)get_store().find_element_user(CONSTRAINT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "constraint" element
     */
    public void setConstraint(com.omg.dd.x100.Constraint constraint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.omg.dd.x100.Constraint target = null;
            target = (com.omg.dd.x100.Constraint)get_store().find_element_user(CONSTRAINT$0, 0);
            if (target == null)
            {
                target = (com.omg.dd.x100.Constraint)get_store().add_element_user(CONSTRAINT$0);
            }
            target.set(constraint);
        }
    }
    
    /**
     * Appends and returns a new empty "constraint" element
     */
    public com.omg.dd.x100.Constraint addNewConstraint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.omg.dd.x100.Constraint target = null;
            target = (com.omg.dd.x100.Constraint)get_store().add_element_user(CONSTRAINT$0);
            return target;
        }
    }
}

package org.levi.engine.utils;

/**
 * @author Ishan Jayawardena.
 */
public class DataObject {
    private Class type;
    private Object value;
    private Integer intValue;
    private Double doubleValue;
    private Boolean boolValue;
    private Character charValue;
    private String stringValue;
    
    public DataObject(Object value) {
        this.type = value.getClass();
        if (type == Integer.class) {
            intValue = (Integer)value;
        } else if (type == Double.class) {
            doubleValue = (Double)value;
        } else if (type == Boolean.class) {
            boolValue = (Boolean)value;
        } else if (type == Character.class) {
            charValue = (Character)value;
        } else if (type == String.class) {
            stringValue = (String)value;
        } else {
            throw new RuntimeException("Unsupported DataObject type " + type.getClass());
        }
        this.value = value;
    }

    public void set(Object value) {
        if (value.getClass() != type) {
            throw new RuntimeException("Types do not match.");   
        }
    }
    public Class getType() {
        return type;
    }

    public Object getValue() {
        return value;
    }

    public static void main(String[] args) {
        DataObject intobject = new DataObject(new Integer(123));
        Integer i = (Integer)intobject.getValue();
        System.out.println(i.byteValue());

        String formalExpression = " ${thisIsATest} ";
        formalExpression = formalExpression.trim();
        System.out.println(formalExpression.substring(2, formalExpression.length()-1));
    }
}

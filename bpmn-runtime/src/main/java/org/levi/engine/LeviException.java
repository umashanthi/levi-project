package org.levi.engine;

/**
 * @author Ishan Jayawardena
 */
public class LeviException extends RuntimeException {
    public LeviException(String s) {
        super(s);
    }

    public LeviException(Exception e) {
        super(e);
    }
}

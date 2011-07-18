package org.levi.engine.cmd;

public interface Command<T> {

    T execute();

}
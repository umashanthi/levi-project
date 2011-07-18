package org.levi.engine.impl.bpmn;

import org.apache.ode.jacob.Channel;

import java.util.Map;

/**
 * @author Ishan Jayawardena
 */
public interface WaitedTaskChannel extends Channel, WaitedTasks {
    public void resume(Map<String, Object> vars);
}

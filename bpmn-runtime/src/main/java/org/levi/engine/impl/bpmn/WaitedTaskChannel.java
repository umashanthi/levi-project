package org.levi.engine.impl.bpmn;

import org.apache.ode.jacob.Channel;

/**
 * @author Ishan Jayawardena
 */
public interface WaitedTaskChannel extends Channel, WaitedTasks {
    public void resume(Object var);
}

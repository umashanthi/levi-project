package org.levi.engine.impl.bpmn;

import org.apache.ode.jacob.ap.ChannelType;

/**
 * @author Ishan Jayawardena
 */

@ChannelType
public interface WaitedTasks {
    public void resume(Object var);
}

package org.levi.engine.impl.bpmn;

import org.apache.ode.jacob.ap.ChannelType;

import java.util.Map;

/**
 * @author Ishan Jayawardena
 */

@ChannelType
public interface WaitedTasks {
    public void resume(Map<String, Object> vars);
}

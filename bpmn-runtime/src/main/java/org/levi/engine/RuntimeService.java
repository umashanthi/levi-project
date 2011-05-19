package org.levi.engine;

import java.io.IOException;
import java.util.Map;

/**
 * @author Ishan Jayawardena
 */
public interface RuntimeService {
    boolean start();
    boolean stop();
    String startProcess(String processId, Map<String, Object> variables) throws IOException, ClassNotFoundException;
    void stopProcess(String processId);
    void showRunningProcess();
    void claimUserTask(String pid, String userTaskId, Map<String, Object> variables);
    void resumeProcessInstance(String processId);
    void setVariable(String processId, String name, Object value);
    void setVariables(String processId, Map<String, Object> values);
    Object getVariable(String processId, String name);
    Map<String, Object> getVariables(String processId);
}

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
}

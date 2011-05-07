package org.levi.engine;

import java.io.IOException;
import java.util.Map;

/**
 * @author Ishan Jayawardena
 */
public interface RuntimeService {
    public boolean start();
    public boolean stop();
    public void startProcess(String processId, Map<String, Object> variables) throws IOException, ClassNotFoundException;
    public void stopProcess(String processId);
    public void showRunningProcess();
}

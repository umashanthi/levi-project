package org.levi.engine;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * @author Ishan Jayawardena
 */
public interface ProcessEngine {
    void stop() throws FileNotFoundException, IOException;
    String deploy(String larPath) throws IOException;
    void undeployAll() throws IOException;
    void undeploy(String id) throws IOException;
    void cleanup() throws IOException;
    String startProcess(String id) throws IOException, ClassNotFoundException;
    String startProcess(String id, Map<String, Object> variables) throws IOException, ClassNotFoundException;
    void stopProcess(String id) throws IOException, ClassNotFoundException;
    void claimUserTask(String pid, String userTaskId, Map<String, Object> variables);
    String getDiagramPath(String id);
    List<String> getDeploymentIds();
    List<String> getRunningProcessIds();
    void resumeProcessInstance(String processId);
}
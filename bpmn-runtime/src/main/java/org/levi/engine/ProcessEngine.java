package org.levi.engine;

import org.levi.engine.persistence.hibernate.process.hobj.DeploymentBean;

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

    String startProcess(String id, Map<String, Object> variables, String userId) throws IOException, ClassNotFoundException;

    void stopProcess(String id) throws IOException, ClassNotFoundException;

    void claimUserTask(String pid, String userTaskId, Map<String, Object> variables);

    String getDiagramPath(String id);

    List<String> getDeploymentIds();

    List<String> getRunningProcessIds();

    void resumeProcessInstance(String processId);

    void setVariable(String processId, String name, Object value);

    void setVariables(String processId, Map<String, Object> values);

    Object getVariable(String processId, String name);

    Map<String, Object> getVariables(String processId);

    boolean hasStartForm(String processId);

    List<DeploymentBean> getDeploymentBeans();
}
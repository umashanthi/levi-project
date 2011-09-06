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
    /**
     * Stops the process engine and save the state of all the parameters including the
     * running processes, process engine data, etc.
     * @throws FileNotFoundException
     * @throws IOException
     */
    void stop() throws FileNotFoundException, IOException;

    /**
     * Deploys a Levi archive to the engine.
     * @param larPath  path of the archive
     * @return the path where the archive is deployed
     * @throws IOException
     */
    String deploy(String larPath) throws IOException;

    /**
     * Removes all the currently deployed Levi archives from the engine
     * together with the data related to them from the database.
     * @throws IOException
     */
    void undeployAll() throws IOException;

    /**
     * Removes a deployment by the id of the process definition.
     * @see <code>{@link #undeployAll()}</code>
     * @param id
     * @throws IOException
     */
    void undeploy(String id) throws IOException;

    /**
     * Cleans up the process engine by removing unsaved or incomplete deployments
     * @throws IOException
     */
    void cleanup() throws IOException;

    /**
     * Starts a process instance with a deployed process definition.
     * @see <code>{@link #stopProcess(String)}}</code> and <code>{@link #startProcess(String, java.util.Map, String)}}</code>
     * @param id  process definition ID of the deployment
     * @return process ID of the started process instance
     * @throws IOException
     * @throws ClassNotFoundException
     */
    String startProcess(String id) throws IOException, ClassNotFoundException;

    /**
     * Similar to <code>{@link #startProcess(String)}</code>. But includes an initial list of
     * process variables and a user ID of the user who starts the process
     * @see <code>{@link #stopProcess(String)}}</code>
     * @param id process definition ID
     * @param variables initial variable map
     * @param userId ID of the user who starts the process
     * @return process ID of the started process instance
     * @throws IOException
     * @throws ClassNotFoundException
     */
    String startProcess(String id, Map<String, Object> variables, String userId) throws IOException, ClassNotFoundException;

    /**
     * Stops a process by the process ID.
     * @see <code>{@link #startProcess(String)}}</code>
     * @param id process definition ID.
     * @throws IOException
     * @throws ClassNotFoundException
     */
    void stopProcess(String id) throws IOException, ClassNotFoundException;

    /**
     * Returns the definition IDs of the deployed processes.
     * @return a list of definition IDs
     */
    List<String> getDeploymentIds();

    /**
     * Returns the process IDs of all running processes.
     * @return a list of process IDs
     */
    List<String> getRunningProcessIds();

    /**
     * Resumes the execution of a given process instance.
     * @param processId the ID of the process to be resumed
     * @return true if successfully resumed the execution. False otherwise.
     */
    boolean resumeProcessInstance(String processId);

    /**
     * Adds the given list of variables to the process variable list.
     * @param processId the ID of the process to which the variables must be added.
     * @param values (variablename, value) pairs
     */
    void setVariables(String processId, Map<String, Object> values);

    /**
     * Returns the process variables of a given process.
     * @param processId the ID of the process
     * @return the Map of process variables
     */
    Map<String, Object> getVariables(String processId);

    /**
     * Returns the list of Beans corresponding to the deployments
     * @return
     */
    List<DeploymentBean> getDeploymentBeans();

    void claimUserTask(String pid, String userTaskId, Map<String, Object> variables);

    void claim(String pid, String uid, String itemId);

    String getDiagramPath(String id);

    boolean hasStartForm(String processId);

    Object getVariable(String processId, String name);

    void setVariable(String processId, String name, Object value);
}
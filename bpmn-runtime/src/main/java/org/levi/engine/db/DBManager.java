package org.levi.engine.db;

import org.levi.engine.Deployment;
import org.levi.engine.EngineData;
import org.levi.engine.identity.Group;
import org.levi.engine.identity.User;
import org.levi.engine.impl.bpmn.StartEvent;
import org.levi.engine.impl.bpmn.UserTask;
import org.levi.engine.persistence.hibernate.HObject;
import org.levi.engine.persistence.hibernate.process.hobj.DeploymentBean;
import org.levi.engine.persistence.hibernate.process.hobj.EngineDataBean;
import org.levi.engine.persistence.hibernate.process.hobj.ProcessInstanceBean;
import org.levi.engine.persistence.hibernate.process.hobj.TaskBean;
import org.levi.engine.persistence.hibernate.user.hobj.GroupBean;
import org.levi.engine.persistence.hibernate.user.hobj.UserBean;
import org.levi.engine.runtime.ProcessInstance;

import java.util.List;
import java.util.Map;

/**
 * This is the interface to classes which handles the back end database management of Levi Engine
 */

public interface DBManager {

    /**
     *
     * @return
     */
    EngineData getEngineData();

    /**
     *
     * @return
     */
    EngineDataBean getEngineDataBean();

    /**
     *
     * @param user
     */
    void saveUser(UserBean user);

    /**
     *
     * @param group
     */
    void saveGroup(GroupBean group);

    /**
     *
     * @param userId
     * @return
     */
    UserBean getUser(String userId);

    /**
     *
     * @param groupId
     * @return
     */
    GroupBean getGroup(String groupId);

    /**
     *
     * @param userId
     * @param groupId
     */
    void addUserToGroup(String userId, String groupId);

    /**
     *
     * @param userId
     */
    void deleteUser(String userId);

    /**
     *
     * @param groupId
     */
    void deleteGroup(String groupId);

    /**
     *
     * @param userId
     * @param groupId
     */
    void removeUserFromGroup(String userId, String groupId);

    /**
     *
     * @param userId
     * @return
     */
    List<String> getGroupIds(String userId);

    /**
     *
     * @return
     */
    List<UserBean> getUserList();

    /**
     *
     * @return
     */
    List<GroupBean> getGroupList();

    /**
     *
     * @return
     */
    List<String> getGroupIdList();

    /**
     *
     * @param group
     */
    void saveGroup(Group group);

    /**
     *
     * @param user
     */
    void saveUser(User user);

    /**
     *
     * @param task
     */
    void saveTask(TaskBean task);

    /**
     *
     * @param taskId
     */
    void deleteTask(String taskId);

    /**
     *
     * @param task
     */
    void updateTask(TaskBean task);

    /**
     *
     * @param process
     */
    void saveProcess(DeploymentBean process);

    /**
     *
     * @param processId
     */
    void deleteProcess(String processId);

    /**
     *
     * @param process
     */
    void updateProcess(DeploymentBean process);

    /**
     *
     * @return
     */
    List<DeploymentBean> getDeployedProcessList();

    /**
     *
     * @param deployment
     */
    void persistDeployment(Deployment deployment);

    /**
     *
     * @param processId
     */
    void undeployProcess(String processId);

    /**
     *
     * @param processId
     * @return
     */
    String getProcessDefinition(String processId);

    /**
     *
     * @return
     */
    List<String> getDeploymentIds();

    /**
     *
     * @param process
     */
    void saveProcessInstance(ProcessInstanceBean process);

    /**
     *
     * @param processId
     */
    void deleteProcessInstance(String processId);

    /**
     *
     * @param process
     */
    void updateProcessInstance(ProcessInstanceBean process);

    /**
     *
     * @return
     */
    List<ProcessInstanceBean> getRunningProcessesInstancesList();

    /**
     *
     * @param processInstance
     */
    void persistProcessInstance(ProcessInstance processInstance);

    /**
     *
     * @param processId
     * @param variables
     */
    public void setVariables(String processId, Map<String, String> variables);

    /**
     *
     * @param processId
     * @return
     */
    public Map<String, String> getVariables(String processId);

    /**
     *
     * @param taskId
     * @return
     */
    UserBean getAssigneeForTask(String taskId);

    /**
     *
     * @param userId
     * @return
     */
    List<TaskBean> getUserTaskList(String userId);

    /**
     *
     * @return
     */
    List<TaskBean> getActiveTasks();

    /**
     *
     * @return
     */
    List<TaskBean> getUnassignedTasks();

    /**
     *
     * @param groupId
     * @return
     */
    List<TaskBean> getUnassignedTasks(String groupId);

    /**
     *
     * @param processId
     * @return
     */
    List<TaskBean> getActiveTasks(String processId);

    /**
     *
     * @param definitionId
     * @return
     */
    Map<String, TaskBean> getActiveTasksMap(String definitionId);

    /**
     *
     * @param taskId
     * @return
     */
    TaskBean getTaskBean(String taskId);

    /**
     *
     * @param taskId
     * @param processInstanceId
     * @param username
     * @return
     */
    boolean claimUserTask(String taskId, String processInstanceId, String username);

    /**
     *
     * @param taskId
     * @param userId
     */
    void assignTask(String taskId, String userId);

    /**
     *
     * @param taskId
     */
    void unassignTask(String taskId);

    /**
     *
     * @param taskId
     * @param userId
     */
    void removeTask(String taskId, String userId);

    /**
     *
     * @param processId
     * @return
     */
    List<String> getCompletedTasks(String processId);

    /**
     *
     * @param processId
     * @return
     */
    List<String> getRunningTasks(String processId);

    /**
     *
     * @param userTask
     */
    void persistUserTask(UserTask userTask);

    /**
     *
     * @param startEvent
     */
    void persistStartEvent(StartEvent startEvent);

    /**
     *
     * @param taskId
     * @param processInstanceId
     */
    void addRunningTask(String taskId, String processInstanceId);

    /**
     *
     * @param taskId
     * @param processInstanceId
     */
    void removeRunningTask(String taskId, String processInstanceId);

    /**
     *
     * @param taskId
     * @param processInstanceId
     */
    void addCompletedTask(String taskId, String processInstanceId);

    /**
     *
     * @param taskId
     * @return
     */
    String getPotentialGroup(String taskId);

    /**
     *
     */
    void closeSession();

    /**
     *
     * @param groupId
     * @param definitionId
     * @return
     */
    List<TaskBean> getUnassignedTasks(String groupId, String definitionId);

    /**
     *
     * @param userName
     * @param definitionId
     * @return
     */
    List<TaskBean> getUserTaskList(String userName, String definitionId);

    /**
     *
     * @param definitionId
     * @return
     */
    Map<String, TaskBean> getActiveProcessInstances(String definitionId);

    /**
     *
     * @param definitionId
     * @return
     */
    List<ProcessInstanceBean> getCompletedProcessInstances(String definitionId);

    /**
     * 
     * @param processInsId
     */
    void persistEndEvent(String processInsId);
}

package org.levi.engine.db;

import org.levi.engine.Deployment;
import org.levi.engine.EngineData;
import org.levi.engine.identity.Group;
import org.levi.engine.identity.User;
import org.levi.engine.impl.bpmn.StartEvent;
import org.levi.engine.impl.bpmn.UserTask;
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
 *
 * This is the interface to classes which handles the back-end database management of Levi Engine
 *
 */

public interface DBManager {

    /**
     *
     * @return EngineData
     */
    EngineData getEngineData();

    /**
     *
     * @return EngineDataBean
     */
    EngineDataBean getEngineDataBean();

    /**
     *
     * @param user - UserBean to be saved
     */
    void saveUser(UserBean user);

    /**
     *
     * @param group GroupBean to be saved
     */
    void saveGroup(GroupBean group);

    /**
     *
     * @param userId - id of the user
     * @return UserBean
     */
    UserBean getUser(String userId);

    /**
     *
     * @param groupId - id of the group
     * @return GroupBean
     */
    GroupBean getGroup(String groupId);

    /**
     *
     * @param userId - id of the user
     * @param groupId - id of the group which user assign to
     */
    void addUserToGroup(String userId, String groupId);

    /**
     *
     * @param userId - id of the user
     */
    void deleteUser(String userId);

    /**
     *
     * @param groupId  - id of the group
     */
    void deleteGroup(String groupId);

    /**
     *
     * @param userId  - id of the user
     * @param groupId - id of the group the user need to be removed from
     */
    void removeUserFromGroup(String userId, String groupId);

    /**
     *
     * @param userId
     * @return list of group ids which user belongs to
     */
    List<String> getGroupIds(String userId);

    /**
     *
     * @return list of users (UserBeans)
     */
    List<UserBean> getUserList();

    /**
     *
     * @return list of groups (GroupBeans)
     */
    List<GroupBean> getGroupList();

    /**
     *
     * @return list of group ids
     */
    List<String> getGroupIdList();

    /**
     *
     * @param group - Group object to be saved
     */
    void saveGroup(Group group);

    /**
     *
     * @param user - User object to be saved
     */
    void saveUser(User user);

    /**
     *
     * @param task - TaskBean
     */
    void saveTask(TaskBean task);

    /**
     *
     * @param taskId - id of the task
     */
    void deleteTask(String taskId);

    /**
     *
     * @param task - TaskBean to be updated
     */
    void updateTask(TaskBean task);

    /**
     *
     * @param process - DeploymentBean to be saved
     */
    void saveProcess(DeploymentBean process);

    /**
     *
     * @param processId - id of the deployed process
     */
    void deleteProcess(String processId);

    /**
     *
     * @param process - DeploymentBean to be saved
     */
    void updateProcess(DeploymentBean process);

    /**
     *
     * @return - list of deployed processes (DeploymentBeans)
     */
    List<DeploymentBean> getDeployedProcessList();

    /**
     *
     * @param deployment - Deployment object to be saved
     */
    void persistDeployment(Deployment deployment);

    /**
     *
     * @param processId - undeploying process id  
     */
    void undeployProcess(String processId);

    /**
     *
     * @param processId  - id of the deployed process
     * @return - process definition id
     */
    String getProcessDefinition(String processId);

    /**
     *
     * @return - list of depliyed process
     */
    List<String> getDeploymentIds();

    /**
     *
     * @param process - ProcessInstanceBean to be saved
     */
    void saveProcessInstance(ProcessInstanceBean process);

    /**
     *
     * @param processId - id of the process instance
     */
    void deleteProcessInstance(String processId);

    /**
     *
     * @param process - process instance to be updated (ProcessInstanceBean)
     */
    void updateProcessInstance(ProcessInstanceBean process);

    /**
     *
     * @return - list of process instances (ProcessInstanceBean)
     */
    List<ProcessInstanceBean> getRunningProcessesInstancesList();

    /**
     *
     * @param processInstance - save ProcessInstance object
     */
    void persistProcessInstance(ProcessInstance processInstance);

    /**
     *
     * @param processId - id of the process instance
     * @param variables - variable map belongs to the process instance
     */
    public void setVariables(String processId, Map<String, String> variables);

    /**
     *
     * @param processId - id of the process instance
     * @return - map of the process instance variables
     */
    public Map<String, String> getVariables(String processId);

    /**
     *
     * @param taskId - id of the task
     * @return - assignee (UserBean)
     */
    UserBean getAssigneeForTask(String taskId);

    /**
     *
     * @param userId - id of the user
     * @return - list of tasks assign to the user (TaskBeans)
     */
    List<TaskBean> getUserTaskList(String userId);

    /**
     *
     * @return - list of active tasks (TaskBeans)
     */
    List<TaskBean> getActiveTasks();

    /**
     *
     * @return - list of unassigned tasks (TaskBeans)
     */
    List<TaskBean> getUnassignedTasks();

    /**
     *
     * @param groupId - id of the group
     * @return  - list of unassigned tasks assign to the group (TaskBeans)
     */
    List<TaskBean> getUnassignedTasks(String groupId);

    /**
     *
     * @param processId - id of the process instance
     * @return - list of active tasks in the process instance (TaskBeans)
     */
    List<TaskBean> getActiveTasks(String processId);

    /**
     *
     * @param definitionId - id of the deployed process
     * @return - map of tasks (TaskBeans)
     */
    Map<String, TaskBean> getActiveTasksMap(String definitionId);

    /**
     *
     * @param taskId  - id of the task
     * @return - task (TaskBean)
     */
    TaskBean getTaskBean(String taskId);

    /**
     *
     * @param taskId - id of the task
     * @param processInstanceId - id of the process instance
     * @param username - id of the user
     * @return - boolean, can claim or not
     */
    boolean claimUserTask(String taskId, String processInstanceId, String username);

    /**
     *
     * @param taskId - id of the task
     * @param userId - id of the user task assign to
     */
    void assignTask(String taskId, String userId);

    /**
     *
     * @param taskId - id of the task need to unassign
     */
    void unassignTask(String taskId);

    /**
     *
     * @param taskId - id of the task
     * @param userId - id of the user assign to it
     */
    void removeTask(String taskId, String userId);

    /**
     *
     * @param processId - id of the process instance
     * @return - list of completed task ids 
     */
    List<String> getCompletedTasks(String processId);

    /**
     *
     * @param processId - id of the process instance
     * @return - list of running task ids
     */
    List<String> getRunningTasks(String processId);

    /**
     *
     * @param userTask - save UserTask
     */
    void persistUserTask(UserTask userTask);

    /**
     *
     * @param startEvent - save StartEvent
     */
    void persistStartEvent(StartEvent startEvent);

    /**
     *
     * @param taskId - id of the task to be added to running tasks
     * @param processInstanceId - process instance id task belongs to
     */
    void addRunningTask(String taskId, String processInstanceId);

    /**
     *
     * @param taskId  - id of the task to be removed from running tasks
     * @param processInstanceId - process instance id task belongs to
     */
    void removeRunningTask(String taskId, String processInstanceId);

    /**
     *
     * @param taskId - id of the task to be added to completed tasks
     * @param processInstanceId - process instance id task belongs to
     */
    void addCompletedTask(String taskId, String processInstanceId);

    /**
     *
     * @param taskId - id of the task
     * @return - group who can claim the task
     */
    String getPotentialGroup(String taskId);

    /**
     *
     * @param groupId - id of the group who can claim the task
     * @param definitionId - id of the process instance 
     * @return - list of unassign tasks (TaskBeans)
     */
    List<TaskBean> getUnassignedTasks(String groupId, String definitionId);

    /**
     *
     * @param userName - id of the user
     * @param definitionId - definition id of the deployed process
     * @return - list of tasks (TaskBean)
     */
    List<TaskBean> getUserTaskList(String userName, String definitionId);

    /**
     *
     * @param definitionId - definition id of the deployed process
     * @return - map of tasks in the process instances of the deployed process
     */
    Map<String, TaskBean> getActiveProcessInstances(String definitionId);

    /**
     *
     * @param definitionId - definition id of the deployed process
     * @return - list of process instances (ProcessInstanceBeans)
     */
    List<ProcessInstanceBean> getCompletedProcessInstances(String definitionId);

    /**
     * 
     * @param processInsId - id of the process instance which is set to be completed 
     */
    void persistEndEvent(String processInsId);
    
    void closeSession();

}

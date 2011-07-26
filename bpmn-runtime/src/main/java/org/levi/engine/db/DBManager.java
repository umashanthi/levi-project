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
     * This method saves a UserBean to the database; if the UserBean already exists, it updates the attributes
     *
     * @param user The user
     */
    void saveUser(UserBean user);

    void saveGroup(GroupBean group);

    UserBean getUser(String userId);

    GroupBean getGroup(String groupId);

    void addUserToGroup(String userId, String groupId);

    void deleteUser(String userId);        //?? Only ids or the UserBean object?

    void deleteGroup(String groupId);

    void removeUserFromGroup(String userId, String groupId); //?? UserBean& Group objects or simple the ids?

    /**
     * Given the userId, return the list of groups the user has membership of
     *
     * @param userId
     * @return
     */
    List<String> getGroupIds(String userId);

    void saveTask(TaskBean task);

    void deleteTask(String taskId);

    void updateTask(TaskBean task);

    void saveProcess(DeploymentBean process);

    void deleteProcess(String processId);

    void updateProcess(ProcessInstanceBean process);

    void saveProcessInstance(ProcessInstanceBean process);

    void deleteProcessInstance(String processId);

    void updateProcessInstance(ProcessInstanceBean process);

    List<TaskBean> getUserTaskList(String userId);

    List<ProcessInstanceBean> getRunningProcessesInstancesList();

    List<DeploymentBean> getDeployedProcessList();

    UserBean getAssigneeForTask(String taskId);

    List<TaskBean> getActiveTasks();

    List<TaskBean> getUnassignedTasks();

    List<TaskBean> getUnassignedTasks(String groupId);

    List<TaskBean> getActiveTasks(String processId);

    // given the taskId, the id of the process instance that task belongs to should be retrieved
    // TaskBean has a processInstanceId attribute
    // Can this be retrieved from the TaskBean table?
    String getProcessInstanceId(String taskId);

    TaskBean getTaskBean(String taskId);

    // Update the database to set assignee=username for the Task identified by taskId & processInstanceId
    boolean claimUserTask(String taskId, String processInstanceId, String username);

    List<UserBean> getUserList();

    List<GroupBean> getGroupList();

    List<String> getGroupIdList();

    void assignTask(String taskId, String userId);

    void unassignTask(String taskId);

    void removeTask(String taskId, String userId);

    EngineData getEngineData();

    EngineDataBean getEngineDataBean();

    void persistDeployment(Deployment deployment);


    void undeployProcess(String processId);

    void saveGroup(Group group);

    void saveUser(User user);

    void persistProcessInstance(ProcessInstance processInstance);

    String getProcessDefinition(String processId);

    List<String> getCompletedTasks(String processId);

    List<String> getRunningTasks(String processId);

    void persistUserTask(UserTask userTask);

    void persistStartEvent(StartEvent startEvent);

    void addRunningTask(String taskId);

    void removeRunningTask(String taskId);

    void addCompletedTask(String taskId);

    List<String> getDeploymentIds();

    public String getPotentialGroup(String taskId);

    public void setVariables(String processId, Map<String, String> variables);

    public Map<String, String> getVariables(String processId);

    void closeSession();
}

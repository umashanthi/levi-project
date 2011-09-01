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

    EngineData getEngineData();

    EngineDataBean getEngineDataBean();

    

    void saveUser(UserBean user);

    void saveGroup(GroupBean group);

    UserBean getUser(String userId);

    GroupBean getGroup(String groupId);

    void addUserToGroup(String userId, String groupId);

    void deleteUser(String userId);

    void deleteGroup(String groupId);

    void removeUserFromGroup(String userId, String groupId);

    List<String> getGroupIds(String userId);

    List<UserBean> getUserList();

    List<GroupBean> getGroupList();

    List<String> getGroupIdList();

    void saveGroup(Group group);

    void saveUser(User user);
    


    void saveTask(TaskBean task);

    void deleteTask(String taskId);

    void updateTask(TaskBean task);



    void saveProcess(DeploymentBean process);

    void deleteProcess(String processId);

    void updateProcess(DeploymentBean process);

    List<DeploymentBean> getDeployedProcessList();

    void persistDeployment(Deployment deployment);

    void undeployProcess(String processId);

    String getProcessDefinition(String processId);

    List<String> getDeploymentIds();



    void saveProcessInstance(ProcessInstanceBean process);

    void deleteProcessInstance(String processId);

    void updateProcessInstance(ProcessInstanceBean process);

    List<ProcessInstanceBean> getRunningProcessesInstancesList();

    void persistProcessInstance(ProcessInstance processInstance);

    public void setVariables(String processId, Map<String, String> variables);

    public Map<String, String> getVariables(String processId);



    UserBean getAssigneeForTask(String taskId);

    List<TaskBean> getUserTaskList(String userId);

    List<TaskBean> getActiveTasks();

    List<TaskBean> getUnassignedTasks();

    List<TaskBean> getUnassignedTasks(String groupId);

    List<TaskBean> getActiveTasks(String processId);

    TaskBean getTaskBean(String taskId);

    boolean claimUserTask(String taskId, String processInstanceId, String username);

    void assignTask(String taskId, String userId);

    void unassignTask(String taskId);

    void removeTask(String taskId, String userId);

    List<String> getCompletedTasks(String processId);

    List<String> getRunningTasks(String processId);

    void persistUserTask(UserTask userTask);

    void persistStartEvent(StartEvent startEvent);

    void addRunningTask(String taskId, String processInstanceId);

    void removeRunningTask(String taskId, String processInstanceId);

    void addCompletedTask(String taskId, String processInstanceId);

    public String getPotentialGroup(String taskId);


    void closeSession();
}

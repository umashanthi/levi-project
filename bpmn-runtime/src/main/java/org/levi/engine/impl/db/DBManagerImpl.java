package org.levi.engine.impl.db;

import org.levi.engine.Deployment;
import org.levi.engine.EngineData;
import org.levi.engine.db.DBManager;
import org.levi.engine.identity.Group;
import org.levi.engine.identity.User;
import org.levi.engine.persistence.hibernate.HibernateDao;
import org.levi.engine.persistence.hibernate.process.hobj.DeploymentBean;
import org.levi.engine.persistence.hibernate.process.hobj.EngineDataBean;
import org.levi.engine.persistence.hibernate.process.hobj.ProcessInstanceBean;
import org.levi.engine.persistence.hibernate.process.hobj.TaskBean;
import org.levi.engine.persistence.hibernate.user.hobj.GroupBean;
import org.levi.engine.persistence.hibernate.user.hobj.UserBean;
import org.levi.engine.utils.Bean2Impl;
import org.levi.engine.utils.Impl2Bean;

import java.util.ArrayList;
import java.util.List;

public class DBManagerImpl implements DBManager {

    HibernateDao dao;

    public DBManagerImpl() {
        dao = new HibernateDao();
    }

    /**
     * This method saves a UserBean to the database; if the UserBean already exists, it updates the attributes
     *
     * @param user The user
     */


    public void saveUser(UserBean user) {
        dao.save(user);
    }

    public void saveUser(User user) {
        UserBean userBean = null;
        if (dao.getObject(UserBean.class, user.getUserId()) != null) {
            userBean = (UserBean) dao.getObject(UserBean.class, user.getUserId());
            dao.update(Impl2Bean.getUserBean(user, userBean,true));
        } else {
            userBean = new UserBean();
            dao.save(Impl2Bean.getUserBean(user, userBean,false));
        }
        for (Group group : user.getUserGroups()) {
            addUserToGroup(user.getUserId(), group.getGroupId());
        }

    }

    public void saveGroup(GroupBean group) {
        dao.save(group);
    }

    public void saveGroup(Group group) {
        GroupBean groupBean = null;
        if (dao.getObject(GroupBean.class, group.getGroupId()) != null) { // group Exists
            groupBean = (GroupBean) dao.getObject(GroupBean.class, group.getGroupId());
            dao.update(Impl2Bean.getGroupBean(group, groupBean,true));
        } else {
            groupBean = new GroupBean();
            dao.save(Impl2Bean.getGroupBean(group, groupBean,false));
        }
    }

    public UserBean getUser(String userId) {
        return (UserBean) dao.getObject(UserBean.class, userId);
    }

    public GroupBean getGroup(String groupId) {
        return (GroupBean) dao.getObject(GroupBean.class, groupId);
    }

    public void addUserToGroup(String userId, String groupId) {
        UserBean user = (UserBean) dao.getObject(UserBean.class, userId);
        GroupBean group = (GroupBean) dao.getObject(GroupBean.class, groupId);
        group.getMembers().add(user);
        dao.update(group);
    }

    public void deleteUser(String userId) {
        dao.remove(UserBean.class, userId);
    }

    public void deleteGroup(String groupId) {
        dao.remove(GroupBean.class, groupId);
    }

    public void removeUserFromGroup(String userId, String groupId) {
        GroupBean group = (GroupBean) dao.getObject(GroupBean.class, groupId);
        UserBean user = (UserBean) dao.getObject(UserBean.class, userId);
        group.getMembers().remove(user);
    }

    /**
     * Given the userId, return the list of groups the user has membership of
     *
     * @param userId
     * @return
     */
    public List<String> getGroupIds(String userId) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public void saveTask(TaskBean task) {
        dao.save(task);
    }

    public void deleteTask(String taskId) {
        dao.remove(TaskBean.class, taskId);
    }

    public void updateTask(TaskBean task) {
        dao.update(task);
    }

    public void saveProcess(DeploymentBean deployedProcess) {
        dao.save(deployedProcess);
    }

    public void deleteProcess(String processId) {
        dao.remove(DeploymentBean.class, processId);
    }

    public void updateProcess(ProcessInstanceBean process) {
        dao.update(process);
    }

    public void saveProcessInstance(ProcessInstanceBean process) {
        dao.save(process);
    }

    public void updateProcess(DeploymentBean process) {
        dao.update(process);
    }

    public void deleteProcessInstance(String processId) {
        dao.remove(ProcessInstanceBean.class, processId);
    }

    public void updateProcessInstance(ProcessInstanceBean process) {
        dao.update(process);
    }

    public List<TaskBean> getUserTaskList(String userId) {
        UserBean user = (UserBean) dao.getObject(UserBean.class, userId);
        return user.getAssigned();
    }

    public List<ProcessInstanceBean> getRunningProcessesInstancesList() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public List<DeploymentBean> getDeployedProcessList() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public UserBean getAssigneeForTask(String taskId) {
        TaskBean task = (TaskBean) dao.getObject(UserBean.class, taskId);
        return task.getAssignee();
    }

    public List<TaskBean> getActiveTasks() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public List<TaskBean> getUnassignedTasks() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public List<TaskBean> getUnassignedTasks(String groupId) {
        return null;  // This method should return the list of tasks for this group which are unassigned
    }

    public List<TaskBean> getActiveTasks(String processId) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public String getProcessInstanceId(String taskId) {
        TaskBean task = (TaskBean) dao.getObject(UserBean.class, taskId);
        return task.getProcesseInstance().getProcessId();
    }

    public TaskBean getTaskBean(String taskId) {
        TaskBean task = (TaskBean) dao.getObject(UserBean.class, taskId);
        return task;
    }

    // Update the database to set assignee=username for the Task identified by taskId & processInstanceId
    public boolean claimUserTask(String taskId, String processInstanceId, String username) {
        return false;
    }

    public List<UserBean> getUserList() {
        return dao.getUserObjects();
    }

    public List<GroupBean> getGroupList() {
        return dao.getGroupObjects();
    }

    public void assignTask(String taskId, String userId) {
        TaskBean task = (TaskBean) dao.getObject(TaskBean.class, taskId);
        task.setActive(true);
        dao.update(task);
        UserBean user = (UserBean) dao.getObject(UserBean.class, userId);
        user.getAssigned().add(task);
        dao.update(user);
    }

    public void unassignTask(String taskId, String userId) {
        TaskBean task = (TaskBean) dao.getObject(TaskBean.class, taskId);
        task.setActive(false);
        dao.update(task);
    }

    /*
            This method can be use to remove the TASK from the task list of the USER
     */
    public void removeTask(String taskId, String userId) {
        TaskBean task = (TaskBean) dao.getObject(TaskBean.class, taskId);
        UserBean user = (UserBean) dao.getObject(UserBean.class, userId);
        user.getAssigned().remove(task);
        dao.update(user);
    }

    public EngineData getEngineData() {
        EngineData engineData;
        try {
            EngineDataBean bean = getEngineDataBean();
            Bean2Impl b2i = new Bean2Impl();
            engineData = b2i.engineData(bean);
            //TODO need to clarified the exception
        } catch (Exception e) {
            engineData = new EngineData();
        }

        return engineData;
    }

    public EngineDataBean getEngineDataBean() {
        return (EngineDataBean) dao.getObject(EngineDataBean.class, "1");
    }

    public void persistDeployment(Deployment deployment) {
        //Converting to DeploymentBean
        DeploymentBean deploymentBean = new DeploymentBean();
        deploymentBean.setDefinitionsId(deployment.getDefinitionsId());
        deploymentBean.setExtractPath(deployment.getExtractPath());
        deploymentBean.setProcessDefinitionPath(deployment.getProcessDefinitionPath());
        deploymentBean.setDiagramPath(deployment.getDiagramPath());
        deploymentBean.setDeploymentTime(deployment.getDate());

        dao.save(deploymentBean);
        EngineDataBean engineDataBean = getEngineDataBean();
        if (engineDataBean != null) {
            engineDataBean.addDeployment(deploymentBean);
            dao.update(engineDataBean);
        } else {
            engineDataBean = new EngineDataBean();
            engineDataBean.setId("1");
            //engineDataBean.set_dateCreated(new Date());
            engineDataBean.addDeployment(deploymentBean);
            dao.save(engineDataBean);
        }
    }

    public void closeSession() {
        dao.close();
    }

    public void undeployProcess(String processId) {
        EngineDataBean bean = getEngineDataBean();
        bean.getDeployedProcesses().remove(processId);
        dao.save(bean);
        dao.remove(DeploymentBean.class, processId);
    }
}

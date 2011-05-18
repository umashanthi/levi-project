package org.levi.engine.impl.db;

import org.levi.engine.db.DBManager;
import org.levi.engine.persistence.hibernate.process.hobj.ProcessInstanceBean;
import org.levi.engine.persistence.hibernate.process.hobj.TaskBean;
import org.levi.engine.identity.Group;
import org.levi.engine.identity.User;

import java.util.List;

public class H2DBManagerImpl implements DBManager {


    /**
     * This method saves a UserBean to the database; if the UserBean already exists, it updates the attributes
     *
     * @param user The user
     */


    public void saveUser(User user) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void saveGroup(Group group) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public User getUser(String userId) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public Group getGroup(String groupId) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public void addUserToGroup(String userId, String groupId) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void deleteUser(String userId) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void deleteGroup(String groupId) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void removeUserFromGroup(String userId, String groupId) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void saveTask(TaskBean task) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void deleteTask(String taskId) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void updateTask(TaskBean task) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void saveProcess(ProcessBean process) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void deleteProcess(String processId) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void updateProcess(ProcessBean process) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void saveProcessInstance(ProcessInstanceBean process) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void deleteProcessInstance(String processId) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void updateProcessInstance(ProcessInstanceBean process) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public List<TaskBean> getUserTaskList(String userId) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public List<TaskBean> getGroupTaskList(String groupId) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public List<ProcessInstanceBean> getRunningProcessesInstancesList() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public List<ProcessBean> getDeployedProcessList() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public User getAssigneeForTask(String taskId) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public List<TaskBean> getActiveTasks() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public List<TaskBean> getUnassignedTasks() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public List<TaskBean> getActiveTasks(String processId) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}

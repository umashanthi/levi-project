package org.levi.engine.persistence.hibernate.process.ql;

import org.hibernate.Session;
import org.levi.engine.persistence.hibernate.SessionFactoryUtil;
import org.levi.engine.persistence.hibernate.process.hobj.ProcessInstanceBean;
import org.levi.engine.persistence.hibernate.process.hobj.TaskBean;
import org.levi.engine.persistence.hibernate.user.hobj.GroupBean;
import org.levi.engine.persistence.hibernate.user.hobj.UserBean;
import org.levi.engine.utils.LeviUtils;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class HqlManager {

    Session session;

    public HqlManager() {
        session = SessionFactoryUtil.getSession();
    }

    /**
     *
     * @return
     */
    public List<UserBean> getUserObjects() {
        refresh();
        List<UserBean> users = session.createQuery("from UserBean").list();
        return users;
    }

    /**
     *
     * @return
     */
    public List<GroupBean> getGroupObjects() {
        refresh();
        List<GroupBean> groups = session.createQuery("from GroupBean").list();
        return groups;
    }

    /**
     *
     * @return
     */
    public List<String> getGroupIds() {
        refresh();
        List<String> groupIds = session.createQuery("select groupId from GroupBean").list();
        return groupIds;
    }

    /**
     *
     * @param groupId
     * @return
     */
    public List<TaskBean> getUnassignedTasks(String groupId) {
        refresh();
        List<TaskBean> tasks = session.createQuery("from TaskBean as task where " +
                "task.assigned = false and task.active = true").list();
        List<TaskBean> unassigedTask = LeviUtils.newArrayList();
        for (TaskBean task : tasks) {
            if (task.getPotentialGroup().getGroupId().equals(groupId)) {
                unassigedTask.add(task);
            }
        }
        return unassigedTask;
    }

    /**
     *
     * @param groupId
     * @param definitionId
     * @return
     */
    public List<TaskBean> getUnassignedTasks(String groupId, String definitionId){
        refresh();
        return session.createQuery("select instance.runningTasks from ProcessInstanceBean as instance join instance.runningTasks as tasks join instance.deployedProcess as deployment where tasks.assigned=false and tasks.potentialGroup.groupId='"+groupId+"' and deployment.definitionsId='"+definitionId+"'").list();
    }

    /**
     *
     * @param userName
     * @param definitionId
     * @return
     */
    public List<TaskBean> getUserTaskList(String userName, String definitionId){
        refresh();
        return session.createQuery("select instance.runningTasks from ProcessInstanceBean as instance join instance.runningTasks as tasks join instance.deployedProcess as deployment where tasks.assignee.userId='"+userName+"' and deployment.definitionsId='"+definitionId+"'").list();
    }

    /**
     *
     * @param definitionId
     * @return
     */
    public Map<String, ProcessInstanceBean>  getRunningProcessInstances(String definitionId){
        refresh();
        Iterator<ProcessInstanceBean> running = session.createQuery("from ProcessInstanceBean as instance where instance.deployedProcess.definitionsId='"+definitionId+"' and instance.running=true").list().iterator();
        Map<String, ProcessInstanceBean> map = new HashMap<String, ProcessInstanceBean>();
        while(running.hasNext()){
            ProcessInstanceBean instance = running.next();
            map.put(instance.getProcessId(), instance);
        }
        return map;
    }

    /**
     *
     * @param definitionId
     * @return
     */
    public Map<String, TaskBean> getActiveTasks(String definitionId){
        refresh();
        Iterator<TaskBean> tasks = session.createQuery("select instance.runningTasks from ProcessInstanceBean as instance join instance.runningTasks as tasks join instance.deployedProcess as deployment where tasks.active=true and deployment.definitionsId='"+definitionId+"'").list().iterator();
        Map<String, TaskBean> map = new HashMap<String, TaskBean>();
        while(tasks.hasNext()){
            TaskBean task = tasks.next();
            map.put(task.getTaskId(), task);
        }
        return map;
    }

    /**
     *
     * @param definitionId
     * @return
     */
    public List<ProcessInstanceBean> getCompletedProcessInstances(String definitionId){
        refresh();
        return session.createQuery("from ProcessInstanceBean as instance where instance.deployedProcess.definitionsId='"+definitionId+"' and instance.running=false").list();
    }

    private void refresh() {
        session.close();
        session = SessionFactoryUtil.getSession();
    }

    public void close() {
        session.close();
    }
}

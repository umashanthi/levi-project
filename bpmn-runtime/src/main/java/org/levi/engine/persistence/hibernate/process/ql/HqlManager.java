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

    public List<UserBean> getUserObjects() {
        refresh();
        List<UserBean> users = session.createQuery("from UserBean").list();
        return users;
    }

    public List<GroupBean> getGroupObjects() {
        refresh();
        List<GroupBean> groups = session.createQuery("from GroupBean").list();
        return groups;
    }

    public List<String> getGroupIds() {
        refresh();
        List<String> groupIds = session.createQuery("select groupId from GroupBean").list();
        return groupIds;
    }

    public List<TaskBean> getUnassignedTasks(String groupId) {
        refresh();
        return session.createQuery("from TaskBean as task join task.potentialGroup as group where " +
                "task.assigned=false and task.active=true and group.groupId='"+groupId+"'").list();
    }

    public List<TaskBean> getUnassignedTasks(String groupId, String definitionId){
        refresh();
        return session.createQuery("select instance.runningTasks from ProcessInstanceBean as instance join instance.runningTasks as tasks join instance.deployedProcess as deployment where tasks.assigned=false and tasks.potentialGroup.groupId='"+groupId+"' and deployment.definitionsId='"+definitionId.trim()+"'").list();
    }

    public List<TaskBean> getUserTaskList(String userName, String definitionId){
        refresh();
        return session.createQuery("select instance.runningTasks from ProcessInstanceBean as instance join instance.runningTasks as tasks join instance.deployedProcess as deployment where tasks.assignee.userId='"+userName+"' and deployment.definitionsId='"+definitionId+"'").list();
    }

    public Map<String, ProcessInstanceBean>  getRunningProcessInstances(String definitionId){
        refresh();
        Iterator<ProcessInstanceBean> running = session.createQuery("from ProcessInstanceBean as instance where instance.deployedProcess.definitionsId='"+definitionId.trim()+"' and instance.running=true").list().iterator();
        Map<String, ProcessInstanceBean> map = new HashMap<String, ProcessInstanceBean>();
        while(running.hasNext()){
            ProcessInstanceBean instance = running.next();
            map.put(instance.getProcessId(), instance);
        }
        return map;
    }

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

    public List<ProcessInstanceBean> getCompletedProcessInstances(String definitionId){
        refresh();
        return session.createQuery("from ProcessInstanceBean as instance where instance.deployedProcess.definitionsId='"+definitionId.trim()+"' and instance.running=false").list();
    }

    private void refresh() {
        session.close();
        session = SessionFactoryUtil.getSession();
    }

    public void close() {
        session.close();
    }
}

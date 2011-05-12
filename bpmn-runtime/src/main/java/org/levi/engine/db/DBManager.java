package org.levi.engine.db;

import org.levi.engine.identity.Group;
import org.levi.engine.identity.User;
import org.levi.engine.persistence.hibernate.process.ProcessBean;
import org.levi.engine.persistence.hibernate.process.ProcessInstanceBean;
import org.levi.engine.persistence.hibernate.process.TaskBean;

import java.util.List;

/**
 * This is the interface to classes which handles the back end database management of Levi Engine
 */

public interface DBManager {

    /**
     * This method saves a UserDaoImpl to the database; if the UserDaoImpl already exists, it updates the attributes
     *
     * @param user The user
     */
    void saveUser(User user);

    void saveGroup(Group group);

    User getUser(String userId);

    Group getGroup(String groupId);

    void addUserToGroup(String userId, String groupId);

    void deleteUser(String userId);        //?? Only ids or the UserDaoImpl object?

    void deleteGroup(String groupId);

    void removeUserFromGroup(String userId,
                             String groupId); //?? UserDaoImpl& Group objects or simple the ids?

    void saveTask(TaskBean task);

    void deleteTask(String taskId);

    void updateTask(TaskBean task);

    void saveProcess(ProcessBean process);

    void deleteProcess(String processId);

    void updateProcess(ProcessBean process);

    void saveProcessInstance(ProcessInstanceBean process);

    void deleteProcessInstance(String processId);

    void updateProcessInstance(ProcessInstanceBean process);

    List<TaskBean> getUserTaskList(String userId);

    List<TaskBean> getGroupTaskList(String groupId);

    List<ProcessInstanceBean> getRunningProcessesInstancesList();

    List<ProcessBean> getDeployedProcessList();

    User getAssigneeForTask(String taskId);

    List<TaskBean> getActiveTasks();

    List<TaskBean> getUnassignedTasks();

    List<TaskBean> getActiveTasks(String processId);


}

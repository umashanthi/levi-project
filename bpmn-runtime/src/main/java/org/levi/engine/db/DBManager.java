package org.levi.engine.db;

import org.levi.engine.identity.Group;
import org.levi.engine.identity.User;
import org.levi.engine.impl.identity.Permission;

/**
 * This is the interface to classes which handles the back end database management of Levi Engine
 */

public interface DBManager {

    /**
     * This method saves a User to the database; if the User already exists, it updates the attributes
     *
     * @param user The user
     */
    void saveUser(User user);

    void saveGroup(Group group);

    User getUser(String userId);

    Group getGroup(String groupId);

    void addUserToGroup(String userId, String groupId);

    void deleteUser(String userId);        //?? Only ids or the User object?

    void deleteGroup(String groupId);

    void removeUserFromGroup(String userId,
                             String groupId); //?? User& Group objects or simple the ids?

    /* methods to be added
        saveTask()
        deleteTask()
        saveProcess()
        deleteProcess()
        updateProcess()
        updateTask()
        getUserTaskList(String userId)
        getGroupTaskList(String groupId)
        getRunningProcessesList()
        getAssigneeForTask(String taskId)
        getActiveTasks()
        getActiveTasks(String processId)


     */


}

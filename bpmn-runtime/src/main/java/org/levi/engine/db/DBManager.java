package org.levi.engine.db;

import org.levi.engine.identity.Group;
import org.levi.engine.identity.User;
import org.levi.engine.impl.identity.Permission;

/**
 * This is the interface to classes which handles the back end database management of Levi Engine
 */

public interface DBManager {

    void createConnection();
    void closeConnection();       
    void addUser(User user);
    void addGroup(Group group);
    void addPermission(Permission permission);
    User getUser(String userId);
    Group getGroup(String groupId);
    Permission getPermission(String permissionId);
    void addUserToGroup(String userId, String groupId);
    void addPermissionToRole(String roleId, String permissionId);
    void deleteUser(String userId);        //?? Only ids or the User object?
    void deleteGroup(String groupId);
    void deletePermission(String permissionId);
    void removeUserFromGroup(String userId, String groupId); //?? User& Group objects or simple the ids?
    void removePermissionForRole(String roleId,String permissionId);



}

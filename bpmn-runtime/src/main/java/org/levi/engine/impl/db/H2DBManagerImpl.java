package org.levi.engine.impl.db;

import org.levi.engine.db.DBManager;
import org.levi.engine.identity.Group;
import org.levi.engine.identity.User;
import org.levi.engine.impl.identity.Permission;

public class H2DBManagerImpl implements DBManager {

    public void createConnection() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void closeConnection() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void addUser(User user) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void addGroup(Group group) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void addPermission(Permission permission) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public User getUser(String userId) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public Group getGroup(String groupId) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public Permission getPermission(String permissionId) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public void addUserToGroup(String userId, String groupId) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void addPermissionToRole(String roleId, String permissionId) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void deleteUser(String userId) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void deleteGroup(String groupId) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void deletePermission(String permissionId) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void removeUserFromGroup(String userId, String groupId) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void removePermissionForRole(String roleId, String permissionId) {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}

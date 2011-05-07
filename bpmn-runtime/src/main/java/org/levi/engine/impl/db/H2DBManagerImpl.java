package org.levi.engine.impl.db;

import org.levi.engine.db.DBManager;
import org.levi.engine.identity.Group;
import org.levi.engine.identity.User;
import org.levi.engine.impl.identity.Permission;

public class H2DBManagerImpl implements DBManager {


    /**
     * This method saves a User to the database; if the User already exists, it updates the attributes
     *
     * @param user The user
     */
    public void saveUser(User user) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void saveGroup(Group group) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void savePermission(Permission permission) {
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

}

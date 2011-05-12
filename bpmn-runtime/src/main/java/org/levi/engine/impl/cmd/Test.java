package org.levi.engine.impl.cmd;

import org.levi.engine.cmd.CommandExecutor;
import org.levi.engine.identity.Group;
import org.levi.engine.identity.IdentityService;
import org.levi.engine.identity.User;
import org.levi.engine.impl.identity.Permission;
import org.levi.engine.impl.identity.UserImpl;

public class Test {
    public static void main(String[] args) {
        User u = new UserImpl();
        u.setLastName("afddsf");
        IS is = new IS();
        is.saveUser(u);
    }


}

class IS implements IdentityService {
    /**
     * Checks whether the given username exists and the given username&password pair matches
     *
     * @param username Username of for login
     * @param password Password provided at login
     * @return true if the username exists and username&password matches; else false
     */
    public boolean checkCredentials(String username, String password) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public void saveUser(User user) {
        new CommandExecutor().execute(new SaveUserCmd(user));
    }

    /**
     * Removes a user from the persistence system
     *
     * @param userId the id of the user to remove from the system
     */
    public void deleteUser(String userId) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    /**
     * Persists a Group; if the group entry already exists, updates the attributes
     *
     * @param group the group object to persist
     */
    public void saveGroup(Group group) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    /**
     * Removes a group from the persistence system
     *
     * @param groupId the id of the group to be removed
     */
    public void deleteGroup(String groupId) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    /**
     * Persists a Permission; if the permission entry already exists, updates its attributes
     *
     * @param permission the permission object to persist
     */
    public void savePermission(Permission permission) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    /**
     * Removes a permission from the persistence system
     *
     * @param permissionId the id of the permission to be removed
     */
    public void deletePermission(String permissionId) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    /**
     * Adds a membership of a UserDaoImpl in a Group
     *
     * @param userId  id of the UserDaoImpl whose membership is created
     * @param groupId id of the Group to which the membership is created
     */
    public void addUserToGroup(String userId, String groupId) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    /**
     * Removes a UserDaoImpl form a Group
     *
     * @param userId  id of the UserDaoImpl whose membership to be removed
     * @param groupId the id of the group which's membership to be removed
     */
    public void removeUserFromGroup(String userId, String groupId) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

}
package org.levi.engine.identity;

import org.levi.engine.impl.identity.Permission;
import org.levi.engine.persistence.hibernate.user.hobj.UserBean;

/**
 * This is the interface which defines the methods related to Identity and UserBean Management
 */

public interface IdentityService {

    /**
     * Checks whether the given username exists and the given username&password pair matches
     *
     * @param username Username of for login
     * @param password Password provided at login
     * @return true if the username exists and username&password matches; else false
     */
    boolean checkCredentials(String username, String password);

    /**
     * Persists a UserBean; if the user already exists, updates the attributes
     *
     * @param user the UserBean object to persist
     */

    void saveUser(UserBean user);

    /**
     * Removes a user from the persistence system
     *
     * @param userId the id of the user to remove from the system
     */

    void deleteUser(String userId);

    /**
     * Persists a Group; if the group entry already exists, updates the attributes
     *
     * @param group the group object to persist
     */

    void saveGroup(Group group);

    /**
     * Removes a group from the persistence system
     *
     * @param groupId the id of the group to be removed
     */

    void deleteGroup(String groupId);

    /**
     * Persists a Permission; if the permission entry already exists, updates its attributes
     *
     * @param permission the permission object to persist
     */

    void savePermission(Permission permission);

    /**
     * Removes a permission from the persistence system
     *
     * @param permissionId the id of the permission to be removed
     */

    void deletePermission(String permissionId);

    /**
     * Adds a membership of a UserBean in a Group
     *
     * @param userId  id of the UserBean whose membership is created
     * @param groupId id of the Group to which the membership is created
     */

    void addUserToGroup(String userId, String groupId);

    /**
     * Removes a UserBean form a Group
     *
     * @param userId  id of the UserBean whose membership to be removed
     * @param groupId the id of the group which's membership to be removed
     */

    void removeUserFromGroup(String userId, String groupId);


}

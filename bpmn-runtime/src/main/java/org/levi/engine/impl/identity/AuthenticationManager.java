package org.levi.engine.impl.identity;

import org.levi.engine.identity.Group;
import org.levi.engine.identity.User;

public class AuthenticationManager {

    public static String MEMBERSHIP_NONE = "none";
    public static String MEMBERSHIP_MANAGER = "manager";
    public static String MEMBERSHIP_MEMBER = "member"; // refactor with suitable name for non-manager but a member

    public boolean login(String username, String password) {
        //validate username & password & check for credentials
        return false;
    }

    public String getMembership(User user, Group group) {

        return getMembership(user, group.getGroupName());
    }

    public String getMembership(User user, String groupName) {
        // TODO: find the membership type for this user in this group
        String membershipType = MEMBERSHIP_NONE;
        return membershipType;
    }


}

package org.levi.engine.impl.identity;

import org.levi.engine.identity.User;

public class AuthenticationManager {
    public boolean isUserHasRole(User user, Role role) {
        return false;
    }

    public boolean isRoleHasPermission(Role role, Permission permission) {
        return false;
    }

    public boolean login(String username, String password) {
        //validate username & password & check for credentials
        return false;
    }
}

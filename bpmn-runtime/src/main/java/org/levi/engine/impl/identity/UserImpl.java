package org.levi.engine.impl.identity;

import org.levi.engine.identity.Group;
import org.levi.engine.identity.User;

import java.io.Serializable;

public class UserImpl implements User, Serializable {

    private String userId;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private Group[] groups;

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Group[] getUserGroups() {
        return this.groups;
    }

    public void setUserGroups(Group[] groups) {
        this.groups = groups;
    }

    public String getUserEmail() {
        return this.email;
    }

    public void setUserEmail(String email) {
        this.email = email;
    }
}

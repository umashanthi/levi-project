package org.levi.engine.impl.identity;

import org.levi.engine.identity.Group;
import org.levi.engine.identity.User;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

@Entity
public class UserImpl implements User, Serializable {

    private String userId;
    private String password;
    private String firstName;
    private String lastName;
    private String userEmail;
    private List<Group> userGroups;

    @Id
    @GeneratedValue(strategy= GenerationType.TABLE, generator="id")
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

    @Transient
    public List<Group> getUserGroups() {
        return this.userGroups;
    }

    public void setUserGroups(List<Group> groups) {
        this.userGroups =groups;
    }


    public String getUserEmail() {
        return this.userEmail;
    }

    public void setUserEmail(String email) {
        this.userEmail = email;
    }
}

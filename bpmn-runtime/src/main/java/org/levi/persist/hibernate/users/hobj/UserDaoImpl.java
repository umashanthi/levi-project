package org.levi.persist.hibernate.users.hobj;

import org.levi.engine.identity.Group;
import org.levi.engine.identity.User;
import org.levi.engine.impl.identity.GroupImpl;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * UserDaoImpl: eranda
 * Date: May 11, 2011
 * Time: 7:52:29 AM
 * To change this template use File | Settings | File Templates.
 */

@Entity
public class UserDaoImpl extends HObject implements User, Serializable{
    private String userId;
    private String password;
    private String firstName;
    private String lastName;
    private String userEmail;
    private List<GroupDaoImpl> userGroups = new ArrayList<GroupDaoImpl>();
    

    @Id
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

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "USERGROUP", joinColumns = {@JoinColumn(name = "userId")}, inverseJoinColumns = {@JoinColumn(name = "groupId")})
    public List<GroupDaoImpl> getUserGroups() {
        return this.userGroups;
    }

    public void setUserGroups(List<GroupDaoImpl> groups) {
        this.userGroups =groups;
    }
}

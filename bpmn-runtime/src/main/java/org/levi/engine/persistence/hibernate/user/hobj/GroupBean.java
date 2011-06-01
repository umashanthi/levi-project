package org.levi.engine.persistence.hibernate.user.hobj;

import org.levi.engine.identity.Group;
import org.levi.engine.persistence.hibernate.HObject;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: eranda
 * Date: May 11, 2011
 * Time: 8:07:02 AM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "groups")
public class GroupBean extends HObject{
    private String groupId;
    private String groupName;
    private String groupDescription;
    private List<UserBean> members = new ArrayList<UserBean>();

    @Id
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupDescription() {
        return this.groupDescription;
    }

    public void setGroupDescription(String description) {
        this.groupDescription = description;
    }

    @ManyToMany
    @JoinTable(name = "usergroup", joinColumns = {@JoinColumn(name = "groupId")}, inverseJoinColumns = {@JoinColumn(name = "userId")})
    public List<UserBean> getMembers() {
        return members;
    }

    public void setMembers(List<UserBean> members) {
        this.members = members;
    }
}

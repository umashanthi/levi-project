package org.levi.engine.persistence.hibernate.user.hobj;

import org.levi.engine.persistence.hibernate.HObject;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

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

    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(name = "user_group", joinColumns = {@JoinColumn(name = "groupId")}, inverseJoinColumns = {@JoinColumn(name = "userId")}, uniqueConstraints = @UniqueConstraint(columnNames = {"userId","groupId"}))
    public List<UserBean> getMembers() {
        return members;
    }

    public void setMembers(List<UserBean> members) {
        this.members = members;
    }
}

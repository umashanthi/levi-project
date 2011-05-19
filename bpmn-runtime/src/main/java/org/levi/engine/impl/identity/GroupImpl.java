package org.levi.engine.impl.identity;

import org.levi.engine.identity.Group;
import org.levi.engine.identity.User;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class GroupImpl implements Group, Serializable {
    private String groupId;
    private String groupName;
    private String groupDescription;
    private List<User> members;

    @Id
    @GeneratedValue(strategy= GenerationType.TABLE, generator="id")
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

    @Transient
    public List<User> getMembers() {
        return members;
    }

    public void setMembers(List<User> members) {
        this.members = members;
    }
}

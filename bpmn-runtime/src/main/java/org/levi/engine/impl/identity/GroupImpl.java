package org.levi.engine.impl.identity;

import org.levi.engine.identity.Group;

import java.io.Serializable;

public class GroupImpl implements Group, Serializable {
    private String groupId;
    private String groupName;
    private String description;
    private Role[] roles;

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
        return this.description;
    }

    public void setGroupDescription(String description) {
        this.description = description;
    }

    public Role[] getGroupRoles() {
        return this.roles;
    }

    public void setGroupRoles(Role[] roles) {
        this.roles = roles;
    }
}

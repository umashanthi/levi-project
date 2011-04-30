package org.levi.engine.identity;

import org.levi.engine.impl.identity.Role;

public interface Group {
    String getGroupId();

    void setGroupId(String groupId);

    String getGroupName();

    void setGroupName(String groupName);

    String getGroupDescription();

    void setGroupDescription(String description);

}

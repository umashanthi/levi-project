package org.levi.engine.identity;

import org.levi.engine.impl.identity.GroupImpl;

import java.util.HashMap;
import java.util.List;

public interface User {

    String getUserId();

    void setUserId(String userId);

    String getPassword();

    void setPassword(String password);

    String getFirstName();

    void setFirstName(String firstName);

    String getLastName();

    void setLastName(String lastName);

    String getUserEmail();

    void setUserEmail(String email);

    List<Group> getUserGroups();

    void setUserGroups(List<Group> groups);


}

package org.levi.engine.identity;

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

    List<Group> getUserGroups();

    void setUserGroups(List<Group> groups);

    String getUserEmail();

    void setUserEmail(String email);


}

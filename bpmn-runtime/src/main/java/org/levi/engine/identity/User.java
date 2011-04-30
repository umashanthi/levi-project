package org.levi.engine.identity;

import java.util.HashMap;

public interface User {

    String getUserId();

    void setUserId(String userId);

    String getPassword();

    void setPassword(String password);

    String getFirstName();

    void setFirstName(String firstName);

    String getLastName();

    void setLastName(String lastName);

    HashMap<Group,String> getUserGroups();

    void setUserGroups(HashMap<Group,String> groups);

    String getUserEmail();

    void setUserEmail(String email);


}

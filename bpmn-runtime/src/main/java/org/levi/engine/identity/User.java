package org.levi.engine.identity;

public interface User {

    String getUserId();

    void setUserId(String userId);

    String getPassword();

    void setPassword(String password);

    String getFirstName();

    void setFirstName(String firstName);

    String getLastName();

    void setLastName(String lastName);

    Group[] getUserGroups();

    void setUserGroups(Group[] groups);

    String getUserEmail();

    void setUserEmail(String email);


}

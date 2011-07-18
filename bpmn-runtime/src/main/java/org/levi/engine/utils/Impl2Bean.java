package org.levi.engine.utils;

import org.levi.engine.identity.Group;
import org.levi.engine.identity.User;
import org.levi.engine.persistence.hibernate.user.hobj.GroupBean;
import org.levi.engine.persistence.hibernate.user.hobj.UserBean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: umashanthi
 * Date: 6/24/11
 * Time: 12:36 PM
 * To change this template use File | Settings | File Templates.
 */
public class Impl2Bean {


    public static GroupBean getGroupBean(Group group, GroupBean groupBean, boolean update) {
        if (!update)
            groupBean.setGroupId(group.getGroupId());
        groupBean.setGroupName(group.getGroupName());
        groupBean.setGroupDescription(group.getGroupDescription());
        return groupBean;
    }

    public static UserBean getUserBean(User user, UserBean userBean, boolean update) {
        if (!update)
            userBean.setUserId(user.getUserId());
        userBean.setPassword(user.getPassword());
        return userBean;
    }
}

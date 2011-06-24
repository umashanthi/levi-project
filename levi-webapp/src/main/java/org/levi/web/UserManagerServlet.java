package org.levi.web;


import org.levi.engine.persistence.hibernate.HObject;
import org.levi.engine.persistence.hibernate.HibernateDao;
import org.levi.engine.persistence.hibernate.user.hobj.GroupBean;
import org.levi.engine.persistence.hibernate.user.hobj.UserBean;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: umashanthi
 * Date: 6/9/11
 * Time: 1:18 PM
 * To change this template use File | Settings | File Templates.
 */
public class UserManagerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HibernateDao dao = new HibernateDao();
        // Retrieve the action
        String action = request.getParameter("action");
        if (action == null) {         // list users and groups -- default action
            List<HObject> beanList = dao.getObjects(UserBean.class);
            List<UserBean> userBeanList = new ArrayList<UserBean>();
            for (HObject bean : beanList) {
                userBeanList.add((UserBean) bean);
            }
            beanList = dao.getObjects(GroupBean.class);
            List<GroupBean> groupBeanList = new ArrayList<GroupBean>();
            for (HObject bean : beanList) {
                groupBeanList.add((GroupBean) bean);
            }
            request.setAttribute("usersList", userBeanList);
            request.setAttribute("groupList", groupBeanList);
            //response.sendRedirect("usermanagement.jsp");
            request.getRequestDispatcher("usermanagement.jsp").forward(request, response);
        } else if (action.equals("addgroup")) {  // add group
            String groupName = request.getParameter("groupname");
            String description = request.getParameter("description");
            GroupBean groupBean = new GroupBean();
            groupBean.setGroupId(groupName); // TODO: Change to ID???
            groupBean.setGroupName(groupName);
            groupBean.setGroupDescription(description);
            dao.save(groupBean);
            response.sendRedirect("usrmng");

        } else if (action.equals("adduser")) {    // add user
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            // retrieve selected groups for this user
            // get the group name lists, get the request parameter for checkbox & radio, , get groups, and add groups to the user bean
            UserBean userBean = new UserBean();
            userBean.setUserId(username);
            userBean.setPassword(password);
            dao.save(userBean);

        } else if (action.equals("editUser")) {
            String username = request.getParameter("username");
            // retrieve user details from user bean
            UserBean userBean = (UserBean) dao.getObject(UserBean.class, username);
            assert userBean != null;
            request.setAttribute("user", userBean);
            request.getRequestDispatcher("edituser.jsp").forward(request, response); // TODO: Check whether this works
        }
    }
}

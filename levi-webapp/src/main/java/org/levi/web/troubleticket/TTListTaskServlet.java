package org.levi.web.troubleticket;

import org.levi.engine.db.DBManager;
import org.levi.engine.persistence.hibernate.process.hobj.TaskBean;
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
 * Date: 9/1/11
 * Time: 4:34 PM
 * To change this template use File | Settings | File Templates.
 */
public class TTListTaskServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        assert request.getSession().getAttribute("username") != null;
        String username = request.getSession().getAttribute("username").toString();
        assert request.getSession().getAttribute("usergroup") != null;
        String usergroup = request.getSession().getAttribute("usergroup").toString();
        assert request.getSession().getAttribute("dbManager") != null;
        DBManager dbManager = (DBManager) request.getSession().getAttribute("dbManager");
        assert request.getParameter("assigned") != null;
        boolean isAssignedList = request.getParameter("assigned").equals("true") ? true : false;
        String appId = request.getSession().getAttribute("appId").toString();
        if (isAssignedList) {
            // retrieve assigned tasks for this user
            List<TaskBean> userTaskList = dbManager.getUserTaskList(username, request.getSession().getAttribute("appId").toString());
            request.getSession().setAttribute("userTaskList", userTaskList);
                response.sendRedirect("myissues.jsp");
        } else {
            // retrieve unassigned tasks for this user's group
            List<TaskBean> unassignedTaskList = dbManager.getUnassignedTasks(usergroup, request.getSession().getAttribute("appId").toString());
            request.getSession().setAttribute("unassignedTaskList", unassignedTaskList);
                response.sendRedirect("unassignedissues.jsp");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}

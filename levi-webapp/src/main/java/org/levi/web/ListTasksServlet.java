package org.levi.web;

import org.levi.engine.ProcessEngine;
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
 * This Servlet retrieve user task list and unassigned task list and sets a session attribute
 * So that it can be accessed in user's dashboard
 */
public class ListTasksServlet extends HttpServlet {


    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);

    }

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {
        try {
            assert request.getSession().getAttribute("processEngine") != null;
            ProcessEngine engine = (ProcessEngine) request.getSession().getAttribute("processEngine");
            List<String> processesList = engine.getDeploymentIds();
            request.getSession().setAttribute("processList", processesList);
            assert request.getSession().getAttribute("username") != null;
            String username = request.getSession().getAttribute("username").toString();
            assert request.getSession().getAttribute("dbManager") != null;
            DBManager dbManager = (DBManager) request.getSession().getAttribute("dbManager");
            UserBean user = dbManager.getUser(username);
            List<GroupBean> userGroups = user.getUserGroups();
            assert userGroups != null;
            //TODO: later change this impl to get tasks for each group separately
            List<TaskBean> unassignedTaskList = new ArrayList<TaskBean>();
            if (userGroups.size() > 0) {
                for (GroupBean group : userGroups) {
                    List<TaskBean> taskList = dbManager.getUnassignedTasks(group.getGroupId());
                    for (TaskBean task : taskList) {
                        unassignedTaskList.add(task);
                    }
                }
            }
            //set as session attribute
            request.getSession().setAttribute("unassignedTasks", unassignedTaskList);
            List<TaskBean> userTaskList = dbManager.getUserTaskList(username);
            request.getSession().setAttribute("userTaskList", userTaskList);
            response.sendRedirect("tasks.jsp");
        }

        catch (Exception ex) {
            response.sendRedirect("login.jsp?error=not-logged");
        }

    }


}
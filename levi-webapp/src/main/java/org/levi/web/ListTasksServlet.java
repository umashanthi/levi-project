package org.levi.web;

import org.hibernate.Hibernate;
import org.levi.engine.ProcessEngine;
import org.levi.engine.db.DBManager;
import org.levi.engine.persistence.hibernate.HibernateDao;
import org.levi.engine.persistence.hibernate.process.hobj.TaskBean;
import org.levi.engine.persistence.hibernate.user.hobj.UserBean;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
            if (request.getParameter("unassigned") != null && request.getParameter("unassigned").equals("true")) {
                // get unassigned tasks for this user's groups
                List<String> groupIds = dbManager.getGroupIds(username);
                assert groupIds != null;
                //TODO: later change this impl to get tasks for each group separately
                List<TaskBean> unassignedTaskList = new ArrayList<TaskBean>();
                if (groupIds.size() > 0) {
                    for (String groupId : groupIds) {
                        List<TaskBean> taskList = dbManager.getUnassignedTasks(groupId);
                        for (TaskBean task : taskList) {
                            unassignedTaskList.add(task);
                        }
                    }
                }
                //set as session attribute
                request.getSession().setAttribute("unassignedTasks", unassignedTaskList);
                response.sendRedirect("tasks.jsp?unassigned=true");
            } else {
                // retrieve tasks assigned to this user
               /* HibernateDao dao = new HibernateDao();
                UserBean userBean = (UserBean) dao.getObject(UserBean.class, username);
                assert userBean != null;
              //  List<TaskBean> userTaskList = userBean.getAssigned();*/
                List<TaskBean> userTaskList = dbManager.getUserTaskList(username);
              //  dao.close();
                request.getSession().setAttribute("userTaskList", userTaskList);
                response.sendRedirect("tasks.jsp");
            }
        } catch (Exception ex) {
            response.getWriter().write("exception");
        }

    }


}
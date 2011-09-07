package org.levi.web.troubleticket;

import org.levi.engine.ProcessEngine;
import org.levi.engine.db.DBManager;
import org.levi.engine.persistence.hibernate.process.hobj.ProcessInstanceBean;
import org.levi.engine.persistence.hibernate.process.hobj.TaskBean;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: umashanthi
 * Date: 9/4/11
 * Time: 12:28 AM
 * To change this template use File | Settings | File Templates.
 */
public class TTListProcessServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String type = request.getParameter("type");
        ProcessEngine engine = (ProcessEngine) request.getSession().getAttribute("processEngine");
        assert request.getSession().getAttribute("username") != null;
        String username = request.getSession().getAttribute("username").toString();
        assert request.getSession().getAttribute("usergroup") != null;
        String usergroup = request.getSession().getAttribute("usergroup").toString();
        assert request.getSession().getAttribute("dbManager") != null;
        DBManager dbManager = (DBManager) request.getSession().getAttribute("dbManager");
        String appId = request.getSession().getAttribute("appId").toString();
        if (type.equals("active")) {
            //list active processes
            Map<String, TaskBean> runningProcessesList = dbManager.getActiveProcessInstances(request.getSession().getAttribute("appId").toString());
            request.getSession().setAttribute("runningProcessesList", runningProcessesList);
            response.sendRedirect("openissues.jsp");

        } else if (type.equals("completed")) {
            // list completed processes
            List<ProcessInstanceBean> completedProcessesList = dbManager.getCompletedProcessInstances(request.getSession().getAttribute("appId").toString());
            request.getSession().setAttribute("completedProcessesList", completedProcessesList);
            response.sendRedirect("closedissues.jsp");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}

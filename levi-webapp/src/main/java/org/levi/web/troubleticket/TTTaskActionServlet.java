package org.levi.web.troubleticket;

import org.levi.engine.db.DBManager;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: umashanthi
 * Date: 9/1/11
 * Time: 5:36 PM
 * To change this template use File | Settings | File Templates.
 */
public class TTTaskActionServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        assert action != null;
        if (action.equals("claimTask")) {
            assert request.getParameter("username") != null;
            String username = request.getParameter("username");
            assert request.getSession().getAttribute("usergroup") != null;
            String usergroup = request.getSession().getAttribute("usergroup").toString();
            assert request.getParameter("taskId") != null;
            String taskId = request.getParameter("taskId");
            assert request.getParameter("processInstanceId") != null;
            String processInstanceId = request.getParameter("processInstanceId");
            assert request.getSession().getAttribute("dbManager") != null;
            DBManager dbManager = (DBManager) request.getSession().getAttribute("dbManager");
            dbManager.claimUserTask(taskId, processInstanceId, username);
            response.sendRedirect("tasks?assigned=true");

        } else {
            //other task actions should be handled here
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
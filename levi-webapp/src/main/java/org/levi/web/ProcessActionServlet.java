package org.levi.web;

import org.levi.engine.ProcessEngine;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ProcessActionServlet extends HttpServlet {


    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);

    }

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {
        String processId = request.getParameter("id");
        String action = request.getParameter("action");
        ProcessEngine engine = (ProcessEngine) request.getSession().getAttribute("processEngine");
        try {
            if (action.equals("Start")) {
                String processInstanceId = engine.startProcess(processId, null);
                List<String> processInstanceList = engine.getRunningProcessIds();
                request.getSession().setAttribute("processInstanceList", processInstanceList);
                response.sendRedirect("processes.jsp?isProcessStarted=true&processId=" + processId + "&processInstacneId=" + processInstanceId);
            } else if (action.equals("Stop")) {
                engine.stopProcess(processId);
                response.sendRedirect("processes.jsp?isProcessStopped=true&processId=" + processId);
            }
        } catch (ClassNotFoundException e) {
            response.sendRedirect("processes.jsp?isProcessStarted=false&isProcessStopped=false&processId=" + processId);
        }

    }


}
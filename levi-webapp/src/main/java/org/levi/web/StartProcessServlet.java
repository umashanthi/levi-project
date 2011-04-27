package org.levi.web;

import org.levi.engine.ProcessEngine;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class StartProcessServlet extends HttpServlet {


    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);

    }

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {
        String processId = request.getParameter("id");
        ProcessEngine engine=(ProcessEngine)request.getSession().getAttribute("processEngine");
        try {
            engine.runProcess(processId);
            response.sendRedirect("processes.jsp?isProcessStarted=true&processId="+processId);
        } catch (ClassNotFoundException e) {
            response.sendRedirect("processes.jsp?isProcessStarted=false&processId="+processId);
        }

    }


}
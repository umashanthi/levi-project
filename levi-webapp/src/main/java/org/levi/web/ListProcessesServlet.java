package org.levi.web;

import org.levi.engine.Deployment;
import org.levi.engine.ProcessEngine;
import org.levi.engine.persistence.hibernate.process.hobj.DeploymentBean;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * This Servlet retrieves the currently deployed process lists
 * and uses to list in the UI
 */
public class ListProcessesServlet extends HttpServlet {


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
            if (processesList != null) {
                request.getSession().setAttribute("processList", processesList);
            }
            List<DeploymentBean> deployments = engine.getDeploymentBeans();
            if (deployments != null) {
                request.getSession().setAttribute("deployments", deployments);
            }
            response.sendRedirect("processes.jsp");
        } catch (Exception ex) {
            response.sendRedirect("login.jsp?error=not-logged");
        }

    }


}
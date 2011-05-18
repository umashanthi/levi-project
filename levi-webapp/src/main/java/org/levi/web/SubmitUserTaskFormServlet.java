package org.levi.web;

import org.levi.engine.runtime.ProcessInstance;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: umashanthi
 * Date: 5/11/11
 * Time: 4:05 PM
 * To change this template use File | Settings | File Templates.
 */

public class SubmitUserTaskFormServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

           //retrieve the input data from form
     String param=request.getParameter("numberOfDays");
        Map<String, String[]> params=request.getParameterMap();
        // we can also have a naming convention for the required request parameters and filter them from this map
        //Save this map to the process instance
        response.sendRedirect("success.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       doPost(request,response);

    }
}

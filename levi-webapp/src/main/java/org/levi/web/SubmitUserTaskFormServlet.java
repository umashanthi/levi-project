package org.levi.web;

import org.levi.engine.ProcessEngine;
import org.levi.engine.runtime.ProcessInstance;
import org.levi.engine.utils.LeviUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: umashanthi
 * Date: 5/11/11
 * Time: 4:05 PM
 * To change this template use File | Settings | File Templates.
 */

/**
 * This Servlet get called when a user submits a user task from
 * All the input fields are retrieved via request parameter and
 * the process is called resumed after the user task
 */
public class SubmitUserTaskFormServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ProcessEngine engine = (ProcessEngine) request.getSession().getAttribute("processEngine");
        String taskId = request.getParameter("taskId");
        assert taskId != null;
        String processId = request.getParameter("processId");
        assert processId != null;
        //retrieve the input data from form
        Map<String, Object> processVariables = LeviUtils.newHashMap();
        Map<String, String[]> requestParamMap = request.getParameterMap();
        for (String key : requestParamMap.keySet()) {
            processVariables.put(key, requestParamMap.get(key)[0]);
        }
        engine.setVariables(processId, processVariables);
        //Save this map to the process instance
        engine.resumeProcessInstance(processId);
        response.sendRedirect("success.jsp");       // redirects to the success page which closes the from pop-up
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);

    }
}

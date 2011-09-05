package org.levi.web.troubleticket;

import org.levi.engine.ProcessEngine;
import org.levi.engine.utils.LeviUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: umashanthi
 * Date: 9/1/11
 * Time: 11:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class TTSubmitUserTaskServlet extends HttpServlet {
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
            if (requestParamMap.get(key).length == 1) {
                processVariables.put(key, requestParamMap.get(key)[0]);
            } else {
                String value = "";
                for (String val : requestParamMap.get(key)) {
                    value = value + "," + val;
                }
                processVariables.put(key, value);
            }
        }
        engine.setVariables(processId, processVariables);
        engine.resumeProcessInstance(processId);
        String requestOrigin = request.getHeader("referer");

        response.sendRedirect("tasks?assigned=true");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}

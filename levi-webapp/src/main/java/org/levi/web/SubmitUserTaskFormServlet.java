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

public class SubmitUserTaskFormServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // String isStartEvent = request.getParameter("isStartEvent");
        ProcessEngine engine = (ProcessEngine) request.getSession().getAttribute("processEngine");
//        /*if (isStartEvent != null && isStartEvent.equals("true")) {
//            // this is a start Event which had a user task form; so start the process instance & persist the parameters
//
//            String processId = request.getParameter("processId");
//            assert processId != null;
//            // TODO: currently the first String of the array is being added to the map  - need to modify
//            //TODO: filter the request params and add only necessary values to the map
//            Map<String, Object> processVariables = new HashMap<String, Object>();
//            Map<String, String[]> requestParamMap = request.getParameterMap();
//            for (String key : requestParamMap.keySet()) {
//                processVariables.put(key, requestParamMap.get(key)[0]);
//            }
//            try {
//                String processInstanceId = engine.startProcess(processId, processVariables, (String) request.getSession().getAttribute("username"));
//                engine.setVariables(processInstanceId, processVariables);
//                // TODO write the processInstance variables to db
//                engine.resumeProcessInstance(processInstanceId);
//            } catch (ClassNotFoundException e) {
//                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
//            }
//
//        } else {*/
        // TODO:not a start event;
        // get the process instance Id and persist the variables to it
        // this can be done by getting the taskId of the task & then the processInstanceId of that task?
        String taskId = request.getParameter("taskId");
        assert taskId != null;


//        }
        String processId = request.getParameter("processId");
        assert processId != null;
        //retrieve the input data from form
        Map<String, Object> processVariables = LeviUtils.newHashMap();
        Map<String, String[]> requestParamMap = request.getParameterMap();
        for (String key : requestParamMap.keySet()) {
            processVariables.put(key, requestParamMap.get(key)[0]);
        }
        engine.setVariables(processId, processVariables);
        // we can also have a naming convention for the required request parameters and filter them from this map
        //Save this map to the process instance
        engine.resumeProcessInstance(processId);
        String requestOrigin=request.getHeader("referer");

        response.sendRedirect("success.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);

    }
}

package org.levi.web.troubleticket;

import org.levi.engine.ProcessEngine;
import org.levi.engine.utils.LeviUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: umashanthi
 * Date: 9/1/11
 * Time: 9:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class TTProcessActionServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String processId = request.getParameter("id");
        String action = request.getParameter("action");
        ProcessEngine engine = (ProcessEngine) request.getSession().getAttribute("processEngine");
        String appId = request.getSession().getAttribute("appId").toString();
        try {
            if (action.equalsIgnoreCase("Start")) {
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
                String processInstanceId = engine.startProcess(processId, processVariables, (String) request.getSession().getAttribute("username"));
                engine.setVariables(processInstanceId, processVariables);
                if (Constants.APPID_TT.equals(appId)) {
                    response.sendRedirect("newissue.jsp?create=success");
                } else if (Constants.APPID_LOAN.equals(appId)) {
                    response.sendRedirect("applyloan.jsp?create=success");
                }

            } else if (action.equals("Stop")) {
                engine.stopProcess(processId);
                response.sendRedirect("processes.jsp?isProcessStopped=true&processId=" + processId);
            }
        } catch (ClassNotFoundException e) {
            response.sendRedirect("processes.jsp?isProcessStarted=false&isProcessStopped=false&processId=" + processId);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}

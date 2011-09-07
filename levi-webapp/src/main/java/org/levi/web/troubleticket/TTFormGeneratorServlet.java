package org.levi.web.troubleticket;

/**
 * Created by IntelliJ IDEA.
 * User: umashanthi
 * Date: 5/13/11
 * Time: 3:54 PM
 * To change this template use File | Settings | File Templates.
 */

import org.apache.velocity.Template;
import org.apache.velocity.context.Context;
import org.apache.velocity.tools.view.VelocityViewServlet;
import org.levi.engine.ProcessEngine;
import org.levi.engine.db.DBManager;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

public class TTFormGeneratorServlet extends VelocityViewServlet {
    public Template handleRequest(HttpServletRequest request,
                                  HttpServletResponse response, Context context) {

        assert request.getSession().getAttribute("dbManager") != null;
        DBManager dbManager = (DBManager) request.getSession().getAttribute("dbManager");
        /* Retrieve TaskBean object for the given taskId */
        assert request.getParameter("taskId") != null;
        String taskId = request.getParameter("taskId");
        String processInsId = request.getParameter("processInstanceId");
        assert request.getParameter("formPath") != null;
        String taskFormPath = request.getParameter("formPath");
        /* retrieve process variables */
        ProcessEngine engine = (ProcessEngine) request.getSession().getAttribute("processEngine");
        Map<String, Object> processVariables = engine.getVariables(processInsId);
        /* get the template */
        Template template = null;
        context.put("username", request.getSession().getAttribute("username"));
        context.put("processId", processInsId);
        /* Put process variables to the context */
        if (processVariables != null) {
            for (String key : processVariables.keySet()) {
                if (processVariables.get(key) != null) {
                    context.put(key, processVariables.get(key).toString());
                }
            }
        }
        try {

            template = getTemplate(taskFormPath);

        } catch (Exception e) {
            System.out.println("Error " + e);
        }

        return template;
    }

}




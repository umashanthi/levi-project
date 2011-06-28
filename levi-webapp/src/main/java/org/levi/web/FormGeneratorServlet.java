package org.levi.web;

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
import org.levi.engine.db.DBManager;
import org.levi.engine.persistence.hibernate.HibernateDao;
import org.levi.engine.persistence.hibernate.process.hobj.TaskBean;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FormGeneratorServlet extends VelocityViewServlet {
    public Template handleRequest(HttpServletRequest request,
                                  HttpServletResponse response, Context context) {
        /* Retrieve request parameters */
        assert request.getParameter("taskId") != null;
        String taskId = request.getParameter("taskId");
        HibernateDao dao = new HibernateDao();
        TaskBean taskBean = (TaskBean) dao.getObject(TaskBean.class, taskId);
        assert taskBean != null;
        String processInsId = taskBean.getProcesseInstance().getProcessId();
        assert request.getParameter("formPath") != null;
        String taskFormPath = request.getParameter("formPath");
        /* Retrieve DBManager from session */
        assert request.getSession().getAttribute("dbManager") != null;
        DBManager dbManager = (DBManager) request.getSession().getAttribute("dbManager");
        /* Retrieve TaskBean object for the given taskId */
        //  TaskBean taskBean = dbManager.getTaskBean(taskId);
        /* get the template */
        Template template = null;
        context.put("username", request.getSession().getAttribute("username"));
        context.put("title", "Vacation Request");
        context.put("processId", processInsId);
        context.put("report", "XXXXX");
        try {

            template = getTemplate(taskFormPath);   // <-- taskFormPath should be the input parameter

        } catch (Exception e) {
            System.out.println("Error " + e);
        }

        return template;
    }

}




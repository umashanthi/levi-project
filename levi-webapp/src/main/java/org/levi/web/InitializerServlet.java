package org.levi.web;

import org.levi.engine.ProcessEngine;
import org.levi.engine.impl.ProcessEngineImpl;
import org.levi.engine.impl.StorageServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class InitializerServlet extends HttpServlet {


    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);

    }

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {
        try {
            assert   request.getSession().getAttribute("processEngine")!=null;
            ProcessEngine engine = (ProcessEngine)request.getSession().getAttribute("processEngine");

            /*String larPath="/home/umashanthi/Development/FYP/LEVI/levi-project/bpmn-runtime/src/main/java/org/levi/samples/data/lars/";
            engine.deploy(larPath + "book_fig61.lar"); // ProduceAdvertisement
            engine.deploy(larPath + "book_fig49.1.lar"); // Process:Figure-49*/
            // check whether the engine is started

            List processesList = engine.getStorageService().getDeployedProcessList();
            request.getSession().setAttribute("processList", processesList);
            response.sendRedirect("processes.jsp");
        }
        catch (Exception ex) {
             response.getWriter().write("exception");
        }

    }


}
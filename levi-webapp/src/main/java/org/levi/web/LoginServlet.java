package org.levi.web;

import org.levi.engine.ProcessEngine;
import org.levi.engine.impl.ProcessEngineImpl;

import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request,
                          javax.servlet.http.HttpServletResponse response)
            throws javax.servlet.ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (!allowUser(username, password)) {
            response.sendRedirect("login.jsp?isLoginSuccess=false");
        } else {
            // Valid login. Make a note in the session object.
            HttpSession session = request.getSession();
            session.setAttribute("username", username);
            session.setAttribute("logged", "true");
            // Try redirecting the client to the page he first tried to access
            try {
                String target = (String) session.getAttribute("login.target");
                if (target != null) {
                    response.sendRedirect(target);
                    return;
                }
            } catch (Exception ignored) {
            }
            // Start Engine

                ProcessEngine engine = ProcessEngineImpl.getProcessEngine();
                request.getSession().setAttribute("processEngine", engine);

            // Couldn't redirect to the target. Redirect to the site's home page.
            response.sendRedirect("index.jsp");
        }

    }

    protected boolean allowUser(String username, String password) {
        //TODO: Handle User Authentication here
        if (username.trim().equals("admin") && password.trim().equals("admin")) {
            return true;
        } else {
            return false;
        }
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request,
                         javax.servlet.http.HttpServletResponse response)
            throws javax.servlet.ServletException, IOException {

    }
}
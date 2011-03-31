package org.levi.web;

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
            out.println("<HTML><HEAD><TITLE>Access Denied</TITLE></HEAD>");
            out.println("<BODY>Your login and password are invalid.<BR>");
            out.println("You may want to <A HREF=\"/login.html\">try again</A>");
            out.println("</BODY></HTML>");
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
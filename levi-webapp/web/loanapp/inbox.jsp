<%@ page import="org.levi.web.troubleticket.Constants" %>
<%@ page import="org.levi.engine.ProcessEngine" %>
<%@ page import="org.levi.engine.persistence.hibernate.process.hobj.TaskBean" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Map" %>
<%@ page import="org.levi.engine.utils.LeviUtils" %>
<%@ page import="org.levi.engine.persistence.hibernate.process.hobj.ProcessInstanceBean" %>
<%@ page import="org.levi.engine.mail.MailClient" %>
<%@ page import="javax.mail.MessagingException" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>Message Inbox</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <link href="css/style.css" rel="stylesheet" type="text/css"/>
    <link rel="stylesheet" type="text/css" href="css/coin-slider.css"/>
    <link rel="stylesheet" type="text/css" href="css/table.css"/>
    <script type="text/javascript" src="js/cufon-yui.js"></script>
    <script type="text/javascript" src="js/cufon-aller.js"></script>
    <script type="text/javascript" src="js/jquery-1.4.2.min.js"></script>
    <script type="text/javascript" src="js/script.js"></script>
    <script type="text/javascript" src="js/coin-slider.min.js"></script>
</head>
<body>
<% if (session.getAttribute("logged") != null && session.getAttribute("logged").equals("true")) {%>
<div class="main">
    <div class="header">
        <div class="header_resize">
            <div class="logo">
                <h1><a href="index.html">CR&FC <span>Bank</span>
                    <small></small>
                </a></h1>
            </div>
            <div class="menu_nav">
                <ul>
                    <li><a href="tasks?assigned=true"><span>My Tasks</span></a></li>
                    <li><a href="tasks?assigned=false"><span>Unassigned Tasks</span></a></li>
                    <% if (session.getAttribute("usergroup") != null && (session.getAttribute("usergroup").equals(Constants.GROUP_LO) || session.getAttribute("usergroup").equals(Constants.GROUP_MN))) {
                    %>
                    <li><a href="listProcesses?type=active"><span>Active Applications</span></a></li>
                    <li><a href="listProcesses?type=completed"><span>Completed Applications</span></a></li>
                    <%} %>
                    <li><a href="applyloan.jsp"><span>Apply for Loan</span></a></li>
                    <% if (session.getAttribute("usergroup") != null && (session.getAttribute("usergroup").equals(Constants.GROUP_CR))) {
                    %>
                    <li  class="active"><a href="inbox.jsp"><span>Inbox</span></a></li>
                    <%} %>
                </ul>
            </div>
            <div class="clr"></div>
            <div class="slider">
                <div class="logged">Logged in as <%=session.getAttribute("username").toString()%> of <%=session.getAttribute("usergroup").toString()%> Group | <a href="logout">Logout</a></div>
                <div id="coin-slider"><a href="#"><img src="images/slide1.jpg" width="960" height="320" alt=""/> </a> <a
                        href="#"><img src="images/slide2.jpg" width="960" height="320" alt=""/> </a> <a href="#"><img
                        src="images/slide3.jpg" width="960" height="320" alt=""/> </a></div>
                <div class="clr"></div>
            </div>
            <div class="clr"></div>
        </div>
    </div>
    <div class="content">
        <div class="content_resize">
            <div class="mainbar">
                <div class="article">
                    <h2><span>Message Inbox</span></h2>

                    <div class="clr"></div>
                    <%
                        String loggedUser = session.getAttribute("username").toString();
                        MailClient mailClient = new MailClient(loggedUser, "localhost");
                        Map<String, String> messageList = LeviUtils.newHashMap();
                        try {
                            messageList = mailClient.getMessages(MailClient.SHOW_MESSAGES);
                        } catch (MessagingException e) {
                            //response.getWriter().print("No message available");
                        }
                        if (messageList.size() > 0) {
                    %>
                    <table class="hovertable">
                        <tr>
                             <th>ID</th>
                            <th>Content</th>
                        </tr>
                        <%
                            for (int id=0;id<messageList.size();id++) {

                        %>
                        <tr onmouseover="this.style.backgroundColor='#e8e8e8';"
                            onmouseout="this.style.backgroundColor='#ffffff';">
                            <td><%=(id+1)%>
                            </td>
                            <td><%=(messageList.get((id+1)+"") != null) ? (messageList.get((id+1)+"")) : "n/a"%>
                            </td>
                        </tr>
                        <% } %>
                    </table>
                    <%} else {%>
                    <ul class="sb_menu">
                        <li><strong>No messages available</strong></li>
                    </ul>
                    <% }%>
                </div>
            </div>
            <div class="clr"></div>
        </div>


        <div class="footer">
            <div class="footer_resize">
                <p class="lf">&copy; Powered By <a href="http://projectlevi.weebly.com/">Levi</a>.</p>

                <p class="rf">|<a href="#">Privacy Policy</a> | <a href="#">Community Guidelines</a> | <a href="#">Terms
                    of
                    Service</a> | <a href="#">Documentation</a></p>

                <div style="clear:both;"></div>
            </div>
        </div>
    </div>
    </div>
<%
    } else {
        response.sendRedirect("login.jsp?error=not-logged");
    }
%>
</body>
</html>

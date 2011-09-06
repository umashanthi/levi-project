<%@ page import="org.levi.web.troubleticket.Constants" %>
<%@ page import="org.levi.engine.persistence.hibernate.process.hobj.TaskBean" %>
<%@ page import="java.util.Map" %>
<%@ page import="org.levi.engine.ProcessEngine" %>
<%@ page import="org.levi.engine.utils.LeviUtils" %>
<%@ page import="org.levi.engine.mail.MailClient" %>
<%@ page import="javax.mail.internet.MimeMessage" %>
<%@ page import="javax.mail.MessagingException" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>Inbox</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <link href="css/style.css" rel="stylesheet" type="text/css"/>
    <link rel="stylesheet" type="text/css" href="css/coin-slider.css"/>
    <link rel="stylesheet" type="text/css" href="css/table.css"/>
    <script type="text/javascript" src="js/cufon-yui.js"></script>
    <script type="text/javascript" src="js/cufon-times-700.js"></script>
    <script type="text/javascript" src="js/jquery-1.4.2.min.js"></script>
    <script type="text/javascript" src="js/script.js"></script>
    <script type="text/javascript" src="js/coin-slider.min.js"></script>
</head>
<body>
<% if (session.getAttribute("logged") != null && session.getAttribute("logged").equals("true")) {%>
<div class="main">
    <div class="header">
        <div class="header_resize">
            <div class="searchform">
            You are logged in as <%=session.getAttribute("username").toString()%> of <%=session.getAttribute("usergroup").toString()%>
             <a href="logout">Logout</a>
            </div>
            <div class="logo">
                <img src="images/<%=session.getAttribute("usergroup").toString()%>.jpg"/>
            </div>
            <div class="clr"></div>
            <div class="menu_nav">
                <ul>
                    <li><a href="tasks?assigned=true"><span>My Issues</span></a></li>
                    <li><a href="tasks?assigned=false"><span>Unassigned Issues</span></a></li>
                    <% if (session.getAttribute("usergroup") != null && session.getAttribute("usergroup").equals(Constants.GROUP_AM)) {
                    %>
                    <li><a href="listProcesses?type=active"><span>Open Issues</span></a></li>
                    <li><a href="listProcesses?type=completed"><span>Closed Issues</span></a></li>
                    <li><a href="newissue.jsp"><span>Create New Issue</span></a></li>
                    <li class="active"><a href="inbox.jsp"><span>Inbox</span></a></li>
                    <%} %>
                </ul>
            </div>
            <div class="clr"></div>
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
                            for (int id=messageList.size();id>0;id--) {

                        %>
                        <tr onmouseover="this.style.backgroundColor='#e8e8e8';"
                            onmouseout="this.style.backgroundColor='#ffffff';">
                            <td><%=(id)%>
                            </td>
                            <td><%=(messageList.get((id)+"") != null) ? (messageList.get((id)+"")) : "n/a"%>
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
        </div>

        <div class="clr"></div>
    </div>
</div>

<div class="footer">
    <div class="footer_resize">
        <p class="lf">&copy; Powered By <a href="http://projectlevi.weebly.com/">Levi</a>.</p>

        <p class="rf">|<a href="#">Privacy Policy</a> | <a href="#">Community Guidelines</a> | <a href="#">Terms of
            Service</a> | <a href="#">Documentation</a></p>

        <div style="clear:both;"></div>
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

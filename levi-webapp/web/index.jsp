<%--
  Created by IntelliJ IDEA.
  User: umashanthi
  Date: Mar 29, 2011
  Time: 9:55:15 AM
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<!--
Design by Free CSS Templates
http://www.freecsstemplates.org
Released for free under a Creative Commons Attribution 2.5 License

Name : Premium Series
Description: A three-column, fixed-width blog design.
Version : 1.0
Released : 20090303

-->
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="content-type" content="text/html; charset=utf-8"/>
    <title>Levi - The Native BPMN2.0 Execution Engine</title>
    <meta name="keywords" content=""/>
    <meta name="Premium Series" content=""/>
    <link href="default.css" rel="stylesheet" type="text/css" media="screen"/>
</head>
<body>
<!-- start header -->
<div id="header">
    <div id="logo">
        <h1><a href="#"><span>&nbsp;&nbsp;&nbsp;&nbsp;</span>&nbsp;&nbsp;&nbsp;&nbsp;</a></h1>

        <p>The Native BPMN 2.0 Execution Engine</p>
        <%
            if (session.getAttribute("logged") != null && session.getAttribute("logged").toString().equals("true")) {%>
        <div id="name">You are logged in as <span>
               <% out.print(session.getAttribute("username").toString()); %> </span>as a member of <span><%
            out.print(session.getAttribute("userGroupList").toString()); %></span></div>
        <%}%>
    </div>
    <div id="menu">
        <ul id="main">
            <li class="current_page_item"><a href="index.jsp">Home</a></li>
            <li><a href="tasks">Tasks</a></li>
            <li><a href="processes">Processes</a></li>
            <%if (session.getAttribute("logged") != null && session.getAttribute("logged").toString().equals("true") && session.getAttribute("username").equals("admin")) {%>
            <li><a href="usrmng">User Management</a></li>
            <%} %>
            <li></li>
            <li></li>
            <li>
                <% if (session.getAttribute("logged") != null && session.getAttribute("logged").toString().equals("true")) {%>
                <a href="logout">Logout</a></li>

            <%} else { %>
            <a href="login.jsp">Login</a></li>
            <% }%>
        </ul>
    </div>

</div>
<!-- end header -->
<div id="body">
    <% Object isLogged = session.getAttribute("logged");
        if (isLogged != null && isLogged.toString().equals("true")) { %>


    <script src="webtoolkit.aim.js" type="text/javascript"><!--mce:0--></script>
    <script type="text/javascript"><!--mce:1--></script>
    <br/><br/>

    <h1> Upload Business Archive File</h1>

    <div><br></div>
    <form action="upload" method="post" enctype="multipart/form-data">
        <table>
            <tr>
                <td><label>Process Name:</label>
                </td>
                <td><input name="processName" type="text" size="30"/></td>
            </tr>


            <tr>
                <td><label>Business Archive File(*.lar):</label>
                </td>
                <td><input name="processArchive" type="file" size="40"/></td>
            </tr>


            <tr>
                <td></td>
                <td>
                    <input type="submit" value="Upload"/></td>
            </tr>
        </table>
    </form>
    <%
        // If a process lar is uploaded shows the success/failure message
        if (request.getParameter("isUploadSuccess") != null) {
            String result = request.getParameter("isUploadSuccess");
            if (result.equals("true")) { %>
    <h3>Process archive uploaded successfully</h3>
    <% } else if (result.equals("false")) { %>
    <h3>Failed to upload process archive. Try again</h3>
    <%
            }
        }
        // else do nothing
    %>

    <% } else { %>
    <div id="bodylogo"></div>

    <%}%>
</div>
<div id="footer">
    <p class="copyright">&copy;&nbsp;&nbsp;2011 All Rights Reserved &nbsp;&bull;&nbsp; Design by <a
            href="http://www.freecsstemplates.org/">Free CSS Templates</a>.</p>

    <p class="link"><a href="#">Privacy Policy</a>&nbsp;&#8226;&nbsp;<a href="#">Terms of Use</a>
    </p>
</div>
</body>
</html>

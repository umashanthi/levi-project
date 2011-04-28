<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
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
<script type="text/javascript">
    function startProcess(id) {
        var processForm = document.createElement("form");
        processForm.method = "post";
        processForm.action = "startProcess?id=" + id + "&action=Start";
        processForm.submit();
    }
    function stopProcess(id) {
        var processForm = document.createElement("form");
        processForm.method = "post";
        processForm.action = "startProcess?id=" + id + "&action=Stop";
        processForm.submit();
    }
</script>
<!-- start header -->
<div id="header">
    <div id="logo">
        <h1><a href="#"><span>&nbsp;&nbsp;&nbsp;&nbsp;</span>&nbsp;&nbsp;&nbsp;&nbsp;</a></h1>

        <p>The native bpmn2.0 execution engine</p>
    </div>
    <div id="menu">
        <ul id="main">
            <li class="current_page_item"><a href="index.jsp">Home</a></li>
            <li><a href="#">Tasks</a></li>
            <li><a href="processes">Processes</a></li>
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

    <h1> Available Processes</h1>

    <div><br></div>
    <%
        List<String> processesList = (List<String>) session.getAttribute("processList");

    %>
    <table>
        <%for (String process : processesList) { %>
        <tr>
            <form action="<%--startProcess?id=<%=process.toString()--%>" method="post">
                <td>
                    <%=process.toString()%>
                </td>
                <td>
                    <%
                        boolean isStartBtnActive = true; // by default it is true;
                        boolean isStopBtnActive = false; // by default it is false;
                        //show whether the process is started
                        if (request.getParameter("isProcessStarted") != null
                                && request.getParameter("processId") != null
                                && request.getParameter("isProcessStarted").equals("true")
                                && request.getParameter("processId").equals(process.toString())) {
                            isStartBtnActive = false;
                            isStopBtnActive = true;
                        } else if (request.getParameter("isProcessStopped") != null
                                && request.getParameter("processId") != null
                                && request.getParameter("isProcessStopped").equals("true")
                                && request.getParameter("processId").equals(process.toString())) {
                            isStartBtnActive = true;
                            isStopBtnActive = false;
                        } else {
                            isStartBtnActive = true; // default
                            isStopBtnActive = false; // default
                        }
                        //else no start action carried out
                    %>
                    &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;<input type="button"
                                                                    value="Start" <%if(!isStartBtnActive){%>
                                                                    disabled="true" <%} %>
                                                                    onclick="startProcess('<%=process.toString()%>')">

                </td>
                <td>

                    &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;<input type="button"
                                                                    value="Stop" <%if(!isStopBtnActive){%>
                                                                    disabled="true" <%} %>
                                                                    onclick="stopProcess('<%=process.toString()%>')">

                </td>
                <%--
                <td>
                    <% //show whether the process is started
                        if (request.getParameter("isProcessStarted") != null && request.getParameter("processId") != null) {
                            String result = request.getParameter("isProcessStarted");
                            String processId = request.getParameter("processId");
                            if (result.equals("true") && processId.equals(process.toString())) { %>
                    <h3>&nbsp; &nbsp; &nbsp; &nbsp;Process started successfully</h3>
                    <% } else if (result.equals("false") && processId.equals(process.toString())) { // provide suitable error message %>
                    <h3>Failed to start process. Try again</h3>
                    <%
                            }
                        }
                        //else no start action carried out
                    %>
                </td>
                      ---%>
            </form>
        </tr>
        <% }
        %>
    </table>

    <% %>


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

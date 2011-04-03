<%@ page import="java.io.BufferedReader" %>
<%@ page import="java.io.DataInputStream" %>
<%@ page import="java.io.FileInputStream" %>
<%@ page import="java.io.InputStreamReader" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
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

        <p>The native bpmn2.0 execution engine</p>
    </div>
    <div id="menu">
        <ul id="main">
            <li class="current_page_item"><a href="index.jsp">Home</a></li>
            <li><a href="#">Tasks</a></li>
            <li><a href="processes.jsp">Processes</a></li>
            <li></li>
            <li></li>
            <li>
                <% if (session.getAttribute("logged") != null && session.getAttribute("logged").toString().equals("true")) {%>
                <a href="logout">Logout</a></li>

            <%} else { %>
            <a href="login.html">Login</a></li>
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
        List processesList = new ArrayList<String>();
        try {
            FileInputStream fstream = new FileInputStream("LeviEngine/processes.txt");
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String strLine;
            //Read File Line By Line
            while ((strLine = br.readLine()) != null) {
                processesList.add(strLine);
            }
            //Close the input stream
            in.close();
        } catch (Exception e) {//Catch exception if any
            out.println("Error: " + e.getMessage());
        } %>
    <table>
        <%for (Object process : processesList) { %>
        <tr>
            <form action="">
                <td>
                    <%=process.toString()%>
                </td>
                <td>
                   &nbsp;  &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;<input type="button" value="Start" >
                </td>
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

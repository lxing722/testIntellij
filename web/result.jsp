<%--
  Created by IntelliJ IDEA.
  User: star
  Date: 2018/5/21
  Time: 16:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.*" import="java.io.*" contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Beer Advice Jsp</title>
</head>
<body>
<h1 align="center">Beer Recommendations JSP</h1>
<%
    List styles = (List)request.getAttribute("styles");

    Iterator it = styles.iterator();
    while(it.hasNext())
        out.print("<br>try: " + it.next());
%>
</body>
</html>

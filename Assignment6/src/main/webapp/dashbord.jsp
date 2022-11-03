<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>Dashboard</h3>


<%
String username =(String)session.getAttribute("userName"); 
%>
<h2>welcome login successfully <%=username %></h2>

<h4>if yoy change the data </h4>
<a href="update">update</a>


</body>
</html>
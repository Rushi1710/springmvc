<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>update</title>
</head>
<body>
<%
	String msg=request.getParameter("msg");
	if(msg!=null)
	{
		%>
		<h3><%=msg %></h3>
		<%
	}
	%>

	<h1>Enter a new data </h1>
	<form action="update" method="post">
	
		Enter Email  <input name="email" type="email" placeholder="Email"> 
		<br>
		<br>
		
		Enter MobileNumber  <input name="mobile" type="text" placeholder="Mobile Number">
		<br>
		<br>
		
		<input type="submit">
	</form>

</body>

</html>

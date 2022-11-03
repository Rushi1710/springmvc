<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</style>
</head>
<body>
	<h1>Login</h1>
	<%
	String msg=request.getParameter("msg");
	if(msg!=null)
	{
		%>
		<h3><%=msg %></h3>
		<%
	}
	%>


	 <form action="login" method="post">
		Enter name<input name="userName" type="text" placeholder="UserName"> 
		<br>
		<br>
		Enter Password <input name="password" type="password" placeholder="password"> 
		<br>
		<br>
		<input type="submit">
	</form>

</body>
</html>
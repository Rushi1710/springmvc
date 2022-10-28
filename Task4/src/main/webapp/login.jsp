<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</style>
</head>
<body>
	<h1>Login</h1>



	 <form action="login" method="post">
		<input name="email" type="email" placeholder="E-mail"> 
		<br>
		<br>
		<input name="password" type="password" placeholder="password"> 
		<br>
		<br>
		<input type="submit">
	</form>

</body>
</html>
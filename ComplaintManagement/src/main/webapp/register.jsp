<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>


<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
	
	
	
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
	integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
	integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
	integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
	crossorigin="anonymous"></script>


</head>
<body>
	<div style="text-align: center;">
		<h1>Welcome Register</h1>
		
		 
 
 
		<form action="register" method="post">
			Enter Name <input name=customerName type="text" placeholder="customerName"> 
			<br> 
			<br> 
			Enter UseName<input name="userName" type="text" placeholder="user Name">
			<br> <br> Enter MobileNumber<input name="mobile"
				type="text" placeholder="Mobile number"> <br> <br>
			Enter EmailId<input name="email" type="email" placeholder="Email">
			<br> <br> Enter Password<input name="password" type="text"
				placeholder="password"> <br> <br> Enter Address<input
				name="address" type="text" placeholder="Address"> <br>
			<br> <input type="submit">
		</form>
	</div>
</body>
</html>
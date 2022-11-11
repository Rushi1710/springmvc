
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Complaint Page</title>

	
<style>
form{text-align: center;
  border: 3px solid green;
  background-color: LightGrey;
  }
 h2{text-align:center;}
</style>
</head>
<body>
	<h2>Complaint Form</h2>
	<form action="complaint" method="post">
		<br> <br>
		<h4>Complaint</h4>
		<textarea rows="8" cols="50" id="description"
			name="description"
			placeholder="Add your complaint here......" required></textarea>
		<br> <br>
		<button onclick="addcomplaint">File Complaint</button>

		<script src="https://code.jquery.com/jquery-3.6.0.min.js"
			integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4="
			crossorigin="anonymous">
			
		</script>

		<script
			src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js"
			integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa"
			crossorigin="anonymous">
			
		</script>

		<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>

		<script>
			let registerComplaint = false;
			$(document).ready(function() {
				$('#addcomplaint').click(function(event) {
					event.preventDefault();
					let un = {
						"description" : $("#description").val()
					}

					$.ajax({

						type : "POST",
						contentType : 'application/json; charset=utf-8',
						dataType : 'json',
						url : 'addcomplaint',
						data : JSON.stringify(un)
						
					});
				})
			})
		</script>
	</form>
</body>
</html>
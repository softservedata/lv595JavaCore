<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h2>Welcome to the Application</h2>
	<br>
	<form action="/dev/login" method="post">
		<br>
		user_name: <input type="text" name="name" placeholder="username">
		<br>
		password: <input type="password" name="password">
		<br>
		<input type="submit" value="login">
	</form>

</body>
</html>
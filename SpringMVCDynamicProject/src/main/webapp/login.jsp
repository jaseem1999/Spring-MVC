<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="login.do" method="post">
		Email <input type="text" name="email"><br><br>
		Password <input type="password" name="pass"><br><br>
		
		<a href="Registration.jsp">Sign up</a><br><br>
		<input type="submit" value="Login">
	</form>
	<h2>${error}</h2>
</body>
</html>
<%@page import="com.spring.mvc.crud.DTO.Registration.StudentDTO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%
StudentDTO user = (StudentDTO) session.getAttribute("user");
if(user == null){
	response.sendRedirect("login.jsp");
}
%>
<meta charset="ISO-8859-1">
<title>update</title>
</head>
<body>
	<form action="update.do" method="post">
	    Student ID : <input type="number" value="<%=user.getSid()%>" name="sid" disabled="disabled">
	    <input type="hidden" name="sid" value="<%=user.getSid()%>"><br><br>
	    Name : <input type="text" value="<%=user.getSname()%>" name="sname"><br><br>
	    Email : <input type="email" value="<%=user.getEmail()%>" name="email"><br><br>
	    Password : <input type="password" value="<%=user.getPass()%>" name="pass"><br><br>
	    Address : <input type="text" value="<%=user.getAddress()%>" name="address"><br><br>
	    Place : <input type="text" value="<%=user.getPlace()%>" name="place"><br><br>
	    Age : <input type="number" value="<%=user.getAge()%>" name="age"><br><br>
	    Course : <input type="text" value="<%=user.getCourse()%>" name="course"><br><br>
	    <input type="submit" value="Update"><br><br>
	</form>

	<h2>${update}</h2>
</body>
</html>
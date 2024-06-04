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
<title>Home</title>
</head>
<body>
 <h1>Welcome <%=user.getSname() %></h1>
 <a href="update.jsp">update profile</a><br><br>
 <a href="logout.jsp">logout</a><br><br>
 
</body>
</html>
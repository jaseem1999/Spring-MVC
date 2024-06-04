<%@page import="com.spring.mvc.crud.DTO.Registration.StudentDTO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
StudentDTO user = (StudentDTO) session.getAttribute("user");
user = null;
session.setAttribute("user", user);
response.sendRedirect("login.jsp");
%>

</body>
</html>
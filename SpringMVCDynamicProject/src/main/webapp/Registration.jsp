<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>
<h1>Student Registration</h1>
<form action="registor.do" method="post">
Student name : <input type="text" name="sname"> <br><br>
Student email : <input type="text" name="email"> <br><br>
password : <input type="password" name="pass"> <br><br>
Student Address : <input type="text" name="address"> <br><br>
Course : <select name="course">
	<option value="B-teck">bteck</option>
	<option value="MCA">mca</option>
	<option value="M-Tech">mteck</option>
	<option value="BCA">bca</option>
	<option value="BCS">BCS</option>
	<option value="MSC">Msc</option>
</select><br><br>
Place : <input type="text" name="place"> <br><br>
Student age : <input type="number" name="age"> <br><br>
<input type="submit" value="Registartion">
</form>
</body>
</html>
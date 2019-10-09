<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update User</title>
</head>
<body>
	<h1>Update User</h1>
	<hr />	
	<hr/>
	<form action="UserController" method="get">
	<input type="hidden" name="action" value="update"/>
	<input type="hidden" name="id" value="${user.id }"/>
	Name <input type="text" name="name" value="${user.name }"/><br/>
	DOB <input type="date" name="dob" value="${ user.dob}"/><br/>
	Address <input type="text" name="address" value="${user.address }"/><br/>
	<input type="submit" value="Update"/><br/>
	
	</form>

</body>
</html>







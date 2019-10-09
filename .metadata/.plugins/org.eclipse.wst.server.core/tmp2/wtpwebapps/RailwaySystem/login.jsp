<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
<h1>Enter Login Info</h1>
<form action="RegisterController" method="get">
<input type="hidden" name="action" value="login"/><br/>
User name <input type="text" name="userid"/><br/>
Password <input type="password" name="password"/><br/>
<input type="submit" value="SIGNIN"/><br/>
</form>

</body>
</html>
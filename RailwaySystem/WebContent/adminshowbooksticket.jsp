<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="header.css">
<title>HomePage</title>
<style>
.button {
  background-color: gray;
  border: none;
  color: white;
  padding: 11px 25px;
  text-align: center;
  display: inline-block;
  font-size: 16px;
  margin: 4px 3px;
  cursor: pointer;
}</style>
</head>
<body>
<div class="topnav">
  <a  href="adminhome.jsp">Home</a>
  <a href="adminadddetail.jsp">Add Trains Details</a>
  <a href="adminupdatedetail.jsp">Edit Train Details</a>
  <a href="admincomplaintshow.jsp">Complaints Box</a>
  <a href="adminshowbooksticket.jsp">Books Tickets</a>
  <a>${username }</a>
  <a href="RegisterController?action=logout">logout</a>
  
</div>
<form action="RegisterController" align="left"><button class="button" type="submit" name ="action" value ="showticket" > Show </button></form>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="header.css">
<link rel="stylesheet" type="text/css" href="adminadddetail.css">
<title>Insert title here</title>
<style>

.container {
  padding: 16px;
}

table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 80%;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}

tr:nth-child() {
  background-color: #dddddd;
}
</style>

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
<form action="RegisterController">
<input type="hidden" name="action" value="update">
<table>
<tr><th colspan="2" > Update</th></tr>
  <tr>

  <tr>
    <td>Train Number</td>
    <td><input type="text" name="trainno"></td>
  </tr>
  <tr>
    <td>Train Name</td>
    <td><input type="text" name="trainname"></td>
  </tr>
  <tr>
    <td>Boarding Place</td>
    <td><input type="text" name="splace"></td>
  </tr>
  <tr>
    <td>Destination Place</td>
    <td><input type="text" name="dplace"></td>
  </tr>
  <tr>
    <td>fare</td>
    <td><input type="text" name="fare"></td>
  </tr>
  <tr>
    <td>seat</td>
    <td><input type="text" name="seat"></td>
  </tr>
  <tr>
    <td>Date</td>
    <td><input type="date" name="datee"></td>
  </tr>
  
</table>
<center>
<button type="submit" class="registerbtn">Update</button>
</center>
</form>
</body>
</html>
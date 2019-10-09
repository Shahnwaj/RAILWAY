<%@page import="com.models.Complaint"%>
<%@page import= "java.util.ArrayList"%>
<%@page import="com.services.RegisterServicesImpl"%>
<%@page import="com.controller.RegisterController"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="header.css">
<title>Complaint </title>
<style>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {
  background-color: #dddddd;
}

</style>


</head>
<body>
<%
ArrayList<Complaint> ac =(ArrayList<Complaint>)request.getAttribute("ac");
%>

<div class="topnav">
   <a  href="adminhome.jsp">Home</a>
  <a href="adminadddetail.jsp">Add Trains Details</a>
  <a href="adminupdatedetail.jsp">Edit Train Details</a>
  <a href="admincomplaintshow.jsp">Complaints Box</a>
  <a href="adminshowbooksticket.jsp">Books Tickets</a>
  <a>${username }</a>
  <a href="RegisterController?action=logout">logout</a>
</div>


<table>
  <tr>
    <th>NAME</th>
    <th>EMAIL ID</th>
    <th>ADDRESS </th>
    <th>COMPLAINT MESSAGE</th>
   
    </tr>
   <%for(Complaint at:ac){ %>
     <tr>
    <td><%=at.getName() %></td>
    <td><%=at.getEmail() %></td>
    <td><%=at.getAddress() %></td>
    <td> <%=at.getComplaint() %></td>
  </tr>
<%} %> 
  </table>


</body>
</html>
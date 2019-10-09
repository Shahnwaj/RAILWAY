<%@page import="com.models.Addtrain"%>
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
ArrayList<Addtrain> ac =(ArrayList<Addtrain>)request.getAttribute("ac");
%>

<div class="topnav">
   <a  href="adminhome.jsp">Home</a>
  <a href="adminadddetail.jsp">Add Trains Details</a>
  <a href="adminupdatedetail.jsp">Edit Train Details</a>
  <a href="admincomplaintshow.jsp">Complaints Box</a>
  <a href="adminshowbooksticket.jsp">Books Tickets</a>
  <a>Welcome ${username }</a>
  <a href="RegisterController?action=logout">logout</a>
</div>


<table>
  <tr>
    <th>TRAIN NUMBER</th>
    <th>TRAIN NAME</th>
    <th>BOARDING</th>
    <th>DESTINATION</th>
    <th>FARE</th>
    <th>SEAT</th>
    <th>DATE</th>
   
    </tr>
   <%for(Addtrain at:ac){ %>
     <tr>
    <td><%=at.getTrainno() %></td>
    <td><%=at.getTrainname() %></td>
    <td><%=at.getSplace() %></td>
    <td> <%=at.getDplace() %></td>
    <td> <%=at.getFare() %></td>
    <td> <%=at.getSeat() %></td>
    <td> <%=at.getDatee() %></td>
  </tr>
<%} %> 
  </table>


</body>
</html>
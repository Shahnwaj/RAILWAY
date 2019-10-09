<%@page import="com.models.Booking"%>
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
<title>Insert title here</title>
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
ArrayList<Booking> ac =(ArrayList<Booking>)request.getAttribute("ac");
%>

<div class="topnav">
  <a  href="userhome.jsp">Home</a>
  <a href="booking.jsp">Ticket Booking</a>
  <a href="">Cancellation</a>
  <a href="complaint.jsp">Complaints Box</a>
  <a  href="RegisterController?action=history">View History</a>
  <a>${userid }</a>
  <a href="RegisterController?action=profile">Profile</a>
  <a href="RegisterController?action=logout">logout</a>
  
</div>


<table>
  <tr>
 	<th>TRAIN NUMBER</th>
    <th>SOURCE STATION</th>
    <th>DESTINATION STATION</th> 
    <th>NAME</th>
    <th>ADDRESS</th>
    <th>MOBILE NUMBER</th>
    <th>ADHAAR CARD</th>
    <th>TO DATE</th>
    <th>NO. OF SEAT</th>
   
    </tr>
   <%for(Booking at:ac){ %>
     <tr>
     <td><%= at.getTrainno() %></td>
     <td><%= at.getSplace() %></td>
     <td><%=at.getDplace() %></td>
    <td><%=at.getName() %></td>
    <td><%=at.getAddress() %></td>
    <td><%=at.getMobileno() %></td>
    <td><%=at.getAdhaar() %></td>
    <td><%=at.getTodate()%></td>
    <td><%=at.getNoofseat() %></td>
  </tr>
<%} %> 
  </table>

</body>
</html>
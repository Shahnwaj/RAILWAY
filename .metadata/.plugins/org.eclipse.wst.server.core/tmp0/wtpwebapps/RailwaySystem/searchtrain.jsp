<%@page import="com.models.Addtrain"%>
<%@page import="com.services.RegisterServicesImpl"%>
<%@page import= "java.util.ArrayList" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
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
<% HttpSession sn=request.getSession(false);
ArrayList<Addtrain> al=(ArrayList<Addtrain>)sn.getAttribute("train");
%>
<table>
  <tr>
    <th>Train Number</th>
    <th>Train Name</th>
    <th>Souce </th>
    <th>Destination </th>
    <th>Price </th>
    <th>Available Seat</th>
    <th>Date</th>
    <th>Booking</th>
  </tr>
  <%for(Addtrain at:al){ %>
  <tr>
    <td><%=at.getTrainno() %></td>
    <td><%=at.getTrainname() %></td>
    <td><%=at.getSplace() %></td>
    <td> <%=at.getDplace() %></td>
    <td><%=at.getFare() %></td>
    <td><%=at.getSeat() %></td>
    <td><%=at.getDatee() %></td>
    <td> <form><button action="RegisterController" ><a href="Ticketbooking.jsp"> Click Here</button></form></td>
  </tr>
<%} %>
  </table>

</body>
</html>
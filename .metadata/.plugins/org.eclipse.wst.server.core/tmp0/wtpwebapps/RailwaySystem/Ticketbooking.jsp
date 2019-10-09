<%@page import="org.apache.catalina.User"%>
<%@page import= "java.util.ArrayList" %>
<%@page import="com.models.Addtrain"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Booking Ticket</title>
<style>
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

.container {
  padding: 16px;
}


</style>
</head>
<body>
 <% HttpSession sn=request.getSession(false);
ArrayList<Addtrain> al=(ArrayList<Addtrain>)sn.getAttribute("train");
%>
<%-- <%ArrayList<Addtrain> al=(ArrayList<Addtrain>)request.getAttribute("train"); %> --%>

<form action="RegisterController" >
<input type="hidden" name="action" value="booking">
<table >

<tr>
<th colspan="2" > Book Ticket</th></tr>
<%for(Addtrain at:al){ %>
  <tr>
    <td>Select Train NO</td>
     <td> <%=at.getTrainno() %></td>
    </tr>
    <%} %>
    <%for(Addtrain at:al){ %>
    <tr>
    <td>Source Station</td>
       <td> <%=at.getSplace() %></td>
      </div>
    </div></td></tr>
    <%} %>
     <%for(Addtrain at:al){ %>
     <tr>
    <td>Destination Station</td>
       <td> <%=at.getDplace() %></td>
      </div>
    </div></td></tr>
    <%} %>
    
    
    <td>Enter Passenger Name</td>
    <td><input type="text" placeholder="Passenger name" name="name" required></td>
   </tr>
   <tr>
   <td>Address</td>
    <td><input type="text" placeholder="Address" name="address" required></td>
   </tr>
   <tr>
   <td>Phone No</td>
    <td><input type="text" placeholder="Mobile Number" name="mobileno" required></td>
   </tr>
   <tr>
   <td>Adhaar card Numer</td>
    <td><input type="text" placeholder="Adhaar card No." name="adhaar" required></td>
   </tr>
  <tr>
   <%for(Addtrain at:al){ %>
    <td>To Date</td>
    <td><%=at.getDatee() %></td>
  </tr>
  <%} %>
  <tr>
    <td>No of ticket</td>
    <td><div class="col-75">
        <select name="noofseat">
          <option value="1">1</option>
          <option value="2">2</option>
          <option value="3">3</option>
        </select>
      </div>
    </div></td></tr>
    


</table>

<center>
<input class="container" style="background-color: lightgreen; width:400px;" type="submit" name="action" value="Book Ticket" >
</center>
</form>
</body>
</html>
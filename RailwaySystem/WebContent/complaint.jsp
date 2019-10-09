<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="header.css">
<link rel="stylesheet" type="text/css" href="adminadddetail.css">
<title>HomePage</title>
</head>
<body>
<div class="topnav">
  <a  href="userhome.jsp">Home</a>
  <a href="booking.jsp">Ticket Booking</a>
  <a href="">Cancellation</a>
  <a href="complaint.jsp">Complaints Box</a>
  <a  href="RegisterController?action=history">View History</a>
  <a>${userid }</a>
  <a href="RegisterController?action=logout">logout</a>
</div>
<form action="RegisterController" style="max-width:400px; margin-left:40%; margin-top:11px;">
 <input type="hidden" name="action" value="complnt">
<div class="container">
    <h2>Drop Your Complaints Here</h2>
    <hr>

    <labeL><b>NAME</b></label>
    
    <input type="text" placeholder="Enter Your Name" name="name" required>

    <label><b>Email Id</b></label>
    <input type="text" placeholder="Enter Your Email" name="email" required>
     
     
    <labeL><b>Address </b></label>
    <input type="text" placeholder="Enter Your Address" name="address" required>    
    
  <labeL><b>Complaint</b></label>
<textarea rows="4" cols="45" name="complaint" placeholder="Enter Complaint Here eg:- Train late; Station problem etc..">
</textarea> <br><br>

    <button type="submit" class="registerbtn" onclick="myFunction()">Submit</button>
  </div>
  </form>

</body>
</html>
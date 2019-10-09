<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="header.css">
<link rel="stylesheet" type="text/css" href="adminadddetail.css">
<title>Insert title here</title>
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
<form action="RegisterController" style="max-width:400px; margin-left:40px; margin-top:11px;">
<input type="hidden" name="action" value="adddetail">
<div class="container">
    <h1>ADD TRAIN DETAILS</h1>
    <hr>

    <labeL><b>Train Number</b></label>
    <input type="text" placeholder="Enter Train Number" name="trainno" required>

    <label><b>Train Name</b></label>
    <input type="text" placeholder="Enter Train Name" name="trainname" required>
     
     
    <labeL><b>Start Place </b></label>
    <input type="text" placeholder="Enter Start Place" name="splace" required>

    <label><b>Destination Place</b></label>
    <input type="text" placeholder="Enter Destination Place" name="dplace" required>
    
    <label><b>Fare</b></label>
    <input type="text" placeholder="Enter Fare" name="fare" required>
    
    
    <label><b>Available Seat</b></label>
    <input type="text" placeholder="Enter Available Seat" name="seat" required>
    
    <lable><b>To Date</b></lable>
    <input type="date" placeholder="yyyy-mm-dd" name="datee" required>
    
      
    <hr>
    

    <button type="submit" class="registerbtn">Save</button>
  </div>
  </form>
</body>
</html>s
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="header.css">
<link rel="stylesheet" type="text/css" href="booking.css">
<title>HomePage</title>
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
<div class="topnav">
  <a  href="userhome.jsp">Home</a>
  <a href="booking.jsp">Ticket Booking</a>
  <a href="">Cancellation</a>
  <a href="complaint.jsp">Complaints Box</a>
  <a  href="RegisterController?action=history">View History</a>
  <a>${userid }</a>
  <a href="RegisterController?action=logout">logout</a>
</div>

<div class="container">
  <form action="RegisterController">
  <input type="hidden" name="action" value="searchtrain">
  <div class="row">
      <div class="col-25">
        <label>Boarding Point</label>
      </div>
      <div class="col-75">
        <select name="Boarding">
          <option value="Delhi">Delhi</option>
          <option value="Mumbai">MUMBAI</option>
          <option value="Goa">Goa</option>
          <option value="Patna jn">Patna jn</option>
          <option value="Lucknow">Lucknow</option>
          <option value="Tamilnadu">Tamilnadu</option>
          <option value="Chennai">Chennai</option>
          <option value="Gorakhpur">Gorakhpur</option>
          <option value="Varanashi">Varanashi</option>
          <option value="Jhansi">Jhansi</option>
        </select>
      </div>
    </div>
    
    <div class="row">
      <div class="col-25">
        <label> Destination</label>
      </div>
      <div class="col-75">
        <select name="Destination">
          <option value="Delhi">Delhi</option>
          <option value="Mumbai">MUMBAI</option>
          <option value="Goa">Goa</option>
          <option value="Patna jn">Patna jn</option>
          <option value="Lucknow">Lucknow</option>
          <option value="Tamilnadu">Tamilnadu</option>
          <option value="Chennai">Chennai</option>
          <option value="Gorakhpur">Gorakhpur</option>
          <option value="Varanashi">Varanashi</option>
          <option value="Jhansi">Jhansi</option>
        </select>
      </div>
    </div>
    
    <div class="row">
      <div class="col-25">
        <label> DATE</label>
      </div>
      <div class="col-75">
          <input type="date" placeholder="yyyy-mm-dd" name="datee" required>
      </div>
    </div>
    
  
    <div class="row">
      <input type="submit" value="Submit">
    </div>
  </form>
</div>


</body>
</html>
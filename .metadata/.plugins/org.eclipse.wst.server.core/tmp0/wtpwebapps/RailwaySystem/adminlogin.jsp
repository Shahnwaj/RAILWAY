<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="login.css">
<title>Login</title>
<link rel="stylesheet" type="text/css" href="header.css">
</head>
<body>
<div class="topnav">
  <a  href="home.html">Home</a>
  <a href="">About</a>
  <a href="">Contact</a>
  <a href="">Review</a>
  </div><br><br>

<h2 style="font-size: 18px;color:#0288d1;font-family: 'Georgian',Arial;float: left; margin-top: 20px;"> &nbsp; &nbsp;&nbsp;&nbsp;&nbsp;Book Your Tickets Here </h2><br>
  <img src="icon.png"  style="margin-top: 26px; margin-left: -220px;" >


<center>




<div class="alert alert-info" style="color: #fff;font-size: 35px; margin-top: 20px;" "background-color:red; text-align: center;">
                            
                                
                                
                                    Welcome to Admin Ticket Portal
                                
                            
                        </div>

                        <div class="input-group mb-3">
  <div class="input-group-prepend" >
    
  </div>
</div>

</center>

<form action="RegisterController" method="get">
<input type="hidden" name="action" value="adminlogin">

  <div class="container">
    <label><b>UserName</b></label>
    <input type="text" placeholder="Enter UserName" name="username" required>

    <label><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="pswd" required>
  </div>

 <button type="submit" class="btn btn-primary" value="login">LOGIN</button>

</form>
<script src="js/jquery.js"></script>
<script src="js/bootstrap.min.js"></script>
</body>
</html>
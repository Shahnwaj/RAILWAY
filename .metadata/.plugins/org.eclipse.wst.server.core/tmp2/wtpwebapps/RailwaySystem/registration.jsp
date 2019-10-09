<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" type="text/css" href="Register.css">
<title>User Registration</title>
</head>
<body>
<form action="RegisterController" method="get" style="max-width:500px;margin:auto">
 <input type="hidden" name="action" value="insert"/> 
  <h2 align="center">Registration Form</h2><hr>
  <div class="input-container">
    <i class="fa fa-user icon"></i>
    <input class="input-field" type="text" placeholder="User ID" name="userid">
  </div>
  
   <div class="input-container">
    <i class="fa fa-key icon"></i>
    <input class="input-field" type="password" placeholder="Password" name="password">
  </div>

  <!-- <div class="input-container">
    <i class="fa fa-key icon"></i>
    <input class="input-field" type="password" placeholder="Re-Enter Password" name="rpassword">
  </div>
  -->

<h4 Style="background-color:gray;">Persional Detail</h4>
  <div class="input-container">
    <i class="fa fa-user icon"></i>
    <input class="input-field" type="text" placeholder="First Name" name="firstname">
  </div>
  <div class="input-container">
    <i class="fa fa-user icon"></i>
    <input class="input-field" type="text" placeholder="Middle name" name="middlename">
  </div>
  <div class="input-container">
    <i class="fa fa-user icon"></i>
    <input class="input-field" type="text" placeholder="Last name" name="lastname">
  </div>
 <div> GENDER :<input type="radio" name="gender" value="male" checked> Male
  <input type="radio" name="gender" value="female"> Female<br><br>
</div>

<div> MARITIAL STATUS :<input type="radio" name="status" value="Married" checked> Married
  <input type="radio" name="status" value="Unmarried"> Unmarried<br><br>
</div>

Date Of Birth: <input type="date" name="dob"><br><br>

<div class="input-container">
    <i class="fa fa-envelope icon"></i>
    <input class="input-field" type="text" placeholder="Adhar Card No" name="adhaarcard">
  </div>
  <div class="input-container">
    <i class="fa fa-envelope icon"></i>
    <input class="input-field" type="text" placeholder="Pan Crad No" name="pancard">
  </div>
  <div class="input-container">
    <i class="fa fa-envelope icon"></i>
    <input class="input-field" type="text" placeholder="Email" name="email">
  </div>
  
 
<div class="input-container">
    <i class="fa fa-phone icon"></i>
    <input class="input-field" type="text" placeholder="Mobile Number" name="mobileno">
  </div>
  <div> NATIONALITY :<input type="radio" name="nationality" value="Indian" checked> Indian
  <input type="radio" name="nationality" value="other"> Other<br><br>
</div>
<h4 Style="background-color:gray;">Residential Address</h4>

<textarea rows="4" cols="60" name="address" placeholder="Enter your Address">
</textarea> <br><br>
 <!-- <label>
      <input type="checkbox" checked="checked" name="remember" style="margin-bottom:15px"> Remember me
    </label>-->
<hr>
  <p align="center">By creating an account you agree to our <a href="#" style="color:dodgerblue">Terms & Privacy</a>.</p>


  <input type="submit" class="btn" value="Registration"/><br/>

  <p align="center">Already have an account? <a href="#" style="color:dodgerblue">Sign in</a>.</p>
</form>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="header.css">
<link rel="stylesheet" type="text/css" href="adminhome.css">
<title>HomePage</title>
</head>
<body>
<%-- <% HttpSession sn = request.getSession(false);
 String uname=(String)sn.getAttribute("username");%> --%>
<div class="topnav">
  <a  href="#home">Home</a>
  <a href="adminadddetail.jsp">Add Trains Details</a>
  <a href="adminupdatedetail.jsp">Edit Train Details</a>
  <a href="admincomplaintshow.jsp">Complaints Box</a>
  <a href="adminshowbooksticket.jsp">Books Tickets</a>
  <p>Welcome ${username }</p>
  <a href="RegisterController?action=logout">logout</a>
</div><br><br>
 
<div class="slideshow-container">
<div class="mySlides fade">
  <img src="ban3.jpg" style="width:100%; height:250px;">
</div>
<div class="mySlides fade">
  <img src="ban2.jpg" style="width:100% ; height:250px;">
</div>
<div class="mySlides fade">
  <img src="ban5.jpg" style="width:100% ; height:250px;">
</div>
<div class="mySlides fade">
  <img src="ban1.jpg" style="width:100%; height:250px">
</div>
</div>
<br>

<div style="text-align:center">
  <span class="dot"></span> 
  <span class="dot"></span> 
  <span class="dot"></span> 
  <span class="dot"></span> 
</div>

<div class="box"> <marquee behavior="scroll" direction="right" scrollamount="3">Welcome ${username }</marquee> </div>
<a href="RegisterController?action=trainlist"><div class="box" align="center"> ALL TRAIN LIST  </div></a> 
<a href="RegisterController?action=showpayment"><div class="box" align="center">All Payments  </div></a> 
<script>
var slideIndex = 0;
showSlides();

function showSlides() {
  var i;
  var slides = document.getElementsByClassName("mySlides");
  var dots = document.getElementsByClassName("dot");
  for (i = 0; i < slides.length; i++) {
    slides[i].style.display = "none";  
  }
  slideIndex++;
  if (slideIndex > slides.length) {slideIndex = 1}    
  for (i = 0; i < dots.length; i++) {
    dots[i].className = dots[i].className.replace(" active", "");
  }
  slides[slideIndex-1].style.display = "block";  
  dots[slideIndex-1].className += " active";
  setTimeout(showSlides, 2000); // Change image every 2 seconds
}
</script>
<script>
var coll = document.getElementsByClassName("collapsible");
var i;

for (i = 0; i < coll.length; i++) {
  coll[i].addEventListener("click", function() {
    this.classList.toggle("active");
    var content = this.nextElementSibling;
    if (content.style.display === "block") {
      content.style.display = "none";
    } else {
      content.style.display = "block";
    }
  });
}
</script>

</body>
</html>
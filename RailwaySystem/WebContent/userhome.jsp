<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="header.css">
<link rel="stylesheet" type="text/css" href="userhome.css">
<title>HomePage</title>
</head>
<body>

 <% HttpSession sn = request.getSession(false);
 String uname=(String)sn.getAttribute("userid");%>
 <div class="topnav">
  <a  href="userhome.jsp">Home</a>
  <a href="booking.jsp">Ticket Booking</a>
  <a href="">Cancellation</a>
  <a href="complaint.jsp">Complaints Box</a>
  <a  href="RegisterController?action=history">View History</a>
  <a>${userid }</a>
  <a href="RegisterController?action=profile">Profile</a>
  <a href="RegisterController?action=logout">logout</a>
  <!-- <a href="RegisterController?action=myprofile"> My Profile </a> -->
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


<button class="collapsible">ABOUT</button>
<div class="content">
  <p>About Indian Railways
The first railway on Indian sub-continent ran over a stretch of 21 miles from Bombay to Thane. The idea of a railway to connect Bombay with Thane, Kalyan and with the Thal and Bhore Ghats inclines first occurred to Mr. George Clark, the Chief Engineer of the Bombay Government, during a visit to Bhandup in 1843.

The formal inauguration ceremony was performed on 16th April 1853, when 14 railway carriages carrying about 400 guests left Bori Bunder at 3.30 pm "amidst the loud applause of a vast multitude and to the salute of 21 guns." The first passenger train steamed out of Howrah station destined for Hooghly, a distance of 24 miles, on 15th August, 1854. Thus the first section of the East Indian Railway was opened to public traffic, inaugurating the beginning of railway transport on the Eastern side of the subcontinent.  

In south the first line was opened on Ist July, 1856 by the Madras Railway Company. It ran between Vyasarpadi Jeeva Nilayam (Veyasarpandy) and Walajah Road (Arcot), a distance of 63 miles. In the North a length of 119 miles of line was laid from Allahabad to Kanpur on 3rd March 1859. The first section from Hathras Road to Mathura Cantonment was opened to traffic on 19th October, 1875. These were the small’s beginnings which is due course developed into a network of railway lines all over the country. By 1880 the Indian Railway system had a route mileage of about 9000 miles. INDIAN RAILWAYS, the premier transport organization of the country is the largest rail network in Asia and the world’s second largest under one management..</p>
</div>
<br><br>
<button class="collapsible">MISSION</button>
<div class="content">
<p>The Railway Mission is a British mission devoted to the rail industry. It was founded in 1881 based in mission halls, and now operates a chaplaincy service. In the early days of the Railway Mission there were a number of mission halls at railway stations throughout the country, including one at Bury St. Edmunds, completed in 1900,[1] and a 1906 building at Salisbury.[2] An excellent example of a Railway Mission Hall is to be found at Norwich Prince of Wales Road Evangelical Church.[3]

The Railway Mission[4] is a care provider to the rail industry and British Transport Police through the provision of The National Rail Chaplaincy Service (NRCS). Operating in partnership with London City Mission, the Railway Mission is the principal partner in the NRCS which provides around 25 mainly full-time chaplains to the Railways enabling pastoral care across the whole of the mainland UK railway network. The National Rail Chaplaincy Service (NRCS) is designed to enhance and support the chain of care provided by the rail businesses.</p>
</div><br><br>
<button class="collapsible">CONTACT</button>
<div class="content">
  <p><div class="chip">
  <img src="shahnwaj.JPG" alt="shahnwaj" width="96" height="96">
 Shahnwaj
</div></p>
</div><br><br>
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
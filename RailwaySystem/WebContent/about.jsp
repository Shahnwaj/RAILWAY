<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Railway Reservation System</title>
<style>* {
  box-sizing: border-box;
}

body {
  font-family: Arial, Helvetica, sans-serif;
}

/* Style the header */
header {
  background-color: #666;
  padding: 30px;
  text-align: center;
  font-size: 35px;
  color: white;
}

/* Create two columns/boxes that floats next to each other */
nav {
  float: left;
  width: 30%;
  height: 300px; /* only for demonstration, should be removed */
  background: #ccc;
  padding: 20px;
}

/* Style the list inside the menu */
nav ul {
  list-style-type: none;
  padding: 0;
}

article {
  float: left;
  padding: 20px;
  width: 70%;
  background-color: #f1f1f1;
  height: 300px; /* only for demonstration, should be removed */
}

/* Clear floats after the columns */
section:after {
  content: "";
  display: table;
  clear: both;
}

/* Style the footer */
footer {
  background-color: #777;
  padding: 10px;
  text-align: center;
  color: white;
}

/* Responsive layout - makes the two columns/boxes stack on top of each other instead of next to each other, on small screens */
@media (max-width: 600px) {
  nav, article {
    width: 100%;
    height: auto;
  }
}</style>
</head>
<body>

<h2>1. About Online Reservation</h2>
<p>The Indian railway website, IRCTC is the most traffic-filled site. The tickets are usually booked through this official site. If you are planning to book tickets the day before your departure date, tatkal tickets are available from 10:00 AM and ends as soon as the tickets are booked. The tickets are limited and the demand will be sky-high. If you are able to reserve a ticket through tatkal, you can get berth seats. Cancellation of tatkal ticket will not be refunded. Anyone can reserve tickets through IRCTC. You can pay through debit card, credit card, international card and others.
</p>
<p>
On the other hand, you can choose tour portals to reserve tickets. The sites will be faster and user-friendly. Not all trains will be displayed in such portals and a small fee will be levied as service charge. A foreigner can also book tickets through an account that will be verified through and Indian mobile number or by mailing passport details to IRCTC. Foreigners can easily book train tickets through tour portals.</p>

<header>
  <h2>Online Railway Reservation System</h2>
</header>

<section>
  <nav>
    <ul>
      <li><a href="#">Home</a></li><br>
      <li><a href="#">About</a></li><br>
      <li><a href="#">Contact Us</a></li>
    </ul>
  </nav>
  
  <article>
    <h1>2. Online Reservation</h1>
    <p>Following are the steps involved in online booking of train tickets:
Visit IRCTC and log into the site. If you are new member, it will request you to sign up.
</p>
    <p>Once you log into the site, there will be tab named ‘Plan My Journey’. Enter the details of the station of departure and station of arrival. You will have to enter details like the class of ticket you are preferring, journey date and others. Select the option for e-ticket. Keep the class and type of train open to find availability during tourism season and festival times.</p>
    <p>If you have given wrong station name or if there is no availability of trains, you will get an error message. Else, a tabular column of available train, departure time and arrival time will be listed. You can click on the train to check the train fare, availability of berth and others.
</p>
<p>If there is availability of train or you want to book the tickets there will be option to book now. Just click on the book now button and you fill find a form of Journey Details. Fill the journey details like Name, Age, Gender, Berth Preference, Nationality, ID Card Type and ID Card No.</p>
  </article>
</section>

</body>
</html>
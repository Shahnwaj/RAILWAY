<%@page import="com.models.Register"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>.com</title>
<style>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 60%;
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

<% 
Register rd=(Register)request.getAttribute("rp");%>

<table >
<tr>
<th colspan="2" > My Profile</th>
</tr>
  <tr>  
    <td> USER ID</td>
    <td><%=rd.getUserid() %></td>
   </tr>
<tr>  
    <td> Name</td>
    <td><%=rd.getFirstname() %> <%=rd.getMiddlename() %> <%=rd.getLastame() %></td>
   </tr>
   <tr>
   <td>Gender</td>
    <td><%=rd.getGender() %></td>
   </tr>
   <tr>
   <td>Maritial Status</td>
    <td><%=rd.getStatus() %></td>
   </tr>
   <tr>
   <td>Date Of Birth</td>
   <td><%=rd.getDob() %></td>
   </tr>
   <tr>
   <td>Adhaar Card</td>
   <td><%=rd.getAdhaarcard() %></td>
   </tr>
   <tr>
   <td>Pancard</td>
   <td><%=rd.getPancard() %></td>
   </tr>
  <tr>
    <td>Email</td>
    <td><%=rd.getDob() %></td>
  </tr>
   <tr>
    <td>Mobile</td>
    <td><%=rd.getMobileno() %></td>
  </tr>
  <tr>
    <td>Nationality</td>
    <td><%=rd.getNationality() %></td>
  </tr>
  <tr>
    <td>Address</td>
    <td><%=rd.getAddress() %></td>
  </tr>
</table>
</body>
</html>
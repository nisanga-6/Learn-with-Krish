<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Two Numbers</title>
</head>
<body>

<%

String result =(String)request.getAttribute("result");

%>

<%
if(result!=null){

%>

<h3 align="center" style="color:red">Sum of Two numbers is <span style="color:blue"><%=result %></span> </h3>

<% 
}
%>

<h1 align="center" style="color:red">Add Two Numbers</h1>

<div align="center">
<form action="addServlet" method="post">
<table>

<tr>
<td>Enter First Number</td>
<td><input type="text" name="no1" placeholder="Enter First Number"></td>
</tr>
</br></br>

<tr>
<td>Enter Second Number</td>
<td><input type="text" name="no2" placeholder="Enter Second Number"></td>
</tr>
</br></br>

<tr>
<td><input type="submit" value="Add Numbers"></td>
</tr>

</table>

</form>
</div>


</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form</title>
</head>
<body>
<form>
Name : <input type = "text" name="uname"/>
<input type="submit" >

<br/>

<% out.println(request.getParameter("uname")); %>

<h1>
Welcome to Nsti Allahabad: ${param.uname}
</h1>
</form>
</body>
</html>
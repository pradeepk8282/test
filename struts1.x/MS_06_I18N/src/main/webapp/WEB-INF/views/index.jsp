<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<title>Registration Form</title>
</head>
<body>
<div>
<h1>WelCome to Neorays</h1>
</div>
<div>
<pre>
	<form action="login.do" method="post">
	<spring:message code="label.studentname" text="default text" /> <input type="text" id="sname">
	 <input type="text" id="shob">
	 <input type="text" id="smob">
	  <input type="text" id="sdob">
	<input type="submit" id="submit" value=submit>
	</pre>
	</form>
</div>

</body>
</html>
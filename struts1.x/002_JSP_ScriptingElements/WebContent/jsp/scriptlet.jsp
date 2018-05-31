<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<body bgcolor="orange">
	<h1>SCRIPLET TEST PAGE</h1>
	<br>
	<%
		for (int i = 0; i < 5; i++) {
			out.println("<B>Hello world. This is a Scriplet test " + i
					+ " </B><BR>");
		}
	%>
</body>
</html>

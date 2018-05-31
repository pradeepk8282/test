<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body bgcolor="wheat">
	<h1>
		Begin of JSP<br> Hello Welcome
	</h1>
	This is my second JSP
	<br>
	<%
		int a = 10;
		int b = 20;
		int c = a + b;
		out.println("Value of a is " + a);
		out.println("Value of b is " + b);
		out.println("Sum of both number is " + c);
	%>
	<br>
	<h1>End of JSP</h1>

</body>
</html>
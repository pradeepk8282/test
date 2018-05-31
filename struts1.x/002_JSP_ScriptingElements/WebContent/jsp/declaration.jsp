<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%!int i = 100;

	public String sayHello(String name) {
		return "Hello, " + name + "!";
	}%>
<html>
<body bgcolor="yellow">
	<h1>DECLARATION TEST PAGE</h1>
	<br>
	<p>
		Saying hello to all reader:
		<%=sayHello("Neorays")%>.
	</p>
	<p>
		Value of i is
		<%=i%></p>
	<div>
		<a href="expression.jsp">expression</a>
	</div>
</body>
</html>
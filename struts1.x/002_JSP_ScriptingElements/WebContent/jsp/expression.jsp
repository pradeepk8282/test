<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%!int i = 0;%>

<html>
<body bgcolor="pink">
	<h1>Expression Test page</h1>
	<br>
	<%
		i++;
	%>
	Hello world! This JSP has been accessed
	<%=i%>
	times
	<div>
		<a href="scriptlet.jsp">scriptlet Page</a>
	</div>



</body>
</html>
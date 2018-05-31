<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<body bgcolor="yellow">
	<%
		String strName = request.getParameter("nme");
		String strPassword = request.getParameter("pwd");
		if ((strName.equalsIgnoreCase("Neorays"))
				&& (strPassword.equalsIgnoreCase("JSp3"))) {
	%>
	<p>
		<font size="3" color="green">Hello Mr <%=strName%> you are
			welcome
		</font>
	</p>
	<%
		} else {
	%>
	<p>
		<font size="3" color="red">Hello Mr <%=strName%> Mr You are not
			a valid User
		</font>
	</p>
	<%}%>
</body>
</html>
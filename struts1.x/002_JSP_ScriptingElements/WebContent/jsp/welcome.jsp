<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%!int a = 3;%>
<%!int b = 3;%>
<%!int sum = 0;%>
<html>
<body bgcolor="pink">
	<h1>Hello Welcome</h1>
	<br>
	<%
		sum = a + b;
		out.println("This is from scriplet tag sum:" + sum);
		if (sum == 6) {
			out.println("hello how are you " + sum + " condition true");
	%><br> Hello How r u
	<%=sum%>
	Condition true
	<br>
	<%
		} else {
			out.println("is not equal to 6<BR>");
			out.println(sum);
	%>
	this is from else loop:<%=sum%>
	<%
		}
	%>
	END OF JSP PAGE
	<div>
		<a href="jsp/declaration.jsp">declaration_page</a>
	</div>
</body>
</html>

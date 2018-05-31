<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html:html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<body bgcolor="wheat">



	<h1>
		Firstname:
		<%=request.getAttribute("a")%></h1>
	<h1>
		Lastname:
		<%=request.getAttribute("b")%></h1>
	<h1>
		DOB:
		<%=request.getAttribute("c")%></h1>
	<hr>
	<h1>
		Home:
		<%=request.getAttribute("home.firstname")%></h1>
	<h1>Form</h1>
${home.firstname}<br>

${home}<br>
${10+10}

</body>
</html:html>
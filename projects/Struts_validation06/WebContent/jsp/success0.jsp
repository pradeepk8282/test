<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<html:html>
	<body bgcolor="wheat">
		<h1>Firstname: <%= request.getAttribute("a") %></h1>
		<h1>Lastname: <%= request.getAttribute("b") %></h1>
		<h1>DOB: <%= request.getAttribute("c") %></h1>
		<hr>
		<h1>Home: <%= request.getAttribute("home.firstname") 
					
		%></h1>
		<h1>Form</h1>
	
		
		
	</body>
</html:html>
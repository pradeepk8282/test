<!-- Cluster Software Solutions.
(Mob:98451-31637/39
www.clusterindia.com) -->

<html>
<body bgcolor="orange">
<h1>Without EL and using java code</h1>
<%	
	String a = (String)request.getAttribute("FNAME");
	String b = (String)session.getAttribute("LNAME");
	String c = (String)application.getAttribute("PH");
%>

	First Name 	:<%= a %><br> 
	Last Name	:<%= b %><br>
	Phone		:<%= c %><br>
	
</body>
</html>
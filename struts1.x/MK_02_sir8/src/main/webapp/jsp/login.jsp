<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html:html>
<head>


<title>Login</title>
<style type="text/css">
input[type=text],[type=password] {
	width: 100%;
	padding: 12px 20px;
	margin: 8px 0;
	display: inline-block;
	border: 1px solid #ccc;
	border-radius: 4px;
	box-sizing: border-box;
}

input[type=submit] {
	width: 100%;
	background-color: #4CAF50;
	color: white;
	padding: 14px 20px;
	margin: 8px 0;
	border: none;
	border-radius: 4px;
	cursor: pointer;
}

input[type=submit]:hover {
	background-color: #45a049;
}
</style>
</head>
<body bgcolor="#bcfeab">

	<html:form action="/login" onsubmit="return validateloginform(this)">
		<html:javascript formName="loginform" />

		<bean:message key="login.username" />
		<html:text property="username"></html:text>



		<bean:message key="login.password" />
		<%-- <html:text property=""></html:text> --%>
		<html:password property="password"></html:password>


		<html:errors property="password"></html:errors>


		<html:submit value="Submit"></html:submit>



	</html:form>

</body>
</html:html>
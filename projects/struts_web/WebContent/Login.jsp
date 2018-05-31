<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-bean"  prefix="bean"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Form</title>
</head>
<body>
	<html:form action="/log">
		<table>
			<tr>
				<td><bean:message key="login.username"/></td>
				<td><html:text property="username" /></td>
			</tr>
			<tr>
			<td><bean:message key="login.password"/></td>
				<td><html:password property="password"  /></td>
			</tr>
		</table>
		<html:submit value="Enter"></html:submit>
	</html:form>
</body>
</html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<style type="text/css">
.errors {
	color: red
}
</style>
</head>
<body bgcolor="pink">
	<form:form action="display" commandName="user">
		<table>
			<tr>
				<td>Enter your Name</td>
				<td><form:input path="name" /></td>
				<td><form:errors path="name"  /></td>
			</tr>
			<tr>
				<td>Enter Your Password</td>
				<td><form:input path="password" /></td>
				<td><form:errors path="password"  /></td>
			</tr>
			<tr>
				<td><input type="submit" value="submit" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>
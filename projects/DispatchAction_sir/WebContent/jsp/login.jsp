<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>

<html:html>
	<body bgcolor="458956">
		<html:form action="/login"> 
			<table>
				<tr>
					<td><bean:message key="login.number1"/></td>
					<td><html:text property="number1"/></td>
				</tr>
				<tr>
					<td><bean:message key="login.number2"/></td>
					<td><html:text property="number2"/><br></td>
				</tr>
			</table>
			<html:submit property="method">add</html:submit>
			<html:submit property="method">multiply</html:submit>
			<html:submit property="method">subtract</html:submit>
		</html:form>
	</body>
</html:html>
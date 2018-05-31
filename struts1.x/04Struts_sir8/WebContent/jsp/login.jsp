<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>

<html:html>
	<body bgcolor="wheat">
		<html:form action="/login" onsubmit="return validateLoginForm(this)">
			<html:javascript formName="loginForm"/>
			<table>
				<tr>
					<td><bean:message key="login.username"/></td>
					<td><html:text property="userName"/></td>
					<td><html:errors property="userName"/></td>
				</tr>
				<tr>
					<td><bean:message key="login.password"/></td>
					<td><html:password property="password"/></td>
					<td><html:errors property="password"/></td>
				</tr>
			</table>
			<html:submit value="Enter"></html:submit>
		</html:form>
		
	</body>
</html:html>
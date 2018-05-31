<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>

<html:html>
	<body bgcolor="wheat">
		<html:form action="/login">
			<table>
				<tr>
					<td><bean:message key="login.sid"/></td>
					<td><html:text property="sid"></html:text></td>
					<td><html:submit value="Enter"></html:submit></td>
					<td><html:errors property="sid"/></td>
				</tr>
			</table>
		</html:form>
	</body>
</html:html>
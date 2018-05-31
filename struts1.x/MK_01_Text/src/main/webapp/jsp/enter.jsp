<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>

<html:html>
	<body bgcolor="wheat">
		<html:form action="/login">
			<table>
				<tr>
					<td><bean:message key="login.studentname"/></td>
					<td><html:text property="studentname"/></td>
				</tr>
			</table>
			<html:submit value="Enter"></html:submit>
		</html:form>
	</body>
</html:html>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<html:html>
	<body bgcolor="wheat">
		<h1>Global Exception Example:</h1>
		<html:form action="/global">
			<table>
				<tr>
					<td><bean:message key="login.color"/></td>
					<td><html:text property="globalcolor"></html:text></td>
				</tr>
			</table>
			
			<html:submit value="Enter"></html:submit>
			<html:reset value="reset"></html:reset>
		</html:form>
		<h1>Local Exception Example:</h1>
			<html:form action="/local">
				<table>
					<tr>
					<td><bean:message key="login.colors"/></td>
					<td><html:text property="localcolor"></html:text></td>
				</tr>
				</table>
				<html:submit value="Enter"></html:submit>
				<html:reset value="reset"></html:reset>
			</html:form>
	</body>
</html:html>

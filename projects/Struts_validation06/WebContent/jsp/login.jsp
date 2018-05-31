<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>

<html:html>
	<body bgcolor="cyan">
		<html:form action="/search">
			<table>
				<tr>
					<td><bean:message key="login.searchstudent"/></td>
					<td><html:text property="sid"/></td>
				</tr>
			</table>
		<html:submit value="Enter"/>
		</html:form>
		<html:errors/>
	</body>
</html:html>
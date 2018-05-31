<%@ page language="java" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<html>
	<body>
		<table width="80%" height="90%" align="center">
			<tr>
				<td height="10%" bgcolor="blue" colspan="3">
					<tiles:insert attribute="header"/>
				</td>
			</tr>
			
			<tr>
				<td width="20%" bgcolor="green">
					<tiles:insert attribute="lmenu"/>
				</td>
				
				<td width="60%" bgcolor="red">
					<tiles:insert attribute="body"/>
				</td>
				
				<td width="20%" bgcolor="pink">
					<tiles:insert attribute="rmenu"/>
				</td>
			</tr>
			
			<tr>
				<td height="10%" bgcolor="yellow" colspan="3">
					<tiles:insert attribute="footer"/>
				</td>
			</tr>
		</table>
	</body>
</html>
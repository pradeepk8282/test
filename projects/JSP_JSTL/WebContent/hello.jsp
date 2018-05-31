<!-- Cluster Software Solutions.
(Mob:98451-31637/39
www.clusterindia.com) -->

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
	<body bgcolor="orange">
	<strong>Student List</strong>
	<table>
		<c:forEach var="arl" items="${ARLDETAILS}" >
			<tr>
				<c:forEach var="str" items="${arl}" >
				     <td>${str}</td>
				</c:forEach>
			</tr>	
		</c:forEach>
	</table>	
	</body>
</html>


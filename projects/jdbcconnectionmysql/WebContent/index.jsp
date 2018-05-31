<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="javax.servlet.*,javax.servlet.http.*"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="orange">
	<sql:setDataSource var="snapshot"
		driver="oracle.jdbc.driver.OracleDriver"
		url="jdbc:oracle:thin:@localhost:1521:XE" user="scott"
		password="tiger" />
		
	<sql:query var="result" dataSource="${snapshot}">SELECT * FROM EMP</sql:query>


	<table border="1px">
		<thead>
			<tr>
				<td>EMPNO</td>
				<td>ENAME</td>
				<td>JOB</td>
				<td>MGR</td>
				<td>SAL</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="row" items="${result.rows}">
				<tr>

					<td><c:out value="${row.EMPNO}"></c:out></td>
					<td><c:out value="${row.ENAME}"></c:out></td>
					<td><c:out value="${row.JOB}"></c:out></td>
					<td><c:out value="${row.MGR}"></c:out></td>
					<td><c:out value="${row.SAL}"></c:out></td>
					<br>

				</tr>
			</c:forEach>
	</table>

</body>
</html>
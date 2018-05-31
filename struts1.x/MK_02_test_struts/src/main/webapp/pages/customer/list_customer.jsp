<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>

<html>
<head>
</head>
<body>
	<h1>Struts + Spring + Hibernate example</h1>

	<h2>List All Customers</h2>

	<table border="1">
		<tr>
			<td>Customer Name</td>
			<td>Address</td>
		</tr>

		<logic:iterate id="customer" name="dynaCustomerListForm"
			property="customerList">
			<tr>
				<td><bean:write name="customer" property="name" /></td>
				<td><bean:write name="customer" property="address" /></td>
			</tr>
		</logic:iterate>

	</table>

	<br />
	<br />
	<html:link action="/AddCustomerPage.do">Add Customer</html:link>

</body>
</html>
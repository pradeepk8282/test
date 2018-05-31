<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="#f1f1f1">
	<center>
		<h1>File upload to database</h1>
		<form action="upload" method="post">
			<table>
				<tr>
					<td>First Name</td>
					<td><input type="text" name="firstname"
						placeholder="Enter Your First Name" size="50"></td>
				</tr>
				<tr>
					<td>Last Name</td>
					<td><input type="text" name="lastname"
						placeholder="Enter Your Last Name" size="50"></td>
				</tr>
				<tr>
					<td>portrait photo</td>
					<td><input type="file" name="photo" size="50"></td>
				</tr>
				<tr>

					<td colspan="2"><input type="submit" value="Submit"></td>
				</tr>



			</table>
		</form>
	</center>
</body>
</html>
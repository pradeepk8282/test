<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<head>
<title>UserForm</title>
<spring:url value="/resource/css/hello.css" var="coreCss" />
<spring:url value="/resource/css/bootstrap.min.css" var="bootstrapCss" />
<link href="${coreCss}" rel="stylesheet" />
<link href="${bootstrapCss}" rel="stylesheet" />

</head>
<body>
	<spring:url value="/" var="urlHome" />
	<spring:url value="/users/add" var="urlAddUser" />

	<nav class="navbar navbar-inverse">
		<div class="container">
			<div class="navbar-header">
				<a class="navbar-brand" href="${urlHome}">Spring MVC Form</a>
			</div>
			<div id="navbar">
				<ul class="nav navbar-nav navbar-right">
					<li class="active"><a href="${urlAddUser}">Add User</a></li>
				</ul>
			</div>
		</div>
	</nav>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<html>
<head>
</head>
<body>

	<h2>Struts - DispatchAction Example</h2>

	<h4>html:link</h4>
	<p>
		<html:link action="/CustomDispatchActionXML">
           Generate XML File
   </html:link>
		|
		<html:link action="/CustomDispatchActionExcel">
           Generate Excel File
   </html:link>
	</p>

	<!-- <h4>a href</h4>
	<p>
		<a href="CustomDispatchActionXML.do"> Generate XML File </a> | <a
			href="CustomDispatchActionExcel.do"> Generate Excel File </a>
	</p>
 -->
</body>
</html>
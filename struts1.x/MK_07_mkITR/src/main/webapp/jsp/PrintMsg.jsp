<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<html>
<head>
</head>
<body>
<h1>Struts &lt;logic:iterate&gt; example</h1>
 
<logic:iterate name="list1" id="listMsgId">
<p>
	List Messages <bean:write name="listMsgId"/>
</p>
</logic:iterate>
 
</body>
</html>
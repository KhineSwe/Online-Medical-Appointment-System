<%@ include file="inc/common.jsp"%>
<html>
<head>
<title>Framework Login</title>
<link href="css/library.css" rel="stylesheet" type="text/css">
</head>
<body>
<h3 align="center">Framework Login Page</h3>
<hr>
<html:form action="/loginPath">
	<table align="center">
		<tr>
			<td><html:errors property="loginerror" /> <html:errors
				property="frmLoginName" /> <html:errors property="frmPassword" /></td>
		</tr>
		<tr>
			<td>Login Name:</td>
			<td><html:text property="frmLoginName"></html:text> <font
				color="red">***</font></td>
		</tr>
		<tr>
			<td>Password:</td>
			<td><html:password property="frmPassword">
			</html:password> <font color="red">***</font></td>
		</tr>
		<tr>
			<td colspan="2" align="center"><html:submit property="btnLogin"
				value="Login">
			</html:submit></td>
			<td colspan="2">New Student? Please <a
				href="registerPathFirst.do">Registration</a></td>
		</tr>
	</table>
</html:form>
<%@ include file="inc/footer.jsp"%>
</body>
</html>

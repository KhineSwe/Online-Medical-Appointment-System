<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<%@ include file="inc/common.jsp"%>
<html>
<head>
<%@ include file="inc/calendar.jsp"%>
<title>Mail Send Page</title>
<link href="css/library.css" rel="stylesheet" type="text/css">
</head>
<body>
<h3 align="center">Mail Send Page</h3>
<hr>
<table border="1" width="100%">
	<%@ include file="inc/logout.jsp"%>
	<tr>
		<%@ include file="inc/left_menu.jsp"%>
		<td>
		<div><html:form action="/manyMailPath">
			<table align="center">
				<tr>
					<td>Name:</td>
					<td><html:text property="frmMailName1" /><html:errors
						property="frmMailName1" /></td>
				</tr>
				<tr>
					<td>Email:</td>
					<td><html:text property="frmMailAdd1" /> <html:errors
						property="frmMailAdd1" /></td>
				</tr>
				<tr>
					<td>Name:</td>
					<td><html:text property="frmMailName2" /><html:errors
						property="frmMailName2" /></td>
				</tr>
				<tr>
					<td>Email:</td>
					<td><html:text property="frmMailAdd2" /> <html:errors
						property="frmMailAdd2" /></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><html:submit property="btnSend"
						value="Send Mail">
					</html:submit> <html:submit property="btnCancel" value="Cancel">
					</html:submit></td>
				</tr>
			</table>
			<font color="green">${ManyMailFormBean.frmMailMessage}</font>
		</html:form></div>
		</td>
	</tr>
</table>
<%@ include file="inc/footer.jsp"%>
</body>
</html>
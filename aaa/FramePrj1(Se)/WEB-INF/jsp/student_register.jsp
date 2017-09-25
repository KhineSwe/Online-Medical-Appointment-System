<%@ include file="inc/common.jsp"%>
<html>
<head>
<title>Registration Page</title>
<link href="css/library.css" rel="stylesheet" type="text/css">
</head>
<body>
<h3 align="center">Framework Registration Page</h3>
<hr>
<html:form action="/registerPath">
	<logic:empty property="frmRegFormControl" name="RegFormBean">
		<table align="center">
			<tr>
				<td>Name:</td>
				<td><html:text property="frmRegName"></html:text> <font
					color="red">***</font> <html:errors property="frmRegName" /></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><html:text property="frmRegEmail"></html:text> <font
					color="red">***</font> <html:errors property="frmRegEmail" /></td>
			</tr>
			<tr>
				<td>Course Name:</td>
				<td><html:select property="frmRegCourseId">
					<html:option value="0">SELECT</html:option>
					<html:optionsCollection property="frmRegCourseList" value="id"
						label="courseName" />
				</html:select> 
				<html:errors property="courseError" /></td>
			</tr>
			<tr>
				<td>Account Name:</td>
				<td><html:text property="frmRegAccountName"></html:text> <font
					color="red">***</font> <html:errors property="frmRegAccountName" />
				<html:errors property="accountError" /></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><html:password property="frmRegPassword"></html:password> <font
					color="red">***</font> <html:errors property="frmRegPassword" /></td>
			</tr>
			<tr>
				<td>Confirm Password:</td>
				<td><html:password property="frmRegConfPassword">
				</html:password> <font color="red">***</font> <html:errors
					property="frmRegConfPassword" /> <html:errors
					property="passwordError" /></td>
			</tr>
			<tr>
				<td>Phone:</td>
				<td><html:text property="frmRegPhone"></html:text></td>
			</tr>
			<tr>
				<td>Address:</td>
				<td><html:textarea property="frmRegAddress">
				</html:textarea></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><html:submit
					property="btnRegister" value="Register">
				</html:submit> <html:cancel value="Cancel"></html:cancel>
				</td>
			</tr>

		</table>
	</logic:empty>
	<!-- Confirmation portion here -->
	<logic:notEmpty property="frmRegFormControl" name="RegFormBean">
		<table align="center">
			<tr>
				<td>Name:</td>
				<td><html:text property="frmRegName" disabled="true">
				</html:text></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><html:text property="frmRegEmail" disabled="true">
				</html:text></td>
			</tr>
			<tr>
				<td>Course Name:</td>
				<td><html:text property="frmRegCourseName" disabled="true">
				</html:text></td>
			</tr>
			<tr>
				<td>Account Name:</td>
				<td><html:text property="frmRegAccountName" disabled="true">
				</html:text></td>
			</tr>
			<tr>
				<td>Login Name:</td>
				<td><html:text property="frmRegLoginName" disabled="true">
				</html:text></td>
			</tr>
			<tr>
				<td>Registration Date:</td>
				<td><html:text property="frmRegDate" disabled="true">
				</html:text></td>
			</tr>
			<tr>
				<td>Phone:</td>
				<td><html:text property="frmRegPhone" disabled="true">
				</html:text></td>
			</tr>
			<tr>
				<td>Address:</td>
				<td><html:text property="frmRegAddress" disabled="true">
				</html:text></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><html:submit property="btnSave"
					value="Save">
				</html:submit> <html:submit property="btnSaveCancel" value="Cancel">
				</html:submit></td>
			</tr>
		</table>
	</logic:notEmpty>
</html:form>
<%@ include file="inc/footer.jsp"%>
</body>
</html>
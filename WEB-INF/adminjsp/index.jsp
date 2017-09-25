<!-- <a href="adminloginPath.do">Login</a>  -->
 <%@ include file="inc/common.jsp"%>
<%@ include file="inc/header.jsp"%>

 <body>
	<br />
	<br />
	<br />
	
		<div class="container">
			<h2>Admin Login</h2>
			<html:form action="/adminloginPath">
				<table align='center'>

					<tr>
						<td><label for="email">Email:</label></td>

						<td><html:text property="frmEmail" styleClass="form-control" maxlength="29" size="30">
							</html:text> <html:errors property="frmEmail" /></td>
						<td><font color="red">***</font></td>
					</tr>
					<tr>
					<td>&nbsp;&nbsp;</td>
					</tr>

					<tr>
						<td><label for="pwd">Password:</label></td>

						<td><html:password property="frmPassword"
								styleClass="form-control" styleId="pwd" maxlength="31" size="50"></html:password> <html:errors
								property="frmPassword" /></td>
						<td><font color="red">***</font></td>

					</tr>
					<tr>
						<td>&nbsp;&nbsp;&nbsp;</td>

						<td><font color="red"><html:errors
									property="loginerror" /></font></td>
					</tr>

					<tr>
					<td>&nbsp;&nbsp;</td>
						<td><html:submit property="btnLogin"
								styleClass="btn btn-success">Login</html:submit>
						<td>
					<tr>
				</table><br>
			</html:form>


		</div>

</body>

</html>

 
 
 
 

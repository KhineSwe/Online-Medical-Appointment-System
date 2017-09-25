<%@ include file="inc/common.jsp"%>
<%@ include file="inc/header.jsp"%>
<div class="panel panel-success">
		
			<div class="panel-heading">Login Form</div>

			<div class="panel-body col-sm-2"></div>
			<div class="panel-body col-sm-8">
				<br /> <br />
		
			<html:form action="/doctorloginPath">
			
				
					
				<table align="center" >
					<tr>
			<td>&nbsp;&nbsp;</td>
			</tr>
			
					
					<tr>
						<td><label for="email"><span
							class="glyphicon glyphicon-user"></span><font color="blue">
								Email: </font> </label></td>
						<td><html:text property="frmEmail" styleClass="form-control" maxlength="31" size="32"></html:text>
							<font color="red"><html:errors property="frmEmail" /></font></td>
						<td><font color="red">***</font></td>
					</tr>
					<tr>
						<td>&nbsp;</td>
						<td>&nbsp;</td>
					</tr>
					<tr>
						<td><label for="psw"><span
							class="glyphicon glyphicon-eye-open"></span><font color="blue">Password:</font></label></td>
						<td><html:password property="frmPassword"
								styleClass="form-control" maxlength="31" size="32">
							</html:password>
							<font color="red"><html:errors property="frmPassword" /></font></td>
						<td><font color="red">***</font></td>
					</tr>
					<tr>
						<td>&nbsp;</td>
						<td>&nbsp;</td>
					</tr>
					 <tr>
							<td>&nbsp;&nbsp;&nbsp;</td>
							
							<td><font color="red"><html:errors
										property="loginerror" /><html:errors
										property="loginDoctorstatuserror" /></font></td>
						</tr>
					<tr>
<td></td>
						<td><html:submit
								property="btnLogin" value="Login"
								styleClass="btn btn-success btn-block">
								<span class="glyphicon glyphicon-off"></span>
							</html:submit></td>

					</tr>


				</table>
			
			</html:form>
				<br /> <br />
		</div>
	</div>
	<%@ include file="inc/footer.jsp"%>


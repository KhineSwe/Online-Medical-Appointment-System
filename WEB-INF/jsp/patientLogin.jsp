<%@ include file="inc/common.jsp"%>
<%@ include file="inc/header.jsp"%>

		<div class="panel panel-success">
		
			<div class="panel-heading">Login Form</div>

			<div class="panel-body col-sm-2"></div>
			<div class="panel-body col-sm-8">
				<br /> <br />
				<html:form action="/loginPath">
				
				
			<table align="center">
				<tr>
					<td><label for="email"><span
							class="glyphicon glyphicon-user"></span><font color="blue">
								Email: </font> </label></td>
					<td><html:text property="frmEmail" styleClass="form-control" maxlength="99" size="30">
						</html:text> <html:errors property="frmEmail" /></td>
						
					<td><font color="red">***</font></td>
				</tr>
				<tr>
					<td>&nbsp;&nbsp;&nbsp;</td>
				</tr>
				<tr>
					<td><label for="psw"><span
							class="glyphicon glyphicon-eye-open"></span><font color="blue">Password:</font></label></td>
					<td><html:password property="frmPassword"
							styleClass="form-control" maxlength="31" size="32">
						</html:password> <html:errors property="frmPassword" /> </td>
						<td><font color="red">***</font></td>
							</tr>
			
					 <tr>
							<td>&nbsp;&nbsp;&nbsp;</td>
							
							<td><font color="red"><html:errors
										property="loginerror" /><html:errors
										property="loginPatientstatuserror" /></font></td>
						</tr> 
				
				<tr><td></td>
					<td><html:submit property="btnLogin" value="Login"
							styleClass="btn btn-success btn-block">
							<span class="glyphicon glyphicon-off"></span>
						</html:submit></td>
				</tr>
			</table>

		</html:form>
		
		<br /> <br />
	</div>
	 <div class="modal-footer">
	
		<h5>
		<font color="#b30000"><i>	Not a member?</i></font> <a href="registerPathFirst.do"><b>SignUp</b></a>
		</h5>
	</div> 

</div>
<br><br><br><br><br><br><br><br>
<%@ include file="inc/footer.jsp"%> 
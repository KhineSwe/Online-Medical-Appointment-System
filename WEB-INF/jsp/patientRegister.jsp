<%@ include file="inc/common.jsp"%>
<%@ include file="inc/calendar.jsp"%>
<%@ include file="inc/header.jsp"%>
<!DOCTYPE html>
<div class="container">
	<div class="row">
		<div class="panel panel-success">
			<div class="panel-heading">Registration Form</div>

			<div class="panel-body col-sm-2"></div>
			<div class="panel-body col-sm-8">
				<br /> <br />
				<html:form action="/registerPath">

					<logic:empty property="frmRegFormControl" name="RegFormBean">

						<table align="center" border="0">

							<tr>
								<td>Name:</td>
								<td><html:text property="frmRegName"
										styleClass="form-control" maxlength="29" size="30"></html:text>
									<html:errors property="frmRegName" /></td>
								<td><font color="red">***</font></td>
							</tr>
							<tr>
								<td>&nbsp;&nbsp;</td>
							</tr>

							<tr>
								<td>Email:</td>
								<td><html:text property="frmRegEmail"
										styleClass="form-control" maxlength="31" size="30"></html:text>
									<html:errors property="frmRegEmail" /> <html:errors
										property="emailError" /></td>
								<td><font color="red">***</font></td>
							</tr>
							<tr>
								<td>&nbsp;&nbsp;</td>
							</tr>

							<tr>
								<td>PhoneNo:</td>
								<td><html:text property="frmRegPhone"
										styleClass="form-control" maxlength="19" size="20">
									</html:text> <html:errors property="frmRegPhone" /> <html:errors
										property="phoneformaterror" /></td>
								<td><font color="red">***</font></td>
								<td><font color="blue">(0x-xxxxxxxxxxx)</font></td>

							</tr>
							<tr>
								<td>&nbsp;&nbsp;</td>
							</tr>

							<tr>
								<td>Gender:</td>
								<td><html:radio property="frmRegGender" value="Male">Male </html:radio>
									<html:radio property="frmRegGender" value='Female'>Female </html:radio>
									<html:errors property="frmRegGender" /></td>
								<td><font color="red">***</font></td>
							</tr>
							<tr>
								<td>&nbsp;&nbsp;</td>
							</tr>

							<tr>
								<td>Date of Birth:</td>
								<td><html:text property="frmRegDOB" styleId="calendar"
										styleClass="form-control" readonly="true"></html:text> <html:errors
										property="frmRegDOB" /> <html:errors property="dateerror" /></td>
								<td><font color="red">***</font><html:image src="images/calendar.gif" styleId="trigger"
										style="cursor: pointer; border: 3px solid red;"
										title="Date selector"
										onmouseover="this.style.background='red';"
										onmouseout="this.style.background=''"></html:image> <script
										type="text/javascript">
											//
											Calendar.setup({
												firstDay : 1,
												electric : false,
												singleClick : true,
												inputField : "calendar",
												button : "trigger",
												ifFormat : "%Y-%m-%d",
												daFormat : "%Y-%m-%d"
											});
											//
										</script></td>
										
								<td><font face="Verdana" size="2" color="blue">&nbsp;YYYY-MM-DD</font></td>
							</tr>
							<tr>
								<td>&nbsp;&nbsp;</td>
							</tr>

							<tr>
								<td>Blood Type:</td>
								<td><html:select property="frmRegBlood"
										styleClass="form-control">
										<html:option value="0">Select</html:option>
										<html:option value="A"> A </html:option>
										<html:option value="B"> B </html:option>
										<html:option value="O"> O </html:option>
										<html:option value="AB"> AB </html:option>
										<html:option value="unknown"> Unknown </html:option>
									</html:select></td>
							</tr>
							<tr>
								<td>&nbsp;&nbsp;</td>
							</tr>

							<tr>
								<td>Password:</td>
								<td><html:password property="frmRegPassword"
										styleClass="form-control" maxlength="31" size="32"></html:password> <html:errors
										property="frmRegPassword" /></td>
								<td><font color="red">***</font></td>
							</tr>
							<tr>
								<td>&nbsp;&nbsp;</td>
							</tr>

							<tr>
								<td>Confirm Password:</td>
								<td><html:password property="frmRegConfPassword"
										styleClass="form-control" maxlength="31" size="32"></html:password>
									<html:errors property="frmRegConfPassword" /> <html:errors
										property="passwordError" /></td>
								<td><font color="red">***</font></td>
							</tr>
							<tr>
								<td>&nbsp;&nbsp;</td>
							</tr>

							<tr>

								<td>Address:</td>
								<td><html:textarea property="frmRegAddress" rows="5"
										cols="18" style="resize: none;" styleClass="form-control"></html:textarea></td>
							</tr>

							<tr>
								<td>&nbsp;&nbsp;</td>
							</tr>
							<tr><td></td>
								<td  align="center"><html:submit
										property="btnRegister" value="Register"
										styleClass="btn btn-info"></html:submit> <html:cancel
										value="Cancel" styleClass="btn btn-info"></html:cancel></td>
							</tr>
						</table>
					</logic:empty>

					<logic:notEmpty property="frmRegFormControl" name="RegFormBean">
						<center><h4>
							<font color="green">Confirm Registration</font>
						</h4></center>
						
						<table align="center">
							<tr>
								<td>Name:</td>
								<td><html:text property="frmRegName" disabled="true"
										styleClass="form-control" maxlength="29" size="30"></html:text></td>
							</tr>
							<tr>
								<td>&nbsp;&nbsp;</td>
							</tr>


							<tr>
								<td>Email:</td>
								<td><html:text property="frmRegEmail" disabled="true"
										styleClass="form-control" maxlength="31" size="30"></html:text></td>
							</tr>
							<tr>
								<td>&nbsp;&nbsp;</td>
							</tr>

							<tr>
								<td>PhoneNo:</td>
								<td><html:text property="frmRegPhone" disabled="true"
										styleClass="form-control" maxlength="19" size="20"></html:text></td>
							</tr>
							<tr>
								<td>&nbsp;&nbsp;</td>
							</tr>

							<tr>
								<td>Gender:</td>
								<td><html:radio property="frmRegGender" value="Male"
										disabled="true">Male</html:radio> <html:radio
										property="frmRegGender" value='Female' disabled="true">Female</html:radio></td>
							</tr>
							<tr>
								<td>&nbsp;&nbsp;</td>
							</tr>

							<tr>
								<td>Date of Birth:</td>
								<td><html:text property="frmRegDOB" disabled="true"
										styleClass="form-control"></html:text></td>
							</tr>
							<tr>
								<td>&nbsp;&nbsp;</td>
							</tr>

							<tr>
								<td>Blood Type:</td>
								<td><html:text property="frmRegBlood" disabled="true"
										styleClass="form-control">
									</html:text></td>
							</tr>
							<tr>
								<td>&nbsp;&nbsp;</td>
							</tr>

							<tr>
								<td>Password:</td>
								<td><html:password property="frmRegPassword"
										disabled="true" styleClass="form-control" maxlength="31" size="32"></html:password></td>
							</tr>
							<tr>
								<td>&nbsp;&nbsp;</td>
							</tr>

							<tr>
								<td>Confirm Password:</td>
								<td><html:password property="frmRegConfPassword"
										disabled="true" styleClass="form-control" maxlength="31" size="32"></html:password></td>
							</tr>
							<tr>
								<td>&nbsp;&nbsp;</td>
							</tr>

							<tr>
								<td>Address:</td>
								<td><html:textarea property="frmRegAddress" disabled="true"
										cols="18" style="resize: none;" styleClass="form-control"></html:textarea></td>
							</tr>


							<tr>
								<td>&nbsp;&nbsp;</td>
							</tr>
							<tr>
								<td> </td>
								<td align="center"><html:submit
										property="btnConfirm" value="Confirm"
										styleClass="btn btn-info"></html:submit> <html:submit
										property="btnConfirmCancel" value="Cancel"
										styleClass="btn btn-info"></html:submit></td>
							</tr>
						</table>

					</logic:notEmpty>
				</html:form>
				<br /> <br />
			</div>
			<div class="panel-body col-sm-2"></div>


		</div>
	</div>
</div>



<%@ include file="inc/footer.jsp"%>

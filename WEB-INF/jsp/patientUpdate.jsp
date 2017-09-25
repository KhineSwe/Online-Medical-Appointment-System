<%@ include file="inc/common.jsp"%>
<%@ include file="inc/headerhome.jsp"%>
<%@ include file="inc/Mainheaderbar.jsp"%>
<!DOCTYPE html>
<div class="container">
	<div class="row">
		<div class="panel panel-success">
			<div class="panel-heading">Update Profile</div>

			<div class="panel-body col-sm-3"></div>
			<div class="panel-body col-sm-6">
				<br /> <br />
				<html:form action="/updatePath">

					<logic:empty property="frmRegFormControl" name="UpdateFormBean">

						<table align="center">

							<tr>
								<td>Name:</td>
								<td><html:text property="frmRegName"
										styleClass="form-control" maxlength="29" size="30"></html:text>
									<html:errors property="frmRegName" /></td>
								<td><font color="red">***</font></td>
							</tr>
							<tr>
								<td>&nbsp;&nbsp;</td>
								<td>&nbsp;&nbsp;</td>
								<td>&nbsp;&nbsp;</td>
							</tr>

							<tr>
								<td>Email:</td>
								<td><html:text property="frmRegEmail" disabled='true'
										styleClass="form-control" maxlength="31" size="30"></html:text>
									<html:errors property="frmRegEmail" /> <html:errors
										property="frmRegEmail" /></td>
								<td><font color="red">***</font></td>
							</tr>
							<tr>
								<td>&nbsp;&nbsp;</td>
								<td>&nbsp;&nbsp;</td>
								<td>&nbsp;&nbsp;</td>
							</tr>

							<tr>
								<td>PhoneNo:</td>
								<td><html:text property="frmRegPhone"
										styleClass="form-control" maxlength="19" size="20"></html:text></td>
								<td><font color="red">***</font><font color="blue">(0x-xxxxxxxxxxx)</font></td>

							</tr>
							<tr>
								<td>&nbsp;&nbsp;</td>
								<td><font color="red"><html:errors
											property="frmRegPhone" /></font></td>
								<td>&nbsp;&nbsp;</td>
							</tr>

							<tr>
								<td>Gender:</td>
								<td><html:radio property="frmRegGender" value="Male"
										disabled="true">Male </html:radio> <html:radio
										property="frmRegGender" value='Female' disabled="true">Female </html:radio>
								</td>
								<td>&nbsp;&nbsp;</td>

							</tr>
							<tr>
								<td>&nbsp;&nbsp;</td>
								<td>&nbsp;&nbsp;</td>
								<td>&nbsp;&nbsp;</td>
							</tr>

							<tr>
								<td>Date of Birth:</td>
								<td><html:text property="frmRegDOB" styleId="calendar"
										disabled="true" styleClass="form-control"></html:text> <html:errors
										property="frmRegDOB" /></td>
								<td>&nbsp;&nbsp;</td>
							</tr>
							<tr>
								<td>&nbsp;&nbsp;</td>
								<td>&nbsp;&nbsp;</td>
								<td>&nbsp;&nbsp;</td>
							</tr>

							<tr>
								<td>Blood Type:</td>
								<td><html:text property="frmRegBlood" disabled="false"
										styleClass="form-control"></html:text></td>
								<td>&nbsp;&nbsp;</td>
							</tr>
							<tr>
								<td>&nbsp;&nbsp;</td>
								<td>&nbsp;&nbsp;</td>
								<td>&nbsp;&nbsp;</td>
							</tr>

							<tr>
								<td>Password:</td>
								<td><html:password property="frmRegPassword"
										styleClass="form-control" maxlength="31" size="32"></html:password>
									<html:errors property="frmRegPassword" /></td>
								<td><font color="red">***</font></td>
							</tr>
							<tr>
								<td>&nbsp;&nbsp;</td>
								<td>&nbsp;&nbsp;</td>
								<td>&nbsp;&nbsp;</td>
							</tr>

							<tr>
								<td>Retype Password:</td>
								<td><html:password property="frmRegConfPassword"
										styleClass="form-control" maxlength="31" size="32"></html:password>
									<html:errors property="frmRegConfPassword" /> <html:errors
										property="passwordError" /></td>
								<td><font color="red">***</font></td>
							</tr>

							<tr>
								<td>&nbsp;&nbsp;</td>
								<td>&nbsp;&nbsp;</td>
								<td>&nbsp;&nbsp;</td>
							</tr>
							<tr>

								<td>Address:</td>
								<td><html:textarea property="frmRegAddress" rows="5"
										cols="18" style="resize: none;" styleClass="form-control"></html:textarea></td>
								<td>&nbsp;&nbsp;</td>
							</tr>

							<tr>
								<td>&nbsp;&nbsp;</td>
								<td>&nbsp;&nbsp;</td>
								<td>&nbsp;&nbsp;</td>
							</tr>

							<tr>
							
								<td colspan="3" align="center"><html:submit property="btnUpdate" value="Update"
										styleClass="btn btn-info"></html:submit> <html:cancel
										value="Cancel" styleClass="btn btn-info"></html:cancel></td>
							</tr>
						</table>
					</logic:empty>

					<logic:notEmpty property="frmRegFormControl" name="UpdateFormBean">
						<h4>
							<font color="blue">Confirm Updating</font>
						</h4>
						<hr>
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
										disabled="true" styleClass="form-control" maxlength="31"
										size="32"></html:password></td>
							</tr>
							<tr>
								<td>&nbsp;&nbsp;</td>
							</tr>

							<tr>
								<td>Retype Password:</td>
								<td><html:password property="frmRegConfPassword"
										disabled="true" styleClass="form-control" maxlength="31"
										size="32"></html:password></td>
							</tr>
							<tr>
								<td>&nbsp;&nbsp;</td>
							</tr>

							<tr>
								<td>Address:</td>
								<td><html:textarea property="frmRegAddress" disabled="true"
										styleClass="form-control" style="resize: none;"></html:textarea></td>
							</tr>
							<tr>
								<td>&nbsp;&nbsp;</td>
							</tr>


							<tr>
								<td colspan="2" align="right"><html:submit
										property="btnSave" value="Save" styleClass="btn btn-info"></html:submit>
									<html:submit property="btnSaveCancel" value="Cancel"
										styleClass="btn btn-info"></html:submit></td>
							</tr>
						</table>
					</logic:notEmpty>
				</html:form>

			</div>

		</div>
	</div>
</div>



<%@ include file="inc/footer.jsp"%>

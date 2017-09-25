<%@ include file="inc/common.jsp"%>
<%@ include file="inc/headerafterlogin.jsp"%>
<div class="container">
	<div class="row">
		<div class="panel panel-success">

			<div class="panel-heading">Update Profile</div>
			<div class="panel-body col-sm-2"></div>
			<div class="panel-body col-sm-8">
				<br /> <br />

				<html:form action="/doctorupdatePath">
					<logic:empty property="frmRegFormControl"
						name="DoctorUpdateFormBean">


						<table align="center">
							<tr>
								<td>Name:</td>
								<td><html:text property="frmRegName" 
										styleClass="form-control" maxlength="29" size="30"></html:text></td>
								
								<td><font color="red">*** </font></td>
							</tr>
							<tr>
								
								<td>&nbsp;</td>
								<td><font color="red"><html:errors property="frmRegName" /></font></td>
								<td>&nbsp;</td>
							</tr>
							<tr>
								<td>Email:</td>
								<td><html:text property="frmRegEmail" disabled="true"
										styleClass="form-control" maxlength="29" size="30"></html:text></td>
								
								<td>&nbsp;</td>
							</tr>
							<tr>
								<td>&nbsp;</td>
								<html:errors property="frmRegEmail" />
								<td>&nbsp;</td>
							</tr>
							<tr>
								<td>Password:</td>
								<td><html:password property="frmRegPassword"
										styleClass="form-control" maxlength="31" size="32"></html:password>
								</td>
								<td><font color="red">*** </font></td>
							</tr>
							<tr>
								<td>&nbsp;</td>
								<td><font color="red"><html:errors
											property="frmRegPassword" /></font></td>
											<td>&nbsp;</td>
							</tr>
							<tr>
								<td>Confirm Password:</td>
								<td><html:password property="frmRegConfPassword"
										styleClass="form-control" maxlength="31" size="32"></html:password>
								</td>
								<td><font color="red">***</font></td>
							</tr>
							<tr>
								<td>&nbsp;</td>
								<td><font color="red"><html:errors
											property="frmRegConfPassword" /> <html:errors
											property="passwordError" /></font></td>
											<td>&nbsp;</td>
							</tr>
							<tr>
								<td>Specialize Name:</td>
								<td><html:text property="frmRegSpecializeName"
										disabled="true" styleClass="form-control"></html:text></td>
										<td>&nbsp;</td>
							</tr>
							<tr>
								<td>&nbsp;</td>
								<td>&nbsp;</td>
								<td>&nbsp;</td>
							</tr>


							<tr>
								<td>Gender:</td>
								<td><html:text property="frmGender" disabled="true"
										styleClass="form-control"></html:text></td>
										<td>&nbsp;</td>
							</tr>
							<tr>
								<td>&nbsp;</td>
								<td>&nbsp;</td>
								<td>&nbsp;</td>
							</tr>
							<tr>
								<td>Phone:</td>
								<td><html:text property="frmRegPhone"
										styleClass="form-control" maxlength="19" size="20"></html:text></td>
								<td><font color="red">***</font></td>
								<td><font color="blue">(0x-xxxxxxxxxxx)</font></td>
								
							</tr>
							<tr>
								<td>&nbsp;</td>
								<td><font color="red"><html:errors
											property="frmRegPhone" /></font></td>
											<td>&nbsp;</td>
							</tr>
							<tr>
								<td>Address:</td>
								<td><html:textarea property="frmRegAddress" cols="23"
										rows="5" styleClass="form-control" style="resize: none;"></html:textarea></td>
										<td>&nbsp;</td>
							</tr>
							<tr>
								<td>&nbsp;</td>
								<td>&nbsp;</td>
								<td>&nbsp;</td>
							</tr>
							<tr>
								<td></td>
								<td colspan="2" align="center"><html:submit
										property="btnUpdate" value="Update" styleClass="btn btn-info"></html:submit>
									<html:cancel value="Cancel"
										styleClass="btn btn-info"></html:cancel></td>
							</tr>
						</table>
					</logic:empty>



					<logic:notEmpty property="frmRegFormControl"
						name="DoctorUpdateFormBean">
						<table align="center">
							<tr>
								<td>Name:</td>
								<td><html:text property="frmRegName" disabled="true"
										styleClass="form-control" maxlength="29" size="30"></html:text></td>
							</tr>
							<tr>
								<td>&nbsp;</td>
								<td>&nbsp;</td>
							</tr>

							<tr>
								<td>Email:</td>
								<td><html:text property="frmRegEmail" disabled="true"
										styleClass="form-control" maxlength="29" size="30"></html:text></td>
							</tr>
							<tr>
								<td>&nbsp;</td>
								<td>&nbsp;</td>
							</tr>

							<tr>
								<td>Password:</td>
								<td><html:password property="frmRegPassword"
										disabled="true" styleClass="form-control" maxlength="31"
										size="32"></html:password></td>
							</tr>
							<tr>
								<td>&nbsp;</td>
								<td>&nbsp;</td>
							</tr>

							<tr>
								<td>Confirm Password:</td>
								<td><html:password property="frmRegConfPassword"
										disabled="true" styleClass="form-control" maxlength="31"
										size="32"></html:password></td>
							</tr>
							<tr>
								<td>&nbsp;</td>
								<td>&nbsp;</td>
							</tr>

							<tr>
								<td>Specialize Name:</td>
								<td><html:text property="frmRegSpecializeName"
										disabled="true" styleClass="form-control"></html:text></td>
							</tr>
							<tr>
								<td>&nbsp;</td>
								<td>&nbsp;</td>
							</tr>
							<tr>
								<td>Gender:</td>
								<td><html:text property="frmGender" disabled="true"
										styleClass="form-control"></html:text></td>
							</tr>
							<tr>
								<td>&nbsp;</td>
								<td>&nbsp;</td>
							</tr>

							<tr>
								<td>Phone:</td>
								<td><html:text property="frmRegPhone" disabled="true"
										styleClass="form-control" maxlength="19" size="20"></html:text></td>
							</tr>
							<tr>
								<td>&nbsp;</td>
								<td>&nbsp;</td>
							</tr>

							<tr>
								<td>Address:</td>
								<td><html:textarea property="frmRegAddress" disabled="true"
										cols="23" rows="5" styleClass="form-control"
										style="resize: none;"></html:textarea></td>
							</tr>
							<tr>
								<td>&nbsp;</td>
								<td>&nbsp;</td>
							</tr>

							<tr>
								<td></td>
								<td colspan="2" align="center"><html:submit
										property="btnSave" value="Save" styleClass="btn btn-info"></html:submit>
									<html:submit property="btnSaveCancel" value="Cancel"
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

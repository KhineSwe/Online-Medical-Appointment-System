<%@ include file="inc/common.jsp"%>
<%@ include file="inc/headerhome.jsp"%>
<br />

<html:form action="/doctorRegisterPath" method="post"
	enctype="multipart/form-data">
	<logic:empty property="frmRegFormControl" name="DoctorRegFormBean">
	<h3 align="center"><font color="green">Doctor Registration</font></h3> <br>
		<table align="center">

			<tr>
				<th>Specialize:</th>
				<td><html:select property="frmRegSpecializeId"
						styleClass="form-control">
						<html:option value="0">SELECT</html:option>
						<html:optionsCollection property="frmRegSpecializeList" value="id"
							label="specializetype" />
					</html:select> <html:errors property="specializeError" /></td>
				<td><font color="red">***</font></td>
			</tr>

			<tr>
				<td>&nbsp;&nbsp;</td>
				<td>&nbsp;&nbsp;</td>
				<td>&nbsp;&nbsp;</td>

			</tr>


			<tr>
				<th>Doctor Name:</th>
				<td><html:text property="frmRegName" styleClass="form-control" maxlength="29" size="30"></html:text>
					<html:errors property="frmRegName" /></td>
				<td><font color="red">***</font></td>
			</tr>
			<tr>
				<td>&nbsp;&nbsp;</td>
				<td>&nbsp;&nbsp;</td>
				<td>&nbsp;&nbsp;</td>

			</tr>


			<tr>
				<th>Email:</th>
				<td><html:text property="frmRegEmail" styleClass="form-control" maxlength="29" size="30"></html:text>
					<html:errors property="EmailError" /> <html:errors
						property="frmRegEmail" /></td>
				<td><font color="red">***</font></td>
			</tr>
			<tr>
				<td>&nbsp;&nbsp;</td>
				<td>&nbsp;&nbsp;</td>
				<td>&nbsp;&nbsp;</td>


			</tr>

			<tr>
				<th>Password:</th>
				<td><html:password property="frmRegPassword"
						styleClass="form-control" maxlength="31" size="32"></html:password> <html:errors
						property="frmRegPassword" /></td>
				<td><font color="red">***</font></td>
			</tr>

			<tr>
				<td>&nbsp;&nbsp;</td>
				<td>&nbsp;&nbsp;</td>
				<td>&nbsp;&nbsp;</td>

			</tr>
			<tr>
				<th>Confirm Password:</th>
				<td><html:password property="frmRegConfPassword"
						styleClass="form-control" maxlength="31" size="32">
					</html:password> <html:errors property="passwordError" /> <html:errors
						property="frmRegConfPassword" /></td>
				<td><font color="red">***</font></td>
			</tr>
			<tr>
				<td>&nbsp;&nbsp;</td>
				<td>&nbsp;&nbsp;</td>
				<td>&nbsp;&nbsp;</td>

			</tr>



			<tr>
				<th>Phone:</th>
				<td><html:text property="frmadminRegPhone"
						styleClass="form-control" maxlength="19" size="20"></html:text> <html:errors
						property="frmadminRegPhone" /></td>
				<td><font color="red">***</font></td>
				<td><font color="blue">(0x-xxxxxxxxxxx)</font></td>
			</tr>
			<tr>
				<td>&nbsp;&nbsp;</td>
				<td>&nbsp;&nbsp;</td>
				<td>&nbsp;&nbsp;</td>

			</tr>
			<tr>
				<th>Gender:</th>
				<td><html:radio property="frmRegGender" value="Male">Male
				</html:radio> <html:radio property="frmRegGender" value="Female">Female
				</html:radio> <html:errors property="frmRegGender" /></td>
				<td><font color="red">***</font></td>
			</tr>
			
			<tr>
				<td>&nbsp;&nbsp;</td>
				<td>&nbsp;&nbsp;</td>
				<td>&nbsp;&nbsp;</td>

			</tr>
			<tr>
				<th>Address:</th>
				<td><html:textarea property="frmRegAddress"
						styleClass="form-control" style="resize: none;">
					</html:textarea></td>
				<td>&nbsp;&nbsp;</td>
			</tr>


			<tr>
				<td>&nbsp;&nbsp;</td>
				<td>&nbsp;&nbsp;</td>
				<td>&nbsp;&nbsp;</td>


			</tr>
			<tr>
				<td>&nbsp;&nbsp;</td>
				<td colspan="2" align="center"><html:submit
						property="btnRegister" value="Register" styleClass="btn btn-info">
					</html:submit> <html:cancel value="Cancel" styleClass="btn btn-info">
					</html:cancel></td>
				<td>&nbsp;&nbsp;</td>
			</tr>

		</table>
	</logic:empty>


	<!-- Confirmation portion here -->
	<logic:notEmpty property="frmRegFormControl" name="DoctorRegFormBean">
	<h3 align="center"><font color="green">Confirm Doctor Registration</font></h3> <br>
		<table align="center">


			<tr>
				<th>Specialize:</th>
				<td><html:text property="frmRegSpecialize" disabled="true"
						styleClass="form-control">
					</html:text></td>
			</tr>
			<tr>
				<td>&nbsp;&nbsp;</td>
				<td>&nbsp;&nbsp;</td>


			</tr>


			<tr>
				<th>Doctor Name:</th>
				<td><html:text property="frmRegName" disabled="true"
						styleClass="form-control" maxlength="29" size="30">
					</html:text></td>
			</tr>
			<tr>
				<td>&nbsp;&nbsp;</td>
				<td>&nbsp;&nbsp;</td>


			</tr>
			<tr>
				<th>Email:</th>
				<td><html:text property="frmRegEmail" disabled="true"
						styleClass="form-control" maxlength="29" size="30">
					</html:text></td>
			</tr>
			<tr>
				<td>&nbsp;&nbsp;</td>
				<td>&nbsp;&nbsp;</td>


			</tr>
		

			<tr>
				<th>Password:</th>
				<td><html:password property="frmRegPassword" disabled="true"
						styleClass="form-control" maxlength="31" size="32"></html:password> <html:errors
						property="frmRegPassword" /></td>
			
			</tr>

			<tr>
				<td>&nbsp;&nbsp;</td>
				<td>&nbsp;&nbsp;</td>
				

			</tr>
			<tr>
				<th>Confirm Password:</th>
				<td><html:password property="frmRegConfPassword" disabled="true"
						styleClass="form-control" maxlength="31" size="32">
					</html:password> <html:errors property="passwordError" /> <html:errors
						property="frmRegConfPassword" /></td>
				
			</tr>
			<tr>
				<td>&nbsp;&nbsp;</td>
				<td>&nbsp;&nbsp;</td>


			</tr>

			<tr>
				<th>Phone:</th>
				<td><html:text property="frmadminRegPhone" disabled="true"
						styleClass="form-control" maxlength="19" size="20">
					</html:text></td>
			</tr>
		
			<tr>
				<td>&nbsp;&nbsp;</td>
				<td>&nbsp;&nbsp;</td>


			</tr>

			<tr>
				<th>Gender:</th>
				<td><html:radio property="frmRegGender" value="Male"
						disabled="true">Male
					</html:radio> <html:radio property="frmRegGender" value="Female" disabled="true">
					Female</html:radio></td>
			</tr>
			
			<tr>
				<th>Address:</th>
				<td><html:textarea property="frmRegAddress" disabled="true"
						styleClass="form-control" style="resize: none;">
					</html:textarea></td>
				
			</tr>
			<tr>
				<td>&nbsp;&nbsp;</td>
				<td>&nbsp;&nbsp;</td>


			</tr>
			
			<tr>
			<td>&nbsp;&nbsp;</td>
				<td colspan="2" align="center"><html:submit property="btnSave"
						value="Save" styleClass="btn btn-info">
					</html:submit> <html:submit property="btnSaveCancel" value="Cancel"
						styleClass="btn btn-info">
					</html:submit></td>
			</tr>
		</table>
	</logic:notEmpty>
</html:form>
<br>
<%@ include file="inc/footer.jsp"%>

<%@ include file="inc/common.jsp"%>
<%@ include file="inc/headerhome.jsp"%>
<br />
<div class="panel-body col-sm-12" align="center">
	<div class="col-sm-3"></div>
	<div class="col-sm-6">

		<h3 align="center">
			<font color="green">Hospital Detail</font>
		</h3>
		<br />
		<html:form action="/HospitalUpdate">
			<logic:empty property="frmControl" name="HospitalUpdateFormBean">
				

				<table align="center" border="0">
					<tbody>
						<tr>
							<th>Hospital Name : &nbsp;</th>
							<td colspan="2"><html:text property="frmHospName"
									styleClass="form-control" maxlength="29" size="30"></html:text></td>
							<td><font color="red">***</font></td>
						</tr>
						<tr>
							<td>&nbsp;</td>
							<td><html:errors property="frmHospName" /></td>
						</tr>
						<tr>
							<td>&nbsp;</td>
							<td>&nbsp;</td>
							<td>&nbsp;</td>
							<td>&nbsp;</td>
						</tr>
						<tr>
							<th>Address:</th>
							<td colspan="2"><html:textarea property="frmHospAddress"
									style="resize: none;" styleClass="form-control"></html:textarea></td>
							<td><font color="red">***</font></td>
						</tr>
						<tr>
							<td>&nbsp;</td>
							<td><html:errors property="frmHospAddress" /></td>
						</tr>
						<tr>
							<td>&nbsp;</td>
							<td>&nbsp;</td>
							<td>&nbsp;</td>
							<td>&nbsp;</td>
						</tr>
						<tr>
							<td></td>
							<td align="center"><html:submit property="btnUpdate"
									value="Update" styleClass="btn btn-info"></html:submit></td>
							<td><html:cancel value="Cancel" styleClass="btn btn-info"></html:cancel></td>
							<td></td>

						</tr>
					</tbody>
				</table>
			</logic:empty>

			<logic:notEmpty property="frmControl" name="HospitalUpdateFormBean">
				<table align="center" border="0">
					<tr>
						<th>Hospital Name : &nbsp;</th>
						<td colspan="2"><html:text property="frmHospName"
								disabled="true" styleClass="form-control" maxlength="29"
								size="30"></html:text></td>
					</tr>
					<tr>
						<td>&nbsp;&nbsp;</td>
						<td colspan="2">&nbsp;&nbsp;</td>
					</tr>
					<tr>
						<th>Address:</th>
						<td colspan="2"><html:textarea property="frmHospAddress"
								disabled="true" cols="23" rows="5" styleClass="form-control"
								style="resize: none;"></html:textarea></td>
					</tr>
					<tr>
						<td>&nbsp;&nbsp;</td>
						<td colspan="2">&nbsp;&nbsp;</td>
					</tr>
					<tr>
						<td>&nbsp;&nbsp;</td>
						<td align="center"><html:submit property="btnSave"
								value="Save" styleClass="btn btn-info"></html:submit></td>
						<td><html:submit property="btnSaveCancel" value="Cancel"
								styleClass="btn btn-info"></html:submit></td>
					</tr>
				</table>
			</logic:notEmpty>
		</html:form>

	</div>
</div>
<%@ include file="inc/footer.jsp"%>





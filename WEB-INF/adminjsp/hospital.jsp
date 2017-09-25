<%@ include file="inc/common.jsp"%>
<%@ include file="inc/headerhome.jsp"%>
<br /><br />


<html:form action="/hospitalReg" method="post"
	enctype="multipart/form-data">
	<logic:empty property="frmRegFormControl" name="HospAddFormBean">

<h3 align="center">
	<font color="green">Add Hospital</font>
</h3>
<br>
		<table align="center" border="0">
			<tr>
				<th>Hospital Name : &nbsp;</th>
				<td colspan="2"><html:text property="frmRegName" styleClass="form-control" maxlength="29" size="30"></html:text></td>
				<td><font color="red">***</font></td>
			</tr>
			<tr>
				<td></td>
				<td colspan="2"><html:errors property="frmRegName" /> <html:errors
						property="nameError" /></td>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td>&nbsp;</td>
				<td colspan="2">&nbsp;</td>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<th>Address:</th>
				<td colspan="2"><html:textarea property="frmRegAddress"
						style="resize: none;" styleClass="form-control"></html:textarea></td>
				<td><font color="red">***</font></td>
				
			</tr>
			<tr>
				<td></td>
				<td colspan="2"><html:errors property="frmRegAddress" /></td>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td>&nbsp;</td>
				<td colspan="2">&nbsp;</td>
				<td>&nbsp;</td>
			</tr>

			<tr>
				<td>&nbsp;</td>
				<td align="center">
				<html:submit property="btnRegister"	value="Add" styleClass="btn btn-info"></html:submit>
				</td>
				<td align="center">
					 <html:cancel value="Cancel" styleClass="btn btn-info">
					</html:cancel></td>
				<td> &nbsp; </td>
			</tr>


		</table>
	</logic:empty>
	<!-- Confirmation portion here -->
	<logic:notEmpty property="frmRegFormControl" name="HospAddFormBean">
	
	<h3 align="center">
	<font color="green">Ares you sure to add this
				fields?</font>
</h3>
<br>
		<table align="center" border="0">
			<tr>
				<td>Hospital Name : &nbsp; </td>
				<td colspan="2"><html:text property="frmRegName" disabled="true"
						styleClass="form-control" maxlength="29" size="30">
					</html:text></td>
					<td>&nbsp;</td>
			</tr>
			<tr>
				<td>&nbsp;</td>
				<td colspan="2">&nbsp;</td>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td>Address:</td>
				<td colspan="2"><html:textarea property="frmRegAddress" disabled="true"
						style="resize: none;" styleClass="form-control">
					</html:textarea></td>
					<td>&nbsp;</td>
			</tr>
			<tr>
				<td>&nbsp;</td>
				<td colspan="2">&nbsp;</td>
				<td>&nbsp;</td>
			</tr>

			<tr>
				<td>&nbsp;</td>
				<td align="center"><html:submit property="btnSave"
						value="Save" styleClass="btn btn-info">
					</html:submit>
					</td>
					<td> <html:submit property="btnSaveCancel" value="Cancel"
						styleClass="btn btn-info">
					</html:submit></td>
					<td> &nbsp; </td>
			</tr>

		</table>
	</logic:notEmpty>
</html:form>
<br>
<br>
<br>
<br>
<%@ include file="inc/footer.jsp"%>

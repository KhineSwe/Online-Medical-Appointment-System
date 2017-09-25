<%@ include file="inc/common.jsp"%>
<%@ include file="inc/headerafterlogin.jsp"%>
<body>

	<div class="container">
		<%-- 	<html:form action="/hospitallistDetailPath"> --%>


		<div class="row">
			<div class="panel panel-success">
				<div class="panel-heading">Record Treatment</div>
				<html:form action="/recordTreatmentPath"><br>
					<logic:empty property="frmrecordFormControl"
						name="AppointmentFormBean">
						<table align="center">
							<tr>
								<th>Disease:</th>
								<td><html:text property="frmDisease"
										styleClass="form-control" maxlength="29" size="30"></html:text><font color="red"> <html:errors
										property="nodiseaseerror" /></font></td>
								<td><font color="red">***</font></td>
							</tr>
							<tr>
								<td>&nbsp;</td>
								<td>&nbsp;</td>
								<td>&nbsp;</td>
							</tr>
							<tr>
								<th>Treatment:</th>
								<td><html:textarea property="frmTreatment" cols="18"
										rows="4" style="resize: none;" styleClass="form-control"></html:textarea>
									<font color="red"><html:errors property="notreatmenterror" /></font></td>
								<td><font color="red">***</font></td>
							</tr>
							<tr>
								<td>&nbsp;</td>
								<td>&nbsp;</td>
								<td>&nbsp;</td>
							</tr>
							<tr>
								<th>Doctor Note:</th>
								<td><html:textarea property="frmDenote" cols="18" rows="2"
										style="resize: none;" styleClass="form-control"></html:textarea></td>
										<td>&nbsp;</td>
							</tr>
							<tr>
								<td>&nbsp;</td>
								<td>&nbsp;</td>
								<td>&nbsp;</td>
							</tr>

							<tr>
							<td>&nbsp;</td>
								<td  align="center"><html:submit
										property="btnRecord" value="Record" styleClass="btn btn-info">
									</html:submit> <html:cancel value="Cancel" styleClass="btn btn-info"></html:cancel></td>
									<td>&nbsp;</td>
									
							</tr>

						</table>
					</logic:empty>
					<!-- Confirmation portion here -->
					<logic:notEmpty property="frmrecordFormControl"
						name="AppointmentFormBean">
						<table align="center">
							<tr>
								<th>Disease:</th>
								<td><html:text property="frmDisease" disabled="true"
										styleClass="form-control"></html:text><font color="red"> <html:errors
										property="frmDisease" /></font></td>
								<td><font color="red">***</font></td>
							</tr>
							<tr>
								<td>&nbsp;</td>
								<td>&nbsp;</td>
								<td>&nbsp;</td>
							</tr>
							<tr>
								<th>Treatment:</th>
								<td><html:textarea property="frmTreatment" cols="25"
										rows="4" disabled="true" styleClass="form-control" style="resize: none;"></html:textarea>
									<font color="red"><html:errors property="frmTreatment" /></font></td>
								<td><font color="red">***</font></td>
							</tr>
							<tr>
								<td>&nbsp;</td>
								<td>&nbsp;</td>
								<td>&nbsp;</td>
							</tr>
							<tr>
								<th>Doctor Note:</th>
								<td><html:textarea property="frmDenote" cols="25" rows="2"
										disabled="true" styleClass="form-control" style="resize: none;"></html:textarea></td>
										<td>&nbsp;</td>
							</tr>
							<tr>
								<td>&nbsp;</td>
								<td>&nbsp;</td>
								<td>&nbsp;</td>
							</tr>

							<tr>
							<td>&nbsp;</td>
								<td  align="center"><html:submit
										property="btnSave" value="Save" styleClass="btn btn-info">
									</html:submit> <html:submit property="btnSaveCancel" value="Cancel" styleClass="btn btn-info">
									</html:submit></td>
									<td>&nbsp;</td>
							</tr>
						</table>
					</logic:notEmpty>
				</html:form>

			</div>
		</div>

	</div>


	<%@ include file="inc/footer.jsp"%>

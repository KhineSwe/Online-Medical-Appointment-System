<%@ include file="inc/common.jsp"%>
<%@ include file="inc/headerafterlogin.jsp"%>
<body>
	<div class="container">



		<div class="row">
			<div class="panel panel-info">
				<div class="panel-heading">Please leave a message here to
					contact us!!!.</div>
				<div class="panel-body col-sm-6">

					<table class="table table-hover">
						<tbody>
							<tr class="success">
								<th colspan="2" style="text-align: center;">
									<h4>Phone / Address</h4>
								</th>
							</tr>
							<tr>
								<th>Office :</th>
								<td>OMAS : Online Medical Appointment System</td>
							</tr>
							<tr>
								<th>Address :</th>
								<td>ICTTI <br> Parami Road <br> Hlaing
									Township,Yangon, Myanmar.
								</td>
							</tr>
							<tr>
								<th>Tel :</th>
								<td>951-377948,951-377949</td>
							</tr>
							<tr>
								<th>City/Country :</th>
								<td>Yangon / Myanmar</td>
							</tr>
						</tbody>
					</table>
				</div>
				<div class="panel-body col-sm-6">

					<div>
						<html:form action="/docContactMailPathafterlogin">

							<table align="center" width="100%">
								<tr>
									<td></td>
									<td><font color="blue"><b>${MailFormBean.frmMailNotiMessage}</b></font></td>
								</tr>

								<tr>
									<td colspan="3" align="center"><html:errors
											property="nullMailNameAddressMsg" /> <html:errors
											property="nullMailNameMsg" /> <html:errors
											property="nullMailAddMsg" /></td>
								</tr>
								<tr>
									<th>Name:</th>
									<td><html:text property="frmMailName" size="25"
											styleClass="form-control" /></td>
									<td><font color=red>***</font></td>
								</tr>
								<tr>
									<td>&nbsp;</td>
									<td>&nbsp;</td>
									<td>&nbsp;</td>
								</tr>

								<tr>
									<th>Admin Email:</th>
									<td><html:text property="frmMailAdd" size="25"
											styleClass="form-control"
											value="ps18-thidarkhine@ictti.site"
											readonly="true" /></td>
									<td>&nbsp;</td>
								</tr>
								<tr>
									<td>&nbsp;</td>
									<td>&nbsp;</td>
									<td>&nbsp;</td>
								</tr>

								<tr>
									<th>Message:</th>
									<td><html:textarea property="frmMailMsg" rows="8"
											cols="28" styleClass="form-control" style="resize: none;" />
									</td>
									<td><font color=red>***</font></td>
								</tr>
								<tr>
									<td>&nbsp;</td>
									<td>&nbsp;</td>
									<td>&nbsp;</td>
								</tr>

								<tr>
									<td></td>
									<td colspan="2" align="left"><html:submit property="btnMailSend"
											value="Send Mail" styleClass="btn btn-info">
										</html:submit></td>

								</tr>
							</table>

						</html:form>

					</div>
				</div>
			</div>
		</div>
	</div>







	<%@ include file="inc/footer.jsp"%>
</body>
</html>

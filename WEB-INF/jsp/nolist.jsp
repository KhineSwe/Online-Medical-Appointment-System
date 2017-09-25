<%@ include file="inc/common.jsp"%>
<%@ include file="inc/headforHospitalAjax.jsp"%>
<%@ include file="inc/headerhome.jsp"%>


		<div class="container">
			<body onload="DWRUtil.useLoadingMessage(); createAutoCompleter()">
				<div class="row">
					<h3>Treatment List By Hospital</h3>

						<div class="panel-body col-sm-12" align="center">
							<div class="col-sm-2"></div>
							<div class="col-sm-8">
								<html:form action="/searchbyHospital">

									<table align="center" name="TreatmentSearchFormBean">
										<tr>
											<th>Hospital Name:</th>
											<td>&nbsp;&nbsp;</td>
											<td><html:text property="frmHospitalName"
													styleId="frmHospital1" styleClass="form-control"
													maxlength="29" size="30" />
												<div class="choices" id="choices1"></div></td>
												<td>&nbsp;&nbsp;</td>
											<td><html:submit property="search" value="Search"
													styleClass="btn btn-info">
												</html:submit></td>
										</tr>
									</table>
								</html:form>


								<center>
									<h4>
										<font color=red>Sorry, You don't have any treatment list at the moment.</font>
									</h4>
								</center>

							</div>
						</div>
				</div>
	</body>
	</div>




			<%@ include file="inc/footer.jsp"%>


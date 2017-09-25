<%@include file="inc/common.jsp"%>
<%@ include file="inc/headerhome.jsp"%>
<%@ include file="inc/headforCategory.jsp"%>



<body onload="DWRUtil.useLoadingMessage();">
	<div class="container">

		<div class="row">

				<div class="panel-body col-sm-2"></div>
				<div class="panel-body col-sm-8">




					<html:form action="/doctorPath" method="post">

						<center>
							<h3 style="color: green">Search Doctor</h3>
							<img src="myimage/Search.jpg">
						</center><br />

						<table align="center" class="t1">
						<center> <html:errors property="ChooseHospitalDoctor" /></center>
							<tr>
								<td>Hospital</td>
								<td width="200"><html:select property="frmHosId"
										onchange="sendHospital(this[this.selectedIndex].value)"
										styleClass="form-control">
										<html:option value="0">---Choose---</html:option>
										<html:optionsCollection property="hospitalChoice" />
									</html:select> <br /></td>

							</tr>

							<tr>
								<td>Specialized Field</td>
								<td width="200"><html:select property="frmSpecId"
										styleId="specializelist" styleClass="form-control">
										<html:option value="0">---Choose---</html:option>>
											<logic:notEmpty property="frmSpeclist" name="AutoFormBean">
											<html:optionsCollection property="frmSpeclist" value="id"
												label="specializetype" />

										</logic:notEmpty>

									</html:select></td>

							</tr>

							<tr>
								<td>&nbsp;</td>
								<td>&nbsp;</td>
							</tr>
							<tr>
								<td></td>
								<td><html:submit property="btnSearch" value="Search"
										styleClass="btn btn-success btn-block"></html:submit></td>


								<center>
									<html:errors property="nullDoctorList" />
								</center>
							</tr>
						</table>
					</html:form>

				</div>
				<div class="panel-body col-sm-2"></div>


		</div>
	</div>


	<%@ include file="inc/footer.jsp"%>
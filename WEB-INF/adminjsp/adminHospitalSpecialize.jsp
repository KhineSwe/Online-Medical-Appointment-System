<%@include file="inc/common.jsp"%>

<%@ include file="inc/headerhome.jsp"%>
<%@ include file="inc/headforHosSpecAjax.jsp"%>

<div class="container col-sm-9">
	<div class="row">
	
<body onload="DWRUtil.useLoadingMessage();">

			<!-- <div class="panel panel-success"> 
			 -->

			
			<div class="panel-body col-sm-12" align="center">




				<html:form action="/admindoctorPath" method="post">
				

					<center>
						<h3 style="color: green">Create Schedule</h3>
						<img src="myimage/calendar1.png">
					</center>
					<br>
					<br>

					<table align="center" class="t1">
					<center><html:errors property="ChooseHospitalDoctor" /></center>
						<tr>

							<th>Hospital</th>
							<td width="200"><html:select property="frmHosId"
									onchange="sendHospital(this[this.selectedIndex].value)"
									styleClass="form-control">
									<html:option value="0">---Choose---</html:option>


									<html:optionsCollection property="hospitalChoice1" />

								</html:select>
								</td>


						</tr>
						<tr>
							<td>&nbsp;</td>
						</tr>

						<tr>
							<th>Specialized Field:</th>
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

							
						</tr>
					</table>
				</html:form>
			</div>


	<!-- </div>
 -->

</body>
</div>
</div>




	<%@ include file="inc/footer.jsp"%>

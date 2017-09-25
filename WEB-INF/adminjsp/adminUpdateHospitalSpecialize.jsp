<%@include file="inc/common.jsp"%>
<%@ include file="inc/headerhome.jsp"%>

<script type="text/javascript">
	function sendHospital(hospitalId) {
		AjaxSearchSpecialize.getBySpecialize(hospitalId, callbackCat);
	}

	function callbackCat(message) {
		dwr.util.removeAllOptions("specializelist");
		dwr.util.addOptions("specializelist", message, "id", "specializetype");
	}
</script>
<script type="text/javascript" src="js/prototype.js"></script>
<script type="text/javascript" src="js/effects.js"></script>
<script type="text/javascript" src="js/controls.js"></script>
<script type="text/javascript" src="js/scriptaculous.js"></script>
<script type='text/javascript' src="js/autocompleteex.js"></script>
<script src='dwr/engine.js'></script>
<script src='dwr/util.js'></script>
<script src='dwr/interface/AjaxSearchSpecialize.js'></script>

<div class="container col-sm-9">
	<div class="row">
	
<body onload="DWRUtil.useLoadingMessage();">


			<div class="panel-body col-sm-12" align="center">




				<html:form action="/admindoctorPath1" method="post">

					<center>
						<h3 style="color: green">Update Schedule</h3>
						<img src="myimage/calendar1.png">
					</center>
					<br>
					<br>

					<table align="center" class="t1">
					<center><html:errors property="ChooseHospitalDoctor" /></center>
					
						<tr>
							<th>Hospital:</th>
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
</body>


		</div>
	</div>






	<%@ include file="inc/footer.jsp"%>
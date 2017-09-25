<%@ include file="inc/common.jsp"%>
<%@ include file="inc/headforDoctorAjax.jsp"%>
<%@ include file="inc/headerhome.jsp"%>

		<div class="container">			
				<div class="row">
				
				<body onload="DWRUtil.useLoadingMessage(); createAutoCompleter()">
					<h3>Treatment List By Doctor</h3>

						<div class="panel-body col-sm-12" align="center">
							<div class="col-sm-2"></div>
							<div class="col-sm-8">
								<html:form action="/searchbyDoctor">

									<table align="center" name="SearchByDoctorNameFormBean">
										<tr>
											<th>Doctor Name:</th>
											<td>&nbsp;&nbsp;</td>
											<td><html:text property="frmDoctorName"
													styleId="frmDoctor1" styleClass="form-control" 
													maxlength="29" size="30"/>
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
						
						</body>
				</div>
				
				</div>


			<%@ include file="inc/footer.jsp"%>


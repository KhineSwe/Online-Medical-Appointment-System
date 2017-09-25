<%@ include file="inc/common.jsp"%>
<%@ include file="inc/headerafterlogin.jsp"%>


		<div class="container">
			<html:form action="/treatmentPatientNameSearchPath">


				<div class="row">
						<h3>Treatment Detail</h3>

						<div class="panel-body col-sm-12" align="center">
							<div class="col-sm-2"></div>
							<div class="col-sm-8">

								<table align="center" style="border-collapse: collapse;text-align:justify;"
									class="table table-hover" align="center" >
									<tr>
										<th>Patient Name:</th>
										<td>${TreatmentPatientSearchFormBean.frmPatientListDetail.pname}</td>
									</tr>
									<tr>
										<th>Blood Type:</th>
										<td>${TreatmentPatientSearchFormBean.frmPatientListDetail.pblood}</td>
									</tr>
									<tr>
										<th>Treatment Date:</th>
										<td>${TreatmentPatientSearchFormBean.frmPatientListDetail.treatmentdt}</td>
									</tr>
									<tr>
										<th>Disease:</th>
										<td>${TreatmentPatientSearchFormBean.frmPatientListDetail.disease}</td>
									</tr>
									<tr>
										<th>Treatment:</th>
										<td>${TreatmentPatientSearchFormBean.frmPatientListDetail.treatment}</td>
									</tr>
									<tr>
										<th>Doctor Note :</th>
										<td>${TreatmentPatientSearchFormBean.frmPatientListDetail.dnote}</td>
									</tr>

									<tr>
										<td colspan="2" align="center"><html:submit
												property="btnOk" value="OK" styleClass="btn btn-primary"></html:submit></td>
									</tr>
								</table>
							</div>	<div class="col-sm-4"></div>
							
						</div>
				</div>
				
				

			</html:form>
	
	
	<%@ include file="inc/footer.jsp"%>
</body>
</html>


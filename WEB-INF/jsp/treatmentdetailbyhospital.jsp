<%@ include file="inc/common.jsp"%>
<%@ include file="inc/headforDoctorAjax.jsp"%>
<%@ include file="inc/headerhome.jsp"%>


<div class="container">
	
			


					<div class="row">
							<h3>Treatment Detail By Hospital</h3>

							<div class="panel-body col-sm-12" align="center">
								<div class="col-sm-2"></div>
								<div class="col-sm-8">
									<html:form action="/treatmentPath">

									<table align="center" style="border-collapse: collapse"
										class="table table-hover" align="center">
										<tr>
											<th>Patient Name:</th>
											<td>${TreatmentSearchFormBean.frmTreatmentDetail.pname}</td>
										</tr>

										<tr>
											<th>Hospital Name:</th>
											<td>${TreatmentSearchFormBean.frmTreatmentDetail.hosname}</td>
										</tr>
										<tr>
											<th>Doctor:</th>
											<td>${TreatmentSearchFormBean.frmTreatmentDetail.dname}</td>
										</tr>

										<tr>
											<th>Specialize Type:</th>
											<td>${TreatmentSearchFormBean.frmTreatmentDetail.specializetype}</td>
										</tr>



										<tr>
											<th>Disease :</th>
											<td>${TreatmentSearchFormBean.frmTreatmentDetail.disease}</td>
										</tr>


										<tr>
											<th>Doctor Note :</th>
											<td>${TreatmentSearchFormBean.frmTreatmentDetail.dnote}</td>
										</tr>

										<tr>
											<th>Treatment Date:</th>
											<td>${TreatmentSearchFormBean.frmTreatmentDetail.treatmentdt}</td>
										</tr>

										<tr>
											<th>Treatment For :</th>
											<td>${TreatmentSearchFormBean.frmTreatmentDetail.treatment}</td>
										</tr>

										
										<tr>
											<td colspan="2" align="center"><html:submit
													property="btnOk" value="OK" styleClass="btn btn-info"></html:submit></td>
										</tr>
									</table>
									
				</html:form>
								</div>

							</div>
						
					</div>

			</div>


<br>
<br>
<br>
<br>


<%@ include file="inc/footer.jsp"%>



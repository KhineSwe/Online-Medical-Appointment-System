<%@ include file="inc/common.jsp"%>
<%@ include file="inc/headforDoctorAjax.jsp"%>
<%@ include file="inc/headerhome.jsp"%>

<div class="container">
	


		<div class="row">
				<h3>Treatment Detail By Doctor</h3>

				<div class="panel-body col-sm-12" align="center">
					<div class="col-sm-2"></div>
					<div class="col-sm-8">
					<html:form action="/searchbydoctorPath">

						<table align="center" style="border-collapse: collapse"
							class="table table-hover" align="center">
							<tr>
								<th>Patient Name:</th>
								<td>${SearchByDoctorNameFormBean.frmDoctorListDetail.pname}</td>
							</tr>

							<tr>
								<th>Hospital Name:</th>
								<td>${SearchByDoctorNameFormBean.frmDoctorListDetail.hosname}</td>
							</tr>
							<tr>
								<th>Doctor:</th>
								<td>${SearchByDoctorNameFormBean.frmDoctorListDetail.dname}</td>
							</tr>

							<tr>
								<th>Specialize Type:</th>
								<td>${SearchByDoctorNameFormBean.frmDoctorListDetail.specializetype}</td>
							</tr>



							<tr>
								<th>Disease :</th>
								<td>${SearchByDoctorNameFormBean.frmDoctorListDetail.disease}</td>
							</tr>


							<tr>
								<th>Doctor Note :</th>
								<td>${SearchByDoctorNameFormBean.frmDoctorListDetail.dnote}</td>
							</tr>

							<tr>
								<th>Treatment Date:</th>
								<td>${SearchByDoctorNameFormBean.frmDoctorListDetail.treatmentdt}</td>
							</tr>

							<tr>
								<th>Treatment For :</th>
								<td>${SearchByDoctorNameFormBean.frmDoctorListDetail.treatment}</td>
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



<%@ include file="inc/footer.jsp"%>



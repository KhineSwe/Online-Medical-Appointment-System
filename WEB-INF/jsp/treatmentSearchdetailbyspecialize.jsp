<%@ include file="inc/common.jsp"%>
<%@ include file="inc/headforSpecializeAjax.jsp"%>
<%@ include file="inc/headerhome.jsp"%>

<div class="container">
	


		<div class="row">
				<h3>Treatment Detail By Specialize</h3>

				<div class="panel-body col-sm-12" align="center">
					<div class="col-sm-2"></div>
					<div class="col-sm-8">
					<html:form action="/searchbySpecialize">

						<table align="center" style="border-collapse: collapse"
							class="table table-hover" align="center">
							<tr>
								<th>Patient Name:</th>
								<td>${SearchAjaxBySpecializeFormBean.frmTreatmentSpecializeDetail.pname}</td>
							</tr>

							<tr>
								<th>Hospital Name:</th>
								<td>${SearchAjaxBySpecializeFormBean.frmTreatmentSpecializeDetail.hosname}</td>
							</tr>
							<tr>
								<th>Doctor:</th>
								<td>${SearchAjaxBySpecializeFormBean.frmTreatmentSpecializeDetail.dname}</td>
							</tr>

							<tr>
								<th>Specialize Type:</th>
								<td>${SearchAjaxBySpecializeFormBean.frmTreatmentSpecializeDetail.specializetype}</td>
							</tr>



							<tr>
								<th>Disease :</th>
								<td>${SearchAjaxBySpecializeFormBean.frmTreatmentSpecializeDetail.disease}</td>
							</tr>


							<tr>
								<th>Doctor Note :</th>
								<td>${SearchAjaxBySpecializeFormBean.frmTreatmentSpecializeDetail.dnote}</td>
							</tr>

							<tr>
								<th>Treatment Date:</th>
								<td>${SearchAjaxBySpecializeFormBean.frmTreatmentSpecializeDetail.treatmentdt}</td>
							</tr>

							<tr>
								<th>Treatment For :</th>
								<td>${SearchAjaxBySpecializeFormBean.frmTreatmentSpecializeDetail.treatment}</td>
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


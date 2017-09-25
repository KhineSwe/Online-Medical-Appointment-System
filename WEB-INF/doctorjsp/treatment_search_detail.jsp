<%@ include file="inc/common.jsp"%>
<%@ include file="inc/headerafterlogin.jsp"%>
<body>

		<div class="container">
			<html:form action="/treatmentlistDetailPath">


				<div class="row">
						<h3>Treatment Detail</h3>

						<div class="panel-body col-sm-12" align="center">
							
							<div class="col-sm-2"></div>
							<div class="col-sm-8">

							<table style="border-collapse: collapse" class="table table-hover"
							border="0" align="center">
							<tr class="success">
										<th>Patient Name:</th>
										<td>${DoctorTreatmentSearchFormBean.frmTreatmentListDetail.pname}</td>
									</tr>
									<tr>
										<th>Blood Type:</th>
										<td>${DoctorTreatmentSearchFormBean.frmTreatmentListDetail.pblood}</td>
									</tr>
									<tr>
										<th>Treatment Date:</th>
										<td>${DoctorTreatmentSearchFormBean.frmTreatmentListDetail.treatmentdt}</td>
									</tr>
									<tr>
										<th>Disease:</th>
										<td>${DoctorTreatmentSearchFormBean.frmTreatmentListDetail.disease}</td>
									</tr>
									<tr>
										<th>Treatment:</th>
										<td>${DoctorTreatmentSearchFormBean.frmTreatmentListDetail.treatment}</td>
									</tr>
									<tr>
										<th>Doctor Note :</th>
										<td>${DoctorTreatmentSearchFormBean.frmTreatmentListDetail.dnote}</td>
									</tr>

									<tr>
										<td colspan="2" align="center"><html:submit
												property="btnOk" value="OK" styleClass="btn btn-primary"></html:submit></td>
									</tr>
								</table>
							</div>
							<div class="col-sm-4"></div>
						</div>
				</div>

			</html:form>
		</td>
		</tr>
	</table>

	<%@ include file="inc/footer.jsp"%>
</body>
</html>


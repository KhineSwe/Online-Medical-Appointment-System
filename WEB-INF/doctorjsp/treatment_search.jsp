<%@ include file="inc/common.jsp"%>
<%@ include file="inc/headerafterlogin.jsp"%>
<body onload="DWRUtil.useLoadingMessage(); createAutoCompleter()">

	<div class="container">
		<div class="row">

			<div class="panel-body col-sm-12" align="center">
				<div class="col-sm-2"></div>
				<div class="col-sm-8">
					<html:form action="/treatmentPatientNameSearchPath">

						<table align="center" name="DoctorTreatmentSearchFormBean">
							<tr>
								<th>Patient Name:</th>
								<td>&nbsp;&nbsp;</td>
								<td><html:text property="frmTreatmentName"
										styleId="frmTreatmentName1" styleClass="form-control"
										maxlength="29" size="30" />
									<div class="choices" id="choices1" style="z-index: 100;"></div></td>
								<td>&nbsp;&nbsp;</td>
								<td><html:submit property="search" value="Search"
										styleClass="btn btn-info">
									</html:submit></td>
							</tr>
						</table>
					</html:form>
					<html:errors property="nopatienterror" />

				</div>
			</div>
		</div>


		<html:form action="/treatmentlistPath">
			<logic:notEmpty property="frmTreatmentList"
				name="DoctorTreatmentSearchFormBean">
				<div class="panel-body col-sm-12" align="center">

					<!-- <div class="col-sm-1"></div> -->
					<div class="col-sm-12">
						<h4>
							<font color="green">Number of Treatment Record :<b>
									${DoctorTreatmentSearchFormBean.frmTreatmentList.size()}</b></font>
						</h4>
						<br>
						<table style="border-collapse: collapse" class="table table-hover table-responsive"
							border="0" align="center">
							<tr class="success">
								<th>No</th>
								<th>Patient Name</th>
								<th>Disease</th>
								<th>Gender</th>
								<th>Blood Type</th>
								<th>Hospital Name</th>
								<th>Treatment Date</th>
								<td></td>

							</tr>
							<c:forEach var="i" begin="${DoctorTreatmentSearchFormBean.begin}"
								end="${DoctorTreatmentSearchFormBean.end}" step="1">

								<tr>
									<td>${i}</td>
									<td>${DoctorTreatmentSearchFormBean.frmTreatmentList[i-1].pname}</td>
									<td>${DoctorTreatmentSearchFormBean.frmTreatmentList[i-1].disease}</td>
									<td>${DoctorTreatmentSearchFormBean.frmTreatmentList[i-1].pgender}</td>
									<td>${DoctorTreatmentSearchFormBean.frmTreatmentList[i-1].pblood}</td>
									<td>${DoctorTreatmentSearchFormBean.frmTreatmentList[i-1].hosname}</td>
									<td>${DoctorTreatmentSearchFormBean.frmTreatmentList[i-1].treatmentdt}</td>
									<td><a
										href="treatmentlistDetailPath.do?frmDetailTreatmentId=${DoctorTreatmentSearchFormBean.frmTreatmentList[i-1].id}&frmControl=2">
											Detail</a></td>
								</tr>
							</c:forEach>
						</table>

						<table align="center">
							<tr>
								<td>
									<div align="center">
										<c:if test="${DoctorTreatmentSearchFormBean.prevBtn}">
											<html:submit property="prev" value="&lt;&lt;Previous "
												styleClass="btn btn-info">
											</html:submit>
										</c:if>
									</div>
								</td>
								<td></td>
								<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
								<td>&nbsp;</td>
								<td>
									<div align="center">
										<c:if test="${DoctorTreatmentSearchFormBean.nextBtn}">
											<html:submit property="next" value="Next &gt;&gt;"
												styleClass="btn btn-info">
											</html:submit>
										</c:if>
									</div>
								</td>
							</tr>
						</table>
					</div>
				</div>


			</logic:notEmpty>
		</html:form>
	</div>

	<!-- to carry the actual page -->
	<html:hidden property="actualPage" name="DoctorTreatmentSearchFormBean" />

	<html:hidden property="frmControl" name="DoctorTreatmentSearchFormBean"
		value="1" />



	<%@ include file="inc/footer.jsp"%>
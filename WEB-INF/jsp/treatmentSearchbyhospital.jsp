<%@ include file="inc/common.jsp"%>
<%@ include file="inc/headforHospitalAjax.jsp"%>
<%@ include file="inc/headerhome.jsp"%>
<body onload="DWRUtil.useLoadingMessage(); createAutoCompleter()">

	<div class="container">
		<div class="row">
				<h3>Treatment List By Hospital</h3>

				<div class="panel-body col-sm-12" align="center">


					<!-- <div class="col-sm-3">  -->

					<html:form action="/searchbyHospital">

						<table align="center" name="TreatmentHospitalSearchFormBean">
							<tr>
								<th>Hospital Name:</th>
								<td>&nbsp;&nbsp;</td>
								<td><html:text property="frmHospitalName"
										styleId="frmHospital1" styleClass="form-control"
										maxlength="29" size="30" />
									<div class="choices" id="choices1" style="z-index: 100;"></div></td>
									<td>&nbsp;&nbsp;</td>
								<td><html:submit property="search" value="Search"
										styleClass="btn btn-info">
									</html:submit></td>
							</tr>
						</table>
					</html:form>

				


					<div class="col-sm-12">


						<html:form>
							<logic:notEmpty property="frmTreatmentHospitalList"
								name="TreatmentHospitalSearchFormBean">

								<!-- <div class="col-sm-2"></div> -->
								<div class="panel-body col-sm-12" align="center">
<h4>
										<font color="green">Number of Treatment list :<b>
												${TreatmentHospitalSearchFormBean.frmTreatmentHospitalList.size()}</b></font>
									</h4>
									<table style="border-collapse: collapse"
										class="table table-hover" border="0" align="center">
										<tr class="success">
											<th>No</th>
<th>Hospital Name</th>
											<th>Doctor Name</th>
											<th>Specialize Name</th>
											<th>Disease</th>
											<th></th>
										</tr>
										<c:forEach var="i"
											begin="${TreatmentHospitalSearchFormBean.begin}"
											end="${TreatmentHospitalSearchFormBean.end}" step="1">
											<tr>
												<td>${i}</td>
												<td>${TreatmentHospitalSearchFormBean.frmTreatmentHospitalList[i-1].hosname}</td>
												<td>${TreatmentHospitalSearchFormBean.frmTreatmentHospitalList[i-1].dname}</td>
												<td>${TreatmentHospitalSearchFormBean.frmTreatmentHospitalList[i-1].specializetype}</td>
												<td>${TreatmentHospitalSearchFormBean.frmTreatmentHospitalList[i-1].disease}</td>
												<td><a
													href="TreatmentHospitalDetailPath.do?frmDetailTreatmentId=${TreatmentHospitalSearchFormBean.frmTreatmentHospitalList[i-1].id}&amp;frmControl=7">
														Detail</a></td>
											</tr>
										</c:forEach>
									</table>

									<table align="center">
										<tr>
											<td>
												<div align="center">
													<c:if test="${TreatmentHospitalSearchFormBean.prevBtn}">
                                   <html:submit property="prev"
															value="&lt;&lt;Previous" styleClass="btn btn-info">
														</html:submit>
													</c:if>
												</div>
											</td>
											<td>
												<div align="center">
													<c:if test="${TreatmentHospitalSearchFormBean.nextBtn}">
														<html:submit property="next" value="Next&gt;&gt;"
															styleClass="btn btn-info">
														</html:submit>
              											</c:if>
												</div>
											</td>
										</tr>
									</table>


								</div>
							</logic:notEmpty>
							<html:hidden property="actualPage"
								name="TreatmentHospitalSearchFormBean" />

							<html:hidden property="frmControl"
								name="TreatmentHospitalSearchFormBean" value="1" />
						</html:form>

					</div>


				</div>
		</div>
	</div>



	<!-- to carry the actual page -->


	<div><%@ include file="inc/footer.jsp"%></div>
</body>





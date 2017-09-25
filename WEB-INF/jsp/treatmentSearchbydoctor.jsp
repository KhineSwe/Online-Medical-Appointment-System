<%@ include file="inc/common.jsp"%>
<%@ include file="inc/headforDoctorAjax.jsp"%>
<%@ include file="inc/headerhome.jsp"%>
<body onload="DWRUtil.useLoadingMessage(); createAutoCompleter()">

	<div class="container">
		<div class="row">
				<h3>Treatment List By Doctor</h3>

				<div class="panel-body col-sm-12" align="center">



					<html:form action="/searchbyDoctor">

						<table align="center" name="SearchAjaxByDoctorNameFormBean">
							<tr>
								<th>Doctor Name:</th>
								<td>&nbsp;&nbsp;</td>
								<td><html:text property="frmDoctorName"
										styleId="frmDoctor1" styleClass="form-control" maxlength="29"
										size="30" /> <html:errors />
									<div class="choices" id="choices1" style="z-index: 100;overflow:auto"></div></td>
								<td>&nbsp;&nbsp;</td>
								<td><html:submit property="search" value="Search"
										styleClass="btn btn-info">
									</html:submit></td>
							</tr>
						</table>
					</html:form>
				

					<div class="col-sm-12">
						<html:form>

							<logic:notEmpty property="frmTreatmentDoctorlList"
								name="SearchAjaxByDoctorNameFormBean">




								<!-- <div class="col-sm-2"></div> -->

								<h4>
										<font color="green">Number of Treatment list :<b>
												${SearchAjaxByDoctorNameFormBean.frmTreatmentDoctorlList.size()}</b></font>
									</h4>

								<div class="panel-body col-sm-12" align="center">

									<table style="border-collapse: collapse"
										class="table table-hover" border="0" align="center">
										<tr class="success">
											<th>No</th>

											<th>Doctor Name</th>
											<th>Hospital Name</th>
											<th>Specialize Name</th>
											<th>Disease</th>
											<th></th>
										</tr>
										<c:forEach var="i"
											begin="${SearchAjaxByDoctorNameFormBean.begin}"
											end="${SearchAjaxByDoctorNameFormBean.end}" step="1">
											<tr>
												<td>${i}</td>
												<td>${SearchAjaxByDoctorNameFormBean.frmTreatmentDoctorlList[i-1].dname}</td>
												<td>${SearchAjaxByDoctorNameFormBean.frmTreatmentDoctorlList[i-1].hosname}</td>
												<td>${SearchAjaxByDoctorNameFormBean.frmTreatmentDoctorlList[i-1].specializetype}</td>
												<td>${SearchAjaxByDoctorNameFormBean.frmTreatmentDoctorlList[i-1].disease}</td>
												<td><a
													href="searchAjaxbyDoctorDetail.do?frmDetailTreatmentId=${SearchAjaxByDoctorNameFormBean.frmTreatmentDoctorlList[i-1].id}&amp;frmControl=7">
														Detail</a></td>
											</tr>
										</c:forEach>
									</table>

									<table align="center">
										<tr>
											<td>
												<div align="center">
													<c:if test="${SearchAjaxByDoctorNameFormBean.prevBtn}">
                                   <html:submit property="prev"
															value="&lt;&lt;Previous" styleClass="btn btn-info">
														</html:submit>
													</c:if>
												</div>
											</td>
											<td>
												<div align="center">
													<c:if test="${SearchAjaxByDoctorNameFormBean.nextBtn}">
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
								name="SearchAjaxByDoctorNameFormBean" />

							<html:hidden property="frmControl"
								name="SearchAjaxByDoctorNameFormBean" value="1" />
						</html:form>

					</div>
				</div>
		</div>
	</div>
	<br />
	<br />

	<!-- to carry the actual page -->


	<%@ include file="inc/footer.jsp"%>
</body>



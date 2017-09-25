<%@ include file="inc/common.jsp"%>
<%@ include file="inc/headerhome.jsp"%>
<%@ include file="inc/headforSpecializeAjax.jsp"%>

<body onload="DWRUtil.useLoadingMessage(); createAutoCompleter()">

	<div class="container">
		<div class="row">
		
<h3>Treatment List By Specialize</h3>
				<div class="panel-body col-sm-12" align="center">


					<html:form action="/searchbySpecialize">

						<table align="center" name="SearchBySpecializeFormBean">
							<tr>
								<th>Specialize Type:</th>
								<td>&nbsp;&nbsp;</td>
								<td><html:text property="frmSpecialize"
										styleId="frmSpecialize1" styleClass="form-control"
										maxlength="24" size="25" /> <html:errors />
									<div class="choices" id="choices1" style="z-index: 100 ;height:60px; overflow-y:scroll; overflow-x:hidden;"></div></td>
								<td>&nbsp;&nbsp;</td>
								<td><html:submit property="search" value="Search"
										styleClass="btn btn-info">
									</html:submit></td>
							</tr>
						</table>
					</html:form>
				
					<div class="col-sm-12">
						<html:form>





							<logic:notEmpty property="frmTreatmentList"
								name="SearchBySpecializeFormBean">

								<!-- <div class="col-sm-2"></div> -->
								<div class="panel-body col-sm-12" align="center">
								
									<h4>
										<font color="green">Number of Treatment list :<b>
												${SearchBySpecializeFormBean.frmTreatmentList.size()}</b></font>
									</h4>

									<table style="border-collapse: collapse"
										class="table table-hover" border="0" align="center">
										<tr class="success">
											<th>No</th>
<th>Specialize Name</th>
											<th>Doctor Name</th>
											<th>Hospital Name</th>
											<th>Disease</th>
											<th></th>
										</tr>
										<c:forEach var="i" begin="${SearchBySpecializeFormBean.begin}"
											end="${SearchBySpecializeFormBean.end}" step="1">
											<tr>
												<td>${i}</td>
												<td>${SearchBySpecializeFormBean.frmTreatmentList[i-1].specializetype}</td>
												<td>${SearchBySpecializeFormBean.frmTreatmentList[i-1].dname}</td>
												<td>${SearchBySpecializeFormBean.frmTreatmentList[i-1].hosname}</td>
												<td>${SearchBySpecializeFormBean.frmTreatmentList[i-1].disease}</td>
												<td><a
													href="searchbySpecializeDetail.do?frmDetailTreatmentId=${SearchBySpecializeFormBean.frmTreatmentList[i-1].id}&amp;frmControl=6">
														Detail</a></td>
											</tr>
										</c:forEach>
									</table>

									<table align="center">
										<tr>
											<td>
												<div align="center">
													<c:if test="${SearchBySpecializeFormBean.prevBtn}">
                                   <html:submit property="prev"
															value="&lt;&lt;Previous " styleClass="btn btn-info">
														</html:submit>
													</c:if>
												</div>
											</td>
											<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
											<td>
												<div align="center">
													<c:if test="${SearchBySpecializeFormBean.nextBtn}">
														<html:submit property="next" value="Next &gt;&gt;"
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
								name="SearchBySpecializeFormBean" />

							<html:hidden property="frmControl"
								name="SearchBySpecializeFormBean" value="1" />
						</html:form>

					</div>
				</div>
			
			
		</div>
	</div>

	<!-- to carry the actual page -->
</body>


	<%@ include file="inc/footer.jsp"%>

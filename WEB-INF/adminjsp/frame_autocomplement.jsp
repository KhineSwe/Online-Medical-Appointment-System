<%@ include file="inc/common.jsp"%>
<%@ include file="inc/headerhome.jsp"%>
<%@ include file="inc/headerforAdminPatientAjax.jsp"%>

<br /><br />

<body onload="DWRUtil.useLoadingMessage(); createAutoCompleter()">

	<div class="container col-sm-12">
		<div class="row">


			<div class="panel-body col-sm-12" align="center">

					<!-- <table>

							<td> -->
					<!-- Do autocomplement main from -->
					<html:form action="/searchPatientByNamePath">
						<table align="center">
							<tr>
								<th>Patient Name:</th>
								<td>&nbsp;&nbsp;</td>
								<td><html:text property="frmPatientName"
										styleId="frmPatientName1" styleClass="form-control" maxlength="29" size="30"/>
									<div class="choices" id="choices1" style="z-index: 100; height:60px; overflow-y:scroll; overflow-x:hidden;"></div></td>
									<td>&nbsp;&nbsp;&nbsp;</td>
								<td><html:submit property="btnSearch" value="Search"
										styleClass="btn btn-info">
									</html:submit></td>
									
									<td>&nbsp;</td>

							</tr>
						</table>
						<br><br>
					</html:form>
					
					
					<html:form action="/autoComplementPath">
						<logic:notEmpty property="frmPatientList"
							name="PatientListFormBean">

							<!-- <div class="panel-body col-sm-12" align="center">

											<div class="col-sm-1"></div>
											<div class="col-sm-10"> -->

							<p>

								<font color="red"><html:errors
										property="searchpnameerror" /></font> <font color="red"><html:errors
										property="noPatienterror" /></font> <font color="red"><html:errors
										property="changeStatuserror" /></font>
							</p>
							<h4><font color="green">Number of Patient: (${PatientListFormBean.frmPatientList.size()})</font></h4>
							<table style="border-collapse: collapse"
								class="table table-hover table-responsive" border="0" align="center">
								<tr class="success">
									<th>No</th>
									<th>Patient Name</th>
									<th>Gender</th>
									<th>Patient Address</th>
									<th>Status</th>
									<th colspan="2"></th>

								</tr>
								<c:forEach var="i" begin="${PatientListFormBean.begin}"
									end="${PatientListFormBean.end}" step="1">

									<tr>
										<td>${i}</td>
										<td>${PatientListFormBean.frmPatientList[i-1].pname}</td>
										<td>${PatientListFormBean.frmPatientList[i-1].pgender}</td>
										<td>${PatientListFormBean.frmPatientList[i-1].paddress}</td>
										<c:if
											test="${PatientListFormBean.frmPatientList[i-1].pstatus==0 }">
											<td>inactive</td>
											<td><a
												href="detailPath.do?frmDetailPatientId=${PatientListFormBean.frmPatientList[i-1].id}&frmControl=2">
													Detail</a></td>

											<td><font color="brown">Change Status</font></td>

										</c:if>
										<c:if
											test="${PatientListFormBean.frmPatientList[i-1].pstatus==1 }">
											<td>active</td>


											<td><a
												href="detailPath.do?frmDetailPatientId=${PatientListFormBean.frmPatientList[i-1].id}&frmControl=2">
													Detail</a></td>
											<td><a
												href="statusChangePath.do?frmDetailStatusId=${PatientListFormBean.frmPatientList[i-1].id}&frmControl=3">
													Change Status</a></td>
										</c:if>
									</tr>


								</c:forEach>
							</table>

							<table align="center">
								<tr>
									<td>
										<div align="center">
											<c:if test="${PatientListFormBean.prevBtn}">
                                   <html:submit property="prev"
													value="&lt;&lt;Previous" styleClass="btn btn-info">
												</html:submit>
											</c:if>
										</div>
									</td>
									<td>&nbsp;&nbsp;</td>
									<td>&nbsp;&nbsp;</td>
									<td>
										<div align="center">
											<c:if test="${PatientListFormBean.nextBtn}">
												<html:submit property="next" value="Next&gt;&gt;"
													styleClass="btn btn-info">
												</html:submit>
              											</c:if>
										</div>
									</td>
								</tr>
							</table>
						</logic:notEmpty>
					</html:form>
				</div>
				<%-- </logic:notEmpty>  --%>

				<html:hidden property="actualPage" name="PatientListFormBean" />
				<html:hidden property="frmControl" name="PatientListFormBean"
					value="1" />
				
			</div>
		</div>

</body>
		<%@ include file="inc/footer.jsp"%>
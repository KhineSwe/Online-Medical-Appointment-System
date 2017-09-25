<%@ include file="inc/common.jsp"%>
<%@ include file="inc/headerafterlogin.jsp"%>

<div class="container">
	<div class="row">



		<html:form action="/noOfappointDetailPath">
			<h4>
				<html:errors property="noApplistError"></html:errors>
			</h4>
			<logic:notEmpty property="frmAppointList" name="AppointmentFormBean">
				<div class="panel-body col-sm-12" align="center">
					<h2>${AppointmentFormBean.frmAppointList[0].hosname}</h2>
					<!-- <div class="col-sm-1"></div> -->
					<div class="col-sm-12">


						<table style="border-collapse: collapse" class="table table-hover"
							border="0" align="center">
							<tr class="success">
								<th>No</th>

								<th>Patient Name</th>
								<th>Gender</th>
								<th>Date</th>
								<th>Token No</th>
								<td></td>





							</tr>
							<c:forEach var="i" begin="${AppointmentFormBean.begin}"
								end="${AppointmentFormBean.end}" step="1">

								<tr>
									<td>${i}</td>
									<td>${AppointmentFormBean.frmAppointList[i-1].pname}</td>
									<td>${AppointmentFormBean.frmAppointList[i-1].pgender}</td>
									<td>${AppointmentFormBean.frmAppointList[i-1].schdate}</td>
									<td>${AppointmentFormBean.frmAppointList[i-1].tokenno}</td>
									<td><a
										href="recordTreatmentPathFist.do?frmDetailAppointId=${AppointmentFormBean.frmAppointList[i-1].id}&frmControl=2">
											Record Treatment</a></td>
								</tr>
							</c:forEach>
						</table>

						<table align="center">
							<tr>
								<td>
									<div align="center">
										<c:if test="${AppointmentFormBean.prevBtn}">
											<html:submit property="prev" value="&lt;&lt;Previous"
												styleClass="btn btn-info">
											</html:submit>
										</c:if>
									</div>
								</td>
								<td>
									<div align="center">
										<c:if test="${AppointmentFormBean.nextBtn}">
											<html:submit property="next" value="Next&gt;&gt;"
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
	<html:hidden property="actualPage" name="AppointmentFormBean" />

	<html:hidden property="frmControl" name="AppointmentFormBean" value="1" />


</div>


<%@ include file="inc/footer.jsp"%>


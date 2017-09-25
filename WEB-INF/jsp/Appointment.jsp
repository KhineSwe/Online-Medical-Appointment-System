<%@include file="inc/common.jsp"%>
<%@ include file="inc/headerhome.jsp"%>
<%@ include file="inc/headforCategory.jsp"%>
<div class="container">
	<div class="row">
		<div class="panel panel-success">
			<div class="panel-heading">Appointment Confirm</div>

			<div class="panel-body col-sm-3"></div>
			<div class="panel-body col-sm-6">
				<br /> <br />


				<html:form action="/tokenPath">
					<logic:notEmpty property="frmFormControl" name="ScheduleFormBean">
						<table class="table" border="0">
							<tbody>

								<tr>
									<th>Doctor Name:</th>
									<td colspan="2">${ScheduleFormBean.frmAppointmentDetail.dname}</td>




								</tr>

								<tr>
									<th>Specialized Field:</th>
									<td colspan="2">${ScheduleFormBean.frmAppointmentDetail.specializetype}</td>


								</tr>

								<tr>
									<th>Hospital:</th>

									<td colspan="2">${ScheduleFormBean.frmAppointmentDetail.hosname}</td>
									
									



								</tr>

								<tr>
									<th>Schedule (Hour):</th>

									<td colspan="2"><c:if
											test="${ScheduleFormBean.frmAppointmentDetail.schstarttime<12}">


											<c:out
												value="${ScheduleFormBean.frmAppointmentDetail.schstarttime}" />:00
											(AM) to
									</c:if> <c:if
											test="${ScheduleFormBean.frmAppointmentDetail.schstarttime>12}">


											<c:out
												value="${ScheduleFormBean.frmAppointmentDetail.schstarttime-12}" />:00
											(PM) to
									</c:if> <c:if
											test="${ScheduleFormBean.frmAppointmentDetail.schfinishtime>12}">


											<c:out
												value="${ScheduleFormBean.frmAppointmentDetail.schfinishtime-12}" />:00
											(PM) 
									</c:if> <c:if
											test="${ScheduleFormBean.frmAppointmentDetail.schfinishtime<12}">


											<c:out
												value="${ScheduleFormBean.frmAppointmentDetail.schfinishtime}" />:00
											(AM)
									</c:if></td>




								</tr>
								<tr>
									<th>Date:</th>
									<td colspan="2">${ScheduleFormBean.frmAppointmentDetail.schdate}</td>
									

								</tr>

								<tr>
									<td></td>
									<td> <div style="margin-left:-20%;"><html:submit
											value="Confirm" property="btnConfirm"
											styleClass="btn btn-primary" /></div>
											</td><td>
									 <div style="margin-left:-60%;"><html:submit value="Cancel"
											property="btnConfirmCancel" styleClass="btn btn-primary" /></div></td>

								</tr>

							</tbody>
						</table>
					</logic:notEmpty>
				</html:form>
				<br /> <br />
			</div>
			<div class="panel-body col-sm-3"></div>


		</div>
	</div>
</div>


<%@ include file="inc/footer.jsp"%>


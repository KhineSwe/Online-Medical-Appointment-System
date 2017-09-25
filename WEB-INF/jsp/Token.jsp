<%@include file="inc/common.jsp"%>
<%@ include file="inc/headerhome.jsp"%>
<%@ include file="inc/headforCategory.jsp"%>

<div class="col-sm-12">
	<h4>
		<center>
			Thank you for making appointment!Your token number has been send via
			email.<br> Please <a
				href="http://mailsrv.ictti.site/mail/src/login.php"><b><i>Check
						your email</b></i></a> to see your token number.
		</center>
	</h4>
<div class="col-sm-3"></div>
<div class="col-sm-6">
	<html:form method="post" action="/appointPath">
		<h2 align="center" style="color: green">Your Token Number</h2>
		<logic:notEmpty property="frmFormControl" name="ScheduleFormBean">

			<table align="center" border="0" class="table" width="50%">

				<tr>
					<th>Token No:</th>
					<td><b style="color:blue">${ScheduleFormBean.frmtokenno}</b></td>
				</tr>

				<tr>
					<th>Doctor Name:</th>
					<td>${ScheduleFormBean.frmAppointmentDetail.dname}</td>
				</tr>
				

				<tr>
					<th>Specialized Field:</th>
					<td>${ScheduleFormBean.frmAppointmentDetail.specializetype}</td>
				</tr>
				


				<tr>
					<th>Hospital:</th>
					<td>${ScheduleFormBean.frmAppointmentDetail.hosname}</td>
				</tr>
				


				<tr>
					<th>Schedule (Hour):</th>

					<td><c:if
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
					<td>${ScheduleFormBean.frmAppointmentDetail.schdate}</td>

				</tr>

			</table>
			

		</logic:notEmpty>
		<center>
			<html:submit property="btnOk" value="OK" styleClass="btn btn-primary" />
		</center>




	</html:form>
	</div>
	<div class="col-sm-3"></div>
	</div>
	

	<%@ include file="inc/footer.jsp"%>


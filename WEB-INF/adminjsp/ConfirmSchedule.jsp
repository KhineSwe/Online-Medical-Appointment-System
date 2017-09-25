<%@include file="inc/common.jsp"%>
<%@ include file="inc/calendar.jsp"%>
<%@ include file="inc/headerhome.jsp"%>

<html>
<body>
<html>
<head>
<title>Add Schedule</title>
</head>
<body>

	<html:form method="post" action="/adminconfirmSchedulePath">
		<table width='60%'>
			<tr>

				<th>Hospital :</th>
				<td>${AutoFormBean.frmhosname.hosname}</td>
			</tr>

			<tr>
				<td>&nbsp;&nbsp;</td>
			</tr>

			<tr>
				<th>Specialize Field:</th>
				<td>${AutoFormBean.frmspecname.specializetype}</td>
			</tr>

			<tr>
				<td>&nbsp;&nbsp;</td>
			</tr>

			<tr>
				<th>Doctor Name:</th>
				<td>${AutoFormBean.frmDocname.dname}</td>
			</tr>

			<tr>
				<td>&nbsp;&nbsp;</td>
			</tr>
			<tr>
				<th>Start Date:</th>
				<td><html:text property="frmStartDate" styleId="calendar"
						styleClass="form-control" readonly="true"></html:text></td>
			</tr>

			<tr>
				<td>&nbsp;&nbsp;</td>
			</tr>

			<tr>
				<th>Maximum Number of Appointment Patients</th>
				<td><html:text property="frmmaxpatient" maxlength="2"
						disabled="true" styleClass="form-control" /></td>
			</tr>
			<tr>
				<td>&nbsp;&nbsp;</td>
				<td>&nbsp;&nbsp;</td>
			</tr>
			<tr>
		<th>Schedule Duration:</th>
		<c:if test="${AutoFormBean.frmnoWeek.equals('4') }">
		<td><html:radio property="frmnoWeek" value="4" disabled="true"> One Month </html:radio> </td></c:if>
		<c:if test="${AutoFormBean.frmnoWeek.equals('8') }">
		<td><html:radio property="frmnoWeek" value="8" disabled="true"> Two Month </html:radio> </td></c:if>
		<c:if test="${AutoFormBean.frmnoWeek.equals('16') }">
		<td><html:radio property="frmnoWeek" value="12" disabled="true"> Three Month </html:radio> </td></c:if>
		
		</tr>
		</table>
		<table style="border-collapse: collapse" class="table table-hover"
			border="0" align="center">
			<tr class="success">
				<th>Day:</th>
				<th>From (Hour)</th>
				<th>&nbsp;&nbsp;&nbsp;</th>
				<th>To: (Hour)</th>
				<th>&nbsp;&nbsp;&nbsp;</th>
			</tr>
			<c:if test="${!AutoFormBean.frmFromMonTime.equals('0') }">
				<tr>
					<!--  <td>Monday</td>  -->
					<td><html:multibox property="frmDay" value="2" disabled="true" />Monday</td>
					<td><html:text property="frmFromMonTime" disabled="true"
							styleClass="form-control">:00</html:text></td>
					<td><html:text property="frmMonAMPMTime" disabled="true"
							styleClass="form-control">:00</html:text></td>
					<td><html:text property="frmToMonTime" disabled="true"
							styleClass="form-control">:00</html:text></td>
					<td><html:text property="frmmonTime" disabled="true"
							styleClass="form-control">:00</html:text></td>
				</tr>
			</c:if>
			<c:if test="${!AutoFormBean.frmFromTueTime.equals('0') }">
				<tr>
					<!--  <td>Tuesday</td> -->
					<td><html:multibox property="frmDay" value="3" disabled="true" />Tuesday
					</td>
					<td><html:text property="frmFromTueTime" disabled="true"
							styleClass="form-control">:00</html:text></td>
					<td><html:text property="frmTueAMPMTime" disabled="true"
							styleClass="form-control">:00</html:text></td>
					<td><html:text property="frmToTueTime" disabled="true"
							styleClass="form-control">:00</html:text></td>
					<td><html:text property="frmtueTime" disabled="true"
							styleClass="form-control">:00</html:text></td>

				</tr>
			</c:if>
			<c:if test="${!AutoFormBean.frmFromWedTime.equals('0') }">

				<tr>
					<!--  <td>Wednesday</td>  -->
					<td><html:multibox property="frmDay" value="4" disabled="true" />Wednesday
					</td>
					<td><html:text property="frmFromWedTime" disabled="true"
							styleClass="form-control">:00</html:text></td>
					<td><html:text property="frmWedAMPMTime" disabled="true"
							styleClass="form-control">:00</html:text></td>
					<td><html:text property="frmToWedTime" disabled="true"
							styleClass="form-control">:00</html:text></td>
					<td><html:text property="frmwedTime" disabled="true"
							styleClass="form-control">:00</html:text></td>

				</tr>
			</c:if>
			<c:if test="${!AutoFormBean.frmFromThuTime.equals('0') }">

				<tr>
					<!-- <td>Thursday</td>  -->
					<td><html:multibox property="frmDay" value="5" disabled="true" />Thursday
					</td>
					<td><html:text property="frmFromThuTime" disabled="true"
							styleClass="form-control">:00</html:text></td>
					<td><html:text property="frmThuAMPMTime" disabled="true"
							styleClass="form-control">:00</html:text></td>
					<td><html:text property="frmToThuTime" disabled="true"
							styleClass="form-control">:00</html:text></td>
					<td><html:text property="frmthuTime" disabled="true"
							styleClass="form-control">:00</html:text></td>
				</tr>
			</c:if>
			<c:if test="${!AutoFormBean.frmFromFriTime.equals('0') }">

				<tr>
					<!-- <td>Friday</td> -->
					<td><html:multibox property="frmDay" value="6" disabled="true" />Friday
					</td>
					<td><html:text property="frmFromFriTime" disabled="true"
							styleClass="form-control">:00</html:text></td>
					<td><html:text property="frmFriAMPMTime" disabled="true"
							styleClass="form-control">:00</html:text></td>
					<td><html:text property="frmToFriTime" disabled="true"
							styleClass="form-control">:00</html:text></td>
					<td><html:text property="frmfriTime" disabled="true"
							styleClass="form-control">:00</html:text></td>
				</tr>
			</c:if>
			<c:if test="${!AutoFormBean.frmFromSatTime.equals('0') }">

				<tr>
					<!-- <td>Saturday</td> -->
					<td><html:multibox property="frmDay" value="7" disabled="true" />Saturday
					</td>
					<td><html:text property="frmFromSatTime" disabled="true"
							styleClass="form-control">:00</html:text></td>
					<td><html:text property="frmSatAMPMTime" disabled="true"
							styleClass="form-control">:00</html:text></td>
					<td><html:text property="frmToSatTime" disabled="true"
							styleClass="form-control">:00</html:text></td>
					<td><html:text property="frmsatTime" disabled="true"
							styleClass="form-control">:00</html:text></td>
				</tr>
			</c:if>
			<c:if test="${!AutoFormBean.frmFromSunTime.equals('0') }">

				<tr>
					<!--  <td>Sunday</td>  -->
					<td><html:multibox property="frmDay" value="1" disabled="true" />Sunday
					</td>
					<td><html:text property="frmFromSunTime" disabled="true"
							styleClass="form-control">:00</html:text></td>
					<td><html:text property="frmSunAMPMTime" disabled="true"
							styleClass="form-control">:00</html:text></td>
					<td><html:text property="frmToSunTime" disabled="true"
							styleClass="form-control">:00</html:text></td>
					<td><html:text property="frmsunTime" disabled="true"
							styleClass="form-control">:00</html:text></td>
				</tr>
			</c:if>
			
				<tr>

				<td>&nbsp;&nbsp;&nbsp;</td>

				<td>&nbsp;&nbsp;&nbsp;</td>
				<td><html:submit property="btnConfirm" value="Confirm"
						styleClass="btn btn-info" /></td><td> <html:submit
						property="btnConfirmCancel" value="Cancel"
						styleClass="btn btn-info" style="margin-left:-40px;"/></td>
				<td>&nbsp; &nbsp; &nbsp; &nbsp;</td>

			</tr>









		</table>




	</html:form>


	<%@ include file="inc/footer.jsp"%>
<%@include file="inc/common.jsp"%>
<%@ include file="inc/headerhome.jsp"%>
<br /><br />
<html:form method="post" action="/UpdateConfirmPath">
	<logic:notEmpty property="frmFormControl" name="UpdateScheduleFormBean">
		<table align="center" width="80%" border="0">


			<tr>
				<th>Doctor Name:</th>
				<td colspan="2">${UpdateScheduleFormBean.frmAppointmentDetail.dname}</td>

			</tr>
			<tr>
				<td colspan="3">&nbsp;&nbsp;</td>
			</tr>

			<tr>
				<th>Specialized Field:</th>
				<td colspan="2">${UpdateScheduleFormBean.frmAppointmentDetail.specializetype}</td>
			</tr>
			<tr>
				<td colspan="3">&nbsp;&nbsp;</td>
			</tr>


			<tr>
				<th>Hospital:</th>

				<td colspan="2">${UpdateScheduleFormBean.frmAppointmentDetail.hosname}</td>
			</tr>
			<tr>
				<td colspan="3">&nbsp;&nbsp;</td>
			</tr>


			<tr>
				<th>Maximum number of appointment patient:</th>
				<td colspan="2">${UpdateScheduleFormBean.frmUpdateScheduleList[0].schmaxno}
				</td>
			</tr>
			<tr>
				<td colspan="3">&nbsp;&nbsp;</td>
			</tr>



			<tr>
				<th>Date:</th>

				<td colspan="2">${UpdateScheduleFormBean.frmAppointmentDetail.schdate}</td>
			</tr>
			<tr>
				<td colspan="3">&nbsp;&nbsp;</td>
			</tr>




			<tr>
				<th>From Time (Hour)</th>
				<td>${UpdateScheduleFormBean.frmFromTime}:00</td>
				<td width="45%"><html:radio property="ampm" value="AM" disabled="true"> AM</html:radio>&nbsp;&nbsp;
					<html:radio property="ampm" value="PM" disabled="true"> PM</html:radio></td>

			</tr>
			<tr>
				<td colspan="3">&nbsp;&nbsp;</td>
			</tr>


			<tr>
				<th>End Time (Hour)</th>
				<td>${UpdateScheduleFormBean.frmEndTime}:00</td>
				<td width="45%"><html:radio property="ampmfinish" value="AM"
						disabled="true"> AM</html:radio>&nbsp;&nbsp; <html:radio
						property="ampmfinish" value="PM" disabled="true"> PM</html:radio></td>


			</tr>
			<tr>
				<td colspan="3">&nbsp;&nbsp;</td>
			</tr>


			<tr>
				<td colspan="3">&nbsp;&nbsp;</td>
			</tr>


		</table>
		<table align="center">
			<tr>
				<td><html:submit property="btnUpdateConfirm" value="Confirm"
						styleClass="btn btn-info" /></td>
				<td>&nbsp;&nbsp;</td>
				<td><html:submit property="btnUpdateConfirmCancel"
						value="Cancel" styleClass="btn btn-info" /></td>
			</tr>
		</table>
	</logic:notEmpty>


</html:form>
<br>
<br>
<%@ include file="inc/footer.jsp"%>
<%@include file="inc/common.jsp"%>
<%@ include file="inc/headerhome.jsp"%>
<br /><br />
<html:form method="post" action="/ScheduleUpdatePath">
	<logic:notEmpty property="frmFormControl" name="UpdateScheduleFormBean">
		<table width="45%">


			<tr>
				<th>Doctor Name:</th>
				<td>${UpdateScheduleFormBean.frmAppointmentDetail.dname}</td>

			</tr>
			<tr>
				<td>&nbsp;&nbsp;</td>
				<td>&nbsp;&nbsp;</td>
			</tr>

			<tr>
				<th>Specialized Field:</th>
				<td>${UpdateScheduleFormBean.frmAppointmentDetail.specializetype}</td>
			</tr>

			<tr>
				<td>&nbsp;&nbsp;</td>
				<td>&nbsp;&nbsp;</td>
			</tr>


			<tr>
				<th>Hospital:</th>

				<td>${UpdateScheduleFormBean.frmAppointmentDetail.hosname}</td>
			</tr>
			<tr>
				<td>&nbsp;&nbsp;</td>
				<td>&nbsp;&nbsp;</td>
			</tr>


			<tr>
				<th>Maximum number of appointment patient:</th>
				<td><html:text property=""
						value="${UpdateScheduleFormBean.frmUpdateScheduleList[0].schmaxno}"
						disabled="true" styleClass="form-control" /></td>
			</tr>

		</table>
		<br>


		<table class="table table-hover" border="0">

			<tbody>

				<tr class="success">
					<th>Date</th>
					
					<th></th>

					<th colspan="2">From Time</th>

					<th colspan="2">End Time</th>
				</tr>

				<tr>
					<td>${UpdateScheduleFormBean.frmAppointmentDetail.schdate}</td>



					<td><c:if
							test="${UpdateScheduleFormBean.frmAppointmentDetail.schstarttime>12}">
							<html:select property="frmFromTime" styleClass="form-control">
								<html:option
									value="${UpdateScheduleFormBean.frmAppointmentDetail.schstarttime-12}">${UpdateScheduleFormBean.frmAppointmentDetail.schstarttime-12}:00
								</html:option>
								<html:option value="1"> 1:00 </html:option>
								<html:option value="2"> 2:00 </html:option>
								<html:option value="3"> 3:00 </html:option>
								<html:option value="4"> 4:00 </html:option>
								<html:option value="5"> 5:00 </html:option>
								<html:option value="6"> 6:00 </html:option>
								<html:option value="7"> 7:00 </html:option>
								<html:option value="8"> 8:00 </html:option>
								<html:option value="9"> 9:00 </html:option>
								<html:option value="10"> 10:00 </html:option>
								<html:option value="11"> 11:00 </html:option>
								<html:option value="12"> 12:00 </html:option>

							</html:select>
						</c:if> <c:if
							test="${UpdateScheduleFormBean.frmAppointmentDetail.schstarttime<12}">
							<td><html:select property="frmFromTime"
									styleClass="form-control">
									<html:option
										value="${UpdateScheduleFormBean.frmAppointmentDetail.schstarttime}">${UpdateScheduleFormBean.frmAppointmentDetail.schstarttime}:00
								</html:option>
									<html:option value="1"> 1:00 </html:option>
									<html:option value="2"> 2:00 </html:option>
									<html:option value="3"> 3:00 </html:option>
									<html:option value="4"> 4:00 </html:option>
									<html:option value="5"> 5:00 </html:option>
									<html:option value="6"> 6:00 </html:option>
									<html:option value="7"> 7:00 </html:option>
									<html:option value="8"> 8:00 </html:option>
									<html:option value="9"> 9:00 </html:option>
									<html:option value="10"> 10:00 </html:option>
									<html:option value="11"> 11:00 </html:option>
									<html:option value="12"> 12:00 </html:option>

								</html:select>
						</c:if> <c:if
							test="${UpdateScheduleFormBean.frmAppointmentDetail.schstarttime==12}">
							<td><html:select property="frmFromTime"
									styleClass="form-control">
									<html:option
										value="${UpdateScheduleFormBean.frmAppointmentDetail.schstarttime}">${UpdateScheduleFormBean.frmAppointmentDetail.schstarttime}:00
								</html:option>
									<html:option value="1"> 1:00 </html:option>
									<html:option value="2"> 2:00 </html:option>
									<html:option value="3"> 3:00 </html:option>
									<html:option value="4"> 4:00 </html:option>
									<html:option value="5"> 5:00 </html:option>
									<html:option value="6"> 6:00 </html:option>
									<html:option value="7"> 7:00 </html:option>
									<html:option value="8"> 8:00 </html:option>
									<html:option value="9"> 9:00 </html:option>
									<html:option value="10"> 10:00 </html:option>
									<html:option value="11"> 11:00 </html:option>
									<html:option value="12"> 12:00 </html:option>

								</html:select>
						</c:if></td>


					<td><c:if
							test="${UpdateScheduleFormBean.frmAppointmentDetail.schstarttime>12}">

							<input type="radio" name="ampm" value="AM">AM
					&nbsp;&nbsp;	<input type="radio" name="ampm" value="PM"
								checked="checked">PM
						
					</c:if> <c:if
							test="${UpdateScheduleFormBean.frmAppointmentDetail.schstarttime<=12}">

							<input type="radio" name="ampm" value="AM" checked="checked">AM
					&nbsp;&nbsp;	<input type="radio" name="ampm" value="PM">PM
						
					</c:if></td>

					<td><c:if
							test="${UpdateScheduleFormBean.frmAppointmentDetail.schfinishtime<12}">
							<html:select property="frmEndTime" styleClass="form-control">
								<html:option
									value="${UpdateScheduleFormBean.frmAppointmentDetail.schfinishtime}">${UpdateScheduleFormBean.frmAppointmentDetail.schfinishtime}:00
								</html:option>
								<html:option value="1"> 1:00 </html:option>
								<html:option value="2"> 2:00 </html:option>
								<html:option value="3"> 3:00 </html:option>
								<html:option value="4"> 4:00 </html:option>
								<html:option value="5"> 5:00 </html:option>
								<html:option value="6"> 6:00 </html:option>
								<html:option value="7"> 7:00 </html:option>
								<html:option value="8"> 8:00 </html:option>
								<html:option value="9"> 9:00 </html:option>
								<html:option value="10"> 10:00 </html:option>
								<html:option value="11"> 11:00 </html:option>
								<html:option value="12"> 12:00 </html:option>

							</html:select>
						</c:if> <c:if
							test="${UpdateScheduleFormBean.frmAppointmentDetail.schfinishtime>12}">
							<html:select property="frmEndTime" styleClass="form-control">
								<html:option
									value="${UpdateScheduleFormBean.frmAppointmentDetail.schfinishtime-12}">${UpdateScheduleFormBean.frmAppointmentDetail.schfinishtime-12}:00
								</html:option>
								<html:option value="1"> 1:00 </html:option>
								<html:option value="2"> 2:00 </html:option>
								<html:option value="3"> 3:00 </html:option>
								<html:option value="4"> 4:00 </html:option>
								<html:option value="5"> 5:00 </html:option>
								<html:option value="6"> 6:00 </html:option>
								<html:option value="7"> 7:00 </html:option>
								<html:option value="8"> 8:00 </html:option>
								<html:option value="9"> 9:00 </html:option>
								<html:option value="10"> 10:00 </html:option>
								<html:option value="11"> 11:00 </html:option>
								<html:option value="12"> 12:00 </html:option>

							</html:select>
						</c:if> <c:if
							test="${UpdateScheduleFormBean.frmAppointmentDetail.schfinishtime==12}">
							<html:select property="frmEndTime" styleClass="form-control">
								<html:option
									value="${UpdateScheduleFormBean.frmAppointmentDetail.schfinishtime}">${UpdateScheduleFormBean.frmAppointmentDetail.schfinishtime}:00
								</html:option>
								<html:option value="1"> 1:00 </html:option>
								<html:option value="2"> 2:00 </html:option>
								<html:option value="3"> 3:00 </html:option>
								<html:option value="4"> 4:00 </html:option>
								<html:option value="5"> 5:00 </html:option>
								<html:option value="6"> 6:00 </html:option>
								<html:option value="7"> 7:00 </html:option>
								<html:option value="8"> 8:00 </html:option>
								<html:option value="9"> 9:00 </html:option>
								<html:option value="10"> 10:00 </html:option>
								<html:option value="11"> 11:00 </html:option>
								<html:option value="12"> 12:00 </html:option>

							</html:select>
						</c:if></td>
					<td><c:if
							test="${UpdateScheduleFormBean.frmAppointmentDetail.schfinishtime>12}">

							<input type="radio" name="ampmfinish" value="AM">AM
					&nbsp;&nbsp;	<input type="radio" name="ampmfinish" value="PM"
								checked="checked">PM
						
					</c:if> <c:if
							test="${UpdateScheduleFormBean.frmAppointmentDetail.schfinishtime<=12}">

							<input type="radio" name="ampmfinish" value="AM"
								checked="checked">AM
					&nbsp;&nbsp;	<input type="radio" name="ampmfinish" value="PM">PM
						
					</c:if></td>
				</tr>

			</tbody>
		</table>
		<table align="center">
			<tr>
				<td>&nbsp;&nbsp;</td>
				<td><html:submit property="btnUpdate" value="Update"
						styleClass="btn btn-info" /></td>
				<td>&nbsp;&nbsp;</td>
				<td><html:submit property="btnUpdateCancel" value="Cancel"
						styleClass="btn btn-info" /></td>
				<td>&nbsp;&nbsp;</td>
			</tr>
		</table>
		<br>
		<br>

		<html:errors property="schtimeerror" />



	</logic:notEmpty>


</html:form>
<br>
<%@ include file="inc/footer.jsp"%>
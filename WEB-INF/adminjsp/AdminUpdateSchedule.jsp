<%@include file="inc/common.jsp"%>
<%@ include file="inc/headerhome.jsp"%>

<br /><br />
<html:form method="post">
	<table width="60%">
		<tr>
			<th>Doctor Name:</th>

			<td>${UpdateScheduleFormBean.frmdocname.dname}</td>
		</tr>

		<tr>
			<td>&nbsp;&nbsp;</td>
		</tr>

		<tr>

			<th>Hospital :</th>
			<td>${UpdateScheduleFormBean.frmHosname.hosname}</td>
		</tr>

		<tr>
			<td>&nbsp;&nbsp;</td>
		</tr>

		<tr>
			<th>Specialize Field:</th>
			<td>${UpdateScheduleFormBean.frmSpecname.specializetype}</td>
		</tr>

		<tr>
			<td>&nbsp;&nbsp;</td>
		</tr>

		<tr>
			<th>Maximum number of appointment patient:</th>
			<td><html:text property=""
					value="${UpdateScheduleFormBean.frmUpdateScheduleList[0].schmaxno}"
					disabled="true" styleClass="form-control" /></td>
		</tr>


	</table>
</html:form>
<br>


<html:form method="post" action="/UpdatescheduleDetailPath">

	<logic:notEmpty property="frmUpdateScheduleList"
		name="UpdateScheduleFormBean">

		<h4>
			<font color="green">Number of Schedule Record :<b>
					${UpdateScheduleFormBean.frmUpdateScheduleList.size()}</b></font>
		</h4>


		<table style="border-collapse: collapse" class="table table-hover"
			border="0" align="center">
			<tr class="success">

				<th>Date</th>
				<th></th>
				<th colspan="2">From Time</th>
<th></th>
				<th colspan="2">End Time</th>

				<th> Edit</th>
				<!-- <th>&nbsp;&nbsp;</th>  -->
			</tr>

			<c:forEach var="i" begin="${UpdateScheduleFormBean.begin}"
				end="${UpdateScheduleFormBean.end}" step="1">
				<tr>
					<td>${UpdateScheduleFormBean.frmUpdateScheduleList[i-1].schdate}</td>
					<td><c:if
							test="${UpdateScheduleFormBean.frmUpdateScheduleList[i-1].schstarttime<12}">


							<td><c:out
									value="${UpdateScheduleFormBean.frmUpdateScheduleList[i-1].schstarttime}" />:00</td>

							<td>AM</td>

						</c:if> <c:if
							test="${UpdateScheduleFormBean.frmUpdateScheduleList[i-1].schstarttime>12}">

							<td><c:out
									value="${UpdateScheduleFormBean.frmUpdateScheduleList[i-1].schstarttime-12}" />:00</td>

							<td>PM</td>

						</c:if> <c:if
							test="${UpdateScheduleFormBean.frmUpdateScheduleList[i-1].schstarttime==12}">

							<td><c:out
									value="${UpdateScheduleFormBean.frmUpdateScheduleList[i-1].schstarttime}" />:00</td>
							<td>AM</td>

						</c:if></td>



					<td><c:if
							test="${UpdateScheduleFormBean.frmUpdateScheduleList[i-1].schfinishtime<12}">

							<td><c:out
									value="${UpdateScheduleFormBean.frmUpdateScheduleList[i-1].schfinishtime}" />:00</td>
							<td>AM</td>
						</c:if> <c:if
							test="${UpdateScheduleFormBean.frmUpdateScheduleList[i-1].schfinishtime>12}">

							<td><c:out
									value="${UpdateScheduleFormBean.frmUpdateScheduleList[i-1].schfinishtime-12}" />:00</td>
							<td>PM</td>

						</c:if> <c:if
							test="${UpdateScheduleFormBean.frmUpdateScheduleList[i-1].schfinishtime==12}">

							<td><c:out
									value="${UpdateScheduleFormBean.frmUpdateScheduleList[i-1].schfinishtime}" />:00</td>
							<td>AM</td>

						</c:if></td>


					<td><a
						href="UpdatescheduleDetailPath.do?frmUpdateScheduleId=${UpdateScheduleFormBean.frmUpdateScheduleList[i-1].id}&frmFormControl=2">
							Update </a></td>
				</tr>
			</c:forEach>



			</tbody>
		</table>
		<table align="center">
			<tr>
				<td>&nbsp;&nbsp;</td>
				<td>&nbsp;&nbsp;</td>

				<td>
					<!-- 	<div> --> <c:if test="${UpdateScheduleFormBean.prevBtn}">
                                   <html:submit property="prev"
							value="&lt;&lt;Previous" styleClass="btn btn-info">
						</html:submit>
					</c:if> <!-- </div> -->&nbsp;&nbsp; <!-- </td>
					<td> --> <!-- 	<div> --> <c:if
						test="${UpdateScheduleFormBean.nextBtn}">
						<html:submit property="next" value="Next&gt;&gt;"
							styleClass="btn btn-info">
						</html:submit>
              			</c:if> <!-- </div> -->
				</td>
				<td>&nbsp;&nbsp;</td>
				<td>&nbsp;&nbsp;</td>
			</tr>

		</table>

		<html:hidden property="actualPage" name="UpdateScheduleFormBean"
			styleClass="btn btn-info" />
		<html:hidden property="frmFormControl" name="UpdateScheduleFormBean"
			value="1" />

	</logic:notEmpty>
</html:form>
<br>
<%@ include file="inc/footer.jsp"%>
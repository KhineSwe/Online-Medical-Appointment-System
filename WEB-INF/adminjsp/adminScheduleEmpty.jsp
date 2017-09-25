<%@include file="inc/common.jsp"%>
<%@ include file="inc/calendar.jsp"%>
<%@ include file="inc/headerhome.jsp"%>


<br>

<html:form method="post" action="/adminSearchSchedulePath">
	<table align="center" width="60%">
		<tr>
			<td></td>
			<td><html:errors property="scheduleemptyerror" /></td>
		</tr>
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
			<th>Select Doctor Name:</th>

			<td><html:select property="frmSpecId" styleClass="form-control">
					<c:forEach var="i" begin="0"
						end="${AutoFormBean.frmDocList.size()-1}" step="1">
						<html:option value="${AutoFormBean.frmDocList[i].id}">
							<c:out value='${AutoFormBean.frmDocList[i].dname}' />
						</html:option>
					</c:forEach>
				</html:select></td>
			<%-- <td><html:errors property="scheduleemptyerror" /></td> --%>
		</tr>
		<tr>
			<td>&nbsp;&nbsp;</td>
		</tr>
		<tr>
			<td>&nbsp;&nbsp;</td>

			<td><html:submit property="btnSearchSchedule"
					value="Search Schedule" styleClass="btn btn-info" /> &nbsp; &nbsp;
				<html:submit property="btnSearchScheduleCancel" value="Cancel"
					styleClass="btn btn-info" /></td>
		</tr>



	</table>


	<br>
	<br>



</html:form>


<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>

<%@ include file="inc/footer.jsp"%>



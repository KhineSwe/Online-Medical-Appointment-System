<%@ include file="inc/common.jsp"%>
<%@ include file="inc/headerhome.jsp"%>


<br /><br />
<div class="container col-sm-12">
	<div class="row">
<!-- 
<h4><i><b><a href="SerchbyDNH.do">Back</a></b></i></h4> -->
<br>


<html:form>
	<logic:notEmpty property="frmAppointListAll"
		name="AppointmentListFormBean">
		<center><h4><font color="green">Number of Appointment: (${AppointmentListFormBean.frmAppointListAll.size()})</font></h4></center>

		<table style="border-collapse: collapse" class="table table-hover table-responsive"
			border="0" align="center">




			<tr class="success">
				<th>No</th>
				<th>Hospital Name</th>
				<th>Doctor Name</th>
				<th>Patient Name</th>

				<th>Gender</th>
				<th>Phone no:</th>
				<th>Date</th>
				




			</tr>
			<c:forEach var="i" begin="${AppointmentListFormBean.begin}"
				end="${AppointmentListFormBean.end}" step="1">

				<tr>
					<td>${i}</td>
					<td>${AppointmentListFormBean.frmAppointListAll[i-1].hosname}</td>

					<td>${AppointmentListFormBean.frmAppointListAll[i-1].dname}</td>
					<td>${AppointmentListFormBean.frmAppointListAll[i-1].pname}</td>

					<td>${AppointmentListFormBean.frmAppointListAll[i-1].pgender}</td>
					<td>${AppointmentListFormBean.frmAppointListAll[i-1].pphno}</td>
					<td>${AppointmentListFormBean.frmAppointListAll[i-1].schdate}</td>





				</tr>
			</c:forEach>
		</table>

		<table align="center">
			<tr>
				<td>
					<div align="center">
						<c:if test="${AppointmentListFormBean.prev1Btn}">
                                   <html:submit property="prev1"
								value="&lt;&lt;Previous" styleClass="btn btn-info">
							</html:submit>
						</c:if>
				</td>
				<td>&nbsp;&nbsp;</td>
				<td>&nbsp;&nbsp;</td>
				<td>
					<div align="center">
						<c:if test="${AppointmentListFormBean.next1Btn}">
							<html:submit property="next1" value="Next&gt;&gt;"
								styleClass="btn btn-info">
							</html:submit>
              											</c:if>
				</td>
			</tr>
		</table>

		<!-- to carry the actual page -->

		<html:hidden property="actualPage" name="AppointmentListFormBean" />
		<html:hidden property="frmControl" name="AppointmentListFormBean"
			value="1" />
	</logic:notEmpty>
</html:form>

		</div>
</div>


<%@ include file="inc/footer.jsp"%>


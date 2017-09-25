<%@ include file="inc/common.jsp"%>
<%@ include file="inc/headerhome.jsp"%>

<br />
<br />
<center>
			<h3>
				<font color="green">Appointment List</font>
			</h3>
		</center>
<div class="container col-sm-12">
	<div class="row">

		<html:form action="/SerchbyDNH">
		<center><font color='red'> <html:errors
								property="ChooseHospitaNDoctor" /> <html:errors
								property="HospitalNDoctorError" />
					</font></center>

			<%-- <p>
		<font color='red'> <html:errors property="ChooseHospitaNDoctor" />
			<html:errors property="HospitalNDoctorError" />
		</font>
	</p>
 --%>
			<table align="center">
			<%-- 	<tr>
				<td>&nbsp;&nbsp;</td>
					<td><font color='red'> <html:errors
								property="ChooseHospitaNDoctor" /> <html:errors
								property="HospitalNDoctorError" />
					</font></td>
				</tr>
 --%>

				<tr>

					<th>Hospital:</th>
					<td><html:select property="frmHospitalID"
							styleClass="form-control">
							<html:option value="0">SELECT</html:option>
							<html:optionsCollection property="frmHosList" value="id"
								label="hosname" />
						</html:select></td>


				</tr>
				<tr>
					<td>&nbsp;&nbsp;</td>
					<td>&nbsp;&nbsp;</td>
				</tr>


				<tr>

					<th>Doctor:</th>
					<td><html:select property="frmDoctorID"
							styleClass="form-control">
							<html:option value="0">SELECT</html:option>
							<html:optionsCollection property="frmDoctorList" value="id"
								label="dname" />
						</html:select></td>
					<td>&nbsp;&nbsp;</td>

					<td><html:submit property="search" value="Search"
							styleClass="btn btn-info">
						</html:submit></td>



				</tr>

				<%-- <tr>
			<td><html:submit property="search" value="Search"
					styleClass="btn btn-info">
				</html:submit></td>
		</tr> --%>

			</table>

		</html:form>
		<br>
		<br>





		<html:form>
			<logic:notEmpty property="frmSearchAppointmentlist"
				name="AppointmentListFormBean">
				<center>
					<h4>
						<font color="green">Number of Appointment:
							(${AppointmentListFormBean.frmSearchAppointmentlist.size()})</font>
					</h4>
				</center>
				<table style="border-collapse: collapse" class="table table-hover"
					border="0" align="center">




					<tr class="success">
						<th>No</th>
						<th>Hospital Name</th>
						<th>Doctor Name</th>
						<th>Date</th>
						<th>List View</th>




					</tr>
					<c:forEach var="i" begin="${AppointmentListFormBean.begin}"
						end="${AppointmentListFormBean.end}" step="1">

						<tr>
							<td>${i}</td>
							<td>${AppointmentListFormBean.frmSearchAppointmentlist[i-1].hosname}</td>

							<td>${AppointmentListFormBean.frmSearchAppointmentlist[i-1].dname}</td>
							<td>${AppointmentListFormBean.frmSearchAppointmentlist[i-1].schdate}</td>


							<td><a
								href="appointDetailPath.do?frmHospitalName=${AppointmentListFormBean.frmSearchAppointmentlist[i-1].hosname}&frmschdate=${AppointmentListFormBean.frmSearchAppointmentlist[i-1].schdate}&frmDoctorName=${AppointmentListFormBean.frmSearchAppointmentlist[i-1].dname}&frmControl=2">
									Appointment List </a></td>


						</tr>
					</c:forEach>
				</table>

				<table align="center">
					<tr>
						<td>
							<div align="center">
								<c:if test="${AppointmentListFormBean.prevBtn}">
                                   <html:submit property="prev"
										value="&lt;&lt;Previous" styleClass="btn btn-info">
									</html:submit>
								</c:if>
						</td>
						<td>&nbsp;&nbsp;</td>
						<td>&nbsp;&nbsp;</td>
						<td>
							<div align="center">
								<c:if test="${AppointmentListFormBean.nextBtn}">
									<html:submit property="next" value="Next&gt;&gt;"
										styleClass="btn btn-info">
									</html:submit>
              											</c:if>
						</td>
					</tr>
				</table>

				<!-- to carry the actual page -->


				<html:hidden property="actualPage" name="AppointmentListFormBean" />
			</logic:notEmpty>
			<html:hidden property="frmControl" name="AppointmentListFormBean"
				value="1" />
		</html:form>
	</div>
</div>



<%@ include file="inc/footer.jsp"%>


<%@ include file="inc/common.jsp"%>
<%@ include file="inc/headerhome.jsp"%>

<div class="container col-sm-12">
	<div class="row">
	<br><br>
		<center>
			<h4>
				<font color="red">There is No Appointment List</font>
			</h4>
		</center>





		<html:form action="/SerchbyDNH">
		<font color='red'> <html:errors
								property="ChooseHospitaNDoctor" /> <html:errors
								property="HospitalNDoctorError" />
					</font>

			<%-- <p>
			<font color='red'>
			<html:errors property="ChooseHospitaNDoctor" />
		
			<html:errors property="HospitalNDoctorError" />
		</font>
		</p> --%>

			<br />
			<br />
			<table  align="center">
<%-- 
				<tr>
				
					<td><font color='red'> <html:errors
								property="ChooseHospitaNDoctor" /> <html:errors
								property="HospitalNDoctorError" />
					</font></td>
				</tr> --%>


				<tr>

					<td>Hospital:</td>
					<td><html:select property="frmHospitalID"
							styleClass="form-control">
							<html:option value="0">SELECT</html:option>
							<html:optionsCollection property="frmHosList" value="id"
								label="hosname" />
						</html:select></td>


				</tr>

				<tr>
					<td>&nbsp;</td>
					<td>&nbsp;</td>
				</tr>
				<tr>

					<td>Doctor:</td>
					<td><html:select property="frmDoctorID"
							styleClass="form-control">
							<html:option value="0">SELECT</html:option>
							<html:optionsCollection property="frmDoctorList" value="id"
								label="dname" />
						</html:select></td>


				</tr>
				<tr>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				</tr>


				<tr>
					<td></td>
					<td align="center">
					<html:submit property="search" value="Search"
							styleClass="btn btn-info">
						</html:submit></td>

				</tr>

			</table>

		</html:form>

	</div>
</div>


<%@ include file="inc/footer.jsp"%>


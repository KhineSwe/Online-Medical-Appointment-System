<%@ include file="inc/common.jsp"%>
<%@ include file="inc/headerhome.jsp"%>

<table >
	
	<tr>
		<td>
		<h3 align="center">Patient Detail</h3>
		<html:form action="/autoComplementPath">
			<table >
				<tr>
					<th>Patient Name:</th>
					<td>${PatientListFormBean.frmPatientDetail.pname}
					</td>
				</tr>
				<tr>
					<th>Email Address:</th>
					<td>${PatientListFormBean.frmPatientDetail.pemail}</td>
				</tr>
				<tr>
					<th>Blood Type:</th>
					<td>${PatientListFormBean.frmPatientDetail.pblood}
					</td>
				</tr>
				<tr>
					<th>Status:</th>
					<td><c:if test="${PatientListFormBean.frmPatientDetail.pstatus==0}">
											inactive</c:if>
					<c:if test="${PatientListFormBean.frmPatientDetail.pstatus==1}">active</c:if>
					</td>
					
				</tr>
				<tr>
					<td colspan="2" align="center"><html:submit property="btnOk"
						value="OK"></html:submit></td>
				</tr>
			</table>
		</html:form></td>
	</tr>
</table>
<br><br><br>
<%@ include file="inc/footer.jsp"%>

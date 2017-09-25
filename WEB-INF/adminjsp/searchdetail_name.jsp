<%@ include file="inc/common.jsp"%>
<%@ include file="inc/headerhome.jsp"%>

<br /><br />
<div class="container col-sm-12">
	<div class="row">
<table align="center" width="60%">

	<tr>

		<td>
			<h3 align="center">
				<font color="green">Patient Detail</font>
			</h3>
			<br>
				<html:form action="/detailPath">
					<table class="table table-hover">

						<tbody>
							<tr>
								<th>Patient Name:</th>
								<td>${PatientListFormBean.frmPatientListDetail.pname}</td>
							</tr>
							<tr>
								<th>Email Address:</th>
								<td>${PatientListFormBean.frmPatientListDetail.pemail}</td>
							</tr>
							<tr>
								<th>Blood Type:</th>
								<td>${PatientListFormBean.frmPatientListDetail.pblood}</td>
							</tr>
								<tr>
					<th>Status:</th>
					<td><c:if test="${PatientListFormBean.frmPatientListDetail.pstatus==0}">
											inactive</c:if>
					<c:if test="${PatientListFormBean.frmPatientListDetail.pstatus==1}">active</c:if>
					</td>
					
				</tr>
							<tr>
								<td colspan="2" align="center"><html:submit
										property="btnOk" value="OK" styleClass="btn btn-info"></html:submit></td>
							</tr>
					</table>
				</html:form>
		</td>
	</tr>
</table>

	</div>
</div>
<%@ include file="inc/footer.jsp"%>

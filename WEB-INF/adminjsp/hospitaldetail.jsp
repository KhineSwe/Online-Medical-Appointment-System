<%@ include file="inc/common.jsp"%>
<%-- <%@ include file="inc/header.jsp"%> --%>
<%@ include file="inc/headerhome.jsp"%>
<br />
<div class="panel-body col-sm-12" align="center">
	<div class="col-sm-3"></div>
	<div class="col-sm-6">
		<h3 align="center">
			<font color="green">Hospital Detail</font>
		</h3>
		<br />
		<html:form action="/HospitalDetailPath">

			<table class="table table-hover">

				<tbody>
					<tr>
						<th>Hospital Name:</th>
						<td>${HospitalSearchFormBean.frmHospitalDetail.hosname}</td>
					</tr>
					<tr>
						<th>Address:</th>
						<td>${HospitalSearchFormBean.frmHospitalDetail.hosaddress}</td>
					</tr>

					<tr>
						<td colspan="2" align="center"><html:submit property="btnOk"
								value="OK" styleClass="btn btn-info"></html:submit></td>
					</tr>
				</tbody>
			</table>
		</html:form>
	</div>
	<div class="col-sm-3"></div>
</div>
<%@ include file="inc/footer.jsp"%>

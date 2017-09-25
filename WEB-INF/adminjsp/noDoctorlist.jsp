<%@ include file="inc/common.jsp"%>
<%@ include file="inc/headerhome.jsp"%>
<%@ include file="inc/headerforDoctorAjax.jsp"%>

<body onload="DWRUtil.useLoadingMessage(); createAutoCompleter()">
	<div class="container col-sm-12">
		<div class="row">
<br>

			<html:form action="/doctorlistByHosnameSearchPath">
				<table align="center">

					<th>Hospital Name:</th>
					<td><html:text property="frmHospitalName"
							styleId="frmHospitalName1" style="z-index:100;"
							styleClass="form-control" />
						<div class="choices" id="choices1"></div></td>
						<td>&nbsp;</td>
					<td><html:submit property="btnSearch" value="Search"
							styleClass="btn btn-info">
						</html:submit></td>
				</table>
			</html:form>
		
	<br>
	<br>

<center>
	<h4><font color="red">Sorry, There is no doctor in ${DoctorListFormBean.frmHospitalName}</font></h4>	
	</center>

	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	</div>
	</div>
	</body>
	
<%@ include file="inc/footer.jsp"%>
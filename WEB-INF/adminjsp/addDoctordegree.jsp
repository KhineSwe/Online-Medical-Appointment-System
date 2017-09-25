<%@include file="inc/common.jsp"%>
<%@ include file="inc/headerhome.jsp"%>
<html>
<head>
<title>Registration Page</title>
<link href="css/library.css" rel="stylesheet" type="text/css">
</head>
<body>
	
	<h3 align="center"><font color="green">Doctor Registration</font></h3> <br>
	
	<html:form
		enctype="multipart/form-data">
		<center><font color="red"><html:errors property="PleaseChoose" />
	<html:errors property="SmallersizeChoose" /></font></center>
			<table align="center" border="0" class="table-responsive" style="line-height: 250%;">
			
			
			<tr>
				<th>Doctor Name:</th>
				<td>${DoctorRegFormBean.frmDoctorID.dname}</td>
			</tr>


				<tr>
					<th>Specialize:</th>
					<td>${DoctorRegFormBean.frmDoctorID.spid.specializetype}</td>
				</tr>
				<tr>
					<th>Email:</th>
					<td>${DoctorRegFormBean.frmDoctorID.demail}</td>
				</tr>

			 <tr>
					<th>Phone:</th>
					<td>${DoctorRegFormBean.frmDoctorID.dphno}</td>
				</tr>
				<tr>
					<th>Address:</th>
					<td>${DoctorRegFormBean.frmDoctorID.daddress}</td>
				</tr>

				<tr>
					<th>Gender:</th>
					<td>${DoctorRegFormBean.frmDoctorID.dgender}
						</td>
				</tr>
				
				 
				
		
				<tr>
					<th>Degree:</th>
					<td><html:file property="frmUploadFile" /></td>
					<td><html:submit property="btnaddImage" value="Add Degree" styleClass="btn btn-info"></html:submit></td>
	<td></td>
                 </tr>
                 <tr>
                 <td></td>
                 <%-- <td><font color="red"><html:errors property="PleaseChoose" />
	<html:errors property="SmallersizeChoose" /></font></td> --%>
                 </tr>
                
				<tr>
					<td colspan="2" align="center"><html:submit property="btnOK"
							value="Next" styleClass="btn btn-info">
						
						</html:submit></td>
						<td></td>
				</tr>
			</table>
	
	</html:form>
	<%@ include file="inc/footer.jsp"%>
</body>
</html>
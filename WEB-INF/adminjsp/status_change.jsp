<%@ include file="inc/common.jsp"%>
<html>
<head>
<title>Framework Home Page</title>
<link href="css/library.css" rel="stylesheet" type="text/css">
</head>
<body>
	<h3 align="center">Previous Next Button Page</h3>
	<hr>
	<table border="1" width="100%">
		<%@ include file="inc/logout.jsp"%>
		<tr>
			<%@ include file="inc/left_menu.jsp"%>
			<td>
				<h3 align="center">Status Change Info</h3> <html:form
					action="/statusChangePath">
					<logic:notEmpty property="frmPatientList"
						name="PatientListFormBean">
						<p>
							<font color="red">${PatientListFormBean.frmStatusChangeErr}</font>
						</p>
						<table align="center" border="1">
							<tr>
								<td>No</td>
								<td>Patient Name</td>
								<td>Email Address</td>
								<td>Gender</td>
								<td>Status</td>
								<td></td>
							</tr>
							<c:forEach var="i" begin="${PatientListFormBean.begin}"
								end="${PatientListFormBean.end}" step="1">
								<tr>
									<td>${i}</td>
									<td>${PatientListFormBean.frmPatientList[i-1].pname}</td>
									<td>${PatientListFormBean.frmPatientList[i-1].pemail}</td>
									<td>${PatientListFormBean.frmPatientList[i-1].pgender}</td>


									<c:if
										test="${PatientListFormBean.frmPatientList[i-1].pstatus==0 }">
										<td>inactive</td>
										<td><a
											href="NamedetailPath.do?frmDetailPatientId=${PatientListFormBean.frmPatientList[i-1].id}&frmControl=2">
												Detail</a></td>

										<td><font color="brown">Change Status</font></td>

									</c:if>
									<c:if
										test="${PatientListFormBean.frmPatientList[i-1].pstatus==1 }">
										<td>active</td>


										<td><a
											href="detailPath.do?
								frmDetailPatientId=${PatientListFormBean.frmPatientList[i-1].id}&frmControl=2">
												Detail</a></td>
										<td><a
											href="statusChangePath.do?frmDetailStatusId=${PatientListFormBean.frmPatientList[i-1].id}&frmControl=3">
												Change Status</a></td>
									</c:if>
							</c:forEach>
						</table>
						<!-- next and previous button control here -->
						<table align="center">
							<tr>
								<td>
									<div align="center">
										<c:if test="${PatientListFormBean.prevBtn}">
                                   <html:submit property="prev"
												value="&lt;&lt;Previous">
											</html:submit>
										</c:if>
									</div>
								</td>
								<td>
									<div align="center">
										<c:if test="${PatientListFormBean.nextBtn}">
											<html:submit property="next" value="Next&gt;&gt;">
											</html:submit>
              			</c:if>
									</div>
								</td>
							</tr>
						</table>
						<!-- to carry the actual page -->
						<html:hidden property="actualPage" name="PatientListFormBean" />
					</logic:notEmpty>
					<html:hidden property="frmControl" name="PatientListFormBean"
						value="1" />
				</html:form>
			</td>
		</tr>
	</table>
	<br><br><br><br>
	<%@ include file="inc/footer.jsp"%>

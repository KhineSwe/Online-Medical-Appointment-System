<%@ include file="inc/common.jsp"%>
<%@ include file="inc/headerhome.jsp"%>
<%@ include file="inc/headerforDoctorAjax.jsp"%>

<br /><br />
<body onload="DWRUtil.useLoadingMessage(); createAutoCompleter()">
	<div class="container col-sm-12">
		<div class="row">

			<div class="panel-body" align="center">
				<html:form action="/doctorlistByHosnameSearchPath">
					<table>
						<th>Hospital Name:</th>
						<td>&nbsp;&nbsp;</td>
						<td><html:text property="frmHospitalName"
								styleId="frmHospitalName1" 
								styleClass="form-control" maxlength="29" size="30"/>
							<div class="choices" id="choices1" style="z-index:100; height:60px; overflow-y:scroll; overflow-x:hidden;"></div></td>
							<td>&nbsp;&nbsp;</td>
						<td><html:submit property="btnSearch" value="Search"
								styleClass="btn btn-info">
							</html:submit></td>
					</table>
				</html:form>


				<br>
			<div style="width:100%;" >


				<html:form action="/doctorlistPath">
					<logic:notEmpty property="frmDoctorList" name="DoctorListFormBean">
						
                          
								<p>
									<font color="red"><html:errors
											property="changedoctStatuserror" /></font>
								</p>
								<h4><font color="green">Number of Doctor: (${DoctorListFormBean.frmDoctorList.size()})</font></h4>
								<!-- <table class="table-hover"  align="center" >
									<tr style="background-color:#D0E9C6;"> -->
									<table style="border-collapse: collapse"
								class="table table-hover" border="0" align="center">
								<tr class="success">
									
										<th>No</th>
										<th>Name</th>
										<th>Specialize</th>
										<th>Hospital</th>
										<th>Email</th>
										<th>Gender</th>
										<th>Phone No</th>
										
										<th>Status</th>
										<th></th>


									</tr>
									<c:forEach var="i" begin="${DoctorListFormBean.begin}"
										end="${DoctorListFormBean.end}" step="1">

										<tr>
											<td>${i}</td>
											<td>${DoctorListFormBean.frmDoctorList[i-1].dname}</td>
											<td>${DoctorListFormBean.frmDoctorList[i-1].specializetype}</td>
											<td>${DoctorListFormBean.frmDoctorList[i-1].hosname}</td>
											<td>${DoctorListFormBean.frmDoctorList[i-1].demail}</td>
											<td>${DoctorListFormBean.frmDoctorList[i-1].dgender}</td>
											<td>${DoctorListFormBean.frmDoctorList[i-1].dphno}</td>
											
											<c:if
												test="${DoctorListFormBean.frmDoctorList[i-1].dstatus==0}">
												<td>inactive</td>
												<td><font color="brown">Change Status</font></td>
											</c:if>



											<c:if
												test="${DoctorListFormBean.frmDoctorList[i-1].dstatus==1}">
												<td>active</td>

												<td><a
													href="doctorlistDetailPath.do?frmDoctorId=${DoctorListFormBean.frmDoctorList[i-1].id}&frmControl=2">
														Change Status</a></td>
											</c:if>
										</tr>
									</c:forEach>
								</table>

								<table align="center">
									<tr>
										<td>
											<div align="center">
												<c:if test="${DoctorListFormBean.prevBtn}">
                                   <html:submit property="prev"
														value="&lt;&lt;Previous" styleClass="btn btn-info">
													</html:submit>
												</c:if>
											</div>
										</td>
										<td></td>
										<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
										<td>&nbsp;</td>
										<td>
											<div align="center">
												<c:if test="${DoctorListFormBean.nextBtn}">
													<html:submit property="next" value="Next&gt;&gt;" styleClass="btn btn-info">
													</html:submit>
              											</c:if>
											</div>
										</td>
									</tr>
								</table>
						




						<!-- to carry the actual page -->
						<html:hidden property="actualPage" name="DoctorListFormBean" />
					</logic:notEmpty>
					<html:hidden property="frmControl" name="DoctorListFormBean"
						value="1" />
				</html:form>
				
				</div>
				
				
			</div>
		</div>
	</div>
</body>
	<%@ include file="inc/footer.jsp"%>
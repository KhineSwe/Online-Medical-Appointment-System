<%@ include file="inc/common.jsp"%>
<%@ include file="inc/headerafterlogin.jsp"%>

	<div class="container">
		<div class="row">
			<div class="panel-body col-sm-2"></div>
			<div class="panel-body col-sm-8">
			
		
		<h3> Appointment List</h3>
			
			<html:form>
							<logic:notEmpty property="frmHospitalList"
								name="AppointmentFormBean">
								<div class="panel-body col-sm-12" align="center">

									<div class="col-sm-1"></div>
									<div class="col-sm-10">
  
										<table style="border-collapse: collapse"
											class="table table-hover" border="0" align="center">
											<tr class="success">
												<th>No</th>
												<th>Hospital Name</th>
										
												
												<td>Appointment List</td>

											</tr>
											<c:forEach var="i" begin="${AppointmentFormBean.begin}"
												end="${AppointmentFormBean.end}" step="1">

												<tr>
													<td>${i}</td>
													<td>${AppointmentFormBean.frmHospitalList[i-1].hosname}</td>
													
												
													<%-- <td><a
														href="hospitallistDetailPath.do?frmDetailHospitalId=${AppointmentFormBean.frmHospitalList[i-1].hosname}&frmControl=2">
															Detail</a></td> --%>
												 <td><a
														href="noOfappointDetailPath.do?frmDetailHospitalId=${AppointmentFormBean.frmHospitalList[i-1].hosname}&frmControl=2">
															Appointment List </a></td>
												
												
												</tr>
											</c:forEach>
										</table>

										<table align="center">
											<tr>
												<td>
													<div align="center">
														<c:if test="${AppointmentFormBean.prevBtn}">
                                   <html:submit property="prev"
																value="&lt;&lt;Previous" styleClass="btn btn-info">
															</html:submit>
														</c:if>
													</div>
												</td>
												<td>
													<div align="center">
														<c:if test="${AppointmentFormBean.nextBtn}">
															<html:submit property="next" value="Next&gt;&gt;" styleClass="btn btn-info">
															</html:submit>
              											</c:if>
													</div>
												</td>
											</tr>
										</table>
										</div>
								</div>
					
		
</div>
		<!-- to carry the actual page -->
		
	
		<html:hidden property="frmControl" name="AppointmentFormBean"
			value="1" />
				</logic:notEmpty>
		</html:form>	
		
			<html:hidden property="actualPage" name="AppointmentFormBean" />
		
			
		



</div>
</div>




	<%@ include file="inc/footer.jsp"%>

<%@include file="inc/common.jsp"%>
<%@ include file="inc/headerhome.jsp"%>
<%@ include file="inc/headforCategory.jsp"%>
<%@ include file="inc/calendar.jsp"%>

	<div class="container">
		<div class="row">					
			
				<h3>Doctor Schedule</h3>

				<div class="panel-body col-sm-2"></div>
				<div class="panel-body col-sm-8">
				
					<div class="col-sm-12" align="center">
					<!--  start dtschedule  -->
					<div id="dtschedule">
						<table border="0">
							<tr>

								<th>Hospital : </th>
								<td colspan="2">${ScheduleFormBean.frmHosname.hosname}</td>
								<td> </td>
							</tr>
							<tr>
								<td>&nbsp;&nbsp;</td><td>&nbsp;&nbsp;</td><td>&nbsp;&nbsp;</td><td>&nbsp;&nbsp;</td>
							</tr>
							<tr>
								<th>Specialize Field : </th>
								<td colspan="2">${ScheduleFormBean.frmSpecname.specializetype}</td>
								<td>&nbsp;&nbsp;</td>
							</tr>
							<tr>
								<td>&nbsp;&nbsp;</td><td>&nbsp;&nbsp;</td><td>&nbsp;&nbsp;</td><td>&nbsp;&nbsp;</td>
							</tr>	
						
						
						<html:form action="/SearchByDate">
						
							<tr>
									<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
									<td><html:errors property="Date" /></td>
								</tr>
							
								<tr>
									<th>Search By Date: &nbsp;&nbsp; </th>

									<td><html:text property="scheduledate" styleId="calendar"
											styleClass="form-control" readonly="true">
										</html:text></td>
									
									<td>&nbsp;&nbsp;<html:image src="images/calendar.gif"
											styleId="trigger"
											style="cursor: pointer; border: 3px solid red;"
											title="Date selector"
											onmouseover="this.style.background='red';"
											onmouseout="this.style.background=''"></html:image> <script
											type="text/javascript">
												//
												Calendar.setup({
													firstDay : 1,
													electric : false,
													singleClick : true,
													inputField : "calendar",
													button : "trigger",
													ifFormat : "%Y-%m-%d",
													daFormat : "%Y-%m-%d"
												});
												//
											</script></td>
											<td><font color="red">***</font></td>
											
								</tr>
								<tr>
								<td></td>
									<td><br /><html:submit property="btnSearch" value="Search"
											styleClass="btn btn-info"></html:submit></td>
								<td></td><td></td>
								</tr>

							</table><br />
							<%-- <table>
								<tr>
									<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
									<td><html:errors property="Date" /></td>
								</tr>


							</table> --%>
							
							</html:form>
					</div>
					<!--  end dtschedule  -->
					
					</div>

			<!-- Search form  -->
					<h4>${ScheduleFormBean.frmDocname.dname}'s schedule</h4>
					<html:form method="post" action="/scheduleDetailPath">

						<logic:notEmpty property="frmScheduleList" name="ScheduleFormBean">
							<table class="table table-hover" border="0">

								<tbody>

									<tr class="success">
										<th>Date</th>
										<th colspan="2">From Time (Hour)</th>
										<th colspan="2">End Time (Hour)</th>
										<th> Booking </th>
									</tr>

									<c:forEach var="i" begin="${ScheduleFormBean.begin}"
										end="${ScheduleFormBean.end}" step="1">


										<tr>
											<td>${ScheduleFormBean.frmScheduleList[i-1].schdate}</td>


											<c:if
												test="${ScheduleFormBean.frmScheduleList[i-1].schstarttime<=12}">


												<td><c:out
														value="${ScheduleFormBean.frmScheduleList[i-1].schstarttime}" />:00
												</td>
												<td>AM</td>

											</c:if>


											<c:if
												test="${ScheduleFormBean.frmScheduleList[i-1].schstarttime>12}">

												<td><c:out
														value="${ScheduleFormBean.frmScheduleList[i-1].schstarttime-12}" />:00
												</td>
												<td>PM</td>

											</c:if>


											<c:if
												test="${ScheduleFormBean.frmScheduleList[i-1].schfinishtime>12}">

												<td><c:out
														value="${ScheduleFormBean.frmScheduleList[i-1].schfinishtime-12}" />:00</td>
												<td>PM</td>
											</c:if>

											<c:if
												test="${ScheduleFormBean.frmScheduleList[i-1].schfinishtime<=12}">

												<td><c:out
														value="${ScheduleFormBean.frmScheduleList[i-1].schfinishtime}" />:00</td>
												<td>AM</td>
											</c:if>

											<td><a
												href="scheduleDetailPath.do?frmScheduleId=${ScheduleFormBean.frmScheduleList[i-1].id}&frmFormControl=2">
													Book </a></td>
										</tr>
									</c:forEach>

									<center>
										<html:errors property="outofmaxno" />
										<html:errors property="alreadymakeapp" />
									</center>




									<tr>
										<td colspan="3" align="right">
											<div>
												<c:if test="${ScheduleFormBean.prevBtn}">
                                   <html:submit property="prev"
														value="&lt;&lt;Previous " styleClass="btn btn-info">
													</html:submit>
												</c:if>
											</div>
									</td>
									<td colspan="3" align="left">
											<div>
												<c:if test="${ScheduleFormBean.nextBtn}">
													<html:submit property="next" value="Next &gt;&gt;"
														styleClass="btn btn-info">
													</html:submit>
              			</c:if>
											</div>
										</td>
									</tr>
								</tbody>
							</table>

							<html:hidden property="actualPage" name="ScheduleFormBean" />
							<html:hidden property="frmFormControl" name="ScheduleFormBean"
								value="1" />

						</logic:notEmpty>
					</html:form>
				</div>
				<div class="panel-body col-sm-2"></div>
				
				<!--  start dtrating -->
					<div id="dtrating" class="col-sm-12" align="center">

						
						<c:if test="${ScheduleFormBean.myratingValue.rateValue!=null}">
							<html:form action="/Rating">

								<table>
									<tr>
										<td><html:hidden property="rating"
												value="${ScheduleFormBean.myratingValue.rateValue }"
												styleId="rating_simple2" /></td>
									</tr>
									<tr>
										<td>&nbsp;</td>
									</tr>
									<tr>
										<td><html:textarea property="description"
												value="${ScheduleFormBean.myratingValue.description }"
												styleClass="form-control" styleId="comment" disabled="true"
												style="resize: none;" />
												</td>
									</tr>
									<tr>
										<td><br />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <html:submit styleClass="btn btn-info"
												disabled="true"> Rate </html:submit></td>
									</tr>
								</table>
							</html:form>

						</c:if>
						<br>

						

						<!-- 	for rating	 -->
						<c:if test="${ScheduleFormBean.appRate.pid==null }">
							<html:form action="/Rating">
								<div style="color: red;">
									<h4>
										&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Please make an appointment first to give a rating!
										</h4>
								</div>
								<table border="0">
									<tr>
										<td><html:hidden property="rating" value=""
												styleId="rating_simple2" /></td>
									</tr>
									<tr>
										<td>&nbsp;</td>
									</tr>
									<tr>
										<td><html:textarea property="description" value=""
												styleClass="form-control" styleId="comment" disabled="true"
												style="resize: none;" />
										</td>
									</tr>
									<tr>
										<td><br /> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:submit styleClass="btn btn-info"
												disabled="true"> Rate </html:submit></td>
									</tr>
								</table>
							</html:form>
						</c:if>
						<%-- ${ScheduleFormBean.appRate.pid} --%>
						<h4><html:errors property="noRatingerror"/></h4>
						<c:if
							test="${ScheduleFormBean.appRate.pid!=null &&  ScheduleFormBean.myratingValue.rateValue==null}">
							<%-- && ${ScheduleFormBean.myratingValue.rateValue==null} --%>


							<html:form action="/Rating">

								<table>
									<tr>
										<td><html:hidden property="rating" value=""
												styleId="rating_simple2" /></td>
									</tr>
									<tr>
										<td>&nbsp;</td>
									</tr>
									<tr>
										<td><html:textarea property="description" value=""
												styleClass="form-control" styleId="comment"
												style="resize: none;" /></td>
									</tr>
									<tr>
										<td><br />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <html:submit styleClass="btn btn-info" > Rate </html:submit>
										</td>
									</tr>
								</table>
							</html:form>

						</c:if>

					</div>
					<!--  End dtrating  -->
					
					
		</div>		
	</div>
	

	<%@ include file="inc/footer.jsp"%>

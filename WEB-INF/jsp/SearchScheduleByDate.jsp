<%@include file="inc/common.jsp"%>
<%@ include file="inc/headerhome.jsp"%>
<%@ include file="inc/headforCategory.jsp"%>
<%@ include file="inc/calendar.jsp"%>

<body>
	<div class="container">

		<div class="row">
				<h3>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Search Schedule by Date</h3>

				<div class="panel-body col-sm-4"></div>
				<div class="panel-body col-sm-6">

					<table>
						<tr>

							<th>Hospital :</th>
							<td>${ScheduleFormBean.frmHosname.hosname}</td>
						</tr>
						<tr>
							<td>&nbsp;&nbsp;</td>
						</tr>
						<tr>
							<th>Specialize Field:</th>
							<td>${ScheduleFormBean.frmSpecname.specializetype}</td>
						</tr>
						<tr>
							<td>&nbsp;&nbsp;</td>
						</tr>
					<html:form action="/SearchByDate">
							<tr>
								<th>Search By Date</th>
								<td><html:text property="scheduledate" styleId="calendar"
										styleClass="form-control" readonly="true">
									</html:text></td>
								<td>&nbsp;&nbsp;</td>
								<td><html:image src="images/calendar.gif" styleId="trigger"
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
								<td><html:submit property="btnSearch" value="Search"
										styleClass="btn btn-info"></html:submit></td>
							</tr>



						</table><br /><br />
						<h4>${ScheduleFormBean.frmDocname.dname}'s schedule</h4>
					</html:form>


				</div>
		</div>


		<div class="container">

			<div class="row">

				<div class="panel-body col-sm-4"></div>
				<div class="panel-body col-sm-6">


					<html:form>

						<table class="table table-hover">

							<tbody>

								
								<tr class="success">
									<th>Date</th>
									<th>From Time (Hour)</th>
									<th></th>
									<th>End Time (Hour)</th>
									<th></th>

									<th></th>
								</tr>
								<tr>
									<td>${ScheduleFormBean.frmScheduleDate.schdate}</td>


									<c:if
										test="${ScheduleFormBean.frmScheduleDate.schstarttime<12}">

										<td><c:out
												value="${ScheduleFormBean.frmScheduleDate.schstarttime}" />:00</td>

										<td>AM</td>
									</c:if>


									<c:if
										test="${ScheduleFormBean.frmScheduleDate.schstarttime>12}">

										<td><c:out
												value="${ScheduleFormBean.frmScheduleDate.schstarttime-12}" />:00</td>

										<td>PM</td>
									</c:if>



									<c:if
										test="${ScheduleFormBean.frmScheduleDate.schfinishtime>12}">

										<td><c:out
												value="${ScheduleFormBean.frmScheduleDate.schfinishtime-12}" />:00</td>

										<td>PM</td>
									</c:if>

									<c:if
										test="${ScheduleFormBean.frmScheduleDate.schfinishtime<12}">

										<td><c:out
												value="${ScheduleFormBean.frmScheduleDate.schfinishtime}" />:00</td>

										<td>AM</td>
									</c:if>


									<td><a
										href="scheduleDetailPath.do?frmScheduleId=${ScheduleFormBean.frmScheduleDate.id}&frmFormControl=2">
											Book </a></td>
								</tr>

							</tbody>

						</table>

					</html:form>
				</div>
			</div>
		</div>
		</div>
</body>




<%@ include file="inc/footer.jsp"%>
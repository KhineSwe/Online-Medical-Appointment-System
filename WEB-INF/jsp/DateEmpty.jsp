<%@include file="inc/common.jsp"%>
<%@ include file="inc/headerhome.jsp"%>
<%@ include file="inc/headforCategory.jsp"%>
<%@ include file="inc/calendar.jsp"%>


	<div class="container">

		<div class="row">
				<h3>Search Schedule by Date</h3>

				<div class="panel-body col-sm-4"></div>
				<div class="panel-body col-sm-6">

					<table border="0">
						<tr>

							<th>Hospital :</th>
							<td rowspan="">${ScheduleFormBean.frmHosname.hosname}</td>
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
								<td>&nbsp;&nbsp;</td>
								<td><html:submit property="btnSearch" value="Search"
										styleClass="btn btn-info"></html:submit></td>
							</tr>



						</table>

					</html:form><br />

		<h4 style="color:red;text-align:left;">
					Sorry, there is no available time for <b><i>${ScheduleFormBean.frmDocname.dname}
						 </i></b> at the day you have chosen.
						 Please consider the other days.
			</h4>


				</div>
		</div>
	</div>


	<%@ include file="inc/footer.jsp"%>
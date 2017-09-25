<%@ include file="inc/common.jsp"%>
<%-- <%@ include file="inc/header.jsp"%> --%>
<%@ include file="inc/headerhome.jsp"%>
<br />
<div class="panel-body col-sm-12" align="center">

	<h3 align="center">
		<font color="green">Hospital Information List</font>
	</h3>
	<br />
	<!-- <a href="hospitalPathFirst.do" style="text-decoration: underline">Add
		New Hospital<br /><br /></a>  -->
	<html:form action="/hospitalListPath">
		<logic:notEmpty property="frmHospitalList"
			name="HospitalSearchFormBean">
			<table class="table table-hover table-responsive" align="center" border="0"
				cellpadding="5%">
				<tr class="success">
					<th>No</th>
					<th>Hospital Name</th>
					<th> Detail </th>
					<th> Update </th>
				</tr>
				<c:forEach var="i" begin="${HospitalSearchFormBean.begin}"
					end="${HospitalSearchFormBean.end}" step="1">
					<tr>
						<td>${i}</td>
						<td>${HospitalSearchFormBean.frmHospitalList[i-1].hosname}</td>
						<td><a
							href="HospitalDetailPath.do?
								frmDetailHospitalId=${HospitalSearchFormBean.frmHospitalList[i-1].id}&amp;frmControl=2">
								View Detail</a></td>
						<td><a
							href="HospitalUpdatePath.do?
								frmUpdateHospitalId=${HospitalSearchFormBean.frmHospitalList[i-1].id}&amp;frmControl=3">
								Edit</a></td>


					</tr>
				</c:forEach>
			</table>
			<!-- next and previous button control here -->
			<table align="center">
				<tr>
					<td>
						<div align="center">
							<c:if test="${HospitalSearchFormBean.prevBtn}">
                                   <html:submit property="prev"
									value="&lt;&lt;Previous">
								</html:submit>
							</c:if>
						</div>
					</td>
					<td>
						<div align="center">
							<c:if test="${HospitalSearchFormBean.nextBtn}">
								<html:submit property="next" value="Next&gt;&gt;">
								</html:submit>
              			</c:if>
						</div>
					</td>
				</tr>
			</table>
			<!-- to carry the actual page -->
			<html:hidden property="actualPage" name="HospitalSearchFormBean" />
		</logic:notEmpty>
		<html:hidden property="frmControl" name="HospitalSearchFormBean"
			value="1" />
	</html:form>

</div>

<%@ include file="inc/footer.jsp"%>

<%@include file="inc/common.jsp"%>
<%@ include file="inc/headerhome.jsp"%>
<%@ include file="inc/headforCategory.jsp"%>


<body>
	<div class="container">

		<div class="row">
				<h3>Search Doctor</h3>

				<div class="panel-body col-sm-2"></div>
				<div class="panel-body col-sm-8">




					<html:form method="post" action="/schedulePath">
						<table width='80%'>
							<tr>

								<th>Hospital :</th>
								<td>${AutoFormBean.frmhosname.hosname}</td>
							</tr>
							<td>&nbsp;&nbsp;</td>
							<tr>
								<th>Specialize Field:</th>
								<td>${AutoFormBean.frmspecname.specializetype}</td>
							</tr>
							<td>&nbsp;&nbsp;</td>
							<tr>
								<th>Doctor Name:</th>

								<td><html:select property="frmSpecId" styleClass="form-control">
										<c:forEach var="i" begin="0"
											end="${AutoFormBean.frmDocList.size()-1}" step="1">
											<html:option value="${AutoFormBean.frmDocList[i].id}">
												<c:out value='${AutoFormBean.frmDocList[i].dname}' />
											</html:option>
										</c:forEach>
									</html:select></td>
								<td>&nbsp;&nbsp;</td>

								<td><html:submit property="btnChoose" value="Choose Doctor"
										styleClass="btn btn-info"></html:submit></td>
							</tr>
						</table>


						<br>
						<br>
						<br>
							<table class="table table-hover">
						
							<tbody>
						
							<tr>
								<th>Doctor Names</th>
								<th>Degrees</th>
							</tr>

							<c:forEach var="i" begin="0"
								end="${AutoFormBean.frmDocList.size()-1}" step="1">

								<tr>
									<td>${AutoFormBean.frmDocList[i].dname}</td>
									<td>${AutoFormBean.frmDegreeList[i].degreename}</td>
								</tr>
							</c:forEach>
							</tbody>
						</table>
					</html:form>
				</div>
		</div>
	</div>


	<br>
	<br>
	<br>
	<br>


	<%@ include file="inc/footer.jsp"%>
</body>
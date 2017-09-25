<%@include file="inc/common.jsp"%>
<%@ include file="inc/headerhome.jsp"%>




<br>
<br>
<h3 style="color: green; text-align: center;">Add Specialization to Hospital
		Field</h3>

	<div class="container col-sm-9">

		<div class="row"><body onload="DWRUtil.useLoadingMessage();">


			<!-- <div class="panel-body col-sm-12"></div> -->
			<div class="col-sm-3"></div>
			<div class="panel-body col-sm-9" align="center">
			
				<img src="myimage/d1.png" name="AddspFormBean"
					class="img-responsive">
			</div>
			<div class="panel-body col-sm-12" align="center">
				<br>
				<%-- <html:form action="/adminAddSpe" method="post">


					<table>
					<tr>
					<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
					<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
					<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
					<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>

						<td colspan="12" align="center"><html:submit
								property="addbtn" value="Add New Specialization"
								styleClass="btn btn-info"></html:submit>
							</td>
						</tr>

					</table>
				</html:form> --%>


				<html:form action="/addSptoHos" method="post">



					<html:errors property="NullHos" />

					<html:errors property="NullSpecialize" />
					<br>
					<table>
						<tr>
							<th>Hospital</th>
							<td>&nbsp;&nbsp;</td>
							<td width="200"><html:select property="frmHosId"
									onchange="sendHospital(this[this.selectedIndex].value)"
									styleClass="form-control">
									<html:option value="0">----------Choose----------</html:option>
									<html:optionsCollection property="hospitalChoice" />
								</html:select></td>
						</tr>
						<tr>
							<td>&nbsp;</td>
							<td>&nbsp;</td>
						</tr>
					</table>

					<br>

					<h4	style="margin-left:-100px;">
						<font color="blue">Specialization Field</font>
					</h4>

					<table width="100%" style="font-size: 14px;margin-right: -50%;">

						<tr>

							<td width=30%><c:set var="count" value="0" scope="page" />
								<c:set var="rslt" value="0" scope="page" />
								 <logic:iterate
									name="AddspFormBean" id="sp" property="frmSpeclist">
									<html:multibox property="frmSpeCheckedlist">
										<bean:write name="sp" property="id" />
									</html:multibox>
									<bean:write name="sp" property="specializetype" />
									<c:out value="</td><td width=30% >" escapeXml="false" />
									<c:set var="count" value="${count + 1}" scope="page" />
									<c:set var="rslt" value="${count % 3}" scope="page" />
									<c:if test="${rslt == 0}">
										<c:out value="</tr><tr><td >" escapeXml="false" />
									</c:if>
								</logic:iterate></td>

						</tr>
						<tr>
							<td>&nbsp;&nbsp;</td>
							<td>&nbsp;&nbsp;</td>
						</tr>

						<tr>
							<td colspan="3" align="center"><html:submit
									property="sphosbtn" value="Add Specialization to Hospital"
									styleClass="btn btn-info"></html:submit></td>
						</tr>
						<tr>
							<td colspan="3"><font color="red">${AddspFormBean.frmSpError}</font>
							</td>
						</tr>


					</table>
				</html:form>



			</div>
</body>

		</div>
	</div>
	<br>

	<%@ include file="inc/footer.jsp"%>
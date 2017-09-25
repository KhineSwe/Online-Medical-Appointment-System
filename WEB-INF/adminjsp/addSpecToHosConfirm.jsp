<%@include file="inc/common.jsp"%>
<%@ include file="inc/headerhome.jsp"%>
<br>

<body onload="DWRUtil.useLoadingMessage();" class="col-sm-12">
	<html:form action="/addSptoHosConfirm">
	
		<h4  align="center"><font color="blue">Are
			you sure you want to add these information to the related fields?</font></h4>

		<center>
			<img src="myimage/d5.jpg" name="AddspFormBean" class="img-responsive">
		</center>
		<br />

		<table class="mystable" border="0" >
			<tr>

				<th>To Hospital:</th>

				<th>${AddspFormBean.frmhosname.hosname}</th>
			</tr>

			<tr>

				<td>
				
				<c:set var="count" value="0" scope="page" />
				 <c:set	var="rslt" value="0" scope="page" />
				  <logic:iterate name="AddspFormBean" id="sp" property="frmSpeclist">
						<html:multibox property="frmSpeCheckedlist" disabled="true">
							<bean:write name="sp" property="id" />
						</html:multibox>
						<bean:write name="sp" property="specializetype" />
						
						<c:out value="</td><td>" escapeXml="false" />
						
						<c:set var="count" value="${count + 1}" scope="page" />
						<c:set var="rslt" value="${count % 3}" scope="page" />
						
						<c:if test="${rslt == 0}">
						
							<c:out value="</tr><tr><td>" escapeXml="false" />
							
						</c:if>
					</logic:iterate></td>
			</tr>


			<tr>
				<td colspan="2" align="center"><html:submit
						property="btnConfirm" value="Confirm" styleClass="btn btn-info"></html:submit>
					<html:submit property="btnCancel" value="Cancel"
						styleClass="btn btn-info"></html:submit></td>
			</tr>
		</table>
	</html:form>
</body>

<%@ include file="inc/footer.jsp"%>


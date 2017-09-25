<%@include file="inc/common.jsp"%>
<%@ include file="inc/headerhome.jsp"%>
<br>
<h3>

	<center>
		<font color="green">Please select Specialization name to update!</font>
	</center>

</h3>
<br><br>

<html:form action="/adminUpdateSpe">
	<table align="center">
		<tr>

			<th>Select Specialize Type:</th>
			<td>&nbsp;&nbsp;</td>
			<td><html:select property="frmUpdateSpecialize"
					styleClass="form-control" >
					<c:forEach var="i" begin="0"
						end="${AddspFormBean.frmSpecializeUpdateList.size()-1}" step="1">
						<html:option
							value="${AddspFormBean.frmSpecializeUpdateList[i].id}">
							<c:out
								value='${AddspFormBean.frmSpecializeUpdateList[i].specializetype}' />
						</html:option>
					</c:forEach>
				</html:select></td>
				<td>&nbsp;&nbsp;&nbsp;</td>
			<td><html:submit property="btnSelect" value="Select" styleClass="btn btn-info"/></td>
		</tr>
	</table>
</html:form>




<br><br><br><br><br><br><br><br><br><br><br><br>
<%@ include file="inc/footer.jsp"%>

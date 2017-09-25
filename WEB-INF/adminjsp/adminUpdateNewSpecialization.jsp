<%@include file="inc/common.jsp"%>
<%@ include file="inc/headerhome.jsp"%>
<br>
<h4>

	<center>
		<font color="green">Specialization Update</font>
	</center>

</h4>
<br>
<br>

<html:form action="/updatespe">
	<table align="center" border="0">
		<tr>

			<th>Select Specialize Type:</th>
			<td>&nbsp;&nbsp;</td>
			<td colspan="2"><html:select property="frmUpdateSpecialize"
					styleClass="form-control" disabled="true">
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
			<td>&nbsp;&nbsp;&nbsp;</td>
		</tr>
		<tr>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td colspan="2">&nbsp;</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
		</tr>
		<tr>
			<th>Specialize Type:</th>
			<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>

			<td colspan="2"><html:text property="frmUpdateSpe" styleClass="form-control"
					value="${AddspFormBean.frmspecname.specializetype }" maxlength="24"
					size="30"></html:text> </td>
			<td><font color="red">***</font></td>
			<td>&nbsp;</td>

		</tr>
		<tr>
			<td>&nbsp;</td>
			<td colspan="4"><html:errors property="NullUpdateSpecialize" />
				<html:errors property="SpecializeExist" /></td>
			<td>&nbsp;</td>
		</tr>
		<tr>
			<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
			<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
			<td align="center"><html:submit property="btnUpdate"
					value="Update" styleClass="btn btn-info" ></html:submit>
					</td><td><html:cancel value="Cancel" styleClass="btn btn-info"></html:cancel></td>
			<td>&nbsp;&nbsp;&nbsp;</td>
			<td>&nbsp;&nbsp;&nbsp;</td>
		</tr>
	</table>
	<br>
	<br>
</html:form>

<br>
<br>
<br>
<%@ include file="inc/footer.jsp"%>
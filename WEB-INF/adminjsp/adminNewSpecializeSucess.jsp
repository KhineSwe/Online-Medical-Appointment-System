<%@include file="inc/common.jsp"%>
<%@ include file="inc/headerhome.jsp"%>
<br>
<br>
<div class="panel-body col-sm-12">

<h3 style="color: green; text-align: center;">Ares you sure to add this
				Specialization name?</h3>

<div class="panel-body col-sm-2"></div>
	<div class="panel-body col-sm-8">

<html:form action="/adminnewspeconf">
	<table align="center" border="0">
		<tr>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td  colspan="2">&nbsp;</td>
			<td>&nbsp;</td>
		</tr>

		<tr>
			<th>Specialization Name:</th>
			<td>&nbsp;&nbsp;</td>
			<td  colspan="2" width="200"><html:text property="frmSpectype"
					styleClass="form-control" disabled="true">

				</html:text></td>
			<td>&nbsp;</td>
		</tr>
<tr>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td colspan="2">&nbsp;</td>
			<td>&nbsp;</td>
		</tr>
		<tr>
			<!-- 		<td><h4><i><b><a href="adminSpe.do?frmControl=1">Confirm</a></b></i></h4> -->
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td><html:submit property="btnConfirm" value="Confirm"
					styleClass="btn btn-info"></html:submit> 
					</td>
			<td><html:submit
					property="btnConfirmCancel" value="Cancel"
					styleClass="btn btn-info"></html:submit></td>
			<td>&nbsp;</td>
		</tr>
	</table>
</html:form>
</div>
<div class="panel-body col-sm-2"></div>


</div>
<%@ include file="inc/footer.jsp"%>
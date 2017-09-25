<%@include file="inc/common.jsp"%>
<%@ include file="inc/headerhome.jsp"%>
<br><br>
<div class="panel-body col-sm-12">

	<h3 style="color: green; text-align: center;">Add New Specialize
		Field</h3>
	<!-- <div class="panel-body col-sm-4">
		<img src="myimage/vitoria.png" name="AddspFormBean"
			class="img-responsive">
	</div> -->
	<div class="panel-body col-sm-2"></div>
	<div class="panel-body col-sm-8">

		<html:form action="/adminAddSpec" method="post">
		<center>	<font color="red"><html:errors property="NullAddSpecialize" />
				<html:errors property="SpecializeExist" /></font></center>
			<table align="center" border="0">
				<tr>
					<td>&nbsp;</td>
					<td>&nbsp;</td>
					<td colspan="2">&nbsp;</td>
					<td>&nbsp;</td>
				</tr>

				<tr>
					<th>Specialization Name:</th>
					<td>&nbsp;&nbsp;</td>
					<td colspan="2" width="200"><html:text property="frmSpectype"
							styleClass="form-control" maxlength="24" size="30">

						</html:text></td>
					<td><font color="red">***</font></td>
				</tr>
				<tr>
					<td>&nbsp;</td>
					<td>&nbsp;</td>
					<td colspan="2">
						<!-- <h5 style="color: green">(Please type the
							specialization here.)</h5> -->
					</td>
					<td>&nbsp;</td>
				</tr>
				<tr>
					<td>&nbsp;</td>
					<td>&nbsp;</td>
					<td align="center"> <html:submit property="add"
							value="Add" styleClass="btn btn-info"></html:submit> 
							</td>
							<td>
							<html:cancel value="Cancel" styleClass="btn btn-info"></html:cancel>
						<br /></td>
						<td> &nbsp; </td>
				</tr>
			</table>

		</html:form>
		<!-- 	<h4><center><i><b><a href="adminSpe.do?frmControl=1">Back</a></b></i></center></h4> -->


	</div>
	<div class="panel-body col-sm-2"></div>

</div>

<%@ include file="inc/footer.jsp"%>
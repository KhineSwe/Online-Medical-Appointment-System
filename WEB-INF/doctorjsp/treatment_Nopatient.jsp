<%@ include file="inc/common.jsp"%>
<%@ include file="inc/headerafterlogin.jsp"%>


<body onload="DWRUtil.useLoadingMessage(); createAutoCompleter()">
	<table border="1" width="100%">
		<div class="container">
			<div class="row">
				<div class="panel panel-success">
					<div class="panel-heading">Treatment List</div>

					<div class="panel-body col-sm-12" align="center">
						<div class="col-sm-2"></div>
						<div class="col-sm-8">
							<hr>

							<html:form action="/treatmentPatientNameSearchPath">
					
				      Patient Name:
					<html:text property="frmTreatmentName" styleId="frmTreatmentName1"
									 maxlength="29" size="30" />
								<div class="choices" id="choices1"></div>
								<html:submit property="btnSearch" value="Search"
									styleClass="btn btn-info">
								</html:submit>

							</html:form>
							<h4>
								<font color="red">Sorry, you don't have the Patient with this name.</font>
							</h4>

						</div>
					</div>
				</div>
			<br>
</body>
<%@ include file="inc/footer.jsp"%>
</body>
</html>
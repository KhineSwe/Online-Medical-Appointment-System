<%-- <%@ include file="inc/common.jsp"%>
<%@ include file="inc/calendar.jsp"%>
<%@ include file="inc/header.jsp"%>

<!DOCTYPE html>

<div class="row">
	<div class="panel panel-success">
		<div class="panel-heading">Registration Form</div>

		<div class="panel-body col-sm-4"></div>
		<div class="panel-body col-sm-4">
			<br /> <br />
			<html:form action="/registerPath">

				<logic:empty property="frmRegFormControl" name="RegFormBean">

					<table align="center">

						<tr>
							<td>Name:</td>
							<td><html:text property="frmRegName"></html:text> <font
								color="red">***</font> <html:errors property="frmRegName" /></td>
						</tr>

						<tr>
							<td>Email:</td>
							<td><html:text property="frmRegEmail"></html:text> <font
								color="red">***</font> <html:errors property="frmRegEmail" /> <html:errors
									property="emailError" /></td>
						</tr>

						<tr>
							<td>PhoneNo:</td>
							<td><html:text property="frmRegPhone"></html:text></td>
						</tr>

						<tr>
							<td>Gender:</td>
							<td><html:radio property="frmRegGender" value="Male">Male </html:radio>
								<html:radio property="frmRegGender" value='Female'>Female </html:radio>
								<font color="red">***</font> <html:errors
									property="frmRegGender" /></td>
						</tr>

						<tr>
							<td>Date of Birth:</td>
							<td><html:text property="frmRegDOB" styleId="calendar"></html:text>
								<html:errors property="frmRegDOB" /> <html:image
									src="images/calendar.gif" styleId="trigger"
									style="cursor: pointer; border: 1px solid red;"
									title="Date selector"
									onmouseover="this.style.background='red';"
									onmouseout="this.style.background=''"></html:image> <font
								face="Verdana" size="2" color="blue">&nbsp;YYYY-MM-DD</font> <script
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
						</tr>

						<tr>
							<td>Blood Type:</td>
							<td><html:select property="frmRegBlood">
									<html:option value="0">Select</html:option>
									<html:option value="A"> A </html:option>
									<html:option value="B"> B </html:option>
									<html:option value="O"> O </html:option>
									<html:option value="AB"> AB </html:option>
									<html:option value="unknown"> Unknown </html:option>
								</html:select></td>
						</tr>

						<tr>
							<td>Password:</td>
							<td><html:password property="frmRegPassword"></html:password>
								<font color="red">***</font> <html:errors
									property="frmRegPassword" /></td>
						</tr>

						<tr>
							<td>Retype Password:</td>
							<td><html:password property="frmRegConfPassword"></html:password>
								<font color="red">***</font> <html:errors
									property="frmRegConfPassword" /> <html:errors
									property="passwordError" /></td>
						</tr>

						<tr>

							<td>Address:</td>
							<td><html:textarea property="frmRegAddress" rows="5"
									cols="22"></html:textarea></td>
						</tr>

						<tr>
							<td colspan="2" align="center"><html:submit
									property="btnRegister" value="Register"></html:submit> <html:cancel
									value="Cancel"></html:cancel></td>
						</tr>
					</table>
				</logic:empty>

				<logic:notEmpty property="frmRegFormControl" name="RegFormBean">
					<h4>Confirm Registration</h4>
					<hr>
					<table align="center">
						<tr>
							<td>Name:</td>
							<td><html:text property="frmRegName" disabled="true"></html:text>
							</td>
						</tr>


						<tr>
							<td>Email:</td>
							<td><html:text property="frmRegEmail" disabled="true"></html:text>
							</td>
						</tr>

						<tr>
							<td>PhoneNo:</td>
							<td><html:text property="frmRegPhone" disabled="true"></html:text></td>
						</tr>

						<tr>
							<td>Gender:</td>
							<td><html:radio property="frmRegGender" value="Male"
									disabled="true">Male</html:radio> <html:radio
									property="frmRegGender" value='Female' disabled="true">Female</html:radio></td>
						</tr>

						<tr>
							<td>Date of Birth:</td>
							<td><html:text property="frmRegDOB" disabled="true"></html:text>
							</td>
						</tr>

						<tr>
							<td>Blood Type:</td>
							<td><html:text property="frmRegBlood" disabled="true">
								</html:text></td>
						</tr>

						<tr>
							<td>Password:</td>
							<td><html:text property="frmRegPassword" disabled="true"></html:text>
							</td>
						</tr>

						<tr>
							<td>Retype Password:</td>
							<td><html:text property="frmRegConfPassword" disabled="true"></html:text></td>
						</tr>

						<tr>
							<td>Address:</td>
							<td><html:textarea property="frmRegAddress" disabled="true"></html:textarea></td>
						</tr>


<tr>
	<!DOCTYPE html>
	<div class="row">
		<div class="panel panel-success">
			<div class="panel-heading">Registration Form</div>

			<div class="panel-body col-sm-4"></div>
			<div class="panel-body col-sm-4">
				<br /> <br />
				<html:form action="/registerPath">

					<logic:empty property="frmRegFormControl" name="RegFormBean">

						<table align="center">

							<tr>
								<td>Name:</td>
								<td><html:text property="frmRegName"
										styleClass="form-control"></html:text> <html:errors
										property="frmRegName" /></td>
								<td><font color="red">***</font></td>
							</tr>

							<tr>
								<td>Email:</td>
								<td><html:text property="frmRegEmail"
										styleClass="form-control"></html:text> <html:errors
										property="frmRegEmail" /> <html:errors property="emailError" /></td>
								<td><font color="red">***</font></td>
							</tr>

							<tr>
								<td>PhoneNo:</td>
								<td><html:text property="frmRegPhone"
										styleClass="form-control"></html:text></td>
							</tr>

							<tr>
								<td>Gender:</td>
								<td><html:radio property="frmRegGender" value="Male">Male </html:radio>
									<html:radio property="frmRegGender" value='Female'>Female </html:radio>
									<html:errors property="frmRegGender" /></td>
								<td><font color="red">***</font></td>
							</tr>

							<tr>
								<td>Date of Birth:</td>
								<td><html:text property="frmRegDOB" styleId="calendar"
										styleClass="form-control"></html:text> <html:errors
										property="frmRegDOB" /></td>
								<td><html:image src="images/calendar.gif" styleId="trigger"
										style="cursor: pointer; border: 1px solid red;"
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
								<td><font face="Verdana" size="2" color="blue">&nbsp;YYYY-MM-DD</font></td>
							</tr>

							<tr>
								<td>Blood Type:</td>
								<td><html:select property="frmRegBlood"
										styleClass="form-control">
										<html:option value="0">Select</html:option>
										<html:option value="A"> A </html:option>
										<html:option value="B"> B </html:option>
										<html:option value="O"> O </html:option>
										<html:option value="AB"> AB </html:option>
										<html:option value="unknown"> Unknown </html:option>
									</html:select></td>
							</tr>

							<tr>
								<td>Password:</td>
								<td><html:password property="frmRegPassword"
										styleClass="form-control"></html:password> <html:errors
										property="frmRegPassword" /></td>
								<td><font color="red">***</font></td>
							</tr>

							<tr>
								<td>RetypePassword:</td>
								<td><html:password property="frmRegConfPassword"
										styleClass="form-control"></html:password> <html:errors
										property="frmRegConfPassword" /> <html:errors
										property="passwordError" /></td>
								<td><font color="red">***</font></td>
							</tr>

							<tr>

								<td>Address:</td>
								<td><html:textarea property="frmRegAddress" rows="5"
										cols="18" style="resize: none;" styleClass="form-control"></html:textarea></td>
							</tr>

							<tr>
								<td colspan="5" align="center"><html:submit
										property="btnRegister" value="Register"
										styleClass="btn btn-info"></html:submit> <html:cancel
										value="Cancel" styleClass="btn btn-info"></html:cancel></td>
							</tr>
						</table>
					</logic:empty>

					<logic:notEmpty property="frmRegFormControl" name="RegFormBean">
						<h4>Confirm Registration</h4>
						<hr>
						<table align="center">
							<tr>
								<td>Name:</td>
								<td><html:text property="frmRegName" disabled="true"></html:text>
								</td>
							</tr>


							<tr>
								<td>Email:</td>
								<td><html:text property="frmRegEmail" disabled="true"></html:text>
								</td>
							</tr>

							<tr>
								<td>PhoneNo:</td>
								<td><html:text property="frmRegPhone" disabled="true"></html:text></td>
							</tr>

							<tr>
								<td>Gender:</td>
								<td><html:radio property="frmRegGender" value="Male"
										disabled="true">Male</html:radio> <html:radio
										property="frmRegGender" value='Female' disabled="true">Female</html:radio></td>
							</tr>

							<tr>
								<td>Date of Birth:</td>
								<td><html:text property="frmRegDOB" disabled="true"></html:text>
								</td>
							</tr>

							<tr>
								<td>Blood Type:</td>
								<td><html:text property="frmRegBlood" disabled="true">
									</html:text></td>
							</tr>

							<tr>
								<td>Password:</td>
								<td><html:text property="frmRegPassword" disabled="true"></html:text>
								</td>
							</tr>

							<tr>
								<td>Retype Password:</td>
								<td><html:text property="frmRegConfPassword"
										disabled="true"></html:text></td>
							</tr>

							<tr>
								<td>Address:</td>
								<td><html:textarea property="frmRegAddress" disabled="true"
										cols="18" style="resize: none;"></html:textarea></td>
							</tr>
							<td colspan="2" align="center"><html:submit
									property="btnConfirm1" value="Ok" styleClass="btn btn-info"></html:submit>
								<html:submit property="btnConfirmCancel" value="Cancel"
									styleClass="btn btn-info"></html:submit></td>
</tr>
</table>
<font color="green">${RegFormBean.frmRegmailMessage}</font>

<!-- Fadein and Fadeout function -->
<!-- <script>					
							
							function getId(ID) {
								  return document.getElementById(ID);
								}

								window.onload = function() {
								  var blueBox = getId('divOne');
								  var redBox = getId('divTwo');

								  blueBox.addEventListener('click', function() {

								    blueBox.style.opacity = 1;
								    var fadeOut = setInterval(function() {
								      blueBox.style.opacity -= .05;
								      if (blueBox.style.opacity <= 0) {
								      	clearInterval(fadeOut);
								      }
								    }, 50);
									
								  });
								}
							
							
					</script> -->
</logic:notEmpty>
</html:form>
<br />
<br />
</div>
<div class="panel-body col-sm-4"></div>


</div>
</div>



<%@ include file="inc/footer.jsp"%>
</body>
</html> --%>
<%@include file="inc/common.jsp"%>
<%@ include file="inc/calendar.jsp"%>
<%@ include file="inc/headerhome.jsp"%>

<br />
<div class="container col-sm-12">
	<div class="row"><br />

<html:form method="post" action="/adminaddSchedulePath">
	<table width='100%'>
		<tr>
			<th>Hospital :</th>
			<td>${AutoFormBean.frmhosname.hosname}</td>
			<td>&nbsp;&nbsp;</td>
			<td>&nbsp;&nbsp;</td>
		</tr>

		<tr>
			<th>&nbsp;&nbsp;</th>
			<td>&nbsp;&nbsp;</td>
			<td>&nbsp;&nbsp;</td>
			<td>&nbsp;&nbsp;</td>
		</tr>

		<tr>
			<th>Specialize Field:</th>
			<td>${AutoFormBean.frmspecname.specializetype}</td>
			<td>&nbsp;&nbsp;</td>
			<td>&nbsp;&nbsp;</td>
		</tr>

		<tr>
			<td>&nbsp;&nbsp;</td>
			<td>&nbsp;&nbsp;</td>
			<td>&nbsp;&nbsp;</td>
			<td>&nbsp;&nbsp;</td>
		</tr>

		<tr>
			<th>Select Doctor Name:</th>

			<td><html:select property="frmSpecId" styleClass="form-control" size="">
					<c:forEach var="i" begin="0"
						end="${AutoFormBean.frmDocList.size()-1}" step="1">
						<html:option value="${AutoFormBean.frmDocList[i].id}">
							<c:out value='${AutoFormBean.frmDocList[i].dname}' />
						</html:option>
					</c:forEach>
				</html:select></td>
			<td>&nbsp;&nbsp;</td>
			<td>&nbsp;&nbsp;</td>
		</tr>
		<tr>
			<td>&nbsp;&nbsp;</td>
			<td>&nbsp;&nbsp;</td>
			<td>&nbsp;&nbsp;</td>
			<td>&nbsp;&nbsp;</td>
		</tr>
		<tr>
			<th>Select Start Date:</th>
			<td><html:text property="frmStartDate" styleId="calendar"
					styleClass="form-control" readonly="true"></html:text></td>
			<td><html:image src="images/calendar.gif" styleId="trigger"
					style="cursor: pointer; border: 3px solid red;"
					title="Date selector" onmouseover="this.style.background='red';"
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
					</script><font color="red">***</font> <font face="Verdana" size="2" color="blue">&nbsp;YYYY-MM-DD</font>

			</td>
			<td>&nbsp;</td>
		</tr>
		<tr>
		<td>&nbsp;</td>
		<td colspan="3"><html:errors property="SchDateerror" /> <html:errors
						property="nullstartdateerror" /> <html:errors
						property="startdateerror" /></td>
		<td>&nbsp;</td>
		<td>&nbsp;&nbsp;</td>
		</tr>
		
		<tr>
			<th>Maximum Number of Appointment Patients:</th>
			<td><html:text property="frmmaxpatient" maxlength="2"
					styleClass="form-control" size="10" /></td>
			<td><font color="red">***</font></td>
			<td>&nbsp;&nbsp;</td>
		</tr>
		<tr>
		<td>&nbsp;</td>
		<td><html:errors property="frmmaxpatient" />
	
	<html:errors property="nullmaxpatient" /></td>
		<td>&nbsp;</td>
		<td>&nbsp;&nbsp;</td>
		</tr>
		<tr>
		<th>Schedule Duration:</th>
		<td><html:radio property="frmnoWeek" value="4"> One Month </html:radio> </td>
		<td><html:radio property="frmnoWeek" value="8"> Two Month </html:radio> </td>
		<td width="20%"><html:radio property="frmnoWeek" value="12"> Three Month </html:radio> </td>
		
		</tr>
		<tr>
		<td><font color="red"><html:errors property="nullNOMOnth"/></font></td>
		<td></td>
		<td></td>
		<td></td>
	</table>
	<%-- <html:errors property="SchDateerror" /> --%>
	<html:errors property="scheduleerror" />
	<html:errors property="nullallscherror" />
	<html:errors property="nullmonscherror" />
	<html:errors property="nulltuescherror" />
	<html:errors property="nullwedscherror" />
	<html:errors property="nullthuscherror" />
	<html:errors property="nullfrischerror" />
	<html:errors property="nullsatscherror" />
	<html:errors property="nullsunscherror" />
	<html:errors property="nullmonfromtimescherror" />
	<html:errors property="nullmontotimescherror" />
	<html:errors property="nullmonampmscherror" />
	<html:errors property="nulltuefromtimescherror" />
	<html:errors property="nulltuetotimescherror" />
	<html:errors property="nulltueampmscherror" />
	<html:errors property="nullwedfromtimescherror" />
	<html:errors property="nullwedtotimescherror" />
	<html:errors property="nullwedampmscherror" />
	<html:errors property="nullthufromtimescherror" />
	<html:errors property="nullthutotimescherror" />
	<html:errors property="nullthuampmscherror" />
	<html:errors property="nullfrifromtimescherror" />
	<html:errors property="nullfritotimescherror" />
	<html:errors property="nullfriampmscherror" />
	<html:errors property="nullsatfromtimescherror" />
	<html:errors property="nullsattotimescherror" />
	<html:errors property="nullsatampmscherror" />
	<html:errors property="nullsunfromtimescherror" />
	<html:errors property="nullsuntotimescherror" />
	<html:errors property="nullsunampmscherror" />
	<html:errors property="greaterfrommonscherror" />
	<html:errors property="greaterfromtuescherror" />
	<html:errors property="greaterfromwedscherror" />
	<html:errors property="greaterfromthuscherror" />
	<html:errors property="greaterfromfrischerror" />
	<html:errors property="greaterfromsatscherror" />
	<html:errors property="greaterfromsunscherror" />
	<html:errors property="duplicateSchedule" />


	<table style="border-collapse: collapse"
								class="table table-hover" border="0" align="center">
								<tr class="success">

			<th>Day:</th>

			<th>From: (Hour)</th>
			<!-- <th>&nbsp;&nbsp;&nbsp;</th> -->
			<th>To: (Hour)</th>
			<!-- <th>&nbsp;&nbsp;&nbsp;</th> -->
		</tr>

		<tr>
			<!-- <td>Monday</td>  -->
			<td><html:multibox property="frmDay" value="2" />Monday</td>

			<!-- <td>&nbsp;&nbsp;&nbsp;</td> -->
			<td><html:select property="frmFromMonTime">
					<html:option value="0">---Choose---</html:option>
					<html:option value="1"> 1:00 </html:option>
					<html:option value="2"> 2:00 </html:option>
					<html:option value="3"> 3:00 </html:option>
					<html:option value="4"> 4:00 </html:option>
					<html:option value="5"> 5:00 </html:option>
					<html:option value="6"> 6:00 </html:option>
					<html:option value="7"> 7:00 </html:option>
					<html:option value="8"> 8:00 </html:option>
					<html:option value="9"> 9:00 </html:option>
					<html:option value="10"> 10:00 </html:option>
					<html:option value="11"> 11:00 </html:option>
					<html:option value="12"> 12:00 </html:option>
				</html:select> <html:radio property="frmMonAMPMTime" value="AM"> AM </html:radio>
				<html:radio property="frmMonAMPMTime" value="PM"> PM </html:radio></td>

			<!-- <td>&nbsp;&nbsp;&nbsp;</td> -->
			<td><html:select property="frmToMonTime">
					<html:option value="0">---Choose---</html:option>
					<html:option value="1"> 1:00 </html:option>
					<html:option value="2"> 2:00 </html:option>
					<html:option value="3"> 3:00 </html:option>
					<html:option value="4"> 4:00 </html:option>
					<html:option value="5"> 5:00 </html:option>
					<html:option value="6"> 6:00 </html:option>
					<html:option value="7"> 7:00 </html:option>
					<html:option value="8"> 8:00 </html:option>
					<html:option value="9"> 9:00 </html:option>
					<html:option value="10"> 10:00 </html:option>
					<html:option value="11"> 11:00 </html:option>
					<html:option value="12"> 12:00 </html:option>
				</html:select>
				<html:radio property="frmmonTime" value="AM"> AM </html:radio> <html:radio
					property="frmmonTime" value="PM"> PM </html:radio></td>
		</tr>


		<tr>
			<!-- 	<td>Tuesday</td> -->
			<td><html:multibox property="frmDay" value="3" />Tuesday</td>

			<!-- <td>&nbsp;&nbsp;&nbsp;</td> -->
			<td><html:select property="frmFromTueTime">
					<html:option value="0">---Choose---</html:option>
					<html:option value="1"> 1:00 </html:option>
					<html:option value="2"> 2:00 </html:option>
					<html:option value="3"> 3:00 </html:option>
					<html:option value="4"> 4:00 </html:option>
					<html:option value="5"> 5:00 </html:option>
					<html:option value="6"> 6:00 </html:option>
					<html:option value="7"> 7:00 </html:option>
					<html:option value="8"> 8:00 </html:option>
					<html:option value="9"> 9:00 </html:option>
					<html:option value="10"> 10:00 </html:option>
					<html:option value="11"> 11:00 </html:option>
					<html:option value="12"> 12:00 </html:option>
				</html:select> <html:radio property="frmTueAMPMTime" value="AM"> AM </html:radio>
				<html:radio property="frmTueAMPMTime" value="PM"> PM </html:radio></td>

			<!-- <td>&nbsp;&nbsp;&nbsp;</td> -->
			<td><html:select property="frmToTueTime">
					<html:option value="0">---Choose---</html:option>
					<html:option value="1"> 1:00 </html:option>
					<html:option value="2"> 2:00 </html:option>
					<html:option value="3"> 3:00 </html:option>
					<html:option value="4"> 4:00 </html:option>
					<html:option value="5"> 5:00 </html:option>
					<html:option value="6"> 6:00 </html:option>
					<html:option value="7"> 7:00 </html:option>
					<html:option value="8"> 8:00 </html:option>
					<html:option value="9"> 9:00 </html:option>
					<html:option value="10"> 10:00 </html:option>
					<html:option value="11"> 11:00 </html:option>
					<html:option value="12"> 12:00 </html:option>
				</html:select>
				<html:radio property="frmtueTime" value="AM"> AM </html:radio> <html:radio
					property="frmtueTime" value="PM"> PM </html:radio></td>
		</tr>


		<tr>
			<!-- <td>Wednesday</td> -->
			<td><html:multibox property="frmDay" value="4" />Wednesday</td>

			<!-- <td>&nbsp;&nbsp;&nbsp;</td> -->
			<td><html:select property="frmFromWedTime">
					<html:option value="0">---Choose---</html:option>
					<html:option value="1"> 1:00 </html:option>
					<html:option value="2"> 2:00 </html:option>
					<html:option value="3"> 3:00 </html:option>
					<html:option value="4"> 4:00 </html:option>
					<html:option value="5"> 5:00 </html:option>
					<html:option value="6"> 6:00 </html:option>
					<html:option value="7"> 7:00 </html:option>
					<html:option value="8"> 8:00 </html:option>
					<html:option value="9"> 9:00 </html:option>
					<html:option value="10"> 10:00 </html:option>
					<html:option value="11"> 11:00 </html:option>
					<html:option value="12"> 12:00 </html:option>
				</html:select> <html:radio property="frmWedAMPMTime" value="AM"> AM </html:radio>
				<html:radio property="frmWedAMPMTime" value="PM"> PM </html:radio></td>

			<!-- <td>&nbsp;&nbsp;&nbsp;</td> -->
			<td><html:select property="frmToWedTime">
					<html:option value="0">---Choose---</html:option>
					<html:option value="1"> 1:00 </html:option>
					<html:option value="2"> 2:00 </html:option>
					<html:option value="3"> 3:00 </html:option>
					<html:option value="4"> 4:00 </html:option>
					<html:option value="5"> 5:00 </html:option>
					<html:option value="6"> 6:00 </html:option>
					<html:option value="7"> 7:00 </html:option>
					<html:option value="8"> 8:00 </html:option>
					<html:option value="9"> 9:00 </html:option>
					<html:option value="10"> 10:00 </html:option>
					<html:option value="11"> 11:00 </html:option>
					<html:option value="12"> 12:00 </html:option>
				</html:select>
				<html:radio property="frmwedTime" value="AM"> AM </html:radio> <html:radio
					property="frmwedTime" value="PM"> PM </html:radio></td>
		</tr>


		<tr>
			<!-- <td>Thursday</td> -->
			<td><html:multibox property="frmDay" value="5" />Thursday</td>

			<!-- <td>&nbsp;&nbsp;&nbsp;</td> -->
			<td><html:select property="frmFromThuTime">
					<html:option value="0">---Choose---</html:option>
					<html:option value="1"> 1:00 </html:option>
					<html:option value="2"> 2:00 </html:option>
					<html:option value="3"> 3:00 </html:option>
					<html:option value="4"> 4:00 </html:option>
					<html:option value="5"> 5:00 </html:option>
					<html:option value="6"> 6:00 </html:option>
					<html:option value="7"> 7:00 </html:option>
					<html:option value="8"> 8:00 </html:option>
					<html:option value="9"> 9:00 </html:option>
					<html:option value="10"> 10:00 </html:option>
					<html:option value="11"> 11:00 </html:option>
					<html:option value="12"> 12:00 </html:option>
				</html:select> <html:radio property="frmThuAMPMTime" value="AM"> AM </html:radio>
				<html:radio property="frmThuAMPMTime" value="PM"> PM </html:radio></td>

			<!-- <td>&nbsp;&nbsp;&nbsp;</td> -->
			<td><html:select property="frmToThuTime">
					<html:option value="0">---Choose---</html:option>
					<html:option value="1"> 1:00 </html:option>
					<html:option value="2"> 2:00 </html:option>
					<html:option value="3"> 3:00 </html:option>
					<html:option value="4"> 4:00 </html:option>
					<html:option value="5"> 5:00 </html:option>
					<html:option value="6"> 6:00 </html:option>
					<html:option value="7"> 7:00 </html:option>
					<html:option value="8"> 8:00 </html:option>
					<html:option value="9"> 9:00 </html:option>
					<html:option value="10"> 10:00 </html:option>
					<html:option value="11"> 11:00 </html:option>
					<html:option value="12"> 12:00 </html:option>
				</html:select>
				<html:radio property="frmthuTime" value="AM"> AM </html:radio> <html:radio
					property="frmthuTime" value="PM"> PM </html:radio></td>
		</tr>



		<tr>
			<!-- 
				<td>Friday</td> -->
			<td><html:multibox property="frmDay" value="6" />Friday</td>

			<!-- <td>&nbsp;&nbsp;&nbsp;</td> -->
			<td><html:select property="frmFromFriTime">
					<html:option value="0">---Choose---</html:option>
					<html:option value="1"> 1:00 </html:option>
					<html:option value="2"> 2:00 </html:option>
					<html:option value="3"> 3:00 </html:option>
					<html:option value="4"> 4:00 </html:option>
					<html:option value="5"> 5:00 </html:option>
					<html:option value="6"> 6:00 </html:option>
					<html:option value="7"> 7:00 </html:option>
					<html:option value="8"> 8:00 </html:option>
					<html:option value="9"> 9:00 </html:option>
					<html:option value="10"> 10:00 </html:option>
					<html:option value="11"> 11:00 </html:option>
					<html:option value="12"> 12:00 </html:option>
				</html:select> <html:radio property="frmFriAMPMTime" value="AM"> AM </html:radio>
				<html:radio property="frmFriAMPMTime" value="PM"> PM </html:radio></td>

			<!-- <td>&nbsp;&nbsp;&nbsp;</td> -->
			<td><html:select property="frmToFriTime">
					<html:option value="0">---Choose---</html:option>
					<html:option value="1"> 1:00 </html:option>
					<html:option value="2"> 2:00 </html:option>
					<html:option value="3"> 3:00 </html:option>
					<html:option value="4"> 4:00 </html:option>
					<html:option value="5"> 5:00 </html:option>
					<html:option value="6"> 6:00 </html:option>
					<html:option value="7"> 7:00 </html:option>
					<html:option value="8"> 8:00 </html:option>
					<html:option value="9"> 9:00 </html:option>
					<html:option value="10"> 10:00 </html:option>
					<html:option value="11"> 11:00 </html:option>
					<html:option value="12"> 12:00 </html:option>
				</html:select>
				<html:radio property="frmfriTime" value="AM"> AM </html:radio> <html:radio
					property="frmfriTime" value="PM"> PM </html:radio></td>
		</tr>


		<tr>
			<!-- 	<td>Saturday</td> -->
			<td><html:multibox property="frmDay" value="7" />Saturday</td>

			<!-- <td>&nbsp;&nbsp;&nbsp;</td> -->
			<td><html:select property="frmFromSatTime">
					<html:option value="0">---Choose---</html:option>
					<html:option value="1"> 1:00 </html:option>
					<html:option value="2"> 2:00 </html:option>
					<html:option value="3"> 3:00 </html:option>
					<html:option value="4"> 4:00 </html:option>
					<html:option value="5"> 5:00 </html:option>
					<html:option value="6"> 6:00 </html:option>
					<html:option value="7"> 7:00 </html:option>
					<html:option value="8"> 8:00 </html:option>
					<html:option value="9"> 9:00 </html:option>
					<html:option value="10"> 10:00 </html:option>
					<html:option value="11"> 11:00 </html:option>
					<html:option value="12"> 12:00 </html:option>
				</html:select> <html:radio property="frmSatAMPMTime" value="AM"> AM </html:radio>
				<html:radio property="frmSatAMPMTime" value="PM"> PM </html:radio></td>

			<!-- <td>&nbsp;&nbsp;&nbsp;</td> -->
			<td><html:select property="frmToSatTime">
					<html:option value="0">---Choose---</html:option>
					<html:option value="1"> 1:00 </html:option>
					<html:option value="2"> 2:00 </html:option>
					<html:option value="3"> 3:00 </html:option>
					<html:option value="4"> 4:00 </html:option>
					<html:option value="5"> 5:00 </html:option>
					<html:option value="6"> 6:00 </html:option>
					<html:option value="7"> 7:00 </html:option>
					<html:option value="8"> 8:00 </html:option>
					<html:option value="9"> 9:00 </html:option>
					<html:option value="10"> 10:00 </html:option>
					<html:option value="11"> 11:00 </html:option>
					<html:option value="12"> 12:00 </html:option>
				</html:select>
				<html:radio property="frmsatTime" value="AM"> AM </html:radio> <html:radio
					property="frmsatTime" value="PM"> PM </html:radio></td>
		</tr>


		<tr>
			<!-- <td>Sunday</td> -->
			<td><html:multibox property="frmDay" value="1" />Sunday</td>

			<!-- <td>&nbsp;&nbsp;&nbsp;</td> -->
			<td><html:select property="frmFromSunTime">
					<html:option value="0">---Choose---</html:option>
					<html:option value="1"> 1:00 </html:option>
					<html:option value="2"> 2:00 </html:option>
					<html:option value="3"> 3:00 </html:option>
					<html:option value="4"> 4:00 </html:option>
					<html:option value="5"> 5:00 </html:option>
					<html:option value="6"> 6:00 </html:option>
					<html:option value="7"> 7:00 </html:option>
					<html:option value="8"> 8:00 </html:option>
					<html:option value="9"> 9:00 </html:option>
					<html:option value="10"> 10:00 </html:option>
					<html:option value="11"> 11:00 </html:option>
					<html:option value="12"> 12:00 </html:option>
				</html:select> <html:radio property="frmSunAMPMTime" value="AM"> AM </html:radio>
				<html:radio property="frmSunAMPMTime" value="PM"> PM </html:radio></td>

			<!-- <td>&nbsp;&nbsp;&nbsp;</td> -->
			<td><html:select property="frmToSunTime">
					<html:option value="0">---Choose---</html:option>
					<html:option value="1"> 1:00 </html:option>
					<html:option value="2"> 2:00 </html:option>
					<html:option value="3"> 3:00 </html:option>
					<html:option value="4"> 4:00 </html:option>
					<html:option value="5"> 5:00 </html:option>
					<html:option value="6"> 6:00 </html:option>
					<html:option value="7"> 7:00 </html:option>
					<html:option value="8"> 8:00 </html:option>
					<html:option value="9"> 9:00 </html:option>
					<html:option value="10"> 10:00 </html:option>
					<html:option value="11"> 11:00 </html:option>
					<html:option value="12"> 12:00 </html:option>
				</html:select> <!-- <td>&nbsp;&nbsp;&nbsp;</td> --> <html:radio
					property="frmsunTime" value="AM"> AM </html:radio> <html:radio
					property="frmsunTime" value="PM"> PM </html:radio></td>
		</tr>
	
	</table>


	<center>
		<html:submit property="btnSave" value="Create Schedule"
			styleClass="btn btn-info" />

		&nbsp; &nbsp; &nbsp; &nbsp;
		<%-- 	<html:submit property="btnCancel" value="Cancel" styleClass="btn btn-info"/> --%>
		<html:cancel value="Cancel" styleClass="btn btn-info"></html:cancel>



	</center>

</html:form>
</div>

</div>
<%@ include file="inc/footer.jsp"%>

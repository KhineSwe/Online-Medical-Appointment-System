<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<%@ include file="inc/common.jsp"%>
<html>
<head>
<%@ include file="inc/calendar.jsp"%>
<title>Calendar Form</title>
<link href="css/library.css" rel="stylesheet" type="text/css">
</head>
<body>
<h3 align="center">Calendar Form</h3>
<hr>
<table border="1" width="100%">
	<%@ include file="inc/logout.jsp"%>
	<tr>
		<%@ include file="inc/left_menu.jsp"%>
		<td>
		<div><html:form action="/calendarPath">
			<table align="center">
				<tr>
					<td>First Date</td>
					<td><html:text property="firstDate" styleId="calendar"
						maxlength="10" size="15" /> <html:image src="images/calendar.gif"
						styleId="trigger" style="cursor: pointer; border: 1px solid red;"
						title="Date selector" onmouseover="this.style.background='red';"
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
</script><html:errors property="firstDate" /></td>
				</tr>
				<tr>
					<td>Second Date</td>
					<td><html:text property="secondDate" styleId="calendar1"
						maxlength="10" size="15" /> <html:image src="images/calendar.gif"
						styleId="trigger1" style="cursor: pointer; border: 1px solid red;"
						title="Date selector" onmouseover="this.style.background='red';"
						onmouseout="this.style.background=''"></html:image> <font
						face="Verdana" size="2" color="blue">&nbsp;YYYY-MM-DD</font> <script
						type="text/javascript">
	//         
	Calendar.setup({
		firstDay : 1,
		electric : false,
		singleClick : true,
		inputField : "calendar1",
		button : "trigger1",
		ifFormat : "%Y-%m-%d",
		daFormat : "%Y-%m-%d"
	});
	//
</script><html:errors property="secondDate" /></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><html:submit
						property="btnShowCalendar" value="Show"></html:submit> 
						<html:submit
						property="btnCancel" value="Cancel"></html:submit></td>
				</tr>
			</table>
		</html:form></div>
		<html:errors property="dateerror" />
		<h3>Select First Date is: ${CalendarFormBean.firstDate}</h3>
		<h3>Select Second Date is:${CalendarFormBean.secondDate} </h3>
		</td>
	</tr>
</table>
<%@ include file="inc/footer.jsp"%>

</body>
</html>
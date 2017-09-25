package com.ictti.frame.presentation.action;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import com.ictti.frame.presentation.form.CalendarForm;

public class CalenderAction extends BaseAction {

	@Override
	protected String doExecute(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping)
			throws Exception {
		if (request.getParameter("btnShowCalendar") != null) {
			CalendarForm myForm = (CalendarForm) form;
			SimpleDateFormat myformat = new SimpleDateFormat("yyyy-MM-dd");
			Date myD1 = myformat.parse(myForm.getFirstDate());
			Date myD2 = myformat.parse(myForm.getSecondDate());
			ActionErrors errors = new ActionErrors();
			if (myD1.after(myD2)) {
			errors.add("dateerror", new
			ActionMessage("errors.dateGreater"));
			saveErrors(request, errors);
			}
			return "gotoCalendar";
			}
			if (request.getParameter("btnCancel") != null)
			{
			return "gotoHome";
			}
			return "gotoCalender";
	}

	@Override
	protected String doInit(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping) {
		return "gotoCalender";
	}
	

}

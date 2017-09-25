package com.ictti.omas.presentation.action;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import com.ictti.omas.business.service.SearchByDateService;
import com.ictti.omas.presentation.form.ScheduleForm;

public class SearchByDateAction extends BaseAction {
	private SearchByDateService mySearchDateService;

	public SearchByDateService getMySearchDateService() {
		return mySearchDateService;
	}

	public void setMySearchDateService(SearchByDateService mySearchDateService) {
		this.mySearchDateService = mySearchDateService;
	}

	protected String doExecute(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping)
			throws Exception {

		ScheduleForm myForm = (ScheduleForm) form;

		HttpSession session = request.getSession(false);
		if (session.getAttribute("p_id") == null) {
			return "gotoLogin";
		}
		if (myForm.getScheduledate().isEmpty()) {

			ActionErrors errors = new ActionErrors();
			errors.add("Date", new ActionMessage("errors.date"));
			saveErrors(request, errors);
			return "gotoSchedule";
		} else {

			int hosid = myForm.getFrmHosname().getId();
			int docid = myForm.getFrmDocname().getId();

			mySearchDateService.getScheduleDate(myForm, docid, hosid);

			if (myForm.getFrmScheduleDate() == null) {
				return "gotoDateEmpty";
			}

			/*
			 * SimpleDateFormat myformat = new SimpleDateFormat("yyyy-MM-dd");
			 * Date schdate1 = myformat.parse(myForm.getScheduledate());
			 * 
			 * // Date schdate2 = myForm.getFrmScheduleDate().getSchdate();
			 * 
			 * System.out.println("date is=" +
			 * myForm.getFrmScheduleDate().getSchdate());
			 * 
			 * if (schdate1.compareTo(schdate2) == 0) { //
			 * mySearchDateService.getScheduleDate(myForm);
			 * 
			 * return "gotoDate"; } else return "gotoDateEmpty"; }
			 */
			return "gotoDate";
		}

	}
}

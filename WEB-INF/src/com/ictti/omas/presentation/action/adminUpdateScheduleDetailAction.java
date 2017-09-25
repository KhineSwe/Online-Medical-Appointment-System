package com.ictti.omas.presentation.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import com.ictti.omas.business.service.AdminUpdateScheduleService;
import com.ictti.omas.presentation.form.AdminUpdateScheduleForm;
import com.ictti.omas.presentation.form.ScheduleForm;

public class adminUpdateScheduleDetailAction extends BaseAction {
	private AdminUpdateScheduleService myScheduleUpdateService;

	public AdminUpdateScheduleService getMyScheduleUpdateService() {
		return myScheduleUpdateService;
	}

	public void setMyScheduleUpdateService(
			AdminUpdateScheduleService myScheduleUpdateService) {
		this.myScheduleUpdateService = myScheduleUpdateService;
	}

	protected String doExecute(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping)
			throws Exception {

		HttpSession session = request.getSession(false);
		if (session.getAttribute("a_id") == null) {
			return "gotoAdminlogin";
		}

		AdminUpdateScheduleForm myForm = (AdminUpdateScheduleForm) form;

		if (request.getParameter("btnUpdateCancel") != null) {
			myForm.setFrmFromTime("");
			myForm.setFrmEndTime("");
			return "gotoSchedule";
		}

		if (request.getParameter("btnUpdate") != null) {

			ActionErrors errors = new ActionErrors();

			if (myForm.getAmpm().equals("AM")
					&& myForm.getAmpmfinish().equals("AM")
					|| myForm.getAmpm().equals("PM")
					&& myForm.getAmpmfinish().equals("PM")) {

				int fromtime = Integer.parseInt(myForm.getFrmFromTime());
				int endtime = Integer.parseInt(myForm.getFrmEndTime());

				if (fromtime >= endtime) {
					errors.add("schtimeerror", new ActionMessage(
							"errors.schtimeerror"));
					saveErrors(request, errors);
					return "gotoUpdate";
				}

			}

			return "gotoUpdateConfirm";
		}
		if (request.getParameter("btnUpdateConfirmCancel") != null) {

			return "gotoDetail";
		}

		if (request.getParameter("btnUpdateConfirm") != null) {
		

			if (myForm.getAmpm().equals("PM")
					&& myForm.getAmpmfinish().equals("PM")) {
				int fromtime = Integer.parseInt(myForm.getFrmFromTime()) + 12;
				int endtime = Integer.parseInt(myForm.getFrmEndTime()) + 12;

				myForm.setFrmFromTime(Integer.toString(fromtime));

				myForm.setFrmEndTime(Integer.toString(endtime));

				myScheduleUpdateService.saveUpdateSchedule(myForm);
				
				
			} else if (myForm.getAmpm().equals("AM")
					&& myForm.getAmpmfinish().equals("AM")) {
				int fromtime = Integer.parseInt(myForm.getFrmFromTime());
				int endtime = Integer.parseInt(myForm.getFrmEndTime());

				myForm.setFrmFromTime(Integer.toString(fromtime));

				myForm.setFrmEndTime(Integer.toString(endtime));

				myScheduleUpdateService.saveUpdateSchedule(myForm);
				
				

			} else if (myForm.getAmpm().equals("AM")
					&& myForm.getAmpmfinish().equals("PM")) {
				int fromtime = Integer.parseInt(myForm.getFrmFromTime());
				int endtime = Integer.parseInt(myForm.getFrmEndTime()) + 12;

				myForm.setFrmFromTime(Integer.toString(fromtime));

				myForm.setFrmEndTime(Integer.toString(endtime));

				myScheduleUpdateService.saveUpdateSchedule(myForm);
				
				
			} else if (myForm.getAmpm().equals("PM")
					&& myForm.getAmpmfinish().equals("AM")) {
				int fromtime = Integer.parseInt(myForm.getFrmFromTime()) + 12;
				int endtime = Integer.parseInt(myForm.getFrmEndTime());

				myForm.setFrmFromTime(Integer.toString(fromtime));

				myForm.setFrmEndTime(Integer.toString(endtime));

				myScheduleUpdateService.saveUpdateSchedule(myForm);
				
				
			}

			String docemail = myForm.getFrmdocname().getDemail();
			myScheduleUpdateService.sendEmail(myForm, docemail);

			myForm.setFrmFromTime("");
			myForm.setFrmEndTime("");

			
			return "gotoMail";

		}

		
		return "gotoAuto";
	}
}

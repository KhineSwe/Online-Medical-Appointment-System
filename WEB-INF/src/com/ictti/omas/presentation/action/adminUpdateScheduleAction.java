package com.ictti.omas.presentation.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import com.ictti.omas.business.service.AdminUpdateScheduleService;
import com.ictti.omas.presentation.form.AdminUpdateScheduleForm;
import com.ictti.omas.presentation.form.AutoComplementForm;

public class adminUpdateScheduleAction extends BaseAction {

	private AdminUpdateScheduleService myUpdateScheduleService;

	public AdminUpdateScheduleService getMyUpdateScheduleService() {
		return myUpdateScheduleService;
	}

	public void setMyUpdateScheduleService(
			AdminUpdateScheduleService myUpdateScheduleService) {
		this.myUpdateScheduleService = myUpdateScheduleService;
	}

	protected String doExecute(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping)
			throws Exception {

		HttpSession session = request.getSession(false);
		if (session.getAttribute("a_id") == null) {
			return "gotoAdminlogin";
		}

		AdminUpdateScheduleForm myForm = (AdminUpdateScheduleForm) form;

		if (null != request.getParameter("next")) {
			myForm.setActualPage(myForm.getActualPage() + 1);
		}

		if (null != request.getParameter("prev")) {
			myForm.setActualPage(myForm.getActualPage() - 1);

		}

		if (request.getParameter("btnSearchScheduleCancel") != null) {

			AutoComplementForm autoForm = (AutoComplementForm) request
					.getSession().getAttribute("AutoFormBean");
			autoForm.setFrmHosId("0");
			autoForm.setFrmSpecId("0");
			return "gotoAuto1";
		}
		if (request.getParameter("btnSearchSchedule") != null) {

			AutoComplementForm autoForm = (AutoComplementForm) request
					.getSession().getAttribute("AutoFormBean");

			myForm.setFrmHosid(autoForm.getFrmHosId());

			int did = Integer.parseInt(myForm.getFrmSpecId());
			int hosid = Integer.parseInt(myForm.getFrmHosid());

			myUpdateScheduleService.getSchedule(myForm, did, hosid);

			if (myForm.getFrmUpdateScheduleList() == null) {

				ActionErrors errors = new ActionErrors();
				errors.add("scheduleemptyerror", new ActionMessage(
						"errors.scheduleemptyerror"));
				saveErrors(request, errors);
				return "gotoDoctor";

			} else {
				myForm.setActualPage(1);
				myForm.setIMaxData(myForm.getFrmUpdateScheduleList().size());
				myForm.setIMaxShow(7);

				myForm.setFrmHosname(autoForm.getFrmhosname());
				myForm.setFrmSpecname(autoForm.getFrmspecname());

				myUpdateScheduleService.getDocname(myForm);

				return "gotoSchedule";
			}

		}

		return "gotoSchedule";
	}

	protected String doInit(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping) {

		HttpSession session = request.getSession(false);
		if (session.getAttribute("a_id") == null) {
			return "gotoAdminlogin";
		}

		AdminUpdateScheduleForm myForm = (AdminUpdateScheduleForm) form;

		if (myForm.getFrmFormControl().equals("2")) {
			myUpdateScheduleService.UpdateForSearch(myForm);
			return "gotoDetail";
		} else {

			
			myUpdateScheduleService.firstLoadSearch(myForm);
			

			return "gotoSchedule";
		}

	}

}

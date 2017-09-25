package com.ictti.omas.presentation.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import com.ictti.omas.business.service.HospitalService;
import com.ictti.omas.presentation.form.HospitalForm;

public class HospitalRegisterationAction extends BaseAction {

	private HospitalService myHospitalService;

	public HospitalService getMyHospitalService() {
		return myHospitalService;
	}

	public void setMyHospitalService(HospitalService myHospitalService) {
		this.myHospitalService = myHospitalService;
	}

	@Override
	protected String doExecute(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping)
			throws Exception {
		HttpSession session = request.getSession(false);

		if (session.getAttribute("a_id") == null) {
			return "gotoAdminlogin";
		}

		HospitalForm myForm = (HospitalForm) form;

		if (this.isCancelled(request)) {
			return "gotoAdminHome";}

		if (request.getParameter("btnRegister") != null) {

			ActionErrors errors = new ActionErrors();

			myHospitalService.checkHospitalName(myForm);
			if (myForm.getFrmRegHospitalNameError() == null) {
				errors.add("nameError", new ActionMessage("errors.name"));
				saveErrors(request, errors);

			}

		}

		if (request.getParameter("btnSaveCancel") != null) {
			myForm.setFrmRegFormControl(null);
			return "gotoRegister";
		}

		if (request.getParameter("btnSave") != null) {
			myHospitalService.saveHospital(myForm);
			return "gotoAdminHome";

		}
		return "gotoRegister";
	}

	@Override
	protected String doInit(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping) {
		HttpSession session = request.getSession(false);

		// String id;
		if (session.getAttribute("a_id") == null) {
			return "gotoAdminlogin";
		}

		HospitalForm myForm = (HospitalForm) form;
		myHospitalService.firstLoadRegistration(myForm);

		return "gotoRegister";

	}

}

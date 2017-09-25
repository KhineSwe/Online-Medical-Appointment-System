package com.ictti.omas.presentation.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import com.ictti.omas.business.service.PatientService;
import com.ictti.omas.presentation.form.PatientForm;

public class PatientLoginAction extends BaseAction {
	private PatientService myPatientService;

	public PatientService getMyPatientService() {
		return myPatientService;
	}

	public void setMyPatientService(PatientService myPatientService) {
		this.myPatientService = myPatientService;
	}

	protected String doExecute(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping)
			throws Exception {
		HttpSession session = request.getSession(false);

		PatientForm myForm = (PatientForm) form;
		myPatientService.checkLoginPatient(myForm);
		ActionErrors errors = new ActionErrors();
		if (myForm.getLoginPatient() == null) {
			errors.add("loginerror", new ActionMessage("errors.login"));
			saveErrors(request, errors);
			return "gotologin";
		} else {

			if (myForm.getLoginPatient().getPstatus().equals(0)) {
				errors.add("loginPatientstatuserror", new ActionMessage(
						"errors.loginPatientstatus"));
				saveErrors(request, errors);
				return "gotologin";
			} else {
				request.getSession(true);
				request.getSession().setAttribute("p_id",
						request.getSession().getId());
				request.getSession().setAttribute("pemail",
						myForm.getLoginPatient().getPemail());
				System.out
						.println("email is " + request.getAttribute("pemail"));

				return "gotohome";
			}
		}

	}

	@Override
	protected String doInit(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping) {
		/*
		 * HttpSession session = request.getSession(false); if
		 * (session.getAttribute("p_id") == null) { return "gotologin";
		 * 
		 * }
		 */
		PatientForm myForm = (PatientForm) form;

		myPatientService.checkLoginPatient(myForm);
		return "gotologin";
	}

}

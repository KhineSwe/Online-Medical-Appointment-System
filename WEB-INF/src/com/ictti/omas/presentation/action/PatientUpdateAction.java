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

public class PatientUpdateAction extends BaseAction {
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
		if (session.getAttribute("p_id") == null) {
			return "gotologin";

		}
		PatientForm myForm = (PatientForm) form;

		/*if (request.getParameter("btnUpdateCancel") != null) {
			return "gotohome";
		}
*/
		if (this.isCancelled(request)) {
			return "gotohome";
		}
		
		
		 if (this.isCancelled(request)) { return "gotohome"; }
		 
		if (request.getParameter("btnSaveCancel") != null) {
			myForm.setFrmRegFormControl(null);
			return "gotoUpdate";
		}
		if (request.getParameter("btnUpdate") != null) {
			ActionErrors errors = new ActionErrors();
			if (!myForm.getFrmRegPassword().equals(
					myForm.getFrmRegConfPassword())) {
				errors.add("passwordError", new ActionMessage(
						"errors.matchPassword"));
				saveErrors(request, errors);
			} else
				myForm.setFrmRegFormControl("data");

			return "gotoUpdate";

		}
		if (request.getParameter("btnSave") != null) {
			myPatientService.saveUpdatePatient(myForm);
			return "gotohome";
		}
		return "gotoUpdate";
	}
		

	protected String doInit(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping) {
		HttpSession session = request.getSession(false);
		if (session.getAttribute("p_id") == null) {
			return "gotologin";

		}
		PatientForm myForm = (PatientForm) form;
		PatientForm loginForm = (PatientForm) request.getSession()
				.getAttribute("PatientFormBean");
		myForm.setLoginPatient(loginForm.getLoginPatient());
		myPatientService.fristLoadUpdateProfile(myForm);
		return "gotoUpdate";
	}

}

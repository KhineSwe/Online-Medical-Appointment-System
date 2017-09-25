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

import com.ictti.omas.business.service.PatientService;
import com.ictti.omas.presentation.form.PatientForm;

public class PatientRegisterAction extends BaseAction {
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
		/*
		 * HttpSession session = request.getSession(false); if
		 * (session.getAttribute("p_id") == null) { return "gotoLogin";
		 * 
		 * }
		 */
		PatientForm myForm = (PatientForm) form;

		/*
		 * if(request.getParameter("btnRegisterCancel")!=null) { return
		 * "gotoLogin"; }
		 */

		if (this.isCancelled(request)) {
			return "gotoLogin";
		}

		if (request.getParameter("btnConfirmCancel") != null) {
			myForm.setFrmRegFormControl(null);
			return "gotoRegister";
		}

		if (request.getParameter("btnConfirm") != null) {

			/* myPatientService.prepareForMail(myForm); */
			myPatientService.saveNewPatient(myForm);

			return "gotoSuccessEmail";
		}

		/*
		 * if (request.getParameter("btnConfirm1") != null) {
		 * myPatientService.prepareForMail(myForm); return "gotoLogin"; }
		 */

		if (request.getParameter("btnRegister") != null) {
			int flag = 0;
			ActionErrors errors = new ActionErrors();
			System.out.println("DOB  " + myForm.getFrmRegDOB());
			SimpleDateFormat myformat = new SimpleDateFormat("yyyy-MM-dd");
			/* Date myD1=myformat.parse(myForm.getFrmRegDOB()); */
			Date myD1 = myformat.parse(myForm.getFrmRegDOB());

			Date myD2 = new Date();
			System.out.println("DOB  " + myD1 + "...." + myD2);
			if (myD1.after(myD2)) {

				errors.add("dateerror", new ActionMessage("errors.dateGreater"));
				saveErrors(request, errors);
				return "gotoRegister";
			}
	
			if (!myForm.getFrmRegPassword().equals(
					myForm.getFrmRegConfPassword())) {
				errors.add("passwordError", new ActionMessage(
						"errors.matchPassword"));
				saveErrors(request, errors);
				flag = 1;
			}
			if (flag == 0) {
				myPatientService.checkEmail(myForm);
				if (myForm.getFrmRegEmailError() == null) {
					errors.add("emailError", new ActionMessage("errors.email"));
					saveErrors(request, errors);
				}
			}
		}
		return "gotoRegister";
	}

	protected String doInit(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping) {
		/*
		 * HttpSession session = request.getSession(false); if
		 * (session.getAttribute("p_id") == null) { return "gotoLogin";
		 * 
		 * }
		 */
		PatientForm myForm = (PatientForm) form;
		myPatientService.firstLoadRegistration(myForm);
		return "gotoRegister";
	}
}

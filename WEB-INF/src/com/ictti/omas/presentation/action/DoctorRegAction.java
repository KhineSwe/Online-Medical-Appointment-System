package com.ictti.omas.presentation.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.upload.FormFile;

import com.ictti.omas.business.service.DoctorService;
import com.ictti.omas.presentation.form.DoctorForm;

public class DoctorRegAction extends BaseAction {

	private DoctorService myDoctorService;

	public DoctorService getMyDoctorService() {
		return myDoctorService;
	}

	public void setMyDoctorService(DoctorService myDoctorService) {
		this.myDoctorService = myDoctorService;
	}

	protected String doExecute(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping)
			throws Exception {
		HttpSession session = request.getSession(false);
		ActionErrors errors = new ActionErrors();
		if (session.getAttribute("a_id") == null) {
			return "gotoAdminlogin";
		}

		DoctorForm myForm = (DoctorForm) form;
		if (this.isCancelled(request)) {
			return "gotoAdminHome";
		}

		if (request.getParameter("btnRegister") != null) {
			System.out.println(myForm.getFrmRegSpecializeId());

			int flag = 0;

			if (myForm.getFrmRegSpecializeId().equals("0")) {
				errors.add("specializeError", new ActionMessage(
						"errors.specialize"));
				saveErrors(request, errors);
				flag = 1;
			}

			if (!myForm.getFrmRegPassword().equals(
					myForm.getFrmRegConfPassword())) {
				errors.add("passwordError", new ActionMessage(
						"errors.matchPassword"));
				saveErrors(request, errors);
				flag = 1;
			}
			if (flag == 0) {
				myDoctorService.checkDoctorEmail(myForm);
				if (myForm.getFrmRegDoctorEmailError() == null) {
					errors.add("EmailError", new ActionMessage("Errors.email"));
					saveErrors(request, errors);
				}
			}

		}

		if (request.getParameter("btnaddImage") != null) {

			myDoctorService.lastDoctrid(myForm);
			if (myForm.getFrmUploadFile().getFileSize() == 0) {
				errors.add("PleaseChoose", new ActionMessage(
						"errors.PleaseChoose"));
				saveErrors(request, errors);
				System.out.println("TOOO Small"
						+ myForm.getFrmUploadFile().getFileSize());
				return "gotoChooseDegree";
			} else if (myForm.getFrmUploadFile().getFileSize() > 16777210) {
				System.out.println("TOOO Large"
						+ myForm.getFrmUploadFile().getFileSize());
				errors.add("SmallersizeChoose", new ActionMessage(
						"errors.SmallersizeChoose"));
				saveErrors(request, errors);
				return "gotoChooseDegree";

			} else {
				myDoctorService.saveDoctordegree(myForm);

				return "gotoChooseDegree";

			}
		}

		if (request.getParameter("btnSaveCancel") != null) {
			myForm.setFrmRegFormControl(null);
			return "gotoRegister";
		}

		if (request.getParameter("btnOK") != null) {

			myDoctorService.lastDoctrid(myForm);
			myDoctorService.checkDid(myForm);

			if (myForm.getFrmErrorDID() == null) {
				errors.add("PleaseChoose", new ActionMessage(
						"errors.PleaseChoose"));
				saveErrors(request, errors);
				return "gotoChooseDegree";

			} else {

				String docemail = myForm.getFrmRegEmail();
				myDoctorService.sendEmail(myForm, docemail);
				return "gotoRegMail";

			}

		}

		if (request.getParameter("btnSave") != null) {

			myDoctorService.saveDoctor(myForm);
			myDoctorService.lastDoctrid(myForm);
			return "gotoChooseDegree";

		}

		if (request.getParameter("btnhome") != null) {

			/* myDoctorService.saveDoctor(myForm); */

			return "gotoAdminHome";

		}

		return "gotoRegister";
	}

	@Override
	protected String doInit(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping) {
		HttpSession session = request.getSession(false);
		if (session.getAttribute("a_id") == null) {
			return "gotoAdminlogin";
		}

		DoctorForm myForm = (DoctorForm) form;
		myDoctorService.firstLoadRegistration(myForm);
		return "gotoRegister";
	}

}

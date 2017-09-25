package com.ictti.omas.presentation.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import com.ictti.omas.business.entity.Doctor;
import com.ictti.omas.business.service.DoctorService;
import com.ictti.omas.presentation.form.DoctorForm;

public class LoginAction extends BaseAction {

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

		DoctorForm myForm = (DoctorForm) form;

		myDoctorService.checkLoginDoctor(myForm);
		

		ActionErrors errors = new ActionErrors();
		if (myForm.getLoginDoctor() == null) {
			System.out.println("Invalid Login");
			errors.add("loginerror", new ActionMessage("errors.login"));
			saveErrors(request, errors);
			return "gotologin";
		} else {
			if (myForm.getLoginDoctor().getDstatus().equals(0)) {
				errors.add("loginDoctorstatuserror", new ActionMessage(
						"errors.loginDoctorstatus"));
				saveErrors(request, errors);
				return "gotologin";
			} else {
				request.getSession(true);
				request.getSession().setAttribute("id",
						request.getSession().getId());
				System.out.println("email is ......"
						+ myForm.getLoginDoctor().getDemail());
				request.getSession().setAttribute("demail",
						myForm.getLoginDoctor().getDemail());

				String dname=myForm.getLoginDoctor().getDname();
				myForm.setFrmDname(dname);
				
				// for rating
				int did = myForm.getLoginDoctor().getId();
				
				System.out.println("did is " + did);
				myDoctorService.myDrateValue(myForm, did);

				if (myForm.getMydrateValue() != null) {

					System.out.print("Hello************" + myForm.getMydrateValue()
							+ "Hello");

					return "gotoDochome";
				}
			}

		}
		return "gotoDochome";
		
	}

	@Override
	protected String doInit(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping) {

		return "gotologin";
	}

}

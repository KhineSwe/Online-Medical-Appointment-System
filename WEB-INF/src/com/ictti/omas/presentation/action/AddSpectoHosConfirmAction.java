package com.ictti.omas.presentation.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.ictti.omas.business.service.AddSpecializeService;
import com.ictti.omas.presentation.form.AddspForm;

public class AddSpectoHosConfirmAction extends BaseAction {
	private AddSpecializeService myAddspService;

	public AddSpecializeService getMyAddspService() {
		return myAddspService;
	}

	public void setMyAddspService(AddSpecializeService myAddspService) {
		this.myAddspService = myAddspService;
	}

	@Override
	protected String doExecute(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping)
			throws Exception {
		HttpSession session = request.getSession(false);
		
		if (session.getAttribute("a_id") == null) {
			return "gotoAdminlogin";
		}

		AddspForm myForm = (AddspForm) form;
		System.out.println("Hospital" + myForm.getFrmHosId());
		myAddspService.getHosname(myForm);

		if (request.getParameter("btnConfirm") != null) {
			int hosid=Integer.parseInt(myForm.getFrmHosId());
			
			myAddspService.checkExistedSpecialize(myForm,hosid);
			
			/*System.out.println("Specialize list ="+myForm.getFrmSpecializeList());

						myForm.getFrmSpecializeList().get(0).getSpecializetype();
			
			System.out.println("*********************Specialize type = "+myForm.getFrmSpecializeList().get(0).getSpecializetype());*/
			
			myAddspService.saveSpecializeToHospital(myForm,
					Integer.parseInt(myForm.getFrmHosId()));
			
			return "gotoAdminHome";
		}

		if (request.getParameter("btnCancel") != null) {
			myForm.setFrmSpError("");
			return "gotoAdminSpe";
		}

		
		

		return "gotoAdminSpe";

	}

}

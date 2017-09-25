package com.ictti.omas.presentation.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import com.ictti.omas.business.service.AdminService;
import com.ictti.omas.presentation.form.AdminForm;
import com.ictti.omas.presentation.form.PatientForm;



public class AdminLoginAction extends BaseAction {
	private AdminService  myAdminService;


	public AdminService getMyAdminService() {
		return myAdminService;
	}

	public void setMyAdminService(AdminService myAdminService) {
		this.myAdminService = myAdminService;
	}

	@Override
	protected String doExecute(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping)
			throws Exception {

		HttpSession session = request.getSession(false);
		
		/*if (session.getAttribute("a_id") == null) {
			return "gotoAdminlogin";
		}
*/
		
		AdminForm myForm = (AdminForm) form;
		myAdminService.checkLoginAdmin(myForm);
		ActionErrors errors = new ActionErrors();
		if (myForm.getLoginAdmin() == null) {
			errors.add("loginerror", new ActionMessage("errors.login"));
			saveErrors(request, errors);
			return "gotoAdminlogin";
		} else {
			request.getSession(true);
			request.getSession().setAttribute("a_id",
					request.getSession().getId());
			request.getSession().setAttribute("admemail",myForm.getLoginAdmin().getAdmemail());
			System.out.println("email is "+ request.getAttribute("admemail"));
			
			return "gotoAdminhome";
		}
		

	
	
	}

	@Override
	protected String doInit(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping) {
		HttpSession session = request.getSession(false);
		if (session.getAttribute("a_id") == null) {
			return "gotoAdminlogin";
		}

		return "gotoSchedule";
	}
	

}

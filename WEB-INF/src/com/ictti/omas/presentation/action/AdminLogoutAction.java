package com.ictti.omas.presentation.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.ictti.omas.presentation.form.AdminForm;

public class AdminLogoutAction extends BaseAction {

	@Override
	protected String doExecute(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping)
			throws Exception {
		return "gotoAdminlogin";
	}
	protected String doInit(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping) {
		AdminForm myForm = (AdminForm) form;
		myForm.setFrmEmail("");
		myForm.setFrmPassword("");
		HttpSession session=request.getSession(false);
		session.removeAttribute("a_id");
		
		//session.invalidate();
		return "gotoAdminlogin";
	}

	

}

package com.ictti.omas.presentation.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.ictti.omas.presentation.form.PatientForm;

public class PatientLogoutAction extends BaseAction {

	protected String doExecute(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping)
			throws Exception {

		return "gotologin";
	}

	protected String doInit(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping) {
		PatientForm myform=(PatientForm) form;
		myform.setFrmEmail("");
		myform.setFrmPassword("");
		HttpSession session = request.getSession(false);
		session.removeAttribute("p_id");
		
		//session.invalidate();
		return "gotologin";
	}

}

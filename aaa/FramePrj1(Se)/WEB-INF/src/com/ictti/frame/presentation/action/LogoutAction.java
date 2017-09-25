package com.ictti.frame.presentation.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

public class LogoutAction extends BaseAction {

	@Override
	protected String doInit(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping) {
		System.out.println("here....");
		HttpSession session=request.getSession(false);
		session.removeAttribute("studentFormBean");
		session.invalidate();
		return "gotologin";
	}

	@Override
	protected String doExecute(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping)
			throws Exception {
		System.out.println("here....");
		HttpSession session=request.getSession(false);
		session.removeAttribute("studentFormBean");
		session.invalidate();
		return "gotologin";
	}

}

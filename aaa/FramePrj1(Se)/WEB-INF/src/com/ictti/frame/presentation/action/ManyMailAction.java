package com.ictti.frame.presentation.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.ictti.frame.business.service.EmailService;


import com.ictti.frame.presentation.form.ManyMailForm;

public class ManyMailAction extends BaseAction {
	private EmailService myEmailService;

	

	

	public EmailService getMyEmailService() {
		return myEmailService;
	}

	public void setMyEmailService(EmailService myEmailService) {
		this.myEmailService = myEmailService;
	}

	@Override
	protected String doExecute(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping)
			throws Exception {
		
		HttpSession session = request.getSession(false);
		if(session.getAttribute("id") == null) {
		return "gotoLogin";
		
		}
		
		
		ManyMailForm myForm=(ManyMailForm) form;
		if(request.getParameter("btnSend")!=null){
		myEmailService.prepareForManyMail(myForm);
		return "gotoMail";
		}
		if(request.getParameter("btnCancel")!=null){
		return "gotoHome";
		}
		return "gotoLogin";
	}

	@Override
	protected String doInit(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping) {
		// TODO Auto-generated method stub
		return "gotoMail";
	}
}

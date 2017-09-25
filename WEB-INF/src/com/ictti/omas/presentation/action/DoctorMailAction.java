package com.ictti.omas.presentation.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import com.ictti.omas.business.service.EmailService;
import com.ictti.omas.presentation.form.MailForm;

public class DoctorMailAction extends BaseAction {

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

		MailForm myForm = (MailForm) form;

		HttpSession session = request.getSession(false);
		/*
		 * if (session.getAttribute("id") == null) { return "gotologin"; }
		 */
		System.out.println("Did " + session.getAttribute("id"));
		ActionErrors errors = new ActionErrors();

		if (session.getAttribute("id") != null) {
			if (request.getParameter("btnMailSend") != null) {
				myForm.setFrmMailNotiMessage("");
				if (myForm.getFrmMailName().equals("")
						&& myForm.getFrmMailMsg().equals("")) {
					errors.add("nullMailNameAddressMsg", new ActionMessage(
							"errors.nullMailNameAddressMsg"));
					saveErrors(request, errors);
					return "gotoMailafterlogin";

				} else {
					if (myForm.getFrmMailName().equals("")) {
						errors.add("nullMailNameMsg", new ActionMessage(
								"errors.nullMailNameMsg"));
						saveErrors(request, errors);
						return "gotoMailafterlogin";

					}
					if (myForm.getFrmMailMsg().equals("")) {
						errors.add("nullMailAddMsg", new ActionMessage(
								"errors.nullMailAddMsg"));
						saveErrors(request, errors);
						return "gotoMailafterlogin";

					}

					System.out.println("To Mail Sent 111");
					myEmailService.prepareForMail(myForm);
					myForm.setFrmMailAdd("");
					myForm.setFrmMailMsg("");
					myForm.setFrmMailName("");
					

					return "gotoMailafterlogin";
				}
			}
		} else {

			if (request.getParameter("btnSend") != null) {
				myForm.setFrmMailNotiMessage("");
				if (myForm.getFrmMailName().equals("")
						&& myForm.getFrmMailMsg().equals("")) {
					errors.add("nullMailNameAddressMsg", new ActionMessage(
							"errors.nullMailNameAddressMsg"));
					saveErrors(request, errors);
					return "gotoMailbeforelogin";

				} else {
					if (myForm.getFrmMailName().equals("")) {
						errors.add("nullMailNameMsg", new ActionMessage(
								"errors.nullMailNameMsg"));
						saveErrors(request, errors);
						return "gotoMailbeforelogin";

					}
					if (myForm.getFrmMailMsg().equals("")) {
						errors.add("nullMailAddMsg", new ActionMessage(
								"errors.nullMailAddMsg"));
						saveErrors(request, errors);
						return "gotoMailbeforelogin";

					}
					System.out.println("To Mail Sent 111");
					myEmailService.prepareForMail(myForm);
					myForm.setFrmMailAdd("");
					myForm.setFrmMailMsg("");
					myForm.setFrmMailName("");
					

					return "gotoMailbeforelogin";
				}

			}
		}

		return null;

	}

	@Override
	protected String doInit(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping) {
		// TODO Auto-generated method stub
		MailForm myForm = (MailForm) form;
		HttpSession session = request.getSession(false);
		if (session.getAttribute("id") != null) {
			myForm.setFrmMailAdd("");
			myForm.setFrmMailMsg("");
			myForm.setFrmMailName("");
			myForm.setFrmMailNotiMessage("");
			return "gotoContactHome";
		} else {
			myForm.setFrmMailAdd("");
			myForm.setFrmMailMsg("");
			myForm.setFrmMailName("");
			myForm.setFrmMailNotiMessage("");
			return "gotoMailbeforelogin";
		}
	}
}

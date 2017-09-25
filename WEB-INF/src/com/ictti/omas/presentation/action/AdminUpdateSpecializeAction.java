package com.ictti.omas.presentation.action;

import java.util.LinkedList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import com.ictti.omas.business.entity.Hospital;
import com.ictti.omas.business.entity.Specialize;
import com.ictti.omas.business.service.AdminUpdateSpecializeService;
import com.ictti.omas.presentation.form.AddspForm;
import com.ictti.omas.presentation.form.AutoComplementForm;
import com.sun.org.apache.xalan.internal.xsltc.runtime.ErrorMessages;

public class AdminUpdateSpecializeAction extends BaseAction {

	private AdminUpdateSpecializeService myAdminUpdateSpecializeService;

	public AdminUpdateSpecializeService getMyAdminUpdateSpecializeService() {
		return myAdminUpdateSpecializeService;
	}

	public void setMyAdminUpdateSpecializeService(
			AdminUpdateSpecializeService myAdminUpdateSpecializeService) {
		this.myAdminUpdateSpecializeService = myAdminUpdateSpecializeService;
	}

	protected String doExecute(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping)
			throws Exception {
		AddspForm myForm = (AddspForm) form;
		HttpSession session = request.getSession(false);

		if (session.getAttribute("a_id") == null) {
			return "gotoAdminlogin";
		}
		if (this.isCancelled(request)) {
			return "gotoUpdateSpecialize";}


		// myForm.getFrmSpecializeUpdateList();
		if (request.getParameter("btnSelect") != null) {
			myAdminUpdateSpecializeService.getSpecName(myForm);

			return "gotoSpecNew";
		}
		
		if (request.getParameter("btnUpdate") != null) {
			/*
			 * ActionErrors errors=new ActionErrors();
			 * if(myForm.getFrmUpdateSpe().isEmpty()) {
			 * System.out.println("!!!!!!!!!!!");
			 * errors.add("nullSpecializeName",new
			 * ActionMessage("errors.nullSpecializeName")); saveErrors(request,
			 * errors); myForm.setFrmUpdateSpe(""); return "gotoSpecNew"; }
			 * else{
			 */

			ActionErrors errors = new ActionErrors();

			if (myForm.getFrmUpdateSpe().length() == 0) {
				myForm.setFrmUpdateSpe("");
				errors.add("NullUpdateSpecialize", new ActionMessage(
						"errors.NullUpdateSpecialize"));
				saveErrors(request, errors);

				return "gotoSpecNew";
			} else

			{

				myAdminUpdateSpecializeService.checkSpecialize(myForm);
				if (myForm.getFrmSpecialize() != null) {
					errors.add("SpecializeExist", new ActionMessage(
							"errors.specializeExist"));
					saveErrors(request, errors);
					return "gotoSpecNew";
				}

				myAdminUpdateSpecializeService.saveUpdateSpe(myForm);

				return "gotoUpdateSpe";
			}
		}

		return "gotoSpecNew";
	}

	@Override
	protected String doInit(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping) {

		AddspForm myForm = (AddspForm) form;

		HttpSession session = request.getSession(false);

		if (session.getAttribute("a_id") == null) {
			return "gotoAdminlogin";
		}

		// List speclist= new LinkedList();

		myAdminUpdateSpecializeService.getAllAdminSpecialize(myForm);

		return "gotoUpdateSpe";

	}

}

package com.ictti.omas.presentation.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import com.ictti.omas.business.service.NameAutoComplementService;
import com.ictti.omas.presentation.form.NameAutoComplementForm;

public class SearchByNameAction extends BaseAction {
	private NameAutoComplementService myNameAutoComplementService;

	public NameAutoComplementService getMyNameAutoComplementService() {
		return myNameAutoComplementService;
	}

	public void setMyNameAutoComplementService(
			NameAutoComplementService myNameAutoComplementService) {
		this.myNameAutoComplementService = myNameAutoComplementService;
	}

	@Override
	protected String doExecute(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping)
			throws Exception {
		NameAutoComplementForm myForm = (NameAutoComplementForm) form;
		HttpSession session = request.getSession(false);
		if (session.getAttribute("a_id") == null) {
			return "gotoAdminlogin";
		}
		if (request.getParameter("next") != null)
			myForm.setActualPage(myForm.getActualPage() + 1);
		if (request.getParameter("prev") != null)
			myForm.setActualPage(myForm.getActualPage() - 1);

		String pname = myForm.getFrmPatientName();

		myNameAutoComplementService.firstLoadSearch(myForm, pname);

		if (myForm.getFrmPatientNameList() == null) {
			ActionErrors errors = new ActionErrors();
			errors.add("searchpnameerror", new ActionMessage(
					"errors.searchpname"));
			saveErrors(request, errors);
			return "gotoNameSearch";
		}

		return "gotoNameSearch";
	}



}

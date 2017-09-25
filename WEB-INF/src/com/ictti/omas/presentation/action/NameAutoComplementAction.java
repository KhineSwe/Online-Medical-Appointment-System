package com.ictti.omas.presentation.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.ictti.omas.business.service.NameAutoComplementService;
import com.ictti.omas.presentation.form.NameAutoComplementForm;

public class NameAutoComplementAction extends BaseAction {
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
		{
			if (myForm.getFrmPatientNameList() == null) {
				System.out.println("no no ...");
				return "gotoNoPatient";
			} else
				return "gotoNameSearch";
		}

		
	}

	@Override
	protected String doInit(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping) {
		NameAutoComplementForm myForm = (NameAutoComplementForm) form;
		HttpSession session = request.getSession(false);
		if (session.getAttribute("a_id") == null) {
			return "gotoAdminlogin";
		}

		session = request.getSession(false);
		String pname = (String) session.getAttribute("pname");
		
		if (myForm.getFrmControl().equals("2")) {
			System.out.println("aaaa" + myForm.getFrmDetailPatientListId());
			myNameAutoComplementService.detailForSearch(myForm);
			System.out.println("dddddd" + myForm.getFrmPatientListDetail());
			return "gotoDetailNameSearch";
		} else {
			myForm.setFrmStatusChangeErr("");
			myNameAutoComplementService.firstLoadSearch(myForm, pname);
			return "gotoAuto";
		}
	}
}

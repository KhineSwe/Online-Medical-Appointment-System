package com.ictti.omas.presentation.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.ictti.omas.business.service.NameAutoComplementService;
import com.ictti.omas.presentation.form.NameAutoComplementForm;

public class NameDetailAction extends BaseAction {
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

		if (null != request.getParameter("next"))
			myForm.setActualPage(myForm.getActualPage() + 1);
		// if prev button, doPrev
		if (null != request.getParameter("prev"))
			myForm.setActualPage(myForm.getActualPage() - 1);
		myNameAutoComplementService.firstLoadSearch(myForm);

		return "gotoAuto";
	}


	@Override
	protected String doInit(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping) {
		// TODO Auto-generated method stub
		NameAutoComplementForm myForm = (NameAutoComplementForm) form;
		HttpSession session = request.getSession(false);
		if (session.getAttribute("a_id") == null) {
			return "gotoAdminlogin";
		}
		if (myForm.getFrmControl().equals("2")) {
			System.out.println("aaaa" + myForm.getFrmDetailPatientListId());
			myNameAutoComplementService.detailForSearch(myForm);
			System.out.println("dddddd" + myForm.getFrmPatientListDetail());
			return "gotoDetailNameSearch";
		} else {
		
			myNameAutoComplementService.firstLoadSearch(myForm);
			return "gotoAuto";
		}
	
	

}
}



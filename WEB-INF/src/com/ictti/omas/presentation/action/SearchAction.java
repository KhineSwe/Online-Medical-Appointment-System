package com.ictti.omas.presentation.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.ictti.omas.business.service.HospitalService;
import com.ictti.omas.presentation.form.HospitalUpdateForm;

public class SearchAction extends BaseAction {
	private HospitalService mySearchService;

	public HospitalService getMySearchService() {
		return mySearchService;
	}

	public void setMySearchService(HospitalService mySearchService) {
		this.mySearchService = mySearchService;
	}

	protected String doExecute(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping)
			throws Exception {
		HospitalUpdateForm myForm = (HospitalUpdateForm) form;
		HttpSession session = request.getSession(false);
		if (session.getAttribute("a_id") == null) {
			return "gotologin";
		}
		// if next button, doNext
		if (null != request.getParameter("next"))
			myForm.setActualPage(myForm.getActualPage() + 1);
		// if prev button, doPrev
		if (null != request.getParameter("prev"))
			myForm.setActualPage(myForm.getActualPage() - 1);
		return "gotoSearch";
	}

	@Override
	protected String doInit(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping) {
		HospitalUpdateForm myForm = (HospitalUpdateForm) form;
		HttpSession session = request.getSession(false);
		if (session.getAttribute("a_id") == null) {
			return "gotologin";
		}
		if (myForm.getFrmControl().equals("2")) {

			mySearchService.detailForSearch(myForm);
			return "gotoDetail";
		} else {
			mySearchService.firstLoadSearch(myForm);
			return "gotoSearch";
		}

	}
}
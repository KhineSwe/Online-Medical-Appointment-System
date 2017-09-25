package com.ictti.omas.presentation.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.ictti.omas.business.service.TreatmentSpecializeSearchService;
import com.ictti.omas.presentation.form.SpecializeAjaxSearchForm;
import com.ictti.omas.presentation.form.SpecializeSearchForm;

public class TreatmentSpecializeSearchAction extends BaseAction {

	private TreatmentSpecializeSearchService mySpecializeSearchService;

	public TreatmentSpecializeSearchService getMySpecializeSearchService() {
		return mySpecializeSearchService;
	}

	public void setMySpecializeSearchService(
			TreatmentSpecializeSearchService mySpecializeSearchService) {
		this.mySpecializeSearchService = mySpecializeSearchService;
	}

	@Override
	protected String doExecute(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping)
			throws Exception {

		SpecializeAjaxSearchForm myForm = (SpecializeAjaxSearchForm) form;
		HttpSession session = request.getSession(false);
		if (session.getAttribute("p_id") == null) {
			return "gotologin";
		}

		// if next button, doNext
		if (null != request.getParameter("next"))

			myForm.setActualPage(myForm.getActualPage() + 1);
		// if prev button, doPrev
		if (null != request.getParameter("prev"))
			myForm.setActualPage(myForm.getActualPage() - 1);

		if (null != request.getParameter("btnOk")) {
			return "gotoSearch";
		}

		String specializetype = myForm.getFrmSpecialize();
		String pemail = (String) session.getAttribute("pemail");

		if (null != request.getParameter("search"))
		{	
		mySpecializeSearchService.firstSearch(myForm, pemail, specializetype);
		{
			if (myForm.getFrmTreatmentSpecializeList() == null) {
				return "gotoNoList";
			} else {
				return "gotoSearch";
			}
		}

	}
		return "gotoSearch";
		
	}

	@Override
	protected String doInit(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping) {

		SpecializeAjaxSearchForm myForm = (SpecializeAjaxSearchForm) form;
		HttpSession session = request.getSession(false);
		if (session.getAttribute("p_id") == null) {
			return "gotologin";
		}

		if (myForm.getFrmControl().equals("7")) {
			mySpecializeSearchService.detailForSearch(myForm);

			return "gotoDetail";
		} else {

			return "gotoSearch";
		}
	}

}

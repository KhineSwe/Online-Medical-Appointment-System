package com.ictti.omas.presentation.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.ictti.omas.business.service.TreatmentbyspecializeService;
import com.ictti.omas.presentation.form.SpecializeSearchForm;

public class TreatmentListbyspecializeAction extends BaseAction {

	private TreatmentbyspecializeService mySpecializeSearchService;

	

	public TreatmentbyspecializeService getMySpecializeSearchService() {
		return mySpecializeSearchService;
	}

	public void setMySpecializeSearchService(
			TreatmentbyspecializeService mySpecializeSearchService) {
		this.mySpecializeSearchService = mySpecializeSearchService;
	}

	@Override
	protected String doExecute(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping)
			throws Exception {

		SpecializeSearchForm myForm = (SpecializeSearchForm) form;

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

		return "gotoSearch";

	}

	protected String doInit(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping) {

		SpecializeSearchForm myForm = (SpecializeSearchForm) form;

		HttpSession session = request.getSession(false);
		if (session.getAttribute("p_id") == null) {
			return "gotologin";
		}

		String pemail = (String) session.getAttribute("pemail");
		System.out.println(pemail);

		if (myForm.getFrmControl().equals("5"))

		{
			mySpecializeSearchService.firstLoadSearch(myForm, pemail);

			if (myForm.getFrmTreatmentList() == null) {
				System.out.println("no list");
				return "gotoNoList";
			} else
				return "gotoSearch";
		} 
		
		
		if (myForm.getFrmControl().equals("6"))
		{
			mySpecializeSearchService.detailForSearch(myForm);
			return "gotoDetail";
		}

	
	return "gotoSearch";
}
}
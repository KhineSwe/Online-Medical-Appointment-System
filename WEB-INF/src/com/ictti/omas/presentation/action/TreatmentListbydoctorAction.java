package com.ictti.omas.presentation.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import com.ictti.omas.business.service.TreatmentbydoctorService;
import com.ictti.omas.presentation.form.DoctorSearchForm;


public class TreatmentListbydoctorAction extends BaseAction {

	private TreatmentbydoctorService myDoctorSearchService;

	public TreatmentbydoctorService getMyDoctorSearchService() {
		return myDoctorSearchService;
	}

	public void setMyDoctorSearchService(
			TreatmentbydoctorService myDoctorSearchService) {
		this.myDoctorSearchService = myDoctorSearchService;
	}

	@Override
	protected String doExecute(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping)
			throws Exception {

		DoctorSearchForm myForm = (DoctorSearchForm) form;

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

		DoctorSearchForm myForm = (DoctorSearchForm) form;

		HttpSession session = request.getSession(false);
		if (session.getAttribute("p_id") == null) {
			return "gotologin";
		}

		String pemail = (String) session.getAttribute("pemail");
		System.out.println(pemail);

		if (myForm.getFrmControl().equals("3"))

		{
			myDoctorSearchService.firstLoadSearch(myForm, pemail);

			if (myForm.getFrmTreatmentList() == null) {
				System.out.println("no list");
				return "gotoNoList";
			} else
				return "gotoSearch";
		} else {
			myDoctorSearchService.detailForSearch(myForm);
			return "gotoDetail";
		}

	}

}

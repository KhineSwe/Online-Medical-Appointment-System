package com.ictti.omas.presentation.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.ictti.omas.business.entity.Doctor;
import com.ictti.omas.business.service.TreatmentSearchService;
import com.ictti.omas.presentation.form.DoctorForm;
import com.ictti.omas.presentation.form.TreatmentSearchForm;

public class TreatmentSearchAction extends BaseAction {

	private TreatmentSearchService myTreatmentSearchService;

	public TreatmentSearchService getMyTreatmentSearchService() {
		return myTreatmentSearchService;
	}

	public void setMyTreatmentSearchService(
			TreatmentSearchService myTreatmentSearchService) {
		this.myTreatmentSearchService = myTreatmentSearchService;
	}

	@Override
	protected String doExecute(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping)
			throws Exception {

		TreatmentSearchForm myForm = (TreatmentSearchForm) form;

		HttpSession session = request.getSession(false);
		if (session.getAttribute("id") == null) {
			return "gotologin";
		}

		if (null != request.getParameter("next"))
			myForm.setActualPage(myForm.getActualPage() + 1);

		if (null != request.getParameter("prev"))
			myForm.setActualPage(myForm.getActualPage() - 1);

		return "gotoSearch";
	}

	@Override
	protected String doInit(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping) {

		TreatmentSearchForm myForm = (TreatmentSearchForm) form;

		HttpSession session = request.getSession(false);

		// String id;
		if (session.getAttribute("id") == null) {
			return "gotologin";
		}
		String demail = (String) session.getAttribute("demail");
		System.out.println(demail);
		
		System.out.println("form control is"+myForm.getFrmControl());

		if (myForm.getFrmControl().equals("2")) {
			myTreatmentSearchService.detailForSearch(myForm);
			return "gotoDetail";
		} else {

			myTreatmentSearchService.firstLoadSearch(myForm, demail);
			{
				if (myForm.getFrmTreatmentList() == null) {
					System.out.println("no list");
					return "gotoNolist";
				} else
					return "gotoSearch";
			}
		}

	}

}

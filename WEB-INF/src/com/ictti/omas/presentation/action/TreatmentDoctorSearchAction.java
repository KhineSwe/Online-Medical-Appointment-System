package com.ictti.omas.presentation.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.ictti.omas.business.service.TreatmentDoctorSearchService;
import com.ictti.omas.presentation.form.DoctorAjaxSearchForm;
import com.ictti.omas.presentation.form.DoctorSearchForm;

public class TreatmentDoctorSearchAction extends BaseAction {

	private TreatmentDoctorSearchService myDoctorSearchService;

	public TreatmentDoctorSearchService getMyDoctorSearchService() {
		return myDoctorSearchService;
	}

	public void setMyDoctorSearchService(
			TreatmentDoctorSearchService myDoctorSearchService) {
		this.myDoctorSearchService = myDoctorSearchService;
	}

	@Override
	protected String doExecute(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping)
			throws Exception {

		DoctorAjaxSearchForm myForm = (DoctorAjaxSearchForm) form;
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

		String dname = myForm.getFrmDoctorName();
		String pemail = (String) session.getAttribute("pemail");

		if (null != request.getParameter("search")) {

			myDoctorSearchService.firstSearch(myForm, pemail, dname);
			{
				if (myForm.getFrmTreatmentDoctorlList() == null) {
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

		DoctorAjaxSearchForm myForm = (DoctorAjaxSearchForm) form;
		HttpSession session = request.getSession(false);
		if (session.getAttribute("p_id") == null) {
			return "gotologin";
		}

		if (myForm.getFrmControl().equals("7")) {
			myDoctorSearchService.detailForSearch(myForm);

			return "gotoDetail";
		} else {

			return "gotoSearch";
		}
	}

}

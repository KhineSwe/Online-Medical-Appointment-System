package com.ictti.omas.presentation.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import com.ictti.omas.business.service.TreatmentService;
import com.ictti.omas.presentation.form.HospitalSearchForm;


public class TreatmentListAction extends BaseAction {

	private TreatmentService myTreatmentService;

	public TreatmentService getMyTreatmentService() {
		return myTreatmentService;
	}

	public void setMyTreatmentService(TreatmentService myTreatmentService) {
		this.myTreatmentService = myTreatmentService;
	}

	@Override
	protected String doExecute(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping)
			throws Exception {

		HospitalSearchForm myForm = (HospitalSearchForm) form;

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
		HospitalSearchForm myForm = (HospitalSearchForm) form;

		HttpSession session = request.getSession(false);
		if (session.getAttribute("p_id") == null) {
		
			return "gotologin";
		}
		System.out.println(session.getAttribute("p_id"));

		String pemail = (String) session.getAttribute("pemail");
		System.out.println(pemail);

		if (myForm.getFrmControl().equals("2")) {
			myTreatmentService.detailForSearch(myForm);
			return "gotoDetail";
		} else {

			myTreatmentService.firstLoadSearch(myForm, pemail);
			{
				if (myForm.getFrmTreatmentList() == null) {
					return "gotoNoList";
				} else {
					
					return "gotoSearch";
				}
			}
		}
	}

}

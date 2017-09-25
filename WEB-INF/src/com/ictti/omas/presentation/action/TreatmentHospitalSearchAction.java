package com.ictti.omas.presentation.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.ictti.omas.business.service.TreatmentHospitalSearchService;
import com.ictti.omas.presentation.form.HospitalAjaxSearchForm;
import com.ictti.omas.presentation.form.HospitalSearchForm;

public class TreatmentHospitalSearchAction extends BaseAction {

	private TreatmentHospitalSearchService myHospitalSearchService;

	public TreatmentHospitalSearchService getMyHospitalSearchService() {
		return myHospitalSearchService;
	}

	public void setMyHospitalSearchService(
			TreatmentHospitalSearchService myHospitalSearchService) {
		this.myHospitalSearchService = myHospitalSearchService;
	}

	@Override
	protected String doExecute(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping)
			throws Exception {

		HospitalAjaxSearchForm myForm = (HospitalAjaxSearchForm) form;
		HttpSession session = request.getSession(false);
		
		if (session.getAttribute("p_id") == null) {
			return "gotologin";
		}
		if (null != request.getParameter("next"))

			myForm.setActualPage(myForm.getActualPage() + 1);
		// if prev button, doPrev
		if (null != request.getParameter("prev"))
			myForm.setActualPage(myForm.getActualPage() - 1);

		String hname = myForm.getFrmHospitalName();
		String pemail = (String) session.getAttribute("pemail");

		if (null != request.getParameter("search"))
		{			
		myHospitalSearchService.firstLoadSearch(myForm, pemail, hname);
		
		
			if (myForm.getFrmTreatmentHospitalList() == null) {
				return "gotoNoList";
			} else
				System.out.println("Have in Ajax");
			System.out.println("Email"+pemail);
			System.out.println("Hname"+hname);
				return "gotoSearch";
		}
		return "gotoSearch";
	}


	@Override
	protected String doInit(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping) {

		HospitalAjaxSearchForm myForm = (HospitalAjaxSearchForm) form;
		HttpSession session = request.getSession(false);
		if (session.getAttribute("p_id") == null) {
			return "gotologin";
		}

			if(myForm.getFrmControl().equals("7")) {
				myHospitalSearchService.detailForSearch(myForm);
				return "gotoDetail";
		}
		else {

			return "gotoSearch";
		}
	}

}

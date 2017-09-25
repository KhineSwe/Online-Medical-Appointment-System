package com.ictti.omas.presentation.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import com.ictti.omas.business.service.TreatmentPatientSearchService;
import com.ictti.omas.presentation.form.TreatmentPatientSearchForm;

public class TreatmentPatientSearchAction extends BaseAction {

	private TreatmentPatientSearchService myPatientSearchService;

	public TreatmentPatientSearchService getMyPatientSearchService() {
		return myPatientSearchService;
	}

	public void setMyPatientSearchService(
			TreatmentPatientSearchService myPatientSearchService) {
		this.myPatientSearchService = myPatientSearchService;
	}

	@Override
	protected String doExecute(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping)
			throws Exception {

		TreatmentPatientSearchForm myForm = (TreatmentPatientSearchForm) form;
		HttpSession session = request.getSession(false);
		if (session.getAttribute("id") == null) {
			return "gotologin";
		}
		if (null != request.getParameter("next"))
			myForm.setActualPage(myForm.getActualPage() + 1);

		if (null != request.getParameter("prev"))
			myForm.setActualPage(myForm.getActualPage() - 1);

		if (null != request.getParameter("search")) {
			String pname = myForm.getFrmTreatmentName();
			String demail = (String) session.getAttribute("demail");
			myPatientSearchService.firstLoadSearch(myForm, demail, pname);

			if (myForm.getFrmTreatmentPatientList() == null)

			{
				ActionErrors errors = new ActionErrors();
				errors.add("nopatienterror", new ActionMessage(
						"errors.nopatient"));
				saveErrors(request, errors);

				return "gotoPatientSearch";
			} else
				return "gotoPatientSearch";

		}
		return "gotoPatientSearch";
	}

	@Override
	protected String doInit(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping) {

		TreatmentPatientSearchForm myForm = (TreatmentPatientSearchForm) form;
		HttpSession session = request.getSession(false);
		if (session.getAttribute("id") == null) {
			return "gotologin";
		}

		if (myForm.getFrmControl().equals("2")) {
			myPatientSearchService.detailForSearch(myForm);
			return "gotoDetail";
		} else {

			return "gotoPatientSearch";
		}
	}

}

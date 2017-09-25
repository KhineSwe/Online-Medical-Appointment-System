package com.ictti.omas.presentation.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import com.ictti.omas.business.service.DoctorListService;
import com.ictti.omas.presentation.form.DoctorListForm;

public class doctorListAction extends BaseAction {

	private DoctorListService myDoctorListService;

	public DoctorListService getMyDoctorListService() {
		return myDoctorListService;
	}

	public void setMyDoctorListService(DoctorListService myDoctorListService) {
		this.myDoctorListService = myDoctorListService;
	}

	@Override
	protected String doExecute(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping)
			throws Exception {
		DoctorListForm myForm = (DoctorListForm) form;

		HttpSession session = request.getSession(false);
		if (session.getAttribute("a_id") == null) {
			return "gotologin";
		}

	
		
		if (null != request.getParameter("next"))
			myForm.setActualPage(myForm.getActualPage() + 1);

		if (null != request.getParameter("prev"))
			myForm.setActualPage(myForm.getActualPage() - 1);

		return "gotoDoctor";
	}

	@Override
	protected String doInit(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping) {

		DoctorListForm myForm = (DoctorListForm) form;

		HttpSession session = request.getSession(false);
		if (session.getAttribute("a_id") == null) {
			return "gotologin";
		}

		
		if (myForm.getFrmControl().equals("2")) {
			myDoctorListService.checkDuration(myForm,Integer.parseInt(myForm.getFrmDoctorId()));
			myDoctorListService.checkDoctorCondition(myForm,
					Integer.parseInt(myForm.getFrmDoctorId()));
			
			if(myForm.getFrmdateDuration()!=null && myForm.getFrmDoctorstatuslist() == null)
			{
				myDoctorListService.changeStatusDoctor(myForm,
						Integer.parseInt(myForm.getFrmDoctorId()));
				return "gotoStatus";

			} else {
				ActionErrors errors = new ActionErrors();
				errors.add("changedoctStatuserror", new ActionMessage("errors.changedoctstatus"));
				saveErrors(request, errors);
				return "gotoDoctor";

			}
		} else {
			
			myDoctorListService.firstLoadSearch(myForm);
			return "gotoDoctor";

		}

	}

}

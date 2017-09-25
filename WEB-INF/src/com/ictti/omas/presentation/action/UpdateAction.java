package com.ictti.omas.presentation.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.ictti.omas.business.service.HospitalService;
import com.ictti.omas.presentation.form.HospitalUpdateForm;

public class UpdateAction extends BaseAction {
	HospitalService myHospitalService;

	public HospitalService getMyHospitalService() {
		return myHospitalService;
	}

	public void setMyHospitalService(HospitalService myHospitalService) {
		this.myHospitalService = myHospitalService;
	}

	@Override
	protected String doExecute(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping)
			throws Exception {
		HttpSession session = request.getSession(false);
		if (session.getAttribute("a_id") == null) {

			return "gotologin";
		}
		HospitalUpdateForm myForm = (HospitalUpdateForm) form;
		
		if (this.isCancelled(request)) {
			return "gotoList";
		}
		if (request.getParameter("btnSaveCancel") != null) {
			myForm.setFrmControl(null);
			return "gotoUpdate";
		}
		if (request.getParameter("btnSave") != null) {
			myHospitalService.saveUpdateHospital(myForm);
			return "gotoList";
		}
		if (request.getParameter("btnUpdate") != null) {

			myForm.setFrmControl("data");
			return "gotoUpdate";
		}
		return "gotoUpdate";

	}

	@Override
	protected String doInit(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping) {
		HttpSession session = request.getSession(false);
		if (session.getAttribute("a_id") == null) {
			return "gotologin";
		}

		
	
		
		HospitalUpdateForm myForm = (HospitalUpdateForm) form;

		HospitalUpdateForm hosForm = (HospitalUpdateForm) request.getSession().getAttribute(
						"HospitalSearchFormBean");
		//myForm.setFrmHosid(hosForm.getFrmUpdateHospitalId());
		System.out.println("update form===="+myForm.getFrmUpdateHospitalId());
		System.out.println("update form===="+hosForm.getFrmUpdateHospitalId());
		if (myForm.getFrmControl().equals("3")) {
			System.out.println("here...........");
			myHospitalService.firstLoadHospital(myForm);
			return "gotoUpdate";
		} else
			return "gotoList";

	}

}

package com.ictti.omas.presentation.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.ictti.omas.business.service.AppointHospService;
import com.ictti.omas.presentation.form.AppointHospitalForm;
import com.ictti.omas.presentation.form.TreatmentSearchForm;

public class recordTreatmentAction extends BaseAction {
	private AppointHospService myAppointHospService;
	

	public AppointHospService getMyAppointHospService() {
		return myAppointHospService;
	}

	public void setMyAppointHospService(AppointHospService myAppointHospService) {
		this.myAppointHospService = myAppointHospService;
	}

	@Override
	protected String doExecute(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String doInit(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping) {
		// TODO Auto-generated method stub
		AppointHospitalForm myForm =  (AppointHospitalForm) form;
		
		HttpSession session=request.getSession(false);
		if(session.getAttribute("id")==null){
			return "gotologin";
		}
		String appId=myForm.getFrmDetailAppointId();
		if (myForm.getFrmControl().equals("2")) {
			System.out.println("appointment id is"+appId);
			 session=request.getSession(true);
			session.setAttribute("id",appId);
			
			
			return "gotoRecord";
		} else {
			return "gotohome";
		}

	}
	

}

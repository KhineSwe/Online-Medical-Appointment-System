package com.ictti.omas.presentation.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.ictti.omas.business.service.AppointHospService;
import com.ictti.omas.presentation.form.AppointHospitalForm;

public class AppointHospitalAction extends BaseAction {
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
		AppointHospitalForm myForm = (AppointHospitalForm) form;

		HttpSession session = request.getSession(false);
		if (session.getAttribute("id") == null) {
			return "gotologin";
		}

		if (null != request.getParameter("next"))
			myForm.setActualPage(myForm.getActualPage() + 1);

		if (null != request.getParameter("prev"))
			myForm.setActualPage(myForm.getActualPage() - 1);

		return "gotoAppHosp";
	}

	@Override
	protected String doInit(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping) {
		// TODO Auto-generated method stub

		AppointHospitalForm myForm = (AppointHospitalForm) form;

		HttpSession session = request.getSession(false);

		// String id;
		if (session.getAttribute("id") == null) {
			return "gotologin";
		}
		String demail = (String) session.getAttribute("demail");
		System.out.println(demail + myForm.getFrmControl());

		System.out.println(myForm.getFrmControl());
		String hosname = myForm.getFrmDetailHospitalId();

		if (myForm.getFrmControl().equals("2")) {

			myAppointHospService.detailForSearch(myForm, hosname);

			return "gotoDetail";
		} else {

			myAppointHospService.firstLoadSearch(myForm, demail);

					{
				if (myForm.getFrmHospitalList() == null) {
					System.out.println("no list");
					return "gotoNolist";
				} else
					
					return "gotoAppHosp";
			}
		}

		
	}

}

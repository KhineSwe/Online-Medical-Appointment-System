package com.ictti.omas.presentation.action;

import java.text.ParseException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import com.ictti.omas.business.service.SearchAppointmentlistService;
import com.ictti.omas.presentation.form.AppointmentlistForm;

public class SearchAppointmentlistAction extends BaseAction {

	private SearchAppointmentlistService myappointmentlistService;

	public SearchAppointmentlistService getMyappointmentlistService() {
		return myappointmentlistService;
	}

	public void setMyappointmentlistService(
			SearchAppointmentlistService myappointmentlistService) {
		this.myappointmentlistService = myappointmentlistService;
	}

	protected String doExecute(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping)
			throws Exception {
		AppointmentlistForm myForm = (AppointmentlistForm) form;

		HttpSession session = request.getSession(false);
		if (session.getAttribute("a_id") == null) {
			return "gotoAdminlogin";
		}
		
		 if (null != request.getParameter("next1"))
			  myForm.setActualPage(myForm.getActualPage() + 1);
			  
			 if (null != request.getParameter("prev1"))
			  myForm.setActualPage(myForm.getActualPage() - 1);

		return "gotoDetail";
	}

	@Override
	protected String doInit(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping) {
		// TODO Auto-generated method stub

		AppointmentlistForm myForm = (AppointmentlistForm) form;

		HttpSession session = request.getSession(false);
		

		// String id;
		if (session.getAttribute("a_id") == null) {
			return "gotoAdminlogin";
		}
		
	/*	int hosid = Integer.parseInt(myForm.getFrmHospitalID());
		int did = Integer.parseInt(myForm.getFrmDoctorID());
		
		if(myForm.getFrmControl().equals("3")){
			myappointmentlistService.firstLoadSearchAppointmentlist(
					myForm, hosid, did);
			return "gotoSearch";
			
		}*/

		if (myForm.getFrmControl().equals("2")) {

			String hosname = myForm.getFrmHospitalName();
			String dname = myForm.getFrmDoctorName();

			try {

				myappointmentlistService.detailForAppointSearch(myForm,
						hosname, dname);

				
				 

				if (null == myForm.getFrmAppointListAll()) {
					System.out.println("NO List");

				} else {

					System.out.println("HEREREER");

					 
					return "gotoDetail";
				}

			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	

		return "gotoSearch";

	}
}

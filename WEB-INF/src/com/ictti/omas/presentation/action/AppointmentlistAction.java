package com.ictti.omas.presentation.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import com.ictti.omas.business.service.AppointmentlistService;
import com.ictti.omas.presentation.form.AppointmentlistForm;


public class AppointmentlistAction extends BaseAction {

private AppointmentlistService myappointmentlistService;

	public AppointmentlistService getMyappointmentlistService() {
	return myappointmentlistService;
}

public void setMyappointmentlistService(
		AppointmentlistService myappointmentlistService) {
	this.myappointmentlistService = myappointmentlistService;
}

	protected String doExecute(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping)
			throws Exception {
		AppointmentlistForm myForm =  (AppointmentlistForm) form;

		HttpSession session = request.getSession(false);
		if (session.getAttribute("a_id") == null) {
			return "gotoAdminlogin";
		}

		
		

		/*
		 * AppointmentlistForm appForm=(AppointmentlistForm)
		 * request.getSession().getAttribute( "AppointmentListFormBean");
		 * myForm.setFrmHospitalID(appForm.getFrmHospitalID()); int
		 * hosid=Integer.parseInt(myForm.getFrmHospitalID());
		 * System.out.println(hosid+"this is hospital id");
		 * 
		 * myForm.setFrmDoctorID(appForm.getFrmDoctorID()); int
		 * did=Integer.parseInt(myForm.getFrmDoctorID());
		 */
		ActionErrors errors = new ActionErrors();

		if (null != request.getParameter("search")) {

			System.out.println("hiiiiiiiiiiiii");
			System.out.println(Integer.parseInt(myForm.getFrmHospitalID())
					+ "this is hospital id");
			System.out.println(Integer.parseInt(myForm.getFrmDoctorID())
					+ "this is doctor id");
			int hosid = Integer.parseInt(myForm.getFrmHospitalID());
			int did = Integer.parseInt(myForm.getFrmDoctorID());
			System.out.println("this is hospital id" + hosid);

			if (myForm.getFrmHospitalID().equals("0")
					&& myForm.getFrmDoctorID().equals("0")) {
				System.out.println("ZERO");

				errors.add("ChooseHospitaNDoctor", new ActionMessage(
						"errors.ChooseHospitalNDoctor"));
				saveErrors(request, errors);

				myappointmentlistService.firstLoadAppointmentlist(myForm);
				return "gotoMain";

			}

			if (myForm.getFrmHospitalID().equals("0")
					|| myForm.getFrmDoctorID().equals("0")) {
				System.out.println("ZERO");

				errors.add("ChooseHospitaNDoctor", new ActionMessage(
						"errors.ChooseHospitalNDoctor"));
				saveErrors(request, errors);

				myappointmentlistService.firstLoadAppointmentlist(myForm);
				return "gotoMain";

			}

			myappointmentlistService.CheckHospitalAndDoctor(myForm, hosid, did);
			{
				if (myForm.getFrmHNDList() == null) {

					errors.add("HospitalNDoctorError", new ActionMessage(
							"errors.HospitalNDoctor"));
					saveErrors(request, errors);

					// myForm.setFrmAppointListAll(myForm.getFrmAppointListAll());
					myappointmentlistService.firstLoadSearchAppointmentlist(
							myForm, hosid, did);
					return "gotoSearch";

				}

				else {
                    
				
					
					myappointmentlistService.firstLoadSearchAppointmentlist(
							myForm, hosid, did);

					if (myForm.getFrmSearchAppointmentlist() == null) {
						return "gotoNoList";
					} else {
						
						return "gotoSearch";

					}

				}
			}

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
		// TODO Auto-generated method stub
		


		AppointmentlistForm myForm =  (AppointmentlistForm) form;

		HttpSession session = request.getSession(false);

		// String id;
		if (session.getAttribute("a_id") == null) {
			return "gotoAdminlogin";
		}
		
		
		
	
	
		
		//String appId=myForm.getFrmDetailAppointId();
		
		/*if (myForm.getFrmControl().equals("2")) {
			
			myAppointHospService.detailForAppointSearch(myForm,appId);
			return "gotoDetail";
		} else {*/

		myappointmentlistService.firstLoadAppointmentlist(myForm);
			
		
				/*if (myForm.getFrmHosList() != null) {
					System.out.println("no list");
					return "gotoNolist";
				} 
*/				if(myForm.getFrmAppointList() !=null){
	
					return "gotoSearch";
					}
				
			
			return "gotoSearch";
				
	
	}
		

}


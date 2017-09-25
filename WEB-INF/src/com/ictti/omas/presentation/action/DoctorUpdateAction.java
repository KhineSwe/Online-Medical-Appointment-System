package com.ictti.omas.presentation.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import com.ictti.omas.business.service.DoctorService;
import com.ictti.omas.presentation.form.DoctorForm;

public class DoctorUpdateAction extends BaseAction {
	private DoctorService myDoctorService;

	public DoctorService getMyDoctorService() {
		return myDoctorService;
	}

	public void setMyDoctorService(DoctorService myDoctorService) {
		this.myDoctorService = myDoctorService;
	}

	@Override
	protected String doExecute(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping)
			throws Exception {
		HttpSession session=request.getSession(false);
		if(session.getAttribute("id")==null){
			return "gotologin";
		}
		
		
		DoctorForm myForm=(DoctorForm) form;
		if (this.isCancelled(request)){
			return "gotoDochome";
		}
		if(request.getParameter("btnSaveCancel")!=null){
			myForm.setFrmRegFormControl(null);
			return "gotoUpdate";
		}
		if (request.getParameter("btnUpdate") != null) {
			if (!myForm.getFrmRegPassword().equals(
					myForm.getFrmRegConfPassword())) {
				ActionErrors errors=new ActionErrors();
				errors.add("passwordError", new ActionMessage(
						"errors.matchPassword"));
				saveErrors(request, errors);
			} else
				myForm.setFrmRegFormControl("data");
			return "gotoUpdate";
		}
		if (request.getParameter("btnSave") != null) {
			myDoctorService.saveUpdateDoctor(myForm);
			return "gotoDochome";
		}
		return null;

	}

	@Override
	protected String doInit(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping) {

		
		HttpSession session=request.getSession(false);
		if(session.getAttribute("id")==null){
			return "gotologin";
		}
		
		
		DoctorForm myForm=(DoctorForm) form;
		
		request.getSession(true);
		System.out.println("aaaa");
		
		
		DoctorForm loginForm=(DoctorForm)request.getSession()
				.getAttribute("doctorFormBean");
				myForm.setLoginDoctor(loginForm.getLoginDoctor());
				myDoctorService.fristLoadUpdateProfile(myForm);
				request.getSession().setAttribute("dname",loginForm.getLoginDoctor().getDname());
				
				return "gotoUpdate";
				
				
	}
	
}

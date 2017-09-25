package com.ictti.omas.presentation.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import com.ictti.omas.business.service.NameAutoComplementService;
import com.ictti.omas.presentation.form.NameAutoComplementForm;

public class StatusChangeAction extends BaseAction {
private NameAutoComplementService myNameAutoComplementService;
	public NameAutoComplementService getMyNameAutoComplementService() {
	return myNameAutoComplementService;
}

public void setMyNameAutoComplementService(
		NameAutoComplementService myNameAutoComplementService) {
	this.myNameAutoComplementService = myNameAutoComplementService;
}

	@Override
	protected String doExecute(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping)
			throws Exception {
		NameAutoComplementForm myForm=(NameAutoComplementForm)form;
		HttpSession session = request.getSession(false);
		if (session.getAttribute("a_id") == null) {
			return "gotoAdminlogin";
		}
		
		myNameAutoComplementService.firstLoadSearch(myForm);
	
		if (request.getParameter("next") != null)
			myForm.setActualPage(myForm.getActualPage() + 1);
		
		if (request.getParameter("prev") != null)
			myForm.setActualPage(myForm.getActualPage() - 1);
		
		return "gotoAuto";
		
	}

	@Override
	protected String doInit(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping) {
		
		NameAutoComplementForm myForm=(NameAutoComplementForm)form;
		HttpSession session = request.getSession(false);
		if (session.getAttribute("a_id") == null) {
			return "gotoAdminlogin";
		}
		
		if(myForm.getFrmControl().equals("3")){
			int pid=Integer.parseInt(myForm.getFrmDetailStatusId());
			System.out.println("pid is"+pid);
			
			myNameAutoComplementService.checkDuration(myForm,pid);
			myNameAutoComplementService.checkAppointment(myForm,pid);
						
			if(myForm.getFrmDuration()!=null && myForm.getFrmPatientAppointlist()==null)
			{			
			myNameAutoComplementService.ChangeStatus(myForm,pid);
			myNameAutoComplementService.firstLoadSearch(myForm);
			
			return "gotoAuto";
			}
			else{
					ActionErrors errors = new ActionErrors();
					errors.add("changeStatuserror", new ActionMessage("errors.changestatus"));
					saveErrors(request, errors);
					return "gotoAuto";
			
			}
			
		}
		return "gotoAuto";
		
	}
	
}
	
	
	
	
	
	

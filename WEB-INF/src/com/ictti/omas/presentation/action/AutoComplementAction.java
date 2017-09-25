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

public class AutoComplementAction extends BaseAction {
private NameAutoComplementService myNameAutoComplementService;
	

	
	



	public NameAutoComplementService getMyNameAutoComplementService() {
	return myNameAutoComplementService;
}



public void setMyNameAutoComplementService(
		NameAutoComplementService myNameAutoComplementService) {
	this.myNameAutoComplementService = myNameAutoComplementService;
}



	protected String doExecute(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping)
			throws Exception {
		
		NameAutoComplementForm myForm=(NameAutoComplementForm)form;
		HttpSession session = request.getSession(false);
		if (session.getAttribute("a_id") == null) {
			return "gotoAdminlogin";
		}
		

		/*myAutoComplementService.firstLoadSearch(myForm);*/
		
		if (null != request.getParameter("next"))
			myForm.setActualPage(myForm.getActualPage() + 1);
		// if prev button, doPrev
		if (null != request.getParameter("prev"))
			myForm.setActualPage(myForm.getActualPage() - 1);
		
		return "gotoAuto";
		
		
			}		
			
	
	
	protected String doInit(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping) {
		NameAutoComplementForm myForm=(NameAutoComplementForm)form;
		HttpSession session = request.getSession(false);
		if (session.getAttribute("a_id") == null) {
			return "gotoAdminlogin";
		}
		if (myForm.getFrmControl().equals("2")) {
			myNameAutoComplementService.detailForSearch(myForm);
			return "gotoDetail";
		} else {
			
			myNameAutoComplementService.firstLoadSearch(myForm);
			
			if(myForm.getFrmPatientList()==null)
				{ActionErrors errors = new ActionErrors();
			errors.add("noPatienterror", new ActionMessage("errors.noPatient"));
			saveErrors(request, errors);
			
			return "gotoAuto";
				}
			
		}
		return "gotoAuto";
		
	}

}

package com.ictti.omas.presentation.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import com.ictti.omas.business.service.AddSpecializeService;
import com.ictti.omas.presentation.form.AddspForm;

public class AdminAddSpecializeAction extends BaseAction {
	private AddSpecializeService myAddspService;
	

	public AddSpecializeService getMyAddspService() {
		return myAddspService;
	}


	public void setMyAddspService(AddSpecializeService myAddspService) {
		this.myAddspService = myAddspService;
	}


	@Override
	protected String doExecute(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping)
			throws Exception {
		HttpSession session = request.getSession(false);
		if (session.getAttribute("a_id") == null) {
			return "gotoAdminlogin";
		}
		if (this.isCancelled(request)) {
			return "gotoAdminHome";}


		
		AddspForm myForm=(AddspForm) form;
		
		ActionErrors errors = new ActionErrors();
		if (request.getParameter("add") != null) {
			if (myForm.getFrmSpectype().length()==0) {
						
				errors.add("NullAddSpecialize", new ActionMessage(
						"errors.nullAddSpecialize"));
				saveErrors(request, errors);
				return "gotoAddNewSpe";
			} else

			{
				
				myAddspService.checkSpecialize(myForm);
				if(myForm.getFrmSpecialize()!=null)
				{
					errors.add("SpecializeExist",new ActionMessage("errors.specializeExist"));
					saveErrors(request,errors);
					return "gotoAddNewSpe";
				}
				
				return "gotoSpeSuccess";
			}
		
		
		}
		
		
		if(request.getParameter("btnConfirm")!=null){
			myAddspService.saveSpecialize(myForm);
			myForm.setFrmSpectype("");
			return "gotoAddNewSpe";
		}
		if(request.getParameter("btnConfirmCancel")!=null){
			return "gotoAddNewSpe";
		}
		return "gotoAdminSpe";
	}

}

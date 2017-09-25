package com.ictti.omas.presentation.action;

import java.util.LinkedList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.util.LabelValueBean;

import com.ictti.omas.business.entity.Hospital;
import com.ictti.omas.business.service.AddSpecializeService;
import com.ictti.omas.presentation.form.AddspForm;

public class AddSpecializeAction extends BaseAction {

	public List<Hospital> hlist;
	private AddSpecializeService myAddspService;

	public List<Hospital> getHlist() {
		return hlist;
	}

	public void setHlist(List<Hospital> hlist) {
		this.hlist = hlist;
	}

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

		AddspForm myForm = (AddspForm) form;

		

		/*if (request.getParameter("addbtn") != null) {

			return "gotoAddNewSpe";
		}*/

		/*
		 * if (request.getParameter("add") != null) {
		 * 
		 * if (myForm.getFrmSpectype() == null) {
		 * 
		 * ActionErrors errors = new ActionErrors();
		 * errors.add("NullAddSpecialize", new ActionMessage(
		 * "errors.nullSpecialize")); saveErrors(request, errors); return
		 * "gotoAddNewSpe"; } else
		 * 
		 * {
		 * 
		 * myAddspService.saveSpecialize(myForm); myForm.setFrmSpectype("");
		 * 
		 * return "gotoAdminSpe"; } } if (request.getParameter("btnCancel") !=
		 * null) {
		 * 
		 * return "gotoAdminSpe"; }
		 */

		if (request.getParameter("sphosbtn") != null) {

			return "gotoConfirm";
		}

		return "gotoAdminSpe";
	}

	protected String doInit(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping) {

		HttpSession session = request.getSession(false);
		if (session.getAttribute("a_id") == null) {
			return "gotoAdminlogin";
		}
		

		AddspForm myForm = (AddspForm) form;
		if(myForm.getFrmControl().equals("2")){
			
			
			return "gotoAddNewSpe";
		}
		else if((myForm.getFrmControl().equals("1")))
				{
		
		
		List hospitallist = new LinkedList();

		List<Hospital> hlist = myAddspService.getAllHospital();
		for (int i = 0; i < hlist.size(); i++) {
			hospitallist.add(new LabelValueBean(hlist.get(i).getHosname(),
					String.valueOf(hlist.get(i).getId())));
		}
		myForm.setHospitalChoice(hospitallist);

		myForm.getHospitalChoice();

		//myForm.setFrmSpeclist(null);
		myAddspService.SpecializeSearch(myForm);
		return "gotoAdminSpe";

	
	}
		return "gotoAdminSpe";
		
	}

}

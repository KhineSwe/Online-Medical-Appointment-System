package com.ictti.omas.presentation.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

public class doctorfaqAction extends BaseAction {

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
		
		HttpSession session=request.getSession(false);
		if(session.getAttribute("id")!=null){
			System.out.println("ddddddddddd");
			return "gotoDoctorFaqHome";
		}
		else
		{
			System.out.println("%%%%%%%%%%");
		return "gotoDoctorFaq";
		}
		
		
		
	}
}

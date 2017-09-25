package com.ictti.omas.presentation.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import com.ictti.omas.business.entity.HosSpec;
import com.ictti.omas.business.service.AddSpecializeService;
import com.ictti.omas.presentation.form.AddspForm;

public class AddSpecializetoHosAction extends BaseAction {

	private AddSpecializeService myAddspService;

	public AddSpecializeService getMyAddspService() {
		return myAddspService;
	}

	public void setMyAddspService(AddSpecializeService myAddspService) {
		this.myAddspService = myAddspService;
	}

	protected String doExecute(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping)
			throws Exception {
		HttpSession session = request.getSession(false);
		if (session.getAttribute("a_id") == null) {
			return "gotoAdminlogin";
		}
		AddspForm myForm = (AddspForm) form;
		System.out.println("Hospital" + myForm.getFrmHosId());
		myAddspService.getHosname(myForm);

		if (Integer.parseInt(myForm.getFrmHosId()) == 0) {
			ActionErrors errors = new ActionErrors();
			errors.add("NullHos", new ActionMessage("errors.nullHos"));
			saveErrors(request, errors);
			return "gotoAdminSpe";
		}

		if (myForm.getFrmSpeCheckedlist() == null) {

			ActionErrors errors = new ActionErrors();
			errors.add("NullSpecialize", new ActionMessage(
					"errors.nullSpecialize"));
			saveErrors(request, errors);
			return "gotoAdminSpe";

		}

		// check duplicate specialize
		int hid = Integer.parseInt(myForm.getFrmHosId());
		for (int i = 0; i < myForm.getFrmSpeCheckedlist().length; i++) {
			int spid = Integer.parseInt(myForm.getFrmSpeCheckedlist()[i]);
			HosSpec hs = myAddspService.checkDuplicateSpecialize(spid, hid);
			if (hs != null) {
				// HosSpec hsp=myAddspService.getSpeType(spid);
				// System.out.println("HS*******"+hs.getSpecializetype());

				myForm.setFrmSpError(hs.getSpecializetype()
						+ " is already exist in " + hs.getHosid().getHosname());
				// ActionErrors errors=new ActionErrors();

				/*
				 * errors.add("DupSpecialize",new
				 * ActionMessage("errors.DupSpecialize")); saveErrors(request,
				 * errors);
				 */
				return "gotoAdminSpe";

			} else
				return "gotoConfirm";
		}

		// check duplicate specialize

		/*
		 * System.out.println(myForm.getFrmSpeCheckedlist()); for(int
		 * i=0;i<myForm.getFrmSpeCheckedlist().length;i++){
		 * System.out.println("specialize list is "
		 * +myForm.getFrmSpeCheckedlist()[i]);
		 * System.out.println("Here's the result...."+
		 * myForm.getFrmSpeCheckedlist());
		 * 
		 * } System.out.println("hosid"+myForm.getFrmHosId());
		 * myAddspService.saveSpecializeToHospital
		 * (myForm,Integer.parseInt(myForm.getFrmHosId()));
		 */

		return "gotoConfirm";
	}

}

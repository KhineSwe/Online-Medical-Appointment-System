package com.ictti.frame.presentation.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import com.ictti.frame.business.service.StudentService;
import com.ictti.frame.presentation.form.StudentForm;

public class UpdateAction extends BaseAction {
	private StudentService myStudentService;

	public StudentService getMyStudentService() {
		return myStudentService;
	}

	public void setMyStudentService(StudentService myStudentService) {
		this.myStudentService = myStudentService;
	}

	@Override
	protected String doExecute(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping)
			throws Exception {
		StudentForm myForm = (StudentForm) form;

		if (request.getParameter("btnUpdateCancel") != null) {
			return "gotoHome";
		}
		if (request.getParameter("btnSaveCancel") != null) {
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
			myStudentService.saveUpdateStudent(myForm);
			return "gotoHome";
		}
		return null;
	}

	@Override
	protected String doInit(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping) {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession(false);
		if(session.getAttribute("id") == null) {
		return "gotoLogin";
		
		}
		StudentForm myForm=(StudentForm) form;
		
		StudentForm loginForm=(StudentForm)request.getSession()
		.getAttribute("studentFormBean");
		myForm.setLoginStudent(loginForm.getLoginStudent());
		myStudentService.fristLoadUpdateProfile(myForm);
		
		return "gotoUpdate";
	}
}

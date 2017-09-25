package com.ictti.frame.presentation.action;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import com.ictti.frame.business.service.StudentService;
import com.ictti.frame.presentation.form.StudentForm;

public class RegistrationAction extends BaseAction {
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
		/*if (request.getParameter("btnRegisterCancel") != null) {
			return "gotoLogin";
		}*/
		
		if(this.isCancelled(request)){
        	return "gotoLogin";
        }
		
		if (request.getParameter("btnSaveCancel") != null) {
			myForm.setFrmRegFormControl(null);
			return "gotoRegister";
		}

		if (request.getParameter("btnRegister") != null) {
			int flag = 0;
			ActionErrors errors = new ActionErrors();
			if (myForm.getFrmRegCourseId().equals("0")) {
				errors.add("courseError", new ActionMessage("errors.course"));
				saveErrors(request, errors);
				flag = 1;
			}
			if (!myForm.getFrmRegPassword().equals(
					myForm.getFrmRegConfPassword())) {
				errors.add("passwordError", new ActionMessage(
						"errors.matchPassword"));
				saveErrors(request, errors);
				flag = 1;
			}
			if (flag == 0) {
				myStudentService.checkAccountName(myForm);
				if (myForm.getFrmRegAccountNameError() == null) {
					errors.add("accountError", new ActionMessage(
							"errors.account"));
					saveErrors(request, errors);
				}
			}
			return "gotoRegister";
		}
		if (request.getParameter("btnSave") != null) {
			myStudentService.saveNewStudent(myForm);
			return "gotoLogin";
		}
        
		return "gotoRegister";

	}

	@Override
	protected String doInit(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping) {
		StudentForm myForm = (StudentForm) form;
		myStudentService.firstLoadRegistration(myForm);
		return "gotoRegister";
	}

}

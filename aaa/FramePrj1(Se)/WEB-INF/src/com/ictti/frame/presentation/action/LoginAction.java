package com.ictti.frame.presentation.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import com.ictti.frame.business.service.StudentService;
import com.ictti.frame.presentation.form.StudentForm;

public class LoginAction extends BaseAction {

	private StudentService myStudentService;
	
	public StudentService getMyStudentService() {
		return myStudentService;
	}

	public void setMyStudentService(StudentService myStudentService) {
		this.myStudentService = myStudentService;
	}

	protected String doExecute(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping)
			throws Exception {
		
		StudentForm myForm=(StudentForm)form;
		myStudentService.checkLoginStudent(myForm);
		ActionErrors errors=new ActionErrors();
		if(myForm.getLoginStudent()==null){
			errors.add("loginerror",new ActionMessage("errors.login"));
			saveErrors(request,errors);
			return "gotologin";
		}
		else{
			request.getSession(true);
			request.getSession().setAttribute("id",request.getSession().getId());
			return "gotohome";
		}
	}

}

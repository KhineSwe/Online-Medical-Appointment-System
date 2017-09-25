package com.ictti.omas.presentation.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import com.ictti.omas.business.entity.Schedule;
import com.ictti.omas.business.service.ScheduleService;
import com.ictti.omas.presentation.form.AutoComplementForm;
import com.ictti.omas.presentation.form.ScheduleForm;

public class RatingAction extends BaseAction {

	
private ScheduleService myScheduleService;




	public ScheduleService getMyScheduleService() {
	return myScheduleService;
}




public void setMyScheduleService(ScheduleService myScheduleService) {
	this.myScheduleService = myScheduleService;
}




	@Override
	protected String doExecute(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping)
			throws Exception {
		
		ScheduleForm myForm=(ScheduleForm) form;
		
		
		if ( myForm.getRating().isEmpty()) { 
			
			System.out.print("No rating value");
			
			ActionErrors errors=new ActionErrors();
			errors.add("noRatingerror",new ActionMessage("errors.noRating"));
			saveErrors(request, errors);
			
			
			return "gotoScheduleError";
		}
		else{
		int pid=myForm.getLoginPatient().getId();
        int did=myForm.getFrmDocname().getId();

		System.out.println("pid is "+pid+"did is "+did);
		myScheduleService.insertRate(myForm,pid,did);
		
		myForm.setFrmFlag("0");
		
		List<Schedule> l = myScheduleService.getScheduleByDid(did);
		myForm.setFrmScheduleList(l);
		myForm.setActualPage(1);
		myForm.setIMaxData(l.size());
		myForm.setIMaxShow(7);

		AutoComplementForm autoForm = (AutoComplementForm) request.getSession()
				.getAttribute("AutoFormBean");
		myForm.setFrmHosname(autoForm.getFrmhosname());
		myForm.setFrmSpecname(autoForm.getFrmspecname());
	
		myScheduleService.getDocname(myForm);
		
		HttpSession session = request.getSession(false);
		ScheduleForm myForm1 = (ScheduleForm) form;
		
		String uratevalue = myForm1.getRating();
		String udescription = myForm1.getDescription();
		
		session.setAttribute("Urate", uratevalue);
		session.setAttribute("Udescription", udescription);

		return "gotoSchedule";}
	}
	
	

}

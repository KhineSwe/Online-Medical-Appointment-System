package com.ictti.omas.presentation.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.ictti.omas.business.entity.Schedule;
import com.ictti.omas.business.service.ScheduleService;
import com.ictti.omas.presentation.form.AutoComplementForm;
import com.ictti.omas.presentation.form.PatientForm;
import com.ictti.omas.presentation.form.ScheduleForm;

public class ScheduleAction extends BaseAction {
	private ScheduleService myScheduleService;

	public ScheduleService getMyScheduleService() {
		return myScheduleService;
	}

	public void setMyScheduleService(ScheduleService myScheduleService) {
		this.myScheduleService = myScheduleService;
	}

	protected String doExecute(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping)
			throws Exception {

		HttpSession session = request.getSession(false);
		if (session.getAttribute("p_id") == null) {
			return "gotoLogin";
		}

		ScheduleForm myForm = (ScheduleForm) form;

		PatientForm schForm = (PatientForm) request.getSession().getAttribute(
				"PatientFormBean");
		myForm.setLoginPatient(schForm.getLoginPatient());
		
		AutoComplementForm autoForm = (AutoComplementForm) request.getSession()
				.getAttribute("AutoFormBean");
		
		myForm.setFrmHospitalId(autoForm.getFrmHosId());
		
		int hosid=Integer.parseInt(myForm.getFrmHospitalId());
		int did=Integer.parseInt(myForm.getFrmSpecId());
		
		int pid=myForm.getLoginPatient().getId();
		System.out.println("pid is "+pid+"did is "+did);
		myScheduleService.checkAppointment(myForm,pid,did);
		
		
		myScheduleService.getRateValue(myForm,pid,did);

		if(myForm.getMyratingValue()!=null){
			System.out.println(myForm.getMyratingValue().getRateValue());
		}

		List<Schedule> l = myScheduleService.getScheduleByDid(hosid,did);
		myForm.setFrmScheduleList(l);
		myForm.setActualPage(1);
		myForm.setIMaxData(l.size());
		myForm.setIMaxShow(7);

		
		myForm.setFrmHosname(autoForm.getFrmhosname());
		myForm.setFrmSpecname(autoForm.getFrmspecname());

	
		myScheduleService.getDocname(myForm);

		return "gotoSchedule";	
		

	}

}

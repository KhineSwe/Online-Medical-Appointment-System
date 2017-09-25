package com.ictti.omas.presentation.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import com.ictti.omas.business.entity.Treatment;
import com.ictti.omas.business.service.AppointHospService;
import com.ictti.omas.presentation.form.AppointHospitalForm;
import com.ictti.omas.presentation.form.RecordTreatmentForm;

public class recordTreatmentPathAction extends BaseAction {

	private AppointHospService myAppointHospService;
	
	

	public AppointHospService getMyAppointHospService() {
		return myAppointHospService;
	}



	public void setMyAppointHospService(AppointHospService myAppointHospService) {
		this.myAppointHospService = myAppointHospService;
	}



	@Override
	protected String doExecute(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping)
			throws Exception {
		// TODO Auto-generated method stub
		
		AppointHospitalForm myForm=(AppointHospitalForm) form;
		HttpSession session=request.getSession(false);
		if(session.getAttribute("id")==null){
			return "gotologin";
		}
		
		if(this.isCancelled(request)){
        	return "gotoAppList";
        }
		
		if (request.getParameter("btnSaveCancel") != null) {
			myForm.setFrmrecordFormControl(null);
			return "gotoRecord";
		}
		
		if(request.getParameter("btnRecord")!=null){
			if(myForm.getFrmDisease().length()==0){
				
				ActionErrors errors=new ActionErrors();
				errors.add("nodiseaseerror",new ActionMessage("errors.nodisease"));
				saveErrors(request, errors);
				return "gotoRecord";
			}
			
			if(myForm.getFrmTreatment().length()==0){
				ActionErrors errors=new ActionErrors();
				errors.add("notreatmenterror",new ActionMessage("errors.notreatment"));
				saveErrors(request, errors);
				return "gotoRecord";
			}
			else{
			myForm.setFrmrecordFormControl("data");
			return "gotoRecord";}
		}
		if(request.getParameter("btnSave")!=null){
			
			
			
			
			String appId=myForm.getFrmDetailAppointId();
		
			myAppointHospService.getAppointById(myForm,appId);
			myAppointHospService.saveAppointStatus(myForm);
			int apid=Integer.parseInt(appId);
    		myAppointHospService.saveTreatment(myForm,apid);
    		
    		myForm.setFrmDenote("");
			myForm.setFrmTreatment("");
			myForm.setFrmDisease("");
			
    		String hosname=myForm.getFrmDetailHospitalId();
    		String demail = (String) session.getAttribute("demail");
    		myAppointHospService.firstLoadAppointSearch(myForm, hosname,demail);
    			
    			
    				if (myForm.getFrmAppointList() == null) {
    					System.out.println("no list");
    					ActionErrors errors=new ActionErrors();
    					errors.add("noApplistError",new ActionMessage("errors.noApplist"));
    					saveErrors(request, errors);
    					return "gotoAppList";
    				} else
    				{
    					
    					myForm.setFrmDenote("");
    					myForm.setFrmTreatment("");
    					myForm.setFrmDisease("");
    					myForm.setFrmrecordFormControl(null);
    					return "gotoAppList";
    			
    				}
    		
    		
    		/*session=request.getSession(false);
			session.removeAttribute("RecordTreatmentFormBean");*/
			
			}//return "gotoDochome";
		
		return "gotoDetail";
	}

}

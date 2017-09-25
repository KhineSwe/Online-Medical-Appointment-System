package com.ictti.omas.presentation.action;

import java.util.LinkedList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.util.LabelValueBean;

import com.ictti.omas.business.entity.Doctor;
import com.ictti.omas.business.entity.Doctordegree;
import com.ictti.omas.business.entity.Hospital;
import com.ictti.omas.business.service.AutoComplementService;
import com.ictti.omas.presentation.form.AutoComplementForm;

public class hospitalAction extends BaseAction {
	public List<Hospital> hlist;
	private AutoComplementService myHospitalService;
	private AutoComplementService myDoctorService;

	private AutoComplementService myDoctorDegreeService;

	public AutoComplementService getMyDoctorDegreeService() {
		return myDoctorDegreeService;
	}

	public void setMyDoctorDegreeService(
			AutoComplementService myDoctorDegreeService) {
		this.myDoctorDegreeService = myDoctorDegreeService;
	}

	public AutoComplementService getMyDoctorService() {
		return myDoctorService;
	}

	public void setMyDoctorService(AutoComplementService myDoctorService) {
		this.myDoctorService = myDoctorService;
	}

	public List<Hospital> getHlist() {
		return hlist;
	}

	public void setHlist(List<Hospital> hlist) {
		this.hlist = hlist;
	}

	public AutoComplementService getMyHospitalService() {
		return myHospitalService;
	}

	public void setMyHospitalService(AutoComplementService myHospitalService) {
		this.myHospitalService = myHospitalService;
	}

	protected String doExecute(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping)
			throws Exception {
		HttpSession session = request.getSession(false);

		/*if (session.getAttribute("p_id") == null) {
			return "gotoLogin";

		}*/
		if (request.getParameter("btnSearch") != null) {
			AutoComplementForm myForm = (AutoComplementForm) form;
		
			int specid = Integer.parseInt(myForm.getFrmSpecId());
			myDoctorService.getspid(myForm,specid);
			
			String spid=myForm.getFrmspid();

			List<Doctor> l = myDoctorService.getDoctorById(spid);
			myForm.setFrmDocList(l);

			/*List<Doctordegree> list = myDoctorService
					.getDegreeByDoctorId(spid);
			myForm.setFrmDegreeList(list);*/

			

			myHospitalService.getHosname(myForm);
			myHospitalService.getSpectype(myForm);

			return "gotoDoctor";

		}
		return "gotoAuto";


	}
	protected String doInit(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping) {
		HttpSession session = request.getSession(false);
		System.out.println("PID is..." + session.getAttribute("p_id"));
		/*if (session.getAttribute("p_id") == null) {
			return "gotoLogin";

		}*/

		AutoComplementForm myform = (AutoComplementForm) form;
		List hospitallist = new LinkedList();

		List<Hospital> hlist = myHospitalService.getAllHospital();
		for (int i = 0; i < hlist.size(); i++) {
			hospitallist.add(new LabelValueBean(hlist.get(i).getHosname(),
					String.valueOf(hlist.get(i).getId())));
		}
		myform.setHospitalChoice(hospitallist);

		myform.getHospitalChoice();

		return "gotoAuto";

	}

}

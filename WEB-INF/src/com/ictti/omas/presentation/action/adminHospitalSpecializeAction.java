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

import com.ictti.omas.business.entity.Doctor;
import com.ictti.omas.business.entity.Doctordegree;
import com.ictti.omas.business.entity.Hospital;
import com.ictti.omas.business.service.AutoComplementService;
import com.ictti.omas.presentation.form.AutoComplementForm;

public class adminHospitalSpecializeAction extends BaseAction {
	public List<Hospital> hlist;
	private AutoComplementService myHospitalService;
	private AutoComplementService myDoctorService;

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

	@Override
	protected String doExecute(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping)
			throws Exception {
		HttpSession session = request.getSession(false);
		if (session.getAttribute("a_id") == null) {
			return "gotoAdminlogin";
		}
		AutoComplementForm myForm = (AutoComplementForm) form;

		if (request.getParameter("btnSearch") != null) {

			ActionErrors errors = new ActionErrors();
			if (myForm.getFrmHosId().equals("0")
					&& myForm.getFrmSpecId().equals("0")) {
				List hospitallist = new LinkedList();
				List<Hospital> hlist = myHospitalService.getAllHospital();

				System.out.println("Hospital is" + hlist.size());
				for (int i = 0; i < hlist.size(); i++) {
					hospitallist
							.add(new LabelValueBean(hlist.get(i).getHosname(),
									String.valueOf(hlist.get(i).getId())));
				}
				myForm.setHospitalChoice1(hospitallist);

				errors.add("ChooseHospitalDoctor", new ActionMessage(
						"errors.ChooseHospitalDoctor"));
				saveErrors(request, errors);

				return "gotoAuto";
			}

			if (myForm.getFrmHosId().equals("0")
					|| myForm.getFrmSpecId().equals("0")) {
				List hospitallist = new LinkedList();
				List<Hospital> hlist = myHospitalService.getAllHospital();

				System.out.println("Hospital is" + hlist.size());
				for (int i = 0; i < hlist.size(); i++) {
					hospitallist
							.add(new LabelValueBean(hlist.get(i).getHosname(),
									String.valueOf(hlist.get(i).getId())));
				}
				myForm.setHospitalChoice1(hospitallist);

				errors.add("ChooseHospitalDoctor", new ActionMessage(
						"errors.ChooseHospitalDoctor"));
				saveErrors(request, errors);

				return "gotoAuto";
			} else {

				session.setAttribute("hosid", myForm.getFrmHosId());

				int specid = Integer.parseInt(myForm.getFrmSpecId());
				myDoctorService.getspid(myForm, specid);

				String spid = myForm.getFrmspid();

				List<Doctor> l = myDoctorService.getDoctorById(spid);
				myForm.setFrmDocList(l);

				myForm.setFrmDocList(l);

				/*
				 * List<Doctordegree> list = myDoctorService
				 * .getDegreeByDoctorId(spid); myForm.setFrmDegreeList(list);
				 */

				myHospitalService.getHosname(myForm);
				myHospitalService.getSpectype(myForm);

				return "gotoDoctor";

			}
		}

		return "gotoAuto";
	}

	protected String doInit(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping) {
		HttpSession session = request.getSession(false);
		if (session.getAttribute("a_id") == null) {
			return "gotoAdminlogin";
		}

		AutoComplementForm myform = (AutoComplementForm) form;
		List hospitallist = new LinkedList();

		List<Hospital> hlist = myHospitalService.getAllHospital();

		System.out.println("Hospital is" + hlist.size());
		for (int i = 0; i < hlist.size(); i++) {
			hospitallist.add(new LabelValueBean(hlist.get(i).getHosname(),
					String.valueOf(hlist.get(i).getId())));
		}
		myform.setHospitalChoice1(hospitallist);

		myform.setFrmHosId("0");
		myform.setFrmSpecId("0");

		return "gotoAuto";

	}

}

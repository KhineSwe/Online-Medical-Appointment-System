package com.ictti.omas.presentation.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import com.ictti.omas.business.entity.Appointment;
import com.ictti.omas.business.service.ScheduleService;
import com.ictti.omas.presentation.form.AutoComplementForm;
import com.ictti.omas.presentation.form.PatientForm;
import com.ictti.omas.presentation.form.ScheduleForm;

public class BookConfirmAction extends BaseAction {
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

		ScheduleForm myForm = (ScheduleForm) form;

		if (null != request.getParameter("next"))
			myForm.setActualPage(myForm.getActualPage() + 1);
		if (null != request.getParameter("prev"))
			myForm.setActualPage(myForm.getActualPage() - 1);

		HttpSession session = request.getSession(false);
		if (session.getAttribute("p_id") == null) {
			return "gotoLogin";
		}

		if (request.getParameter("btnConfirm") != null) {

			String hoscode = myForm.getHoscode();

			String did = myForm.getDocid().getId().toString();

			String apppatientno = myForm.getFrmapppatientNo();

			String tokenCode;

			int number = Integer.parseInt(apppatientno);
			++number;
			tokenCode = Integer.toString(number);
			tokenCode = hoscode.concat("/" + did + "-" + tokenCode);
			myForm.setFrmtokenno(tokenCode);

			String patientemail = myForm.getLoginPatient().getPemail();

			myScheduleService.sendEmail(myForm, patientemail);

			String patientno = myForm.getFrmpatientNo();
			myScheduleService.saveApppatientNo(myForm,
					myForm.getFrmScheduleId(), patientno);

			/* myScheduleService.checkScheduleNumber(myForm); */

			myScheduleService.saveAppointment(myForm, tokenCode);

			if (Integer.parseInt(myForm.getFrmMaxno()) > 0) {
				int maxno = Integer.parseInt(myForm.getFrmMaxno());
				maxno = maxno - 1;
				myScheduleService.saveMaxNumber(myForm, maxno);
			}

			return "gotoToken";

		}

		if (request.getParameter("btnConfirmCancel") != null) {
			return "gotoCancel";
		}

		if (request.getParameter("btnOk") != null) {
			return "gotoAuto";
		}

		return "gotoSchedule";

	}

	protected String doInit(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping) {
		ScheduleForm myForm = (ScheduleForm) form;

		HttpSession session = request.getSession(false);
		if (session.getAttribute("p_id") == null) {
			return "gotoLogin";
		}

		if (myForm.getFrmFormControl().equals("2")) {

			PatientForm schForm = (PatientForm) request.getSession()
					.getAttribute("PatientFormBean");

			int pid = schForm.getLoginPatient().getId();

			Appointment app = myScheduleService.getAppointment(myForm, pid);
			if (app != null) {
				ActionErrors errors = new ActionErrors();
				errors.add("alreadymakeapp", new ActionMessage(
						"errors.alreadymakeapp"));
				saveErrors(request, errors);
				return "gotoSchedule";
			} else {

				myScheduleService.bookForSearch(myForm);

				myForm.setLoginPatient(schForm.getLoginPatient());

				AutoComplementForm hosForm = (AutoComplementForm) request
						.getSession().getAttribute("AutoFormBean");

				myForm.setHosid(hosForm.getFrmHosId());

				myScheduleService.getTokenCode(myForm, hosForm.getFrmHosId());

				/* myForm.getFrmAppointment().setTokenno(tokenCode); */

				int apppatientNo = Integer
						.parseInt(myForm.getFrmapppatientNo());
				apppatientNo++;

				myForm.setFrmpatientNo(Integer.toString((apppatientNo)));

				/*
				 * String patientemail = myForm.getLoginPatient().getPemail();
				 * 
				 * myScheduleService.sendEmail(myForm, patientemail);
				 */
				myScheduleService.checkMaximumNumber(myForm);

				String maxno = myForm.getFrmMaxno();
				if (maxno.equals("0")) {
					ActionErrors errors = new ActionErrors();
					errors.add("outofmaxno", new ActionMessage(
							"errors.outofmaxno"));
					saveErrors(request, errors);
					return "gotoSchedule";
				} else

					return "gotoAppointment";
			}
		} else {
			myScheduleService.firstLoadSearch(myForm);

			return "gotoSchedule";
		}

	}
}

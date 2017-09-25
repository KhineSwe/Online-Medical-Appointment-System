package com.ictti.omas.presentation.action;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.ictti.omas.business.entity.Hospital;
import com.ictti.omas.business.service.AdminAddScheduleService;
import com.ictti.omas.presentation.form.AutoComplementForm;

public class adminConfirmScheduleAction extends BaseAction {
	AdminAddScheduleService myAdminAddScheduleService;

	public AdminAddScheduleService getMyAdminAddScheduleService() {
		return myAdminAddScheduleService;
	}

	public void setMyAdminAddScheduleService(
			AdminAddScheduleService myAdminAddScheduleService) {
		this.myAdminAddScheduleService = myAdminAddScheduleService;
	}

	@Override
	protected String doExecute(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping)
			throws Exception {

		HttpSession session = request.getSession(true);

		
		  if (session.getAttribute("a_id") == null) { return "gotoAdminlogin";
		  }
		 
		/*
		 * String hid=(String) session.getAttribute("hosid"); AutoComplementForm
		 * myForm = (AutoComplementForm) form; myForm.setFrmHosId(hid);
		 */

		if (request.getParameter("btnConfirmCancel") != null) {

			return "gotoAddSchedule";
		}

		if (request.getParameter("btnConfirm") != null) {
			String hid = (String) session.getAttribute("hosid");
			AutoComplementForm myForm = (AutoComplementForm) form;
			myForm.setFrmHosId(hid);

			/*myAdminAddScheduleService.prepareForMail(myForm);*/
			HashMap<String, HashMap<Integer, String[]>> outermap = new HashMap<String, HashMap<Integer, String[]>>();
			outermap = (HashMap<String, HashMap<Integer, String[]>>) session
					.getAttribute("All_Schedule");
			System.out.println("==Outer Hashmap in next action");
			Set ss = outermap.keySet();
			Iterator its = ss.iterator();
			while (its.hasNext()) {
				String keys = (String) its.next();
				// System.out.println("key is " + keys);
				// System.out.println("value^^^^" + outermap.get(keys));

				// for(int o=0;o<outermap.get(keys).size();o++){
				// System.out.println("key==>"+keys+" value==>"+outermap.get(keys).get(o)+"!!!!!!!!!!!!!!!1"+outermap.get(keys).get(o).length);
				// }
			}
			// System.out.println("==Outer Hashmap in next action");
			myForm.setOutermap(outermap);

			/* myAdminAddScheduleService.gethosId(myForm); */
			System.out.println("*******");

			myAdminAddScheduleService.saveAddSchedule(myForm);

			int docid = Integer.parseInt(myForm.getFrmSpecId());
			int hosid = Integer.parseInt(myForm.getFrmHosId());

			myAdminAddScheduleService.getNewSchedule(myForm, docid, hosid);

			String docemail = myForm.getFrmDocname().getDemail();
			myAdminAddScheduleService.sendEmail(myForm, docemail);

			return "gotoScheduleDB";
		}

		return "gotoScheduleDB";
	}

}

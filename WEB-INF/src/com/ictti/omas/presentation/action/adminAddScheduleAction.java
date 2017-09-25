package com.ictti.omas.presentation.action;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import com.ictti.omas.business.entity.Doctor;
import com.ictti.omas.business.entity.Schedule;
import com.ictti.omas.business.service.AdminAddScheduleService;
import com.ictti.omas.presentation.form.AutoComplementForm;
import com.ictti.omas.presentation.form.PatientForm;
import com.ictti.omas.presentation.form.ScheduleForm;
import com.ictti.omas.util.DayOfWeek;
import com.sun.xml.internal.txw2.Document;

public class adminAddScheduleAction extends BaseAction {
	private AdminAddScheduleService myAddScheduleService;

	public AdminAddScheduleService getMyAddScheduleService() {
		return myAddScheduleService;
	}

	public void setMyAddScheduleService(
			AdminAddScheduleService myAddScheduleService) {
		this.myAddScheduleService = myAddScheduleService;
	}

	protected String doExecute(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping)
			throws Exception {

		HttpSession session = request.getSession(false);
		if (session.getAttribute("a_id") == null) {
			return "gotoAdminlogin";

		}

		if (this.isCancelled(request)) {
			AutoComplementForm myForm = (AutoComplementForm) form;

			myForm.setFrmHosId("0");
			myForm.setFrmSpecId("0");

			return "gotoHospitalSpecialize";
		}

		if (request.getParameter("btnSave") != null) {

			AutoComplementForm myForm = (AutoComplementForm) form;
			if (myForm.getFrmnoWeek() == null) {
				ActionErrors errors = new ActionErrors();
				errors.add("nullNOMOnth", new ActionMessage(
						"errors.nullNOMOnth"));
				saveErrors(request, errors);
				return "gotoDoctor";
			}

			if (myForm.getFrmStartDate().isEmpty()) {

				ActionErrors errors = new ActionErrors();
				errors.add("SchDateerror", new ActionMessage("errors.schdate"));
				saveErrors(request, errors);
				return "gotoDoctor";
			}

			myForm.getFrmStartDate();
			ActionErrors errors = new ActionErrors();

			SimpleDateFormat myformat = new SimpleDateFormat("yyyy-MM-dd");
			Date myD1 = myformat.parse(myForm.getFrmStartDate());
			Date myD2 = new Date();
			if (myD1.before(myD2) || myD1.equals(myD2)) {

				errors.add("startdateerror", new ActionMessage(
						"errors.datebefore"));
				saveErrors(request, errors);
				return "gotoDoctor";
			}

			if (myForm.getFrmmaxpatient() == "") {
				errors.add("nullmaxpatient", new ActionMessage(
						"errors.nullmaxpatient"));
				saveErrors(request, errors);
				return "gotoDoctor";
			}

			int count = myForm.getFrmDay().length;
			if (count == 0) {
				errors.add("nullallscherror", new ActionMessage(
						"errors.allschedule"));
				saveErrors(request, errors);

				return "gotoDoctor";
			} else {

				for (int i = 0; i < count; i++) {
					// System.out.println("@@@@@@@@"+myForm.getFrmDay()[i]);
					// HashMap<String, String[][]> map=new HashMap<String,
					// String[][]>();
					if (myForm.getFrmDay()[i].equals("2")) {
						if (myForm.getFrmFromMonTime().equals("0")
								&& myForm.getFrmToMonTime().equals("0")
								&& myForm.getFrmMonAMPMTime() == null
								&& myForm.getFrmmonTime() == null) {
							// System.out.println("///////////");
							errors.add("nullmonscherror", new ActionMessage(
									"errors.monschedule"));
							saveErrors(request, errors);
							return "gotoDoctor";
						} else if (myForm.getFrmFromMonTime().equals("0")
								|| myForm.getFrmToMonTime().equals("0")
								|| myForm.getFrmMonAMPMTime() == null
								|| myForm.getFrmmonTime() == null) {
							if (myForm.getFrmFromMonTime().equals("0")) {
								errors.add("nullmonfromtimescherror",
										new ActionMessage(
												"errors.monfromtimeschedule"));
								saveErrors(request, errors);
								return "gotoDoctor";
							}
							if (myForm.getFrmToMonTime().equals("0")) {
								errors.add("nullmontotimescherror",
										new ActionMessage(
												"errors.montotimeschedule"));
								saveErrors(request, errors);
								return "gotoDoctor";
							}
							if (myForm.getFrmmonTime() == null) {
								errors.add("nullmonampmscherror",
										new ActionMessage(
												"errors.monampmschedule"));
								saveErrors(request, errors);
								return "gotoDoctor";
							}
							if (myForm.getFrmMonAMPMTime() == null) {
								errors.add("nullmonampmscherror",
										new ActionMessage(
												"errors.monampmschedule"));
								saveErrors(request, errors);
								return "gotoDoctor";
							}

						} else {
							if ((myForm.getFrmMonAMPMTime().equals("PM") && myForm
									.getFrmmonTime().equals("PM"))
									|| (myForm.getFrmMonAMPMTime().equals("AM") && myForm
											.getFrmmonTime().equals("AM"))) {
								if (Integer
										.parseInt(myForm.getFrmFromMonTime()) >= Integer
										.parseInt(myForm.getFrmToMonTime())) {
									errors.add(
											"greaterfrommonscherror",
											new ActionMessage(
													"errors.greaterfrommonschedule"));
									saveErrors(request, errors);
									return "gotoDoctor";
								}
							}
						}
					}

					if (myForm.getFrmDay()[i].equals("3")) {
						// System.out.println("%%%%%%%%%%"+myForm.getFrmDay()[i]+myForm.getFrmFromTueTime()+myForm.getFrmToTueTime()+myForm.getFrmtueTime());
						if (myForm.getFrmFromTueTime().equals("0")
								&& myForm.getFrmToTueTime().equals("0")
								&& myForm.getFrmTueAMPMTime() == null
								&& myForm.getFrmtueTime() == null) {
							// System.out.println("#########");
							errors.add("nulltuescherror", new ActionMessage(
									"errors.tueschedule"));
							saveErrors(request, errors);
							return "gotoDoctor";
						} else if (myForm.getFrmFromTueTime().equals("0")
								|| myForm.getFrmToTueTime().equals("0")
								|| myForm.getFrmTueAMPMTime() == null
								|| myForm.getFrmtueTime() == null) {
							if (myForm.getFrmFromTueTime().equals("0")) {
								errors.add("nulltuefromtimescherror",
										new ActionMessage(
												"errors.tuefromtimeschedule"));
								saveErrors(request, errors);
								return "gotoDoctor";
							}
							if (myForm.getFrmToTueTime().equals("0")) {
								errors.add("nulltuetotimescherror",
										new ActionMessage(
												"errors.tuetotimeschedule"));
								saveErrors(request, errors);
								return "gotoDoctor";
							}
							if (myForm.getFrmtueTime() == null) {
								errors.add("nulltueampmscherror",
										new ActionMessage(
												"errors.tueampmschedule"));
								saveErrors(request, errors);
								return "gotoDoctor";
							}
							if (myForm.getFrmTueAMPMTime() == null) {
								errors.add("nulltueampmscherror",
										new ActionMessage(
												"errors.tueampmschedule"));
								saveErrors(request, errors);
								return "gotoDoctor";
							}
						} else {
							if ((myForm.getFrmTueAMPMTime().equals("PM") && myForm
									.getFrmtueTime().equals("PM"))
									|| (myForm.getFrmTueAMPMTime().equals("AM") && myForm
											.getFrmtueTime().equals("AM"))) {

								if (Integer
										.parseInt(myForm.getFrmFromTueTime()) >= Integer
										.parseInt(myForm.getFrmToTueTime())) {
									errors.add(
											"greaterfromtuescherror",
											new ActionMessage(
													"errors.greaterfromtueschedule"));
									saveErrors(request, errors);
									return "gotoDoctor";
								}
							}

						}
					}

					if (myForm.getFrmDay()[i].equals("4")) {
						if (myForm.getFrmFromWedTime().equals("0")
								&& myForm.getFrmwedTime() == null
								&& myForm.getFrmToWedTime().equals("0")
								&& myForm.getFrmwedTime() == null) {
							errors.add("nullwedscherror", new ActionMessage(
									"errors.wedschedule"));
							saveErrors(request, errors);
							return "gotoDoctor";
						} else if (myForm.getFrmFromWedTime().equals("0")
								|| myForm.getFrmwedTime() == null
								|| myForm.getFrmToWedTime().equals("0")
								|| myForm.getFrmwedTime() == null) {
							if (myForm.getFrmFromWedTime().equals("0")) {
								errors.add("nullwedfromtimescherror",
										new ActionMessage(
												"errors.wedfromtimeschedule"));
								saveErrors(request, errors);
								return "gotoDoctor";
							}
							if (myForm.getFrmToWedTime().equals("0")) {
								errors.add("nullwedtotimescherror",
										new ActionMessage(
												"errors.wedtotimeschedule"));
								saveErrors(request, errors);
								return "gotoDoctor";
							}
							if (myForm.getFrmwedTime() == null) {
								errors.add("nullwedampmscherror",
										new ActionMessage(
												"errors.wedampmschedule"));
								saveErrors(request, errors);
								return "gotoDoctor";
							}
							if (myForm.getFrmWedAMPMTime() == null) {
								errors.add("nullwedampmscherror",
										new ActionMessage(
												"errors.wedampmschedule"));
								saveErrors(request, errors);
								return "gotoDoctor";
							}

						} else {
							if ((myForm.getFrmWedAMPMTime().equals("PM") && myForm
									.getFrmwedTime().equals("PM"))
									|| (myForm.getFrmWedAMPMTime().equals("AM") && myForm
											.getFrmwedTime().equals("AM"))) {
								if (Integer
										.parseInt(myForm.getFrmFromWedTime()) >= Integer
										.parseInt(myForm.getFrmToWedTime())) {
									errors.add(
											"greaterfromwedscherror",
											new ActionMessage(
													"errors.greaterfromwedschedule"));
									saveErrors(request, errors);
									return "gotoDoctor";
								}
							}
						}
					}

					if (myForm.getFrmDay()[i].equals("5")) {
						if (myForm.getFrmFromThuTime().equals("0")
								&& myForm.getFrmToThuTime().equals("0")
								&& myForm.getFrmThuAMPMTime() == null
								&& myForm.getFrmthuTime() == null) {
							errors.add("nullthuscherror", new ActionMessage(
									"errors.thuschedule"));
							saveErrors(request, errors);
							return "gotoDoctor";
						} else if (myForm.getFrmFromThuTime().equals("0")
								|| myForm.getFrmToThuTime().equals("0")
								|| myForm.getFrmThuAMPMTime() == null
								|| myForm.getFrmthuTime() == null) {
							if (myForm.getFrmFromThuTime().equals("0")) {
								errors.add("nullthufromtimescherror",
										new ActionMessage(
												"errors.thufromtimeschedule"));
								saveErrors(request, errors);
								return "gotoDoctor";
							}
							if (myForm.getFrmToThuTime().equals("0")) {
								errors.add("nullthutotimescherror",
										new ActionMessage(
												"errors.thutotimeschedule"));
								saveErrors(request, errors);
								return "gotoDoctor";
							}
							if (myForm.getFrmthuTime() == null) {
								errors.add("nullthuampmscherror",
										new ActionMessage(
												"errors.thuampmschedule"));
								saveErrors(request, errors);
								return "gotoDoctor";
							}
							if (myForm.getFrmThuAMPMTime() == null) {
								errors.add("nullthuampmscherror",
										new ActionMessage(
												"errors.thuampmschedule"));
								saveErrors(request, errors);
								return "gotoDoctor";
							}

						} else {
							if ((myForm.getFrmThuAMPMTime().equals("PM") && myForm
									.getFrmthuTime().equals("PM"))
									|| (myForm.getFrmThuAMPMTime().equals("AM") && myForm
											.getFrmthuTime().equals("AM"))) {
								if (Integer
										.parseInt(myForm.getFrmFromThuTime()) >= Integer
										.parseInt(myForm.getFrmToThuTime())) {
									errors.add(
											"greaterfromthuscherror",
											new ActionMessage(
													"errors.greaterfromthuschedule"));
									saveErrors(request, errors);
									return "gotoDoctor";
								}
							}

						}
					}

					if (myForm.getFrmDay()[i].equals("6")) {
						if (myForm.getFrmFromFriTime().equals("0")
								&& myForm.getFrmToFriTime().equals("0")
								&& myForm.getFrmFriAMPMTime() == null
								&& myForm.getFrmfriTime() == null) {
							errors.add("nullfrischerror", new ActionMessage(
									"errors.frischedule"));
							saveErrors(request, errors);
							return "gotoDoctor";
						} else if (myForm.getFrmFromFriTime().equals("0")
								|| myForm.getFrmToFriTime().equals("0")
								|| myForm.getFrmFriAMPMTime() == null
								|| myForm.getFrmfriTime() == null) {
							if (myForm.getFrmFromFriTime().equals("0")) {
								errors.add("nullfrifromtimescherror",
										new ActionMessage(
												"errors.frifromtimeschedule"));
								saveErrors(request, errors);
								return "gotoDoctor";
							}
							if (myForm.getFrmToFriTime().equals("0")) {
								errors.add("nullfritotimescherror",
										new ActionMessage(
												"errors.fritotimeschedule"));
								saveErrors(request, errors);
								return "gotoDoctor";
							}
							if (myForm.getFrmfriTime() == null) {
								errors.add("nullfriampmscherror",
										new ActionMessage(
												"errors.friampmschedule"));
								saveErrors(request, errors);
								return "gotoDoctor";
							}
							if (myForm.getFrmFriAMPMTime() == null) {
								errors.add("nullfriampmscherror",
										new ActionMessage(
												"errors.friampmschedule"));
								saveErrors(request, errors);
								return "gotoDoctor";
							}
						} else {
							if ((myForm.getFrmFriAMPMTime().equals("PM") && myForm
									.getFrmfriTime().equals("PM"))
									|| (myForm.getFrmFriAMPMTime().equals("AM") && myForm
											.getFrmfriTime().equals("AM"))) {

								if (Integer
										.parseInt(myForm.getFrmFromFriTime()) >= Integer
										.parseInt(myForm.getFrmToFriTime())) {
									errors.add(
											"greaterfromfrischerror",
											new ActionMessage(
													"errors.greaterfromfrischedule"));
									saveErrors(request, errors);
									return "gotoDoctor";
								}
							}

						}

					}

					if (myForm.getFrmDay()[i].equals("7")) {
						if (myForm.getFrmFromSatTime().equals("0")
								&& myForm.getFrmToSatTime().equals("0")
								&& myForm.getFrmSatAMPMTime() == null
								&& myForm.getFrmsatTime() == null) {
							errors.add("nullsatscherror", new ActionMessage(
									"errors.satschedule"));
							saveErrors(request, errors);
							return "gotoDoctor";
						} else if (myForm.getFrmFromSatTime().equals("0")
								|| myForm.getFrmToSatTime().equals("0")
								|| myForm.getFrmSatAMPMTime() == null
								|| myForm.getFrmsatTime() == null) {
							if (myForm.getFrmFromSatTime().equals("0")) {
								errors.add("nullsatfromtimescherror",
										new ActionMessage(
												"errors.satfromtimeschedule"));
								saveErrors(request, errors);
								return "gotoDoctor";
							}
							if (myForm.getFrmToSatTime().equals("0")) {
								errors.add("nullsattotimescherror",
										new ActionMessage(
												"errors.sattotimeschedule"));
								saveErrors(request, errors);
								return "gotoDoctor";
							}
							if (myForm.getFrmsatTime() == null) {
								errors.add("nullsatampmscherror",
										new ActionMessage(
												"errors.satampmschedule"));
								saveErrors(request, errors);
								return "gotoDoctor";
							}
							if (myForm.getFrmSatAMPMTime() == null) {
								errors.add("nullsatampmscherror",
										new ActionMessage(
												"errors.satampmschedule"));
								saveErrors(request, errors);
								return "gotoDoctor";
							}
						} else {
							if ((myForm.getFrmSatAMPMTime().equals("PM") && myForm
									.getFrmsatTime().equals("PM"))
									|| (myForm.getFrmSatAMPMTime().equals("AM") && myForm
											.getFrmsatTime().equals("AM"))) {

								if (Integer
										.parseInt(myForm.getFrmFromSatTime()) >= Integer
										.parseInt(myForm.getFrmToSatTime())) {
									errors.add(
											"greaterfromsatscherror",
											new ActionMessage(
													"errors.greaterfromsatschedule"));
									saveErrors(request, errors);
									return "gotoDoctor";
								}
							}

						}
					}

					if (myForm.getFrmDay()[i].equals("1")) {
						if (myForm.getFrmFromSunTime().equals("0")
								&& myForm.getFrmToSunTime().equals("0")
								&& myForm.getFrmsunTime() == null
								&& myForm.getFrmsunTime() == null) {
							errors.add("nullsunscherror", new ActionMessage(
									"errors.sunschedule"));
							saveErrors(request, errors);
							return "gotoDoctor";
						} else if (myForm.getFrmFromSunTime().equals("0")
								|| myForm.getFrmToSunTime().equals("0")
								|| myForm.getFrmsunTime() == null
								|| myForm.getFrmsunTime() == null) {
							if (myForm.getFrmFromSunTime().equals("0")) {
								errors.add("nullsunfromtimescherror",
										new ActionMessage(
												"errors.sunfromtimeschedule"));
								saveErrors(request, errors);
								return "gotoDoctor";
							}
							if (myForm.getFrmToSunTime().equals("0")) {
								errors.add("nullsuntotimescherror",
										new ActionMessage(
												"errors.suntotimeschedule"));
								saveErrors(request, errors);
								return "gotoDoctor";
							}
							if (myForm.getFrmsunTime() == null) {
								errors.add("nullsunampmscherror",
										new ActionMessage(
												"errors.sunampmschedule"));
								saveErrors(request, errors);
								return "gotoDoctor";
							}
							if (myForm.getFrmSunAMPMTime() == null) {
								errors.add("nullsunampmscherror",
										new ActionMessage(
												"errors.sunampmschedule"));
								saveErrors(request, errors);
								return "gotoDoctor";
							}
						} else {
							if ((myForm.getFrmSunAMPMTime().equals("PM") && myForm
									.getFrmsunTime().equals("PM"))
									|| (myForm.getFrmSunAMPMTime().equals("AM") && myForm
											.getFrmsunTime().equals("AM"))) {

								if (Integer
										.parseInt(myForm.getFrmFromSunTime()) >= Integer
										.parseInt(myForm.getFrmToSunTime())) {
									errors.add(
											"greaterfromsunscherror",
											new ActionMessage(
													"errors.greaterfromsunschedule"));
									saveErrors(request, errors);
									return "gotoDoctor";
								}
							}

						}
					}
				} // for end

				// check Duplicate Schedule
				String id = session.getAttribute("hosid").toString();
				int hid = Integer.parseInt(id);
				int did = Integer.parseInt(myForm.getFrmSpecId());
				// System.out.println("Hos id "+ hid);
				// System.out.println("Did"+did);
				List<Schedule> sList = myAddScheduleService
						.checkDuplicateSchedule(did, hid);
				// System.out.println("SList"+sList.size());

				/*
				 * if(sList == null){ System.out.println("Duplicate Schedule");
				 * 
				 * errors.add("duplicateSchedule",new
				 * ActionMessage("errors.duplicateSchedule"));
				 * saveErrors(request, errors);
				 */
				// return "gotoDoctor";
				// }

				// check Duplicate Schedule

				if (sList != null) {

					Date max = sList.get(0).getSchdate();
					for (int dindex = 1; dindex < sList.size(); dindex++)
						if (max.compareTo(sList.get(dindex).getSchdate()) < 0)
							max = sList.get(dindex).getSchdate();

					System.out.println("max date in schedule=>" + max);
					Date today = new Date();
					// check Duplicate Schedule
					if (max.after(today)) {
						// System.out.println("Duplicate Schedule");
						System.out.println("******Date" + today);
						errors.add("duplicateSchedule", new ActionMessage(
								"errors.duplicateSchedule"));
						saveErrors(request, errors);
						return "gotoDoctor";
					}// check Duplicate Schedule
						// ok to create schedule
					else {
						System.out.println("^^^^^^^Date" + today);
						HashMap<String, HashMap<Integer, String[]>> outermap = new HashMap<String, HashMap<Integer, String[]>>();
						outermap = myAddScheduleService.GetSchedule(myForm);
						session.setAttribute("All_Schedule", outermap);
						myAddScheduleService.getDocname(myForm);

						return "gotoAddSchedule";
					}
					// ok to create schedule
				}

				/*
				 * //check Duplicate Schedule String
				 * id=session.getAttribute("hosid").toString(); int
				 * hid=Integer.parseInt(id); int
				 * did=Integer.parseInt(myForm.getFrmSpecId());
				 * //System.out.println("Hos id "+ hid);
				 * //System.out.println("Did"+did); List<Schedule>
				 * sList=myAddScheduleService.checkDuplicateSchedule(did,hid);
				 * //System.out.println("SList"+sList.size());
				 * 
				 * if(sList == null){ System.out.println("Duplicate Schedule");
				 * 
				 * errors.add("duplicateSchedule",new
				 * ActionMessage("errors.duplicateSchedule"));
				 * saveErrors(request, errors); //return "gotoDoctor"; //}
				 * 
				 * if(sList != null){
				 * //System.out.println("Duplicate Schedule");
				 * 
				 * errors.add("duplicateSchedule",new
				 * ActionMessage("errors.duplicateSchedule"));
				 * saveErrors(request, errors); return "gotoDoctor"; }
				 */
				else {
					// check Duplicate Schedule
					// System.out.println("eeeeee");
					HashMap<String, HashMap<Integer, String[]>> outermap = new HashMap<String, HashMap<Integer, String[]>>();
					outermap = myAddScheduleService.GetSchedule(myForm);

					session.setAttribute("All_Schedule", outermap);
					// System.out.println("size of outermap=>"+outermap.size());
					myAddScheduleService.getDocname(myForm);
				}
			} // else end

			return "gotoAddSchedule";
		}// btnsave click

		return null;
	}// doExecute end

}

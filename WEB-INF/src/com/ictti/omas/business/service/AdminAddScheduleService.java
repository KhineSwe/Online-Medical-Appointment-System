package com.ictti.omas.business.service;

import java.io.StringWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import javax.servlet.http.HttpSession;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;

import com.ictti.omas.business.entity.Doctor;
import com.ictti.omas.business.entity.Hospital;
import com.ictti.omas.business.entity.Patient;
import com.ictti.omas.business.entity.Schedule;
import com.ictti.omas.dao.DoctorDao;
import com.ictti.omas.dao.HospitalDao;
import com.ictti.omas.dao.ScheduleDao;
import com.ictti.omas.presentation.form.AutoComplementForm;
import com.ictti.omas.presentation.form.PatientForm;
import com.ictti.omas.presentation.form.ScheduleForm;
import com.ictti.omas.util.DayOfWeek;
import com.ictti.omas.util.MailConfig;

public class AdminAddScheduleService {
	DoctorDao myDoctorDao;
	ScheduleDao myScheduleDao;
	HospitalDao myHospitalDao;

	public HospitalDao getMyHospitalDao() {
		return myHospitalDao;
	}

	public void setMyHospitalDao(HospitalDao myHospitalDao) {
		this.myHospitalDao = myHospitalDao;
	}

	public ScheduleDao getMyScheduleDao() {
		return myScheduleDao;
	}

	public void setMyScheduleDao(ScheduleDao myScheduleDao) {
		this.myScheduleDao = myScheduleDao;
	}

	public DoctorDao getMyDoctorDao() {
		return myDoctorDao;
	}

	public void setMyDoctorDao(DoctorDao myDoctorDao) {
		this.myDoctorDao = myDoctorDao;
	}

	HashMap<String, HashMap<Integer, String[]>> outermap = new HashMap<String, HashMap<Integer, String[]>>();
	HashMap<Integer, String[]> innermap = new HashMap<Integer, String[]>();

	public HashMap<String, HashMap<Integer, String[]>> GetSchedule(
			AutoComplementForm myForm) throws ParseException {

		SimpleDateFormat myformat = new SimpleDateFormat("yyyy-MM-dd");
		Date startdate = myformat.parse(myForm.getFrmStartDate());

		DayOfWeek dayweek = new DayOfWeek();
		int day = dayweek.getDayOfWeek(startdate);

		// System.out.println("Day of week=" + day);
		int count = myForm.getFrmDay().length;
		int countmap = 0;

		for (int i = 0; i < count; i++) {
			String x = dayweek.getScheduleDay(startdate, myForm.getFrmDay()[i],
					day);

			if (myForm.getFrmDay()[i].equals("2")) {
				System.out.println("****no of weeks*****"
						+ Integer.parseInt(myForm.getFrmnoWeek()));
				for (int moncount = 1; moncount <= Integer.parseInt(myForm.getFrmnoWeek()); moncount++) {
					System.out.println("%%%Monday Case");
					String date1 = dayweek.getAllScheduleDays(x,
							(7 * (moncount - 1)));

					if (myForm.getFrmmonTime().equals("PM")
							&& myForm.getFrmMonAMPMTime().equals("PM")) {
						System.out.println("%%%Monday Case PM PM");
						int fromTime = Integer.parseInt(myForm
								.getFrmFromMonTime()) + 12;
						int toTime = Integer.parseInt(myForm.getFrmToMonTime()) + 12;
						innermap.put(
								countmap++,
								new String[] { date1,
										Integer.toString(fromTime),
										Integer.toString(toTime),
										myForm.getFrmmonTime() });
					} else if (myForm.getFrmmonTime().equals("AM")
							&& myForm.getFrmMonAMPMTime().equals("AM")) {
						System.out.println("%%%Monday Case AM AM");
						innermap.put(
								countmap++,
								new String[] { date1,
										myForm.getFrmFromMonTime(),
										myForm.getFrmToMonTime(),
										myForm.getFrmmonTime() });
					} else if (myForm.getFrmmonTime().equals("PM")
							&& myForm.getFrmMonAMPMTime().equals("AM")) {
						System.out.println("%%%Monday Case PM AM");
						int fromTime = Integer.parseInt(myForm
								.getFrmFromMonTime());
						int toTime = Integer.parseInt(myForm.getFrmToMonTime()) + 12;
						innermap.put(
								countmap++,
								new String[] { date1,
										Integer.toString(fromTime),
										Integer.toString(toTime),
										myForm.getFrmmonTime() });
					} else if (myForm.getFrmmonTime().equals("AM")
							&& myForm.getFrmMonAMPMTime().equals("PM")) {
						System.out.println("%%%Monday Case AM PM");
						int fromTime = Integer.parseInt(myForm
								.getFrmFromMonTime()) + 12;
						innermap.put(
								countmap++,
								new String[] { date1,
										Integer.toString(fromTime),
										myForm.getFrmToMonTime(),
										myForm.getFrmmonTime() });
					}
				}
				outermap.put(myForm.getFrmDay()[i], innermap);
			}

			else if (myForm.getFrmDay()[i].equals("3")) {
				System.out.println("*****no of weeks****"
						+ Integer.parseInt(myForm.getFrmnoWeek()));
				for (int moncount = 1; moncount <= Integer.parseInt(myForm
						.getFrmnoWeek()); moncount++) {
					System.out.println("%%%Tuesday Case");
					String date1 = dayweek.getAllScheduleDays(x,
							(7 * (moncount - 1)));

					if (myForm.getFrmtueTime().equals("PM")
							&& myForm.getFrmTueAMPMTime().equals("PM")) {
						System.out.println("%%%Tuesday Case PM PM");
						int fromTime = Integer.parseInt(myForm
								.getFrmFromTueTime()) + 12;
						int toTime = Integer.parseInt(myForm.getFrmToTueTime()) + 12;
						innermap.put(
								countmap++,
								new String[] { date1,
										Integer.toString(fromTime),
										Integer.toString(toTime),
										myForm.getFrmtueTime() });
					} else if (myForm.getFrmtueTime().equals("AM")
							&& myForm.getFrmTueAMPMTime().equals("AM")) {
						System.out.println("%%%Tuesday Case AM AM");
						innermap.put(
								countmap++,
								new String[] { date1,
										myForm.getFrmFromTueTime(),
										myForm.getFrmToTueTime(),
										myForm.getFrmtueTime() });
					} else if (myForm.getFrmtueTime().equals("PM")
							&& myForm.getFrmTueAMPMTime().equals("AM")) {
						System.out.println("%%%Tuesday Case PM AM");
						int fromTime = Integer.parseInt(myForm
								.getFrmFromTueTime());
						int toTime = Integer.parseInt(myForm.getFrmToTueTime()) + 12;
						innermap.put(
								countmap++,
								new String[] { date1,
										Integer.toString(fromTime),
										Integer.toString(toTime),
										myForm.getFrmtueTime() });
					} else if (myForm.getFrmtueTime().equals("AM")
							&& myForm.getFrmTueAMPMTime().equals("PM")) {
						System.out.println("%%%Tuesday Case AM PM");
						int fromTime = Integer.parseInt(myForm
								.getFrmFromTueTime()) + 12;
						int toTime = Integer.parseInt(myForm.getFrmToTueTime());
						innermap.put(
								countmap++,
								new String[] { date1,
										Integer.toString(fromTime),
										Integer.toString(toTime),
										myForm.getFrmtueTime() });
					}
				}
				outermap.put(myForm.getFrmDay()[i], innermap);
			}

			else if (myForm.getFrmDay()[i].equals("4")) {
				System.out.println("****no of weeks*****"
						+ Integer.parseInt(myForm.getFrmnoWeek()));
				for (int moncount = 1; moncount <= Integer.parseInt(myForm.getFrmnoWeek()); moncount++) {
					String date1 = dayweek.getAllScheduleDays(x,
							(7 * (moncount - 1)));

					if (myForm.getFrmwedTime().equals("PM")
							&& myForm.getFrmWedAMPMTime().equals("PM")) {
						int fromTime = Integer.parseInt(myForm
								.getFrmFromWedTime()) + 12;
						int toTime = Integer.parseInt(myForm.getFrmToWedTime()) + 12;
						innermap.put(
								countmap++,
								new String[] { date1,
										Integer.toString(fromTime),
										Integer.toString(toTime),
										myForm.getFrmwedTime() });
					} else if (myForm.getFrmwedTime().equals("AM")
							&& myForm.getFrmWedAMPMTime().equals("AM")) {

						innermap.put(
								countmap++,
								new String[] { date1,
										myForm.getFrmFromWedTime(),
										myForm.getFrmToWedTime(),
										myForm.getFrmwedTime() });
					} else if (myForm.getFrmwedTime().equals("PM")
							&& myForm.getFrmWedAMPMTime().equals("AM")) {
						int fromTime = Integer.parseInt(myForm
								.getFrmFromWedTime());
						int toTime = Integer.parseInt(myForm.getFrmToWedTime()) + 12;
						innermap.put(
								countmap++,
								new String[] { date1,
										Integer.toString(fromTime),
										Integer.toString(toTime),
										myForm.getFrmwedTime() });
					} else if (myForm.getFrmwedTime().equals("AM")
							&& myForm.getFrmWedAMPMTime().equals("PM")) {
						int fromTime = Integer.parseInt(myForm
								.getFrmFromWedTime()) + 12;
						int toTime = Integer.parseInt(myForm.getFrmToWedTime());
						innermap.put(
								countmap++,
								new String[] { date1,
										Integer.toString(fromTime),
										Integer.toString(toTime),
										myForm.getFrmwedTime() });
					}
				}
				outermap.put(myForm.getFrmDay()[i], innermap);
			}

			else if (myForm.getFrmDay()[i].equals("5")) {
				System.out.println("****no of weeks*****"
						+ Integer.parseInt(myForm.getFrmnoWeek()));
				for (int moncount = 1; moncount <= Integer.parseInt(myForm.getFrmnoWeek()); moncount++) {
					String date1 = dayweek.getAllScheduleDays(x,
							(7 * (moncount - 1)));

					if (myForm.getFrmthuTime().equals("PM")
							&& myForm.getFrmThuAMPMTime().equals("PM")) {
						int fromTime = Integer.parseInt(myForm
								.getFrmFromThuTime()) + 12;
						int toTime = Integer.parseInt(myForm.getFrmToThuTime()) + 12;
						innermap.put(
								countmap++,
								new String[] { date1,
										Integer.toString(fromTime),
										Integer.toString(toTime),
										myForm.getFrmthuTime() });
					} else if (myForm.getFrmthuTime().equals("AM")
							&& myForm.getFrmThuAMPMTime().equals("AM")) {
						innermap.put(
								countmap++,
								new String[] { date1,
										myForm.getFrmFromThuTime(),
										myForm.getFrmToThuTime(),
										myForm.getFrmthuTime() });
					} else if (myForm.getFrmthuTime().equals("PM")
							&& myForm.getFrmThuAMPMTime().equals("AM")) {
						int fromTime = Integer.parseInt(myForm
								.getFrmFromThuTime());
						int toTime = Integer.parseInt(myForm.getFrmToThuTime()) + 12;
						innermap.put(
								countmap++,
								new String[] { date1,
										Integer.toString(fromTime),
										Integer.toString(toTime),
										myForm.getFrmthuTime() });
					} else if (myForm.getFrmthuTime().equals("AM")
							&& myForm.getFrmThuAMPMTime().equals("PM")) {
						int fromTime = Integer.parseInt(myForm
								.getFrmFromThuTime()) + 12;
						int toTime = Integer.parseInt(myForm.getFrmToThuTime());
						innermap.put(
								countmap++,
								new String[] { date1,
										Integer.toString(fromTime),
										Integer.toString(toTime),
										myForm.getFrmthuTime() });
					}

				}
				outermap.put(myForm.getFrmDay()[i], innermap);
			}

			else if (myForm.getFrmDay()[i].equals("6")) {
				System.out.println("*****no of weeks****"
						+ Integer.parseInt(myForm.getFrmnoWeek()));
				for (int moncount = 1; moncount <= Integer.parseInt(myForm.getFrmnoWeek()); moncount++) {
					String date1 = dayweek.getAllScheduleDays(x,
							(7 * (moncount - 1)));
					if (myForm.getFrmfriTime().equals("PM")
							&& myForm.getFrmfriTime().equals("PM")) {
						int fromTime = Integer.parseInt(myForm
								.getFrmFromFriTime()) + 12;
						int toTime = Integer.parseInt(myForm.getFrmToFriTime()) + 12;
						innermap.put(
								countmap++,
								new String[] { date1,
										Integer.toString(fromTime),
										Integer.toString(toTime),
										myForm.getFrmfriTime() });
					} else if (myForm.getFrmfriTime().equals("AM")
							&& myForm.getFrmfriTime().equals("AM")) {
						innermap.put(
								countmap++,
								new String[] { date1,
										myForm.getFrmFromFriTime(),
										myForm.getFrmToFriTime(),
										myForm.getFrmfriTime() });
					} else if (myForm.getFrmfriTime().equals("PM")
							&& myForm.getFrmfriTime().equals("AM")) {
						int fromTime = Integer.parseInt(myForm
								.getFrmFromFriTime());
						int toTime = Integer.parseInt(myForm.getFrmToFriTime()) + 12;
						innermap.put(
								countmap++,
								new String[] { date1,
										Integer.toString(fromTime),
										Integer.toString(toTime),
										myForm.getFrmfriTime() });
					} else if (myForm.getFrmfriTime().equals("AM")
							&& myForm.getFrmfriTime().equals("PM")) {
						int fromTime = Integer.parseInt(myForm
								.getFrmFromFriTime()) + 12;
						int toTime = Integer.parseInt(myForm.getFrmToFriTime());
						innermap.put(
								countmap++,
								new String[] { date1,
										Integer.toString(fromTime),
										Integer.toString(toTime),
										myForm.getFrmfriTime() });
					}

				}
				outermap.put(myForm.getFrmDay()[i], innermap);
			}

			else if (myForm.getFrmDay()[i].equals("7")) {
				System.out.println("****no of weeks*****"
						+ Integer.parseInt(myForm.getFrmnoWeek()));
				for (int moncount = 1; moncount <= Integer.parseInt(myForm.getFrmnoWeek()); moncount++) {
					String date1 = dayweek.getAllScheduleDays(x,
							(7 * (moncount - 1)));
					if (myForm.getFrmsatTime().equals("PM")
							&& myForm.getFrmSatAMPMTime().equals("PM")) {
						int fromTime = Integer.parseInt(myForm
								.getFrmFromSatTime()) + 12;
						int toTime = Integer.parseInt(myForm.getFrmToSatTime()) + 12;
						innermap.put(
								countmap++,
								new String[] { date1,
										Integer.toString(fromTime),
										Integer.toString(toTime),
										myForm.getFrmsatTime() });
					} else if (myForm.getFrmsatTime().equals("AM")
							&& myForm.getFrmSatAMPMTime().equals("AM")) {
						innermap.put(
								countmap++,
								new String[] { date1,
										myForm.getFrmFromSatTime(),
										myForm.getFrmToSatTime(),
										myForm.getFrmsatTime() });
					}

					else if (myForm.getFrmsatTime().equals("PM")
							&& myForm.getFrmSatAMPMTime().equals("AM")) {
						int fromTime = Integer.parseInt(myForm
								.getFrmFromSatTime());
						int toTime = Integer.parseInt(myForm.getFrmToSatTime()) + 12;
						innermap.put(
								countmap++,
								new String[] { date1,
										Integer.toString(fromTime),
										Integer.toString(toTime),
										myForm.getFrmsatTime() });
					} else if (myForm.getFrmsatTime().equals("AM")
							&& myForm.getFrmSatAMPMTime().equals("PM")) {
						int fromTime = Integer.parseInt(myForm
								.getFrmFromSatTime()) + 12;
						int toTime = Integer.parseInt(myForm.getFrmToSatTime());
						innermap.put(
								countmap++,
								new String[] { date1,
										Integer.toString(fromTime),
										Integer.toString(toTime),
										myForm.getFrmsatTime() });
					}
				}
				outermap.put(myForm.getFrmDay()[i], innermap);
			}

			else if (myForm.getFrmDay()[i].equals("1")) {
				System.out.println("****no of weeks*****"
						+ Integer.parseInt(myForm.getFrmnoWeek()));
				for (int moncount = 1; moncount <= Integer.parseInt(myForm.getFrmnoWeek()); moncount++) {
					String date1 = dayweek.getAllScheduleDays(x,
							(7 * (moncount - 1)));
					if (myForm.getFrmsunTime().equals("PM")
							&& myForm.getFrmSunAMPMTime().equals("PM")) {
						int fromTime = Integer.parseInt(myForm
								.getFrmFromSunTime()) + 12;
						int toTime = Integer.parseInt(myForm.getFrmToSunTime()) + 12;
						innermap.put(
								countmap++,
								new String[] { date1,
										Integer.toString(fromTime),
										Integer.toString(toTime),
										myForm.getFrmsunTime() });
					} else if (myForm.getFrmsunTime().equals("AM")
							&& myForm.getFrmSunAMPMTime().equals("AM")) {
						innermap.put(
								countmap++,
								new String[] { date1,
										myForm.getFrmFromSunTime(),
										myForm.getFrmToSunTime(),
										myForm.getFrmsunTime() });
					}

					else if (myForm.getFrmsunTime().equals("PM")
							&& myForm.getFrmSunAMPMTime().equals("AM")) {
						int fromTime = Integer.parseInt(myForm
								.getFrmFromSunTime());
						int toTime = Integer.parseInt(myForm.getFrmToSunTime()) + 12;
						innermap.put(
								countmap++,
								new String[] { date1,
										Integer.toString(fromTime),
										Integer.toString(toTime),
										myForm.getFrmsunTime() });
					} else if (myForm.getFrmsunTime().equals("AM")
							&& myForm.getFrmSunAMPMTime().equals("PM")) {
						int fromTime = Integer.parseInt(myForm
								.getFrmFromSunTime()) + 12;
						int toTime = Integer.parseInt(myForm.getFrmToSunTime());
						innermap.put(
								countmap++,
								new String[] { date1,
										Integer.toString(fromTime),
										Integer.toString(toTime),
										myForm.getFrmsunTime() });
					}
				}
				outermap.put(myForm.getFrmDay()[i], innermap);
			}
		}
		
		return outermap;
	}

	public void getDocname(AutoComplementForm myform) throws ParseException {
		Doctor doc = myDoctorDao.getDocNameByID(Integer.parseInt(myform
				.getFrmSpecId()));

		myform.setFrmDocname(doc);

	}

	public void saveAddSchedule(AutoComplementForm myForm)
			throws ParseException {
		Schedule mySchedule = new Schedule();
		SimpleDateFormat myformat = new SimpleDateFormat("yyyy-MM-dd");
		
		String key1;
		int key2;
		Iterator it2;
	Iterator it1=myForm.getOutermap().keySet().iterator(); 
	int count=0;
	while(it1.hasNext()){
		count++;
		key1=(String) it1.next();
		it2=myForm.getOutermap().get(key1).keySet().iterator();
		int size=myForm.getOutermap().get(key1).get(0).length;
		//System.out.println("length of inner map===>"+size);
		System.out.println("------------------------------------------------------------------------");
		System.out.println("Outer map====>"+key1);
		if(count==1)
			{
			while(it2.hasNext()){
				key2=(int)it2.next();				
				mySchedule.setSchdate(myformat.parse(innermap.get(key2)[0]));
				mySchedule
						.setSchstarttime(Integer.parseInt(innermap.get(key2)[1]));
				mySchedule.setSchfinishtime(Integer.parseInt((innermap
						.get(key2)[2])));
				mySchedule.setId(null);
				mySchedule.setSchmaxno(Integer.parseInt(myForm
						.getFrmmaxpatient()));
				Hospital hosid = myHospitalDao.getHospitalById(Integer
						.parseInt(myForm.getFrmHosId()));
				Doctor did = myDoctorDao.getDesireDoctorById(Integer
						.parseInt(myForm.getFrmSpecId()));
				mySchedule.setHosid(hosid);
				mySchedule.setApppatientno(0);
				mySchedule.setDid(did);
				myScheduleDao.saveAddSchedule(mySchedule);
				
				
			
			}
		}
		
	}

		// pwint

		// loop
		/*Set out = outermap.keySet();
		System.out.println("Outer Map is"
				+ myForm.getOutermap().keySet().size());
		Iterator outit = out.iterator();
		while (outit.hasNext()) {
			HashMap<Integer, String[]> inner = (HashMap<Integer, String[]>) outit
					.next();
			String keys = (String) outit.next();
			Set it = inner.keySet();
			Iterator init = it.iterator();
			while (init.hasNext()) {
				System.out.println("eeeee");

				int keys1 = (int) init.next();

				mySchedule.setSchdate(myformat.parse(innermap.get(keys1)[0]));
				mySchedule
						.setSchstarttime(Integer.parseInt(innermap.get(keys1)[1]));
				mySchedule.setSchfinishtime(Integer.parseInt((innermap
						.get(keys1)[2])));
				mySchedule.setId(null);
				mySchedule.setSchmaxno(Integer.parseInt(myForm
						.getFrmmaxpatient()));
				Hospital hosid = myHospitalDao.getHospitalById(Integer
						.parseInt(myForm.getFrmHosId()));
				Doctor did = myDoctorDao.getDesireDoctorById(Integer
						.parseInt(myForm.getFrmSpecId()));
				mySchedule.setHosid(hosid);
				mySchedule.setApppatientno(0);
				mySchedule.setDid(did);

				//myScheduleDao.saveAddSchedule(mySchedule);
				// }
			}// inner
		}// outer
*/
		// loop
	}

	public void getNewSchedule(AutoComplementForm myForm, Integer doctorid,
			Integer hospitalid) {
		List<Schedule> l = myScheduleDao.getSchedule(doctorid, hospitalid);

		myForm.setFrmScheduleList(l);

	}

	public void sendEmail(AutoComplementForm myForm, String doctoremail) {
		prepareForMail(myForm, doctoremail);
	}

	public void prepareForMail(AutoComplementForm myForm, String doctoremail) {
		String strFrom = "Omasadmin@ictti.site";
		String strSubject = "Please kindly see your new schedule here";
		String strContent = new String();
		try {
			VelocityEngine engine = new VelocityEngine();
			Properties properties = new Properties();
			properties.setProperty(VelocityEngine.RESOURCE_LOADER, "classpath");
			properties.setProperty("classpath."
					+ VelocityEngine.RESOURCE_LOADER + ".class",
					ClasspathResourceLoader.class.getName());
			engine.init(properties);
			// get template under the WEB-INF/src
			Template tm = engine.getTemplate("mailTemplate4.vm");
			VelocityContext vc = new VelocityContext();
			// Put job list

			vc.put("name", myForm.getFrmDocname().getDname());
			// Put today's date
			String today = new SimpleDateFormat("yyyy-MM-dd")
					.format(new Date()).toString();
			vc.put("today", today);

			vc.put("specializetype", myForm.getFrmspecname()
					.getSpecializetype());
			vc.put("hospital", myForm.getFrmhosname().getHosname());
			vc.put("maxschno", myForm.getFrmmaxpatient());

			List<Schedule> schlist = myForm.getFrmScheduleList();

			vc.put("schedulelist", schlist);

			StringWriter sw = new StringWriter();
			tm.merge(vc, sw);
			strContent = sw.toString();
			if (strContent != null) {
				// Create an email object
				MailConfig smtpMailSender = new MailConfig();
				smtpMailSender.sendToOne(doctoremail, strSubject, strContent,
						strFrom);
				myForm.setFrmRegmailMessage("Mail send successfully");
			} else {
				myForm.setFrmRegmailMessage("Mail cannot send because the message is null.");
			}
		} catch (Exception e) {
			myForm.setFrmRegmailMessage("Mail cannot send.");
		}
	}

	public List<Schedule> checkDuplicateSchedule(int did, int hid) {
		List<Schedule> slist = myScheduleDao.getSchedule(did, hid);
		return slist;

	}

}

package com.ictti.omas.business.service;

import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;

import com.ictti.omas.business.entity.Doctor;
import com.ictti.omas.business.entity.Schedule;
import com.ictti.omas.business.entity.ScheduleView;
import com.ictti.omas.dao.DoctorDao;
import com.ictti.omas.dao.ScheduleDao;
import com.ictti.omas.dao.ScheduleViewDao;
import com.ictti.omas.presentation.form.AdminUpdateScheduleForm;
import com.ictti.omas.presentation.form.AutoComplementForm;
import com.ictti.omas.presentation.form.ScheduleForm;
import com.ictti.omas.util.MailConfig;

public class AdminUpdateScheduleService {
	private DoctorDao myDoctorDao;
	private ScheduleDao myScheduleDao;
	private ScheduleViewDao myScheduleViewDao;

	public ScheduleViewDao getMyScheduleViewDao() {
		return myScheduleViewDao;
	}

	public void setMyScheduleViewDao(ScheduleViewDao myScheduleViewDao) {
		this.myScheduleViewDao = myScheduleViewDao;
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

	public void getDocname(AdminUpdateScheduleForm myForm) {

		Doctor doc = myDoctorDao.getDocNameByID(Integer.parseInt(myForm
				.getFrmSpecId()));

		myForm.setFrmdocname(doc);

	}

	public void getSchedule(AdminUpdateScheduleForm myForm, Integer doctorid,
			Integer hospitalid) {
		List<Schedule> l = myScheduleDao.getSchedule(doctorid, hospitalid);

		myForm.setFrmUpdateScheduleList(l);
	}

	public void firstLoadSearch(AdminUpdateScheduleForm myForm) {
		List<ScheduleView> l = myScheduleViewDao.getListAll();
		myForm.setFrmSchViewList(l);
		myForm.setFrmSchViewList(l);

		myForm.setActualPage(1);
		myForm.setIMaxData(l.size());
		myForm.setIMaxShow(2);
	}

	public void UpdateForSearch(AdminUpdateScheduleForm myForm) {

		ScheduleView mySchedule = myScheduleViewDao.getScheduleById(Integer
				.parseInt(myForm.getFrmUpdateScheduleId()));
		myForm.setFrmAppointmentDetail(mySchedule);

	}

	/*
	 * public void getSchMaxno (AdminUpdateScheduleForm myForm){ Schedule s =
	 * myScheduleDao
	 * .getScheduleById(Integer.parseInt(myForm.getFrmUpdateScheduleId())); int
	 * maxno=s.getSchmaxno(); System.out.println("Schmax no is======="+maxno);
	 * 
	 * 
	 * 
	 * }
	 */

	public void saveUpdateSchedule(AdminUpdateScheduleForm myForm) {
		Schedule sch = myScheduleDao.getScheduleById(Integer.parseInt(myForm
				.getFrmUpdateScheduleId()));
		sch.setId(Integer.parseInt(myForm.getFrmUpdateScheduleId()));

		sch.setSchstarttime(Integer.parseInt(myForm.getFrmFromTime()));
		sch.setSchfinishtime(Integer.parseInt(myForm.getFrmEndTime()));
		sch.setSchdate(sch.getSchdate());
		myScheduleDao.saveUpdateSchedule(sch);

	}

	public void sendEmail(AdminUpdateScheduleForm myForm, String doctoremail) {
		prepareForMail(myForm, doctoremail);
	}

	public void prepareForMail(AdminUpdateScheduleForm myForm,
			String doctoremail) {
		String strFrom = "Omasadmin@ictti.site";
		String strSubject = "Please kindly see your updated schedule here";
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
			Template tm = engine.getTemplate("mailTemplate3.vm");
			VelocityContext vc = new VelocityContext();
			// Put job list

			vc.put("name", myForm.getFrmAppointmentDetail().getDname());
			// Put today's date
			String today = new SimpleDateFormat("yyyy-MM-dd")
					.format(new Date()).toString();
			vc.put("today", today);

			vc.put("specializetype", myForm.getFrmAppointmentDetail()
					.getSpecializetype());
			vc.put("hospital", myForm.getFrmAppointmentDetail().getHosname());

			int maxno = myForm.getFrmUpdateScheduleList().get(0).getSchmaxno();

			vc.put("maxschno", maxno);
			vc.put("date", myForm.getFrmAppointmentDetail().getSchdate());
			vc.put("Starttime", myForm.getFrmFromTime());

			vc.put("Finishtime", myForm.getFrmEndTime());

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

}

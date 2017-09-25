package com.ictti.omas.business.service;

import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMessage;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;

import com.ictti.omas.util.MailConfig;
import com.ictti.omas.business.entity.Appointment;
import com.ictti.omas.business.entity.Doctor;
import com.ictti.omas.business.entity.Hospital;
import com.ictti.omas.business.entity.Patient;
import com.ictti.omas.business.entity.Rating;
import com.ictti.omas.business.entity.Schedule;
import com.ictti.omas.business.entity.ScheduleView;
import com.ictti.omas.business.entity.Specialize;

import com.ictti.omas.dao.AppointmentDao;
import com.ictti.omas.dao.DoctorDao;
import com.ictti.omas.dao.HospitalDao;
import com.ictti.omas.dao.PatientDao;
import com.ictti.omas.dao.RatingDao;
import com.ictti.omas.dao.ScheduleDao;
import com.ictti.omas.dao.ScheduleViewDao;

import com.ictti.omas.presentation.form.AutoComplementForm;
import com.ictti.omas.presentation.form.ScheduleForm;

public class ScheduleService {
	private ScheduleDao myScheduleDao;
	private ScheduleViewDao myScheduleViewDao;
	private AppointmentDao myAppointmentDao;
	private PatientDao myPatientDao;
	private HospitalDao myHospitalDao;
	private DoctorDao myDoctorDao;

	public DoctorDao getMyDoctorDao() {
		return myDoctorDao;
	}

	public void setMyDoctorDao(DoctorDao myDoctorDao) {
		this.myDoctorDao = myDoctorDao;
	}

	public HospitalDao getMyHospitalDao() {
		return myHospitalDao;
	}

	public void setMyHospitalDao(HospitalDao myHospitalDao) {
		this.myHospitalDao = myHospitalDao;
	}

	public PatientDao getMyPatientDao() {
		return myPatientDao;
	}

	public void setMyPatientDao(PatientDao myPatientDao) {
		this.myPatientDao = myPatientDao;
	}

	public AppointmentDao getMyAppointmentDao() {
		return myAppointmentDao;
	}

	public void setMyAppointmentDao(AppointmentDao myAppointmentDao) {
		this.myAppointmentDao = myAppointmentDao;
	}

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

	public List<Schedule> getScheduleByDid(Integer hospitalid, Integer doctorid) {
		List<Schedule> l = myScheduleDao.getSchedule(doctorid, hospitalid);

		return l.isEmpty() || l == null ? null : l;

	}

	public List<Schedule> getScheduleByDid(Integer doctorid) {
		List<Schedule> l = myScheduleDao.getScheduleByDid(doctorid);

		return l.isEmpty() || l == null ? null : l;

	}

	public void firstLoadSearch(ScheduleForm myForm) {
		List<ScheduleView> l = myScheduleViewDao.getListAll();
		myForm.setFrmSchViewList(l);

		myForm.setActualPage(1);
		myForm.setIMaxData(l.size());
		myForm.setIMaxShow(2);
	}

	public void bookForSearch(ScheduleForm myForm) {

		ScheduleView mySchedule = myScheduleViewDao.getScheduleById(Integer
				.parseInt(myForm.getFrmScheduleId()));
		myForm.setFrmAppointmentDetail(mySchedule);

	}

	public void getAppointById(ScheduleForm myForm) {
		Appointment myAppointment = myAppointmentDao.getAppointmentById(Integer
				.parseInt(myForm.getFrmScheduleId()));
		myForm.setFrmAppointment(myAppointment);

	}

	public void saveAppointment(ScheduleForm myForm, String tokenCode) {

		Appointment myAppointment = new Appointment();

		myAppointment.setId(null);
		myAppointment.setAppointmentdt(new Date());
		myAppointment.setStatus(1);
		myAppointment.setTokenno(tokenCode);
		Schedule s = myScheduleDao.getScheduleById(Integer.parseInt(myForm
				.getFrmScheduleId()));
		myAppointment.setSchid(s);

		myAppointment.setPid(myForm.getLoginPatient());

		myAppointmentDao.saveStatus(myAppointment);
	}

	public void saveMaxNumber(ScheduleForm myForm, int maxno) {

		Schedule s = myScheduleDao.getScheduleById(Integer.parseInt(myForm
				.getFrmScheduleId()));
		s.setSchmaxno(maxno);
		myScheduleDao.saveSchMaxNumber(s);

	}

	public void checkMaximumNumber(ScheduleForm myForm) {
		Schedule s = myScheduleDao.getScheduleById(Integer.parseInt(myForm
				.getFrmScheduleId()));
		int maxNo = s.getSchmaxno();
		myForm.setFrmMaxno(s.getSchmaxno().toString());

	}

	public void getTokenCode(ScheduleForm myForm, String hosid) {
		Schedule s = myScheduleDao.getScheduleById(Integer.parseInt(myForm
				.getFrmScheduleId()));

		Hospital h = myHospitalDao.getHosCode(Integer.parseInt(hosid));
		myForm.setHoscode(h.getHoscode());

		Schedule d = myScheduleDao.getDoctorById(s.getId());
		myForm.setDocid(d.getDid());

		Appointment a = myAppointmentDao.getAppointmentById(s.getId());

		myForm.setFrmapppatientNo(s.getApppatientno().toString());
		myForm.setFrmAppointment(a);

	}

	public void saveApppatientNo(ScheduleForm myForm, String schid,
			String patientno) {
		Schedule s = myScheduleDao.getScheduleById(Integer.parseInt(schid));
		s.setApppatientno(Integer.parseInt(patientno));
		// myAppointmentDao.getAppointmentById(s.getId());

		s.setId(Integer.parseInt(schid));
		s.setSchdate(s.getSchdate());
		s.setDid(s.getDid());
		s.setHosid(s.getHosid());
		s.setSchfinishtime(s.getSchfinishtime());
		s.setSchstarttime(s.getSchstarttime());
		s.setSchmaxno(s.getSchmaxno());

		myScheduleDao.saveApppatientNo(s);

	}

	public void sendEmail(ScheduleForm myForm, String patientemail) {
		prepareForMail(myForm, patientemail);
	}

	public void prepareForMail(ScheduleForm myForm, String patientemail) {
		String strFrom = "Omasadmin@ictti.site";
		String strSubject = "Please kindly see your token number here";
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
			Template tm = engine.getTemplate("mailTemplate2.vm");
			VelocityContext vc = new VelocityContext();
			// Put job list

			vc.put("name", myForm.getLoginPatient().getPname());
			// Put today's date
			String today = new SimpleDateFormat("yyyy-MM-dd")
					.format(new Date()).toString();
			vc.put("today", today);

			/* vc.put("tokenno", myForm.getFrmAppointment().getTokenno()); */
			vc.put("tokenno", myForm.getFrmtokenno());

			vc.put("docname", myForm.getFrmAppointmentDetail().getDname());
			vc.put("spefield", myForm.getFrmAppointmentDetail()
					.getSpecializetype());
			vc.put("hospital", myForm.getFrmAppointmentDetail().getHosname());
			vc.put("Starttime", myForm.getFrmAppointmentDetail()
					.getSchstarttime());
			vc.put("Finishtime", myForm.getFrmAppointmentDetail()
					.getSchfinishtime());

			vc.put("date", myForm.getFrmAppointmentDetail().getSchdate());
			// List<IcttiCourse> listCourse = myIcttiCourseDao.getAllCourse();
			// vc.put("cList", listCourse);
			StringWriter sw = new StringWriter();
			tm.merge(vc, sw);
			strContent = sw.toString();
			if (strContent != null) {
				// Create an email object
				MailConfig smtpMailSender = new MailConfig();
				smtpMailSender.sendToOne(patientemail, strSubject, strContent,
						strFrom);
				myForm.setFrmRegmailMessage("Mail send successfully");
			} else {
				myForm.setFrmRegmailMessage("Mail cannot send because the message is null.");
			}
		} catch (Exception e) {
			myForm.setFrmRegmailMessage("Mail cannot send.");
		}
	}

	public void getDocname(ScheduleForm myForm) {

		Doctor doc = myDoctorDao.getDocNameByID(Integer.parseInt(myForm
				.getFrmSpecId()));

		myForm.setFrmDocname(doc);

	}

	// for rating

	private RatingDao myRatingDao;

	public RatingDao getMyRatingDao() {
		return myRatingDao;
	}

	public void setMyRatingDao(RatingDao myRatingDao) {
		this.myRatingDao = myRatingDao;
	}

	public void checkAppointment(ScheduleForm myForm, int pid, int did) {
		Appointment ap = myAppointmentDao.getAppointBypid(pid, did);
		myForm.setAppRate(ap);

	}

	public Appointment getAppointment(ScheduleForm myForm, int pid) {
		Appointment myAppointment = myAppointmentDao.getAppointmentByIdAndPid(
				Integer.parseInt(myForm.getFrmScheduleId()), pid);
		myForm.setFrmAppointment(myAppointment);
		return myAppointment;
	}

	public void getRateValue(ScheduleForm myForm, int pid, int did) {
		Rating rate = myRatingDao.getRateValue(pid, did);
		myForm.setMyratingValue(rate);

	}

	public void insertRate(ScheduleForm myForm, int pid, int did) {

		Rating myRate = new Rating();
		myRate.setId(null);
		int x = Integer.parseInt(myForm.getRating());
		myRate.setRateValue(x);
		myRate.setDescription(myForm.getDescription());

		Patient mypid = myPatientDao.getPatientById(pid);
		System.out.print("Hello,I'm here!" + mypid);

		myRate.setPid(mypid);
		Doctor mydid = myDoctorDao.getDoctorById(did);
		myRate.setDid(mydid);
		// Integer.parseInt(myRateForm.getMypatientid())
		myRatingDao.saveRate(myRate);
		// TODO Auto-generated method stub

	}
}

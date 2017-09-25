package com.ictti.omas.business.service;

import java.io.StringWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;

import com.ictti.omas.util.MailConfig;
import com.ictti.omas.business.entity.Patient;
import com.ictti.omas.presentation.form.PatientForm;
import com.ictti.omas.business.service.PatientService;
import com.ictti.omas.dao.PatientDao;

public class PatientService {
	private PatientDao myPatientDao;

	public PatientDao getMyPatientDao() {
		return myPatientDao;
	}

	public void setMyPatientDao(PatientDao myPatientDao) {
		this.myPatientDao = myPatientDao;
	}

	public Patient getPatient(String email, String password) {
		return myPatientDao.getPatientByEmailAndPassword(email, password);
	}

	public void checkLoginPatient(PatientForm myForm) {
		Patient myPatient = myPatientDao.getPatientByEmailAndPassword(
				myForm.getFrmEmail(), myForm.getFrmPassword());
		myForm.setLoginPatient(myPatient);
	}

	public void firstLoadRegistration(PatientForm myForm) {
		myForm.setFrmRegAddress("");
		myForm.setFrmRegBlood("");
		myForm.setFrmRegDOB("");
		myForm.setFrmRegEmail("");
		myForm.setFrmRegGender("");
		myForm.setFrmRegName("");
		myForm.setFrmRegPassword("");
		myForm.setFrmRegConfPassword("");
		myForm.setFrmRegPhone("");
		myForm.setFrmRegFormControl(null);
	}

	public void checkEmail(PatientForm myForm) {
		Patient myPatient = myPatientDao.getPatientByEmail(myForm
				.getFrmRegEmail());
		if (myPatient != null) {
			myForm.setFrmRegEmailError(null);
			myForm.setFrmRegFormControl(null);

		} else {

			myForm.setFrmRegFormControl("data");
		}
	}

	public void saveNewPatient(PatientForm myForm) throws ParseException {
		Patient myPatient = new Patient();
		myPatient.setId(null);
		myPatient.setPname(myForm.getFrmRegName());
		myPatient.setPpwd(myForm.getFrmRegPassword());

		myPatient.setPemail(myForm.getFrmRegEmail());

		myPatient.setPaddress(myForm.getFrmRegAddress());
		// myPatient.setPphno(Integer.parseInt(myForm.getFrmRegPhone()));
		myPatient.setPphno(myForm.getFrmRegPhone());
		myPatient.setPgender(myForm.getFrmRegGender());

		// myPatient.setPdob(myForm.getFrmRegDOB());

		String dob = myForm.getFrmRegDOB();
		SimpleDateFormat myFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date dt = myFormat.parse(myForm.getFrmRegDOB());

		myPatient.setPdob(dt);

		// myPatient.setPdob(myFormat.parse(myForm.getFrmRegDOB()));
		myPatient.setPblood(myForm.getFrmRegBlood());
		myPatient.setPregdate(new Date());
		myPatient.setPstatus(1);
		myPatientDao.savePatient(myPatient);
		prepareForMail(myForm);
		// mail sent process
	}

	public void prepareForMail(PatientForm myForm) {
		String strFrom = "Omasadmin@ictti.site";
		String strSubject = "Registration successful message";
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
			Template tm = engine.getTemplate("mailTemplate.vm");
			VelocityContext vc = new VelocityContext();
			// Put job list

			vc.put("name", myForm.getFrmRegEmail());
			// Put today's date
			String today = new SimpleDateFormat("yyyy-MM-dd")
					.format(new Date()).toString();
			vc.put("today", today);
			vc.put("email", myForm.getFrmRegEmail());
			System.out.println(myForm.getFrmRegEmail());
			vc.put("password", myForm.getFrmRegPassword());
			// List<IcttiCourse> listCourse = myIcttiCourseDao.getAllCourse();
			// vc.put("cList", listCourse);
			StringWriter sw = new StringWriter();
			tm.merge(vc, sw);
			strContent = sw.toString();
			if (strContent != null) {

				MailConfig smtpMailSender = new MailConfig();
				smtpMailSender.sendToOne(myForm.getFrmRegEmail(), strSubject,
						strContent, strFrom);
				myForm.setFrmRegmailMessage("Mail send successfully");
			} else {
				myForm.setFrmRegmailMessage("Mail cannot send because the message is null.");
			}
		} catch (Exception e) {
			myForm.setFrmRegmailMessage("Mail cannot send.");
		}
	}

	public void fristLoadUpdateProfile(PatientForm myForm) {
		Patient myLoginPatient = myForm.getLoginPatient();
		myForm.setFrmRegName(myLoginPatient.getPname());
		myForm.setFrmRegEmail(myLoginPatient.getPemail());
		myForm.setFrmRegAddress(myLoginPatient.getPaddress());
		myForm.setFrmRegConfPassword(myLoginPatient.getPpwd());
		myForm.setFrmRegBlood(myLoginPatient.getPblood());
		myForm.setFrmRegGender(myLoginPatient.getPgender());
		myForm.setFrmRegDOB(myLoginPatient.getPdob().toString());
		myForm.setFrmRegPassword(myLoginPatient.getPpwd());
		myForm.setFrmRegPhone(myLoginPatient.getPphno());
		myForm.setFrmRegFormControl(null);

	}

	public void saveUpdatePatient(PatientForm myForm) {
		Patient myPatient = myForm.getLoginPatient();
		myPatient.setPaddress(myForm.getFrmRegAddress());
		myPatient.setPphno(myForm.getFrmRegPhone());
		myPatient.setPname(myForm.getFrmRegName());
		myPatient.setPpwd(myForm.getFrmRegPassword());

		myPatientDao.savePatient(myPatient);
	}

}

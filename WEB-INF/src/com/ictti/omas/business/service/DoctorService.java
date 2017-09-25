package com.ictti.omas.business.service;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.sql.Blob;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import org.apache.struts.upload.FormFile;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;
import org.hibernate.Hibernate;

import com.ictti.omas.business.entity.Doctor;
import com.ictti.omas.business.entity.Doctordegree;
import com.ictti.omas.business.entity.Rating;
import com.ictti.omas.business.entity.Specialize;
import com.ictti.omas.dao.DoctorDao;
import com.ictti.omas.dao.DoctorDegreeDao;
import com.ictti.omas.dao.RatingDao;
import com.ictti.omas.dao.SpecializeDao;
import com.ictti.omas.presentation.form.DoctorForm;
import com.ictti.omas.util.MailConfig;

public class DoctorService {

	private DoctorDao mySearchTreatmentDao;

	public DoctorDao getMySearchTreatmentDao() {
		return mySearchTreatmentDao;
	}

	public void setMySearchTreatmentDao(DoctorDao mySearchTreatmentDao) {
		this.mySearchTreatmentDao = mySearchTreatmentDao;
	}

	private DoctorDao myDoctorDao;
	private SpecializeDao mySpecializeDao;
	private DoctorDegreeDao myDoctorDegreeDao;

	public DoctorDegreeDao getMyDoctorDegreeDao() {
		return myDoctorDegreeDao;
	}

	public void setMyDoctorDegreeDao(DoctorDegreeDao myDoctorDegreeDao) {
		this.myDoctorDegreeDao = myDoctorDegreeDao;
	}

	public SpecializeDao getMySpecializeDao() {
		return mySpecializeDao;
	}

	public void setMySpecializeDao(SpecializeDao mySpecializeDao) {
		this.mySpecializeDao = mySpecializeDao;
	}

	public DoctorDao getMyDoctorDao() {
		return myDoctorDao;
	}

	public void setMyDoctorDao(DoctorDao myDoctorDao) {
		this.myDoctorDao = myDoctorDao;
	}

	/********* patient ajax ***********/
	public List<Doctor> findDoctorByLikeFromService(String a_strName) {

		System.out.println("call fun:");
		List<Doctor> l = mySearchTreatmentDao.getDoctorListByName(a_strName);
		return l;
	}

	/********* patient ajax ***********/

	/******* doctor register **************/

	public void checkDoctorEmail(DoctorForm myForm) {
		Doctor myDoctor = myDoctorDao.getDoctorByDoctorEmail(myForm
				.getFrmRegEmail());

		if (myDoctor != null) {

			myForm.setFrmRegDoctorEmailError(null);
			myForm.setFrmRegFormControl(null);
		} else {
			Specialize mySpecialize = mySpecializeDao.getSpecializeById(Integer
					.parseInt(myForm.getFrmRegSpecializeId()));
			myForm.setFrmRegSpecialize(mySpecialize.getSpecializetype());

			myForm.setFrmRegFormControl("data");
		}
	}

	public void firstLoadRegistration(DoctorForm myForm) {
		List<Specialize> l = mySpecializeDao.getAllSpecialize();
		myForm.setFrmRegSpecializeList(l);
		myForm.setFrmRegSpecializeId("0");

		myForm.setFrmRegSpecialize("");
		myForm.setFrmRegName("");
		myForm.setFrmRegAddress("");
		myForm.setFrmRegConfPassword("");
		myForm.setFrmRegEmail("");
		// myForm.setFrmRegName("");
		myForm.setFrmRegPassword("");
		// myForm.setFrmRegPhone("");
		myForm.setFrmadminRegPhone("");
		myForm.setFrmRegGender("");
		myForm.setFrmRegFormControl(null);
	}

	public void saveDoctor(DoctorForm myForm) {
		Doctor myDoctor = new Doctor();
		myDoctor.setId(null);
		myDoctor.setDname(myForm.getFrmRegName());
		myDoctor.setDemail(myForm.getFrmRegEmail());
		myDoctor.setDpwd(myForm.getFrmRegPassword());
		myDoctor.setDaddress(myForm.getFrmRegAddress());
		// myDoctor.setDphno(myForm.getFrmRegPhone());
		myDoctor.setDphno(myForm.getFrmadminRegPhone());

		myDoctor.setDgender(myForm.getFrmRegGender());
		myDoctor.setDregdate(new Date());
		myDoctor.setDstatus(1);
		Specialize mySpecialize = mySpecializeDao.getSpecializeById(Integer
				.parseInt(myForm.getFrmRegSpecializeId()));
		myDoctor.setSpid(mySpecialize);

		myDoctorDao.saveDoctor(myDoctor);
		/* myDoctorDao.getDoctorID(myDoctor) */;

	/*	FileOutputStream outputStream = null;
		FormFile formFile = myForm.getFrmUploadFile();
		Blob bfile;
		Doctordegree myDoctorDegree = new Doctordegree();
		try {
			String fst = formFile.getFileName().trim();
			String degree=fst.replaceAll(".jpg+$", "");
			bfile = Hibernate.createBlob(formFile.getInputStream());
			myDoctorDegree.setId(null);
			myDoctorDegree.setCertificateimg(bfile);
			myDoctorDegree.setDegreename(degree);
			myDoctorDegree.setDid(myDoctor);

			myDoctorDegreeDao.saveDoctorDegree(myDoctorDegree);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
*/
	}

	public void lastDoctrid(DoctorForm myForm) {
		Doctor myDoctor = myDoctorDao.getDoctorId();

		myForm.setFrmDoctorID(myDoctor);
	}

	/*public void saveDoctordegree(DoctorForm myForm) {

		Doctor myDoctor = new Doctor();
		myDoctor.getId();

		myForm.getFrmDoctorID();
		System.out.println("ID" + myForm.getFrmDoctorID());

		FileOutputStream outputStream = null;
		FormFile formFile = myForm.getFrmUploadFile();
		Blob bfile;
		Doctordegree myDoctorDegree = new Doctordegree();
		try {
			String fst = formFile.getFileName().trim();
			System.out.println("^^^^^^^^^"+fst);
			//String degree=fst.replaceAll(".jpg+$", "");
			//System.out.println("****doctor degree "+degree);
			String degree=fst.replaceAll(".jpg+$", "");
			bfile = Hibernate.createBlob(formFile.getInputStream());
			myDoctorDegree.setId(null);
			myDoctorDegree.setCertificateimg(bfile);
			myDoctorDegree.setDegreename(degree);
			myDoctorDegree.setDid(myForm.getFrmDoctorID());

			myDoctorDegreeDao.saveDoctorDegree(myDoctorDegree);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		*//******* doctor register **************//*

	}
*/
	
	public void saveDoctordegree(DoctorForm myForm) {

		Doctor myDoctor = new Doctor();
		myDoctor.getId();

		myForm.getFrmDoctorID();
		System.out.println("ID" + myForm.getFrmDoctorID());

		FileOutputStream outputStream = null;
		FormFile formFile = myForm.getFrmUploadFile();
		Blob bfile;
		Doctordegree myDoctorDegree = new Doctordegree();
		try {
			String fst = formFile.getFileName().trim();
			/*System.out.println("^^^^^^^^^"+fst);
			String degree=fst.replaceAll(".jpg+$", "");*/
			/*System.out.println("****doctor degree "+degree);
			String degree1=fst.replaceAll(".jpg+$", "");*/
			
			String degree=fst.substring(0,fst.lastIndexOf("."));
			bfile = Hibernate.createBlob(formFile.getInputStream());
			myDoctorDegree.setId(null);
			myDoctorDegree.setCertificateimg(bfile);
			myDoctorDegree.setDegreename(degree);
			myDoctorDegree.setDid(myForm.getFrmDoctorID());

			myDoctorDegreeDao.saveDoctorDegree(myDoctorDegree);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void sendEmail(DoctorForm myForm, String doctoremail) {
		prepareForMail(myForm, doctoremail);
	}

	public void prepareForMail(DoctorForm myForm, String doctoremail) {
		String strFrom = "Omasadmin@ictti.site";
		String strSubject = "Doctor Registration successful message";
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
			Template tm = engine.getTemplate("mailTemplate5.vm");
			VelocityContext vc = new VelocityContext();
			// Put job list

			vc.put("name", myForm.getFrmRegEmail());
			// Put today's date
			String today = new SimpleDateFormat("yyyy-MM-dd")
					.format(new Date()).toString();
			vc.put("today", today);
			vc.put("email", myForm.getFrmRegEmail());

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

	public void checkLoginDoctor(DoctorForm myForm) {
		System.out.println("aaaaaaaaaa");
		 Doctor myDoctor = myDoctorDao.getDoctorByEmailAndPassword(myForm.getFrmEmail(),myForm.getFrmPassword());						
			myForm.setLoginDoctor(myDoctor);
		
	}
	
	// for rating............

	private RatingDao myRatingDao;
	
	
		public RatingDao getMyRatingDao() {
		return myRatingDao;
	}

	public void setMyRatingDao(RatingDao myRatingDao) {
		this.myRatingDao = myRatingDao;
	}

		public void myDrateValue(DoctorForm myForm, int did) {
			List<Rating> myRatevalue = myRatingDao.getDrateValue(did);		
			myForm.setMydrateValue(myRatevalue);	
			// TODO Auto-generated method stub
			
		}
		
		
//Doctor Update Profile
		public void fristLoadUpdateProfile(DoctorForm myForm) {
			Doctor myLoginDoctor = myForm.getLoginDoctor();
			myForm.setFrmRegName(myLoginDoctor.getDname());
			myForm.setFrmEmail(myLoginDoctor.getDemail());
		
			
			myForm.setFrmPassword(myLoginDoctor.getDpwd());
			myForm.setFrmRegEmail(myLoginDoctor.getDemail());
			myForm.setFrmRegPassword(myLoginDoctor.getDpwd());
			myForm.setFrmRegConfPassword(myLoginDoctor.getDpwd());
			myForm.setFrmGender(myLoginDoctor.getDgender());
			myForm.setFrmRegSpecializeName(myLoginDoctor.getSpid().getSpecializetype());
			myForm.setFrmRegPhone(myLoginDoctor.getDphno());
			myForm.setFrmRegAddress(myLoginDoctor.getDaddress());
			myForm.setFrmRegFormControl(null);		
				
				
		}

		

		public void saveUpdateDoctor(DoctorForm myForm) {
			Doctor myDoctor=myForm.getLoginDoctor();
			myDoctor.setDaddress(myForm.getFrmRegAddress());
			myDoctor.setDemail(myForm.getFrmEmail());
			myDoctor.setDgender(myForm.getFrmGender());
			myDoctor.setDname(myForm.getFrmRegName());
			myDoctor.setDphno(myForm.getFrmRegPhone());
			myDoctor.setDpwd(myForm.getFrmRegPassword());
			myDoctorDao.saveDoctor(myDoctor);
			// TODO Auto-generated method stub
			
		}
		
		public void checkDid(DoctorForm myForm) {
			Doctordegree myDoctorDegree = myDoctorDegreeDao.getDidInDoctorDegree(myForm
					.getFrmDoctorID());
			
			myForm.setFrmErrorDID(myDoctorDegree);
		}

}

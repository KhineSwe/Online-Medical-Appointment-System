package com.ictti.omas.business.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;



import com.ictti.omas.business.entity.Appointment;
import com.ictti.omas.business.entity.AppointmentlistView;
import com.ictti.omas.business.entity.Doctor;
import com.ictti.omas.business.entity.Hospital;
import com.ictti.omas.business.entity.Schedule;
import com.ictti.omas.business.entity.Specialize;
import com.ictti.omas.business.entity.Treatment;
import com.ictti.omas.dao.AppointmentlistDao;
import com.ictti.omas.dao.DoctorDao;
import com.ictti.omas.dao.HospitalDao;
import com.ictti.omas.dao.ScheduleDao;
import com.ictti.omas.presentation.form.AppointmentlistForm;



public class AppointmentlistService {

	private AppointmentlistDao myAppointmentlistDao;
	
private HospitalDao myHospitalDao;
private DoctorDao myDoctorDao;
private ScheduleDao myScheduleDao;
	


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

	public HospitalDao getMyHospitalDao() {
	return myHospitalDao;
}

public void setMyHospitalDao(HospitalDao myHospitalDao) {
	this.myHospitalDao = myHospitalDao;
}

	public AppointmentlistDao getMyAppointmentlistDao() {
		return myAppointmentlistDao;
	}

	public void setMyAppointmentlistDao(AppointmentlistDao myAppointmentlistDao) {
		this.myAppointmentlistDao = myAppointmentlistDao;
	}

	
	public void firstLoadAppointmentlist(AppointmentlistForm myForm) {
		// TODO Auto-generated method stub
		List<AppointmentlistView> l = myAppointmentlistDao.getAppointListALL();
		if (l == null) {
			System.out.println("no list");
			myForm.setFrmAppointList(l);
			myForm.setIMaxData(0);
		} else {

			myForm.setFrmAppointList(l);
			myForm.setActualPage(1);
			myForm.setIMaxData(l.size());
			myForm.setIMaxShow(5);
		}
		
		List<Hospital> l1 = myHospitalDao.getAllHospital();
		
		myForm.setFrmHosList(l1);
		
List<Doctor> l2 = myDoctorDao.getAllDoctor();
		
		myForm.setFrmDoctorList(l2);
		
		

	}
	

	
	public void firstLoadSearchAppointmentlist(AppointmentlistForm myForm,
			int hosid, int did) {
		// TODO Auto-generated method stub
		System.out.println("hosid is " + hosid + "did is" + did);
		Hospital h = myHospitalDao.getHospitalById(hosid);
		Doctor d = myDoctorDao.getDoctorId(did);

		myForm.setFrmHospital(h);
		System.out.println("@@@@@@@" + myForm.getFrmHospital().getHosname());

		System.out.println("......." + h.getHosname());

		String hosname = h.getHosname();
		String dname = d.getDname();
		System.out.println("hosname is " + hosname + "dname is" + dname);
		List<AppointmentlistView> l = myAppointmentlistDao
				.getSearchAppointListALL(hosname, dname);
		if (l == null) {
			System.out.println("no list");
			myForm.setFrmSearchAppointmentlist(l);
			myForm.setIMaxData(0);
		} else {

			myForm.setFrmSearchAppointmentlist(l);
			myForm.setActualPage(1);
			myForm.setIMaxData(l.size());
			myForm.setIMaxShow(5);
		}

		List<Hospital> l1 = myHospitalDao.getAllHospital();

		myForm.setFrmHosList(l1);

		List<Doctor> l2 = myDoctorDao.getAllDoctor();

		myForm.setFrmDoctorList(l2);

	}

	public void getDoctorNamebyId(AppointmentlistForm myForm, int did) {
		Doctor d = myDoctorDao.getDoctorId(did);
		myForm.setFrmDoctor(d);

		// TODO Auto-generated method stub

	}

	public void detailForAppointSearch(AppointmentlistForm myForm,
			String hosname, String dname) throws ParseException {

		SimpleDateFormat myformat = new SimpleDateFormat("yyyy-MM-dd");
		Date schdate = myformat.parse(myForm.getFrmschdate());

		System.out.println("hosname is " + hosname + "dname is" + dname);
		List<AppointmentlistView> l = myAppointmentlistDao
				.getDetailAppointListALL(hosname, dname, schdate);
		if (l == null) {
			System.out.println("no list");
			myForm.setFrmAppointListAll(l);
			myForm.setIMaxData(0);
		} else {

			myForm.setFrmAppointListAll(l);
			myForm.setActualPage(1);
			myForm.setIMaxData(l.size());
			myForm.setIMaxShow(5);
		}
		
		System.out.println(myForm.getFrmAppointListAll());
	}

	public void CheckHospitalAndDoctor(AppointmentlistForm myForm, int hosid,
			int did) {

		System.out.println("HERE OK");
		System.out.println(hosid + "HERE OK");

		Schedule sch = myScheduleDao.getHosptialNDoctor(hosid, did);
		myForm.setFrmHNDList(sch);

	}



}


	

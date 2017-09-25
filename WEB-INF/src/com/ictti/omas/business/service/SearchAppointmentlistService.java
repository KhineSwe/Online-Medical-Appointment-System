package com.ictti.omas.business.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.ictti.omas.business.entity.AppointmentlistView;
import com.ictti.omas.business.entity.Doctor;
import com.ictti.omas.business.entity.Hospital;
import com.ictti.omas.business.entity.Schedule;
import com.ictti.omas.dao.AppointmentlistDao;
import com.ictti.omas.dao.DoctorDao;
import com.ictti.omas.dao.HospitalDao;
import com.ictti.omas.dao.ScheduleDao;
import com.ictti.omas.presentation.form.AppointmentlistForm;

public class SearchAppointmentlistService {

	private AppointmentlistDao myAppointmentlistDao;
	private ScheduleDao myScheduleDao;

	public ScheduleDao getMyScheduleDao() {
		return myScheduleDao;
	}

	public void setMyScheduleDao(ScheduleDao myScheduleDao) {
		this.myScheduleDao = myScheduleDao;
	}

	public AppointmentlistDao getMyAppointmentlistDao() {
		return myAppointmentlistDao;
	}

	public void setMyAppointmentlistDao(AppointmentlistDao myAppointmentlistDao) {
		this.myAppointmentlistDao = myAppointmentlistDao;
	}

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


}

package com.ictti.omas.business.service;

import java.util.Date;
import java.util.List;

import com.ictti.omas.business.entity.AppointView;
import com.ictti.omas.business.entity.Appointment;
import com.ictti.omas.business.entity.Treatment;
import com.ictti.omas.dao.AppointViewDao;
import com.ictti.omas.dao.AppointmentDao;
import com.ictti.omas.dao.TreatmentDao;
import com.ictti.omas.presentation.form.AppointHospitalForm;
import com.ictti.omas.presentation.form.RecordTreatmentForm;


public class AppointHospService {

	private AppointViewDao myAppointViewDao;
	private AppointmentDao myAppointmentDao;
	private TreatmentDao myTreatmentDao;

	public TreatmentDao getMyTreatmentDao() {
		return myTreatmentDao;
	}

	public void setMyTreatmentDao(TreatmentDao myTreatmentDao) {
		this.myTreatmentDao = myTreatmentDao;
	}

	public AppointmentDao getMyAppointmentDao() {
		return myAppointmentDao;
	}

	public void setMyAppointmentDao(AppointmentDao myAppointmentDao) {
		this.myAppointmentDao = myAppointmentDao;
	}

	public AppointViewDao getMyAppointViewDao() {
		return myAppointViewDao;
	}

	public void setMyAppointViewDao(AppointViewDao myAppointViewDao) {
		this.myAppointViewDao = myAppointViewDao;
	}

	public void firstLoadSearch(AppointHospitalForm myForm, String demail) {
		// TODO Auto-generated method stub
		List<AppointView> l = myAppointViewDao.getHospitalListALL(demail);

		if (l == null) {
			System.out.println("no list");
			myForm.setFrmHospitalList(l);
			myForm.setIMaxData(0);
		} else {
			myForm.setFrmHospitalList(l);
			myForm.setActualPage(1);
			myForm.setIMaxData(l.size());
			myForm.setIMaxShow(5);
		}

	}

	public void detailForSearch(AppointHospitalForm myForm, String hosname) {

		AppointView myHospital = myAppointViewDao.getHospitalById((myForm
				.getFrmDetailHospitalId()));
		myForm.setFrmHospitalListDetail(myHospital);

	}

	public void firstLoadAppointSearch(AppointHospitalForm myForm,
			String hosname,String demail) {
		// TODO Auto-generated method stub
		
		List<AppointView> l = myAppointViewDao.getAppointListALL(hosname,demail);
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

	}

	public void detailForAppointSearch(AppointHospitalForm myForm, String appId) {

		/*
		 * AppointView myHospital = myAppointViewDao.getHospitalById(Integer
		 * .parseInt(myForm.getFrmDetailHospitalId()));
		 */

		AppointView myAppointment = myAppointViewDao.getAppointmentById(Integer
				.parseInt(appId));
		myForm.setFrmAppointmentListDetail(myAppointment);

	}

	

	public void saveTreatment(AppointHospitalForm myForm,int appid) {
		Treatment myTreatment = new Treatment();
		myTreatment.setId(null);
		myTreatment.setDisease(myForm.getFrmDisease());
		myTreatment.setDnote(myForm.getFrmDenote());
		myTreatment.setTreatment(myForm.getFrmTreatment());
		myTreatment.setTreatmentdt(new Date());
		System.out.println(myForm.getAppId());
		Appointment p = myAppointmentDao.getAppointmentbyId(appid);
		myTreatment.setAppointmentid(p);
		myTreatmentDao.saveNewTreatment(myTreatment);
	}

	public void getAppointById(AppointHospitalForm myForm, String appId) {
		Appointment myAppointment = myAppointmentDao.getAppointmentbyId(Integer
				.parseInt(appId));
		myForm.setFrmAppointment(myAppointment);
		

	}

	public void saveAppointStatus(AppointHospitalForm myForm) {
		Appointment myAppointment = new Appointment();
		myAppointment.setAppointmentdt(myForm.getFrmAppointment()
				.getAppointmentdt());
		myAppointment.setId(myForm.getFrmAppointment().getId());
		myAppointment.setPid(myForm.getFrmAppointment().getPid());
		myAppointment.setSchid(myForm.getFrmAppointment().getSchid());
		myAppointment.setStatus(2);
		myAppointmentDao.saveStatus(myAppointment);
	

	}

	public void getNoofPatientByhosname(AppointHospitalForm myForm,
			String demail,String hosname) {
		List<AppointView> l = myAppointViewDao.getPatientByhosnameList(demail,hosname);
		myForm.setFrmPatientByhosname(l);
		// TODO Auto-generated method stub
		
	}


	
}

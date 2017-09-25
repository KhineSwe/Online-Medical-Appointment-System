package com.ictti.omas.dao;

import java.util.List;

import com.ictti.omas.business.entity.AppointView;
import com.ictti.omas.business.entity.TreatmentView;



public interface AppointViewDao {

	List<AppointView> getHospitalListALL(String demail);
	
/*	public AppointView getHospitalById(Integer hosid);*/
	
	public AppointView getHospitalById(String hosname);
	
	
	List<AppointView> getAppointListALL(String hosname,String demail);
	
	public AppointView getAppointmentById(Integer appId);

	List<AppointView> getPatientByhosnameList(String demai,String hosname);

}

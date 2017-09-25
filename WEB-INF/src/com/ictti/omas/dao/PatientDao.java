package com.ictti.omas.dao;

import java.util.List;

import com.ictti.omas.business.entity.Patient;
import com.ictti.omas.business.entity.PatientappointmentlistView;

public interface PatientDao {
	//for patientlogin
	public Patient getPatientByEmailAndPassword(String strEmail,
			String strPassword);
	
	public Patient getPatientByEmail(String email);
	
	public void savePatient(Patient patient);
	
	
	//for admin's patient
	
	public List<Patient> getPatientListByName(String pname);
	public List<Patient> getPatientListAll();
	public Patient getPatientById(Integer patientId);
	
	

	public List<Patient> getPatientNameListAll(String pname);
	public Patient getPatientNameById(Integer patientId);
	public void savePatientStatus(Patient myPatient);
	public List<PatientappointmentlistView> getAppointmentList(int pid);
	
	public List<Patient> getDuration(int pid);
	
	
	

}

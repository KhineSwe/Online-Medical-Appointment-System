package com.ictti.omas.dao;

import java.util.List;

import com.ictti.omas.business.entity.Doctor;

public interface DoctorDao {

	
	/**** patient *******/
	public List<Doctor> getDoctorListByName(String strName);
	public List<Doctor> getDoctorlistById(int specializeid);

	public List<Doctor> getDoctorById(Integer specializeid);
	public Doctor getDesireDoctorById(Integer specializeid);

	public Doctor getDocNameByID(int schid);
	
	
	
	public Doctor getDoctorById(int did);

	public void changeStatus(Doctor d);

	public List<Doctor> getDateDuration(int did);
	
	
	public Doctor getDoctorBydoctorid(int did);
	
	
	public List<Doctor> getDocById(Integer specializeid);
	
	/****  end patient *******/
	
	
	
	/**** doctor register*******/
	public Doctor getDoctorByDoctorEmail(String strDocName);


	public void saveDoctor(Doctor dos);
	
	

	public Doctor getDoctorId();
	
	public List<Doctor> getAllDoctor();
	
	/**** end doctor register*******/
	public Doctor getDoctorId(int did);

	public Doctor getDoctorByEmailAndPassword(String frmEmail,
			String frmPassword);

	
	
	
}

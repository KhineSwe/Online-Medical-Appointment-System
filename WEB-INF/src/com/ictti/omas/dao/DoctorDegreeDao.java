package com.ictti.omas.dao;

import java.util.List;

import com.ictti.omas.business.entity.Doctor;
import com.ictti.omas.business.entity.Doctordegree;

public interface DoctorDegreeDao {
	public Doctordegree getDegreeByDoctorId(int did);
	
	public Doctordegree getDidInDoctorDegree(Doctor frmDoctorID);
	
	public void saveDoctorDegree(Doctordegree degree);


}

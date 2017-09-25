package com.ictti.omas.dao;

import java.util.List;

import com.ictti.omas.business.entity.Hospital;

public interface HospitalDao {

	List<Hospital> getAllHospital();

	public Hospital getHospitalById(int hosid);

	public Hospital getHosCode(int hosid);

	public Hospital getHospitalByHospitalName(String strHosName);

	public void saveHospital(Hospital hos);

	public List<Hospital> getHospitalListAll();

	public Hospital getHospitalById(Integer hospitalId);

	public List<Hospital> getHospitalListByName(String strName);

	
	//public Hospital getHosId(String hos_name);
	
	
	




}

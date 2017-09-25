package com.ictti.omas.dao;

import java.util.List;

import com.ictti.omas.business.entity.HosSpec;
import com.ictti.omas.business.entity.Hospital;
import com.ictti.omas.business.entity.Specialize;

public interface AddSpecializeDao {

	List<Hospital> getAllHospital();

	public Hospital getHospitalById(int hosid);

	public void saveNewSpecialize(Specialize sp);

	public List<Specialize> getSpecializeListAll();

	public void saveSpecializetoHos(HosSpec hosp);

	public Specialize getSpecializeByid(int parseInt);

	Specialize getSpecializeByName(String specType);

	List<HosSpec> getSpecializeByhosid(int hosid);
	
	public HosSpec getDupSpe(int spid,int hosid);

}

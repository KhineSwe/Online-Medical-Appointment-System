package com.ictti.omas.dao;

import java.util.List;

import com.ictti.omas.business.entity.HosSpec;
import com.ictti.omas.business.entity.Schedule;
import com.ictti.omas.business.entity.Specialize;

public interface SpecializeDao {


	public List<Specialize> getSpecializeListByName(String strName);
	
	//public Specialize getSpecNameByID(int specid);
	public HosSpec getSpecNameByID(int hspid);
	
	
	
	
	public List<Specialize> getAllSpecialize();
	public Specialize getSpecializeById(Integer id);
	public void saveUpdateSpecialize(Specialize spe);
	public HosSpec getSpecById(int hsid);

	

	


}

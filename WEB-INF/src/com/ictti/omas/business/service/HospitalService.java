package com.ictti.omas.business.service;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Blob;
import java.util.List;

import org.apache.struts.upload.FormFile;
import org.hibernate.Hibernate;

import com.ictti.omas.business.entity.Hospital;
import com.ictti.omas.dao.HospitalDao;
import com.ictti.omas.presentation.form.HospitalForm;
import com.ictti.omas.presentation.form.HospitalUpdateForm;

public class HospitalService {

	private HospitalDao mySearchTreatmentDao;
	private HospitalDao myHosptialDao;

	public HospitalDao getMySearchTreatmentDao() {
		return mySearchTreatmentDao;
	}

	public void setMySearchTreatmentDao(HospitalDao mySearchTreatmentDao) {
		this.mySearchTreatmentDao = mySearchTreatmentDao;
	}
	


	public HospitalDao getMyHosptialDao() {
		return myHosptialDao;
	}

	public void setMyHosptialDao(HospitalDao myHosptialDao) {
		this.myHosptialDao = myHosptialDao;
	}

	public void checkHospitalName(HospitalForm myForm) {
		Hospital myHospital = myHosptialDao.getHospitalByHospitalName(myForm
				.getFrmRegName());

		if (myHospital != null) {

			myForm.setFrmRegHospitalNameError(null);
			myForm.setFrmRegFormControl(null);
		} else {
			myForm.setFrmRegFormControl("data");
		}
	}

	

	public void firstLoadRegistration(HospitalForm myForm) {
		myForm.setFrmRegName("");
		myForm.setFrmRegAddress("");
	
		myForm.setFrmRegFormControl(null);
	}

	public void saveHospital(HospitalForm myForm) {

	
	
		
		Hospital myHospital = new Hospital();
	
			
			String hosname=myForm.getFrmRegName();
			String[] split = hosname.split(" ");
			String hoscode = split[0];

			myHospital.setId(null);
			myHospital.setHosname(myForm.getFrmRegName());
			myHospital.setHosaddress(myForm.getFrmRegAddress());
			myHospital.setHoscode(hoscode);
			myHosptialDao.saveHospital(myHospital);
		
		

	}

	public void firstLoadSearch(HospitalUpdateForm myForm) {
		List<Hospital> l = myHosptialDao.getHospitalListAll();
		myForm.setFrmHospitalList(l);
		// set the first page
		myForm.setActualPage(1);
		// set the maximum size of the result list
		myForm.setIMaxData(l.size());
		// set the maximum size to show the current page
		myForm.setIMaxShow(5);
	}

	public void detailForSearch(HospitalUpdateForm myForm) {
		Hospital myHospital = myHosptialDao.getHospitalById(Integer
				.parseInt(myForm.getFrmDetailHospitalId()));
		myForm.setFrmHospitalDetail(myHospital);
	}

	


	public void firstLoadHospital(HospitalUpdateForm myForm) {
		
		Hospital myHospital = myHosptialDao.getHospitalById(Integer
				.parseInt(myForm.getFrmUpdateHospitalId()));
		
		
		
		myForm.setFrmHospName(myHospital.getHosname());
		myForm.setFrmHospAddress(myHospital.getHosaddress());
		myForm.setFrmControl(null);


		// TODO Auto-generated method stub
		
	}
	public void saveUpdateHospital(HospitalUpdateForm myForm) {
		Hospital myHospital=myHosptialDao.getHospitalById(Integer
				.parseInt(myForm.getFrmUpdateHospitalId()));
		myHospital.setId(myHospital.getId());
		myHospital.setHosname(myForm.getFrmHospName());
		myHospital.setHosaddress(myForm.getFrmHospAddress());
		myHosptialDao.saveHospital(myHospital);
		// TODO Auto-generated method stub
		
		
		
	}
	

	public List<Hospital> findHospitalByLikeFromService(String a_strName) {

		System.out.println("call fun:");
		List<Hospital> l = mySearchTreatmentDao
				.getHospitalListByName(a_strName);
		return l.isEmpty() || l == null ? null : l;
	}

}

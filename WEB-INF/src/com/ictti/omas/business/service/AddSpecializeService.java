package com.ictti.omas.business.service;

import java.util.List;

import com.ictti.omas.business.entity.HosSpec;
import com.ictti.omas.business.entity.Hospital;

import com.ictti.omas.business.entity.Specialize;
import com.ictti.omas.dao.AddSpecializeDao;
import com.ictti.omas.presentation.form.AddspForm;

public class AddSpecializeService {

	private AddSpecializeDao myAddspDao;

	public AddSpecializeDao getMyAddspDao() {
		return myAddspDao;
	}

	public void setMyAddspDao(AddSpecializeDao myAddspDao) {
		this.myAddspDao = myAddspDao;
	}

	public void getHosname(AddspForm myForm) {
		Hospital h = myAddspDao.getHospitalById(Integer.parseInt(myForm
				.getFrmHosId()));
		myForm.setFrmhosname(h);

	}

	public List<Hospital> getAllHospital() {
		List<Hospital> list = myAddspDao.getAllHospital();

		return list.isEmpty() || list == null ? null : list;
	}

	public void saveSpecialize(AddspForm myForm) {
		Specialize mySpecialize = new Specialize();
		mySpecialize.setId(null);

		mySpecialize.setSpecializetype(myForm.getFrmSpectype());
		myAddspDao.saveNewSpecialize(mySpecialize);

	}

	public void SpecializeSearch(AddspForm myForm) {
		List<Specialize> l = myAddspDao.getSpecializeListAll();
		myForm.setFrmSpeclist(l);

	}

public void saveSpecializeToHospital(AddspForm myForm, int hosid) {

		HosSpec myHosSpec = new HosSpec();
		Hospital h = myAddspDao.getHospitalById(hosid);
		for (int i = 0; i < myForm.getFrmSpeCheckedlist().length; i++) {
			myHosSpec.setHosid(h);
			myHosSpec.setId(null);

			Specialize myspec = myAddspDao.getSpecializeByid(Integer
					.parseInt(myForm.getFrmSpeCheckedlist()[i]));
			myHosSpec.setSpid(myspec);
			myHosSpec.setSpecializetype(myspec.getSpecializetype());
			myAddspDao.saveSpecializetoHos(myHosSpec);
		}

	}

public void checkSpecialize(AddspForm myForm) {
	Specialize sp=myAddspDao.getSpecializeByName(myForm.getFrmSpectype());
	myForm.setFrmSpecialize(sp);
}
	// TODO Auto-generated method stub

 public void checkExistedSpecialize(AddspForm myForm,int hosid) {
	
	System.out.print("hosid ---"+hosid);
	List<HosSpec> hs=myAddspDao.getSpecializeByhosid(hosid);
	
	myForm.setFrmSpecializeList(hs);
	
	
}
 public HosSpec checkDuplicateSpecialize(int spid,int hid){
	 HosSpec hs=myAddspDao.getDupSpe(spid,hid);
	 return hs;
 }
 
}
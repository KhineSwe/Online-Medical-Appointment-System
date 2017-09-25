package com.ictti.omas.business.service;

import java.util.List;

import com.ictti.omas.business.entity.Specialize;
import com.ictti.omas.dao.AddSpecializeDao;
import com.ictti.omas.dao.SpecializeDao;
import com.ictti.omas.presentation.form.AddspForm;

public class AdminUpdateSpecializeService {
	private SpecializeDao myAdminUpdateSpeDao;
	private AddSpecializeDao myAddspDao;

	public AddSpecializeDao getMyAddspDao() {
		return myAddspDao;
	}

	public void setMyAddspDao(AddSpecializeDao myAddspDao) {
		this.myAddspDao = myAddspDao;
	}

	public SpecializeDao getMyAdminUpdateSpeDao() {
		return myAdminUpdateSpeDao;
	}

	public void setMyAdminUpdateSpeDao(SpecializeDao myAdminUpdateSpeDao) {
		this.myAdminUpdateSpeDao = myAdminUpdateSpeDao;
	}

	public void getAllAdminSpecialize(AddspForm myForm) {
		List<Specialize> l = myAdminUpdateSpeDao.getAllSpecialize();

		myForm.setFrmSpecializeUpdateList(l);

	}

	public void getSpecName(AddspForm myForm)

	{
		Specialize spec = myAdminUpdateSpeDao.getSpecializeById(Integer
				.parseInt(myForm.getFrmUpdateSpecialize()));
		myForm.setFrmspecname(spec);

		System.out.println("Spec name is" + myForm.getFrmspecname());
	}

	public void saveUpdateSpe(AddspForm myForm) {
		Specialize mySpecialize = myForm.getFrmspecname();
		mySpecialize.setId(myForm.getFrmspecname().getId());
		mySpecialize.setSpecializetype(myForm.getFrmUpdateSpe());
		myAdminUpdateSpeDao.saveUpdateSpecialize(mySpecialize);

	}

	public void checkSpecialize(AddspForm myForm) {
		Specialize sp = myAddspDao.getSpecializeByName(myForm.getFrmUpdateSpe());
		myForm.setFrmSpecialize(sp);
	}

}

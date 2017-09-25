package com.ictti.omas.business.service;

import com.ictti.omas.business.entity.Admin;
import com.ictti.omas.dao.AdminDao;
import com.ictti.omas.presentation.form.AdminForm;



public class AdminService {
	private AdminDao myAdminDao;

	

	public AdminDao getMyAdminDao() {
		return myAdminDao;
	}

	public void setMyAdminDao(AdminDao myAdminDao) {
		this.myAdminDao = myAdminDao;
	}
	public Admin getAdmin(String email, String password) {
		return myAdminDao.getAdminByEmailAndPassword(email, password);
	}
	public void checkLoginAdmin(AdminForm myForm) {
		Admin myAdmin = myAdminDao.getAdminByEmailAndPassword(
				myForm.getFrmEmail(), myForm.getFrmPassword());
		myForm.setLoginAdmin(myAdmin);
	}
	
	

	
}

package com.ictti.omas.dao;

import com.ictti.omas.business.entity.Admin;



public interface AdminDao {
	public Admin getAdminByEmailAndPassword(String strEmail,
			String strPassword);
	
	//public Admin getAdminByEmail(String email);
	
}

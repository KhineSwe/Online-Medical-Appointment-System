package com.ictti.frame.dao;

import com.ictti.frame.business.entity.IcttiStudent;

public interface IcttiStudentDao {
	public IcttiStudent getStudentByLoginNameAndPassword(String
			strName,String strPassword);
	
	public IcttiStudent getStudentByAccountName(String accountName);
	
	public void saveStudent(IcttiStudent stu);

}

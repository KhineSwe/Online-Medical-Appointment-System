package com.ictti.omas.dao;

import java.util.List;

import com.ictti.omas.business.entity.DoctorlistView;

public interface DoctorlistViewDao {
public List<DoctorlistView> getDoctorList();
	

	public List<DoctorlistView> getDoctorListByhosName(String hosName);

}

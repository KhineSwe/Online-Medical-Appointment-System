package com.ictti.omas.dao;

import java.util.List;

import com.ictti.omas.business.entity.DoctorstatuslistView;

public interface DoctorstatuslistViewDao {

	public List<DoctorstatuslistView> getDoctorList(int did);

	
}

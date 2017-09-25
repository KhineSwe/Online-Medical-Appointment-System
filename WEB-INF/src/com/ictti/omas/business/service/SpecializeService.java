package com.ictti.omas.business.service;

import java.util.List;

import com.ictti.omas.business.entity.Specialize;

import com.ictti.omas.dao.SpecializeDao;

public class SpecializeService {

	private SpecializeDao mySearchTreatmentDao;

	public SpecializeDao getMySearchTreatmentDao() {
		return mySearchTreatmentDao;
	}

	public void setMySearchTreatmentDao(SpecializeDao mySearchTreatmentDao) {
		this.mySearchTreatmentDao = mySearchTreatmentDao;
	}

	public List<Specialize> findSpecializeByLikeFromService(String a_strName) {

		System.out.println("call fun:");
		List<Specialize> l = mySearchTreatmentDao
				.getSpecializeListByName(a_strName);
		return l;
	}
	

}

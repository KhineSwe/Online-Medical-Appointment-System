package com.ictti.omas.dao;

import java.util.List;

import com.ictti.omas.business.entity.HosSpec;


public interface HosSpecDao {
	public List<HosSpec> getBySpecialize(String hospitalId);
}

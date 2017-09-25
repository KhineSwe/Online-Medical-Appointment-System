package com.ictti.omas.dao;

import java.util.List;

import com.ictti.omas.business.entity.Hospital;
import com.ictti.omas.business.entity.TreatmentlistView;

public interface TreatmentListDao {

	

	public TreatmentlistView getTreatmentById(Integer treatmentId);
	
	public List<TreatmentlistView> getHospitalListByName(String strName);

	public List<TreatmentlistView> getHospitalListALL(String pemail, String hname);
	
	public List<TreatmentlistView> getTreatmentListALL(String pemail);

	public List<TreatmentlistView> getDoctorListALL(String pemail, String dname);
	
	public List<TreatmentlistView> getSpecializeListALL(String pemail, String specializetype);
}

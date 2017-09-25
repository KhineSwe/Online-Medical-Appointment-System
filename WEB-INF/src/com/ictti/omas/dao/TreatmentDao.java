package com.ictti.omas.dao;

import java.util.List;

import com.ictti.omas.business.entity.Appointment;
import com.ictti.omas.business.entity.Treatment;
import com.ictti.omas.business.entity.TreatmentView;

public interface TreatmentDao {

	public List<TreatmentView> getTreatmentListALL(String demail);

	public TreatmentView getTreatmentById(Integer treatmentId);
	
	public List<TreatmentView> getTreatmentListByName(String strName);
	
	public List<TreatmentView> getTreatmentPatientListALL(String demail,String pname);

	public void saveNewTreatment(Treatment myTreatment);

	
}

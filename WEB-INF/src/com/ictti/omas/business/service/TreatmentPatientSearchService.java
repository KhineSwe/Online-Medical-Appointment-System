package com.ictti.omas.business.service;

import java.util.List;

import com.ictti.omas.business.entity.TreatmentView;
import com.ictti.omas.dao.TreatmentDao;
import com.ictti.omas.presentation.form.TreatmentPatientSearchForm;
import com.ictti.omas.presentation.form.TreatmentSearchForm;

public class TreatmentPatientSearchService {
	private TreatmentDao myTreatmentDao;

	public TreatmentDao getMyTreatmentDao() {
		return myTreatmentDao;
	}

	public void setMyTreatmentDao(TreatmentDao myTreatmentDao) {
		this.myTreatmentDao = myTreatmentDao;
	}

	public void firstLoadSearch(TreatmentPatientSearchForm myForm, String demail,String pname) {

		List<TreatmentView> l = myTreatmentDao.getTreatmentPatientListALL(demail,pname);

		
		if (l == null) {
			System.out.println("no list");
			myForm.setFrmTreatmentPatientList(l);
			myForm.setIMaxData(0);
		}
		else{
		myForm.setFrmTreatmentPatientList(l);

		// set the first page
		myForm.setActualPage(1);
		// set the maximum size of the result list
		myForm.setIMaxData(l.size());
		// set the maximum size to show the current page
		myForm.setIMaxShow(5);}
	}

	public void detailForSearch(TreatmentPatientSearchForm myForm) {
		TreatmentView myTreatment = myTreatmentDao.getTreatmentById(Integer
				.parseInt(myForm.getFrmDetailTreatmentId()));
		myForm.setFrmPatientListDetail(myTreatment);

	}

	public List<TreatmentView> findTreatmentByLikeFromService(String a_strName) {

		List<TreatmentView> l = myTreatmentDao
				.getTreatmentListByName(a_strName);
		return l.isEmpty() || l == null ? null : l;
	}
}

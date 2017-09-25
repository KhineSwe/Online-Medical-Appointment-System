package com.ictti.omas.business.service;

import java.util.List;

import com.ictti.omas.business.entity.TreatmentView;
import com.ictti.omas.dao.TreatmentDao;
import com.ictti.omas.presentation.form.TreatmentSearchForm;

public class TreatmentSearchService {
	private TreatmentDao myTreatmentDao;

	public TreatmentDao getMyTreatmentDao() {
		return myTreatmentDao;
	}

	public void setMyTreatmentDao(TreatmentDao myTreatmentDao) {
		this.myTreatmentDao = myTreatmentDao;
	}

	public void firstLoadSearch(TreatmentSearchForm myForm, String demail) {

		List<TreatmentView> l = myTreatmentDao.getTreatmentListALL(demail);

		if (l == null) {
			System.out.println("no list");
			myForm.setFrmTreatmentList(l);
			myForm.setIMaxData(0);
		}

		else {
			myForm.setFrmTreatmentList(l);

			// set the first page
			myForm.setActualPage(1);
			// set the maximum size of the result list
			myForm.setIMaxData(l.size());
			// set the maximum size to show the current page
			myForm.setIMaxShow(5);
		}

	}

	public void detailForSearch(TreatmentSearchForm myForm) {
		TreatmentView myTreatment = myTreatmentDao.getTreatmentById(Integer
				.parseInt(myForm.getFrmDetailTreatmentId()));
		myForm.setFrmTreatmentListDetail(myTreatment);

	}

	public List<TreatmentView> findTreatmentByLikeFromService(String a_strName) {

		List<TreatmentView> l = myTreatmentDao
				.getTreatmentListByName(a_strName);
		return l.isEmpty() || l == null ? null : l;
	}

}

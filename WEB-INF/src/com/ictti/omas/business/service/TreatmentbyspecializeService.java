package com.ictti.omas.business.service;

import java.util.List;

import com.ictti.omas.business.entity.TreatmentlistView;
import com.ictti.omas.dao.TreatmentListDao;
import com.ictti.omas.presentation.form.DoctorSearchForm;
import com.ictti.omas.presentation.form.SpecializeAjaxSearchForm;
import com.ictti.omas.presentation.form.SpecializeSearchForm;

public class TreatmentbyspecializeService {
	private TreatmentListDao mySpecializeSearchDao;

	public TreatmentListDao getMySpecializeSearchDao() {
		return mySpecializeSearchDao;
	}

	public void setMySpecializeSearchDao(TreatmentListDao mySpecializeSearchDao) {
		this.mySpecializeSearchDao = mySpecializeSearchDao;
	}

	public void firstLoadSearch(SpecializeSearchForm myForm, String pemail) {

		List<TreatmentlistView> l = mySpecializeSearchDao
				.getTreatmentListALL(pemail);

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

	public void detailForSearch(SpecializeSearchForm myForm) {
		TreatmentlistView myTreatment = mySpecializeSearchDao
				.getTreatmentById(Integer.parseInt(myForm
						.getFrmDetailTreatmentId()));
		myForm.setFrmTreatmentDetail(myTreatment);

	}

}

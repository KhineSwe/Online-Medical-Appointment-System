package com.ictti.omas.business.service;

import java.util.List;

import com.ictti.omas.business.entity.TreatmentlistView;
import com.ictti.omas.dao.TreatmentListDao;
import com.ictti.omas.presentation.form.DoctorAjaxSearchForm;
import com.ictti.omas.presentation.form.SpecializeAjaxSearchForm;
import com.ictti.omas.presentation.form.SpecializeSearchForm;

public class TreatmentSpecializeSearchService {

	private TreatmentListDao mySpecializeSearchDao;

	public TreatmentListDao getMySpecializeSearchDao() {
		return mySpecializeSearchDao;
	}

	public void setMySpecializeSearchDao(TreatmentListDao mySpecializeSearchDao) {
		this.mySpecializeSearchDao = mySpecializeSearchDao;
	}

	public void firstSearch(SpecializeAjaxSearchForm myForm, String pemail,
			String specializetype) {

		List<TreatmentlistView> l = mySpecializeSearchDao.getSpecializeListALL(pemail,
				specializetype);

		if (l == null) {
			System.out.println("no list");
			myForm.setFrmTreatmentSpecializeList(l);
			myForm.setIMaxData(0);
		} else {
			myForm.setFrmTreatmentSpecializeList(l);
			System.out.println("hassss list");
			// set the first page
			myForm.setActualPage(1);
			// set the maximum size of the result list
			myForm.setIMaxData(l.size());
			// set the maximum size to show the current page
			myForm.setIMaxShow(5);
		}
	}

	public void detailForSearch(SpecializeAjaxSearchForm myForm) {
		TreatmentlistView myTreatment = mySpecializeSearchDao.getTreatmentById(Integer
				.parseInt(myForm.getFrmDetailTreatmentId()));
		myForm.setFrmTreatmentSpecializeDetail(myTreatment);
	}
}

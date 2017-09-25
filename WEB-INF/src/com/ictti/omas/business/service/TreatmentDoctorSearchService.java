package com.ictti.omas.business.service;

import java.util.List;



import com.ictti.omas.business.entity.TreatmentlistView;
import com.ictti.omas.dao.TreatmentListDao;
import com.ictti.omas.presentation.form.DoctorAjaxSearchForm;
import com.ictti.omas.presentation.form.DoctorSearchForm;
import com.ictti.omas.presentation.form.HospitalSearchForm;


public class TreatmentDoctorSearchService {

	
	private TreatmentListDao myDoctorSearchDao;

	

	public TreatmentListDao getMyDoctorSearchDao() {
		return myDoctorSearchDao;
	}

	public void setMyDoctorSearchDao(TreatmentListDao myDoctorSearchDao) {
		this.myDoctorSearchDao = myDoctorSearchDao;
	}

	public void firstSearch(DoctorAjaxSearchForm myForm, String pemail,
			String dname) {

		List<TreatmentlistView> l = myDoctorSearchDao
				.getDoctorListALL(pemail, dname);
		

		if (l == null) {
			System.out.println("no list");
			myForm.setFrmTreatmentDoctorlList(l);
			myForm.setIMaxData(0);
		} else {
			myForm.setFrmTreatmentDoctorlList(l);
			System.out.println("hassss list");
			// set the first page
			myForm.setActualPage(1);
			// set the maximum size of the result list
			myForm.setIMaxData(l.size());
			// set the maximum size to show the current page
			myForm.setIMaxShow(5);
		}
	}

	public void detailForSearch(DoctorAjaxSearchForm myForm) {
		TreatmentlistView myTreatment = myDoctorSearchDao.getTreatmentById(Integer
				.parseInt(myForm.getFrmDetailTreatmentId()));
		myForm.setFrmTreatmentDoctorDetail(myTreatment);
		
		System.out.println();

	}
}

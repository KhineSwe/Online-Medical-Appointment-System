package com.ictti.omas.business.service;

import java.util.List;

import com.ictti.omas.business.entity.Hospital;
import com.ictti.omas.business.entity.TreatmentlistView;
import com.ictti.omas.dao.TreatmentListDao;
import com.ictti.omas.presentation.form.DoctorSearchForm;
import com.ictti.omas.presentation.form.HospitalSearchForm;

public class TreatmentbydoctorService {
	private TreatmentListDao myDoctorSearchDao;

	public TreatmentListDao getMyDoctorSearchDao() {
		return myDoctorSearchDao;
	}

	public void setMyDoctorSearchDao(TreatmentListDao myDoctorSearchDao) {
		this.myDoctorSearchDao = myDoctorSearchDao;
	}

	public void firstLoadSearch(DoctorSearchForm myForm, String pemail) {

		List<TreatmentlistView> l = myDoctorSearchDao
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

	public void detailForSearch(DoctorSearchForm myForm) {
		TreatmentlistView myTreatment = myDoctorSearchDao
				.getTreatmentById(Integer.parseInt(myForm
						.getFrmDetailTreatmentId()));
		myForm.setFrmDoctorListDetail(myTreatment);

	}

}

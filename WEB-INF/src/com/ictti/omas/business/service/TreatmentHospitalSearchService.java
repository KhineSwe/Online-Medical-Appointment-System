package com.ictti.omas.business.service;

import java.util.List;



import com.ictti.omas.business.entity.TreatmentlistView;
import com.ictti.omas.dao.TreatmentListDao;
import com.ictti.omas.presentation.form.HospitalAjaxSearchForm;
import com.ictti.omas.presentation.form.HospitalSearchForm;

public class TreatmentHospitalSearchService {
	private TreatmentListDao myTreatmentDao;

	public TreatmentListDao getMyTreatmentDao() {
		return myTreatmentDao;
	}

	public void setMyTreatmentDao(TreatmentListDao myTreatmentDao) {
		this.myTreatmentDao = myTreatmentDao;
	}

	public void firstLoadSearch(HospitalAjaxSearchForm myForm, String pemail,
			String hname) {

		List<TreatmentlistView> l = myTreatmentDao
				.getHospitalListALL(pemail, hname);

		if (l == null) {

			myForm.setFrmTreatmentHospitalList(l);
			myForm.setIMaxData(0);
		} else {

			myForm.setFrmTreatmentHospitalList(l);

			// set the first page
			myForm.setActualPage(1);
			// set the maximum size of the result list
			myForm.setIMaxData(l.size());
			// set the maximum size to show the current page
			myForm.setIMaxShow(5);
		}
	}

	public void detailForSearch(HospitalAjaxSearchForm myForm) {
		TreatmentlistView myTreatment = myTreatmentDao.getTreatmentById(Integer
				.parseInt(myForm.getFrmDetailTreatmentId()));
		myForm.setFrmTreatmentHospitalDetail(myTreatment);

	}

}
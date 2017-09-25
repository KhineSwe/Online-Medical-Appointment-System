package com.ictti.omas.business.service;

import java.util.List;

import com.ictti.omas.business.entity.Doctor;
import com.ictti.omas.business.entity.DoctorlistView;
import com.ictti.omas.business.entity.DoctorstatuslistView;
import com.ictti.omas.business.entity.Hospital;
import com.ictti.omas.business.entity.Rating;
import com.ictti.omas.business.entity.TreatmentView;
import com.ictti.omas.dao.DoctorDao;
import com.ictti.omas.dao.DoctorlistViewDao;
import com.ictti.omas.dao.DoctorstatuslistViewDao;
import com.ictti.omas.dao.HospitalDao;
import com.ictti.omas.dao.RatingDao;
import com.ictti.omas.presentation.form.DoctorForm;
import com.ictti.omas.presentation.form.DoctorListForm;

public class DoctorListService {
	private DoctorDao myDoctorDao;
	private HospitalDao myHospitalDao;
	private DoctorlistViewDao myDoctorlistViewDao;
	private DoctorstatuslistViewDao myDoctorstatuslistViewDao;
	

	public DoctorlistViewDao getMyDoctorlistViewDao() {
		return myDoctorlistViewDao;
	}

	public void setMyDoctorlistViewDao(DoctorlistViewDao myDoctorlistViewDao) {
		this.myDoctorlistViewDao = myDoctorlistViewDao;
	}

	public DoctorstatuslistViewDao getMyDoctorstatuslistViewDao() {
		return myDoctorstatuslistViewDao;
	}

	public void setMyDoctorstatuslistViewDao(
			DoctorstatuslistViewDao myDoctorstatuslistViewDao) {
		this.myDoctorstatuslistViewDao = myDoctorstatuslistViewDao;
	}

	public HospitalDao getMyHospitalDao() {
		return myHospitalDao;
	}

	public void setMyHospitalDao(HospitalDao myHospitalDao) {
		this.myHospitalDao = myHospitalDao;
	}

	public DoctorDao getMyDoctorDao() {
		return myDoctorDao;
	}

	public void setMyDoctorDao(DoctorDao myDoctorDao) {
		this.myDoctorDao = myDoctorDao;
	}

	public void firstLoadSearch(DoctorListForm myForm) {
		// TODO Auto-generated method stub
		/* List<Doctor> l=myDoctorDao.getDoctorList(); */
		List<DoctorlistView> l = myDoctorlistViewDao.getDoctorList();
		myForm.setFrmDoctorList(l);
		myForm.setActualPage(1);
		// set the maximum size of the result list
		myForm.setIMaxData(l.size());
		// set the maximum size to show the current page
		myForm.setIMaxShow(8);

	}

	public void changeStatusDoctor(DoctorListForm myForm, int did) {

		Doctor d = myDoctorDao.getDoctorById(did);

		d.setId(d.getId());
		d.setDaddress(d.getDaddress());
		d.setDemail(d.getDemail());
		d.setDgender(d.getDgender());
		d.setDname(d.getDname());
		d.setDphno(d.getDphno());
		d.setDpwd(d.getDpwd());
		d.setSpid(d.getSpid());
		d.setDstatus(0);
		
	
		myDoctorDao.changeStatus(d);

		List<DoctorlistView> l = myDoctorlistViewDao.getDoctorList();
		
		if (l == null) {
			System.out.println("no list");
			myForm.setFrmDoctorList(l);
			myForm.setIMaxData(0);
		}
		else{
		myForm.setFrmDoctorList(l);
		myForm.setActualPage(1);
		// set the maximum size of the result list
		myForm.setIMaxData(l.size());
		// set the maximum size to show the current page
		myForm.setIMaxShow(8);
		}

	}

	public void firstLoadSearch(DoctorListForm myForm, String hosName) {

		List<DoctorlistView> l = myDoctorlistViewDao.getDoctorListByhosName(hosName);
		if (l == null) {
			System.out.println("no list");
			myForm.setFrmDoctorListByhosName(l);
			myForm.setIMaxData(0);
		} else {
			myForm.setFrmDoctorListByhosName(l);
			myForm.setActualPage(1);
			// set the maximum size of the result list
			myForm.setIMaxData(l.size());
			// set the maximum size to show the current page
			myForm.setIMaxShow(8);
		}

	}

	public List<DoctorlistView> findHospitalByLikeFromService(String hosName) {
		List<DoctorlistView> l = myDoctorlistViewDao.getDoctorListByhosName(hosName);
		return l.isEmpty() || l == null ? null : l;
	}

	public void checkDoctorCondition(DoctorListForm myForm, int did) {
		List<DoctorstatuslistView> l = myDoctorstatuslistViewDao.getDoctorList(did);
		myForm.setFrmDoctorstatuslist(l);

	}

	public void checkDuration(DoctorListForm myForm, int did) {
		
       List <Doctor> l=myDoctorDao.getDateDuration(did);
       myForm.setFrmdateDuration(l);

		
	}
	
	
	//for Doctor............
	

	private RatingDao myRatingDao;
	

	public RatingDao getMyRatingDao() {
		return myRatingDao;
	}

	public void setMyRatingDao(RatingDao myRatingDao) {
		this.myRatingDao = myRatingDao;
	}



	public void checkLoginDoctor(DoctorForm myForm) {
		System.out.println("aaaaaaaaaa");
	 Doctor myDoctor = myDoctorDao.getDoctorByEmailAndPassword(myForm.getFrmEmail(),myForm.getFrmPassword());						
		myForm.setLoginDoctor(myDoctor);
		
	}
	
	public Doctor getDoctor(String email, String password) {
		return myDoctorDao.getDoctorByEmailAndPassword(email, password);
				

	}

	public void fristLoadUpdateProfile(DoctorForm myForm) {
		Doctor myLoginDoctor = myForm.getLoginDoctor();
		myForm.setFrmRegName(myLoginDoctor.getDname());
		myForm.setFrmEmail(myLoginDoctor.getDemail());
	
		
		myForm.setFrmPassword(myLoginDoctor.getDpwd());
		myForm.setFrmRegEmail(myLoginDoctor.getDemail());
		myForm.setFrmRegPassword(myLoginDoctor.getDpwd());
		myForm.setFrmRegConfPassword(myLoginDoctor.getDpwd());
		myForm.setFrmGender(myLoginDoctor.getDgender());
		myForm.setFrmRegSpecializeName(myLoginDoctor.getSpid().getSpecializetype());
		myForm.setFrmRegPhone(myLoginDoctor.getDphno());
		myForm.setFrmRegAddress(myLoginDoctor.getDaddress());
		myForm.setFrmRegFormControl(null);		
			
			
	}

	

	public void saveUpdateDoctor(DoctorForm myForm) {
		Doctor myDoctor=myForm.getLoginDoctor();
		myDoctor.setDaddress(myForm.getFrmRegAddress());
		myDoctor.setDemail(myForm.getFrmEmail());
		myDoctor.setDgender(myForm.getFrmGender());
		myDoctor.setDname(myForm.getFrmRegName());
		myDoctor.setDphno(myForm.getFrmRegPhone());
		myDoctor.setDpwd(myForm.getFrmRegPassword());
		myDoctorDao.saveDoctor(myDoctor);
		// TODO Auto-generated method stub
		
	}

	public void checkStatus(DoctorForm myForm) {
		
		// TODO Auto-generated method stub
		
	}
	
	
	// for rating............

	public void myDrateValue(DoctorForm myForm, int did) {
		List<Rating> myRatevalue = myRatingDao.getDrateValue(did);		
		myForm.setMydrateValue(myRatevalue);	
		// TODO Auto-generated method stub
		
	}


}

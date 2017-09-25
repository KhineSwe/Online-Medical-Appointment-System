package com.ictti.omas.business.service;

import java.util.List;

import com.ictti.omas.business.entity.Patient;
import com.ictti.omas.business.entity.PatientappointmentlistView;
import com.ictti.omas.dao.PatientDao;
import com.ictti.omas.presentation.form.NameAutoComplementForm;

public class NameAutoComplementService {
	private PatientDao myPatientDao;

	

	
	public PatientDao getMyPatientDao() {
		return myPatientDao;
	}

	public void setMyPatientDao(PatientDao myPatientDao) {
		this.myPatientDao = myPatientDao;
	}

	public List<Patient> findPatientByLikeFromService(String pname) {
		List<Patient> l = myPatientDao.getPatientListByName(pname);
		if (l.isEmpty()) {
			System.out.println("False");
		} else {
			System.out.println("True");
		}
		return l.isEmpty() || l == null ? null : l;
	}

	public void firstLoadSearch(NameAutoComplementForm myForm, String pname) {
		List<Patient> l = myPatientDao.getPatientNameListAll(pname);
		if (l == null) {
			System.out.println("no list");
			myForm.setFrmPatientNameList(l);
			myForm.setIMaxData(0);
		}
		else{
		myForm.setFrmPatientNameList(l);
		myForm.setActualPage(1);
		myForm.setIMaxData(l.size());
		myForm.setIMaxShow(8);}
	}

	public void detailForSearch(NameAutoComplementForm myForm) {
		Patient myPatient = myPatientDao.getPatientNameById(Integer
				.parseInt(myForm.getFrmDetailPatientId()));
		myForm.setFrmPatientListDetail(myPatient);
	}

	public void ChangeStatus(NameAutoComplementForm myForm, int pid) {
		// TODO Auto-generated method stub
		Patient myPatient = myPatientDao.getPatientNameById(pid);
		myPatient.setId(myPatient.getId());
		myPatient.setPaddress(myPatient.getPaddress());
		myPatient.setPblood(myPatient.getPblood());
		myPatient.setPdob(myPatient.getPdob());
		myPatient.setPemail(myPatient.getPemail());
		myPatient.setPgender(myPatient.getPgender());
		myPatient.setPpwd(myPatient.getPpwd());
		myPatient.setPname(myPatient.getPname());
		myPatient.setPphno(myPatient.getPphno());
		myPatient.setPregdate(myPatient.getPregdate());
		myPatient.setPstatus(0);
		
		myPatientDao.savePatientStatus(myPatient);

	}

	public void checkAppointment(NameAutoComplementForm myForm, int pid) {
		List<PatientappointmentlistView> l = myPatientDao
				.getAppointmentList(pid);
		myForm.setFrmPatientAppointlist(l);
		// TODO Auto-generated method stub

	}

	public void firstLoadSearch(NameAutoComplementForm myForm) {

		List<Patient> l = myPatientDao.getPatientListAll();
		myForm.setFrmPatientList(l);
		myForm.setActualPage(1);	
		myForm.setIMaxData(l.size());		
		myForm.setIMaxShow(8);
	}

	public void checkDuration(NameAutoComplementForm myForm, int pid) {
		List<Patient> l = myPatientDao.getDuration(pid);
		myForm.setFrmDuration(l);
		// TODO Auto-generated method stub

	}

	// TODO Auto-generated method stub

}

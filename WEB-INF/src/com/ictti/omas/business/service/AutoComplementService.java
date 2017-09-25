/*package com.ictti.omas.business.service;

import java.util.List;

import com.ictti.omas.business.entity.Hospital;
import com.ictti.omas.business.entity.Specialize;
import com.ictti.omas.dao.HospitalDao;
import com.ictti.omas.dao.SpecializeDao;

public class AutoComplementService {
	private HospitalDao myHospitalDao;
	private SpecializeDao mySpecializeDao;

	public HospitalDao getMyHospitalDao() {
		return myHospitalDao;
	}

	public void setMyHospitalDao(HospitalDao myHospitalDao) {
		this.myHospitalDao = myHospitalDao;
	}

	public SpecializeDao getMySpecializeDao() {
		return mySpecializeDao;
	}

	public void setMySpecializeDao(SpecializeDao mySpecializeDao) {
		this.mySpecializeDao = mySpecializeDao;
	}

	public List<Hospital> getAllHospital() {
		List<Hospital> list = myHospitalDao.getAllHospital();
			
		return list.isEmpty() || list == null ? null : list;
	}

	public List<Specialize> getBySpecialize(String hospitalId) {
		List<Specialize> l = mySpecializeDao.getBySpecialize(hospitalId);
				
		return l.isEmpty() || l == null ? null : l;
	}
}
 */
package com.ictti.omas.business.service;

import java.util.ArrayList;
import java.util.List;

import com.ictti.omas.business.entity.Doctor;
import com.ictti.omas.business.entity.Doctordegree;
import com.ictti.omas.business.entity.HosSpec;
import com.ictti.omas.business.entity.Hospital;
import com.ictti.omas.business.entity.Schedule;
import com.ictti.omas.business.entity.Specialize;
import com.ictti.omas.dao.DoctorDao;
import com.ictti.omas.dao.DoctorDegreeDao;
import com.ictti.omas.dao.HosSpecDao;
import com.ictti.omas.dao.HospitalDao;
import com.ictti.omas.dao.ScheduleDao;
import com.ictti.omas.dao.SpecializeDao;
import com.ictti.omas.presentation.form.AutoComplementForm;

public class AutoComplementService {
	private HospitalDao myHospitalDao;
	private HosSpecDao myHosSpecDao;
	private SpecializeDao mySpecializeDao;

	private ScheduleDao myScheduleDao;

	public ScheduleDao getMyScheduleDao() {
		return myScheduleDao;
	}

	public void setMyScheduleDao(ScheduleDao myScheduleDao) {
		this.myScheduleDao = myScheduleDao;
	}

	public SpecializeDao getMySpecializeDao() {
		return mySpecializeDao;
	}

	public void setMySpecializeDao(SpecializeDao mySpecializeDao) {
		this.mySpecializeDao = mySpecializeDao;
	}

	public HosSpecDao getMyHosSpecDao() {
		return myHosSpecDao;
	}

	public void setMyHosSpecDao(HosSpecDao myHosSpecDao) {
		this.myHosSpecDao = myHosSpecDao;
	}

	private DoctorDao myDoctorDao;
	private DoctorDegreeDao myDoctorDegreeDao;

	public DoctorDegreeDao getMyDoctorDegreeDao() {
		return myDoctorDegreeDao;
	}

	public void setMyDoctorDegreeDao(DoctorDegreeDao myDoctorDegreeDao) {
		this.myDoctorDegreeDao = myDoctorDegreeDao;
	}

	public DoctorDao getMyDoctorDao() {
		return myDoctorDao;
	}

	public void setMyDoctorDao(DoctorDao myDoctorDao) {
		this.myDoctorDao = myDoctorDao;
	}

	public HospitalDao getMyHospitalDao() {
		return myHospitalDao;
	}

	public void setMyHospitalDao(HospitalDao myHospitalDao) {
		this.myHospitalDao = myHospitalDao;
	}

	public List<Hospital> getAllHospital() {
		List<Hospital> list = myHospitalDao.getAllHospital();

		return list.isEmpty() || list == null ? null : list;
	}

	public List<HosSpec> getBySpecialize(String hospitalId) {
		List<HosSpec> l = myHosSpecDao.getBySpecialize(hospitalId);

		return l.isEmpty() || l == null ? null : l;
	}

	public List<Doctor> getDoctorById(String spid) {
		int sid = Integer.parseInt(spid);
		List<Doctor> l = myDoctorDao.getDoctorlistById(sid);

		return l.isEmpty() || l == null ? null : l;
	}

	public List<Doctor> getDoctorById(String spid, AutoComplementForm myForm) {
		int specializeid = Integer.parseInt(spid);

		List<Doctor> l = myDoctorDao.getDocById(specializeid);

		List<Doctor> realDList = new ArrayList<Doctor>();
		for (int i = 0; i < l.size(); i++) {
			Schedule dList = myScheduleDao.getdoctorListByschedule(
					myForm.getFrmHosId(), l.get(i).getId());
			if (dList == null) {
				System.out.println("null case");
			} else {
				Doctor did = dList.getDid();

				Doctor d = myDoctorDao.getDoctorBydoctorid(did.getId());
				realDList.add(d);
			}
		}

		/*
		 * for (int i = 1; i < realDList.size(); i++) { Doctor a1 =
		 * realDList.get(i); Doctor a2 = realDList.get(i - 1); if
		 * (a1.getDname().equals(a2.getDname())) { realDList.remove(a1); } }
		 */

		return realDList;
	}

	public Doctordegree getDegreeByDoctorId(int did) {

		Doctordegree l = myDoctorDegreeDao.getDegreeByDoctorId(did);

		return l;

	}

	public void getHosname(AutoComplementForm myForm) {
		Hospital h = myHospitalDao.getHospitalById(Integer.parseInt(myForm
				.getFrmHosId()));
		myForm.setFrmhosname(h);

	}

	public void getSpectype(AutoComplementForm myForm) {

		HosSpec sp = mySpecializeDao.getSpecNameByID(Integer.parseInt(myForm
				.getFrmSpecId()));
		myForm.setFrmspecname(sp);
		// myForm.setFrmspecname(myForm.getFrmspecname());

	}

	public void getspid(AutoComplementForm myForm, int specid) {
		HosSpec sp = mySpecializeDao.getSpecById(specid);
		myForm.setFrmspid(sp.getSpid().getId().toString());

	}

}

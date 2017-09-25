package com.ictti.omas.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ictti.omas.business.entity.Patient;
import com.ictti.omas.business.entity.PatientappointmentlistView;

public class PatientDaoImpl extends HibernateDaoSupport implements PatientDao {

	//for patientlogin
	public Patient getPatientByEmailAndPassword(String strEmail,
			String strPassword) {

		String hql = "from Patient i where i.pemail=? and i.ppwd=?";
		Object[] parm = { strEmail, strPassword };
		List l = getHibernateTemplate().find(hql, parm);

		return l.isEmpty() || l == null ? null : (Patient) l.get(0);

	}

	public Patient getPatientByEmail(String email) {
		String hql = "from Patient i where i.pemail=?";
		List l = getHibernateTemplate().find(hql, email);
		return l.isEmpty() || l == null ? null : (Patient) l.get(0);

	}

	public void savePatient(Patient patient) {
		getHibernateTemplate().saveOrUpdate(patient);
	}
	
	
	
	//for admin's patient
	
	public List<Patient> getPatientListByName(String pname) {
		String hql="from Patient p where p.pname like ?";
		List<Patient> l=getHibernateTemplate().find(hql,pname+"%");
		return l;
	}

	@Override
	public List<Patient> getPatientListAll() {
		String hql="from Patient p ";
		List<Patient> l=getHibernateTemplate().find(hql);
		return l.isEmpty() || l==null ? null:l;
	}

	@Override
	public Patient getPatientById(Integer patientId) {
		System.out.println("Here DaoImpl");
		String hql="from Patient p where p.id=?";
		List< Patient> list=getHibernateTemplate().find(hql,patientId);
		return list.isEmpty() || list==null ? null:list.get(0);
	}
	
	
	
	public List<Patient> getPatientNameListAll(String pname){
		String hql="from Patient p where p.pname like ?";
		List<Patient> l=getHibernateTemplate().find(hql,pname+"%");
		return l.isEmpty() || l==null ? null:l;
	}

	public Patient getPatientNameById(Integer patientId){
		System.out.println("Here DaoImpl");
		String hql="from Patient p where p.id=?";
		List< Patient> list=getHibernateTemplate().find(hql,patientId);
		
		return list.isEmpty() || list==null ? null:list.get(0);
	}
	public void savePatientStatus(Patient myPatient){
		getHibernateTemplate().saveOrUpdate(myPatient);
	}

	public List<PatientappointmentlistView> getAppointmentList(int pid){

		String hql="from PatientappointmentlistView p where p.id=? and appointmentdt between pregdate and curdate()";
		List<PatientappointmentlistView> l=getHibernateTemplate().find(hql,pid);
		return l.isEmpty() || l==null ? null:l;
	}


	public List<Patient> getDuration(int pid){
		String hql="from Patient p where p.id=? and datediff(curdate(),pregdate)>365";
		List<Patient> l=getHibernateTemplate().find(hql,pid);
		return l.isEmpty() || l==null ? null:l;
	}



}

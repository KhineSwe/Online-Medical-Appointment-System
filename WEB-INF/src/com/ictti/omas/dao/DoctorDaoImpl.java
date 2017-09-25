package com.ictti.omas.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ictti.omas.business.entity.Doctor;

public class DoctorDaoImpl extends HibernateDaoSupport implements DoctorDao {

	/************ patient **********/
	public List<Doctor> getDoctorListByName(String strName) {
		String hql = "from Doctor i where i.dname like ? group by i.dname";
		List<Doctor> l = getHibernateTemplate().find(hql, strName + "%");
		return l.isEmpty() || l == null ? null : l;
	}

	public List<Doctor> getDoctorlistById(int specializeid) {
		String hql = "from Doctor d where d.spid.id=?";
		List<Doctor> list = getHibernateTemplate().find(hql, specializeid);
		return list.isEmpty() || list == null ? null : list;
	}

	public List<Doctor> getDoctorById(Integer specializeid) {

		String hql = "from Doctor d where d.spid.id=?";
		List<Doctor> list = getHibernateTemplate().find(hql, specializeid);
		return list.isEmpty() || list == null ? null : list;
	}

	public Doctor getDesireDoctorById(Integer specializeid) {

		String hql = "from Doctor d where d.id=?";
		List<Doctor> list = getHibernateTemplate().find(hql, specializeid);
		return list.isEmpty() || list == null ? null : (Doctor) list.get(0);
	}

	public Doctor getDocNameByID(int schid) {
		String hql = "from Doctor d where d.id=?";
		List l = getHibernateTemplate().find(hql, schid);
		return l.isEmpty() || l == null ? null : (Doctor) l.get(0);
	}

	public Doctor getDoctorBydoctorid(int did) {
		String hql = "from Doctor d where d.id=?";
		List<Doctor> l = getHibernateTemplate().find(hql, did);
		return l.isEmpty() || l == null ? null : (Doctor) l.get(0);
	}

	public List<Doctor> getDocById(Integer specializeid) {
		String hql = "from Doctor d where d.spid.id=?";
		List<Doctor> list = getHibernateTemplate().find(hql, specializeid);
		return list;
	}

	/************ end patient **********/

	/* ******************Doctor Mangement*********************** */

	/*
	 * public List<Doctor> getDoctorList(){ String hql="from Doctor"; List
	 * l=getHibernateTemplate().find(hql); return l.isEmpty() || l==null ? null
	 * : l; }
	 */

	public List<Doctor> getDateDuration(int did) {
		String hql = "from Doctor d where d.id=? and datediff(curdate(),dregdate)>=30";
		List l = getHibernateTemplate().find(hql, did);
		return l.isEmpty() || l == null ? null : l;
	}

	public Doctor getDoctorById(int did) {
		String hql = "from Doctor d where d.id=?";
		List l = getHibernateTemplate().find(hql, did);
		return l.isEmpty() || l == null ? null : (Doctor) l.get(0);
	}

	public void changeStatus(Doctor d) {
		getHibernateTemplate().saveOrUpdate(d);
	}

	/* @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ */

	/************ doctor register *********/

	public Doctor getDoctorByDoctorEmail(String strDocName) {

		String hql = "from Doctor i where i.demail=?";
		Object[] parm = { strDocName };
		List l = getHibernateTemplate().find(hql, parm);
		return l.isEmpty() || l == null ? null : (Doctor) l.get(0);
	}

	@Override
	public void saveDoctor(Doctor dos) {
		getHibernateTemplate().saveOrUpdate(dos);

	}

	@Override
	public Doctor getDoctorId() {
		String hql = "from Doctor i ORDER BY i.id DESC LIMIT 0,1 ";

		List l = getHibernateTemplate().find(hql);
		return l.isEmpty() || l == null ? null : (Doctor) l.get(0);
	}

	@Override
	public List<Doctor> getAllDoctor() {
		String hql = "from Doctor i";
		List<Doctor> l = getHibernateTemplate().find(hql);
		return l.isEmpty() || l == null ? null : l;

	}

	/************ end doctor register *********/

	/************ Appointment list *********/

	public Doctor getDoctorId(int did) {
		String hql = "from Doctor d where d.id=?";
		List l = getHibernateTemplate().find(hql, did);
		return l.isEmpty() || l == null ? null : (Doctor) l.get(0);
	}

	/************ end Appointment list *********/
	public Doctor getDoctorByEmailAndPassword(String strEmail,
			String strPassword) {

		String hql = "from Doctor where demail=? and dpwd=?";
		Object[] parm = { strEmail, strPassword };
		List l = getHibernateTemplate().find(hql, parm);
		return l.isEmpty() || l == null ? null : (Doctor) l.get(0);
	}

}

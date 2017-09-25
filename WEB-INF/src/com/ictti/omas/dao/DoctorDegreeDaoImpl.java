package com.ictti.omas.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ictti.omas.business.entity.Doctor;
import com.ictti.omas.business.entity.Doctordegree;

public class DoctorDegreeDaoImpl extends HibernateDaoSupport implements
		DoctorDegreeDao {

	/********* patient **************/
	public Doctordegree getDegreeByDoctorId(int did) {

		String hql = "from Doctordegree d where d.did.id=?";
		List l = getHibernateTemplate().find(hql, did);

		return l.isEmpty() || l == null ? null : (Doctordegree) l.get(0);
	}

	/********* end patient **************/

	/********* doctor register **************/
	public void saveDoctorDegree(Doctordegree degree) {

		getHibernateTemplate().saveOrUpdate(degree);
	}

	public Doctordegree getDidInDoctorDegree(Doctor frmDoctorID) {
		int did = frmDoctorID.getId();
		System.out.println("++++++++++" + did);

		String hql = "from Doctordegree i where i.did.id=?";
		List l = getHibernateTemplate().find(hql, did);
		return l.isEmpty() || l == null ? null : (Doctordegree) l.get(0);
	}

	/********* end doctor register **************/
}

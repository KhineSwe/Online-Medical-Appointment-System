package com.ictti.omas.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ictti.omas.business.entity.Admin;


public class AdminDaoImpl extends HibernateDaoSupport implements AdminDao {
	public Admin getAdminByEmailAndPassword(String strEmail,
			String strPassword) {

		String hql = "from Admin i where i.admemail=? and i.admpwd=?";
		Object[] parm = { strEmail, strPassword };
		List l = getHibernateTemplate().find(hql, parm);

		return l.isEmpty() || l == null ? null : (Admin) l.get(0);

	}

/*	public Patient getPatientByEmail(String email) {
		String hql = "from Patient i where i.pemail=?";
		List l = getHibernateTemplate().find(hql, email);
		return l.isEmpty() || l == null ? null : (Patient) l.get(0);

	}
	*/
	

}

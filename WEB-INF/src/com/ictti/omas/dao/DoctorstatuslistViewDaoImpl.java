package com.ictti.omas.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ictti.omas.business.entity.DoctorstatuslistView;

public class DoctorstatuslistViewDaoImpl extends HibernateDaoSupport implements
		DoctorstatuslistViewDao {
	
	public List<DoctorstatuslistView> getDoctorList(int did){
		String hql = "from DoctorstatuslistView d where d.id=? and d.appointmentdt between d.dregdate and curdate() ";
		List l = getHibernateTemplate().find(hql, did);
		return l.isEmpty() || l == null ? null :  l;
	}
	

}

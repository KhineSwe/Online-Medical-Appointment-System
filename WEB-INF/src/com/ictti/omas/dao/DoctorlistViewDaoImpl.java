package com.ictti.omas.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ictti.omas.business.entity.DoctorlistView;

public class DoctorlistViewDaoImpl extends HibernateDaoSupport implements
		DoctorlistViewDao {

	
	public List<DoctorlistView> getDoctorList(){
		String hql="from DoctorlistView group by dname order by dregdate DESC";
		List l=getHibernateTemplate().find(hql);
		return l.isEmpty() || l==null ? null : l;
	}
	
	public List<DoctorlistView> getDoctorListByhosName(String hosName){
		String hql="from DoctorlistView where hosname like ? group by dname order by dregdate DESC";
		List l=getHibernateTemplate().find(hql,hosName+"%");
		return l.isEmpty() || l==null ? null : l;
	}
}

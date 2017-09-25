package com.ictti.omas.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ictti.omas.business.entity.Hospital;

public class HospitalDaoImpl extends HibernateDaoSupport implements HospitalDao {

	public List<Hospital> getAllHospital() {
		String hql = "from Hospital h";
		List<Hospital> l = getHibernateTemplate().find(hql);
		return l.isEmpty() || l == null ? null : l;

	}

	public Hospital getHospitalById(int hosid) {
		//System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		String hql = "from Hospital h where h.id=?";
		List l = getHibernateTemplate().find(hql, hosid);
		return l.isEmpty() || l == null ? null : (Hospital) l.get(0);
	}

	public Hospital getHosCode(int hosid) {
		String hql = "from Hospital h where h.id=?";
		List l = getHibernateTemplate().find(hql, hosid);
		return l.isEmpty() || l == null ? null : (Hospital) l.get(0);

	}

	public void saveHospital(Hospital hos) {
		getHibernateTemplate().saveOrUpdate(hos);

	}

	@Override
	public Hospital getHospitalByHospitalName(String strHosName) {
		String hql = "from Hospital i where i.hosname=?";
		Object[] parm = { strHosName };
		List<Hospital> l = getHibernateTemplate().find(hql, parm);
		return l.isEmpty() || l == null ? null : (Hospital) l.get(0);
	}

	@Override
	public List<Hospital> getHospitalListAll() {
		String hql = "from Hospital i";
		List<Hospital> l = getHibernateTemplate().find(hql);
		return l.isEmpty() || l == null ? null : l;
	}

	@Override
	public Hospital getHospitalById(Integer hospitalId) {
		System.out.println("Here DaoImpl");
		String hql = "from Hospital i where i.id=?";
		List<Hospital> list = getHibernateTemplate().find(hql, hospitalId);
		return list.isEmpty() || list == null ? null : list.get(0);
	}

	public List<Hospital> getHospitalListByName(String strName) {
		String hql = "from Hospital i where i.hosname like ? group by i.hosname ";
		List<Hospital> l = getHibernateTemplate().find(hql, strName + "%");
		return l;
	}
	/*public Hospital getHosId(String hos_name){
		String hql="from Hospital i where i.hosname=?";
		List<Hospital> list=getHibernateTemplate().find(hql,hos_name);
	return  list.isEmpty() || list==null ? null : list.get(0);
	}*/
	
	

	
	
	

	
	
}

package com.ictti.omas.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ictti.omas.business.entity.HosSpec;
import com.ictti.omas.business.entity.Specialize;

public class SpecializeDaoImpl extends HibernateDaoSupport implements
		SpecializeDao {

	/**********patient***********/
	public List<Specialize> getSpecializeListByName(String strName) {
		String hql = "from Specialize i where i.specializetype like ? group by i.specializetype";
		List<Specialize> l = getHibernateTemplate().find(hql, strName + "%");

		return l.isEmpty() || l == null ? null : l;
	}

	/*public Specialize getSpecNameByID(int specid) {
		String hql = "from Specialize s where s.id=?";
		List l = getHibernateTemplate().find(hql, specid);
		return l.isEmpty() || l == null ? null : (Specialize) l.get(0);
	}*/
	
	public HosSpec getSpecNameByID(int hspid) {
		String hql = "from HosSpec s where s.id=?";
		List l = getHibernateTemplate().find(hql, hspid);
		return l.isEmpty() || l == null ? null : (HosSpec) l.get(0);
	}

	/********** end patient***********/
	
	
	
	/***********doctor register***********/
	
	public List<Specialize> getAllSpecialize() {
		List l = getHibernateTemplate().find("from Specialize");
		return l.isEmpty() || l == null ? null : l;

	}

	@Override
	public Specialize getSpecializeById(Integer id) {
		List l = getHibernateTemplate().find("from Specialize i where i.id=?",
				id);
		return l.isEmpty() || l == null ? null : (Specialize) l.get(0);

	}
	/*********** end doctor register***********/
	
	public void saveUpdateSpecialize(Specialize spe)
	{
		getHibernateTemplate().saveOrUpdate(spe);
	}
	
	
	
	public HosSpec getSpecById(int hsid){
		String hql="from HosSpec s where s.id=?";
		List l=getHibernateTemplate().find(hql,hsid);
		return l.isEmpty() || l==null ? null : (HosSpec) l.get(0);
	}
}

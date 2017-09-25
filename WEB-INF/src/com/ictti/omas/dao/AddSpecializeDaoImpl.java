package com.ictti.omas.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ictti.omas.business.entity.HosSpec;
import com.ictti.omas.business.entity.Hospital;
import com.ictti.omas.business.entity.Patient;
import com.ictti.omas.business.entity.Specialize;

public class AddSpecializeDaoImpl extends HibernateDaoSupport implements AddSpecializeDao {

	

		public List<Hospital> getAllHospital() {
			String hql = "from Hospital h";
			List<Hospital> l = getHibernateTemplate().find(hql);
			return l.isEmpty() || l == null ? null : l;

		}

		public Hospital getHospitalById(int hosid) {
			String hql = "from Hospital h where h.id=?";
			List l = getHibernateTemplate().find(hql, hosid);
			return l.isEmpty() || l == null ? null : (Hospital) l.get(0);
		}
		
		public Specialize getSpecializeByName(String specType){
			String hql = "from Specialize sp where sp.specializetype=?";
			List l = getHibernateTemplate().find(hql, specType);
			return l.isEmpty() || l == null ? null : (Specialize) l.get(0);
		}

		

	

		

		public void saveNewSpecialize(Specialize sp) {
			getHibernateTemplate().saveOrUpdate(sp);
		}
		
		
		
		public List<Specialize> getSpecializeListAll(){
			
			String hql="from Specialize i";
			List<Specialize> l=getHibernateTemplate().find(hql);
			return l.isEmpty() || l==null ? null : l;
			
			
		}
		public void saveSpecializetoHos(HosSpec hosp){
			getHibernateTemplate().saveOrUpdate(hosp);
		}
		
		
		public Specialize getSpecializeByid(int spid){
			String hql="from Specialize s where s.id=?";
			List l=getHibernateTemplate().find(hql,spid);
			return l.isEmpty() || l==null ? null :(Specialize) l.get(0);
		}
		
		public List<HosSpec> getSpecializeByhosid(int hosid){
		
			String hql = "from HosSpec hs where hs.hosid.id=?";
			List<HosSpec> l = getHibernateTemplate().find(hql,hosid);
			return l.isEmpty() || l == null ? null : l;
			
		}
		public HosSpec getDupSpe(int spid,int hosid){
			String hql="from HosSpec hs where hs.spid.id=? and hs.hosid.id=?";
			Object[] parm={spid,hosid};
			List l=getHibernateTemplate().find(hql,parm);
			return l.isEmpty() || l==null ? null :(HosSpec) l.get(0);
			
		}
		
	

	}

	
	

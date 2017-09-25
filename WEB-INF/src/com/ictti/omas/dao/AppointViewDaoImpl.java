package com.ictti.omas.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ictti.omas.business.entity.AppointView;

public class AppointViewDaoImpl extends HibernateDaoSupport implements
		AppointViewDao {
	public List<AppointView> getHospitalListALL(String demail) {
		String hql = "from AppointView ap where ap.demail=? group by ap.hosname";
		List<AppointView> l = getHibernateTemplate().find(hql, demail);
		System.out.println(l);
		return l.isEmpty() || l == null ? null : l;
	}

	public AppointView getHospitalById(String hosname)

	{
		// System.out.println("id is "+hosid);
		String hql = "from AppointView ap where ap.hosname=?";
		List<AppointView> list = getHibernateTemplate().find(hql, hosname);
		if (!list.isEmpty())
			System.out.println("aaaaaaa");
		return list.isEmpty() || list == null ? null : list.get(0);
	}
	
	
	public List<AppointView> getAppointListALL(String hosname,String demail) {
		String hql = "from AppointView ap where ap.hosname=? and ap.demail=? order by ap.schdate";
		Object[] parm={hosname,demail};
		List<AppointView> l = getHibernateTemplate().find(hql, parm);
		
		return l.isEmpty() || l == null ? null : l;
	}
	
	
	
	public AppointView getAppointmentById(Integer appId)

	{
		// System.out.println("id is "+hosid);
		String hql = "from AppointView ap where ap.id=?";
		List<AppointView> list = getHibernateTemplate().find(hql, appId);
		if (!list.isEmpty())
			System.out.println("aaaaaaa");
		return list.isEmpty() || list == null ? null : list.get(0);
	}
	
	public List<AppointView> getPatientByhosnameList(String demail,String hosname){
		String hql="from AppointView ap where ap.demail=? and ap.hosname=?";
		Object[] parm={demail,hosname};
		List<AppointView> list=getHibernateTemplate().find(hql,parm);
		return list.isEmpty()||list==null? null:list;
	}

}

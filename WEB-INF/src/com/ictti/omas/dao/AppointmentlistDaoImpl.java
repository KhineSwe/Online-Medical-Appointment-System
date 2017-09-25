package com.ictti.omas.dao;

import java.util.Date;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ictti.omas.business.entity.AppointmentlistView;
import com.ictti.omas.business.entity.Hospital;

public class AppointmentlistDaoImpl extends HibernateDaoSupport implements AppointmentlistDao {

	


	@Override
	public List<AppointmentlistView> getAppointListALL() {
		String hql = "from AppointmentlistView i where i.schdate=curdate()";
		List<AppointmentlistView> l = getHibernateTemplate().find(hql);
		return l.isEmpty() || l == null ? null : l;
	}
	
	
	public List<AppointmentlistView> getSearchAppointListALL() {
		String hql = "from AppointmentlistView i";
		List<AppointmentlistView> l = getHibernateTemplate().find(hql);
		return l.isEmpty() || l == null ? null : l;
	}





	@Override
	public List<AppointmentlistView> getSearchAppointListALL(String hosname,String dname) {
		String hql = "from AppointmentlistView a where a.hosname=? and a.dname=? group by a.schdate order by a.schdate DESC";
		Object[] parm = { hosname, dname };
		
	
		List<AppointmentlistView> l = getHibernateTemplate().find(hql,parm);
		
		if(l.isEmpty())
		{
			System.out.println("NO LISTT");
		}else{
			System.out.println("Have  LISTT");
		}
		
		return l.isEmpty() || l == null ? null : l;
	}


	@Override
	public List<AppointmentlistView> getDetailAppointListALL(String hosname,
			String dname,Date schdate) {
		System.out.println(hosname+"Hospital Name");
		System.out.println(dname+"Doctor Name");
		System.out.println(schdate);
		String hql = "from AppointmentlistView a where a.hosname=? and a.dname=? and a.schdate=?";
		Object[] parm = { hosname, dname ,schdate };
		
	
		List<AppointmentlistView> l = getHibernateTemplate().find(hql,parm);
		if(l.isEmpty()){
			System.out.println("NO LISTJTTT");
		}else
		{
			System.out.println("HHHHHH LISTJTTT");
		}
			return l.isEmpty() || l == null ? null : l;
	}



}

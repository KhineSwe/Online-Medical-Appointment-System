package com.ictti.omas.dao;

import java.util.Date;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ictti.omas.business.entity.Schedule;

public class ScheduleDaoImpl extends HibernateDaoSupport implements ScheduleDao {

	// for patient
	public List<Schedule> getScheduleByDid(Integer doctorid) {
		String hql = "from Schedule sch where sch.did.id=?";
		List<Schedule> list = getHibernateTemplate().find(hql, doctorid);
		return list.isEmpty() || list == null ? null : list;
	}

	public Schedule getScheduleById(int schid) {
		String hql = "from Schedule s where s.id=?";
		List l = getHibernateTemplate().find(hql, schid);
		return l.isEmpty() || l == null ? null : (Schedule) l.get(0);
	}

	public Schedule getDoctorById(int schid) {
		String hql = "from Schedule s where s.id=?";
		List l = getHibernateTemplate().find(hql, schid);
		return l.isEmpty() || l == null ? null : (Schedule) l.get(0);
	}

	public void saveSchMaxNumber(Schedule sch) {
		getHibernateTemplate().saveOrUpdate(sch);
	}

	public void saveApppatientNo(Schedule s) {
		getHibernateTemplate().saveOrUpdate(s);
	}

	public Schedule getScheduleByDate(Date scheduledate, int docid, int hosid) {
		String hql = "from Schedule s where s.schdate=? and s.did.id=? and s.hosid.id=?";

		Object[] parm = { scheduledate, docid, hosid };
		List l = getHibernateTemplate().find(hql, parm);

		return l.isEmpty() || l == null ? null : (Schedule) l.get(0);

	}

	// for admin

	public void saveAddSchedule(Schedule sch) {
		getHibernateTemplate().saveOrUpdate(sch);
	}

	/*
	 * public List<Schedule> getScheduleDuplicateDate(int docid, int hosid){
	 * String hql="from Schedule s where  and s.did.id=? and s.hosid.id=?";
	 * Object[] parm={docid,hosid}; List<Schedule>
	 * list=getHibernateTemplate().find(hql,parm); return list.isEmpty() || list
	 * == null ? null :list;
	 * 
	 * 
	 * }
	 */

	public List<Schedule> getSchedule(Integer doctorid, Integer hospitalid) {
		String hql = "from Schedule sch where sch.did.id=? and sch.hosid.id=?";
		Object[] parm = { doctorid, hospitalid };
		List list = getHibernateTemplate().find(hql, parm);

		return list.isEmpty() || list == null ? null : list;

	}

	public void saveUpdateSchedule(Schedule sch) {
		getHibernateTemplate().saveOrUpdate(sch);
	}

	public Schedule getHosptialNDoctor(int hosid, int did) {
		System.out.println("HHH" + hosid);
		String hql = "from Schedule i where i.hosid.id=? and i.did.id=?";
		Object[] parm = { hosid, did };
		List l = getHibernateTemplate().find(hql, parm);
		return l.isEmpty() || l == null ? null : (Schedule) l.get(0);
	}

	public Schedule getdoctorListByschedule(String frmHosid, Integer id) {
		String hql = "from Schedule i where i.hosid.id=? and i.did.id=?";
		int hosid = Integer.parseInt(frmHosid);

		Object[] parm = { hosid, id };
		List l = getHibernateTemplate().find(hql, parm);
		return l.isEmpty() || l == null ? null : (Schedule) l.get(0);
	}
	
	


}

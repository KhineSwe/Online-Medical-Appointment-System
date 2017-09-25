package com.ictti.omas.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ictti.omas.business.entity.Appointment;

public class AppointmentDaoImpl extends HibernateDaoSupport implements
		AppointmentDao {
	public Appointment getAppointmentById(int scheduleid) {
		String hql = "from Appointment app where app.schid.id=?";

		List l = getHibernateTemplate().find(hql, scheduleid);
		return l.isEmpty() || l == null ? null : (Appointment) l.get(0);
	}

	public Appointment getAppointmentByIdAndPid(int scheduleid, int pid) {
		String hql = "from Appointment app where app.schid.id=? and app.pid.id=?";
		Object[] parm = { scheduleid, pid };
		List l = getHibernateTemplate().find(hql, parm);
		return l.isEmpty() || l == null ? null : (Appointment) l.get(0);
	}

	public void saveStatus(Appointment app) {
		getHibernateTemplate().saveOrUpdate(app);
	}

	public void saveTokenNumber(Appointment app) {
		getHibernateTemplate().saveOrUpdate(app);
	}

	public void saveToken(Appointment app) {
		getHibernateTemplate().saveOrUpdate(app);
	}

	// for Doctor..........

	public Appointment getAppointmentbyId(int appId) {
		String hql = "from Appointment a where a.id=? ";
		List l = getHibernateTemplate().find(hql, appId);
		return l.isEmpty() || l == null ? null : (Appointment) l.get(0);

	}

	// for rating

	public Appointment getAppointBypid(int pid, int did) {
		String hql = "FROM Appointment a WHERE a.pid.id=? AND a.schid.did.id=?";

		Object[] parm = { pid, did };
		List l = getHibernateTemplate().find(hql, parm);
		return l.isEmpty() || l == null ? null : (Appointment) l.get(0);
	}

}

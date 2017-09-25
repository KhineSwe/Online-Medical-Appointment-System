package com.ictti.omas.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ictti.omas.business.entity.ScheduleView;

public class ScheduleViewDaoImpl extends HibernateDaoSupport implements
		ScheduleViewDao {

	public ScheduleView getScheduleById(int schid) {
		String hql = "from ScheduleView sch where sch.id=?";
		List<ScheduleView> list = getHibernateTemplate().find(hql, schid);
		return list.isEmpty() || list == null ? null : list.get(0);
	}

	public List<ScheduleView> getListAll() {
		String hql = "from ScheduleView sch";
		List<ScheduleView> list = getHibernateTemplate().find(hql);
		return list.isEmpty() || list == null ? null : list;

	}

}

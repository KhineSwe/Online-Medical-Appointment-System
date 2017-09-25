package com.ictti.omas.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ictti.omas.business.entity.HosSpec;

public class HosSpecDaoImpl extends HibernateDaoSupport implements HosSpecDao {
	public List<HosSpec> getBySpecialize(String hospitalId) {
		int sid = Integer.valueOf(hospitalId);
		String hql = "from HosSpec s where s.hosid.id=?";
		List<HosSpec> list = getHibernateTemplate().find(hql, sid);
		return list;
	}

}

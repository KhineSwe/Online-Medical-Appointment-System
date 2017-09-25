package com.ictti.omas.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ictti.omas.business.entity.Rating;

public class RatingDaoImpl extends HibernateDaoSupport implements RatingDao {
	public List<Rating> getDrateValue(int did){
		String hql="from Rating r where r.did.id=?";	
			List l=getHibernateTemplate().find(hql,did);
			System.out.print("hi" +  l);
			return l.isEmpty() || l==null ? null : l;
	}
	
	public Rating getRateValue(int pid, int did) {
		String hql = "FROM Rating r WHERE r.pid.id=? AND r.did.id=?";
		Object[] parm = { pid, did };
		List l = getHibernateTemplate().find(hql, parm);
		return l.isEmpty() || l == null ? null : (Rating) l.get(0);
	}
	public void saveRate(Rating myRate){
		getHibernateTemplate().saveOrUpdate(myRate);
	}
}

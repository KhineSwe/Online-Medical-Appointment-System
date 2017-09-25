package com.ictti.frame.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ictti.frame.business.entity.IcttiCourse;

public class IcttiCourseDaoImpl extends HibernateDaoSupport implements
		IcttiCourseDao {

	@Override
	public List<IcttiCourse> getAllCourse() {
		List l=getHibernateTemplate().find("from IcttiCourse");
		return l.isEmpty() || l==null ? null : l;
	}
	
	
	public IcttiCourse getCourseById(Integer id) {
		List l=getHibernateTemplate().find("from IcttiCourse i where i.id=?",id);
		return l.isEmpty() || l==null ? null : (IcttiCourse) l.get(0);
		}
}

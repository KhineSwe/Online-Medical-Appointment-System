package com.ictti.frame.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ictti.frame.business.entity.IcttiStudent;

public class IcttiStudentDaoImpl extends HibernateDaoSupport implements
		IcttiStudentDao {

	@Override
	public IcttiStudent getStudentByLoginNameAndPassword(String strName,
			String strPassword) {
		String hql="from IcttiStudent i where i.studentLoginName=? and i.studentPassword=?";
				Object[] parm={strName,strPassword};
				List l=getHibernateTemplate().find(hql,parm);
				return l.isEmpty() || l==null ? null : (IcttiStudent)
				l.get(0);
	}
	
	public IcttiStudent getStudentByAccountName(String accountName) {
		String hql="from IcttiStudent i where i.studentAccountName=?";
		List l=getHibernateTemplate().find(hql,accountName);
		return l.isEmpty() || l==null ? null : (IcttiStudent) l.get(0);
		}
		@Override
		public void saveStudent(IcttiStudent stu) {
		getHibernateTemplate().saveOrUpdate(stu);
		}

}

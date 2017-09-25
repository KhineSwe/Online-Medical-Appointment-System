package com.ictti.omas.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;






import com.ictti.omas.business.entity.Treatment;
import com.ictti.omas.business.entity.TreatmentView;

public class TreatmentDaoImpl extends HibernateDaoSupport implements
		TreatmentDao {

	@Override
	public List<TreatmentView> getTreatmentListALL(String demail) {
	   
	
		String hql="from TreatmentView tr where tr.demail=? order by tr.treatmentdt DESC";
		List<TreatmentView> l=getHibernateTemplate().find(hql,demail);
		System.out.println(l);
		return l.isEmpty()||l==null? null:l;
	}
	
	@Override
	public TreatmentView getTreatmentById(Integer treatmentId) {
		// TODO Auto-generated method stub
		
		String hql="from TreatmentView tr where tr.id=?";
		List<TreatmentView> list=getHibernateTemplate().find(hql,treatmentId);
		return list.isEmpty()||list==null? null:list.get(0);
	}
	
	public List<TreatmentView> getTreatmentListByName(String a_strName){
		
		String hql="from TreatmentView t where t.pname like ? group by pname ";
		List<TreatmentView> l=getHibernateTemplate().find(hql,a_strName+"%");
		return l;
	}
	
	
	public List<TreatmentView> getTreatmentPatientListALL(String demail,String pname) {
		   
		String hql="from TreatmentView tr where tr.demail=? and tr.pname=? order by tr.treatmentdt DESC ";
		Object[] parm={demail,pname};
		List<TreatmentView> l=getHibernateTemplate().find(hql,parm);
		System.out.println(l);
		return l.isEmpty()||l==null? null:l;
	}
	
	public void saveNewTreatment(Treatment myTreatment){
		getHibernateTemplate().saveOrUpdate(myTreatment);
	}
	
	// for Doctor
	
	
	
	
	
	
}

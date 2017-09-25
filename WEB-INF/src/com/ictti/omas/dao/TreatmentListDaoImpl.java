package com.ictti.omas.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ictti.omas.business.entity.TreatmentlistView;

public class TreatmentListDaoImpl extends HibernateDaoSupport implements
		TreatmentListDao {

	@Override
	public TreatmentlistView getTreatmentById(Integer treatmentId) {
		String hql = "from TreatmentlistView i where i.id=?";
		List<TreatmentlistView> list = getHibernateTemplate().find(hql,
				treatmentId);

		return list.isEmpty() || list == null ? null : list.get(0);
	}

	public List<TreatmentlistView> getHospitalListByName(String strName) {
		String hql = "from TreatmentlistView i where i.hosname like ?";
		List<TreatmentlistView> l = getHibernateTemplate().find(hql,
				strName + "%");
		return l.isEmpty() || l == null ? null : l;
	}

	@Override
	public List<TreatmentlistView> getHospitalListALL(String pemail,
			String hname) {
		String hql = "from TreatmentlistView tr where tr.pemail=? and tr.hosname=? ORDER BY tr.treatmentdt DESC";
		Object[] parm = { pemail, hname };
		List<TreatmentlistView> l = getHibernateTemplate().find(hql, parm);

		return l.isEmpty() || l == null ? null : l;
	}

	public List<TreatmentlistView> getTreatmentListALL(String pemail) {
		String hql = "from TreatmentlistView i where i.pemail=? ORDER BY i.treatmentdt DESC";
		List<TreatmentlistView> l = getHibernateTemplate().find(hql, pemail);
		
		return l.isEmpty() || l == null ? null : l;
	}

	@Override
	public List<TreatmentlistView> getDoctorListALL(String pemail, String dname) {

		String hql = "from TreatmentlistView tr where tr.pemail=? and tr.dname=? ORDER BY tr.treatmentdt DESC";
		Object[] parm = { pemail, dname };
		List<TreatmentlistView> l = getHibernateTemplate().find(hql, parm);
		System.out.println(l);
		return l.isEmpty() || l == null ? null : l;
	}

	public List<TreatmentlistView> getSpecializeListALL(String pemail,
			String specializetype) {

		String hql = "from TreatmentlistView tr where tr.pemail=? and tr.specializetype=?  ORDER BY tr.treatmentdt DESC";
		Object[] parm = { pemail, specializetype };
		List<TreatmentlistView> l = getHibernateTemplate().find(hql, parm);

		return l.isEmpty() || l == null ? null : l;
	}

}

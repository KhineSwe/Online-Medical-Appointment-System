package com.ictti.omas.business.entity;

import com.ictti.omas.business.entity.base.BaseDoctorlistView;



public class DoctorlistView extends BaseDoctorlistView {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public DoctorlistView () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public DoctorlistView (java.lang.Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public DoctorlistView (
		java.lang.Integer id,
		java.lang.String dname,
		java.util.Date dregdate,
		java.lang.String demail,
		java.lang.String dpwd,
		java.lang.String dgender,
		java.lang.Integer dstatus,
		java.lang.String specializetype,
		java.lang.String hosname) {

		super (
			id,
			dname,
			dregdate,
			demail,
			dpwd,
			dgender,
			dstatus,
			specializetype,
			hosname);
	}

/*[CONSTRUCTOR MARKER END]*/


}
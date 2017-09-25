package com.ictti.omas.business.entity;

import com.ictti.omas.business.entity.base.BaseAppointView;



public class AppointView extends BaseAppointView {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public AppointView () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public AppointView (java.lang.Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public AppointView (
		java.lang.Integer id,
		java.lang.String pname,
		java.lang.String pgender,
		java.lang.String hosname,
		java.util.Date schdate,
		java.lang.Integer schstarttime,
		java.lang.Integer schfinishtime,
		java.lang.String dname,
		java.lang.String demail) {

		super (
			id,
			pname,
			pgender,
			hosname,
			schdate,
			schstarttime,
			schfinishtime,
			dname,
			demail);
	}

/*[CONSTRUCTOR MARKER END]*/


}
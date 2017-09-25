package com.ictti.omas.business.entity;

import com.ictti.omas.business.entity.base.BaseDoctorstatuslistView;



public class DoctorstatuslistView extends BaseDoctorstatuslistView {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public DoctorstatuslistView () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public DoctorstatuslistView (java.lang.Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public DoctorstatuslistView (
		java.lang.Integer id,
		java.lang.String dname,
		java.util.Date dregdate,
		java.util.Date schdate) {

		super (
			id,
			dname,
			dregdate,
			schdate);
	}

/*[CONSTRUCTOR MARKER END]*/


}
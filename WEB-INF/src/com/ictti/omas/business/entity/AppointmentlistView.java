package com.ictti.omas.business.entity;

import com.ictti.omas.business.entity.base.BaseAppointmentlistView;



public class AppointmentlistView extends BaseAppointmentlistView {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public AppointmentlistView () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public AppointmentlistView (java.lang.Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public AppointmentlistView (
		java.lang.Integer id,
		java.lang.String pname,
		java.lang.String pemail,
		java.util.Date appointmentdt,
		java.lang.String hosname,
		java.util.Date schdate,
		java.lang.Integer schstarttime,
		java.lang.Integer schfinishtime,
		java.lang.String dname,
		java.lang.String demail) {

		super (
			id,
			pname,
			pemail,
			appointmentdt,
			hosname,
			schdate,
			schstarttime,
			schfinishtime,
			dname,
			demail);
	}

/*[CONSTRUCTOR MARKER END]*/


}
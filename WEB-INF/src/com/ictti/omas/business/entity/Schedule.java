package com.ictti.omas.business.entity;

import com.ictti.omas.business.entity.base.BaseSchedule;



public class Schedule extends BaseSchedule {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Schedule () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Schedule (java.lang.Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public Schedule (
		java.lang.Integer id,
		java.util.Date schdate,
		java.lang.Integer schstarttime,
		java.lang.Integer schfinishtime) {

		super (
			id,
			schdate,
			schstarttime,
			schfinishtime);
	}

/*[CONSTRUCTOR MARKER END]*/


}
package com.ictti.omas.business.entity;

import com.ictti.omas.business.entity.base.BaseScheduleView;



public class ScheduleView extends BaseScheduleView {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public ScheduleView () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public ScheduleView (java.lang.Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public ScheduleView (
		java.lang.Integer id,
		java.util.Date schdate,
		java.lang.Integer schstarttime,
		java.lang.Integer schfinishtime,
		java.lang.String specializetype,
		java.lang.String hosname,
		java.lang.String dname) {

		super (
			id,
			schdate,
			schstarttime,
			schfinishtime,
			specializetype,
			hosname,
			dname);
	}

/*[CONSTRUCTOR MARKER END]*/


}
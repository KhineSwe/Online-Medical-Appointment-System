package com.ictti.omas.business.entity;

import com.ictti.omas.business.entity.base.BasePatientappointmentlistView;



public class PatientappointmentlistView extends BasePatientappointmentlistView {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public PatientappointmentlistView () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public PatientappointmentlistView (java.lang.Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public PatientappointmentlistView (
		java.lang.Integer id,
		java.util.Date pregdate) {

		super (
			id,
			pregdate);
	}

/*[CONSTRUCTOR MARKER END]*/


}
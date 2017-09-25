package com.ictti.omas.business.entity;

import com.ictti.omas.business.entity.base.BasePatient;



public class Patient extends BasePatient {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Patient () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Patient (java.lang.Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public Patient (
		java.lang.Integer id,
		java.lang.String pname,
		java.lang.String ppwd,
		java.lang.String pgender,
		java.util.Date pregdate,
		java.lang.Integer pstatus) {

		super (
			id,
			pname,
			ppwd,
			pgender,
			pregdate,
			pstatus);
	}

/*[CONSTRUCTOR MARKER END]*/


}
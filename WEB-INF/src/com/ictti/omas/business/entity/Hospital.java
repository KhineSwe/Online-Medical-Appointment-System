package com.ictti.omas.business.entity;

import com.ictti.omas.business.entity.base.BaseHospital;



public class Hospital extends BaseHospital {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Hospital () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Hospital (java.lang.Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public Hospital (
		java.lang.Integer id,
		java.lang.String hosname,
		java.lang.String hosaddress) {

		super (
			id,
			hosname,
			hosaddress);
	}

/*[CONSTRUCTOR MARKER END]*/


}
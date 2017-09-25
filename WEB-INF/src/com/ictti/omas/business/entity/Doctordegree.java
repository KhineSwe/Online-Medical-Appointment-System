package com.ictti.omas.business.entity;

import com.ictti.omas.business.entity.base.BaseDoctordegree;



public class Doctordegree extends BaseDoctordegree {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Doctordegree () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Doctordegree (java.lang.Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public Doctordegree (
		java.lang.Integer id,
		com.ictti.omas.business.entity.Doctor did) {

		super (
			id,
			did);
	}

/*[CONSTRUCTOR MARKER END]*/


}
package com.ictti.omas.business.entity;

import com.ictti.omas.business.entity.base.BaseSpecialize;



public class Specialize extends BaseSpecialize {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Specialize () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Specialize (java.lang.Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public Specialize (
		java.lang.Integer id,
		java.lang.String specializetype) {

		super (
			id,
			specializetype);
	}

/*[CONSTRUCTOR MARKER END]*/


}
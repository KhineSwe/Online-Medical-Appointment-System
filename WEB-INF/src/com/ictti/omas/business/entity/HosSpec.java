package com.ictti.omas.business.entity;

import com.ictti.omas.business.entity.base.BaseHosSpec;



public class HosSpec extends BaseHosSpec {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public HosSpec () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public HosSpec (java.lang.Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public HosSpec (
		java.lang.Integer id,
		java.lang.String specializetype) {

		super (
			id,
			specializetype);
	}

/*[CONSTRUCTOR MARKER END]*/


}
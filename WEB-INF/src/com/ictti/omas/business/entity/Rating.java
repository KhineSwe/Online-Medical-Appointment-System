package com.ictti.omas.business.entity;

import com.ictti.omas.business.entity.base.BaseRating;



public class Rating extends BaseRating {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Rating () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Rating (java.lang.Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public Rating (
		java.lang.Integer id,
		java.lang.Integer rateValue) {

		super (
			id,
			rateValue);
	}

/*[CONSTRUCTOR MARKER END]*/


}
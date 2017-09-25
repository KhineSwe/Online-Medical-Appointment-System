package com.ictti.omas.business.entity;

import com.ictti.omas.business.entity.base.BaseTreatment;



public class Treatment extends BaseTreatment {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Treatment () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Treatment (java.lang.Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public Treatment (
		java.lang.Integer id,
		java.lang.String disease,
		java.util.Date treatmentdt) {

		super (
			id,
			disease,
			treatmentdt);
	}

/*[CONSTRUCTOR MARKER END]*/


}
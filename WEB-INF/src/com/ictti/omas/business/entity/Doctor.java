package com.ictti.omas.business.entity;

import com.ictti.omas.business.entity.base.BaseDoctor;



public class Doctor extends BaseDoctor {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Doctor () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Doctor (java.lang.Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public Doctor (
		java.lang.Integer id,
		com.ictti.omas.business.entity.Specialize spid,
		java.lang.String dname,
		java.lang.String demail,
		java.lang.String dpwd,
		java.lang.String dgender,
		java.util.Date dregdate,
		java.lang.Integer dstatus) {

		super (
			id,
			spid,
			dname,
			demail,
			dpwd,
			dgender,
			dregdate,
			dstatus);
	}

/*[CONSTRUCTOR MARKER END]*/


}
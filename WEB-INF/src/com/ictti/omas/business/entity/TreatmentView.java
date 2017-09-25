package com.ictti.omas.business.entity;

import com.ictti.omas.business.entity.base.BaseTreatmentView;



public class TreatmentView extends BaseTreatmentView {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public TreatmentView () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public TreatmentView (java.lang.Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public TreatmentView (
		java.lang.Integer id,
		java.lang.String treatment,
		java.lang.String disease,
		java.util.Date treatmentdt,
		java.lang.String pname,
		java.lang.String pblood,
		java.util.Date appointmentdt,
		java.lang.String hosname,
		java.util.Date schdate,
		java.lang.String dname,
		java.lang.String demail) {

		super (
			id,
			treatment,
			disease,
			treatmentdt,
			pname,
			pblood,
			appointmentdt,
			hosname,
			schdate,
			dname,
			demail);
	}

/*[CONSTRUCTOR MARKER END]*/


}
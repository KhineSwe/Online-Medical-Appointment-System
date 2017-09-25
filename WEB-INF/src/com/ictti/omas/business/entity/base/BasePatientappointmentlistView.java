package com.ictti.omas.business.entity.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the patientappointmentlist_view table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="patientappointmentlist_view"
 */

public abstract class BasePatientappointmentlistView  implements Serializable {

	public static String REF = "PatientappointmentlistView";
	public static String PROP_PREGDATE = "pregdate";
	public static String PROP_ID = "id";
	public static String PROP_APPOINTMENTDT = "appointmentdt";


	// constructors
	public BasePatientappointmentlistView () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BasePatientappointmentlistView (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BasePatientappointmentlistView (
		java.lang.Integer id,
		java.util.Date pregdate) {

		this.setId(id);
		this.setPregdate(pregdate);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.util.Date pregdate;
	private java.util.Date appointmentdt;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="identity"
     *  column="pid"
     */
	public java.lang.Integer getId () {
		return id;
	}

	/**
	 * Set the unique identifier of this class
	 * @param id the new ID
	 */
	public void setId (java.lang.Integer id) {
		this.id = id;
		this.hashCode = Integer.MIN_VALUE;
	}




	/**
	 * Return the value associated with the column: pregdate
	 */
	public java.util.Date getPregdate () {
		return pregdate;
	}

	/**
	 * Set the value related to the column: pregdate
	 * @param pregdate the pregdate value
	 */
	public void setPregdate (java.util.Date pregdate) {
		this.pregdate = pregdate;
	}



	/**
	 * Return the value associated with the column: appointmentdt
	 */
	public java.util.Date getAppointmentdt () {
		return appointmentdt;
	}

	/**
	 * Set the value related to the column: appointmentdt
	 * @param appointmentdt the appointmentdt value
	 */
	public void setAppointmentdt (java.util.Date appointmentdt) {
		this.appointmentdt = appointmentdt;
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.ictti.omas.business.entity.PatientappointmentlistView)) return false;
		else {
			com.ictti.omas.business.entity.PatientappointmentlistView patientappointmentlistView = (com.ictti.omas.business.entity.PatientappointmentlistView) obj;
			if (null == this.getId() || null == patientappointmentlistView.getId()) return false;
			else return (this.getId().equals(patientappointmentlistView.getId()));
		}
	}

	public int hashCode () {
		if (Integer.MIN_VALUE == this.hashCode) {
			if (null == this.getId()) return super.hashCode();
			else {
				String hashStr = this.getClass().getName() + ":" + this.getId().hashCode();
				this.hashCode = hashStr.hashCode();
			}
		}
		return this.hashCode;
	}


	public String toString () {
		return super.toString();
	}


}
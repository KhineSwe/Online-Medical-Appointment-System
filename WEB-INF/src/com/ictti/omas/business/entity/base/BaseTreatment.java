package com.ictti.omas.business.entity.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the treatment table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="treatment"
 */

public abstract class BaseTreatment  implements Serializable {

	public static String REF = "Treatment";
	public static String PROP_DISEASE = "disease";
	public static String PROP_TREATMENTDT = "treatmentdt";
	public static String PROP_DNOTE = "dnote";
	public static String PROP_APPOINTMENTID = "appointmentid";
	public static String PROP_ID = "id";
	public static String PROP_TREATMENT = "treatment";


	// constructors
	public BaseTreatment () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseTreatment (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseTreatment (
		java.lang.Integer id,
		java.lang.String disease,
		java.util.Date treatmentdt) {

		this.setId(id);
		this.setDisease(disease);
		this.setTreatmentdt(treatmentdt);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.lang.String disease;
	private java.lang.String dnote;
	private java.lang.String treatment;
	private java.util.Date treatmentdt;

	// many to one
	private com.ictti.omas.business.entity.Appointment appointmentid;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="identity"
     *  column="treatmentid"
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
	 * Return the value associated with the column: disease
	 */
	public java.lang.String getDisease () {
		return disease;
	}

	/**
	 * Set the value related to the column: disease
	 * @param disease the disease value
	 */
	public void setDisease (java.lang.String disease) {
		this.disease = disease;
	}



	/**
	 * Return the value associated with the column: dnote
	 */
	public java.lang.String getDnote () {
		return dnote;
	}

	/**
	 * Set the value related to the column: dnote
	 * @param dnote the dnote value
	 */
	public void setDnote (java.lang.String dnote) {
		this.dnote = dnote;
	}



	/**
	 * Return the value associated with the column: treatment
	 */
	public java.lang.String getTreatment () {
		return treatment;
	}

	/**
	 * Set the value related to the column: treatment
	 * @param treatment the treatment value
	 */
	public void setTreatment (java.lang.String treatment) {
		this.treatment = treatment;
	}



	/**
	 * Return the value associated with the column: treatmentdt
	 */
	public java.util.Date getTreatmentdt () {
		return treatmentdt;
	}

	/**
	 * Set the value related to the column: treatmentdt
	 * @param treatmentdt the treatmentdt value
	 */
	public void setTreatmentdt (java.util.Date treatmentdt) {
		this.treatmentdt = treatmentdt;
	}



	/**
	 * Return the value associated with the column: appointmentid
	 */
	public com.ictti.omas.business.entity.Appointment getAppointmentid () {
		return appointmentid;
	}

	/**
	 * Set the value related to the column: appointmentid
	 * @param appointmentid the appointmentid value
	 */
	public void setAppointmentid (com.ictti.omas.business.entity.Appointment appointmentid) {
		this.appointmentid = appointmentid;
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.ictti.omas.business.entity.Treatment)) return false;
		else {
			com.ictti.omas.business.entity.Treatment treatment = (com.ictti.omas.business.entity.Treatment) obj;
			if (null == this.getId() || null == treatment.getId()) return false;
			else return (this.getId().equals(treatment.getId()));
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
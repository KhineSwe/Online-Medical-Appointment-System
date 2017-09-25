package com.ictti.omas.business.entity.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the appointment table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="appointment"
 */

public abstract class BaseAppointment  implements Serializable {

	public static String REF = "Appointment";
	public static String PROP_STATUS = "status";
	public static String PROP_SCHID = "schid";
	public static String PROP_ID = "id";
	public static String PROP_APPOINTMENTDT = "appointmentdt";
	public static String PROP_TOKENNO = "tokenno";
	public static String PROP_PID = "pid";


	// constructors
	public BaseAppointment () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseAppointment (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.util.Date appointmentdt;
	private java.lang.Integer status;
	private java.lang.String tokenno;

	// many to one
	private com.ictti.omas.business.entity.Patient pid;
	private com.ictti.omas.business.entity.Schedule schid;

	// collections
	private java.util.Set<com.ictti.omas.business.entity.Treatment> treatments;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="identity"
     *  column="appointmentid"
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



	/**
	 * Return the value associated with the column: status
	 */
	public java.lang.Integer getStatus () {
		return status;
	}

	/**
	 * Set the value related to the column: status
	 * @param status the status value
	 */
	public void setStatus (java.lang.Integer status) {
		this.status = status;
	}



	/**
	 * Return the value associated with the column: tokenno
	 */
	public java.lang.String getTokenno () {
		return tokenno;
	}

	/**
	 * Set the value related to the column: tokenno
	 * @param tokenno the tokenno value
	 */
	public void setTokenno (java.lang.String tokenno) {
		this.tokenno = tokenno;
	}



	/**
	 * Return the value associated with the column: pid
	 */
	public com.ictti.omas.business.entity.Patient getPid () {
		return pid;
	}

	/**
	 * Set the value related to the column: pid
	 * @param pid the pid value
	 */
	public void setPid (com.ictti.omas.business.entity.Patient pid) {
		this.pid = pid;
	}



	/**
	 * Return the value associated with the column: schid
	 */
	public com.ictti.omas.business.entity.Schedule getSchid () {
		return schid;
	}

	/**
	 * Set the value related to the column: schid
	 * @param schid the schid value
	 */
	public void setSchid (com.ictti.omas.business.entity.Schedule schid) {
		this.schid = schid;
	}



	/**
	 * Return the value associated with the column: treatments
	 */
	public java.util.Set<com.ictti.omas.business.entity.Treatment> getTreatments () {
		return treatments;
	}

	/**
	 * Set the value related to the column: treatments
	 * @param treatments the treatments value
	 */
	public void setTreatments (java.util.Set<com.ictti.omas.business.entity.Treatment> treatments) {
		this.treatments = treatments;
	}

	public void addTotreatments (com.ictti.omas.business.entity.Treatment treatment) {
		if (null == getTreatments()) setTreatments(new java.util.TreeSet<com.ictti.omas.business.entity.Treatment>());
		getTreatments().add(treatment);
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.ictti.omas.business.entity.Appointment)) return false;
		else {
			com.ictti.omas.business.entity.Appointment appointment = (com.ictti.omas.business.entity.Appointment) obj;
			if (null == this.getId() || null == appointment.getId()) return false;
			else return (this.getId().equals(appointment.getId()));
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
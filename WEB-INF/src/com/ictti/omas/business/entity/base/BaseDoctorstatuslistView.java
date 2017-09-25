package com.ictti.omas.business.entity.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the doctorstatuslist_view table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="doctorstatuslist_view"
 */

public abstract class BaseDoctorstatuslistView  implements Serializable {

	public static String REF = "DoctorstatuslistView";
	public static String PROP_DREGDATE = "dregdate";
	public static String PROP_ID = "id";
	public static String PROP_DNAME = "dname";
	public static String PROP_APPOINTMENTDT = "appointmentdt";
	public static String PROP_SCHDATE = "schdate";


	// constructors
	public BaseDoctorstatuslistView () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseDoctorstatuslistView (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseDoctorstatuslistView (
		java.lang.Integer id,
		java.lang.String dname,
		java.util.Date dregdate,
		java.util.Date schdate) {

		this.setId(id);
		this.setDname(dname);
		this.setDregdate(dregdate);
		this.setSchdate(schdate);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.lang.String dname;
	private java.util.Date dregdate;
	private java.util.Date appointmentdt;
	private java.util.Date schdate;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="identity"
     *  column="did"
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
	 * Return the value associated with the column: dname
	 */
	public java.lang.String getDname () {
		return dname;
	}

	/**
	 * Set the value related to the column: dname
	 * @param dname the dname value
	 */
	public void setDname (java.lang.String dname) {
		this.dname = dname;
	}



	/**
	 * Return the value associated with the column: dregdate
	 */
	public java.util.Date getDregdate () {
		return dregdate;
	}

	/**
	 * Set the value related to the column: dregdate
	 * @param dregdate the dregdate value
	 */
	public void setDregdate (java.util.Date dregdate) {
		this.dregdate = dregdate;
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
	 * Return the value associated with the column: schdate
	 */
	public java.util.Date getSchdate () {
		return schdate;
	}

	/**
	 * Set the value related to the column: schdate
	 * @param schdate the schdate value
	 */
	public void setSchdate (java.util.Date schdate) {
		this.schdate = schdate;
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.ictti.omas.business.entity.DoctorstatuslistView)) return false;
		else {
			com.ictti.omas.business.entity.DoctorstatuslistView doctorstatuslistView = (com.ictti.omas.business.entity.DoctorstatuslistView) obj;
			if (null == this.getId() || null == doctorstatuslistView.getId()) return false;
			else return (this.getId().equals(doctorstatuslistView.getId()));
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
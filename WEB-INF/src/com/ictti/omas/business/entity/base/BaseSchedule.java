package com.ictti.omas.business.entity.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the schedule table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="schedule"
 */

public abstract class BaseSchedule  implements Serializable {

	public static String REF = "Schedule";
	public static String PROP_APPPATIENTNO = "apppatientno";
	public static String PROP_SCHFINISHTIME = "schfinishtime";
	public static String PROP_SCHSTARTTIME = "schstarttime";
	public static String PROP_DID = "did";
	public static String PROP_SCHMAXNO = "schmaxno";
	public static String PROP_ID = "id";
	public static String PROP_HOSID = "hosid";
	public static String PROP_SCHDATE = "schdate";


	// constructors
	public BaseSchedule () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseSchedule (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseSchedule (
		java.lang.Integer id,
		java.util.Date schdate,
		java.lang.Integer schstarttime,
		java.lang.Integer schfinishtime) {

		this.setId(id);
		this.setSchdate(schdate);
		this.setSchstarttime(schstarttime);
		this.setSchfinishtime(schfinishtime);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.util.Date schdate;
	private java.lang.Integer schmaxno;
	private java.lang.Integer apppatientno;
	private java.lang.Integer schstarttime;
	private java.lang.Integer schfinishtime;

	// many to one
	private com.ictti.omas.business.entity.Doctor did;
	private com.ictti.omas.business.entity.Hospital hosid;

	// collections
	private java.util.Set<com.ictti.omas.business.entity.Appointment> appointments;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="identity"
     *  column="schid"
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



	/**
	 * Return the value associated with the column: schmaxno
	 */
	public java.lang.Integer getSchmaxno () {
		return schmaxno;
	}

	/**
	 * Set the value related to the column: schmaxno
	 * @param schmaxno the schmaxno value
	 */
	public void setSchmaxno (java.lang.Integer schmaxno) {
		this.schmaxno = schmaxno;
	}



	/**
	 * Return the value associated with the column: apppatientno
	 */
	public java.lang.Integer getApppatientno () {
		return apppatientno;
	}

	/**
	 * Set the value related to the column: apppatientno
	 * @param apppatientno the apppatientno value
	 */
	public void setApppatientno (java.lang.Integer apppatientno) {
		this.apppatientno = apppatientno;
	}



	/**
	 * Return the value associated with the column: schstarttime
	 */
	public java.lang.Integer getSchstarttime () {
		return schstarttime;
	}

	/**
	 * Set the value related to the column: schstarttime
	 * @param schstarttime the schstarttime value
	 */
	public void setSchstarttime (java.lang.Integer schstarttime) {
		this.schstarttime = schstarttime;
	}



	/**
	 * Return the value associated with the column: schfinishtime
	 */
	public java.lang.Integer getSchfinishtime () {
		return schfinishtime;
	}

	/**
	 * Set the value related to the column: schfinishtime
	 * @param schfinishtime the schfinishtime value
	 */
	public void setSchfinishtime (java.lang.Integer schfinishtime) {
		this.schfinishtime = schfinishtime;
	}



	/**
	 * Return the value associated with the column: did
	 */
	public com.ictti.omas.business.entity.Doctor getDid () {
		return did;
	}

	/**
	 * Set the value related to the column: did
	 * @param did the did value
	 */
	public void setDid (com.ictti.omas.business.entity.Doctor did) {
		this.did = did;
	}



	/**
	 * Return the value associated with the column: hosid
	 */
	public com.ictti.omas.business.entity.Hospital getHosid () {
		return hosid;
	}

	/**
	 * Set the value related to the column: hosid
	 * @param hosid the hosid value
	 */
	public void setHosid (com.ictti.omas.business.entity.Hospital hosid) {
		this.hosid = hosid;
	}



	/**
	 * Return the value associated with the column: appointments
	 */
	public java.util.Set<com.ictti.omas.business.entity.Appointment> getAppointments () {
		return appointments;
	}

	/**
	 * Set the value related to the column: appointments
	 * @param appointments the appointments value
	 */
	public void setAppointments (java.util.Set<com.ictti.omas.business.entity.Appointment> appointments) {
		this.appointments = appointments;
	}

	public void addToappointments (com.ictti.omas.business.entity.Appointment appointment) {
		if (null == getAppointments()) setAppointments(new java.util.TreeSet<com.ictti.omas.business.entity.Appointment>());
		getAppointments().add(appointment);
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.ictti.omas.business.entity.Schedule)) return false;
		else {
			com.ictti.omas.business.entity.Schedule schedule = (com.ictti.omas.business.entity.Schedule) obj;
			if (null == this.getId() || null == schedule.getId()) return false;
			else return (this.getId().equals(schedule.getId()));
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
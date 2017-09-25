package com.ictti.omas.business.entity.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the doctor table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="doctor"
 */

public abstract class BaseDoctor  implements Serializable {

	public static String REF = "Doctor";
	public static String PROP_DADDRESS = "daddress";
	public static String PROP_SPID = "spid";
	public static String PROP_DGENDER = "dgender";
	public static String PROP_DREGDATE = "dregdate";
	public static String PROP_DPWD = "dpwd";
	public static String PROP_ID = "id";
	public static String PROP_DNAME = "dname";
	public static String PROP_DEMAIL = "demail";
	public static String PROP_DSTATUS = "dstatus";
	public static String PROP_DPHNO = "dphno";


	// constructors
	public BaseDoctor () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseDoctor (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseDoctor (
		java.lang.Integer id,
		com.ictti.omas.business.entity.Specialize spid,
		java.lang.String dname,
		java.lang.String demail,
		java.lang.String dpwd,
		java.lang.String dgender,
		java.util.Date dregdate,
		java.lang.Integer dstatus) {

		this.setId(id);
		this.setSpid(spid);
		this.setDname(dname);
		this.setDemail(demail);
		this.setDpwd(dpwd);
		this.setDgender(dgender);
		this.setDregdate(dregdate);
		this.setDstatus(dstatus);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.lang.String daddress;
	private java.lang.String demail;
	private java.lang.String dgender;
	private java.lang.String dname;
	private java.lang.String dphno;
	private java.lang.String dpwd;
	private java.util.Date dregdate;
	private java.lang.Integer dstatus;

	// many to one
	private com.ictti.omas.business.entity.Specialize spid;

	// collections
	private java.util.Set<com.ictti.omas.business.entity.Doctordegree> doctordegrees;
	private java.util.Set<com.ictti.omas.business.entity.Rating> ratings;
	private java.util.Set<com.ictti.omas.business.entity.Schedule> schedules;



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
	 * Return the value associated with the column: daddress
	 */
	public java.lang.String getDaddress () {
		return daddress;
	}

	/**
	 * Set the value related to the column: daddress
	 * @param daddress the daddress value
	 */
	public void setDaddress (java.lang.String daddress) {
		this.daddress = daddress;
	}



	/**
	 * Return the value associated with the column: demail
	 */
	public java.lang.String getDemail () {
		return demail;
	}

	/**
	 * Set the value related to the column: demail
	 * @param demail the demail value
	 */
	public void setDemail (java.lang.String demail) {
		this.demail = demail;
	}



	/**
	 * Return the value associated with the column: dgender
	 */
	public java.lang.String getDgender () {
		return dgender;
	}

	/**
	 * Set the value related to the column: dgender
	 * @param dgender the dgender value
	 */
	public void setDgender (java.lang.String dgender) {
		this.dgender = dgender;
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
	 * Return the value associated with the column: dphno
	 */
	public java.lang.String getDphno () {
		return dphno;
	}

	/**
	 * Set the value related to the column: dphno
	 * @param dphno the dphno value
	 */
	public void setDphno (java.lang.String dphno) {
		this.dphno = dphno;
	}



	/**
	 * Return the value associated with the column: dpwd
	 */
	public java.lang.String getDpwd () {
		return dpwd;
	}

	/**
	 * Set the value related to the column: dpwd
	 * @param dpwd the dpwd value
	 */
	public void setDpwd (java.lang.String dpwd) {
		this.dpwd = dpwd;
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
	 * Return the value associated with the column: dstatus
	 */
	public java.lang.Integer getDstatus () {
		return dstatus;
	}

	/**
	 * Set the value related to the column: dstatus
	 * @param dstatus the dstatus value
	 */
	public void setDstatus (java.lang.Integer dstatus) {
		this.dstatus = dstatus;
	}



	/**
	 * Return the value associated with the column: spid
	 */
	public com.ictti.omas.business.entity.Specialize getSpid () {
		return spid;
	}

	/**
	 * Set the value related to the column: spid
	 * @param spid the spid value
	 */
	public void setSpid (com.ictti.omas.business.entity.Specialize spid) {
		this.spid = spid;
	}



	/**
	 * Return the value associated with the column: doctordegrees
	 */
	public java.util.Set<com.ictti.omas.business.entity.Doctordegree> getDoctordegrees () {
		return doctordegrees;
	}

	/**
	 * Set the value related to the column: doctordegrees
	 * @param doctordegrees the doctordegrees value
	 */
	public void setDoctordegrees (java.util.Set<com.ictti.omas.business.entity.Doctordegree> doctordegrees) {
		this.doctordegrees = doctordegrees;
	}

	public void addTodoctordegrees (com.ictti.omas.business.entity.Doctordegree doctordegree) {
		if (null == getDoctordegrees()) setDoctordegrees(new java.util.TreeSet<com.ictti.omas.business.entity.Doctordegree>());
		getDoctordegrees().add(doctordegree);
	}



	/**
	 * Return the value associated with the column: ratings
	 */
	public java.util.Set<com.ictti.omas.business.entity.Rating> getRatings () {
		return ratings;
	}

	/**
	 * Set the value related to the column: ratings
	 * @param ratings the ratings value
	 */
	public void setRatings (java.util.Set<com.ictti.omas.business.entity.Rating> ratings) {
		this.ratings = ratings;
	}

	public void addToratings (com.ictti.omas.business.entity.Rating rating) {
		if (null == getRatings()) setRatings(new java.util.TreeSet<com.ictti.omas.business.entity.Rating>());
		getRatings().add(rating);
	}



	/**
	 * Return the value associated with the column: schedules
	 */
	public java.util.Set<com.ictti.omas.business.entity.Schedule> getSchedules () {
		return schedules;
	}

	/**
	 * Set the value related to the column: schedules
	 * @param schedules the schedules value
	 */
	public void setSchedules (java.util.Set<com.ictti.omas.business.entity.Schedule> schedules) {
		this.schedules = schedules;
	}

	public void addToschedules (com.ictti.omas.business.entity.Schedule schedule) {
		if (null == getSchedules()) setSchedules(new java.util.TreeSet<com.ictti.omas.business.entity.Schedule>());
		getSchedules().add(schedule);
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.ictti.omas.business.entity.Doctor)) return false;
		else {
			com.ictti.omas.business.entity.Doctor doctor = (com.ictti.omas.business.entity.Doctor) obj;
			if (null == this.getId() || null == doctor.getId()) return false;
			else return (this.getId().equals(doctor.getId()));
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
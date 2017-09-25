package com.ictti.omas.business.entity.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the patient table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="patient"
 */

public abstract class BasePatient  implements Serializable {

	public static String REF = "Patient";
	public static String PROP_PDOB = "pdob";
	public static String PROP_PGENDER = "pgender";
	public static String PROP_PPWD = "ppwd";
	public static String PROP_PADDRESS = "paddress";
	public static String PROP_PREGDATE = "pregdate";
	public static String PROP_PSTATUS = "pstatus";
	public static String PROP_ID = "id";
	public static String PROP_PNAME = "pname";
	public static String PROP_PEMAIL = "pemail";
	public static String PROP_PPHNO = "pphno";
	public static String PROP_PBLOOD = "pblood";


	// constructors
	public BasePatient () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BasePatient (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BasePatient (
		java.lang.Integer id,
		java.lang.String pname,
		java.lang.String ppwd,
		java.lang.String pgender,
		java.util.Date pregdate,
		java.lang.Integer pstatus) {

		this.setId(id);
		this.setPname(pname);
		this.setPpwd(ppwd);
		this.setPgender(pgender);
		this.setPregdate(pregdate);
		this.setPstatus(pstatus);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.lang.String paddress;
	private java.lang.String pblood;
	private java.util.Date pdob;
	private java.lang.String pemail;
	private java.lang.String pgender;
	private java.lang.String pname;
	private java.lang.String pphno;
	private java.lang.String ppwd;
	private java.util.Date pregdate;
	private java.lang.Integer pstatus;

	// collections
	private java.util.Set<com.ictti.omas.business.entity.Appointment> appointments;
	private java.util.Set<com.ictti.omas.business.entity.Rating> ratings;



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
	 * Return the value associated with the column: paddress
	 */
	public java.lang.String getPaddress () {
		return paddress;
	}

	/**
	 * Set the value related to the column: paddress
	 * @param paddress the paddress value
	 */
	public void setPaddress (java.lang.String paddress) {
		this.paddress = paddress;
	}



	/**
	 * Return the value associated with the column: pblood
	 */
	public java.lang.String getPblood () {
		return pblood;
	}

	/**
	 * Set the value related to the column: pblood
	 * @param pblood the pblood value
	 */
	public void setPblood (java.lang.String pblood) {
		this.pblood = pblood;
	}



	/**
	 * Return the value associated with the column: pdob
	 */
	public java.util.Date getPdob () {
		return pdob;
	}

	/**
	 * Set the value related to the column: pdob
	 * @param pdob the pdob value
	 */
	public void setPdob (java.util.Date pdob) {
		this.pdob = pdob;
	}



	/**
	 * Return the value associated with the column: pemail
	 */
	public java.lang.String getPemail () {
		return pemail;
	}

	/**
	 * Set the value related to the column: pemail
	 * @param pemail the pemail value
	 */
	public void setPemail (java.lang.String pemail) {
		this.pemail = pemail;
	}



	/**
	 * Return the value associated with the column: pgender
	 */
	public java.lang.String getPgender () {
		return pgender;
	}

	/**
	 * Set the value related to the column: pgender
	 * @param pgender the pgender value
	 */
	public void setPgender (java.lang.String pgender) {
		this.pgender = pgender;
	}



	/**
	 * Return the value associated with the column: pname
	 */
	public java.lang.String getPname () {
		return pname;
	}

	/**
	 * Set the value related to the column: pname
	 * @param pname the pname value
	 */
	public void setPname (java.lang.String pname) {
		this.pname = pname;
	}



	/**
	 * Return the value associated with the column: pphno
	 */
	public java.lang.String getPphno () {
		return pphno;
	}

	/**
	 * Set the value related to the column: pphno
	 * @param pphno the pphno value
	 */
	public void setPphno (java.lang.String pphno) {
		this.pphno = pphno;
	}



	/**
	 * Return the value associated with the column: ppwd
	 */
	public java.lang.String getPpwd () {
		return ppwd;
	}

	/**
	 * Set the value related to the column: ppwd
	 * @param ppwd the ppwd value
	 */
	public void setPpwd (java.lang.String ppwd) {
		this.ppwd = ppwd;
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
	 * Return the value associated with the column: pstatus
	 */
	public java.lang.Integer getPstatus () {
		return pstatus;
	}

	/**
	 * Set the value related to the column: pstatus
	 * @param pstatus the pstatus value
	 */
	public void setPstatus (java.lang.Integer pstatus) {
		this.pstatus = pstatus;
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




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.ictti.omas.business.entity.Patient)) return false;
		else {
			com.ictti.omas.business.entity.Patient patient = (com.ictti.omas.business.entity.Patient) obj;
			if (null == this.getId() || null == patient.getId()) return false;
			else return (this.getId().equals(patient.getId()));
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
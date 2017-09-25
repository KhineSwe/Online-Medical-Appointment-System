package com.ictti.omas.business.entity.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the specialize table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="specialize"
 */

public abstract class BaseSpecialize  implements Serializable {

	public static String REF = "Specialize";
	public static String PROP_SPECIALIZETYPE = "specializetype";
	public static String PROP_ID = "id";


	// constructors
	public BaseSpecialize () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseSpecialize (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseSpecialize (
		java.lang.Integer id,
		java.lang.String specializetype) {

		this.setId(id);
		this.setSpecializetype(specializetype);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.lang.String specializetype;

	// collections
	private java.util.Set<com.ictti.omas.business.entity.Doctor> doctors;
	private java.util.Set<com.ictti.omas.business.entity.HosSpec> hosSpecs;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="identity"
     *  column="spid"
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
	 * Return the value associated with the column: specializetype
	 */
	public java.lang.String getSpecializetype () {
		return specializetype;
	}

	/**
	 * Set the value related to the column: specializetype
	 * @param specializetype the specializetype value
	 */
	public void setSpecializetype (java.lang.String specializetype) {
		this.specializetype = specializetype;
	}



	/**
	 * Return the value associated with the column: doctors
	 */
	public java.util.Set<com.ictti.omas.business.entity.Doctor> getDoctors () {
		return doctors;
	}

	/**
	 * Set the value related to the column: doctors
	 * @param doctors the doctors value
	 */
	public void setDoctors (java.util.Set<com.ictti.omas.business.entity.Doctor> doctors) {
		this.doctors = doctors;
	}

	public void addTodoctors (com.ictti.omas.business.entity.Doctor doctor) {
		if (null == getDoctors()) setDoctors(new java.util.TreeSet<com.ictti.omas.business.entity.Doctor>());
		getDoctors().add(doctor);
	}



	/**
	 * Return the value associated with the column: hosSpecs
	 */
	public java.util.Set<com.ictti.omas.business.entity.HosSpec> getHosSpecs () {
		return hosSpecs;
	}

	/**
	 * Set the value related to the column: hosSpecs
	 * @param hosSpecs the hosSpecs value
	 */
	public void setHosSpecs (java.util.Set<com.ictti.omas.business.entity.HosSpec> hosSpecs) {
		this.hosSpecs = hosSpecs;
	}

	public void addTohosSpecs (com.ictti.omas.business.entity.HosSpec hosSpec) {
		if (null == getHosSpecs()) setHosSpecs(new java.util.TreeSet<com.ictti.omas.business.entity.HosSpec>());
		getHosSpecs().add(hosSpec);
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.ictti.omas.business.entity.Specialize)) return false;
		else {
			com.ictti.omas.business.entity.Specialize specialize = (com.ictti.omas.business.entity.Specialize) obj;
			if (null == this.getId() || null == specialize.getId()) return false;
			else return (this.getId().equals(specialize.getId()));
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
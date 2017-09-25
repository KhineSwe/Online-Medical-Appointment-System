package com.ictti.omas.business.entity.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the hos_spec table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="hos_spec"
 */

public abstract class BaseHosSpec  implements Serializable {

	public static String REF = "HosSpec";
	public static String PROP_SPID = "spid";
	public static String PROP_SPECIALIZETYPE = "specializetype";
	public static String PROP_ID = "id";
	public static String PROP_HOSID = "hosid";


	// constructors
	public BaseHosSpec () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseHosSpec (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseHosSpec (
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

	// many to one
	private com.ictti.omas.business.entity.Hospital hosid;
	private com.ictti.omas.business.entity.Specialize spid;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="identity"
     *  column="hsid"
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




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.ictti.omas.business.entity.HosSpec)) return false;
		else {
			com.ictti.omas.business.entity.HosSpec hosSpec = (com.ictti.omas.business.entity.HosSpec) obj;
			if (null == this.getId() || null == hosSpec.getId()) return false;
			else return (this.getId().equals(hosSpec.getId()));
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
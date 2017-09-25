package com.ictti.omas.business.entity.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the rating table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="rating"
 */

public abstract class BaseRating  implements Serializable {

	public static String REF = "Rating";
	public static String PROP_DESCRIPTION = "description";
	public static String PROP_DID = "did";
	public static String PROP_ID = "id";
	public static String PROP_RATE_VALUE = "rateValue";
	public static String PROP_PID = "pid";


	// constructors
	public BaseRating () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseRating (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseRating (
		java.lang.Integer id,
		java.lang.Integer rateValue) {

		this.setId(id);
		this.setRateValue(rateValue);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.lang.Integer rateValue;
	private java.lang.String description;

	// many to one
	private com.ictti.omas.business.entity.Doctor did;
	private com.ictti.omas.business.entity.Patient pid;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="identity"
     *  column="rateid"
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
	 * Return the value associated with the column: rate_value
	 */
	public java.lang.Integer getRateValue () {
		return rateValue;
	}

	/**
	 * Set the value related to the column: rate_value
	 * @param rateValue the rate_value value
	 */
	public void setRateValue (java.lang.Integer rateValue) {
		this.rateValue = rateValue;
	}



	/**
	 * Return the value associated with the column: description
	 */
	public java.lang.String getDescription () {
		return description;
	}

	/**
	 * Set the value related to the column: description
	 * @param description the description value
	 */
	public void setDescription (java.lang.String description) {
		this.description = description;
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




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.ictti.omas.business.entity.Rating)) return false;
		else {
			com.ictti.omas.business.entity.Rating rating = (com.ictti.omas.business.entity.Rating) obj;
			if (null == this.getId() || null == rating.getId()) return false;
			else return (this.getId().equals(rating.getId()));
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
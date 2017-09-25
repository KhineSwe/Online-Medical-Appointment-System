package com.ictti.omas.business.entity.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the admin table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="admin"
 */

public abstract class BaseAdmin  implements Serializable {

	public static String REF = "Admin";
	public static String PROP_ADMPWD = "admpwd";
	public static String PROP_ADMNAME = "admname";
	public static String PROP_ID = "id";
	public static String PROP_ADMEMAIL = "admemail";


	// constructors
	public BaseAdmin () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseAdmin (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseAdmin (
		java.lang.Integer id,
		java.lang.String admemail) {

		this.setId(id);
		this.setAdmemail(admemail);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.lang.String admemail;
	private java.lang.String admname;
	private java.lang.String admpwd;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="identity"
     *  column="admid"
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
	 * Return the value associated with the column: admemail
	 */
	public java.lang.String getAdmemail () {
		return admemail;
	}

	/**
	 * Set the value related to the column: admemail
	 * @param admemail the admemail value
	 */
	public void setAdmemail (java.lang.String admemail) {
		this.admemail = admemail;
	}



	/**
	 * Return the value associated with the column: admname
	 */
	public java.lang.String getAdmname () {
		return admname;
	}

	/**
	 * Set the value related to the column: admname
	 * @param admname the admname value
	 */
	public void setAdmname (java.lang.String admname) {
		this.admname = admname;
	}



	/**
	 * Return the value associated with the column: admpwd
	 */
	public java.lang.String getAdmpwd () {
		return admpwd;
	}

	/**
	 * Set the value related to the column: admpwd
	 * @param admpwd the admpwd value
	 */
	public void setAdmpwd (java.lang.String admpwd) {
		this.admpwd = admpwd;
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.ictti.omas.business.entity.Admin)) return false;
		else {
			com.ictti.omas.business.entity.Admin admin = (com.ictti.omas.business.entity.Admin) obj;
			if (null == this.getId() || null == admin.getId()) return false;
			else return (this.getId().equals(admin.getId()));
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
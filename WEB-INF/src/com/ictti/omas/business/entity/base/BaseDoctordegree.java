package com.ictti.omas.business.entity.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the doctordegree table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="doctordegree"
 */

public abstract class BaseDoctordegree  implements Serializable {

	public static String REF = "Doctordegree";
	public static String PROP_DID = "did";
	public static String PROP_CERTIFICATEIMG = "certificateimg";
	public static String PROP_ID = "id";
	public static String PROP_DEGREENAME = "degreename";


	// constructors
	public BaseDoctordegree () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseDoctordegree (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseDoctordegree (
		java.lang.Integer id,
		com.ictti.omas.business.entity.Doctor did) {

		this.setId(id);
		this.setDid(did);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.lang.String degreename;
	private java.sql.Blob certificateimg;

	// many to one
	private com.ictti.omas.business.entity.Doctor did;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="identity"
     *  column="degreeid"
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
	 * Return the value associated with the column: degreename
	 */
	public java.lang.String getDegreename () {
		return degreename;
	}

	/**
	 * Set the value related to the column: degreename
	 * @param degreename the degreename value
	 */
	public void setDegreename (java.lang.String degreename) {
		this.degreename = degreename;
	}



	/**
	 * Return the value associated with the column: certificateimg
	 */
	public java.sql.Blob getCertificateimg () {
		return certificateimg;
	}

	/**
	 * Set the value related to the column: certificateimg
	 * @param certificateimg the certificateimg value
	 */
	public void setCertificateimg (java.sql.Blob certificateimg) {
		this.certificateimg = certificateimg;
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




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.ictti.omas.business.entity.Doctordegree)) return false;
		else {
			com.ictti.omas.business.entity.Doctordegree doctordegree = (com.ictti.omas.business.entity.Doctordegree) obj;
			if (null == this.getId() || null == doctordegree.getId()) return false;
			else return (this.getId().equals(doctordegree.getId()));
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
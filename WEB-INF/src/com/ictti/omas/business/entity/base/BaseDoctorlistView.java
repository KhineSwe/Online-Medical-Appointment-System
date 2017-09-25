package com.ictti.omas.business.entity.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the doctorlist_view table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="doctorlist_view"
 */

public abstract class BaseDoctorlistView  implements Serializable {

	public static String REF = "DoctorlistView";
	public static String PROP_DADDRESS = "daddress";
	public static String PROP_SPECIALIZETYPE = "specializetype";
	public static String PROP_DGENDER = "dgender";
	public static String PROP_HOSNAME = "hosname";
	public static String PROP_DPWD = "dpwd";
	public static String PROP_DREGDATE = "dregdate";
	public static String PROP_ID = "id";
	public static String PROP_DNAME = "dname";
	public static String PROP_DEMAIL = "demail";
	public static String PROP_DSTATUS = "dstatus";
	public static String PROP_DPHNO = "dphno";


	// constructors
	public BaseDoctorlistView () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseDoctorlistView (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseDoctorlistView (
		java.lang.Integer id,
		java.lang.String dname,
		java.util.Date dregdate,
		java.lang.String demail,
		java.lang.String dpwd,
		java.lang.String dgender,
		java.lang.Integer dstatus,
		java.lang.String specializetype,
		java.lang.String hosname) {

		this.setId(id);
		this.setDname(dname);
		this.setDregdate(dregdate);
		this.setDemail(demail);
		this.setDpwd(dpwd);
		this.setDgender(dgender);
		this.setDstatus(dstatus);
		this.setSpecializetype(specializetype);
		this.setHosname(hosname);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.lang.String dname;
	private java.util.Date dregdate;
	private java.lang.String demail;
	private java.lang.String dpwd;
	private java.lang.String daddress;
	private java.lang.String dphno;
	private java.lang.String dgender;
	private java.lang.Integer dstatus;
	private java.lang.String specializetype;
	private java.lang.String hosname;



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
	 * Return the value associated with the column: hosname
	 */
	public java.lang.String getHosname () {
		return hosname;
	}

	/**
	 * Set the value related to the column: hosname
	 * @param hosname the hosname value
	 */
	public void setHosname (java.lang.String hosname) {
		this.hosname = hosname;
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.ictti.omas.business.entity.DoctorlistView)) return false;
		else {
			com.ictti.omas.business.entity.DoctorlistView doctorlistView = (com.ictti.omas.business.entity.DoctorlistView) obj;
			if (null == this.getId() || null == doctorlistView.getId()) return false;
			else return (this.getId().equals(doctorlistView.getId()));
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
package com.ictti.omas.business.entity.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the treatmentlist_view table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="treatmentlist_view"
 */

public abstract class BaseTreatmentlistView  implements Serializable {

	public static String REF = "TreatmentlistView";
	public static String PROP_DISEASE = "disease";
	public static String PROP_DNOTE = "dnote";
	public static String PROP_TREATMENTDT = "treatmentdt";
	public static String PROP_SPECIALIZETYPE = "specializetype";
	public static String PROP_HOSNAME = "hosname";
	public static String PROP_ID = "id";
	public static String PROP_DNAME = "dname";
	public static String PROP_PNAME = "pname";
	public static String PROP_PEMAIL = "pemail";
	public static String PROP_TREATMENT = "treatment";


	// constructors
	public BaseTreatmentlistView () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseTreatmentlistView (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.lang.String treatment;
	private java.util.Date treatmentdt;
	private java.lang.String disease;
	private java.lang.String dnote;
	private java.lang.String pname;
	private java.lang.String hosname;
	private java.lang.String dname;
	private java.lang.String pemail;
	private java.lang.String specializetype;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="identity"
     *  column="treatmentid"
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
	 * Return the value associated with the column: treatment
	 */
	public java.lang.String getTreatment () {
		return treatment;
	}

	/**
	 * Set the value related to the column: treatment
	 * @param treatment the treatment value
	 */
	public void setTreatment (java.lang.String treatment) {
		this.treatment = treatment;
	}



	/**
	 * Return the value associated with the column: treatmentdt
	 */
	public java.util.Date getTreatmentdt () {
		return treatmentdt;
	}

	/**
	 * Set the value related to the column: treatmentdt
	 * @param treatmentdt the treatmentdt value
	 */
	public void setTreatmentdt (java.util.Date treatmentdt) {
		this.treatmentdt = treatmentdt;
	}



	/**
	 * Return the value associated with the column: disease
	 */
	public java.lang.String getDisease () {
		return disease;
	}

	/**
	 * Set the value related to the column: disease
	 * @param disease the disease value
	 */
	public void setDisease (java.lang.String disease) {
		this.disease = disease;
	}



	/**
	 * Return the value associated with the column: dnote
	 */
	public java.lang.String getDnote () {
		return dnote;
	}

	/**
	 * Set the value related to the column: dnote
	 * @param dnote the dnote value
	 */
	public void setDnote (java.lang.String dnote) {
		this.dnote = dnote;
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




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.ictti.omas.business.entity.TreatmentlistView)) return false;
		else {
			com.ictti.omas.business.entity.TreatmentlistView treatmentlistView = (com.ictti.omas.business.entity.TreatmentlistView) obj;
			if (null == this.getId() || null == treatmentlistView.getId()) return false;
			else return (this.getId().equals(treatmentlistView.getId()));
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
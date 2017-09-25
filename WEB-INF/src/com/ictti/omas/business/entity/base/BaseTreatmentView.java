package com.ictti.omas.business.entity.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the treatment_view table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="treatment_view"
 */

public abstract class BaseTreatmentView  implements Serializable {

	public static String REF = "TreatmentView";
	public static String PROP_SCHSTARTTIME = "schstarttime";
	public static String PROP_DISEASE = "disease";
	public static String PROP_DNOTE = "dnote";
	public static String PROP_HOSNAME = "hosname";
	public static String PROP_DEMAIL = "demail";
	public static String PROP_TREATMENT = "treatment";
	public static String PROP_PBLOOD = "pblood";
	public static String PROP_SCHDATE = "schdate";
	public static String PROP_SCHFINISHTIME = "schfinishtime";
	public static String PROP_STATUS = "status";
	public static String PROP_PGENDER = "pgender";
	public static String PROP_TREATMENTDT = "treatmentdt";
	public static String PROP_ID = "id";
	public static String PROP_DNAME = "dname";
	public static String PROP_PNAME = "pname";
	public static String PROP_APPOINTMENTDT = "appointmentdt";


	// constructors
	public BaseTreatmentView () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseTreatmentView (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseTreatmentView (
		java.lang.Integer id,
		java.lang.String treatment,
		java.lang.String disease,
		java.util.Date treatmentdt,
		java.lang.String pname,
		java.lang.String pblood,
		java.util.Date appointmentdt,
		java.lang.String hosname,
		java.util.Date schdate,
		java.lang.String dname,
		java.lang.String demail) {

		this.setId(id);
		this.setTreatment(treatment);
		this.setDisease(disease);
		this.setTreatmentdt(treatmentdt);
		this.setPname(pname);
		this.setPblood(pblood);
		this.setAppointmentdt(appointmentdt);
		this.setHosname(hosname);
		this.setSchdate(schdate);
		this.setDname(dname);
		this.setDemail(demail);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.lang.String treatment;
	private java.lang.String disease;
	private java.util.Date treatmentdt;
	private java.lang.String dnote;
	private java.lang.String pname;
	private java.lang.String pgender;
	private java.lang.String pblood;
	private java.util.Date appointmentdt;
	private java.lang.Integer status;
	private java.lang.String hosname;
	private java.util.Date schdate;
	private java.lang.Integer schstarttime;
	private java.lang.Integer schfinishtime;
	private java.lang.String dname;
	private java.lang.String demail;



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
	 * Return the value associated with the column: appointmentdt
	 */
	public java.util.Date getAppointmentdt () {
		return appointmentdt;
	}

	/**
	 * Set the value related to the column: appointmentdt
	 * @param appointmentdt the appointmentdt value
	 */
	public void setAppointmentdt (java.util.Date appointmentdt) {
		this.appointmentdt = appointmentdt;
	}



	/**
	 * Return the value associated with the column: status
	 */
	public java.lang.Integer getStatus () {
		return status;
	}

	/**
	 * Set the value related to the column: status
	 * @param status the status value
	 */
	public void setStatus (java.lang.Integer status) {
		this.status = status;
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




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.ictti.omas.business.entity.TreatmentView)) return false;
		else {
			com.ictti.omas.business.entity.TreatmentView treatmentView = (com.ictti.omas.business.entity.TreatmentView) obj;
			if (null == this.getId() || null == treatmentView.getId()) return false;
			else return (this.getId().equals(treatmentView.getId()));
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
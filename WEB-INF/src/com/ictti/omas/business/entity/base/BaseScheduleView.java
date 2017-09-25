package com.ictti.omas.business.entity.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the schedule_view table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="schedule_view"
 */

public abstract class BaseScheduleView  implements Serializable {

	public static String REF = "ScheduleView";
	public static String PROP_SCHFINISHTIME = "schfinishtime";
	public static String PROP_SCHSTARTTIME = "schstarttime";
	public static String PROP_SPECIALIZETYPE = "specializetype";
	public static String PROP_HOSNAME = "hosname";
	public static String PROP_ID = "id";
	public static String PROP_DNAME = "dname";
	public static String PROP_SCHDATE = "schdate";


	// constructors
	public BaseScheduleView () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseScheduleView (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseScheduleView (
		java.lang.Integer id,
		java.util.Date schdate,
		java.lang.Integer schstarttime,
		java.lang.Integer schfinishtime,
		java.lang.String specializetype,
		java.lang.String hosname,
		java.lang.String dname) {

		this.setId(id);
		this.setSchdate(schdate);
		this.setSchstarttime(schstarttime);
		this.setSchfinishtime(schfinishtime);
		this.setSpecializetype(specializetype);
		this.setHosname(hosname);
		this.setDname(dname);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.util.Date schdate;
	private java.lang.Integer schstarttime;
	private java.lang.Integer schfinishtime;
	private java.lang.String specializetype;
	private java.lang.String hosname;
	private java.lang.String dname;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="identity"
     *  column="schid"
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




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.ictti.omas.business.entity.ScheduleView)) return false;
		else {
			com.ictti.omas.business.entity.ScheduleView scheduleView = (com.ictti.omas.business.entity.ScheduleView) obj;
			if (null == this.getId() || null == scheduleView.getId()) return false;
			else return (this.getId().equals(scheduleView.getId()));
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
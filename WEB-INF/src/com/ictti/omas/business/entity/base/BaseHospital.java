package com.ictti.omas.business.entity.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the hospital table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="hospital"
 */

public abstract class BaseHospital  implements Serializable {

	public static String REF = "Hospital";
	public static String PROP_HOSADDRESS = "hosaddress";
	public static String PROP_HOSNAME = "hosname";
	public static String PROP_ID = "id";
	public static String PROP_HOSCODE = "hoscode";


	// constructors
	public BaseHospital () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseHospital (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseHospital (
		java.lang.Integer id,
		java.lang.String hosname,
		java.lang.String hosaddress) {

		this.setId(id);
		this.setHosname(hosname);
		this.setHosaddress(hosaddress);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.lang.String hosaddress;
	private java.lang.String hoscode;
	private java.lang.String hosname;

	// collections
	private java.util.Set<com.ictti.omas.business.entity.HosSpec> hosSpecs;
	private java.util.Set<com.ictti.omas.business.entity.Schedule> schedules;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="identity"
     *  column="hosid"
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
	 * Return the value associated with the column: hosaddress
	 */
	public java.lang.String getHosaddress () {
		return hosaddress;
	}

	/**
	 * Set the value related to the column: hosaddress
	 * @param hosaddress the hosaddress value
	 */
	public void setHosaddress (java.lang.String hosaddress) {
		this.hosaddress = hosaddress;
	}



	/**
	 * Return the value associated with the column: hoscode
	 */
	public java.lang.String getHoscode () {
		return hoscode;
	}

	/**
	 * Set the value related to the column: hoscode
	 * @param hoscode the hoscode value
	 */
	public void setHoscode (java.lang.String hoscode) {
		this.hoscode = hoscode;
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



	/**
	 * Return the value associated with the column: schedules
	 */
	public java.util.Set<com.ictti.omas.business.entity.Schedule> getSchedules () {
		return schedules;
	}

	/**
	 * Set the value related to the column: schedules
	 * @param schedules the schedules value
	 */
	public void setSchedules (java.util.Set<com.ictti.omas.business.entity.Schedule> schedules) {
		this.schedules = schedules;
	}

	public void addToschedules (com.ictti.omas.business.entity.Schedule schedule) {
		if (null == getSchedules()) setSchedules(new java.util.TreeSet<com.ictti.omas.business.entity.Schedule>());
		getSchedules().add(schedule);
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.ictti.omas.business.entity.Hospital)) return false;
		else {
			com.ictti.omas.business.entity.Hospital hospital = (com.ictti.omas.business.entity.Hospital) obj;
			if (null == this.getId() || null == hospital.getId()) return false;
			else return (this.getId().equals(hospital.getId()));
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
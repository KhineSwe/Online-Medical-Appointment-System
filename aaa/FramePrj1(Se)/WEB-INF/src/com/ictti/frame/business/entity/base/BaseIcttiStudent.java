package com.ictti.frame.business.entity.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the ictti_student table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="ictti_student"
 */

public abstract class BaseIcttiStudent  implements Serializable {

	public static String REF = "IcttiStudent";
	public static String PROP_STUDENT_LOGIN_NAME = "studentLoginName";
	public static String PROP_STUDENT_ACCOUNT_NAME = "studentAccountName";
	public static String PROP_STUDENT_PHONE = "studentPhone";
	public static String PROP_REGISTER_DATE = "registerDate";
	public static String PROP_STUDENT_EMAIL = "studentEmail";
	public static String PROP_ID = "id";
	public static String PROP_COURSE = "course";
	public static String PROP_STUDENT_NAME = "studentName";
	public static String PROP_STUDENT_PASSWORD = "studentPassword";
	public static String PROP_STUDENT_ADDRESS = "studentAddress";


	// constructors
	public BaseIcttiStudent () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseIcttiStudent (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.lang.String studentName;
	private java.lang.String studentEmail;
	private java.lang.String studentAccountName;
	private java.lang.String studentLoginName;
	private java.lang.String studentPassword;
	private java.lang.String studentPhone;
	private java.lang.String studentAddress;
	private java.util.Date registerDate;

	// many to one
	private com.ictti.frame.business.entity.IcttiCourse course;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="identity"
     *  column="student_id"
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
	 * Return the value associated with the column: student_name
	 */
	public java.lang.String getStudentName () {
		return studentName;
	}

	/**
	 * Set the value related to the column: student_name
	 * @param studentName the student_name value
	 */
	public void setStudentName (java.lang.String studentName) {
		this.studentName = studentName;
	}



	/**
	 * Return the value associated with the column: student_email
	 */
	public java.lang.String getStudentEmail () {
		return studentEmail;
	}

	/**
	 * Set the value related to the column: student_email
	 * @param studentEmail the student_email value
	 */
	public void setStudentEmail (java.lang.String studentEmail) {
		this.studentEmail = studentEmail;
	}



	/**
	 * Return the value associated with the column: student_account_name
	 */
	public java.lang.String getStudentAccountName () {
		return studentAccountName;
	}

	/**
	 * Set the value related to the column: student_account_name
	 * @param studentAccountName the student_account_name value
	 */
	public void setStudentAccountName (java.lang.String studentAccountName) {
		this.studentAccountName = studentAccountName;
	}



	/**
	 * Return the value associated with the column: student_login_name
	 */
	public java.lang.String getStudentLoginName () {
		return studentLoginName;
	}

	/**
	 * Set the value related to the column: student_login_name
	 * @param studentLoginName the student_login_name value
	 */
	public void setStudentLoginName (java.lang.String studentLoginName) {
		this.studentLoginName = studentLoginName;
	}



	/**
	 * Return the value associated with the column: student_password
	 */
	public java.lang.String getStudentPassword () {
		return studentPassword;
	}

	/**
	 * Set the value related to the column: student_password
	 * @param studentPassword the student_password value
	 */
	public void setStudentPassword (java.lang.String studentPassword) {
		this.studentPassword = studentPassword;
	}



	/**
	 * Return the value associated with the column: student_phone
	 */
	public java.lang.String getStudentPhone () {
		return studentPhone;
	}

	/**
	 * Set the value related to the column: student_phone
	 * @param studentPhone the student_phone value
	 */
	public void setStudentPhone (java.lang.String studentPhone) {
		this.studentPhone = studentPhone;
	}



	/**
	 * Return the value associated with the column: student_address
	 */
	public java.lang.String getStudentAddress () {
		return studentAddress;
	}

	/**
	 * Set the value related to the column: student_address
	 * @param studentAddress the student_address value
	 */
	public void setStudentAddress (java.lang.String studentAddress) {
		this.studentAddress = studentAddress;
	}



	/**
	 * Return the value associated with the column: register_date
	 */
	public java.util.Date getRegisterDate () {
		return registerDate;
	}

	/**
	 * Set the value related to the column: register_date
	 * @param registerDate the register_date value
	 */
	public void setRegisterDate (java.util.Date registerDate) {
		this.registerDate = registerDate;
	}



	/**
	 * Return the value associated with the column: course_id
	 */
	public com.ictti.frame.business.entity.IcttiCourse getCourse () {
		return course;
	}

	/**
	 * Set the value related to the column: course_id
	 * @param course the course_id value
	 */
	public void setCourse (com.ictti.frame.business.entity.IcttiCourse course) {
		this.course = course;
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.ictti.frame.business.entity.IcttiStudent)) return false;
		else {
			com.ictti.frame.business.entity.IcttiStudent icttiStudent = (com.ictti.frame.business.entity.IcttiStudent) obj;
			if (null == this.getId() || null == icttiStudent.getId()) return false;
			else return (this.getId().equals(icttiStudent.getId()));
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
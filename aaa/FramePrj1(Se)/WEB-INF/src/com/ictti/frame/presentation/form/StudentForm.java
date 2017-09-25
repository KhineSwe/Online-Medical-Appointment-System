package com.ictti.frame.presentation.form;

import java.util.List;

import org.apache.struts.validator.ValidatorForm;
import org.hibernate.property.Getter;
import org.hibernate.property.Setter;

import com.ictti.frame.business.entity.IcttiCourse;
import com.ictti.frame.business.entity.IcttiStudent;

public class StudentForm extends ValidatorForm {

	private String frmRegName;
	private String frmLoginName;
	private String frmPassword;
	private IcttiStudent loginStudent;
	
	private String frmRegEmail;
	private String frmRegLoginName;
	private String frmRegPassword;
	private String frmRegConfPassword;
	private String frmRegPhone;
	private String frmRegAddress;
	private String frmRegAccountName;
	private List<IcttiCourse> frmRegCourseList;
	private String frmRegCourseId;
	private String frmRegAccountNameError;
	private String frmRegDate;
	private String frmRegFormControl;
	private String frmRegCourseName;
	

	public String getFrmRegName() {
		return frmRegName;
	}

	public void setFrmRegName(String frmRegName) {
		this.frmRegName = frmRegName;
	}

	public String getFrmRegEmail() {
		return frmRegEmail;
	}

	public void setFrmRegEmail(String frmRegEmail) {
		this.frmRegEmail = frmRegEmail;
	}

	public String getFrmRegLoginName() {
		return frmRegLoginName;
	}

	public void setFrmRegLoginName(String frmRegLoginName) {
		this.frmRegLoginName = frmRegLoginName;
	}

	public String getFrmRegPassword() {
		return frmRegPassword;
	}

	public void setFrmRegPassword(String frmRegPassword) {
		this.frmRegPassword = frmRegPassword;
	}

	public String getFrmRegConfPassword() {
		return frmRegConfPassword;
	}

	public void setFrmRegConfPassword(String frmRegConfPassword) {
		this.frmRegConfPassword = frmRegConfPassword;
	}

	public String getFrmRegPhone() {
		return frmRegPhone;
	}

	public void setFrmRegPhone(String frmRegPhone) {
		this.frmRegPhone = frmRegPhone;
	}

	public String getFrmRegAddress() {
		return frmRegAddress;
	}

	public void setFrmRegAddress(String frmRegAddress) {
		this.frmRegAddress = frmRegAddress;
	}

	public String getFrmRegAccountName() {
		return frmRegAccountName;
	}

	public void setFrmRegAccountName(String frmRegAccountName) {
		this.frmRegAccountName = frmRegAccountName;
	}

	public List<IcttiCourse> getFrmRegCourseList() {
		return frmRegCourseList;
	}

	public void setFrmRegCourseList(List<IcttiCourse> frmRegCourseList) {
		this.frmRegCourseList = frmRegCourseList;
	}

	public String getFrmRegCourseId() {
		return frmRegCourseId;
	}

	public void setFrmRegCourseId(String frmRegCourseId) {
		this.frmRegCourseId = frmRegCourseId;
	}

	public String getFrmRegAccountNameError() {
		return frmRegAccountNameError;
	}

	public void setFrmRegAccountNameError(String frmRegAccountNameError) {
		this.frmRegAccountNameError = frmRegAccountNameError;
	}

	public String getFrmRegDate() {
		return frmRegDate;
	}

	public void setFrmRegDate(String frmRegDate) {
		this.frmRegDate = frmRegDate;
	}

	public String getFrmRegFormControl() {
		return frmRegFormControl;
	}

	public void setFrmRegFormControl(String frmRegFormControl) {
		this.frmRegFormControl = frmRegFormControl;
	}

	public String getFrmRegCourseName() {
		return frmRegCourseName;
	}

	public void setFrmRegCourseName(String frmRegCourseName) {
		this.frmRegCourseName = frmRegCourseName;
	}

	

	public String getFrmLoginName() {
		return frmLoginName;
	}

	public void setFrmLoginName(String frmLoginName) {
		this.frmLoginName = frmLoginName;
	}

	public String getFrmPassword() {
		return frmPassword;
	}

	public void setFrmPassword(String frmPassword) {
		this.frmPassword = frmPassword;
	}

	public IcttiStudent getLoginStudent() {
		return loginStudent;
	}

	public void setLoginStudent(IcttiStudent loginStudent) {
		this.loginStudent = loginStudent;
	}

}

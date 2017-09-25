package com.ictti.omas.presentation.form;

import java.util.List;

import org.apache.struts.action.ActionForm;
import org.apache.struts.upload.FormFile;
import org.apache.struts.validator.ValidatorForm;

import com.ictti.omas.business.entity.Doctor;
import com.ictti.omas.business.entity.Doctordegree;
import com.ictti.omas.business.entity.Hospital;
import com.ictti.omas.business.entity.Rating;
import com.ictti.omas.business.entity.Specialize;

public class DoctorForm extends ValidatorForm {

	private String frmRegName;
	private String frmRegDoctorEmailError;
	private FormFile frmUploadFile;
	private List<Specialize> frmRegSpecializeList;
	private Doctor frmDoctorID;
	private String frmDID;
	private String frmImageNameError;
	private Doctordegree frmErrorDID;
	private String frmRegmailMessage;
	
	private String flag;


	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public Doctordegree getFrmErrorDID() {
		return frmErrorDID;
	}

	public void setFrmErrorDID(Doctordegree frmErrorDID) {
		this.frmErrorDID = frmErrorDID;
	}

	public String getFrmRegmailMessage() {
		return frmRegmailMessage;
	}

	public void setFrmRegmailMessage(String frmRegmailMessage) {
		this.frmRegmailMessage = frmRegmailMessage;
	}

	public String getFrmImageNameError() {
		return frmImageNameError;
	}

	public void setFrmImageNameError(String frmImageNameError) {
		this.frmImageNameError = frmImageNameError;
	}

	public String getFrmDID() {
		return frmDID;
	}

	public void setFrmDID(String frmDID) {
		this.frmDID = frmDID;
	}

	public Doctor getFrmDoctorID() {
		return frmDoctorID;
	}

	public void setFrmDoctorID(Doctor frmDoctorID) {
		this.frmDoctorID = frmDoctorID;
	}

	private String frmRegSpecialize;

	public String getFrmRegSpecialize() {
		return frmRegSpecialize;
	}

	public void setFrmRegSpecialize(String frmRegSpecialize) {
		this.frmRegSpecialize = frmRegSpecialize;
	}

	public List<Specialize> getFrmRegSpecializeList() {
		return frmRegSpecializeList;
	}

	public void setFrmRegSpecializeList(List<Specialize> frmRegSpecializeList) {
		this.frmRegSpecializeList = frmRegSpecializeList;
	}

	public String getFrmRegSpecializeId() {
		return frmRegSpecializeId;
	}

	public void setFrmRegSpecializeId(String frmRegSpecializeId) {
		this.frmRegSpecializeId = frmRegSpecializeId;
	}

	private String frmRegSpecializeId;

	public FormFile getFrmUploadFile() {
		return frmUploadFile;
	}

	public void setFrmUploadFile(FormFile frmUploadFile) {
		this.frmUploadFile = frmUploadFile;
	}

	public String getFrmRegDoctorEmailError() {
		return frmRegDoctorEmailError;
	}

	public void setFrmRegDoctorEmailError(String frmRegDoctorEmailError) {
		this.frmRegDoctorEmailError = frmRegDoctorEmailError;
	}

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

	/*
	 * public String getFrmRegPhone() { return frmRegPhone; }
	 * 
	 * public void setFrmRegPhone(String frmRegPhone) { this.frmRegPhone =
	 * frmRegPhone; }
	 */

	public String getFrmRegAddress() {
		return frmRegAddress;
	}

	public void setFrmRegAddress(String frmRegAddress) {
		this.frmRegAddress = frmRegAddress;
	}

	public String getFrmRegGender() {
		return frmRegGender;
	}

	public void setFrmRegGender(String frmRegGender) {
		this.frmRegGender = frmRegGender;
	}

	public String getFrmRegFormControl() {
		return frmRegFormControl;
	}

	public void setFrmRegFormControl(String frmRegFormControl) {
		this.frmRegFormControl = frmRegFormControl;
	}

	public String getFrmadminRegPhone() {
		return frmadminRegPhone;
	}

	public void setFrmadminRegPhone(String frmadminRegPhone) {
		this.frmadminRegPhone = frmadminRegPhone;
	}

	private String frmRegEmail;
	private String frmRegPassword;
	private String frmRegConfPassword;
	/* private String frmRegPhone; */
	private String frmadminRegPhone;
	private String frmRegAddress;
	private String frmRegGender;
	private String frmRegFormControl;
	
	private String frmEmail;
	private String frmPassword;
	private Doctor loginDoctor;
	
	

	private String frmRegSpecializeName;
	private String frmGender;
	private String frmRegPhone;
	
	//for rating
	private String frmDname;
	
	private List<Rating> MydrateValue;

	public String getFrmEmail() {
		return frmEmail;
	}

	public void setFrmEmail(String frmEmail) {
		this.frmEmail = frmEmail;
	}

	public String getFrmPassword() {
		return frmPassword;
	}

	public void setFrmPassword(String frmPassword) {
		this.frmPassword = frmPassword;
	}

	public Doctor getLoginDoctor() {
		return loginDoctor;
	}

	public void setLoginDoctor(Doctor loginDoctor) {
		this.loginDoctor = loginDoctor;
	}

	public String getFrmRegSpecializeName() {
		return frmRegSpecializeName;
	}

	public void setFrmRegSpecializeName(String frmRegSpecializeName) {
		this.frmRegSpecializeName = frmRegSpecializeName;
	}

	public String getFrmGender() {
		return frmGender;
	}

	public void setFrmGender(String frmGender) {
		this.frmGender = frmGender;
	}

	public String getFrmRegPhone() {
		return frmRegPhone;
	}

	public void setFrmRegPhone(String frmRegPhone) {
		this.frmRegPhone = frmRegPhone;
	}

	public String getFrmDname() {
		return frmDname;
	}

	public void setFrmDname(String frmDname) {
		this.frmDname = frmDname;
	}

	public List<Rating> getMydrateValue() {
		return MydrateValue;
	}

	public void setMydrateValue(List<Rating> mydrateValue) {
		MydrateValue = mydrateValue;
	}
	
	
	

}

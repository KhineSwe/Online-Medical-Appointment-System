package com.ictti.omas.presentation.form;

import org.apache.struts.validator.ValidatorForm;

import com.ictti.omas.business.entity.Patient;

public class PatientForm extends ValidatorForm {
	private String frmEmail;
	private String frmPassword;
	public String getFrmPassword() {
		return frmPassword;
	}

	public void setFrmPassword(String frmPassword) {
		this.frmPassword = frmPassword;
	}

	private Patient loginPatient;
	
	
	
	private String frmRegName;
	public String getFrmRegName() {
		return frmRegName;
	}

	public void setFrmRegName(String frmRegName) {
		this.frmRegName = frmRegName;
	}

	public String getFrmRegAddress() {
		return frmRegAddress;
	}

	public void setFrmRegAddress(String frmRegAddress) {
		this.frmRegAddress = frmRegAddress;
	}

	public String getFrmRegPhone() {
		return frmRegPhone;
	}

	public void setFrmRegPhone(String frmRegPhone) {
		this.frmRegPhone = frmRegPhone;
	}

	public String getFrmRegEmail() {
		return frmRegEmail;
	}

	public void setFrmRegEmail(String frmRegEmail) {
		this.frmRegEmail = frmRegEmail;
	}

	public String getFrmRegGender() {
		return frmRegGender;
	}

	public void setFrmRegGender(String frmRegGender) {
		this.frmRegGender = frmRegGender;
	}

	public String getFrmRegDOB() {
		return frmRegDOB;
	}

	public void setFrmRegDOB(String frmRegDOB) {
		this.frmRegDOB = frmRegDOB;
	}

	public String getFrmRegBlood() {
		return frmRegBlood;
	}

	public void setFrmRegBlood(String frmRegBlood) {
		this.frmRegBlood = frmRegBlood;
	}

	public String getFrmRegPassword() {
		return frmRegPassword;
	}

	public void setFrmRegPassword(String frmRegPassword) {
		this.frmRegPassword = frmRegPassword;
	}

	public String getFrmRegFormControl() {
		return frmRegFormControl;
	}

	public void setFrmRegFormControl(String frmRegFormControl) {
		this.frmRegFormControl = frmRegFormControl;
	}

	private String frmRegAddress;
	private String frmRegPhone;
	private String frmRegEmail;
	private String frmRegGender;
	private String frmRegDOB;
	private String frmRegBlood;
	private String frmRegPassword;
	private String frmRegConfPassword;
	private String frmRegEmailError;
	private String frmRegmailMessage;
	
	
	// private String FrmMailName;
	
	
/*	
	public String getFrmMailName() {
		return FrmMailName;
	}

	public void setFrmMailName(String frmMailName) {
		FrmMailName = frmMailName;
	}
*/
	

	
	

	public String getFrmRegmailMessage() {
		return frmRegmailMessage;
	}

	public void setFrmRegmailMessage(String frmRegmailMessage) {
		this.frmRegmailMessage = frmRegmailMessage;
	}

	public String getFrmRegEmailError() {
		return frmRegEmailError;
	}

	public void setFrmRegEmailError(String frmRegEmailError) {
		this.frmRegEmailError = frmRegEmailError;
	}

	public String getFrmRegConfPassword() {
		return frmRegConfPassword;
	}

	public void setFrmRegConfPassword(String frmRegConfPassword) {
		this.frmRegConfPassword = frmRegConfPassword;
	}

	private String frmRegFormControl;

	

	public String getFrmEmail() {
		return frmEmail;
	}

	public void setFrmEmail(String frmEmail) {
		this.frmEmail = frmEmail;
	}

	
	public Patient getLoginPatient() {
		return loginPatient;
	}

	public void setLoginPatient(Patient loginPatient) {
		this.loginPatient = loginPatient;
	}

}

package com.ictti.frame.presentation.form;

import org.apache.struts.validator.ValidatorForm;

public class MailForm extends ValidatorForm {
	private String frmMailAdd;
	private String frmMailMessage;
	private String frmMailName;
	
		

	public String getFrmMailAdd() {
		return frmMailAdd;
	}

	public void setFrmMailAdd(String frmMailAdd) {
		this.frmMailAdd = frmMailAdd;
	}

	public String getFrmMailMessage() {
		return frmMailMessage;
	}

	public void setFrmMailMessage(String frmMailMessage) {
		this.frmMailMessage = frmMailMessage;
	}

	public String getFrmMailName() {
		return frmMailName;
	}

	public void setFrmMailName(String frmMailName) {
		this.frmMailName = frmMailName;
	}

}

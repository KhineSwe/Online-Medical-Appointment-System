package com.ictti.frame.presentation.form;

import org.apache.struts.validator.ValidatorForm;

public class ManyMailForm extends ValidatorForm {
	private String frmMailName1;
	public String getFrmMailName1() {
		return frmMailName1;
	}
	public void setFrmMailName1(String frmMailName1) {
		this.frmMailName1 = frmMailName1;
	}
	public String getFrmMailAdd1() {
		return frmMailAdd1;
	}
	public void setFrmMailAdd1(String frmMailAdd1) {
		this.frmMailAdd1 = frmMailAdd1;
	}
	public String getFrmMailName2() {
		return frmMailName2;
	}
	public void setFrmMailName2(String frmMailName2) {
		this.frmMailName2 = frmMailName2;
	}
	public String getFrmMailAdd2() {
		return frmMailAdd2;
	}
	public void setFrmMailAdd2(String frmMailAdd2) {
		this.frmMailAdd2 = frmMailAdd2;
	}
	private String frmMailAdd1;
	private String frmMailName2;
	private String frmMailAdd2;
	private String frmMailMessage;
	public String getFrmMailMessage() {
		return frmMailMessage;
	}
	public void setFrmMailMessage(String frmMailMessage) {
		this.frmMailMessage = frmMailMessage;
	}
}

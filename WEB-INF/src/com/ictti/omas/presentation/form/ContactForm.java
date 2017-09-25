package com.ictti.omas.presentation.form;

import org.apache.struts.validator.ValidatorForm;

public class ContactForm extends ValidatorForm {
	private String frmEmail;

	public String getFrmEmail() {
		return frmEmail;
	}

	public void setFrmEmail(String frmEmail) {
		this.frmEmail = frmEmail;
	}

}

package com.ictti.omas.presentation.form;

import org.apache.struts.validator.ValidatorForm;

import com.ictti.omas.business.entity.Admin;
import com.ictti.omas.business.entity.Patient;

public class AdminForm extends ValidatorForm {
	private String frmEmail;
	private String frmPassword;
	private Admin loginAdmin;
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
	public Admin getLoginAdmin() {
		return loginAdmin;
	}
	public void setLoginAdmin(Admin loginAdmin) {
		this.loginAdmin = loginAdmin;
	}
	
}

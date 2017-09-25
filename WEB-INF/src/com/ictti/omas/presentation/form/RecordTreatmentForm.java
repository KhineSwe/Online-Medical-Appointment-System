package com.ictti.omas.presentation.form;

import org.apache.struts.validator.ValidatorForm;

import com.ictti.omas.business.entity.Appointment;

public class RecordTreatmentForm extends ValidatorForm {
	
	private String frmrecordFormControl;
	private String frmDisease;
	private String frmTreatment;
	private String frmDenote;
	private String appId;
	private Appointment frmAppointment;
	

	
	
	public Appointment getFrmAppointment() {
		return frmAppointment;
	}
	public void setFrmAppointment(Appointment frmAppointment) {
		this.frmAppointment = frmAppointment;
	}
	public String getAppId() {
		return appId;
	}
	public void setAppId(String appId) {
		this.appId = appId;
	}
	public String getFrmrecordFormControl() {
		return frmrecordFormControl;
	}
	public void setFrmrecordFormControl(String frmrecordFormControl) {
		this.frmrecordFormControl = frmrecordFormControl;
	}
	public String getFrmDisease() {
		return frmDisease;
	}
	public void setFrmDisease(String frmDisease) {
		this.frmDisease = frmDisease;
	}
	public String getFrmTreatment() {
		return frmTreatment;
	}
	public void setFrmTreatment(String frmTreatment) {
		this.frmTreatment = frmTreatment;
	}
	public String getFrmDenote() {
		return frmDenote;
	}
	public void setFrmDenote(String frmDenote) {
		this.frmDenote = frmDenote;
	}


}

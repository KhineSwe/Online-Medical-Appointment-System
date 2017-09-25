package com.ictti.omas.presentation.form;

import org.apache.struts.upload.FormFile;
import org.apache.struts.validator.ValidatorForm;

import com.ictti.omas.business.entity.Hospital;

public class HospitalForm extends ValidatorForm {
	
	private String frmRegName;
	private String frmRegAddress;
	private FormFile frmUploadFile;
	private String frmRegHospitalNameError;
	private Hospital frmUpdateHospital;	
	 private String frmRegFormControl;
	
	
	public String getFrmRegFormControl() {
		return frmRegFormControl;
	}
	public void setFrmRegFormControl(String frmRegFormControl) {
		this.frmRegFormControl = frmRegFormControl;
	}
	public Hospital getFrmUpdateHospital() {
		return frmUpdateHospital;
	}
	public void setFrmUpdateHospital(Hospital frmUpdateHospital) {
		this.frmUpdateHospital = frmUpdateHospital;
	}
	public FormFile getFrmUploadFile() {
		return frmUploadFile;
	}
	public void setFrmUploadFile(FormFile frmUploadFile) {
		this.frmUploadFile = frmUploadFile;
	}
	public String getFrmRegHospitalNameError() {
		return frmRegHospitalNameError;
	}
	public void setFrmRegHospitalNameError(String frmRegHospitalNameError) {
		this.frmRegHospitalNameError = frmRegHospitalNameError;
	}
	
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

	


}





	
	
		
	




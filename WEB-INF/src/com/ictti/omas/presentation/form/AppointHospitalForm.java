package com.ictti.omas.presentation.form;

import java.util.List;

import org.apache.struts.validator.ValidatorForm;

import com.ictti.omas.business.entity.AppointView;
import com.ictti.omas.business.entity.Appointment;

public class AppointHospitalForm extends ValidatorForm {

	
	private String frmrecordFormControl;
	private String frmDisease;
	private String frmTreatment;
	private String frmDenote;
	private String appId;
	
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
	
	
	
	
	
	
	
	
	
	private String frmControl;
	private List<AppointView> frmHospitalList;
	private String frmDetailHospitalId;
	private AppointView frmHospitalListDetail;
	private List<AppointView> frmAppointList;
	private String frmDetailAppointId;
	private AppointView frmAppointmentListDetail;
	
	private Appointment frmAppointment;
	
	private List<AppointView> frmPatientByhosname;
	private String hospitalname;
	
	
	
/*	private String frmrecordFormControl;
	private String frmDisease;
	private String frmTreatment;
	private String frmDenote;
	*/
	
	
	
	

/*	private List<AppointView> frmHospitalListDetail;*/
	
	
	

	/**/

public String getHospitalname() {
		return hospitalname;
	}

	public void setHospitalname(String hospitalname) {
		this.hospitalname = hospitalname;
	}

public List<AppointView> getFrmPatientByhosname() {
		return frmPatientByhosname;
	}

	public void setFrmPatientByhosname(List<AppointView> frmPatientByhosname) {
		this.frmPatientByhosname = frmPatientByhosname;
	}

public Appointment getFrmAppointment() {
		return frmAppointment;
	}

	public void setFrmAppointment(Appointment frmAppointment) {
		this.frmAppointment = frmAppointment;
	}

	
	public AppointView getFrmAppointmentListDetail() {
		return frmAppointmentListDetail;
	}

	public void setFrmAppointmentListDetail(AppointView frmAppointmentListDetail) {
		this.frmAppointmentListDetail = frmAppointmentListDetail;
	}

	public String getFrmDetailAppointId() {
		return frmDetailAppointId;
	}

	public void setFrmDetailAppointId(String frmDetailAppointId) {
		this.frmDetailAppointId = frmDetailAppointId;
	}

	public List<AppointView> getFrmAppointList() {
		return frmAppointList;
	}

	public void setFrmAppointList(List<AppointView> frmAppointList) {
		this.frmAppointList = frmAppointList;
	}

	public List<AppointView> getFrmHospitalList() {
		return frmHospitalList;
	}

	public void setFrmHospitalList(List<AppointView> frmHospitalList) {
		this.frmHospitalList = frmHospitalList;
	}

	public AppointView getFrmHospitalListDetail() {
		return frmHospitalListDetail;
	}

	public void setFrmHospitalListDetail(AppointView frmHospitalListDetail) {
		this.frmHospitalListDetail = frmHospitalListDetail;
	}

	public String getFrmDetailHospitalId() {
		return frmDetailHospitalId;
	}

	public void setFrmDetailHospitalId(String frmDetailHospitalId) {
		this.frmDetailHospitalId = frmDetailHospitalId;
	}



	public String getFrmControl() {
		return frmControl;
	}

	public void setFrmControl(String frmControl) {
		this.frmControl = frmControl;
	}
	
	
	
	
	private int finalPage;
	// scroll function;actual page
	private int actualPage;
	// scroll function;max data to show in the list
	private int iMaxShow = 1;
	// scroll function; max data that is retrieved from the list
	private int iMaxData;
	// scroll function; next button
	private boolean nextBtn;
	// scroll function; prev button
	private boolean prevBtn;

	public boolean isNextBtn() {
		if (getActualPage() == getFinalPage()) {
			nextBtn = false;
		} else {
			nextBtn = true;
		}
		return nextBtn;
	}

	public void setNextBtn(boolean nextBtn) {
		this.nextBtn = nextBtn;
	}

	public boolean isPrevBtn() {
		if (getActualPage() == 1) {
			prevBtn = false;
		} else {
			prevBtn = true;
		}
		return prevBtn;
	}
	public void setFinalPageCalc(int iListSize){
	       finalPage=iListSize / iMaxShow;
	}
	
	public void setPrevBtn(boolean prevBtn) {
		this.prevBtn = prevBtn;
	}

	public String getBegin() {
		int iBegin = (actualPage - 1) * iMaxShow + 1;
		return Integer.valueOf(iBegin).toString();
	}

	public String getEnd() {
		int iEnd = actualPage * iMaxShow;
		if (iEnd > iMaxData) {
			iEnd = iMaxData;
		}
		return Integer.valueOf(iEnd).toString();
	}

	public int getFinalPage() {
		finalPage = (int) Math.ceil((double) iMaxData / iMaxShow);
		return finalPage;
	}

	public void setFinalPage(int finalPage) {
		this.finalPage = finalPage;
	}

	public int getActualPage() {
		return actualPage;
	}

	public void setActualPage(int actualPage) {
		this.actualPage = actualPage;
	}

	public int getIMaxShow() {
		return iMaxShow;
	}

	public void setIMaxShow(int maxShow) {
		iMaxShow = maxShow;
	}

	public int getIMaxData() {
		return iMaxData;
	}
	public void setIMaxData(int maxData) {
	       iMaxData = maxData;
	}
	//END PREVISION AND NEXT BUTTON CONTROL


	
}

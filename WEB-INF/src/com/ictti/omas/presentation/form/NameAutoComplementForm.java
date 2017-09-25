package com.ictti.omas.presentation.form;

import java.util.List;

import org.apache.struts.action.ActionForm;

import com.ictti.omas.business.entity.Patient;
import com.ictti.omas.business.entity.PatientappointmentlistView;

public class NameAutoComplementForm extends ActionForm {
	
	private Patient frmPatientDetail;
	

	public Patient getFrmPatientDetail() {
		return frmPatientDetail;
	}

	public void setFrmPatientDetail(Patient frmPatientDetail) {
		this.frmPatientDetail = frmPatientDetail;
	}

	private String frmControl;
	private String frmPatientName;
	private List<Patient> frmPatientNameList;
	private Patient frmPatientListDetail;
	private String frmDetailPatientListId;
	private String frmDetailStatusId;
	private List<PatientappointmentlistView> frmPatientAppointlist;
	private String frmStatusChangeErr;
	private List<Patient>  frmPatientList;
	private List<Patient> frmDuration;
	
	public List<Patient> getFrmDuration() {
		return frmDuration;
	}

	public void setFrmDuration(List<Patient> frmDuration) {
		this.frmDuration = frmDuration;
	}

	public List<Patient> getFrmPatientList() {
		return frmPatientList;
	}

	public void setFrmPatientList(List<Patient> frmPatientList) {
		this.frmPatientList = frmPatientList;
	}

	public String getFrmStatusChangeErr() {
		return frmStatusChangeErr;
	}

	public void setFrmStatusChangeErr(String frmStatusChangeErr) {
		this.frmStatusChangeErr = frmStatusChangeErr;
	}

	public List<PatientappointmentlistView> getFrmPatientAppointlist() {
		return frmPatientAppointlist;
	}

	public void setFrmPatientAppointlist(
			List<PatientappointmentlistView> frmPatientAppointlist) {
		this.frmPatientAppointlist = frmPatientAppointlist;
	}

	public String getFrmDetailStatusId() {
		return frmDetailStatusId;
	}

	public void setFrmDetailStatusId(String frmDetailStatusId) {
		this.frmDetailStatusId = frmDetailStatusId;
	}

	public String getFrmDetailPatientListId() {
		return frmDetailPatientListId;
	}

	public void setFrmDetailPatientListId(String frmDetailPatientListId) {
		this.frmDetailPatientListId = frmDetailPatientListId;
	}
	private String frmDetailPatientId;
	
	public String getFrmDetailPatientId() {
		return frmDetailPatientId;
	}

	public void setFrmDetailPatientId(String frmDetailPatientId) {
		this.frmDetailPatientId = frmDetailPatientId;
	}
	
	public Patient getFrmPatientListDetail() {
		return frmPatientListDetail;
	}

	public void setFrmPatientListDetail(Patient frmPatientListDetail) {
		this.frmPatientListDetail = frmPatientListDetail;
	}
	

public String getFrmPatientName() {
		return frmPatientName;
	}

	public void setFrmPatientName(String frmPatientName) {
		this.frmPatientName = frmPatientName;
	}

	public List<Patient> getFrmPatientNameList() {
		return frmPatientNameList;
	}

	public void setFrmPatientNameList(List<Patient> frmPatientNameList) {
		this.frmPatientNameList = frmPatientNameList;
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

//END 
}
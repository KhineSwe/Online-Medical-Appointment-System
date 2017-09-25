package com.ictti.omas.presentation.form;

import java.util.List;

import org.apache.struts.validator.ValidatorForm;

import com.ictti.omas.business.entity.Hospital;

public class HospitalUpdateForm extends ValidatorForm {
	private String frmHospName;
	private String frmHospAddress;
	private String frmControl;
	private String frmHosid;

	
	
	
	public String getFrmHosid() {
		return frmHosid;
	}
	public void setFrmHosid(String frmHosid) {
		this.frmHosid = frmHosid;
	}
	public String getFrmControl() {
		return frmControl;
	}
	public void setFrmControl(String frmControl) {
		this.frmControl = frmControl;
	}
	public String getFrmHospName() {
		return frmHospName;
	}
	public void setFrmHospName(String frmHospName) {
		this.frmHospName = frmHospName;
	}
	public String getFrmHospAddress() {
		return frmHospAddress;
	}
	public void setFrmHospAddress(String frmHospAddress) {
		this.frmHospAddress = frmHospAddress;
	}
	
	//Hospital Search Form ================================
	
	private List<Hospital> frmHospitalList;
	private String frmHospitalName;
	private String frmUpdateHospitalId;
	
	private Hospital hospital;
	
	
	
	

	
	
	
	public Hospital getHospital() {
		return hospital;
	}
	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}
	
	public String getFrmUpdateHospitalId() {
		return frmUpdateHospitalId;
	}
	public void setFrmUpdateHospitalId(String frmUpdateHospitalId) {
		this.frmUpdateHospitalId = frmUpdateHospitalId;
	}
	public String getFrmHospitalName() {
		return frmHospitalName;
	}
	public void setFrmHospitalName(String frmHospitalName) {
		this.frmHospitalName = frmHospitalName;
	}
	public List<Hospital> getFrmHospitalList() {
		return frmHospitalList;
	}
	public void setFrmHospitalList(List<Hospital> frmHospitalList) {
		this.frmHospitalList = frmHospitalList;
	}
	
	public String getFrmDetailHospitalId() {
		return frmDetailHospitalId;
	}
	public void setFrmDetailHospitalId(String frmDetailHospitalId) {
		this.frmDetailHospitalId = frmDetailHospitalId;
	}
	
	private Hospital frmHospitalDetail;
	public Hospital getFrmHospitalDetail() {
		return frmHospitalDetail;
	}
	public void setFrmHospitalDetail(Hospital frmHospitalDetail) {
		this.frmHospitalDetail = frmHospitalDetail;
	}
	private String frmDetailHospitalId;
	
	
	
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
}

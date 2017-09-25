package com.ictti.omas.presentation.form;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts.action.ActionForm;


import com.ictti.omas.business.entity.Hospital;

import com.ictti.omas.business.entity.TreatmentlistView;

public class HospitalAjaxSearchForm extends ActionForm {
	

	private String frmControl;
	public String getFrmControl() {
		return frmControl;
	}

	public void setFrmControl(String frmControl) {
		this.frmControl = frmControl;
	}

	public Hospital getFrmHospitalDetail() {
		return frmHospitalDetail;
	}

	public void setFrmHospitalDetail(Hospital frmHospitalDetail) {
		this.frmHospitalDetail = frmHospitalDetail;
	}

	public String getFrmDetailTreatmentId() {
		return FrmDetailTreatmentId;
	}

	public void setFrmDetailTreatmentId(String frmDetailTreatmentId) {
		FrmDetailTreatmentId = frmDetailTreatmentId;
	}

	public String getFrmHospitaltList() {
		return FrmHospitaltList;
	}

	public void setFrmHospitaltList(String frmHospitaltList) {
		FrmHospitaltList = frmHospitaltList;
	}

	public String getFrmHospitalName() {
		return frmHospitalName;
	}

	public void setFrmHospitalName(String frmHospitalName) {
		this.frmHospitalName = frmHospitalName;
	}

	public String getFrmDetailHospitalId() {
		return frmDetailHospitalId;
	}

	public void setFrmDetailHospitalId(String frmDetailHospitalId) {
		this.frmDetailHospitalId = frmDetailHospitalId;
	}

	public List<TreatmentlistView> getFrmHospitalList() {
		return frmHospitalList;
	}

	public void setFrmHospitalList(List<TreatmentlistView> frmHospitalList) {
		this.frmHospitalList = frmHospitalList;
	}

	public List<Hospital> getFrmHospitallist() {
		return frmHospitallist;
	}

	public void setFrmHospitallist(List<Hospital> frmHospitallist) {
		this.frmHospitallist = frmHospitallist;
	}

	public TreatmentlistView getFrmHospitalListDetail() {
		return frmHospitalListDetail;
	}

	public void setFrmHospitalListDetail(TreatmentlistView frmHospitalListDetail) {
		this.frmHospitalListDetail = frmHospitalListDetail;
	}

	public List<TreatmentlistView> getFrmTreatmentList() {
		return frmTreatmentList;
	}

	public void setFrmTreatmentList(List<TreatmentlistView> frmTreatmentList) {
		this.frmTreatmentList = frmTreatmentList;
	}

	public TreatmentlistView getFrmTreatmentDetail() {
		return frmTreatmentDetail;
	}

	public void setFrmTreatmentDetail(TreatmentlistView frmTreatmentDetail) {
		this.frmTreatmentDetail = frmTreatmentDetail;
	}
	private Hospital frmHospitalDetail;
	private String FrmDetailTreatmentId;
	private String FrmHospitaltList;
	private String frmHospitalName;
	private String frmDetailHospitalId;
	private List<TreatmentlistView> frmHospitalList;
	private List<Hospital> frmHospitallist;
	private TreatmentlistView frmHospitalListDetail;
	private List<TreatmentlistView> frmTreatmentList;
	private TreatmentlistView frmTreatmentDetail;
	private List<TreatmentlistView> frmTreatmentHospitalList;
	private TreatmentlistView frmTreatmentHospitalDetail;
	
	
	
	public TreatmentlistView getFrmTreatmentHospitalDetail() {
		return frmTreatmentHospitalDetail;
	}

	public void setFrmTreatmentHospitalDetail(
			TreatmentlistView frmTreatmentHospitalDetail) {
		this.frmTreatmentHospitalDetail = frmTreatmentHospitalDetail;
	}

	public List<TreatmentlistView> getFrmTreatmentHospitalList() {
		return frmTreatmentHospitalList;
	}

	public void setFrmTreatmentHospitalList(
			List<TreatmentlistView> frmTreatmentHospitalList) {
		this.frmTreatmentHospitalList = frmTreatmentHospitalList;
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

}

package com.ictti.omas.presentation.form;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts.action.ActionForm;

import com.ictti.omas.business.entity.Doctor;
import com.ictti.omas.business.entity.TreatmentlistView;

public class DoctorAjaxSearchForm extends ActionForm {

	private List<TreatmentlistView> frmTreatmentList;

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

	public List<Doctor> getFrmDoctorlist() {
		return frmDoctorlist;
	}

	public void setFrmDoctorlist(List<Doctor> frmDoctorlist) {
		this.frmDoctorlist = frmDoctorlist;
	}

	public String getFrmDetailDoctorId() {
		return frmDetailDoctorId;
	}

	public void setFrmDetailDoctorId(String frmDetailDoctorId) {
		this.frmDetailDoctorId = frmDetailDoctorId;
	}

	public List<TreatmentlistView> getFrmdoctorList() {
		return frmdoctorList;
	}

	public void setFrmdoctorList(List<TreatmentlistView> frmdoctorList) {
		this.frmdoctorList = frmdoctorList;
	}

	public String getFrmDoctorName() {
		return frmDoctorName;
	}

	public void setFrmDoctorName(String frmDoctorName) {
		this.frmDoctorName = frmDoctorName;
	}

	public String getFrmDoctorList() {
		return FrmDoctorList;
	}

	public void setFrmDoctorList(String frmDoctorList) {
		FrmDoctorList = frmDoctorList;
	}

	public TreatmentlistView getFrmDoctorListDetail() {
		return frmDoctorListDetail;
	}

	public void setFrmDoctorListDetail(TreatmentlistView frmDoctorListDetail) {
		this.frmDoctorListDetail = frmDoctorListDetail;
	}

	public String getFrmDetailTreatmentId() {
		return frmDetailTreatmentId;
	}

	public void setFrmDetailTreatmentId(String frmDetailTreatmentId) {
		this.frmDetailTreatmentId = frmDetailTreatmentId;
	}

	public Doctor getFrmDoctorDetail() {
		return frmDoctorDetail;
	}

	public void setFrmDoctorDetail(Doctor frmDoctorDetail) {
		this.frmDoctorDetail = frmDoctorDetail;
	}

	public String getFrmControl() {
		return frmControl;
	}

	public void setFrmControl(String frmControl) {
		this.frmControl = frmControl;
	}

	private TreatmentlistView frmTreatmentDetail;
	private List<Doctor> frmDoctorlist;
	private String frmDetailDoctorId;
	private List<TreatmentlistView> frmdoctorList;
	private String frmDoctorName;
	private String FrmDoctorList;
	private TreatmentlistView frmDoctorListDetail;
	private String frmDetailTreatmentId;
	private Doctor frmDoctorDetail;
	private String frmControl;
	
	private List<TreatmentlistView> frmTreatmentDoctorlList;
	public List<TreatmentlistView> getFrmTreatmentDoctorlList() {
		return frmTreatmentDoctorlList;
	}

	public void setFrmTreatmentDoctorlList(
			List<TreatmentlistView> frmTreatmentDoctorlList) {
		this.frmTreatmentDoctorlList = frmTreatmentDoctorlList;
	}

	public TreatmentlistView getFrmTreatmentDoctorDetail() {
		return frmTreatmentDoctorDetail;
	}

	public void setFrmTreatmentDoctorDetail(
			TreatmentlistView frmTreatmentDoctorDetail) {
		this.frmTreatmentDoctorDetail = frmTreatmentDoctorDetail;
	}

	private TreatmentlistView frmTreatmentDoctorDetail;

	
	

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

	public void setFinalPageCalc(int iListSize) {
		finalPage = iListSize / iMaxShow;
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

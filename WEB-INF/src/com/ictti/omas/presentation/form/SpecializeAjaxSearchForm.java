package com.ictti.omas.presentation.form;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts.action.ActionForm;
import org.apache.struts.validator.ValidatorForm;

import com.ictti.omas.business.entity.Doctor;
import com.ictti.omas.business.entity.Specialize;

import com.ictti.omas.business.entity.TreatmentlistView;

public class SpecializeAjaxSearchForm extends ActionForm {
	

	

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

	public List<Specialize> getFrmSpecializelist() {
		return frmSpecializelist;
	}

	public void setFrmSpecializelist(List<Specialize> frmSpecializelist) {
		this.frmSpecializelist = frmSpecializelist;
	}

	public String getFrmDetailSpecializeId() {
		return frmDetailSpecializeId;
	}

	public void setFrmDetailSpecializeId(String frmDetailSpecializeId) {
		this.frmDetailSpecializeId = frmDetailSpecializeId;
	}

	public List<TreatmentlistView> getFrmspecializeList() {
		return frmspecializeList;
	}

	public void setFrmspecializeList(List<TreatmentlistView> frmspecializeList) {
		this.frmspecializeList = frmspecializeList;
	}

	public String getFrmSpecialize() {
		return frmSpecialize;
	}

	public void setFrmSpecialize(String frmSpecialize) {
		this.frmSpecialize = frmSpecialize;
	}

	public String getFrmSpecializeList() {
		return FrmSpecializeList;
	}

	public void setFrmSpecializeList(String frmSpecializeList) {
		FrmSpecializeList = frmSpecializeList;
	}

	public TreatmentlistView getFrmSpecializeListDetail() {
		return frmSpecializeListDetail;
	}

	public void setFrmSpecializeListDetail(TreatmentlistView frmSpecializeListDetail) {
		this.frmSpecializeListDetail = frmSpecializeListDetail;
	}

	public String getFrmDetailTreatmentId() {
		return frmDetailTreatmentId;
	}

	public void setFrmDetailTreatmentId(String frmDetailTreatmentId) {
		this.frmDetailTreatmentId = frmDetailTreatmentId;
	}

	public Specialize getFrmSpecializeDetail() {
		return frmSpecializeDetail;
	}

	public void setFrmSpecializeDetail(Specialize frmSpecializeDetail) {
		this.frmSpecializeDetail = frmSpecializeDetail;
	}

	public String getFrmControl() {
		return frmControl;
	}

	public void setFrmControl(String frmControl) {
		this.frmControl = frmControl;
	}

	private TreatmentlistView frmTreatmentDetail;
	private List<Specialize> frmSpecializelist;
	private String frmDetailSpecializeId;
	private List<TreatmentlistView> frmspecializeList;
	private String frmSpecialize;
	private String FrmSpecializeList;
	private TreatmentlistView frmSpecializeListDetail;
	private String frmDetailTreatmentId;
	private Specialize frmSpecializeDetail;
	private String frmControl;
	
	public List<TreatmentlistView> getFrmTreatmentSpecializeList() {
		return frmTreatmentSpecializeList;
	}

	public void setFrmTreatmentSpecializeList(
			List<TreatmentlistView> frmTreatmentSpecializeList) {
		this.frmTreatmentSpecializeList = frmTreatmentSpecializeList;
	}

	public TreatmentlistView getFrmTreatmentSpecializeDetail() {
		return frmTreatmentSpecializeDetail;
	}

	public void setFrmTreatmentSpecializeDetail(
			TreatmentlistView frmTreatmentSpecializeDetail) {
		this.frmTreatmentSpecializeDetail = frmTreatmentSpecializeDetail;
	}

	private List<TreatmentlistView> frmTreatmentSpecializeList;
	private TreatmentlistView frmTreatmentSpecializeDetail;



	
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

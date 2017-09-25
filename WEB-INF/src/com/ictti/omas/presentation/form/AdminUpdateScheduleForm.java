package com.ictti.omas.presentation.form;

import java.util.List;

import org.apache.struts.validator.ValidatorForm;

import com.ictti.omas.business.entity.Doctor;
import com.ictti.omas.business.entity.HosSpec;
import com.ictti.omas.business.entity.Hospital;
import com.ictti.omas.business.entity.Schedule;
import com.ictti.omas.business.entity.ScheduleView;
import com.ictti.omas.business.entity.Specialize;

public class AdminUpdateScheduleForm extends ValidatorForm {

	private List<Schedule> frmUpdateScheduleList;
	private List<ScheduleView> frmSchViewList;
	private String frmSpecId;
	private String frmHosid;

	private Doctor frmdocname;
	private Hospital frmHosname;
	private HosSpec frmSpecname;

	private String frmUpdateScheduleId;
	private String frmFormControl;

	private ScheduleView frmAppointmentDetail;
	private String ampm;
	private String ampmfinish;

	private String frmFromTime;
	private String frmEndTime;

	private String frmRegmailMessage;

	public String getFrmRegmailMessage() {
		return frmRegmailMessage;
	}

	public void setFrmRegmailMessage(String frmRegmailMessage) {
		this.frmRegmailMessage = frmRegmailMessage;
	}

	public String getFrmFromTime() {
		return frmFromTime;
	}

	public void setFrmFromTime(String frmFromTime) {
		this.frmFromTime = frmFromTime;
	}

	public String getFrmEndTime() {
		return frmEndTime;
	}

	public void setFrmEndTime(String frmEndTime) {
		this.frmEndTime = frmEndTime;
	}

	public String getFrmHosid() {
		return frmHosid;
	}

	public void setFrmHosid(String frmHosid) {
		this.frmHosid = frmHosid;
	}

	public String getAmpm() {
		return ampm;
	}

	public void setAmpm(String ampm) {
		this.ampm = ampm;
	}

	public ScheduleView getFrmAppointmentDetail() {
		return frmAppointmentDetail;
	}

	public void setFrmAppointmentDetail(ScheduleView frmAppointmentDetail) {
		this.frmAppointmentDetail = frmAppointmentDetail;
	}

	public List<ScheduleView> getFrmSchViewList() {
		return frmSchViewList;
	}

	public void setFrmSchViewList(List<ScheduleView> frmSchViewList) {
		this.frmSchViewList = frmSchViewList;
	}

	public Hospital getFrmHosname() {
		return frmHosname;
	}

	public void setFrmHosname(Hospital frmHosname) {
		this.frmHosname = frmHosname;
	}

	public HosSpec getFrmSpecname() {
		return frmSpecname;
	}

	public void setFrmSpecname(HosSpec frmSpecname) {
		this.frmSpecname = frmSpecname;
	}

	public String getFrmSpecId() {
		return frmSpecId;
	}

	public void setFrmSpecId(String frmSpecId) {
		this.frmSpecId = frmSpecId;
	}

	public Doctor getFrmdocname() {
		return frmdocname;
	}

	public void setFrmdocname(Doctor frmdocname) {
		this.frmdocname = frmdocname;
	}

	public String getFrmFormControl() {
		return frmFormControl;
	}

	public void setFrmFormControl(String frmFormControl) {
		this.frmFormControl = frmFormControl;
	}

	public String getFrmUpdateScheduleId() {
		return frmUpdateScheduleId;
	}

	public void setFrmUpdateScheduleId(String frmUpdateScheduleId) {
		this.frmUpdateScheduleId = frmUpdateScheduleId;
	}

	public List<Schedule> getFrmUpdateScheduleList() {
		return frmUpdateScheduleList;
	}

	public void setFrmUpdateScheduleList(List<Schedule> frmUpdateScheduleList) {
		this.frmUpdateScheduleList = frmUpdateScheduleList;
	}

	public String getAmpmfinish() {
		return ampmfinish;
	}

	public void setAmpmfinish(String ampmfinish) {
		this.ampmfinish = ampmfinish;
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
	// END PREVISION AND NEXT BUTTON CONTROL

}

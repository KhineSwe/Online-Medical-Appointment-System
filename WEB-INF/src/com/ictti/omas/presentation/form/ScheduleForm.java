package com.ictti.omas.presentation.form;

import java.util.List;

import org.apache.struts.action.ActionForm;

import com.ictti.omas.business.entity.Appointment;
import com.ictti.omas.business.entity.Doctor;
import com.ictti.omas.business.entity.HosSpec;
import com.ictti.omas.business.entity.Hospital;
import com.ictti.omas.business.entity.Patient;
import com.ictti.omas.business.entity.Rating;
import com.ictti.omas.business.entity.Schedule;
import com.ictti.omas.business.entity.ScheduleView;
import com.ictti.omas.business.entity.Specialize;

public class ScheduleForm extends ActionForm {
	private List<Schedule> frmScheduleList;
	private ScheduleView frmScheduleViewList;
	private ScheduleView frmAppointmentDetail;
	private String frmRegmailMessage;
	private String frmtokenno;

	private String scheduledate;

	private Schedule frmScheduleDate;

	private String frmHospitalId;

	public String getFrmHospitalId() {
		return frmHospitalId;
	}

	public void setFrmHospitalId(String frmHospitalId) {
		this.frmHospitalId = frmHospitalId;
	}

	public Schedule getFrmScheduleDate() {
		return frmScheduleDate;
	}

	public void setFrmScheduleDate(Schedule frmScheduleDate) {
		this.frmScheduleDate = frmScheduleDate;
	}

	public String getScheduledate() {
		return scheduledate;
	}

	public void setScheduledate(String scheduledate) {
		this.scheduledate = scheduledate;
	}

	public String getFrmtokenno() {
		return frmtokenno;
	}

	public void setFrmtokenno(String frmtokenno) {
		this.frmtokenno = frmtokenno;
	}

	private String patientemail;

	public String getPatientemail() {
		return patientemail;
	}

	public void setPatientemail(String patientemail) {
		this.patientemail = patientemail;
	}

	public String getFrmRegmailMessage() {
		return frmRegmailMessage;
	}

	public void setFrmRegmailMessage(String frmRegmailMessage) {
		this.frmRegmailMessage = frmRegmailMessage;
	}

	private List<ScheduleView> frmSchViewList;

	private Patient loginPatient;

	private Hospital frmHosname;
	private HosSpec frmSpecname;
	private Doctor frmDocname;

	public Doctor getFrmDocname() {
		return frmDocname;
	}

	public void setFrmDocname(Doctor frmDocname) {
		this.frmDocname = frmDocname;
	}

	private String frmSpecId;
	private String frmAppId;
	private String frmFormControl;
	private String frmScheduleId;

	private Schedule frmScheduleMax;
	private Appointment frmAppointment;

	private String frmErrorMessage;

	private String frmDateEmptyMessage;

	public String getFrmDateEmptyMessage() {
		return frmDateEmptyMessage;
	}

	public void setFrmDateEmptyMessage(String frmDateEmptyMessage) {
		this.frmDateEmptyMessage = frmDateEmptyMessage;
	}

	private String frmMaxno;

	private String hoscode;

	private String hospitalCode;

	private String hosid;
	private Doctor docid;

	private String frmapppatientNo;
	private String frmpatientNo;

	public String getFrmpatientNo() {
		return frmpatientNo;
	}

	public void setFrmpatientNo(String frmpatientNo) {
		this.frmpatientNo = frmpatientNo;
	}

	public String getFrmapppatientNo() {
		return frmapppatientNo;
	}

	public void setFrmapppatientNo(String frmapppatientNo) {
		this.frmapppatientNo = frmapppatientNo;
	}

	public Doctor getDocid() {
		return docid;
	}

	public void setDocid(Doctor docid) {
		this.docid = docid;
	}

	public String getHosid() {
		return hosid;
	}

	public void setHosid(String hosid) {
		this.hosid = hosid;
	}

	public String getHospitalCode() {
		return hospitalCode;
	}

	public void setHospitalCode(String hospitalCode) {
		this.hospitalCode = hospitalCode;
	}

	public String getHoscode() {
		return hoscode;
	}

	public void setHoscode(String hoscode) {
		this.hoscode = hoscode;
	}

	public String getFrmMaxno() {
		return frmMaxno;
	}

	public void setFrmMaxno(String frmMaxno) {
		this.frmMaxno = frmMaxno;
	}

	public String getFrmErrorMessage() {
		return frmErrorMessage;
	}

	public void setFrmErrorMessage(String frmErrorMessage) {
		this.frmErrorMessage = frmErrorMessage;
	}

	public String getFrmAppId() {
		return frmAppId;
	}

	public Patient getLoginPatient() {
		return loginPatient;
	}

	public void setLoginPatient(Patient loginPatient) {
		this.loginPatient = loginPatient;
	}

	public void setFrmAppId(String frmAppId) {
		this.frmAppId = frmAppId;
	}

	public Appointment getFrmAppointment() {
		return frmAppointment;
	}

	public void setFrmAppointment(Appointment frmAppointment) {
		this.frmAppointment = frmAppointment;
	}

	public Schedule getFrmScheduleMax() {
		return frmScheduleMax;
	}

	public void setFrmScheduleMax(Schedule frmScheduleMax) {
		this.frmScheduleMax = frmScheduleMax;
	}

	public String getFrmScheduleId() {
		return frmScheduleId;
	}

	public void setFrmScheduleId(String frmScheduleId) {
		this.frmScheduleId = frmScheduleId;
	}

	public ScheduleView getFrmScheduleViewList() {
		return frmScheduleViewList;
	}

	public void setFrmScheduleViewList(ScheduleView frmScheduleViewList) {
		this.frmScheduleViewList = frmScheduleViewList;
	}

	public ScheduleView getFrmAppointmentDetail() {
		return frmAppointmentDetail;
	}

	public void setFrmAppointmentDetail(ScheduleView frmAppointmentDetail) {
		this.frmAppointmentDetail = frmAppointmentDetail;
	}

	public String getFrmFormControl() {
		return frmFormControl;
	}

	public void setFrmFormControl(String frmFormControl) {
		this.frmFormControl = frmFormControl;
	}

	public String getFrmSpecId() {
		return frmSpecId;
	}

	public void setFrmSpecId(String frmSpecId) {
		this.frmSpecId = frmSpecId;
	}

	public List<Schedule> getFrmScheduleList() {
		return frmScheduleList;
	}

	public void setFrmScheduleList(List<Schedule> frmScheduleList) {
		this.frmScheduleList = frmScheduleList;
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

	public void setFrmSpecname(HosSpec hosSpec) {
		this.frmSpecname = hosSpec;
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

	// for rating****************

	private String rating;
	private String description;
	private Rating frmRatingList;
	private String frmRateFormControl;
	private Appointment myappidvalue;
	private List<Appointment> myratevalue; /* for rated user */
	private Rating myratingValue;
	private List<Rating> mydrateValue;
	private String mydoctorid;
	private String mypatientid;
	private Appointment appRate;
	private String frmFlag;

	public String getFrmFlag() {
		return frmFlag;
	}

	public void setFrmFlag(String frmFlag) {
		this.frmFlag = frmFlag;
	}

	public Appointment getAppRate() {
		return appRate;
	}

	public void setAppRate(Appointment appRate) {
		this.appRate = appRate;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Rating getFrmRatingList() {
		return frmRatingList;
	}

	public void setFrmRatingList(Rating frmRatingList) {
		this.frmRatingList = frmRatingList;
	}

	public String getFrmRateFormControl() {
		return frmRateFormControl;
	}

	public void setFrmRateFormControl(String frmRateFormControl) {
		this.frmRateFormControl = frmRateFormControl;
	}

	public Appointment getMyappidvalue() {
		return myappidvalue;
	}

	public void setMyappidvalue(Appointment myappidvalue) {
		this.myappidvalue = myappidvalue;
	}

	public List<Appointment> getMyratevalue() {
		return myratevalue;
	}

	public void setMyratevalue(List<Appointment> myratevalue) {
		this.myratevalue = myratevalue;
	}

	public Rating getMyratingValue() {
		return myratingValue;
	}

	public void setMyratingValue(Rating myratingValue) {
		this.myratingValue = myratingValue;
	}

	public List<Rating> getMydrateValue() {
		return mydrateValue;
	}

	public void setMydrateValue(List<Rating> mydrateValue) {
		this.mydrateValue = mydrateValue;
	}

	public String getMydoctorid() {
		return mydoctorid;
	}

	public void setMydoctorid(String mydoctorid) {
		this.mydoctorid = mydoctorid;
	}

	public String getMypatientid() {
		return mypatientid;
	}

	public void setMypatientid(String mypatientid) {
		this.mypatientid = mypatientid;
	}

	public int getiMaxShow() {
		return iMaxShow;
	}

	public void setiMaxShow(int iMaxShow) {
		this.iMaxShow = iMaxShow;
	}

	public int getiMaxData() {
		return iMaxData;
	}

	public void setiMaxData(int iMaxData) {
		this.iMaxData = iMaxData;
	}

}

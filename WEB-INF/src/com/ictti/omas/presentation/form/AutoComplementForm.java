/*package com.ictti.omas.presentation.form;

import java.util.List;

import org.apache.struts.action.ActionForm;

import com.ictti.omas.business.entity.Hospital;
import com.ictti.omas.business.entity.Specialize;

public class AutoComplementForm extends ActionForm {
	private List<Hospital> hospitalChoice;
	private String frmHosId;
	private String frmSpecId;
	private List<Specialize> frmSpeclist;
	private String frmDoctorId;

	public String getFrmDoctorId() {
		return frmDoctorId;
	}

	public void setFrmDoctorId(String frmDoctorId) {
		this.frmDoctorId = frmDoctorId;
	}

	public List<Hospital> getHospitalChoice() {
		return hospitalChoice;
	}

	public void setHospitalChoice(List<Hospital> hospitalChoice) {
		this.hospitalChoice = hospitalChoice;
	}

	public String getFrmHosId() {
		return frmHosId;
	}

	public void setFrmHosId(String frmHosId) {
		this.frmHosId = frmHosId;
	}

	public String getFrmSpecId() {
		return frmSpecId;
	}

	public void setFrmSpecId(String frmSpecId) {
		this.frmSpecId = frmSpecId;
	}

	public List<Specialize> getFrmSpeclist() {
		return frmSpeclist;
	}

	public void setFrmSpeclist(List<Specialize> frmSpeclist) {
		this.frmSpeclist = frmSpeclist;
	}

}
 */
package com.ictti.omas.presentation.form;

import java.util.HashMap;
import java.util.List;

import org.apache.struts.action.ActionForm;
import org.apache.struts.validator.ValidatorForm;

import com.ictti.omas.business.entity.Doctor;
import com.ictti.omas.business.entity.Doctordegree;
import com.ictti.omas.business.entity.HosSpec;
import com.ictti.omas.business.entity.Hospital;
import com.ictti.omas.business.entity.Schedule;
import com.ictti.omas.business.entity.Specialize;

public class AutoComplementForm extends ValidatorForm {
	private List<Hospital> hospitalChoice;
	private String frmHosId;
	private String frmSpecId;
	private List<HosSpec> frmSpeclist;
	private List<Doctor> frmDocList;
	private List<Doctordegree> frmDegreeList;
	private Hospital frmhosname;
	private List<Hospital> hospitalChoice1;

	private String frmStartDate;
	private String[] frmDay;
	private String frmFromMonTime;
	private String frmToMonTime;
	private String frmFromTueTime;
	private String frmToTueTime;
	private String frmFromWedTime;
	private String frmToWedTime;
	private String frmFromThuTime;
	private String frmToThuTime;
	private String frmFromFriTime;
	private String frmToFriTime;
	private String frmFromSatTime;
	private String frmToSatTime;
	private String frmFromSunTime;
	private String frmToSunTime;
	private String frmmonTime;
	private String frmtueTime;
	private String frmwedTime;
	private String frmthuTime;
	private String frmfriTime;
	private String frmsatTime;
	private String frmsunTime;
	private String frmmaxpatient;
	private String frmMonAMPMTime;
	private String frmTueAMPMTime;
	private String frmWedAMPMTime;
	private String frmThuAMPMTime;
	private String frmFriAMPMTime;
	private String frmSatAMPMTime;
	private String frmSunAMPMTime;
	
	

	private Doctor frmDocname;
	private String frmDocId;
	HashMap<String, HashMap<Integer, String[]>> outermap;

	private List<Schedule> frmScheduleList;
	private String frmRegmailMessage;
	private String frmnoWeek;
	

	public String getFrmnoWeek() {
		return frmnoWeek;
	}

	public void setFrmnoWeek(String frmnoWeek) {
		this.frmnoWeek = frmnoWeek;
	}

	public List<Schedule> getFrmScheduleList() {
		return frmScheduleList;
	}

	public void setFrmScheduleList(List<Schedule> frmScheduleList) {
		this.frmScheduleList = frmScheduleList;
	}

	public String getFrmRegmailMessage() {
		return frmRegmailMessage;
	}

	public void setFrmRegmailMessage(String frmRegmailMessage) {
		this.frmRegmailMessage = frmRegmailMessage;
	}

	public HashMap<String, HashMap<Integer, String[]>> getOutermap() {
		return outermap;
	}

	public void setOutermap(HashMap<String, HashMap<Integer, String[]>> outermap) {
		this.outermap = outermap;
	}

	public Doctor getFrmDocname() {
		return frmDocname;
	}

	public void setFrmDocname(Doctor frmDocname) {
		this.frmDocname = frmDocname;
	}

	public List<Hospital> getHospitalChoice1() {
		return hospitalChoice1;
	}

	public void setHospitalChoice1(List<Hospital> hospitalChoice1) {
		this.hospitalChoice1 = hospitalChoice1;
	}

	private HosSpec frmspecname;

	public Hospital getFrmhosname() {
		return frmhosname;
	}

	public void setFrmhosname(Hospital frmhosname) {
		this.frmhosname = frmhosname;
	}

	public HosSpec getFrmspecname() {
		return frmspecname;
	}

	public void setFrmspecname(HosSpec frmspecname) {
		this.frmspecname = frmspecname;
	}

	public List<Doctordegree> getFrmDegreeList() {
		return frmDegreeList;
	}

	public void setFrmDegreeList(List<Doctordegree> frmDegreeList) {
		this.frmDegreeList = frmDegreeList;
	}

	private String hospitalCode;

	public String getHospitalCode() {
		return hospitalCode;
	}

	public void setHospitalCode(String hospitalCode) {
		this.hospitalCode = hospitalCode;
	}

	public List<Hospital> getHospitalChoice() {
		return hospitalChoice;
	}

	public void setHospitalChoice(List<Hospital> hospitalChoice) {
		this.hospitalChoice = hospitalChoice;
	}

	public String getFrmHosId() {
		return frmHosId;
	}

	public void setFrmHosId(String frmHosId) {
		this.frmHosId = frmHosId;
	}

	public String getFrmSpecId() {
		return frmSpecId;
	}

	public void setFrmSpecId(String frmSpecId) {
		this.frmSpecId = frmSpecId;
	}

	public List<HosSpec> getFrmSpeclist() {
		return frmSpeclist;
	}

	public void setFrmSpeclist(List<HosSpec> frmSpeclist) {
		this.frmSpeclist = frmSpeclist;
	}

	public List<Doctor> getFrmDocList() {
		return frmDocList;
	}

	public void setFrmDocList(List<Doctor> frmDocList) {
		this.frmDocList = frmDocList;
	}

	public String getFrmStartDate() {
		return frmStartDate;
	}

	public void setFrmStartDate(String frmStartDate) {
		this.frmStartDate = frmStartDate;
	}

	public String[] getFrmDay() {
		return frmDay;
	}

	public void setFrmDay(String[] frmDay) {
		this.frmDay = frmDay;
	}

	public String getFrmFromMonTime() {
		return frmFromMonTime;
	}

	public void setFrmFromMonTime(String frmFromMonTime) {
		this.frmFromMonTime = frmFromMonTime;
	}

	public String getFrmToMonTime() {
		return frmToMonTime;
	}

	public void setFrmToMonTime(String frmToMonTime) {
		this.frmToMonTime = frmToMonTime;
	}

	public String getFrmFromTueTime() {
		return frmFromTueTime;
	}

	public void setFrmFromTueTime(String frmFromTueTime) {
		this.frmFromTueTime = frmFromTueTime;
	}

	public String getFrmToTueTime() {
		return frmToTueTime;
	}

	public void setFrmToTueTime(String frmToTueTime) {
		this.frmToTueTime = frmToTueTime;
	}

	public String getFrmFromWedTime() {
		return frmFromWedTime;
	}

	public void setFrmFromWedTime(String frmFromWedTime) {
		this.frmFromWedTime = frmFromWedTime;
	}

	public String getFrmToWedTime() {
		return frmToWedTime;
	}

	public void setFrmToWedTime(String frmToWedTime) {
		this.frmToWedTime = frmToWedTime;
	}

	public String getFrmFromThuTime() {
		return frmFromThuTime;
	}

	public void setFrmFromThuTime(String frmFromThuTime) {
		this.frmFromThuTime = frmFromThuTime;
	}

	public String getFrmToThuTime() {
		return frmToThuTime;
	}

	public void setFrmToThuTime(String frmToThuTime) {
		this.frmToThuTime = frmToThuTime;
	}

	public String getFrmFromFriTime() {
		return frmFromFriTime;
	}

	public void setFrmFromFriTime(String frmFromFriTime) {
		this.frmFromFriTime = frmFromFriTime;
	}

	public String getFrmToFriTime() {
		return frmToFriTime;
	}

	public void setFrmToFriTime(String frmToFriTime) {
		this.frmToFriTime = frmToFriTime;
	}

	public String getFrmFromSatTime() {
		return frmFromSatTime;
	}

	public void setFrmFromSatTime(String frmFromSatTime) {
		this.frmFromSatTime = frmFromSatTime;
	}

	public String getFrmToSatTime() {
		return frmToSatTime;
	}

	public void setFrmToSatTime(String frmToSatTime) {
		this.frmToSatTime = frmToSatTime;
	}

	public String getFrmFromSunTime() {
		return frmFromSunTime;
	}

	public void setFrmFromSunTime(String frmFromSunTime) {
		this.frmFromSunTime = frmFromSunTime;
	}

	public String getFrmToSunTime() {
		return frmToSunTime;
	}

	public void setFrmToSunTime(String frmToSunTime) {
		this.frmToSunTime = frmToSunTime;
	}

	public String getFrmmonTime() {
		return frmmonTime;
	}

	public void setFrmmonTime(String frmmonTime) {
		this.frmmonTime = frmmonTime;
	}

	public String getFrmtueTime() {
		return frmtueTime;
	}

	public void setFrmtueTime(String frmtueTime) {
		this.frmtueTime = frmtueTime;
	}

	public String getFrmwedTime() {
		return frmwedTime;
	}

	public void setFrmwedTime(String frmwedTime) {
		this.frmwedTime = frmwedTime;
	}

	public String getFrmthuTime() {
		return frmthuTime;
	}

	public void setFrmthuTime(String frmthuTime) {
		this.frmthuTime = frmthuTime;
	}

	public String getFrmfriTime() {
		return frmfriTime;
	}

	public void setFrmfriTime(String frmfriTime) {
		this.frmfriTime = frmfriTime;
	}

	public String getFrmsatTime() {
		return frmsatTime;
	}

	public void setFrmsatTime(String frmsatTime) {
		this.frmsatTime = frmsatTime;
	}

	public String getFrmsunTime() {
		return frmsunTime;
	}

	public void setFrmsunTime(String frmsunTime) {
		this.frmsunTime = frmsunTime;
	}

	public AutoComplementForm() {
		frmDay = new String[0];
	}

	public String getFrmmaxpatient() {
		return frmmaxpatient;
	}

	public void setFrmmaxpatient(String frmmaxpatient) {
		this.frmmaxpatient = frmmaxpatient;
	}

	public String getFrmDocId() {
		return frmDocId;
	}

	public void setFrmDocId(String frmDocId) {
		this.frmDocId = frmDocId;
	}
	private String frmspid;

	public String getFrmspid() {
		return frmspid;
	}

	public void setFrmspid(String frmspid) {
		this.frmspid = frmspid;
	}

	public String getFrmMonAMPMTime() {
		return frmMonAMPMTime;
	}

	public void setFrmMonAMPMTime(String frmMonAMPMTime) {
		this.frmMonAMPMTime = frmMonAMPMTime;
	}

	public String getFrmTueAMPMTime() {
		return frmTueAMPMTime;
	}

	public void setFrmTueAMPMTime(String frmTueAMPMTime) {
		this.frmTueAMPMTime = frmTueAMPMTime;
	}

	public String getFrmWedAMPMTime() {
		return frmWedAMPMTime;
	}

	public void setFrmWedAMPMTime(String frmWedAMPMTime) {
		this.frmWedAMPMTime = frmWedAMPMTime;
	}

	public String getFrmThuAMPMTime() {
		return frmThuAMPMTime;
	}

	public void setFrmThuAMPMTime(String frmThuAMPMTime) {
		this.frmThuAMPMTime = frmThuAMPMTime;
	}

	public String getFrmFriAMPMTime() {
		return frmFriAMPMTime;
	}

	public void setFrmFriAMPMTime(String frmFriAMPMTime) {
		this.frmFriAMPMTime = frmFriAMPMTime;
	}

	public String getFrmSatAMPMTime() {
		return frmSatAMPMTime;
	}

	public void setFrmSatAMPMTime(String frmSatAMPMTime) {
		this.frmSatAMPMTime = frmSatAMPMTime;
	}

	public String getFrmSunAMPMTime() {
		return frmSunAMPMTime;
	}

	public void setFrmSunAMPMTime(String frmSunAMPMTime) {
		this.frmSunAMPMTime = frmSunAMPMTime;
	}
	
	
	
	

	/*
	 * public String getScheduledate() { return scheduledate; }
	 * 
	 * public void setScheduledate(String scheduledate) { this.scheduledate =
	 * scheduledate; }
	 * 
	 * public String getHosid() { return hosid; }
	 * 
	 * public void setHosid(String hosid) { this.hosid = hosid; }
	 * 
	 * public Doctor getDocid() { return docid; }
	 * 
	 * public void setDocid(Doctor docid) { this.docid = docid; }
	 */

}
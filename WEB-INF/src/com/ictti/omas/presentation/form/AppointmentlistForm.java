package com.ictti.omas.presentation.form;

import java.util.List;

import org.apache.struts.validator.ValidatorForm;






import com.ictti.omas.business.entity.Appointment;
import com.ictti.omas.business.entity.AppointmentlistView;
import com.ictti.omas.business.entity.Doctor;
import com.ictti.omas.business.entity.Hospital;
import com.ictti.omas.business.entity.Schedule;

public class AppointmentlistForm extends ValidatorForm {
	
	private String frmControl;
	
	private Hospital frmHospital;
	private Doctor frmDoctor;
	private List<AppointmentlistView> frmAppointListAll;
	private String frmschdate;
	
	private String frmHospitalName;
	private String frmDoctorName;
private List<AppointmentlistView> frmSearchAppointmentlist;
private Schedule frmHNDList;

	public Schedule getFrmHNDList() {
	return frmHNDList;
}

public void setFrmHNDList(Schedule frmHNDList) {
	this.frmHNDList = frmHNDList;
}

	public List<AppointmentlistView> getFrmSearchAppointmentlist() {
	return frmSearchAppointmentlist;
}

public void setFrmSearchAppointmentlist(
		List<AppointmentlistView> frmSearchAppointmentlist) {
	this.frmSearchAppointmentlist = frmSearchAppointmentlist;
}

	public String getFrmHospitalName() {
		return frmHospitalName;
	}

	public void setFrmHospitalName(String frmHospitalName) {
		this.frmHospitalName = frmHospitalName;
	}

	public String getFrmDoctorName() {
		return frmDoctorName;
	}

	public void setFrmDoctorName(String frmDoctorName) {
		this.frmDoctorName = frmDoctorName;
	}

	public String getFrmschdate() {
		return frmschdate;
	}

	public void setFrmschdate(String frmschdate) {
		this.frmschdate = frmschdate;
	}

	public List<AppointmentlistView> getFrmAppointListAll() {
		return frmAppointListAll;
	}

	public void setFrmAppointListAll(List<AppointmentlistView> frmAppointListAll) {
		this.frmAppointListAll = frmAppointListAll;
	}

	public Doctor getFrmDoctor() {
		return frmDoctor;
	}

	public void setFrmDoctor(Doctor frmDoctor) {
		this.frmDoctor = frmDoctor;
	}

	public Hospital getFrmHospital() {
		return frmHospital;
	}

	public void setFrmHospital(Hospital frmHospital) {
		this.frmHospital = frmHospital;
	}

	public List<AppointmentlistView> getFrmHospitalList() {
		return frmHospitalList;
	}

	public void setFrmHospitalList(List<AppointmentlistView> frmHospitalList) {
		this.frmHospitalList = frmHospitalList;
	}

	public String getFrmDetailHospitalId() {
		return frmDetailHospitalId;
	}

	public void setFrmDetailHospitalId(String frmDetailHospitalId) {
		this.frmDetailHospitalId = frmDetailHospitalId;
	}

	public AppointmentlistView getFrmHospitalListDetail() {
		return frmHospitalListDetail;
	}

	public void setFrmHospitalListDetail(AppointmentlistView frmHospitalListDetail) {
		this.frmHospitalListDetail = frmHospitalListDetail;
	}

	public List<AppointmentlistView> getFrmAppointList() {
		return frmAppointList;
	}

	public void setFrmAppointList(List<AppointmentlistView> frmAppointList) {
		this.frmAppointList = frmAppointList;
	}

	public String getFrmDetailAppointId() {
		return frmDetailAppointId;
	}

	public void setFrmDetailAppointId(String frmDetailAppointId) {
		this.frmDetailAppointId = frmDetailAppointId;
	}

	public AppointmentlistView getFrmAppointmentListDetail() {
		return frmAppointmentListDetail;
	}

	public void setFrmAppointmentListDetail(
			AppointmentlistView frmAppointmentListDetail) {
		this.frmAppointmentListDetail = frmAppointmentListDetail;
	}

	public Appointment getFrmAppointment() {
		return frmAppointment;
	}

	public void setFrmAppointment(Appointment frmAppointment) {
		this.frmAppointment = frmAppointment;
	}

	public List<AppointmentlistView> getFrmPatientByhosname() {
		return frmPatientByhosname;
	}

	public void setFrmPatientByhosname(List<AppointmentlistView> frmPatientByhosname) {
		this.frmPatientByhosname = frmPatientByhosname;
	}

	public String getHospitalname() {
		return hospitalname;
	}

	public void setHospitalname(String hospitalname) {
		this.hospitalname = hospitalname;
	}



private String frmHospitalID;
	public String getFrmHospitalID() {
	return frmHospitalID;
}

public void setFrmHospitalID(String frmHospitalID) {
	this.frmHospitalID = frmHospitalID;
}


private List<Hospital> frmHosList;
	public List<Hospital> getFrmHosList() {
	return frmHosList;
}

public void setFrmHosList(List<Hospital> frmHosList) {
	this.frmHosList = frmHosList;
}
private List<Doctor> frmDoctorList;

public List<Doctor> getFrmDoctorList() {
	return frmDoctorList;
}

public void setFrmDoctorList(List<Doctor> frmDoctorList) {
	this.frmDoctorList = frmDoctorList;
}



private String frmDoctorID;
	public String getFrmDoctorID() {
	return frmDoctorID;
}

public void setFrmDoctorID(String frmDoctorID) {
	this.frmDoctorID = frmDoctorID;
}



	private List<AppointmentlistView> frmHospitalList;
	private String frmDetailHospitalId;
	private AppointmentlistView frmHospitalListDetail;
	private List<AppointmentlistView> frmAppointList;
	private String frmDetailAppointId;
	private AppointmentlistView frmAppointmentListDetail;
	
	private Appointment frmAppointment;
	
	private List<AppointmentlistView> frmPatientByhosname;
	private String hospitalname;
	
	
	


	public String getFrmControl() {
		return frmControl;
	}

	public void setFrmControl(String frmControl) {
		this.frmControl = frmControl;
	}
	
	
	
	/*	for second*/
	private boolean next1Btn;
	// scroll function; prev button
	private boolean prev1Btn;
	
	
	public boolean isNext1Btn() {
		if (getActualPage() == getFinalPage()) {
			next1Btn = false;
		} else {
			next1Btn = true;
		}
		return next1Btn;
	}

	public void setNext1Btn(boolean next1Btn) {
		this.next1Btn = next1Btn;
	}

	public boolean isPrev1Btn() {
		if (getActualPage() == 1) {
			prev1Btn = false;
		} else {
			prev1Btn = true;
		}
		return prev1Btn;
	}
	
	
	public void setPrev1Btn(boolean prev1Btn) {
		this.prev1Btn = prev1Btn;
	}
	
	
/*	for first*/
	
	
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

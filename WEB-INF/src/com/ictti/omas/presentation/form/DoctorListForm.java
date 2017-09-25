package com.ictti.omas.presentation.form;

import java.util.List;

import org.apache.struts.action.ActionForm;

import com.ictti.omas.business.entity.Doctor;
import com.ictti.omas.business.entity.DoctorlistView;
import com.ictti.omas.business.entity.DoctorstatuslistView;

public class DoctorListForm extends ActionForm {
	
	private String frmControl;
	/*private List<Doctor>frmDoctorList;*/
	private String frmDoctorId;
	private List<DoctorlistView>frmDoctorList;
	private List<DoctorlistView> frmDoctorListByhosName;
	private String frmHospitalName;
	private List<DoctorstatuslistView>frmDoctorstatuslist;
	private String frmStatusChangeErr;
	private List<Doctor> frmdateDuration;
	
	
	
	public List<Doctor> getFrmdateDuration() {
		return frmdateDuration;
	}

	public void setFrmdateDuration(List<Doctor> frmdateDuration) {
		this.frmdateDuration = frmdateDuration;
	}

	public String getFrmStatusChangeErr() {
		return frmStatusChangeErr;
	}

	public void setFrmStatusChangeErr(String frmStatusChangeErr) {
		this.frmStatusChangeErr = frmStatusChangeErr;
	}

	public List<DoctorstatuslistView> getFrmDoctorstatuslist() {
		return frmDoctorstatuslist;
	}

	public void setFrmDoctorstatuslist(
			List<DoctorstatuslistView> frmDoctorstatuslist) {
		this.frmDoctorstatuslist = frmDoctorstatuslist;
	}

	public String getFrmHospitalName() {
		return frmHospitalName;
	}

	public void setFrmHospitalName(String frmHospitalName) {
		this.frmHospitalName = frmHospitalName;
	}

	public List<DoctorlistView> getFrmDoctorListByhosName() {
		return frmDoctorListByhosName;
	}

	public void setFrmDoctorListByhosName(
			List<DoctorlistView> frmDoctorListByhosName) {
		this.frmDoctorListByhosName = frmDoctorListByhosName;
	}

	public List<DoctorlistView> getFrmDoctorList() {
		return frmDoctorList;
	}

	public void setFrmDoctorList(List<DoctorlistView> frmDoctorList) {
		this.frmDoctorList = frmDoctorList;
	}

	public String getFrmDoctorId() {
		return frmDoctorId;
	}

	public void setFrmDoctorId(String frmDoctorId) {
		this.frmDoctorId = frmDoctorId;
	}

	/*public List<Doctor> getFrmDoctorList() {
		return frmDoctorList;
	}

	public void setFrmDoctorList(List<Doctor> frmDoctorList) {
		this.frmDoctorList = frmDoctorList;
	}*/

	public String getFrmControl() {
		return frmControl;
	}

	public void setFrmControl(String frmControl) {
		this.frmControl = frmControl;
	}
	
	

	
	
	// START PREVISION AND NEXT BUTTON CONTROL
		// scroll function;final page
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

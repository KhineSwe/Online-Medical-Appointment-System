package com.ictti.omas.presentation.form;

import java.util.List;

import org.apache.struts.validator.ValidatorForm;

import com.ictti.omas.business.entity.TreatmentView;

public class TreatmentPatientSearchForm extends ValidatorForm {
	private String frmTreatmentName;
	private List<TreatmentView> frmTreatmentPatientList;
	private TreatmentView frmPatientListDetail;
	private String frmDetailTreatmentId;
	private String frmControl;
	private String frmNoPatientError;
	
	

	public String getFrmNoPatientError() {
		return frmNoPatientError;
	}

	public void setFrmNoPatientError(String frmNoPatientError) {
		this.frmNoPatientError = frmNoPatientError;
	}

	public List<TreatmentView> getFrmTreatmentPatientList() {
		return frmTreatmentPatientList;
	}

	public void setFrmTreatmentPatientList(
			List<TreatmentView> frmTreatmentPatientList) {
		this.frmTreatmentPatientList = frmTreatmentPatientList;
	}



	

	public TreatmentView getFrmPatientListDetail() {
		return frmPatientListDetail;
	}

	public void setFrmPatientListDetail(TreatmentView frmPatientListDetail) {
		this.frmPatientListDetail = frmPatientListDetail;
	}

	public String getFrmDetailTreatmentId() {
		return frmDetailTreatmentId;
	}

	public void setFrmDetailTreatmentId(String frmDetailTreatmentId) {
		this.frmDetailTreatmentId = frmDetailTreatmentId;
	}

	public String getFrmControl() {
		return frmControl;
	}

	public void setFrmControl(String frmControl) {
		this.frmControl = frmControl;
	}

	public String getFrmTreatmentName() {
		return frmTreatmentName;
	}

	public void setFrmTreatmentName(String frmTreatmentName) {
		this.frmTreatmentName = frmTreatmentName;
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
			//END 

}

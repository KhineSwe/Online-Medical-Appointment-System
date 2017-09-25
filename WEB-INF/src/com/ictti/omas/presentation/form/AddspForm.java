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

import java.util.List;

import org.apache.struts.action.ActionForm;
import org.apache.struts.validator.ValidatorForm;

import com.ictti.omas.business.entity.Doctor;
import com.ictti.omas.business.entity.Doctordegree;
import com.ictti.omas.business.entity.HosSpec;
import com.ictti.omas.business.entity.Hospital;
import com.ictti.omas.business.entity.Specialize;

public class AddspForm extends ActionForm {
	private List<Hospital> hospitalChoice;
	private String frmHosId;
	private String frmSpectype;
	private List<Specialize> frmSpeclist;
	private List<Doctor> frmDocList;
	private List<Doctordegree> frmDegreeList;
	private Hospital frmhosname;
	private Specialize frmspecname;
	private String[] frmSpeCheckedlist;
	private String hospitalCode;
	private Specialize frmSpecialize;
	private List<HosSpec> frmSpecializeList;
	private String frmUpdateSpecialize;

	private List<Specialize> frmSpecializeUpdateList;
	private String frmUpdateSpe;
	private String frmSpError;
	
	private String frmControl;
	public String getFrmControl() {
		return frmControl;
	}

	public void setFrmControl(String frmControl) {
		this.frmControl = frmControl;
	}

	public String getFrmUpdateSpe() {
		return frmUpdateSpe;
	}

	public void setFrmUpdateSpe(String frmUpdateSpe) {
		this.frmUpdateSpe = frmUpdateSpe;
	}

	public List<Specialize> getFrmSpecializeUpdateList() {
		return frmSpecializeUpdateList;
	}

	public void setFrmSpecializeUpdateList(
			List<Specialize> frmSpecializeUpdateList) {
		this.frmSpecializeUpdateList = frmSpecializeUpdateList;
	}

	public List<HosSpec> getFrmSpecializeList() {
		return frmSpecializeList;
	}

	public void setFrmSpecializeList(List<HosSpec> frmSpecializeList) {
		this.frmSpecializeList = frmSpecializeList;
	}

	public Specialize getFrmSpecialize() {
		return frmSpecialize;
	}

	public void setFrmSpecialize(Specialize frmSpecialize) {
		this.frmSpecialize = frmSpecialize;
	}

	public String[] getFrmSpeCheckedlist() {
		return frmSpeCheckedlist;
	}

	public void setFrmSpeCheckedlist(String[] frmSpeCheckedlist) {
		this.frmSpeCheckedlist = frmSpeCheckedlist;
	}

	public String getFrmSpectype() {
		return frmSpectype;
	}

	public void setFrmSpectype(String frmSpectype) {
		this.frmSpectype = frmSpectype;
	}

	public Hospital getFrmhosname() {
		return frmhosname;
	}

	public void setFrmhosname(Hospital frmhosname) {
		this.frmhosname = frmhosname;
	}

	public Specialize getFrmspecname() {
		return frmspecname;
	}

	public void setFrmspecname(Specialize frmspecname) {
		this.frmspecname = frmspecname;
	}

	public List<Doctordegree> getFrmDegreeList() {
		return frmDegreeList;
	}

	public void setFrmDegreeList(List<Doctordegree> frmDegreeList) {
		this.frmDegreeList = frmDegreeList;
	}

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

	public List<Specialize> getFrmSpeclist() {
		return frmSpeclist;
	}

	public void setFrmSpeclist(List<Specialize> frmSpeclist) {
		this.frmSpeclist = frmSpeclist;
	}

	public List<Doctor> getFrmDocList() {
		return frmDocList;
	}

	public void setFrmDocList(List<Doctor> frmDocList) {
		this.frmDocList = frmDocList;
	}

	public String getFrmUpdateSpecialize() {
		return frmUpdateSpecialize;
	}

	public void setFrmUpdateSpecialize(String frmUpdateSpecialize) {
		this.frmUpdateSpecialize = frmUpdateSpecialize;
	}

	public String getFrmSpError() {
		return frmSpError;
	}

	public void setFrmSpError(String frmSpError) {
		this.frmSpError = frmSpError;
	}
	

}
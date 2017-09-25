package com.ictti.omas.presentation.form;

import org.apache.struts.action.ActionForm;


public class MailForm extends ActionForm {
	private String frmMailAdd;
	private String frmMailNotiMessage;
	private String frmMailName;
	private String frmMailMsg;
	
		

	public String getFrmMailMsg() {
		return frmMailMsg;
	}

	public void setFrmMailMsg(String frmMailMsg) {
		this.frmMailMsg = frmMailMsg;
	}

	public String getFrmMailAdd() {
		return frmMailAdd;
	}

	public void setFrmMailAdd(String frmMailAdd) {
		this.frmMailAdd = frmMailAdd;
	}

	

	public String getFrmMailNotiMessage() {
		return frmMailNotiMessage;
	}

	public void setFrmMailNotiMessage(String frmMailNotiMessage) {
		this.frmMailNotiMessage = frmMailNotiMessage;
	}

	public String getFrmMailName() {
		return frmMailName;
	}

	public void setFrmMailName(String frmMailName) {
		this.frmMailName = frmMailName;
	}

}

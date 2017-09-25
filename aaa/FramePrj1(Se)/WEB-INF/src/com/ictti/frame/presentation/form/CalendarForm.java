package com.ictti.frame.presentation.form;

import org.apache.struts.validator.ValidatorForm;

public class CalendarForm extends ValidatorForm {
	private String firstDate;
	public String getFirstDate() {
		return firstDate;
	}
	public void setFirstDate(String firstDate) {
		this.firstDate = firstDate;
	}
	public String getSecondDate() {
		return secondDate;
	}
	public void setSecondDate(String secondDate) {
		this.secondDate = secondDate;
	}
	private String secondDate;

}

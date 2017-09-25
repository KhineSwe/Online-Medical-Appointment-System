package com.ictti.omas.business.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.ictti.omas.business.entity.Appointment;
import com.ictti.omas.business.entity.Schedule;
import com.ictti.omas.dao.AppointmentDao;
import com.ictti.omas.dao.ScheduleDao;
import com.ictti.omas.presentation.form.ScheduleForm;

public class SearchByDateService {
	private ScheduleDao myScheduleDao;

	public ScheduleDao getMyScheduleDao() {
		return myScheduleDao;
	}

	public void setMyScheduleDao(ScheduleDao myScheduleDao) {
		this.myScheduleDao = myScheduleDao;
	}

	public void getScheduleDate(ScheduleForm myForm, int did, int hosid)
			throws ParseException {

		SimpleDateFormat myformat = new SimpleDateFormat("yyyy-MM-dd");
		Date schdate = myformat.parse(myForm.getScheduledate());

		Schedule sch = myScheduleDao.getScheduleByDate(schdate, did, hosid);
		myForm.setFrmScheduleDate(sch);

	}

}

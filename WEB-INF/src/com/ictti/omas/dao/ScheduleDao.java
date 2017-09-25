package com.ictti.omas.dao;

import java.util.Date;
import java.util.List;

import com.ictti.omas.business.entity.Patient;
import com.ictti.omas.business.entity.Schedule;

public interface ScheduleDao {

	public List<Schedule> getScheduleByDid(Integer doctorid);

	public Schedule getScheduleById(int schid);

	public Schedule getDoctorById(int schid);

	public void saveSchMaxNumber(Schedule sch);

	public void saveApppatientNo(Schedule s);

	public Schedule getScheduleByDate(Date scheduledate, int docid, int hosid);
	
	//public List<Schedule> getScheduleDuplicateDate( int docid, int hosid);
	
	public void saveAddSchedule(Schedule sch);
	
	
	
public List<Schedule> getSchedule(Integer doctorid,Integer hospitalid);
	
	public void saveUpdateSchedule(Schedule sch);
	
	
	
	
	
	public Schedule getHosptialNDoctor(int hosid, int did);

	

	public Schedule getdoctorListByschedule(String frmHosid,Integer id);
	

	
	

}

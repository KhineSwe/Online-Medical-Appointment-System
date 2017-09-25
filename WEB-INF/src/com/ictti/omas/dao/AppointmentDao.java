package com.ictti.omas.dao;

import com.ictti.omas.business.entity.Appointment;

public interface AppointmentDao {
	public Appointment getAppointmentById(int scheduleid);

	public Appointment getAppointmentByIdAndPid(int scheduleid,int pid);
	

	public void saveTokenNumber(Appointment app);
	
	public void saveToken(Appointment app);
	
//for Doctor
	
	public Appointment getAppointmentbyId(int appId);
	public void saveStatus(Appointment myAppointment);
	
//for rating

	public Appointment getAppointBypid(int pid, int did);
}

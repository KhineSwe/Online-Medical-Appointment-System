package com.ictti.omas.dao;

import java.util.Date;
import java.util.List;

import com.ictti.omas.business.entity.AppointmentlistView;
import com.ictti.omas.business.entity.Doctor;
import com.ictti.omas.business.entity.Hospital;

public interface AppointmentlistDao {
	public List<AppointmentlistView> getAppointListALL();
	
	public List<AppointmentlistView> getSearchAppointListALL(String hosname,String dname);
	
	public List<AppointmentlistView> getDetailAppointListALL(String hosname,String dname,Date schdate);
	
	

}

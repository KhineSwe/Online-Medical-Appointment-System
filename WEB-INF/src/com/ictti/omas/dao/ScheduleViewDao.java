package com.ictti.omas.dao;

import java.util.List;

import com.ictti.omas.business.entity.ScheduleView;

public interface ScheduleViewDao {

	public ScheduleView getScheduleById(int schid);

	public List<ScheduleView> getListAll();

}
